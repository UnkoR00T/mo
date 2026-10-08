package st;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b0 extends e1 {
    @Override // st.t0
    public List<d2> R0() {
        return c1().R0();
    }

    @Override // st.t0
    public t1 S0() {
        return c1().S0();
    }

    @Override // st.t0
    public x1 T0() {
        return c1().T0();
    }

    @Override // st.t0
    public boolean U0() {
        return c1().U0();
    }

    protected abstract e1 c1();

    @Override // st.o2
    public e1 d1(tt.g gVar) {
        return e1((e1) gVar.a(c1()));
    }

    public abstract b0 e1(e1 e1Var);

    @Override // st.t0
    public lt.k r() {
        return c1().r();
    }
}
