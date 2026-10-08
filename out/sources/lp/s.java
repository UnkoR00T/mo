package lp;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements hp.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bp.d f119167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f119168b = Float.NEGATIVE_INFINITY;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f119169c = Float.NEGATIVE_INFINITY;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f119170d = -1;

    s() {
        bp.d dVar = new bp.d();
        this.f119167a = dVar;
        dVar.Y4(bp.i.f20732e9, bp.i.J3);
    }

    private void A(int i15, boolean z15) {
        int iE = e();
        B(z15 ? i15 | iE : (~i15) & iE);
    }

    private boolean p(int i15) {
        return (i15 & e()) != 0;
    }

    public void B(int i15) {
        this.f119167a.W4(bp.i.D3, i15);
        this.f119170d = i15;
    }

    public void C(hp.g gVar) {
        this.f119167a.Y4(bp.i.I3, gVar != null ? gVar.b() : null);
    }

    public void D(String str) {
        this.f119167a.Y4(bp.i.K3, str != null ? new bp.p(str) : null);
    }

    public void E(hp.h hVar) {
        this.f119167a.Z4(bp.i.M3, hVar);
    }

    public void F(String str) {
        this.f119167a.Y4(bp.i.P3, str != null ? bp.i.J3(str) : null);
    }

    public void G(float f15) {
        this.f119167a.U4(bp.i.R3, f15);
    }

    public void H(boolean z15) {
        A(64, z15);
    }

    public void I(float f15) {
        this.f119167a.U4(bp.i.F4, f15);
    }

    public void J(boolean z15) {
        A(32, z15);
    }

    public void K(boolean z15) {
        A(8, z15);
    }

    public void L(boolean z15) {
        A(2, z15);
    }

    public void M(float f15) {
        this.f119167a.U4(bp.i.f20811m8, f15);
    }

    public void N(boolean z15) {
        A(4, z15);
    }

    public void O(float f15) {
        this.f119167a.U4(bp.i.M9, f15);
        this.f119168b = f15;
    }

    public float a() {
        return this.f119167a.u4(bp.i.R, 0.0f);
    }

    @Override // hp.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public bp.d D1() {
        return this.f119167a;
    }

    public float c() {
        if (this.f119169c == Float.NEGATIVE_INFINITY) {
            this.f119169c = Math.abs(this.f119167a.u4(bp.i.Y0, 0.0f));
        }
        return this.f119169c;
    }

    public float d() {
        return this.f119167a.u4(bp.i.f20795l2, 0.0f);
    }

    public int e() {
        if (this.f119170d == -1) {
            this.f119170d = this.f119167a.y4(bp.i.D3, 0);
        }
        return this.f119170d;
    }

    public hp.g f() {
        bp.a aVarJ4 = this.f119167a.j4(bp.i.I3);
        if (aVarJ4 != null) {
            return new hp.g(aVarJ4);
        }
        return null;
    }

    public String g() {
        bp.p pVar = (bp.p) this.f119167a.p4(bp.i.K3);
        if (pVar != null) {
            return pVar.J3();
        }
        return null;
    }

    public hp.h h() {
        bp.b bVarP4 = this.f119167a.p4(bp.i.L3);
        if (bVarP4 instanceof bp.o) {
            return new hp.h((bp.o) bVarP4);
        }
        return null;
    }

    public hp.h i() {
        bp.b bVarP4 = this.f119167a.p4(bp.i.M3);
        if (bVarP4 instanceof bp.o) {
            return new hp.h((bp.o) bVarP4);
        }
        return null;
    }

    public hp.h j() {
        bp.b bVarP4 = this.f119167a.p4(bp.i.N3);
        if (bVarP4 instanceof bp.o) {
            return new hp.h((bp.o) bVarP4);
        }
        return null;
    }

    public String k() {
        bp.b bVarP4 = this.f119167a.p4(bp.i.P3);
        if (bVarP4 instanceof bp.i) {
            return ((bp.i) bVarP4).A3();
        }
        return null;
    }

    public float l() {
        return this.f119167a.u4(bp.i.R3, 0.0f);
    }

    public float m() {
        return this.f119167a.u4(bp.i.E5, 0.0f);
    }

    public w n() {
        bp.d dVar = (bp.d) this.f119167a.p4(bp.i.f20884t8);
        if (dVar == null) {
            return null;
        }
        byte[] bArrI3 = ((bp.p) dVar.p4(bp.i.H6)).i3();
        if (bArrI3.length >= 12) {
            return new w(bArrI3);
        }
        return null;
    }

    public boolean o() {
        return p(1);
    }

    public boolean q() {
        return p(64);
    }

    public boolean r() {
        return p(2);
    }

    public boolean s() {
        return p(4);
    }

    public void t(float f15) {
        this.f119167a.U4(bp.i.R, f15);
    }

    public void u(float f15) {
        this.f119167a.U4(bp.i.f20854r0, f15);
    }

    public void v(hp.h hVar) {
        this.f119167a.Z4(bp.i.f20823o1, hVar);
    }

    public void w(float f15) {
        this.f119167a.U4(bp.i.Y0, f15);
        this.f119169c = f15;
    }

    public void x(String str) {
        this.f119167a.Y4(bp.i.f20764i1, str != null ? new bp.p(str) : null);
    }

    public void y(float f15) {
        this.f119167a.U4(bp.i.f20795l2, f15);
    }

    public void z(boolean z15) {
        A(1, z15);
    }

    public s(bp.d dVar) {
        this.f119167a = dVar;
    }
}
