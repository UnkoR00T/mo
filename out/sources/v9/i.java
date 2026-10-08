package v9;

import java.util.Arrays;
import java.util.Collections;
import o8.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements m {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final byte[] f204971x = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f204972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w7.b0 f204973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w7.c0 f204974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f204975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f204976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f204977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f204978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private s0 f204979h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private s0 f204980i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f204981j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f204982k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f204983l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f204984m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f204985n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f204986o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f204987p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f204988q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f204989r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f204990s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f204991t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f204992u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private s0 f204993v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f204994w;

    public i(boolean z15, String str) {
        this(z15, null, 0, str);
    }

    private void a() {
        zj.p.q(this.f204979h);
        w7.o0.h(this.f204993v);
        w7.o0.h(this.f204980i);
    }

    private void g(w7.c0 c0Var) {
        if (c0Var.a() == 0) {
            return;
        }
        this.f204973b.f210609a[0] = c0Var.f()[c0Var.g()];
        this.f204973b.p(2);
        int iH = this.f204973b.h(4);
        int i15 = this.f204987p;
        if (i15 != -1 && iH != i15) {
            q();
            return;
        }
        if (!this.f204985n) {
            this.f204985n = true;
            this.f204986o = this.f204988q;
            this.f204987p = iH;
        }
        t();
    }

    private boolean h(w7.c0 c0Var, int i15) {
        c0Var.f0(i15 + 1);
        if (!w(c0Var, this.f204973b.f210609a, 1)) {
            return false;
        }
        this.f204973b.p(4);
        int iH = this.f204973b.h(1);
        int i16 = this.f204986o;
        if (i16 != -1 && iH != i16) {
            return false;
        }
        if (this.f204987p != -1) {
            if (!w(c0Var, this.f204973b.f210609a, 1)) {
                return true;
            }
            this.f204973b.p(2);
            if (this.f204973b.h(4) != this.f204987p) {
                return false;
            }
            c0Var.f0(i15 + 2);
        }
        if (!w(c0Var, this.f204973b.f210609a, 4)) {
            return true;
        }
        this.f204973b.p(14);
        int iH2 = this.f204973b.h(13);
        if (iH2 < 7) {
            return false;
        }
        byte[] bArrF = c0Var.f();
        int iJ = c0Var.j();
        int i17 = i15 + iH2;
        if (i17 >= iJ) {
            return true;
        }
        byte b15 = bArrF[i17];
        if (b15 == -1) {
            int i18 = i17 + 1;
            if (i18 == iJ) {
                return true;
            }
            return l((byte) -1, bArrF[i18]) && ((bArrF[i18] & 8) >> 3) == iH;
        }
        if (b15 != 73) {
            return false;
        }
        int i19 = i17 + 1;
        if (i19 == iJ) {
            return true;
        }
        if (bArrF[i19] != 68) {
            return false;
        }
        int i25 = i17 + 2;
        return i25 == iJ || bArrF[i25] == 51;
    }

    private boolean i(w7.c0 c0Var, byte[] bArr, int i15) {
        int iMin = Math.min(c0Var.a(), i15 - this.f204982k);
        c0Var.u(bArr, this.f204982k, iMin);
        int i16 = this.f204982k + iMin;
        this.f204982k = i16;
        return i16 == i15;
    }

    private void j(w7.c0 c0Var) {
        byte[] bArrF = c0Var.f();
        int iG = c0Var.g();
        int iJ = c0Var.j();
        while (iG < iJ) {
            int i15 = iG + 1;
            byte b15 = bArrF[iG];
            int i16 = b15 & 255;
            if (this.f204983l == 512 && l((byte) -1, (byte) i16) && (this.f204985n || h(c0Var, iG - 1))) {
                this.f204988q = (b15 & 8) >> 3;
                this.f204984m = (b15 & 1) == 0;
                if (this.f204985n) {
                    t();
                } else {
                    r();
                }
                c0Var.f0(i15);
                return;
            }
            int i17 = this.f204983l;
            int i18 = i16 | i17;
            if (i18 == 329) {
                this.f204983l = 768;
            } else if (i18 == 511) {
                this.f204983l = 512;
            } else if (i18 == 836) {
                this.f204983l = 1024;
            } else if (i18 == 1075) {
                u();
                c0Var.f0(i15);
                return;
            } else if (i17 != 256) {
                this.f204983l = 256;
            }
            iG = i15;
        }
        c0Var.f0(iG);
    }

    private boolean l(byte b15, byte b16) {
        return m(((b15 & 255) << 8) | (b16 & 255));
    }

    public static boolean m(int i15) {
        return (i15 & 65526) == 65520;
    }

    private void n() {
        this.f204973b.p(0);
        if (this.f204989r) {
            this.f204973b.r(10);
        } else {
            int i15 = 2;
            int iH = this.f204973b.h(2) + 1;
            if (iH != 2) {
                w7.t.h("AdtsReader", "Detected audio object type: " + iH + ", but assuming AAC LC.");
            } else {
                i15 = iH;
            }
            this.f204973b.r(5);
            byte[] bArrA = o8.a.a(i15, this.f204987p, this.f204973b.h(3));
            o8.a.b bVarE = o8.a.e(bArrA);
            t7.p pVarQ = new t7.p.b().k0(this.f204978g).X(this.f204977f).A0("audio/mp4a-latm").V(bVarE.f143004c).U(bVarE.f143003b).B0(bVarE.f143002a).l0(Collections.singletonList(bArrA)).o0(this.f204975d).y0(this.f204976e).Q();
            this.f204990s = 1024000000 / ((long) pVarQ.I);
            this.f204979h.e(pVarQ);
            this.f204989r = true;
        }
        this.f204973b.r(4);
        int iH2 = this.f204973b.h(13);
        int i16 = iH2 - 7;
        if (this.f204984m) {
            i16 = iH2 - 9;
        }
        v(this.f204979h, this.f204990s, 0, i16);
    }

    private void o() {
        this.f204980i.a(this.f204974c, 10);
        this.f204974c.f0(6);
        v(this.f204980i, 0L, 10, this.f204974c.P() + 10);
    }

    private void p(w7.c0 c0Var) {
        int iMin = Math.min(c0Var.a(), this.f204991t - this.f204982k);
        this.f204993v.a(c0Var, iMin);
        int i15 = this.f204982k + iMin;
        this.f204982k = i15;
        if (i15 == this.f204991t) {
            zj.p.w(this.f204992u != -9223372036854775807L);
            this.f204993v.c(this.f204992u, 1, this.f204991t, 0, null);
            this.f204992u += this.f204994w;
            s();
        }
    }

    private void q() {
        this.f204985n = false;
        s();
    }

    private void r() {
        this.f204981j = 1;
        this.f204982k = 0;
    }

    private void s() {
        this.f204981j = 0;
        this.f204982k = 0;
        this.f204983l = 256;
    }

    private void t() {
        this.f204981j = 3;
        this.f204982k = 0;
    }

    private void u() {
        this.f204981j = 2;
        this.f204982k = f204971x.length;
        this.f204991t = 0;
        this.f204974c.f0(0);
    }

    private void v(s0 s0Var, long j15, int i15, int i16) {
        this.f204981j = 4;
        this.f204982k = i15;
        this.f204993v = s0Var;
        this.f204994w = j15;
        this.f204991t = i16;
    }

    private boolean w(w7.c0 c0Var, byte[] bArr, int i15) {
        if (c0Var.a() < i15) {
            return false;
        }
        c0Var.u(bArr, 0, i15);
        return true;
    }

    @Override // v9.m
    public void b(w7.c0 c0Var) {
        a();
        while (c0Var.a() > 0) {
            int i15 = this.f204981j;
            if (i15 == 0) {
                j(c0Var);
            } else if (i15 == 1) {
                g(c0Var);
            } else if (i15 != 2) {
                if (i15 == 3) {
                    if (i(c0Var, this.f204973b.f210609a, this.f204984m ? 7 : 5)) {
                        n();
                    }
                } else {
                    if (i15 != 4) {
                        throw new IllegalStateException();
                    }
                    p(c0Var);
                }
            } else if (i(c0Var, this.f204974c.f(), 10)) {
                o();
            }
        }
    }

    @Override // v9.m
    public void c() {
        this.f204992u = -9223372036854775807L;
        q();
    }

    @Override // v9.m
    public void d(o8.r rVar, l0.d dVar) {
        dVar.a();
        this.f204978g = dVar.b();
        s0 s0VarV = rVar.v(dVar.c(), 1);
        this.f204979h = s0VarV;
        this.f204993v = s0VarV;
        if (!this.f204972a) {
            this.f204980i = new o8.n();
            return;
        }
        dVar.a();
        s0 s0VarV2 = rVar.v(dVar.c(), 5);
        this.f204980i = s0VarV2;
        s0VarV2.e(new t7.p.b().k0(dVar.b()).X(this.f204977f).A0("application/id3").Q());
    }

    @Override // v9.m
    public void e(boolean z15) {
    }

    @Override // v9.m
    public void f(long j15, int i15) {
        this.f204992u = j15;
    }

    public long k() {
        return this.f204990s;
    }

    public i(boolean z15, String str, int i15, String str2) {
        this.f204973b = new w7.b0(new byte[7]);
        this.f204974c = new w7.c0(Arrays.copyOf(f204971x, 10));
        this.f204986o = -1;
        this.f204987p = -1;
        this.f204990s = -9223372036854775807L;
        this.f204992u = -9223372036854775807L;
        this.f204972a = z15;
        this.f204975d = str;
        this.f204976e = i15;
        this.f204977f = str2;
        s();
    }
}
