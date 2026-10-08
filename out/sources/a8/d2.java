package a8;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h8.b0 f4339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h8.z0[] f4341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e2 f4346h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4347i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean[] f4348j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a3[] f4349k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final j8.x f4350l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final u2 f4351m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private d2 f4352n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private h8.j1 f4353o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private j8.y f4354p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f4355q;

    interface a {
        d2 a(e2 e2Var, long j15);
    }

    public d2(a3[] a3VarArr, long j15, j8.x xVar, k8.b bVar, u2 u2Var, e2 e2Var, j8.y yVar, long j16) {
        this.f4349k = a3VarArr;
        this.f4355q = j15;
        this.f4350l = xVar;
        this.f4351m = u2Var;
        h8.c0.b bVar2 = e2Var.f4370a;
        this.f4340b = bVar2.f81468a;
        this.f4346h = e2Var;
        this.f4342d = j16;
        this.f4353o = h8.j1.f81614d;
        this.f4354p = yVar;
        this.f4341c = new h8.z0[a3VarArr.length];
        this.f4348j = new boolean[a3VarArr.length];
        this.f4339a = f(bVar2, u2Var, bVar, e2Var.f4371b, e2Var.f4374e, e2Var.f4376g);
    }

    private void c(h8.z0[] z0VarArr) {
        int i15 = 0;
        while (true) {
            a3[] a3VarArr = this.f4349k;
            if (i15 >= a3VarArr.length) {
                return;
            }
            if (a3VarArr[i15].g() == -2 && this.f4354p.c(i15)) {
                z0VarArr[i15] = new h8.r();
            }
            i15++;
        }
    }

    private static h8.b0 f(h8.c0.b bVar, u2 u2Var, k8.b bVar2, long j15, long j16, boolean z15) {
        h8.b0 b0VarH = u2Var.h(bVar, bVar2, j15);
        return j16 != -9223372036854775807L ? new h8.d(b0VarH, !z15, 0L, j16) : b0VarH;
    }

    private void g() {
        if (!u()) {
            return;
        }
        int i15 = 0;
        while (true) {
            j8.y yVar = this.f4354p;
            if (i15 >= yVar.f100151a) {
                return;
            }
            boolean zC = yVar.c(i15);
            j8.r rVar = this.f4354p.f100153c[i15];
            if (zC && rVar != null) {
                rVar.c();
            }
            i15++;
        }
    }

    private void h(h8.z0[] z0VarArr) {
        int i15 = 0;
        while (true) {
            a3[] a3VarArr = this.f4349k;
            if (i15 >= a3VarArr.length) {
                return;
            }
            if (a3VarArr[i15].g() == -2) {
                z0VarArr[i15] = null;
            }
            i15++;
        }
    }

    private void i() {
        if (!u()) {
            return;
        }
        int i15 = 0;
        while (true) {
            j8.y yVar = this.f4354p;
            if (i15 >= yVar.f100151a) {
                return;
            }
            boolean zC = yVar.c(i15);
            j8.r rVar = this.f4354p.f100153c[i15];
            if (zC && rVar != null) {
                rVar.a();
            }
            i15++;
        }
    }

    private boolean u() {
        return this.f4352n == null;
    }

    private static void y(u2 u2Var, h8.b0 b0Var) {
        try {
            if (b0Var instanceof h8.d) {
                u2Var.z(((h8.d) b0Var).f81488a);
            } else {
                u2Var.z(b0Var);
            }
        } catch (RuntimeException e15) {
            w7.t.d("MediaPeriodHolder", "Period release failed.", e15);
        }
    }

    public void A(d2 d2Var) {
        if (d2Var == this.f4352n) {
            return;
        }
        g();
        this.f4352n = d2Var;
        i();
    }

    public void B(long j15) {
        this.f4355q = j15;
    }

    public long C(long j15) {
        return j15 - m();
    }

    public long D(long j15) {
        return j15 + m();
    }

    public void E() {
        h8.b0 b0Var = this.f4339a;
        if (b0Var instanceof h8.d) {
            long j15 = this.f4346h.f4374e;
            if (j15 == -9223372036854775807L) {
                j15 = Long.MIN_VALUE;
            }
            ((h8.d) b0Var).A(0L, j15);
        }
    }

    public long a(j8.y yVar, long j15, boolean z15) {
        return b(yVar, j15, z15, new boolean[this.f4349k.length]);
    }

    public long b(j8.y yVar, long j15, boolean z15, boolean[] zArr) {
        int i15 = 0;
        while (true) {
            boolean z16 = true;
            if (i15 >= yVar.f100151a) {
                break;
            }
            boolean[] zArr2 = this.f4348j;
            if (z15 || !yVar.b(this.f4354p, i15)) {
                z16 = false;
            }
            zArr2[i15] = z16;
            i15++;
        }
        h(this.f4341c);
        g();
        this.f4354p = yVar;
        i();
        long jU = this.f4339a.u(yVar.f100153c, this.f4348j, this.f4341c, zArr, j15);
        c(this.f4341c);
        this.f4345g = false;
        int i16 = 0;
        while (true) {
            h8.z0[] z0VarArr = this.f4341c;
            if (i16 >= z0VarArr.length) {
                return jU;
            }
            if (z0VarArr[i16] != null) {
                zj.p.w(yVar.c(i16));
                if (this.f4349k[i16].g() != -2) {
                    this.f4345g = true;
                }
            } else {
                zj.p.w(yVar.f100153c[i16] == null);
            }
            i16++;
        }
    }

    public boolean d(e2 e2Var) {
        if (!g2.e(this.f4346h.f4375f, e2Var.f4375f)) {
            return false;
        }
        e2 e2Var2 = this.f4346h;
        return e2Var2.f4371b == e2Var.f4371b && e2Var2.f4370a.equals(e2Var.f4370a);
    }

    public void e(b2 b2Var) {
        zj.p.w(u());
        this.f4339a.c(b2Var);
    }

    public long j() {
        if (!this.f4344f) {
            return this.f4346h.f4371b;
        }
        long jD = this.f4345g ? this.f4339a.d() : Long.MIN_VALUE;
        return jD == Long.MIN_VALUE ? this.f4346h.f4375f : jD;
    }

    public d2 k() {
        return this.f4352n;
    }

    public long l() {
        if (this.f4344f) {
            return this.f4339a.a();
        }
        return 0L;
    }

    public long m() {
        return this.f4355q;
    }

    public long n() {
        return this.f4346h.f4371b + this.f4355q;
    }

    public h8.j1 o() {
        return this.f4353o;
    }

    public j8.y p() {
        return this.f4354p;
    }

    public void q(float f15, t7.e0 e0Var, boolean z15) {
        this.f4344f = true;
        this.f4353o = this.f4339a.t();
        j8.y yVarZ = z(f15, e0Var, z15);
        e2 e2Var = this.f4346h;
        long jMax = e2Var.f4371b;
        long j15 = e2Var.f4375f;
        if (j15 != -9223372036854775807L && jMax >= j15) {
            jMax = Math.max(0L, j15 - 1);
        }
        long jA = a(yVarZ, jMax, false);
        long j16 = this.f4355q;
        e2 e2Var2 = this.f4346h;
        this.f4355q = j16 + (e2Var2.f4371b - jA);
        this.f4346h = e2Var2.b(jA, e2Var2.f4372c);
    }

    public boolean r() {
        try {
            if (this.f4344f) {
                for (h8.z0 z0Var : this.f4341c) {
                    if (z0Var != null) {
                        z0Var.a();
                    }
                }
            } else {
                this.f4339a.q();
            }
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    public boolean s() {
        if (this.f4344f) {
            return !this.f4345g || this.f4339a.d() == Long.MIN_VALUE;
        }
        return false;
    }

    public boolean t() {
        if (this.f4344f) {
            return s() || j() - this.f4346h.f4371b >= this.f4342d;
        }
        return false;
    }

    public void v(h8.b0.a aVar, long j15) {
        this.f4343e = true;
        this.f4339a.p(aVar, j15);
    }

    public void w(long j15) {
        zj.p.w(u());
        if (this.f4344f) {
            this.f4339a.e(C(j15));
        }
    }

    public void x() {
        g();
        y(this.f4351m, this.f4339a);
    }

    public j8.y z(float f15, t7.e0 e0Var, boolean z15) {
        j8.y yVarJ = this.f4350l.j(this.f4349k, o(), this.f4346h.f4370a, e0Var);
        for (int i15 = 0; i15 < yVarJ.f100151a; i15++) {
            boolean z16 = true;
            if (yVarJ.c(i15)) {
                if (yVarJ.f100153c[i15] == null && this.f4349k[i15].g() != -2) {
                    z16 = false;
                }
                zj.p.w(z16);
            } else {
                zj.p.w(yVarJ.f100153c[i15] == null);
            }
        }
        for (j8.r rVar : yVarJ.f100153c) {
            if (rVar != null) {
                rVar.f(f15);
                rVar.j(z15);
            }
        }
        return yVarJ;
    }
}
