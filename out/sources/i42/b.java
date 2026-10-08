package i42;

import d1.m3;
import d1.q3;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.n6;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f89138a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<f1.e, p076m2.r, Integer, i0> f89139b = y2.m.b(-1078529950, false, new er.q() { // from class: i42.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return b.c((f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1078529950, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.dashboard.ComposableSingletons$PaymentsDashboardScreenKt.lambda$-1078529950.<anonymous> (PaymentsDashboardScreen.kt:123)");
            }
            f3.m mVarF = androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null);
            w0 w0VarB = m3.b(d1.i.f39152a.e(), f3.c.INSTANCE.i(), rVar, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarF);
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
            n6.i(rVarC, w0VarB, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            q3 q3Var = q3.f39261a;
            x70.f.g(x70.a.C5796a.f217280c, rVar, x70.a.C5796a.f217281d);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final er.q<f1.e, p076m2.r, Integer, i0> b() {
        return f89139b;
    }
}
