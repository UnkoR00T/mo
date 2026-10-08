package oi3;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.Iterator;
import mx.Label;
import n50.h0;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import qi3.AutomaticReportInsurerDetailsSectionData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010²\u0006\f\u0010\u000f\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Loi3/d;", "viewModel", "Loq/i0;", "m", "(Loi3/d;Lm2/r;I)V", "Loi3/d$a;", "data", "g", "(Loi3/d$a;Lm2/r;I)V", "Loi3/d$a$b;", "i", "(Loi3/d$a$b;Lm2/r;I)V", "Lqi3/a;", "p", "(Lqi3/a;Lm2/r;I)V", "state", "vehiclecollision_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    public static final void g(final d.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(623984311);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(623984311, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.wheretoreport.automaticreportoverview.AutomaticReportOverviewContent (AutomaticReportOverviewScreen.kt:41)");
            }
            if (aVar instanceof d.a.C3632a) {
                rVarH.X(498307721);
                rVarH.R();
            } else {
                if (!(aVar instanceof d.a.Initialized)) {
                    rVarH.X(-1646495564);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1646491505);
                i((d.a.Initialized) aVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: oi3.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.h(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(d.a aVar, int i15, p076m2.r rVar, int i16) {
        g(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void i(final d.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(354529706);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(354529706, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.wheretoreport.automaticreportoverview.AutomaticReportOverviewInitialized (AutomaticReportOverviewScreen.kt:51)");
            }
            int i17 = i16;
            i50.s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1403761571, true, new er.q() { // from class: oi3.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.j(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            boolean z15 = (i17 & 14) == 4 || ((i17 & 8) != 0 && rVarH.G(initialized));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: oi3.h
                    @Override // er.a
                    public final Object a() {
                        return k.k(initialized);
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: oi3.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.l(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(d.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1403761571, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.wheretoreport.automaticreportoverview.AutomaticReportOverviewInitialized.<anonymous> (AutomaticReportOverviewScreen.kt:53)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(a3.l(t70.i.S(companion, null, rVar, 6, 1), d3Var), rVar, 0);
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
            Label title = initialized.getTitle();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, title, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            p076m2.r rVar2 = rVar;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300()), rVar2, 0);
            qi3.b screenModel = initialized.getScreenModel();
            if (screenModel instanceof qi3.b.InvolvedPartiesInsurers) {
                rVar2.X(1482566174);
                AutomaticReportInsurerDetailsSectionData victimInsurerDetails = ((qi3.b.InvolvedPartiesInsurers) initialized.getScreenModel()).getVictimInsurerDetails();
                if (victimInsurerDetails == null) {
                    rVar2.X(1482611526);
                } else {
                    rVar2.X(1482611527);
                    p(victimInsurerDetails, rVar2, 0);
                    r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300()), rVar2, 0);
                }
                rVar2.R();
                p(((qi3.b.InvolvedPartiesInsurers) initialized.getScreenModel()).getPerpetratorInsurerDetails(), rVar2, 0);
                rVar2.R();
            } else {
                if (!(screenModel instanceof qi3.b.AllInsurers)) {
                    rVar2.X(879106254);
                    rVar2.R();
                    throw new oq.p();
                }
                rVar2.X(1483011675);
                j70.h.g(null, null, ((qi3.b.AllInsurers) initialized.getScreenModel()).getListTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
                j70.h.g(null, null, ((qi3.b.AllInsurers) initialized.getScreenModel()).getListDescription(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                m30.i.d(((qi3.b.AllInsurers) initialized.getScreenModel()).getAllInsurersCardList(), null, null, rVar2, 0, 6);
                rVar2.R();
            }
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
    public static final i0 k(d.a.Initialized initialized) {
        initialized.a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(d.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        i(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void m(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1515527354);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1515527354, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.wheretoreport.automaticreportoverview.AutomaticReportOverviewScreen (AutomaticReportOverviewScreen.kt:30)");
            }
            g(n(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: oi3.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.o(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a n(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(d dVar, int i15, p076m2.r rVar, int i16) {
        m(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void p(final AutomaticReportInsurerDetailsSectionData automaticReportInsurerDetailsSectionData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-19925579);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(automaticReportInsurerDetailsSectionData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-19925579, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.wheretoreport.automaticreportoverview.InsurerDetailsSection (AutomaticReportOverviewScreen.kt:103)");
            }
            Label title = automaticReportInsurerDetailsSectionData.getTitle();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, title, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            Label description = automaticReportInsurerDetailsSectionData.getDescription();
            if (description == null) {
                rVarH.X(-897246552);
            } else {
                rVarH.X(-897246551);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
                j70.h.g(null, null, description, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
                rVarH = rVarH;
            }
            rVarH.R();
            ButtonTextData linkButtonData = automaticReportInsurerDetailsSectionData.getLinkButtonData();
            if (linkButtonData == null) {
                rVarH.X(-897030048);
            } else {
                rVarH.X(-897030047);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVarH, i17).getSpacing50()), rVarH, 0);
                j30.f.e(null, linkButtonData, false, rVarH, ButtonTextData.f99099f << 3, 5);
            }
            rVarH.R();
            f3.m.Companion companion = f3.m.INSTANCE;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.r(aVar.b(rVarH, i17).getSpacing200()), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
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
            rVarH.X(1109539811);
            Iterator<T> it = automaticReportInsurerDetailsSectionData.b().iterator();
            while (it.hasNext()) {
                h0.v((n50.k) it.next(), null, rVarH, 0, 2);
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
            d5VarM.a(new er.p() { // from class: oi3.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.q(automaticReportInsurerDetailsSectionData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(AutomaticReportInsurerDetailsSectionData automaticReportInsurerDetailsSectionData, int i15, p076m2.r rVar, int i16) {
        p(automaticReportInsurerDetailsSectionData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
