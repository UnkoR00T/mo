package wy1;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import n30.CardListData;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\b¨\u0006\n²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lwy1/g;", "viewModel", "Loq/i0;", "j", "(Lwy1/g;Lm2/r;I)V", "Lwy1/g$a;", "screenData", "e", "(Lwy1/g$a;Lm2/r;I)V", "g", "electoralregister_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class o {
    public static final void e(final g.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(644939600);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(644939600, i16, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.screen.details.ElectoralEventDetailsContent (ElectoralEventDetailsScreen.kt:33)");
            }
            g(data, rVarH, c30.b.f22944i | BaseScaffoldData.f89350g | (i16 & 14));
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: wy1.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.f(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(g.Data data, int i15, p076m2.r rVar, int i16) {
        e(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void g(final g.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(718861237);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(718861237, i16, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.screen.details.ElectoralEventDetailsLoadedContent (ElectoralEventDetailsScreen.kt:38)");
            }
            rVar2 = rVarH;
            i50.s.r(data.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-2580382, true, new er.q() { // from class: wy1.m
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return o.h(data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: wy1.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.i(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(g.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        k70.a aVar;
        int i17;
        int i18;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2580382, i16, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.screen.details.ElectoralEventDetailsLoadedContent.<anonymous> (ElectoralEventDetailsScreen.kt:40)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null);
            k70.a aVar2 = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            f3.m mVarS = t70.i.S(t70.s.n(w0.i.d(mVarF, aVar2.a(rVar, i19).getBase().a(), null, 2, null), rVar, 0), null, rVar, 0, 1);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarS);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            j70.h.g(null, null, data.getElectoralEventDetailsScreenData().getElectionsDateTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i19).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i19).getSpacing200()), rVar, 0);
            m30.i.d(data.getElectoralEventDetailsScreenData().getElectionsDateList(), null, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i19).getSpacing300()), rVar, 0);
            j70.h.g(null, null, data.getElectoralEventDetailsScreenData().getVotingPlaceTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i19).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            p076m2.r rVar2 = rVar;
            f3.m.Companion companion3 = companion;
            r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar2.b(rVar2, i19).getSpacing200()), rVar2, 0);
            m30.i.d(data.getElectoralEventDetailsScreenData().getVotingPlaceList(), null, null, rVar2, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar2.b(rVar2, i19).getSpacing300()), rVar2, 0);
            CardListData residenceAddressList = data.getElectoralEventDetailsScreenData().getResidenceAddressList();
            if (residenceAddressList == null) {
                rVar2.X(599074354);
                rVar2.R();
                aVar = aVar2;
                i17 = i19;
                i18 = 0;
            } else {
                rVar2.X(599074355);
                j70.h.g(null, null, data.getElectoralEventDetailsScreenData().getResidenceAddressTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i19).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                aVar = aVar2;
                i17 = i19;
                companion3 = companion3;
                i18 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                m30.i.d(residenceAddressList, null, null, rVar2, 0, 6);
                r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                rVar2.R();
            }
            c30.b alertData = data.getElectoralEventDetailsScreenData().getAlertData();
            if (alertData == null) {
                rVar2.X(599500356);
            } else {
                rVar2.X(599500357);
                c30.e.c(null, alertData, rVar2, c30.b.f22944i << 3, 1);
                r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar.b(rVar2, i17).getSpacing200()), rVar2, i18);
            }
            rVar2.R();
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(g.Data data, int i15, p076m2.r rVar, int i16) {
        g(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void j(final g gVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1593204385);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1593204385, i16, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.screen.details.ElectoralEventDetailsScreen (ElectoralEventDetailsScreen.kt:25)");
            }
            e(k(m7.b.c(gVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, c30.b.f22944i | BaseScaffoldData.f89350g);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: wy1.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.l(gVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final g.Data k(f6<g.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(g gVar, int i15, p076m2.r rVar, int i16) {
        j(gVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
