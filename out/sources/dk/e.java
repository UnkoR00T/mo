package dk;

import ak.b1;
import ak.f1;
import ak.o0;
import ak.r0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Map;
import zj.g;
import zj.i;
import zj.l;
import zj.m;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f42989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f42990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o0<String, String> f42991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f42992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f42993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private m<Charset> f42994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final o0<String, String> f42931g = o0.B("charset", zj.c.f(StandardCharsets.UTF_8.name()));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final zj.d f42934h = zj.d.f().b(zj.d.m().q()).b(zj.d.l(' ')).b(zj.d.s("()<>@,;:\\\"/[]?="));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final zj.d f42937i = zj.d.f().b(zj.d.s("\"\\\r"));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final zj.d f42940j = zj.d.d(" \t\r\n");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Map<e, e> f42943k = b1.j();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final e f42946l = d("*", "*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e f42949m = d("text", "*");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final e f42952n = d("image", "*");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final e f42955o = d("audio", "*");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final e f42958p = d("video", "*");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final e f42961q = d("application", "*");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e f42964r = d("font", "*");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final e f42967s = e("text", "cache-manifest");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final e f42970t = e("text", "css");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final e f42973u = e("text", "csv");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final e f42976v = e("text", "html");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final e f42979w = e("text", "calendar");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final e f42982x = e("text", "markdown");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final e f42985y = e("text", "plain");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final e f42987z = e("text", "javascript");
    public static final e A = e("text", "tab-separated-values");
    public static final e B = e("text", "vcard");
    public static final e C = e("text", "vnd.wap.wml");
    public static final e D = e("text", "xml");
    public static final e E = e("text", "vtt");
    public static final e F = d("image", "bmp");
    public static final e G = d("image", "x-canon-crw");
    public static final e H = d("image", "gif");
    public static final e I = d("image", "vnd.microsoft.icon");
    public static final e J = d("image", "jpeg");
    public static final e K = d("image", "png");
    public static final e L = d("image", "vnd.adobe.photoshop");
    public static final e M = e("image", "svg+xml");
    public static final e N = d("image", "tiff");
    public static final e O = d("image", "webp");
    public static final e P = d("image", "heif");
    public static final e Q = d("image", "jp2");
    public static final e R = d("audio", "mp4");
    public static final e S = d("audio", "mpeg");
    public static final e T = d("audio", "ogg");
    public static final e U = d("audio", "webm");
    public static final e V = d("audio", "l16");
    public static final e W = d("audio", "l24");
    public static final e X = d("audio", "basic");
    public static final e Y = d("audio", "aac");
    public static final e Z = d("audio", "vorbis");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final e f42919a0 = d("audio", "x-ms-wma");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final e f42921b0 = d("audio", "x-ms-wax");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final e f42923c0 = d("audio", "vnd.rn-realaudio");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final e f42925d0 = d("audio", "vnd.wave");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final e f42927e0 = d("video", "mp4");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final e f42929f0 = d("video", "mpeg");

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final e f42932g0 = d("video", "ogg");

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final e f42935h0 = d("video", "quicktime");

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final e f42938i0 = d("video", "webm");

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final e f42941j0 = d("video", "x-ms-wmv");

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final e f42944k0 = d("video", "x-flv");

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final e f42947l0 = d("video", "3gpp");

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final e f42950m0 = d("video", "3gpp2");

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final e f42953n0 = e("application", "xml");

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final e f42956o0 = e("application", "atom+xml");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final e f42959p0 = d("application", "x-bzip2");

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final e f42962q0 = e("application", "dart");

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final e f42965r0 = d("application", "vnd.apple.pkpass");

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final e f42968s0 = d("application", "vnd.ms-fontobject");

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final e f42971t0 = d("application", "epub+zip");

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final e f42974u0 = d("application", "x-www-form-urlencoded");

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final e f42977v0 = d("application", "pkcs12");

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final e f42980w0 = d("application", "binary");

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final e f42983x0 = d("application", "geo+json");

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final e f42986y0 = d("application", "x-gzip");

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final e f42988z0 = d("application", "hal+json");
    public static final e A0 = e("application", "javascript");
    public static final e B0 = d("application", "jose");
    public static final e C0 = d("application", "jose+json");
    public static final e D0 = e("application", "json");
    public static final e E0 = d("application", "jwt");
    public static final e F0 = e("application", "manifest+json");
    public static final e G0 = d("application", "vnd.google-earth.kml+xml");
    public static final e H0 = d("application", "vnd.google-earth.kmz");
    public static final e I0 = d("application", "mbox");
    public static final e J0 = d("application", "x-apple-aspen-config");
    public static final e K0 = d("application", "vnd.ms-excel");
    public static final e L0 = d("application", "vnd.ms-outlook");
    public static final e M0 = d("application", "vnd.ms-powerpoint");
    public static final e N0 = d("application", "msword");
    public static final e O0 = d("application", "dash+xml");
    public static final e P0 = d("application", "wasm");
    public static final e Q0 = d("application", "x-nacl");
    public static final e R0 = d("application", "x-pnacl");
    public static final e S0 = d("application", "octet-stream");
    public static final e T0 = d("application", "ogg");
    public static final e U0 = d("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
    public static final e V0 = d("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
    public static final e W0 = d("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
    public static final e X0 = d("application", "vnd.oasis.opendocument.graphics");
    public static final e Y0 = d("application", "vnd.oasis.opendocument.presentation");
    public static final e Z0 = d("application", "vnd.oasis.opendocument.spreadsheet");

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final e f42920a1 = d("application", "vnd.oasis.opendocument.text");

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final e f42922b1 = e("application", "opensearchdescription+xml");

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final e f42924c1 = d("application", "pdf");

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final e f42926d1 = d("application", "postscript");

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final e f42928e1 = d("application", "protobuf");

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final e f42930f1 = e("application", "rdf+xml");

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final e f42933g1 = e("application", "rtf");

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final e f42936h1 = d("application", "font-sfnt");

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final e f42939i1 = d("application", "x-shockwave-flash");

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final e f42942j1 = d("application", "vnd.sketchup.skp");

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final e f42945k1 = e("application", "soap+xml");

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final e f42948l1 = d("application", "x-tar");

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final e f42951m1 = d("application", "font-woff");

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final e f42954n1 = d("application", "font-woff2");

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final e f42957o1 = e("application", "xhtml+xml");

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final e f42960p1 = e("application", "xrd+xml");

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final e f42963q1 = d("application", "zip");

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final e f42966r1 = d("font", "collection");

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final e f42969s1 = d("font", "otf");

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final e f42972t1 = d("font", "sfnt");

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final e f42975u1 = d("font", "ttf");

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final e f42978v1 = d("font", "woff");

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final e f42981w1 = d("font", "woff2");

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private static final i.b f42984x1 = i.h("; ").k("=");

    private e(String str, String str2, o0<String, String> o0Var) {
        this.f42989a = str;
        this.f42990b = str2;
        this.f42991c = o0Var;
    }

    public static /* synthetic */ String a(String str) {
        return (!f42934h.o(str) || str.isEmpty()) ? f(str) : str;
    }

    private static e b(e eVar) {
        f42943k.put(eVar, eVar);
        return eVar;
    }

    private String c() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f42989a);
        sb5.append('/');
        sb5.append(this.f42990b);
        if (!this.f42991c.j()) {
            sb5.append("; ");
            f42984x1.b(sb5, f1.d(this.f42991c, new g() { // from class: dk.c
                @Override // zj.g
                public final Object apply(Object obj) {
                    return e.a((String) obj);
                }
            }).a());
        }
        return sb5.toString();
    }

    private static e d(String str, String str2) {
        e eVarB = b(new e(str, str2, o0.A()));
        eVarB.f42994f = m.a();
        return eVarB;
    }

    private static e e(String str, String str2) {
        e eVarB = b(new e(str, str2, f42931g));
        eVarB.f42994f = m.c(StandardCharsets.UTF_8);
        return eVarB;
    }

    private static String f(String str) {
        StringBuilder sb5 = new StringBuilder(str.length() + 16);
        sb5.append('\"');
        for (int i15 = 0; i15 < str.length(); i15++) {
            char cCharAt = str.charAt(i15);
            if (cCharAt == '\r' || cCharAt == '\\' || cCharAt == '\"') {
                sb5.append('\\');
            }
            sb5.append(cCharAt);
        }
        sb5.append('\"');
        return sb5.toString();
    }

    private Map<String, r0<String>> g() {
        return b1.s(this.f42991c.b(), new g() { // from class: dk.d
            @Override // zj.g
            public final Object apply(Object obj) {
                return r0.n((Collection) obj);
            }
        });
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f42989a.equals(eVar.f42989a) && this.f42990b.equals(eVar.f42990b) && g().equals(eVar.g())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i15 = this.f42993e;
        if (i15 != 0) {
            return i15;
        }
        int iB = l.b(this.f42989a, this.f42990b, g());
        this.f42993e = iB;
        return iB;
    }

    public String toString() {
        String str = this.f42992d;
        if (str != null) {
            return str;
        }
        String strC = c();
        this.f42992d = strC;
        return strC;
    }
}
