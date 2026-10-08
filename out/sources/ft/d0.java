package ft;

import st.e1;
import st.t0;
import vr.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends f0<Long> {
    public d0(long j15) {
        super(Long.valueOf(j15));
    }

    @Override // ft.g
    public t0 a(i0 i0Var) {
        e1 e1VarT;
        vr.e eVarB = vr.y.b(i0Var, sr.p.a.G0);
        return (eVarB == null || (e1VarT = eVarB.t()) == null) ? ut.l.d(ut.k.W0, "ULong") : e1VarT;
    }

    @Override // ft.g
    public String toString() {
        return b().longValue() + ".toULong()";
    }
}
