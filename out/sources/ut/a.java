package ut;

import java.util.List;
import pq.e1;
import pq.v;
import st.g2;
import st.i2;
import vr.f0;
import vr.h1;
import vr.i0;
import vr.t;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends yr.k {
    /* JADX WARN: Illegal instructions before constructor call */
    public a(zs.f fVar) {
        l lVar = l.f201331a;
        i0 i0VarI = lVar.i();
        f0 f0Var = f0.OPEN;
        vr.f fVar2 = vr.f.CLASS;
        List listN = v.n();
        h1 h1Var = h1.f208052a;
        super(i0VarI, fVar, f0Var, fVar2, listN, h1Var, false, rt.f.f175955e);
        yr.i iVarT1 = yr.i.t1(this, wr.h.f214542p0.b(), true, h1Var);
        iVarT1.w1(v.n(), t.f208080e);
        lt.k kVarB = l.b(h.SCOPE_FOR_ERROR_CLASS, iVarT1.getName().toString(), "");
        k kVar = k.S0;
        iVarT1.m1(new i(lVar.e(kVar, new String[0]), kVarB, kVar, null, false, new String[0], 24, null));
        Q0(kVarB, e1.d(iVarT1), iVarT1);
    }

    @Override // yr.a, vr.j1
    /* JADX INFO: renamed from: M0 */
    public vr.e c(i2 i2Var) {
        return this;
    }

    @Override // yr.a, yr.z
    public lt.k m0(g2 g2Var, tt.g gVar) {
        return l.b(h.SCOPE_FOR_ERROR_CLASS, getName().toString(), g2Var.toString());
    }

    @Override // yr.k
    public String toString() {
        return getName().e();
    }
}
