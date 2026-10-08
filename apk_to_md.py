#!/usr/bin/env python3
"""
Zamienia wyjście jadx na gotowe do wysłania pliki .md (bez żadnego AI).

  jadx -d out base.apk
  python apk_to_md.py packages     # pokaż pakiety, wybierz swój
  python apk_to_md.py build        # generuje md/ + md/INDEX.md

Każdy plik .md = paczka kodu do ~MAX_CHARS znaków, z nagłówkiem (lista plików,
powiązane klasy z tego samego pakietu) i opcjonalnym promptem. Kolejność:
manifest/zasoby -> sieć (net) -> modele (model) -> UI -> reszta.
"""
import re, sys
from collections import Counter
from pathlib import Path

# ================== KONFIGURACJA ==================
SRC_DIR = Path("out/sources")
RES_DIR = Path("out/resources")
APP_PACKAGE = ""            # np. "com/producent/aplikacja"; puste = auto (pomija biblioteki)
OUT_DIR = Path("md")
MAX_CHARS = 12000           # rozmiar jednej paczki (~4k tokenów); mniejszy = lepiej dla małych modeli
ALL_APP_FILES = False       # True = wszystkie pliki z pakietu aplikacji, nie tylko kandydaci
INCLUDE_PROMPT = True       # dołącz krótką instrukcję na górze każdego pliku
MIN_FILE_CHARS = 150        # pomiń puste/trywialne klasy (R, BuildConfig itp. i tak odpadną)

NET_KW = ("@GET", "@POST", "@PUT", "@DELETE", "@PATCH", "@Headers", "Retrofit", "OkHttp",
          "Request.Builder", "HttpURLConnection", "WebSocket", "BluetoothGatt", "Interceptor")
MODEL_KW = ("@SerializedName", "@Json", "@Entity", "@Parcelize", "JSONObject", "Parcelable",
            "data class", "@Serializable")
UI_KW = ("@Composable", "RecyclerView", "LineChart", "BarChart", "MPAndroidChart",
         "MutableLiveData", "StateFlow", "Fragment", "Activity", "ViewModel")
LIB_PREFIXES = ("androidx", "android/support", "kotlin", "kotlinx", "okhttp3", "okio",
                "retrofit2", "com/google", "com/squareup", "org/", "io/", "net/", "dagger",
                "javax", "j$", "com/bumptech", "com/github", "com/airbnb", "com/facebook",
                "com/firebase", "com/appsflyer", "com/adjust", "com/crashlytics")
SKIP_NAMES = ("R.java", "R.kt", "BuildConfig.java", "BuildConfig.kt")

PROMPT = """> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.
"""

METHOD_RE = re.compile(r"^\s{4}(public|private|protected|static|final|synchronized|fun|override|suspend)\b.*[\{=]\s*$")
IMPORT_RE = re.compile(r"^import\s+([\w.]+);?\s*$", re.M)


def is_lib(p: Path) -> bool:
    return p.relative_to(SRC_DIR).as_posix().startswith(LIB_PREFIXES)


def cmd_packages():
    c = Counter()
    for p in list(SRC_DIR.rglob("*.java")) + list(SRC_DIR.rglob("*.kt")):
        c["/".join(p.relative_to(SRC_DIR).parts[:3])] += 1
    print("Największe pakiety (wpisz swój w APP_PACKAGE):")
    for k, v in c.most_common(25):
        print(f"  {v:5d}  {k}")


def category(txt):
    if any(k in txt for k in NET_KW):
        return "net"
    if any(k in txt for k in MODEL_KW):
        return "model"
    if any(k in txt for k in UI_KW):
        return "ui"
    return "other"


def collect():
    root = SRC_DIR / APP_PACKAGE if APP_PACKAGE else SRC_DIR
    files = []
    for p in sorted(list(root.rglob("*.java")) + list(root.rglob("*.kt"))):
        if p.name in SKIP_NAMES or (not APP_PACKAGE and is_lib(p)):
            continue
        txt = p.read_text(errors="ignore")
        if len(txt) < MIN_FILE_CHARS:
            continue
        cat = category(txt)
        if cat == "other" and not ALL_APP_FILES:
            continue
        files.append((cat, p, txt))
    order = {"net": 0, "model": 1, "ui": 2, "other": 3}
    files.sort(key=lambda x: (order[x[0]], str(x[1])))
    return files


