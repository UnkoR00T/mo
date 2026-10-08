package ge4;

import java.io.EOFException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
final class v {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final char[] f72421l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f72422m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f72423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fv.v f72424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f72425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private fv.v.a f72426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final fv.b0.a f72427e = new fv.b0.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final fv.u.a f72428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private fv.x f72429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f72430h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private fv.y.a f72431i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private fv.s.a f72432j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private fv.c0 f72433k;

    private static class a extends fv.c0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final fv.c0 f72434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final fv.x f72435c;

        a(fv.c0 c0Var, fv.x xVar) {
            this.f72434b = c0Var;
            this.f72435c = xVar;
        }

        @Override // fv.c0
        public long a() {
            return this.f72434b.a();
        }

        @Override // fv.c0
        /* JADX INFO: renamed from: b */
        public fv.x getF67282b() {
            return this.f72435c;
        }

        @Override // fv.c0
        public void h(vv.f fVar) {
            this.f72434b.h(fVar);
        }
    }

    v(String str, fv.v vVar, String str2, fv.u uVar, fv.x xVar, boolean z15, boolean z16, boolean z17) {
        this.f72423a = str;
        this.f72424b = vVar;
        this.f72425c = str2;
        this.f72429g = xVar;
        this.f72430h = z15;
        if (uVar != null) {
            this.f72428f = uVar.g();
        } else {
            this.f72428f = new fv.u.a();
        }
        if (z16) {
            this.f72432j = new fv.s.a();
        } else if (z17) {
            fv.y.a aVar = new fv.y.a();
            this.f72431i = aVar;
            aVar.d(fv.y.f67537l);
        }
    }

    private static String i(String str, boolean z15) throws EOFException {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z15 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                vv.e eVar = new vv.e();
                eVar.v1(str, 0, iCharCount);
                j(eVar, str, iCharCount, length, z15);
                return eVar.C0();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    private static void j(vv.e eVar, String str, int i15, int i16, boolean z15) throws EOFException {
        vv.e eVar2 = null;
        while (i15 < i16) {
            int iCodePointAt = str.codePointAt(i15);
            if (!z15 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z15 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    if (eVar2 == null) {
                        eVar2 = new vv.e();
                    }
                    eVar2.i3(iCodePointAt);
                    long size = eVar2.getSize();
                    for (long j15 = 0; j15 < size; j15++) {
                        byte bI = eVar2.I(j15);
                        eVar.writeByte(37);
                        char[] cArr = f72421l;
                        eVar.writeByte(cArr[((bI & 255) >> 4) & 15]);
                        eVar.writeByte(cArr[bI & 15]);
                    }
                    eVar2.b();
                } else {
                    eVar.i3(iCodePointAt);
                }
            }
            i15 += Character.charCount(iCodePointAt);
        }
    }

    void a(String str, String str2, boolean z15) {
        if (z15) {
            this.f72432j.b(str, str2);
        } else {
            this.f72432j.a(str, str2);
        }
    }

    void b(String str, String str2, boolean z15) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            if (z15) {
                this.f72428f.e(str, str2);
                return;
            } else {
                this.f72428f.a(str, str2);
                return;
            }
        }
        try {
            this.f72429g = fv.x.e(str2);
        } catch (IllegalArgumentException e15) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e15);
        }
    }

    void c(fv.u uVar) {
        this.f72428f.b(uVar);
    }

    void d(fv.u uVar, fv.c0 c0Var) {
        this.f72431i.a(uVar, c0Var);
    }

    void e(fv.y.c cVar) {
        this.f72431i.b(cVar);
    }

    void f(String str, String str2, boolean z15) throws EOFException {
        if (this.f72425c == null) {
            throw new AssertionError();
        }
        String strI = i(str2, z15);
        String strReplace = this.f72425c.replace("{" + str + "}", strI);
        if (!f72422m.matcher(strReplace).matches()) {
            this.f72425c = strReplace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    void g(String str, String str2, boolean z15) {
        String str3 = this.f72425c;
        if (str3 != null) {
            fv.v.a aVarL = this.f72424b.l(str3);
            this.f72426d = aVarL;
            if (aVarL == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f72424b + ", Relative: " + this.f72425c);
            }
            this.f72425c = null;
        }
        if (z15) {
            this.f72426d.a(str, str2);
        } else {
            this.f72426d.c(str, str2);
        }
    }

    <T> void h(Class<T> cls, T t15) {
        this.f72427e.i(cls, t15);
    }

    fv.b0.a k() {
        fv.v vVarQ;
        fv.v.a aVar = this.f72426d;
        if (aVar != null) {
            vVarQ = aVar.d();
        } else {
            vVarQ = this.f72424b.q(this.f72425c);
            if (vVarQ == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f72424b + ", Relative: " + this.f72425c);
            }
        }
        fv.c0 aVar2 = this.f72433k;
        if (aVar2 == null) {
            fv.s.a aVar3 = this.f72432j;
            if (aVar3 != null) {
                aVar2 = aVar3.c();
            } else {
                fv.y.a aVar4 = this.f72431i;
                if (aVar4 != null) {
                    aVar2 = aVar4.c();
                } else if (this.f72430h) {
                    aVar2 = fv.c0.e(null, new byte[0]);
                }
            }
        }
        fv.x xVar = this.f72429g;
        if (xVar != null) {
            if (aVar2 != null) {
                aVar2 = new a(aVar2, xVar);
            } else {
                this.f72428f.a("Content-Type", xVar.getMediaType());
            }
        }
        return this.f72427e.j(vVarQ).e(this.f72428f.f()).f(this.f72423a, aVar2);
    }

    void l(fv.c0 c0Var) {
        this.f72433k = c0Var;
    }

    void m(Object obj) {
        this.f72425c = obj.toString();
    }
}
