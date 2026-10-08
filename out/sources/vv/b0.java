package vv;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\n\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001!B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0013\u0010'\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010,\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u00101\u001a\u0004\u0018\u00010.8G¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u00103\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b2\u0010$R\u0011\u00105\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b4\u0010 R\u0013\u00107\u001a\u0004\u0018\u00010\u00008G¢\u0006\u0006\u001a\u0004\b6\u0010&¨\u00068"}, d2 = {"Lvv/b0;", "", "Lvv/h;", "bytes", "<init>", "(Lvv/h;)V", "", "child", "p", "(Ljava/lang/String;)Lvv/b0;", "", "normalize", "q", "(Lvv/b0;Z)Lvv/b0;", "other", "o", "(Lvv/b0;)Lvv/b0;", "Ljava/io/File;", "toFile", "()Ljava/io/File;", "Ljava/nio/file/Path;", "s", "()Ljava/nio/file/Path;", "", "b", "(Lvv/b0;)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Lvv/h;", "e", "()Lvv/h;", "g", "()Lvv/b0;", "root", "", "j", "()Ljava/util/List;", "segmentsBytes", "isAbsolute", "()Z", "", "t", "()Ljava/lang/Character;", "volumeLetter", "l", "nameBytes", "k", "name", "n", "parent", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b0 implements Comparable<b0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f208327c = File.separator;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h bytes;

    /* JADX INFO: renamed from: vv.b0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u0007*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u0007*\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\u0007*\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lvv/b0$a;", "", "<init>", "()V", "", "", "normalize", "Lvv/b0;", "b", "(Ljava/lang/String;Z)Lvv/b0;", "Ljava/io/File;", "a", "(Ljava/io/File;Z)Lvv/b0;", "Ljava/nio/file/Path;", "c", "(Ljava/nio/file/Path;Z)Lvv/b0;", "DIRECTORY_SEPARATOR", "Ljava/lang/String;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public static /* synthetic */ b0 d(Companion companion, File file, boolean z15, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                z15 = false;
            }
            return companion.a(file, z15);
        }

        public static /* synthetic */ b0 e(Companion companion, String str, boolean z15, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                z15 = false;
            }
            return companion.b(str, z15);
        }

        public static /* synthetic */ b0 f(Companion companion, Path path, boolean z15, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                z15 = false;
            }
            return companion.c(path, z15);
        }

        public final b0 a(File file, boolean z15) {
            return b(file.toString(), z15);
        }

        public final b0 b(String str, boolean z15) {
            return wv.e.k(str, z15);
        }

        public final b0 c(Path path, boolean z15) {
            return b(path.toString(), z15);
        }

        private Companion() {
        }
    }

    public b0(h hVar) {
        this.bytes = hVar;
    }

    public static /* synthetic */ b0 r(b0 b0Var, b0 b0Var2, boolean z15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        return b0Var.q(b0Var2, z15);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(b0 other) {
        return getBytes().compareTo(other.getBytes());
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final h getBytes() {
        return this.bytes;
    }

    public boolean equals(Object other) {
        return (other instanceof b0) && fr.t.c(((b0) other).getBytes(), getBytes());
    }

    public final b0 g() {
        int iO = wv.e.o(this);
        if (iO == -1) {
            return null;
        }
        return new b0(getBytes().T(0, iO));
    }

    public int hashCode() {
        return getBytes().hashCode();
    }

    public final boolean isAbsolute() {
        return wv.e.o(this) != -1;
    }

    public final List<h> j() {
        ArrayList arrayList = new ArrayList();
        int iO = wv.e.o(this);
        if (iO == -1) {
            iO = 0;
        } else if (iO < getBytes().Q() && getBytes().n(iO) == 92) {
            iO++;
        }
        int iQ = getBytes().Q();
        int i15 = iO;
        while (iO < iQ) {
            if (getBytes().n(iO) == 47 || getBytes().n(iO) == 92) {
                arrayList.add(getBytes().T(i15, iO));
                i15 = iO + 1;
            }
            iO++;
        }
        if (i15 < getBytes().Q()) {
            arrayList.add(getBytes().T(i15, getBytes().Q()));
        }
        return arrayList;
    }

    public final String k() {
        return l().Y();
    }

    public final h l() {
        int iL = wv.e.l(this);
        if (iL != -1) {
            return h.U(getBytes(), iL + 1, 0, 2, null);
        }
        return (t() == null || getBytes().Q() != 2) ? getBytes() : h.f208378e;
    }

    public final b0 n() {
        if (fr.t.c(getBytes(), wv.e.f215232d) || fr.t.c(getBytes(), wv.e.f215229a) || fr.t.c(getBytes(), wv.e.f215230b) || wv.e.n(this)) {
            return null;
        }
        int iL = wv.e.l(this);
        if (iL == 2 && t() != null) {
            if (getBytes().Q() == 3) {
                return null;
            }
            return new b0(h.U(getBytes(), 0, 3, 1, null));
        }
        if (iL == 1 && getBytes().R(wv.e.f215230b)) {
            return null;
        }
        if (iL != -1 || t() == null) {
            if (iL == -1) {
                return new b0(wv.e.f215232d);
            }
            return iL == 0 ? new b0(h.U(getBytes(), 0, 1, 1, null)) : new b0(h.U(getBytes(), 0, iL, 1, null));
        }
        if (getBytes().Q() == 2) {
            return null;
        }
        return new b0(h.U(getBytes(), 0, 2, 1, null));
    }

    public final b0 o(b0 other) {
        if (!fr.t.c(g(), other.g())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        List<h> listJ = j();
        List<h> listJ2 = other.j();
        int iMin = Math.min(listJ.size(), listJ2.size());
        int i15 = 0;
        while (i15 < iMin && fr.t.c(listJ.get(i15), listJ2.get(i15))) {
            i15++;
        }
        if (i15 == iMin && getBytes().Q() == other.getBytes().Q()) {
            return Companion.e(INSTANCE, ".", false, 1, null);
        }
        if (listJ2.subList(i15, listJ2.size()).indexOf(wv.e.f215233e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        if (fr.t.c(other.getBytes(), wv.e.f215232d)) {
            return this;
        }
        e eVar = new e();
        h hVarM = wv.e.m(other);
        if (hVarM == null && (hVarM = wv.e.m(this)) == null) {
            hVarM = wv.e.s(f208327c);
        }
        int size = listJ2.size();
        for (int i16 = i15; i16 < size; i16++) {
            eVar.M0(wv.e.f215233e);
            eVar.M0(hVarM);
        }
        int size2 = listJ.size();
        while (i15 < size2) {
            eVar.M0(listJ.get(i15));
            eVar.M0(hVarM);
            i15++;
        }
        return wv.e.q(eVar, false);
    }

    public final b0 p(String child) {
        return wv.e.j(this, wv.e.q(new e().k1(child), false), false);
    }

    public final b0 q(b0 child, boolean normalize) {
        return wv.e.j(this, child, normalize);
    }

    public final Path s() {
        return Paths.get(toString(), new String[0]);
    }

    public final Character t() {
        if (h.y(getBytes(), wv.e.f215229a, 0, 2, null) != -1 || getBytes().Q() < 2 || getBytes().n(1) != 58) {
            return null;
        }
        char cN = (char) getBytes().n(0);
        if (('a' > cN || cN >= '{') && ('A' > cN || cN >= '[')) {
            return null;
        }
        return Character.valueOf(cN);
    }

    public final File toFile() {
        return new File(toString());
    }

    public String toString() {
        return getBytes().Y();
    }
}
