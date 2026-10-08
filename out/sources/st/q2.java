package st;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q2 extends t0 {
    public q2() {
        super(null);
    }

    @Override // st.t0
    public List<d2> R0() {
        return X0().R0();
    }

    @Override // st.t0
    public t1 S0() {
        return X0().S0();
    }

    @Override // st.t0
    public x1 T0() {
        return X0().T0();
    }

    @Override // st.t0
    public boolean U0() {
        return X0().U0();
    }

    @Override // st.t0
    public final o2 W0() {
        t0 t0VarX0 = X0();
        while (t0VarX0 instanceof q2) {
            t0VarX0 = ((q2) t0VarX0).X0();
        }
        return (o2) t0VarX0;
    }

    protected abstract t0 X0();

    public abstract boolean Y0();

    @Override // st.t0
    public lt.k r() {
        return X0().r();
    }

    public String toString() {
        return Y0() ? X0().toString() : "<Not computed yet>";
    }
}
