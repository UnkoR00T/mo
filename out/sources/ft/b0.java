package ft;

import st.e1;
import st.t0;
import vr.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends f0<Byte> {
    public b0(byte b15) {
        super(Byte.valueOf(b15));
    }

    @Override // ft.g
    public t0 a(i0 i0Var) {
        e1 e1VarT;
        vr.e eVarB = vr.y.b(i0Var, sr.p.a.D0);
        return (eVarB == null || (e1VarT = eVarB.t()) == null) ? ut.l.d(ut.k.W0, "UByte") : e1VarT;
    }

    @Override // ft.g
    public String toString() {
        return b().intValue() + ".toUByte()";
    }
}
