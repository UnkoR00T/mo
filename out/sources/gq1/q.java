package gq1;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import s70.IllustrationPageContentData;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lgq1/t;", "viewModel", "Loq/i0;", "g", "(Lgq1/t;Lm2/r;I)V", "Lgq1/t$a;", "state", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class q {
    public static final void g(final t tVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1176990401);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(tVar) : rVarH.G(tVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1176990401, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.illustrationpage.DeveloperIllustrationPageScreen (DeveloperIllustrationPageScreen.kt:24)");
            }
            final f6 f6VarC = m7.b.c(tVar.getState(), null, null, null, rVarH, 0, 7);
            rVar2 = rVarH;
            i50.s.r(h(f6VarC).getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(726067956, true, new er.q() { // from class: gq1.o
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return q.i(f6VarC, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: gq1.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.n(tVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final t.Initialized h(f6<t.Initialized> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(final f6 f6Var, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(726067956, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.illustrationpage.DeveloperIllustrationPageScreen.<anonymous> (DeveloperIllustrationPageScreen.kt:30)");
            }
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), d3Var);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            s70.k.e(h(f6Var).getIllustrationPageVMS(), pq.v.q(y2.m.d(291806009, true, new er.p() { // from class: gq1.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.j(f6Var, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), y2.m.d(1843460538, true, new er.p() { // from class: gq1.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.k(f6Var, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), y2.m.d(-899852229, true, new er.p() { // from class: gq1.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.l(f6Var, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54)), y2.m.d(-52498320, true, new er.p() { // from class: gq1.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.m(f6Var, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, 432, 0);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(f6 f6Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(291806009, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.illustrationpage.DeveloperIllustrationPageScreen.<anonymous>.<anonymous>.<anonymous> (DeveloperIllustrationPageScreen.kt:39)");
            }
            s70.k.i(h(f6Var).b(), c.f76167a.d(), rVar, IllustrationPageContentData.f178596e | InfoRowListData.f187643b | 48, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(f6 f6Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1843460538, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.illustrationpage.DeveloperIllustrationPageScreen.<anonymous>.<anonymous>.<anonymous> (DeveloperIllustrationPageScreen.kt:44)");
            }
            s70.k.i(h(f6Var).e(), c.f76167a.c(), rVar, IllustrationPageContentData.f178596e | 48, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(f6 f6Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-899852229, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.illustrationpage.DeveloperIllustrationPageScreen.<anonymous>.<anonymous>.<anonymous> (DeveloperIllustrationPageScreen.kt:48)");
            }
            s70.k.i(h(f6Var).g(), null, rVar, IllustrationPageContentData.f178596e, 2);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(f6 f6Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-52498320, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.illustrationpage.DeveloperIllustrationPageScreen.<anonymous>.<anonymous>.<anonymous> (DeveloperIllustrationPageScreen.kt:51)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
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
            h30.q.p(h(f6Var).getNextButtonData(), false, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing150()), rVar, 0);
            h30.q.p(h(f6Var).getSkipButtonData(), false, null, rVar, 0, 6);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(t tVar, int i15, p076m2.r rVar, int i16) {
        g(tVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
