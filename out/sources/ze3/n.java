package ze3;

import d1.a3;
import d1.d3;
import d1.r3;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import n50.h0;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Lze3/d;", "viewModel", "Loq/i0;", "h", "(Lze3/d;Lm2/r;I)V", "Lze3/e;", "data", "k", "(Lze3/e;Lm2/r;I)V", "Lze3/f;", "o", "(Lze3/f;Lm2/r;I)V", "Lze3/d$a;", "state", "vehiclecollision_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {
    public static final void h(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1155016191);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1155016191, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.details.statementdetails.StatementDetailsScreen (StatementDetailsScreen.kt:30)");
            }
            d.a aVarI = i(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarI, d.a.C6329a.f234820a)) {
                rVarH.X(1869003056);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarI instanceof Created) {
                rVarH.X(1869004775);
                k((Created) aVarI, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarI instanceof ReportedToUFG)) {
                    rVarH.X(1869001799);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1869007437);
                o((ReportedToUFG) aVarI, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: ze3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.j(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a i(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(d dVar, int i15, p076m2.r rVar, int i16) {
        h(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void k(final Created created, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-726076826);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(created) : rVarH.G(created) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-726076826, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.details.statementdetails.SummaryCreated (StatementDetailsScreen.kt:48)");
            }
            rVar2 = rVarH;
            i50.s.r(created.getScaffoldData(), y2.m.d(-1630629231, true, new er.p() { // from class: ze3.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.l(created, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1690389913, true, new er.q() { // from class: ze3.l
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.m(created, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | 48, 196608, 32764);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ze3.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.n(created, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Created created, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1630629231, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.details.statementdetails.SummaryCreated.<anonymous> (StatementDetailsScreen.kt:52)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarN = a3.n(companion, aVar.b(rVar, i16).getSpacing200());
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            h30.q.p(created.getButton1(), false, null, rVar, 0, 6);
            ButtonData button2 = created.getButton2();
            if (button2 == null) {
                rVar.X(-1239649330);
            } else {
                rVar.X(-1239649329);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing150()), rVar, 0);
                h30.q.p(button2, false, null, rVar, 0, 6);
            }
            rVar.R();
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
    public static final i0 m(Created created, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1690389913, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.details.statementdetails.SummaryCreated.<anonymous> (StatementDetailsScreen.kt:63)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(androidx.compose.foundation.layout.d.f(t70.i.S(a3.l(companion, d3Var), null, rVar, 0, 1), 0.0f, 1, null), rVar, 0);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label title = created.getTitle();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, title, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            j70.h.g(null, null, created.getDetailsSubtitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            m30.i.d(created.getDetailsCardList(), null, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            j70.h.g(null, null, created.getPerpetratorSubtitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            m30.i.d(created.getPerpetratorDataCardList(), null, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            j70.h.g(null, null, created.getVictimSubtitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            m30.i.d(created.getVictimDetailsCardList(), null, null, rVar, 0, 6);
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
    public static final i0 n(Created created, int i15, p076m2.r rVar, int i16) {
        k(created, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void o(final ReportedToUFG reportedToUFG, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(630691174);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(reportedToUFG) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(630691174, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.details.statementdetails.SummaryReportedToUFG (StatementDetailsScreen.kt:109)");
            }
            rVar2 = rVarH;
            i50.s.r(reportedToUFG.getScaffoldData(), y2.m.d(1816087825, true, new er.p() { // from class: ze3.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.p(reportedToUFG, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(17415193, true, new er.q() { // from class: ze3.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.q(reportedToUFG, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | 48, 196608, 32764);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ze3.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.r(reportedToUFG, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(ReportedToUFG reportedToUFG, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1816087825, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.details.statementdetails.SummaryReportedToUFG.<anonymous> (StatementDetailsScreen.kt:113)");
            }
            ButtonData fillDataButton = reportedToUFG.getFillDataButton();
            if (fillDataButton == null) {
                rVar.X(-630598602);
                rVar.R();
            } else {
                rVar.X(-630598601);
                f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
                w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT = rVar.t();
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
                p076m2.r rVarC = n6.c(rVar);
                n6.i(rVarC, w0VarA, companion.d());
                n6.i(rVarC, e0VarT, companion.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
                n6.g(rVarC, companion.a());
                n6.i(rVarC, mVarE, companion.e());
                d1.i0 i0Var = d1.i0.f39176a;
                h30.q.p(fillDataButton, false, null, rVar, 0, 6);
                rVar.x();
                rVar.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(ReportedToUFG reportedToUFG, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        k70.a aVar;
        int i17;
        f3.m.Companion companion;
        int i18;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(17415193, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.details.statementdetails.SummaryReportedToUFG.<anonymous> (StatementDetailsScreen.kt:122)");
            }
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(a3.l(t70.i.S(companion2, null, rVar, 6, 1), d3Var), rVar, 0);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion3.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
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
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label title = reportedToUFG.getTitle();
            k70.a aVar2 = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            j70.h.g(null, null, title, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i19).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            p076m2.r rVar2 = rVar;
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar2, i19).getSpacing300()), rVar2, 0);
            if (reportedToUFG.getDamageReportSubtitle() == null) {
                rVar2.X(236322309);
                rVar2.R();
                aVar = aVar2;
                i17 = i19;
                companion = companion2;
                i18 = 0;
            } else {
                rVar2.X(236322310);
                j70.h.g(null, null, reportedToUFG.getDamageReportSubtitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i19).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                aVar = aVar2;
                i17 = i19;
                companion = companion2;
                i18 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                i0 i0Var2 = i0.f148189a;
                rVar2.R();
            }
            if (reportedToUFG.getDamageReport() == null) {
                rVar2.X(236561536);
            } else {
                rVar2.X(236561537);
                m30.i.d(reportedToUFG.getDamageReport(), null, null, rVar2, 0, 6);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300()), rVar2, i18);
                i0 i0Var3 = i0.f148189a;
            }
            rVar2.R();
            k70.a aVar3 = aVar;
            int i25 = i17;
            f3.m.Companion companion5 = companion;
            j70.h.g(null, null, reportedToUFG.getDetailsSubtitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar3.b(rVar, i25).getSpacing200()), rVar, 0);
            m30.i.d(reportedToUFG.getDetailsCardList(), null, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar3.b(rVar, i25).getSpacing300()), rVar, 0);
            j70.h.g(null, null, reportedToUFG.getPerpetratorSubtitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVar, i25).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar3.b(rVar, i25).getSpacing200()), rVar, 0);
            m30.i.d(reportedToUFG.getPerpetratorDataCardList(), null, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar3.b(rVar, i25).getSpacing300()), rVar, 0);
            j70.h.g(null, null, reportedToUFG.getVictimSubtitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVar, i25).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar3.b(rVar, i25).getSpacing200()), rVar, 0);
            m30.i.d(reportedToUFG.getVictimDetailsCardList(), null, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar3.b(rVar, i25).getSpacing300()), rVar, 0);
            n50.k downloadStatementButton = reportedToUFG.getDownloadStatementButton();
            if (downloadStatementButton == null) {
                rVar.X(237754881);
            } else {
                rVar.X(237754882);
                f3.m mVarF = androidx.compose.foundation.layout.d.f(companion5, 0.0f, 1, null);
                w0 w0VarA2 = d1.e0.a(iVar.d(), companion3.k(), rVar, 6);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT2 = rVar.t();
                f3.m mVarE2 = f3.j.e(rVar, mVarF);
                er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
                if (rVar.l() == null) {
                    p076m2.m.d();
                }
                rVar.K();
                if (rVar.getInserting()) {
                    rVar.H(aVarB2);
                } else {
                    rVar.u();
                }
                p076m2.r rVarC2 = n6.c(rVar);
                n6.i(rVarC2, w0VarA2, companion4.d());
                n6.i(rVarC2, e0VarT2, companion4.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
                n6.g(rVarC2, companion4.a());
                n6.i(rVarC2, mVarE2, companion4.e());
                h0.v(downloadStatementButton, null, rVar, 0, 2);
                rVar.x();
                i0 i0Var4 = i0.f148189a;
            }
            rVar.R();
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
    public static final i0 r(ReportedToUFG reportedToUFG, int i15, p076m2.r rVar, int i16) {
        o(reportedToUFG, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
