package v9;

import o8.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f205250a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f205255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s0 f205256g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f205259j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f205261l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f205262m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f205264o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f205265p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f205269t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f205271v;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f205254e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w7.c0 f205251b = new w7.c0(new byte[15], 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w7.b0 f205252c = new w7.b0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w7.c0 f205253d = new w7.c0();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private v.b f205266q = new v.b();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f205267r = -2147483647;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f205268s = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f205270u = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f205260k = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f205263n = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f205257h = -9.223372036854776E18d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f205258i = -9.223372036854776E18d;

    public u(String str) {
        this.f205250a = str;
    }

    private void a(w7.c0 c0Var, w7.c0 c0Var2, boolean z15) {
        int iG = c0Var.g();
        int iMin = Math.min(c0Var.a(), c0Var2.a());
        c0Var.u(c0Var2.f(), c0Var2.g(), iMin);
        c0Var2.g0(iMin);
        if (z15) {
            c0Var.f0(iG);
        }
    }

    private void g() {
        int i15;
        if (this.f205271v) {
            this.f205260k = false;
            i15 = 1;
        } else {
            i15 = 0;
        }
        double d15 = (((double) (this.f205268s - this.f205269t)) * 1000000.0d) / ((double) this.f205267r);
        long jRound = Math.round(this.f205257h);
        if (this.f205259j) {
            this.f205259j = false;
            this.f205257h = this.f205258i;
        } else {
            this.f205257h += d15;
        }
        this.f205256g.c(jRound, i15, this.f205265p, 0, null);
        this.f205271v = false;
        this.f205269t = 0;
        this.f205265p = 0;
    }

    private void h(w7.b0 b0Var) throws t7.x {
        v.c cVarH = v.h(b0Var);
        this.f205267r = cVarH.f205276b;
        this.f205268s = cVarH.f205277c;
        long j15 = this.f205270u;
        long j16 = this.f205266q.f205273b;
        if (j15 != j16) {
            this.f205270u = j16;
            String str = "mhm1";
            if (cVarH.f205275a != -1) {
                str = "mhm1" + String.format(".%02X", Integer.valueOf(cVarH.f205275a));
            }
            byte[] bArr = cVarH.f205278d;
            this.f205256g.e(new t7.p.b().k0(this.f205255f).X(this.f205250a).A0("audio/mhm1").B0(this.f205267r).V(str).l0((bArr == null || bArr.length <= 0) ? null : ak.n0.F(w7.o0.f210729f, bArr)).Q());
        }
        this.f205271v = true;
    }

    private boolean i() throws t7.x {
        int iJ = this.f205251b.j();
        this.f205252c.o(this.f205251b.f(), iJ);
        boolean zG = v.g(this.f205252c, this.f205266q);
        if (zG) {
            this.f205264o = 0;
            this.f205265p += this.f205266q.f205274c + iJ;
        }
        return zG;
    }

    private boolean j(int i15) {
        return i15 == 1 || i15 == 17;
    }

    private boolean k(w7.c0 c0Var) {
        int i15 = this.f205261l;
        if ((i15 & 2) == 0) {
            c0Var.f0(c0Var.j());
            return false;
        }
        if ((i15 & 4) != 0) {
            return true;
        }
        while (c0Var.a() > 0) {
            int i16 = this.f205262m << 8;
            this.f205262m = i16;
            int iQ = i16 | c0Var.Q();
            this.f205262m = iQ;
            if (v.e(iQ)) {
                c0Var.f0(c0Var.g() - 3);
                this.f205262m = 0;
                return true;
            }
        }
        return false;
    }

    private void l(w7.c0 c0Var) {
        int iMin = Math.min(c0Var.a(), this.f205266q.f205274c - this.f205264o);
        this.f205256g.a(c0Var, iMin);
        this.f205264o += iMin;
    }

    @Override // v9.m
    public void b(w7.c0 c0Var) throws t7.x {
        zj.p.q(this.f205256g);
        while (c0Var.a() > 0) {
            int i15 = this.f205254e;
            if (i15 != 0) {
                if (i15 == 1) {
                    a(c0Var, this.f205251b, false);
                    if (this.f205251b.a() != 0) {
                        this.f205263n = false;
                    } else if (i()) {
                        this.f205251b.f0(0);
                        s0 s0Var = this.f205256g;
                        w7.c0 c0Var2 = this.f205251b;
                        s0Var.a(c0Var2, c0Var2.j());
                        this.f205251b.b0(2);
                        this.f205253d.b0(this.f205266q.f205274c);
                        this.f205263n = true;
                        this.f205254e = 2;
                    } else if (this.f205251b.j() < 15) {
                        w7.c0 c0Var3 = this.f205251b;
                        c0Var3.e0(c0Var3.j() + 1);
                        this.f205263n = false;
                    }
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException();
                    }
                    if (j(this.f205266q.f205272a)) {
                        a(c0Var, this.f205253d, true);
                    }
                    l(c0Var);
                    int i16 = this.f205264o;
                    v.b bVar = this.f205266q;
                    if (i16 == bVar.f205274c) {
                        int i17 = bVar.f205272a;
                        if (i17 == 1) {
                            h(new w7.b0(this.f205253d.f()));
                        } else if (i17 == 17) {
                            this.f205269t = v.f(new w7.b0(this.f205253d.f()));
                        } else if (i17 == 2) {
                            g();
                        }
                        this.f205254e = 1;
                    }
                }
            } else if (k(c0Var)) {
                this.f205254e = 1;
            }
        }
    }

    @Override // v9.m
    public void c() {
        this.f205254e = 0;
        this.f205262m = 0;
        this.f205251b.b0(2);
        this.f205264o = 0;
        this.f205265p = 0;
        this.f205267r = -2147483647;
        this.f205268s = -1;
        this.f205269t = 0;
        this.f205270u = -1L;
        this.f205271v = false;
        this.f205259j = false;
        this.f205263n = true;
        this.f205260k = true;
        this.f205257h = -9.223372036854776E18d;
        this.f205258i = -9.223372036854776E18d;
    }

    @Override // v9.m
    public void d(o8.r rVar, l0.d dVar) {
        dVar.a();
        this.f205255f = dVar.b();
        this.f205256g = rVar.v(dVar.c(), 1);
    }

    @Override // v9.m
    public void e(boolean z15) {
    }

    @Override // v9.m
    public void f(long j15, int i15) {
        this.f205261l = i15;
        if (!this.f205260k && (this.f205265p != 0 || !this.f205263n)) {
            this.f205259j = true;
        }
        if (j15 != -9223372036854775807L) {
            if (this.f205259j) {
                this.f205258i = j15;
            } else {
                this.f205257h = j15;
            }
        }
    }
}
