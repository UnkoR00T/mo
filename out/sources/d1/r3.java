package d1;

import p071kotlin.Metadata;
import p076m2.n6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lf3/m;", "modifier", "Loq/i0;", "a", "(Lf3/m;Lm2/r;I)V", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r3 {
    public static final void a(f3.m mVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-72882467, i15, -1, "androidx.compose.foundation.layout.Spacer (Spacer.kt:37)");
        }
        t3 t3Var = t3.f39302a;
        int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
        f3.m mVarE = f3.j.e(rVar, mVar);
        p076m2.e0 e0VarT = rVar.t();
        androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
        er.a<androidx.compose.ui.node.c> aVarB = companion.b();
        if (rVar.l() == null) {
            p076m2.m.d();
        }
        rVar.K();
        if (rVar.getInserting()) {
            rVar.H(aVarB);
        } else {
            rVar.u();
        }
        p076m2.r rVarC = n6.c(rVar);
        n6.i(rVarC, t3Var, companion.d());
        n6.i(rVarC, e0VarT, companion.f());
        n6.g(rVarC, companion.a());
        n6.i(rVarC, mVarE, companion.e());
        n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
        rVar.x();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
    }
}
