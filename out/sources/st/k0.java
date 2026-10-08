package st;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k0 extends o2 implements wt.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e1 f184062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e1 f184063c;

    public k0(e1 e1Var, e1 e1Var2) {
        super(null);
        this.f184062b = e1Var;
        this.f184063c = e1Var2;
    }

    @Override // st.t0
    public List<d2> R0() {
        return a1().R0();
    }

    @Override // st.t0
    public t1 S0() {
        return a1().S0();
    }

    @Override // st.t0
    public x1 T0() {
        return a1().T0();
    }

    @Override // st.t0
    public boolean U0() {
        return a1().U0();
    }

    public abstract e1 a1();

    public final e1 b1() {
        return this.f184062b;
    }

    public final e1 c1() {
        return this.f184063c;
    }

    public abstract String d1(ct.n nVar, ct.y yVar);

    @Override // st.t0
    public lt.k r() {
        return a1().r();
    }

    public String toString() {
        return ct.n.f37669k.S(this);
    }
}
