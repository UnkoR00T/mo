package u60;

import d1.a3;
import d1.x;
import er.q;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.e0;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import y2.m;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f195777a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static q<f1.e, r, Integer, i0> f195778b = m.b(1243776059, false, new q() { // from class: u60.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return b.c((f1.e) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(f1.e eVar, r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(1243776059, i15, -1, "pl.gov.coi.common.ui.paging.ComposableSingletons$PagingListKt.lambda$1243776059.<anonymous> (PagingList.kt:134)");
            }
            f3.m mVarN = a3.n(androidx.compose.foundation.layout.d.h(f3.m.INSTANCE, 0.0f, 1, null), c5.h.n(16));
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.e(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            x xVar = x.f39368a;
            x70.f.g(x70.a.C5796a.f217280c, rVar, x70.a.C5796a.f217281d);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final q<f1.e, r, Integer, i0> b() {
        return f195778b;
    }
}
