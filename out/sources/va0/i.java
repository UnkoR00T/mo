package va0;

import d1.a3;
import d1.d3;
import d1.x;
import f30.BottomNavigationData;
import i50.BaseScaffoldData;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.t;
import p088nul.q0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\r²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Lva0/c;", "viewModel", "Lkotlin/Function0;", "Loq/i0;", "innerNavContent", "f", "(Lva0/c;Ler/p;Lm2/r;I)V", "Lva0/c$a$a;", "data", "i", "(Lva0/c$a$a;Ler/p;Lm2/r;I)V", "Lva0/c$a;", "state", "dashboard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    public static final void f(final c cVar, final er.p<? super p076m2.r, ? super Integer, i0> pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1381971763);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1381971763, i16, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.main.MainScreen (MainScreen.kt:20)");
            }
            c.a aVarG = g(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7));
            if (!(aVarG instanceof c.a.MainData)) {
                rVarH.X(-929964650);
                rVarH.R();
                throw new oq.p();
            }
            rVarH.X(-929962391);
            i((c.a.MainData) aVarG, pVar, rVarH, i16 & 112);
            rVarH.R();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: va0.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.h(cVar, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a g(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(c cVar, er.p pVar, int i15, p076m2.r rVar, int i16) {
        f(cVar, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void i(final c.a.MainData mainData, final er.p<? super p076m2.r, ? super Integer, i0> pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-221942557);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(mainData) : rVarH.G(mainData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-221942557, i16, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.main.MainScreenContent (MainScreen.kt:34)");
            }
            rVar2 = rVarH;
            i50.s.r(mainData.getScaffoldData(), y2.m.d(2112115150, true, new er.p() { // from class: va0.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.j(mainData, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-502972714, true, new er.q() { // from class: va0.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i.k(mainData, pVar, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | 48, 196608, 32764);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: va0.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.m(mainData, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(c.a.MainData mainData, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(2112115150, i15, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.main.MainScreenContent.<anonymous> (MainScreen.kt:38)");
            }
            f30.j.h(mainData.getBottomNavigationData(), null, rVar, BottomNavigationData.f58833c, 2);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(final c.a.MainData mainData, er.p pVar, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(-502972714, i15, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.main.MainScreenContent.<anonymous> (MainScreen.kt:43)");
            }
            f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
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
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            x xVar = x.f39368a;
            pVar.B(rVar, 0);
            rVar.x();
            boolean zG = rVar.G(mainData);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: va0.h
                    @Override // er.a
                    public final Object a() {
                        return i.l(mainData);
                    }
                };
                rVar.v(objE);
            }
            q0.g(false, (er.a) objE, rVar, 0, 1);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(c.a.MainData mainData) {
        mainData.b().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(c.a.MainData mainData, er.p pVar, int i15, p076m2.r rVar, int i16) {
        i(mainData, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
