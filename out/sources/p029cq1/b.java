package p029cq1;

import androidx.compose.foundation.layout.d;
import d1.a3;
import d1.d3;
import d1.e0;
import er.q;
import f3.c;
import f3.j;
import j70.h;
import k70.a;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import w0.i;
import y2.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f37258a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static q<d3, r, Integer, i0> f37259b = m.b(-1211048564, false, new q() { // from class: cq1.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return b.c((d3) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(d3 d3Var, r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1211048564, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.fab.ComposableSingletons$DeveloperFabScreenKt.lambda$-1211048564.<anonymous> (DeveloperFabScreen.kt:50)");
            }
            f3.m mVarF = d.f(a3.l(f3.m.INSTANCE, d3Var), 0.0f, 1, null);
            a aVar = a.f108864a;
            int i17 = a.f108865b;
            f3.m mVarN = a3.n(i.d(mVarF, aVar.a(rVar, i17).getBase().a(), null, 2, null), aVar.b(rVar, i17).getSpacing200());
            w0 w0VarA = e0.a(d1.i.f39152a.k(), c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = j.e(rVar, mVarN);
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            h.g(null, null, mx.b.b("FAB to interaktywny komponent, umożliwiający szybkie uruchamianie głównych akcji lub funkcji w aplikacji, bez konieczności szukania ich w interfejsie. Reprezentuje jedną główną akcję. Umieszczony jest w łatwo dostępnym miejscu. ", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).q(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final q<d3, r, Integer, i0> b() {
        return f37259b;
    }
}
