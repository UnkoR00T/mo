package h8;

import a8.b2;
import a8.f3;
import a8.y1;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements b0, b0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f81488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f81489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b0.a f81490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a[] f81491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f81492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f81493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    long f81494g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    long f81495h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private e.d f81496j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f81497k;

    private final class a implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z0 f81498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f81499b;

        public a(z0 z0Var) {
            this.f81498a = z0Var;
        }

        @Override // h8.z0
        public void a() {
            this.f81498a.a();
        }

        @Override // h8.z0
        public int b(y1 y1Var, z7.f fVar, int i15) {
            if (d.this.v()) {
                return -3;
            }
            if (d.this.f81497k) {
                int iB = this.f81498a.b(y1Var, fVar, i15);
                if (iB != -5) {
                    return iB;
                }
                d dVar = d.this;
                d.B(y1Var, dVar.f81494g, dVar.f81495h);
                return -5;
            }
            if (this.f81499b) {
                fVar.v(4);
                return -4;
            }
            long jD = d.this.d();
            int iB2 = this.f81498a.b(y1Var, fVar, i15);
            if (d.this.f81493f != -9223372036854775807L && iB2 != -3) {
                d.this.f81493f = -9223372036854775807L;
            }
            if (iB2 == -5) {
                d dVar2 = d.this;
                d.B(y1Var, dVar2.f81494g, dVar2.f81495h);
                return -5;
            }
            long j15 = d.this.f81495h;
            if (j15 == Long.MIN_VALUE || ((iB2 != -4 || fVar.f233230f < j15) && !(iB2 == -3 && jD == Long.MIN_VALUE && !fVar.f233229e))) {
                return iB2;
            }
            fVar.l();
            fVar.v(4);
            this.f81499b = true;
            return -4;
        }

        @Override // h8.z0
        public int c(long j15) {
            if (d.this.v()) {
                return -3;
            }
            return this.f81498a.c(j15);
        }

        public void d() {
            this.f81499b = false;
        }

        @Override // h8.z0
        public boolean f() {
            return !d.this.v() && this.f81498a.f();
        }
    }

    public d(b0 b0Var, boolean z15, long j15, long j16) {
        this(b0Var, z15, j15, j16, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void B(y1 y1Var, long j15, long j16) {
        t7.p pVar = (t7.p) zj.p.q(y1Var.f4794b);
        int i15 = pVar.K;
        if (i15 == 0 && pVar.L == 0) {
            return;
        }
        if (j15 != 0) {
            i15 = 0;
        }
        y1Var.f4794b = pVar.b().e0(i15).f0(j16 == Long.MIN_VALUE ? pVar.L : 0).Q();
    }

    private f3 r(long j15, f3 f3Var) {
        long jP = w7.o0.p(f3Var.f4414a, 0L, j15 - this.f81494g);
        long j16 = f3Var.f4415b;
        long j17 = this.f81495h;
        long jP2 = w7.o0.p(j16, 0L, j17 == Long.MIN_VALUE ? Long.MAX_VALUE : j17 - j15);
        return (jP == f3Var.f4414a && jP2 == f3Var.f4415b) ? f3Var : new f3(jP, jP2);
    }

    private static long s(long j15, long j16, long j17) {
        long jMax = Math.max(j15, j16);
        return j17 != Long.MIN_VALUE ? Math.min(jMax, j17) : jMax;
    }

    private static boolean z(long j15, long j16, j8.r[] rVarArr) {
        if (j15 < j16) {
            return true;
        }
        if (j15 != 0) {
            for (j8.r rVar : rVarArr) {
                if (rVar != null) {
                    t7.p pVarL = rVar.l();
                    if (!t7.w.a(pVarL.f188381p, pVarL.f188376k)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void A(long j15, long j16) {
        this.f81494g = j15;
        this.f81495h = j16;
        if (this.f81489b) {
            long jN = this.f81488a.n(j16);
            zj.p.A(jN == Long.MIN_VALUE || jN == j16, "Period updating end positions not supported, %s!=%s", jN, j16);
            this.f81497k = jN == j16;
        }
    }

    @Override // h8.b0, h8.a1
    public long a() {
        long jA = this.f81488a.a();
        if (!this.f81497k) {
            if (jA != Long.MIN_VALUE) {
                long j15 = this.f81495h;
                if (j15 == Long.MIN_VALUE || jA < j15) {
                }
            }
            return Long.MIN_VALUE;
        }
        long j16 = this.f81495h;
        if (j16 != Long.MIN_VALUE && jA != Long.MIN_VALUE) {
            return Math.min(j16, jA);
        }
        return jA;
    }

    @Override // h8.b0, h8.a1
    public boolean b() {
        return this.f81488a.b();
    }

    @Override // h8.b0, h8.a1
    public boolean c(b2 b2Var) {
        return this.f81488a.c(b2Var);
    }

    @Override // h8.b0, h8.a1
    public long d() {
        long jD = this.f81488a.d();
        if (!this.f81497k) {
            if (jD != Long.MIN_VALUE) {
                long j15 = this.f81495h;
                if (j15 == Long.MIN_VALUE || jD < j15) {
                }
            }
            return Long.MIN_VALUE;
        }
        long j16 = this.f81495h;
        if (j16 != Long.MIN_VALUE && jD != Long.MIN_VALUE) {
            return Math.min(j16, jD);
        }
        return jD;
    }

    @Override // h8.b0, h8.a1
    public void e(long j15) {
        this.f81488a.e(j15);
    }

    @Override // h8.b0.a
    public void f(b0 b0Var) {
        if (this.f81496j != null) {
            return;
        }
        ((b0.a) zj.p.q(this.f81490c)).f(this);
    }

    @Override // h8.b0
    public long h(long j15, f3 f3Var) {
        long j16 = this.f81494g;
        if (j15 == j16) {
            return j16;
        }
        return this.f81488a.h(j15, r(j15, f3Var));
    }

    @Override // h8.b0
    public long i(long j15) {
        this.f81492e = -9223372036854775807L;
        for (a aVar : this.f81491d) {
            if (aVar != null) {
                aVar.d();
            }
        }
        return s(this.f81488a.i(j15), this.f81494g, this.f81495h);
    }

    @Override // h8.b0
    public long k() {
        if (v()) {
            long j15 = this.f81492e;
            this.f81492e = -9223372036854775807L;
            this.f81493f = j15;
            long jK = k();
            return jK != -9223372036854775807L ? jK : j15;
        }
        long jK2 = this.f81488a.k();
        if (jK2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long jS = s(jK2, this.f81494g, this.f81495h);
        if (jS == this.f81493f) {
            return -9223372036854775807L;
        }
        this.f81493f = jS;
        return jS;
    }

    @Override // h8.b0
    public void p(b0.a aVar, long j15) {
        this.f81490c = aVar;
        this.f81488a.p(this, j15);
    }

    @Override // h8.b0
    public void q() throws e.d {
        e.d dVar = this.f81496j;
        if (dVar != null) {
            throw dVar;
        }
        this.f81488a.q();
    }

    @Override // h8.b0
    public j1 t() {
        return this.f81488a.t();
    }

    @Override // h8.b0
    public long u(j8.r[] rVarArr, boolean[] zArr, z0[] z0VarArr, boolean[] zArr2, long j15) {
        this.f81491d = new a[z0VarArr.length];
        z0[] z0VarArr2 = new z0[z0VarArr.length];
        int i15 = 0;
        while (true) {
            z0 z0Var = null;
            if (i15 >= z0VarArr.length) {
                break;
            }
            a[] aVarArr = this.f81491d;
            a aVar = (a) z0VarArr[i15];
            aVarArr[i15] = aVar;
            if (aVar != null) {
                z0Var = aVar.f81498a;
            }
            z0VarArr2[i15] = z0Var;
            i15++;
        }
        long jU = this.f81488a.u(rVarArr, zArr, z0VarArr2, zArr2, j15);
        long jS = s(jU, j15, this.f81495h);
        this.f81492e = (v() && z(jU, j15, rVarArr)) ? jS : -9223372036854775807L;
        for (int i16 = 0; i16 < z0VarArr.length; i16++) {
            z0 z0Var2 = z0VarArr2[i16];
            if (z0Var2 == null) {
                this.f81491d[i16] = null;
            } else {
                a[] aVarArr2 = this.f81491d;
                a aVar2 = aVarArr2[i16];
                if (aVar2 == null || aVar2.f81498a != z0Var2) {
                    aVarArr2[i16] = new a(z0Var2);
                }
            }
            z0VarArr[i16] = this.f81491d[i16];
        }
        return jS;
    }

    boolean v() {
        return this.f81492e != -9223372036854775807L;
    }

    @Override // h8.b0
    public void w(long j15, boolean z15) {
        this.f81488a.w(j15, z15);
    }

    @Override // h8.a1.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void g(b0 b0Var) {
        ((b0.a) zj.p.q(this.f81490c)).g(this);
    }

    public void y(e.d dVar) {
        this.f81496j = dVar;
    }

    public d(b0 b0Var, boolean z15, long j15, long j16, boolean z16) {
        this.f81488a = b0Var;
        this.f81491d = new a[0];
        this.f81492e = z15 ? j15 : -9223372036854775807L;
        this.f81493f = -9223372036854775807L;
        this.f81489b = z16;
        A(j15, j16);
    }
}
