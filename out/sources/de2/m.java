package de2;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k40.EmptyStateData;
import mx.Label;
import n50.DefaultSingleCardData;
import n50.h0;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.xmlpull.v1.XmlPullParserException;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010²\u0006\f\u0010\u0006\u001a\u00020\u000f8\nX\u008a\u0084\u0002"}, d2 = {"Lde2/e;", "viewModel", "Loq/i0;", "m", "(Lde2/e;Lm2/r;I)V", "Lde2/e$a$c;", "data", "p", "(Lde2/e$a$c;Lm2/r;I)V", "Lde2/e$b$a;", "h", "(Lde2/e$b$a;Lm2/r;I)V", "Lde2/e$b$b;", "k", "(Lde2/e$b$b;Lm2/r;I)V", "Lde2/e$a;", "incidentreport_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {
    private static final void h(final e.b.Empty empty, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-257259230);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(empty) : rVarH.G(empty) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-257259230, i16, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.dashboard.IncidentDashboardEmptyState (IncidentDashboardScreen.kt:87)");
            }
            x30.c.c(null, 0.0f, y2.m.d(544499203, true, new er.p() { // from class: de2.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.i(empty, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 3);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: de2.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.j(empty, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(e.b.Empty empty, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(544499203, i15, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.dashboard.IncidentDashboardEmptyState.<anonymous> (IncidentDashboardScreen.kt:89)");
            }
            k40.d.c(null, empty.getEmptyState(), rVar, EmptyStateData.f108236d << 3, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(e.b.Empty empty, int i15, p076m2.r rVar, int i16) {
        h(empty, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void k(final e.b.IncidentsList incidentsList, p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(1314551502);
        int i16 = (i15 & 6) == 0 ? i15 | (rVarH.G(incidentsList) ? 4 : 2) : i15;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1314551502, i16, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.dashboard.IncidentDashboardList (IncidentDashboardScreen.kt:98)");
            }
            Label title = incidentsList.getTitle();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, title, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            List<DefaultSingleCardData> listA = incidentsList.a();
            ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
            int i18 = 0;
            for (Object obj : listA) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    pq.v.x();
                }
                h0.v((DefaultSingleCardData) obj, null, rVarH, 0, 2);
                if (i18 != incidentsList.a().size() - 1) {
                    rVarH.X(-2022374615);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200()), rVarH, 0);
                } else {
                    rVarH.X(-2026065630);
                }
                rVarH.R();
                arrayList.add(i0.f148189a);
                i18 = i19;
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: de2.l
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return m.l(incidentsList, i15, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(e.b.IncidentsList incidentsList, int i15, p076m2.r rVar, int i16) {
        k(incidentsList, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void m(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-767761919);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-767761919, i16, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.dashboard.IncidentDashboardScreen (IncidentDashboardScreen.kt:31)");
            }
            f6 f6VarC = m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7);
            oz.l.b(eVar.getLifecycleConnector(), rVarH, 0);
            e.a aVarN = n(f6VarC);
            if (aVarN instanceof e.a.Empty) {
                rVarH.X(915179186);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarN instanceof e.a.Initialized) {
                rVarH.X(915181554);
                p((e.a.Initialized) aVarN, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarN instanceof e.a.Error)) {
                    rVarH.X(915176890);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(915185225);
                ((e.a.Error) aVarN).getError().b(rVarH, 0);
                rVarH.R();
            }
            q0.g(false, n(f6VarC).a(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: de2.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.o(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.a n(f6<? extends e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(e eVar, int i15, p076m2.r rVar, int i16) {
        m(eVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void p(final e.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(585597866);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(585597866, i16, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.dashboard.IncidentDashboardScreenContent (IncidentDashboardScreen.kt:48)");
            }
            cb4.i dialogVMSAdapter = initialized.getDialogVMSAdapter();
            if (dialogVMSAdapter == null) {
                rVarH.X(-611012049);
            } else {
                rVarH.X(118837266);
                dialogVMSAdapter.b(rVarH, 0);
            }
            rVarH.R();
            rVar2 = rVarH;
            i50.s.r(initialized.getBaseScaffoldData(), y2.m.d(-929959595, true, new er.p() { // from class: de2.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.q(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1693151325, true, new er.q() { // from class: de2.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.r(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: de2.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.s(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(e.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-929959595, i15, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.dashboard.IncidentDashboardScreenContent.<anonymous> (IncidentDashboardScreen.kt:54)");
            }
            f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            h30.q.p(initialized.getNewIncidentButtonData(), false, null, rVar, 0, 6);
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
    public static final i0 r(e.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) throws XmlPullParserException, IOException {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1693151325, i15, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.dashboard.IncidentDashboardScreenContent.<anonymous> (IncidentDashboardScreen.kt:61)");
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            o40.j.i(initialized.getHeaderData(), rVar, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing300()), rVar, 0);
            e.b reportedIncidentsContent = initialized.getReportedIncidentsContent();
            if (reportedIncidentsContent instanceof e.b.Empty) {
                rVar.X(-1280656024);
                h((e.b.Empty) initialized.getReportedIncidentsContent(), rVar, 0);
                rVar.R();
            } else {
                if (!(reportedIncidentsContent instanceof e.b.IncidentsList)) {
                    rVar.X(-1280659646);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(-1280650974);
                k((e.b.IncidentsList) initialized.getReportedIncidentsContent(), rVar, 0);
                rVar.R();
            }
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
    public static final i0 s(e.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        p(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
