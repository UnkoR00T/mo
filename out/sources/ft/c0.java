package ft;

import st.e1;
import st.t0;
import vr.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends f0<Integer> {
    public c0(int i15) {
        super(Integer.valueOf(i15));
    }

    @Override // ft.g
    public t0 a(i0 i0Var) {
        e1 e1VarT;
        vr.e eVarB = vr.y.b(i0Var, sr.p.a.F0);
        return (eVarB == null || (e1VarT = eVarB.t()) == null) ? ut.l.d(ut.k.W0, "UInt") : e1VarT;
    }

    @Override // ft.g
    public String toString() {
        return b().intValue() + ".toUInt()";
    }
}
