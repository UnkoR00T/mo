package u01;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import er.p;
import er.q;
import i50.BaseScaffoldData;
import i50.s;
import mx.Label;
import n50.DefaultSingleCardData;
import n50.h0;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lu01/c;", "viewModel", "Loq/i0;", "c", "(Lu01/c;Lm2/r;I)V", "Lu01/c$a;", "data", "apprating_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {
    public static final void c(final c cVar, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-883416138);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-883416138, i16, -1, "pl.gov.coi.mobywatel.feature.apprating.presentation.topic.SuggestionTopicScreen (SuggestionTopicScreen.kt:25)");
            }
            final f6 f6VarC = m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7);
            rVar2 = rVarH;
            s.r(d(f6VarC).getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-648636247, true, new q() { // from class: u01.d
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return f.e(f6VarC, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: u01.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.f(cVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.Data d(f6<c.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(f6 f6Var, d3 d3Var, r rVar, int i15) {
        int i16 = (i15 & 6) == 0 ? i15 | (rVar.W(d3Var) ? 4 : 2) : i15;
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-648636247, i16, -1, "pl.gov.coi.mobywatel.feature.apprating.presentation.topic.SuggestionTopicScreen.<anonymous> (SuggestionTopicScreen.kt:32)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label headerLabel = d(f6Var).getHeaderLabel();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, headerLabel, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            rVar.X(253423973);
            int i18 = 0;
            for (Object obj : d(f6Var).b()) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    v.x();
                }
                h0.v((DefaultSingleCardData) obj, null, rVar, 0, 2);
                if (v.p(d(f6Var).b()) != i18) {
                    rVar.X(367567858);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
                } else {
                    rVar.X(365762387);
                }
                rVar.R();
                i18 = i19;
            }
            rVar.R();
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(c cVar, int i15, r rVar, int i16) {
        c(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
