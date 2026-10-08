package es2;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import java.util.Iterator;
import n50.h0;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import q40.IconPageData;
import w0.f3;
import w0.u2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Les2/c;", "viewModel", "Loq/i0;", "f", "(Les2/c;Lm2/r;I)V", "Les2/c$a;", "data", "l", "(Les2/c$a;Lm2/r;I)V", "Les2/c$a$a;", "i", "(Les2/c$a$a;Lm2/r;I)V", "n", "penaltypoints_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {
    public static final void f(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-151089306);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-151089306, i16, -1, "pl.gov.coi.mobywatel.feature.penaltypoints.presentation.penaltypoints.main.PenaltyPointsScreen (PenaltyPointsScreen.kt:26)");
            }
            l(g(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: es2.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.h(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a g(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(c cVar, int i15, p076m2.r rVar, int i16) {
        f(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void i(final c.a.DataLoaded dataLoaded, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-453898808);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(dataLoaded) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-453898808, i16, -1, "pl.gov.coi.mobywatel.feature.penaltypoints.presentation.penaltypoints.main.PenaltyPointsScreenContent (PenaltyPointsScreen.kt:47)");
            }
            rVar2 = rVarH;
            i50.s.r(dataLoaded.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1798586037, true, new er.q() { // from class: es2.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.j(dataLoaded, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: es2.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.k(dataLoaded, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(c.a.DataLoaded dataLoaded, d3 d3Var, p076m2.r rVar, int i15) {
        p076m2.r rVar2;
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1798586037, i15, -1, "pl.gov.coi.mobywatel.feature.penaltypoints.presentation.penaltypoints.main.PenaltyPointsScreenContent.<anonymous> (PenaltyPointsScreen.kt:49)");
            }
            i0 i0Var = null;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), d3Var);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarR = a3.r(mVarL, aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing100(), aVar.b(rVar, i16).getSpacing200(), 0.0f, 8, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarR);
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
            d1.i0 i0Var2 = d1.i0.f39176a;
            y30.m.g(dataLoaded.getControllersData(), rVar, y30.n.Switch.f223693f);
            if (dataLoaded.getTabData() == null) {
                rVar.X(1353221895);
                rVar.R();
            } else {
                rVar.X(1353221896);
                n(dataLoaded, rVar, 0);
                rVar.R();
                i0Var = i0.f148189a;
            }
            if (i0Var == null) {
                rVar.X(-1203271049);
                rVar2 = rVar;
                q40.i.b(dataLoaded.b(), null, null, rVar2, IconPageData.f164667h, 6);
                rVar2.R();
            } else {
                rVar2 = rVar;
                rVar2.X(-1203274056);
                rVar2.R();
            }
            rVar2.x();
            q0.g(false, dataLoaded.d(), rVar2, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(c.a.DataLoaded dataLoaded, int i15, p076m2.r rVar, int i16) {
        i(dataLoaded, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void l(final c.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1855088150);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1855088150, i16, -1, "pl.gov.coi.mobywatel.feature.penaltypoints.presentation.penaltypoints.main.PenaltyPointsScreenStateSwitcher (PenaltyPointsScreen.kt:34)");
            }
            if (fr.t.c(aVar, c.a.b.f53287a)) {
                rVarH.X(-1586734122);
                rVarH.R();
            } else {
                if (!(aVar instanceof c.a.DataLoaded)) {
                    rVarH.X(-328281375);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-328277566);
                i((c.a.DataLoaded) aVar, rVarH, i16 & 14);
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: es2.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.m(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(c.a aVar, int i15, p076m2.r rVar, int i16) {
        l(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void n(final c.a.DataLoaded dataLoaded, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(705881461);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(dataLoaded) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(705881461, i16, -1, "pl.gov.coi.mobywatel.feature.penaltypoints.presentation.penaltypoints.main.PenaltyPointsTabContent (PenaltyPointsScreen.kt:77)");
            }
            f3 f3VarB = u2.b(0, rVarH, 0, 1);
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarS = t70.i.S(companion, f3VarB, rVarH, 6, 0);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(mVarS, 0.0f, aVar.b(rVarH, i17).getSpacing200(), 0.0f, aVar.b(rVarH, i17).getSpacing200(), 5, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarR);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            c30.e.c(null, dataLoaded.getInfoBannerData(), rVarH, 0, 1);
            r3.a(a3.r(companion, 0.0f, aVar.b(rVarH, i17).getSpacing200(), 0.0f, 0.0f, 13, null), rVarH, 0);
            c.a.DataLoaded.PenaltyPointsTabData tabData = dataLoaded.getTabData();
            if (tabData == null) {
                rVarH.X(-647657663);
            } else {
                rVarH.X(-647657662);
                f.c(tabData.getPenaltyPointsCardModel(), rVarH, 0);
                if (tabData.c().isEmpty()) {
                    rVarH.X(-2106933885);
                } else {
                    rVarH.X(-2103854004);
                    r3.a(a3.r(companion, 0.0f, aVar.b(rVarH, i17).getSpacing200(), 0.0f, 0.0f, 13, null), rVarH, 0);
                    j70.h.g(a3.r(companion, 0.0f, 0.0f, 0.0f, aVar.b(rVarH, i17).getSpacing100(), 7, null), null, tabData.getViolationsListHeader(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).a(), null, null, false, false, null, rVarH, 0, 0, 0, 33030106);
                    rVarH = rVarH;
                    rVarH.X(209239610);
                    Iterator<T> it = tabData.c().iterator();
                    while (it.hasNext()) {
                        h0.v((n50.k) it.next(), null, rVarH, 0, 2);
                        r3.a(a3.r(f3.m.INSTANCE, 0.0f, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100(), 0.0f, 0.0f, 13, null), rVarH, 0);
                    }
                    rVarH.R();
                    c30.b.C0606b errorBannerData = tabData.getErrorBannerData();
                    if (errorBannerData == null) {
                        rVarH.X(-2103264199);
                    } else {
                        rVarH.X(-2103264198);
                        c30.e.c(a3.r(f3.m.INSTANCE, 0.0f, 0.0f, 0.0f, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100(), 7, null), errorBannerData, rVarH, c30.b.C0606b.f22956j << 3, 0);
                    }
                    rVarH.R();
                }
                rVarH.R();
            }
            rVarH.R();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: es2.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.o(dataLoaded, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(c.a.DataLoaded dataLoaded, int i15, p076m2.r rVar, int i16) {
        n(dataLoaded, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
