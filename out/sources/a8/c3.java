package a8;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
class c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z2 f4329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f4330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z2 f4331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f4332d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f4333e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f4334f = false;

    public c3(z2 z2Var, z2 z2Var2, int i15) {
        this.f4329a = z2Var;
        this.f4330b = i15;
        this.f4331c = z2Var2;
    }

    private boolean A() {
        return this.f4332d == 3;
    }

    private void C(z2 z2Var, h8.z0 z0Var, i iVar, long j15, boolean z15) {
        if (z(z2Var)) {
            if (z0Var != z2Var.j()) {
                d(z2Var, iVar);
            } else if (z15) {
                z2Var.L(j15, true);
            }
        }
    }

    private void E(boolean z15) {
        if (z15) {
            if (this.f4333e) {
                this.f4329a.reset();
                this.f4333e = false;
                return;
            }
            return;
        }
        if (this.f4334f) {
            ((z2) zj.p.q(this.f4331c)).reset();
            this.f4334f = false;
        }
    }

    private int K(z2 z2Var, d2 d2Var, j8.y yVar, i iVar) {
        if (z2Var == null || !z(z2Var) || ((z2Var == this.f4329a && w()) || (z2Var == this.f4331c && A()))) {
            return 1;
        }
        h8.z0 z0VarJ = z2Var.j();
        h8.z0[] z0VarArr = d2Var.f4341c;
        int i15 = this.f4330b;
        boolean z15 = z0VarJ != z0VarArr[i15];
        boolean zC = yVar.c(i15);
        if (zC && !z15) {
            return 1;
        }
        if (!z2Var.E()) {
            z2Var.q(i(yVar.f100153c[this.f4330b]), (h8.z0) zj.p.q(d2Var.f4341c[this.f4330b]), d2Var.n(), d2Var.m(), d2Var.f4346h.f4370a);
            return 3;
        }
        if (!z2Var.e()) {
            return 0;
        }
        d(z2Var, iVar);
        if (!zC || u()) {
            E(z2Var == this.f4329a);
        }
        return 1;
    }

    private void P(z2 z2Var, long j15) {
        z2Var.s();
        if (z2Var instanceof i8.i) {
            ((i8.i) z2Var).L0(j15);
        }
    }

    private void a0(boolean z15) {
        if (z15) {
            ((z2) zj.p.q(this.f4331c)).A(17, this.f4329a);
        } else {
            this.f4329a.A(17, zj.p.q(this.f4331c));
        }
    }

    private void d(z2 z2Var, i iVar) {
        zj.p.w(this.f4329a == z2Var || this.f4331c == z2Var);
        if (z(z2Var)) {
            iVar.a(z2Var);
            g(z2Var);
            z2Var.c();
        }
    }

    private void g(z2 z2Var) {
        if (z2Var.getState() == 2) {
            z2Var.stop();
        }
    }

    private static t7.p[] i(j8.r rVar) {
        int length = rVar != null ? rVar.length() : 0;
        t7.p[] pVarArr = new t7.p[length];
        for (int i15 = 0; i15 < length; i15++) {
            pVarArr[i15] = ((j8.r) zj.p.q(rVar)).d(i15);
        }
        return pVarArr;
    }

    private z2 l(d2 d2Var) {
        if (d2Var != null && d2Var.f4341c[this.f4330b] != null) {
            if (this.f4329a.j() == d2Var.f4341c[this.f4330b]) {
                return this.f4329a;
            }
            z2 z2Var = this.f4331c;
            if (z2Var != null && z2Var.j() == d2Var.f4341c[this.f4330b]) {
                return this.f4331c;
            }
        }
        return null;
    }

    private boolean p(d2 d2Var, z2 z2Var) {
        if (z2Var == null) {
            return true;
        }
        h8.z0 z0Var = d2Var.f4341c[this.f4330b];
        if (z2Var.j() == null || (z2Var.j() == z0Var && (z0Var == null || z2Var.n() || q(z2Var, d2Var)))) {
            return true;
        }
        d2 d2VarK = d2Var.k();
        return d2VarK != null && d2VarK.f4341c[this.f4330b] == z2Var.j();
    }

    private boolean q(z2 z2Var, d2 d2Var) {
        d2 d2VarK = d2Var.k();
        if (d2Var.f4346h.f4377h && d2VarK != null && d2VarK.f4344f) {
            return (z2Var instanceof i8.i) || (z2Var instanceof g8.c) || z2Var.R() >= d2VarK.n();
        }
        return false;
    }

    private boolean w() {
        int i15 = this.f4332d;
        return i15 == 2 || i15 == 4;
    }

    private static boolean z(z2 z2Var) {
        return z2Var.getState() != 0;
    }

    public void B(h8.z0 z0Var, i iVar, long j15, boolean z15) {
        C(this.f4329a, z0Var, iVar, j15, z15);
        z2 z2Var = this.f4331c;
        if (z2Var != null) {
            C(z2Var, z0Var, iVar, j15, z15);
        }
    }

    public void D() {
        int i15 = this.f4332d;
        if (i15 == 3 || i15 == 4) {
            a0(i15 == 4);
            this.f4332d = this.f4332d != 4 ? 1 : 0;
        } else if (i15 == 2) {
            this.f4332d = 0;
        }
    }

    public void F(j8.y yVar, j8.y yVar2, long j15) {
        int i15;
        boolean zC = yVar.c(this.f4330b);
        boolean zC2 = yVar2.c(this.f4330b);
        z2 z2Var = (this.f4331c == null || (i15 = this.f4332d) == 3 || (i15 == 0 && z(this.f4329a))) ? this.f4329a : (z2) zj.p.q(this.f4331c);
        if (!zC || z2Var.E()) {
            return;
        }
        boolean z15 = m() == -2;
        b3[] b3VarArr = yVar.f100152b;
        int i16 = this.f4330b;
        b3 b3Var = b3VarArr[i16];
        b3 b3Var2 = yVar2.f100152b[i16];
        if (!zC2 || !Objects.equals(b3Var2, b3Var) || z15 || u()) {
            P(z2Var, j15);
        }
    }

    public void G(d2 d2Var) {
        ((z2) zj.p.q(l(d2Var))).B();
    }

    public void H() {
        this.f4329a.b();
        this.f4333e = false;
        z2 z2Var = this.f4331c;
        if (z2Var != null) {
            z2Var.b();
            this.f4334f = false;
        }
    }

    public void I(long j15, long j16) {
        if (z(this.f4329a)) {
            this.f4329a.h(j15, j16);
        }
        z2 z2Var = this.f4331c;
        if (z2Var == null || !z(z2Var)) {
            return;
        }
        this.f4331c.h(j15, j16);
    }

    public int J(d2 d2Var, j8.y yVar, i iVar) {
        int iK = K(this.f4329a, d2Var, yVar, iVar);
        return iK == 1 ? K(this.f4331c, d2Var, yVar, iVar) : iK;
    }

    public void L() {
        if (!z(this.f4329a)) {
            E(true);
        }
        z2 z2Var = this.f4331c;
        if (z2Var == null || z(z2Var)) {
            return;
        }
        E(false);
    }

    public void M(d2 d2Var, long j15, boolean z15) {
        z2 z2VarL = l(d2Var);
        if (z2VarL != null) {
            z2VarL.L(j15, z15);
        }
    }

    public void N(long j15) {
        int i15;
        if (z(this.f4329a) && (i15 = this.f4332d) != 4 && i15 != 2) {
            P(this.f4329a, j15);
        }
        z2 z2Var = this.f4331c;
        if (z2Var == null || !z(z2Var) || this.f4332d == 3) {
            return;
        }
        P(this.f4331c, j15);
    }

    public void O(d2 d2Var, long j15) {
        P((z2) zj.p.q(l(d2Var)), j15);
    }

    public void Q(float f15, float f16) {
        this.f4329a.N(f15, f16);
        z2 z2Var = this.f4331c;
        if (z2Var != null) {
            z2Var.N(f15, f16);
        }
    }

    public void R(e3 e3Var) {
        this.f4329a.A(18, e3Var);
        z2 z2Var = this.f4331c;
        if (z2Var != null) {
            z2Var.A(18, e3Var);
        }
    }

    public void S(t7.e0 e0Var) {
        this.f4329a.l(e0Var);
        z2 z2Var = this.f4331c;
        if (z2Var != null) {
            z2Var.l(e0Var);
        }
    }

    public void T(m8.t tVar) {
        if (m() == 2 || m() == 4) {
            this.f4329a.A(7, tVar);
            z2 z2Var = this.f4331c;
            if (z2Var != null) {
                z2Var.A(7, tVar);
            }
        }
    }

    public void U(Object obj) {
        if (m() != 2) {
            return;
        }
        int i15 = this.f4332d;
        if (i15 == 4 || i15 == 1) {
            ((z2) zj.p.q(this.f4331c)).A(1, obj);
        } else {
            this.f4329a.A(1, obj);
        }
    }

    public void V(float f15) {
        if (m() != 1) {
            return;
        }
        this.f4329a.A(2, Float.valueOf(f15));
        z2 z2Var = this.f4331c;
        if (z2Var != null) {
            z2Var.A(2, Float.valueOf(f15));
        }
    }

    public void W() {
        if (this.f4329a.getState() == 1 && this.f4332d != 4) {
            this.f4329a.start();
            return;
        }
        z2 z2Var = this.f4331c;
        if (z2Var == null || z2Var.getState() != 1 || this.f4332d == 3) {
            return;
        }
        this.f4331c.start();
    }

    public void X() {
        int i15;
        zj.p.w(!u());
        if (z(this.f4329a)) {
            i15 = 3;
        } else {
            z2 z2Var = this.f4331c;
            i15 = (z2Var == null || !z(z2Var)) ? 2 : 4;
        }
        this.f4332d = i15;
    }

    public void Y() {
        if (z(this.f4329a)) {
            g(this.f4329a);
        }
        z2 z2Var = this.f4331c;
        if (z2Var == null || !z(z2Var)) {
            return;
        }
        g(this.f4331c);
    }

    public boolean Z(d2 d2Var, long j15) {
        z2 z2VarL = l(d2Var);
        return z2VarL != null && z2VarL.F(j15);
    }

    public boolean a(d2 d2Var) {
        z2 z2VarL = l(d2Var);
        return z2VarL == null || z2VarL.n() || z2VarL.f() || z2VarL.e();
    }

    public void b(i iVar) {
        d(this.f4329a, iVar);
        z2 z2Var = this.f4331c;
        if (z2Var != null) {
            boolean z15 = z(z2Var) && this.f4332d != 3;
            d(this.f4331c, iVar);
            E(false);
            if (z15) {
                a0(true);
            }
        }
        this.f4332d = 0;
    }

    public void c(i iVar) {
        if (u()) {
            int i15 = this.f4332d;
            boolean z15 = i15 == 4 || i15 == 2;
            int i16 = i15 != 4 ? 0 : 1;
            d(z15 ? this.f4329a : (z2) zj.p.q(this.f4331c), iVar);
            E(z15);
            this.f4332d = i16;
        }
    }

    public void e(b3 b3Var, j8.r rVar, h8.z0 z0Var, long j15, boolean z15, boolean z16, long j16, long j17, h8.c0.b bVar, i iVar) throws w {
        t7.p[] pVarArrI = i(rVar);
        int i15 = this.f4332d;
        if (i15 == 0 || i15 == 2 || i15 == 4) {
            this.f4333e = true;
            this.f4329a.G(b3Var, pVarArrI, z0Var, j15, z15, z16, j16, j17, bVar);
            iVar.b(this.f4329a);
        } else {
            this.f4334f = true;
            ((z2) zj.p.q(this.f4331c)).G(b3Var, pVarArrI, z0Var, j15, z15, z16, j16, j17, bVar);
            iVar.b(this.f4331c);
        }
    }

    public void f() {
        if (z(this.f4329a)) {
            this.f4329a.r();
            return;
        }
        z2 z2Var = this.f4331c;
        if (z2Var == null || !z(z2Var)) {
            return;
        }
        this.f4331c.r();
    }

    public int h() {
        boolean z15 = z(this.f4329a);
        z2 z2Var = this.f4331c;
        return (z15 ? 1 : 0) + ((z2Var == null || !z(z2Var)) ? 0 : 1);
    }

    public long j(long j15, long j16) {
        long J = z(this.f4329a) ? this.f4329a.J(j15, j16) : Long.MAX_VALUE;
        z2 z2Var = this.f4331c;
        return (z2Var == null || !z(z2Var)) ? J : Math.min(J, this.f4331c.J(j15, j16));
    }

    public long k(d2 d2Var) {
        z2 z2VarL = l(d2Var);
        Objects.requireNonNull(z2VarL);
        return z2VarL.R();
    }

    public int m() {
        return this.f4329a.g();
    }

    public void n(int i15, Object obj, d2 d2Var) {
        ((z2) zj.p.q(l(d2Var))).A(i15, obj);
    }

    public boolean o(d2 d2Var) {
        return p(d2Var, this.f4329a) && p(d2Var, this.f4331c);
    }

    public boolean r(d2 d2Var) {
        return ((z2) zj.p.q(l(d2Var))).n();
    }

    public boolean s() {
        return this.f4331c != null;
    }

    public boolean t() {
        boolean zE = z(this.f4329a) ? this.f4329a.e() : true;
        z2 z2Var = this.f4331c;
        return (z2Var == null || !z(z2Var)) ? zE : zE & this.f4331c.e();
    }

    public boolean u() {
        return w() || A();
    }

    public boolean v(d2 d2Var) {
        return (w() && l(d2Var) == this.f4329a) || (A() && l(d2Var) == this.f4331c);
    }

    public boolean x(d2 d2Var) {
        return l(d2Var) != null;
    }

    public boolean y() {
        int i15 = this.f4332d;
        return (i15 == 0 || i15 == 2 || i15 == 4) ? z(this.f4329a) : z((z2) zj.p.q(this.f4331c));
    }
}