def split_code(txt):
    """Tnie duży plik po granicach metod; nagłówek (importy/pola) powtarza w każdej części."""
    if len(txt) <= MAX_CHARS:
        return [txt]
    lines = txt.splitlines()
    first = next((i for i, l in enumerate(lines) if METHOD_RE.match(l)), 0)
    head = "\n".join(lines[:first])[:2500]
    parts, cur, size = [], [], len(head)
    for l in lines[first:]:
        if size > MAX_CHARS and METHOD_RE.match(l):
            parts.append(head + "\n" + "\n".join(cur))
            cur, size = [], len(head)
        cur.append(l)
        size += len(l) + 1
    if cur:
        parts.append(head + "\n" + "\n".join(cur))
    return parts


def related(txt, names_by_pkg, self_rel):
    """Klasy z aplikacji, które ten plik importuje (podpowiedź, co dosłać modelowi)."""
    out = []
    for imp in IMPORT_RE.findall(txt):
        path = imp.replace(".", "/")
        if path in names_by_pkg and names_by_pkg[path] != self_rel:
            out.append(names_by_pkg[path])
    return sorted(set(out))[:15]


def write_md(idx, cat, items, index_rows):
    """items: [(rel_path, label, code, lang, related)]"""
    name = f"{idx:03d}_{cat}.md"
    body = [f"# Paczka {idx:03d} ({cat})\n"]
    if INCLUDE_PROMPT:
        body.append(PROMPT)
    body.append("Pliki w tej paczce: " + ", ".join(f"`{i[1]}`" for i in items) + "\n")
    for rel, label, code, lang, rel_cls in items:
        body.append(f"## {label}\n")
        if rel_cls:
            body.append("Powiązane klasy (możesz dosłać): " + ", ".join(f"`{r}`" for r in rel_cls) + "\n")
        body.append(f"```{lang}\n{code}\n```\n")
    text = "\n".join(body)
    (OUT_DIR / name).write_text(text)
    index_rows.append((name, cat, len(text), [i[1] for i in items]))


def cmd_build():
    OUT_DIR.mkdir(exist_ok=True)
    for old in OUT_DIR.glob("*.md"):
        old.unlink()
    index_rows, idx = [], 0

    # 0) manifest + zasoby tekstowe
    extras = []
    for rel in ("AndroidManifest.xml", "res/values/strings.xml"):
        f = RES_DIR / rel
        if f.exists():
            t = f.read_text(errors="ignore")
            extras.append((rel, rel, t[:MAX_CHARS], "xml", []))
    if extras:
        write_md(idx, "manifest", extras, index_rows)
        idx += 1

    files = collect()
    # mapa import -> ścieżka względna (do powiązań)
    names_by_pkg = {}
    for _, p, _ in files:
        rel = p.relative_to(SRC_DIR).as_posix()
        names_by_pkg[rel.rsplit(".", 1)[0]] = rel

    # 1) pakowanie: małe pliki razem w obrębie tej samej kategorii, duże tnij
    cur, cur_cat, cur_size = [], None, 0

    def flush():
        nonlocal cur, cur_size, idx
        if cur:
            write_md(idx, cur_cat, cur, index_rows)
            idx += 1
        cur, cur_size = [], 0

    for cat, p, txt in files:
        rel = p.relative_to(SRC_DIR).as_posix()
        lang = "kotlin" if p.suffix == ".kt" else "java"
        rel_cls = related(txt, names_by_pkg, rel)
        parts = split_code(txt)
        if len(parts) > 1:
            flush()
            for i, part in enumerate(parts, 1):
                cur_cat = cat
                cur = [(rel, f"{rel} (część {i}/{len(parts)})", part, lang, rel_cls)]
                flush()
            continue
        if cat != cur_cat or cur_size + len(txt) > MAX_CHARS:
            flush()
            cur_cat = cat
        cur.append((rel, rel, txt, lang, rel_cls))
        cur_size += len(txt)
    flush()

    # 2) indeks
    lines = ["# INDEX\n", f"Paczek: {len(index_rows)}, rozmiar łącznie: {sum(r[2] for r in index_rows)//1000} kB\n",
             "| plik | kategoria | znaki | zawartość |", "|---|---|---|---|"]
    for name, cat, size, names in index_rows:
        short = ", ".join(n.rsplit("/", 1)[-1] for n in names)
        lines.append(f"| {name} | {cat} | {size} | {short[:150]} |")
    (OUT_DIR / "INDEX.md").write_text("\n".join(lines) + "\n")
    print(f"Gotowe: {len(index_rows)} plików w {OUT_DIR}/ (zobacz INDEX.md)")


if __name__ == "__main__":
    cmd = sys.argv[1] if len(sys.argv) > 1 else ""
    {"packages": cmd_packages, "build": cmd_build}.get(cmd, lambda: print(__doc__))()
