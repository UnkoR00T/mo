package y60;

import d1.x;
import er.q;
import oq.i0;
import p036e4.w0;
import p046f2.mk;
import p071kotlin.Metadata;
import p076m2.e0;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f224387a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static q<mk, r, Integer, i0> f224388b = y2.m.b(-2006516929, false, new q() { // from class: y60.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return b.c((mk) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(mk mkVar, r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= (i15 & 8) == 0 ? rVar.W(mkVar) : rVar.G(mkVar) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(-2006516929, i15, -1, "pl.gov.coi.common.ui.player.ComposableSingletons$MediaPlayerComponentKt.lambda$-2006516929.<anonymous> (MediaPlayerComponent.kt:149)");
            }
            float fW = (mkVar.w() - mkVar.x().e().floatValue()) / (mkVar.x().h().floatValue() - mkVar.x().e().floatValue());
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarH);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarI, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            x xVar = x.f39368a;
            f3.m mVarD = xVar.d(androidx.compose.foundation.layout.d.g(companion, fW), companion2.h());
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            d1.r.b(w0.i.c(androidx.compose.foundation.layout.d.i(mVarD, aVar.b(rVar, i16).getSpacing50()), aVar.a(rVar, i16).getBase().getPrimary(), l1.h.i()), rVar, 0);
            d1.r.b(w0.i.c(androidx.compose.foundation.layout.d.i(xVar.d(androidx.compose.foundation.layout.d.g(companion, 1.0f - fW), companion2.f()), aVar.b(rVar, i16).getSpacing50()), aVar.a(rVar, i16).getNeutral().f(), l1.h.i()), rVar, 0);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final q<mk, r, Integer, i0> b() {
        return f224388b;
    }
}
