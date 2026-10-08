package h8;

import a8.b2;
import a8.f3;
import a8.y1;

/* JADX INFO: loaded from: classes3.dex */
final class g1 implements b0, b0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f81594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f81595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b0.a f81596c;

    private static final class a implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z0 f81597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f81598b;

        public a(z0 z0Var, long j15) {
            this.f81597a = z0Var;
            this.f81598b = j15;
        }

        @Override // h8.z0
        public void a() {
            this.f81597a.a();
        }

        @Override // h8.z0
        public int b(y1 y1Var, z7.f fVar, int i15) {
            int iB = this.f81597a.b(y1Var, fVar, i15);
            if (iB == -4) {
                fVar.f233230f += this.f81598b;
            }
            return iB;
        }

        @Override // h8.z0
        public int c(long j15) {
            return this.f81597a.c(j15 - this.f81598b);
        }

        public z0 d() {
            return this.f81597a;
        }

        @Override // h8.z0
        public boolean f() {
            return this.f81597a.f();
        }
    }

    public g1(b0 b0Var, long j15) {
        this.f81594a = b0Var;
        this.f81595b = j15;
    }

    @Override // h8.b0, h8.a1
    public long a() {
        long jA = this.f81594a.a();
        if (jA == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jA + this.f81595b;
    }

    @Override // h8.b0, h8.a1
    public boolean b() {
        return this.f81594a.b();
    }

    @Override // h8.b0, h8.a1
    public boolean c(b2 b2Var) {
        return this.f81594a.c(b2Var.a().f(b2Var.f4250a - this.f81595b).d());
    }

    @Override // h8.b0, h8.a1
    public long d() {
        long jD = this.f81594a.d();
        if (jD == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jD + this.f81595b;
    }

    @Override // h8.b0, h8.a1
    public void e(long j15) {
        this.f81594a.e(j15 - this.f81595b);
    }

    @Override // h8.b0.a
    public void f(b0 b0Var) {
        ((b0.a) zj.p.q(this.f81596c)).f(this);
    }

    @Override // h8.b0
    public long h(long j15, f3 f3Var) {
        return this.f81594a.h(j15 - this.f81595b, f3Var) + this.f81595b;
    }

    @Override // h8.b0
    public long i(long j15) {
        return this.f81594a.i(j15 - this.f81595b) + this.f81595b;
    }

    public b0 j() {
        return this.f81594a;
    }

    @Override // h8.b0
    public long k() {
        long jK = this.f81594a.k();
        if (jK == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jK + this.f81595b;
    }

    @Override // h8.a1.a
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void g(b0 b0Var) {
        ((b0.a) zj.p.q(this.f81596c)).g(this);
    }

    @Override // h8.b0
    public long n(long j15) {
        long jN = this.f81594a.n(j15 == Long.MIN_VALUE ? Long.MIN_VALUE : j15 - this.f81595b);
        if (jN == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jN + this.f81595b;
    }

    @Override // h8.b0
    public void p(b0.a aVar, long j15) {
        this.f81596c = aVar;
        this.f81594a.p(this, j15 - this.f81595b);
    }

    @Override // h8.b0
    public void q() {
        this.f81594a.q();
    }

    @Override // h8.b0
    public j1 t() {
        return this.f81594a.t();
    }

    @Override // h8.b0
    public long u(j8.r[] rVarArr, boolean[] zArr, z0[] z0VarArr, boolean[] zArr2, long j15) {
        z0[] z0VarArr2 = new z0[z0VarArr.length];
        int i15 = 0;
        while (true) {
            z0 z0VarD = null;
            if (i15 >= z0VarArr.length) {
                break;
            }
            a aVar = (a) z0VarArr[i15];
            if (aVar != null) {
                z0VarD = aVar.d();
            }
            z0VarArr2[i15] = z0VarD;
            i15++;
        }
        long jU = this.f81594a.u(rVarArr, zArr, z0VarArr2, zArr2, j15 - this.f81595b);
        for (int i16 = 0; i16 < z0VarArr.length; i16++) {
            z0 z0Var = z0VarArr2[i16];
            if (z0Var == null) {
                z0VarArr[i16] = null;
            } else {
                z0 z0Var2 = z0VarArr[i16];
                if (z0Var2 == null || ((a) z0Var2).d() != z0Var) {
                    z0VarArr[i16] = new a(z0Var, this.f81595b);
                }
            }
        }
        return jU + this.f81595b;
    }

    @Override // h8.b0
    public void w(long j15, boolean z15) {
        this.f81594a.w(j15 - this.f81595b, z15);
    }
}
