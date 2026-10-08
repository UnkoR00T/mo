package fg1;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import d1.r3;
import i50.BaseScaffoldData;
import java.util.Iterator;
import mx.Label;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002"}, d2 = {"Lfg1/n;", "viewModel", "Loq/i0;", "k", "(Lfg1/n;Lm2/r;I)V", "Lfg1/n$a$a;", "data", "n", "(Lfg1/n$a$a;Lm2/r;I)V", "Lfg1/n$a$d;", "v", "(Lfg1/n$a$d;Lm2/r;I)V", "Lfg1/n$a$b;", "r", "(Lfg1/n$a$b;Lm2/r;I)V", "Lfg1/n$a;", "state", "company_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    public static final void k(final n nVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-471485100);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(nVar) : rVarH.G(nVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-471485100, i16, -1, "pl.gov.coi.mobywatel.feature.companysuspension.presentation.steps.summary.SummaryScreen (SummaryScreen.kt:29)");
            }
            n.a aVarL = l(m7.b.c(nVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarL instanceof n.a.Initialized) {
                rVarH.X(-2125609408);
                n((n.a.Initialized) aVarL, rVarH, 0);
                rVarH.R();
            } else if (aVarL instanceof n.a.UserData) {
                rVarH.X(-2125606883);
                v((n.a.UserData) aVarL, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarL instanceof n.a.Pkd)) {
                    rVarH.X(-2125611210);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-2125604611);
                r((n.a.Pkd) aVarL, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: fg1.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.m(nVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final n.a l(f6<? extends n.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(n nVar, int i15, p076m2.r rVar, int i16) {
        k(nVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void n(final n.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1977378305);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1977378305, i16, -1, "pl.gov.coi.mobywatel.feature.companysuspension.presentation.steps.summary.SummaryScreenInitializedContent (SummaryScreen.kt:42)");
            }
            rVar2 = rVarH;
            i50.s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-242149518, true, new er.q() { // from class: fg1.b
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.o(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: fg1.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.q(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(final n.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-242149518, i16, -1, "pl.gov.coi.mobywatel.feature.companysuspension.presentation.steps.summary.SummaryScreenInitializedContent.<anonymous> (SummaryScreen.kt:44)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var), rVar, 0);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            f3.m mVarB = h0.b(d1.i0.f39176a, t70.i.S(companion, null, rVar, 6, 1), 1.0f, false, 2, null);
            w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarB);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
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
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            Label title = initialized.getTitle();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, title, null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, initialized.getDescription(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            p076m2.r rVar2 = rVar;
            f3.m mVarI = androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300());
            boolean z15 = false;
            r3.a(mVarI, rVar2, 0);
            rVar2.X(2094414183);
            Iterator it = pq.v.s(initialized.getUserDataSection(), initialized.getSuspensionStartSection(), initialized.getSuspensionEndSection(), initialized.getMainPkdSection(), initialized.getHomeAddressSection(), initialized.getElectronicDeliverySection(), initialized.getSocialInsuranceSection(), initialized.getTaxOfficeSection(), initialized.getCompanyShortName(), initialized.getContactInfoSection()).iterator();
            while (it.hasNext()) {
                n.a.SummarySectionData summarySectionData = (n.a.SummarySectionData) it.next();
                Label title2 = summarySectionData.getTitle();
                k70.a aVar2 = k70.a.f108864a;
                int i18 = k70.a.f108865b;
                j70.h.g(null, null, title2, null, null, aVar2.a(rVar2, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i18).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                rVar2 = rVar;
                f3.m.Companion companion4 = f3.m.INSTANCE;
                r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar2.b(rVar2, i18).getSpacing200()), rVar2, 0);
                m30.i.d(summarySectionData.getCardListData(), null, null, rVar2, 0, 6);
                r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar2.b(rVar2, i18).getSpacing300()), rVar2, 0);
                it = it;
                z15 = false;
            }
            boolean z16 = z15;
            rVar2.R();
            c30.e.c(null, initialized.getAlertData(), rVar2, c30.b.f22944i << 3, 1);
            rVar2.x();
            f3.m mVarR = a3.r(f3.m.INSTANCE, 0.0f, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing200(), 0.0f, 0.0f, 13, null);
            w0 w0VarA3 = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar2, z16 ? 1 : 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar2, z16 ? 1 : 0));
            p076m2.e0 e0VarT3 = rVar2.t();
            f3.m mVarE3 = f3.j.e(rVar2, mVarR);
            androidx.compose.ui.node.c.Companion companion5 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB3 = companion5.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB3);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC3 = n6.c(rVar2);
            n6.i(rVarC3, w0VarA3, companion5.d());
            n6.i(rVarC3, e0VarT3, companion5.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion5.c());
            n6.g(rVarC3, companion5.a());
            n6.i(rVarC3, mVarE3, companion5.e());
            d1.i0 i0Var = d1.i0.f39176a;
            h30.q.p(initialized.getNextButton(), false, null, rVar2, 0, 6);
            rVar2.x();
            rVar2.x();
            boolean zG = rVar2.G(initialized);
            Object objE = rVar2.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: fg1.j
                    @Override // er.a
                    public final Object a() {
                        return k.p(initialized);
                    }
                };
                rVar2.v(objE);
            }
            q0.g(z16, (er.a) objE, rVar2, z16 ? 1 : 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(n.a.Initialized initialized) {
        initialized.i().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(n.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        n(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void r(final n.a.Pkd pkd, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1450548859);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(pkd) : rVarH.G(pkd) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1450548859, i16, -1, "pl.gov.coi.mobywatel.feature.companysuspension.presentation.steps.summary.SummaryScreenPkdCodesContent (SummaryScreen.kt:145)");
            }
            rVar2 = rVarH;
            i50.s.r(pkd.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1328548584, true, new er.q() { // from class: fg1.d
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.s(pkd, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: fg1.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.u(pkd, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(final n.a.Pkd pkd, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1328548584, i16, -1, "pl.gov.coi.mobywatel.feature.companysuspension.presentation.steps.summary.SummaryScreenPkdCodesContent.<anonymous> (SummaryScreen.kt:147)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var), rVar, 0);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            f3.m mVarB = h0.b(d1.i0.f39176a, t70.i.S(companion, null, rVar, 6, 1), 1.0f, false, 2, null);
            w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarB);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
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
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            m30.i.d(pkd.getPkdCodesSection().getCardListData(), null, null, rVar, 0, 6);
            rVar.x();
            rVar.x();
            boolean zG = rVar.G(pkd);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: fg1.h
                    @Override // er.a
                    public final Object a() {
                        return k.t(pkd);
                    }
                };
                rVar.v(objE);
            }
            q0.g(false, (er.a) objE, rVar, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(n.a.Pkd pkd) {
        pkd.a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(n.a.Pkd pkd, int i15, p076m2.r rVar, int i16) {
        r(pkd, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void v(final n.a.UserData userData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1478057257);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(userData) : rVarH.G(userData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1478057257, i16, -1, "pl.gov.coi.mobywatel.feature.companysuspension.presentation.steps.summary.SummaryScreenUserDataContent (SummaryScreen.kt:109)");
            }
            rVar2 = rVarH;
            i50.s.r(userData.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(416281226, true, new er.q() { // from class: fg1.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.w(userData, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: fg1.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.y(userData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(final n.a.UserData userData, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(416281226, i16, -1, "pl.gov.coi.mobywatel.feature.companysuspension.presentation.steps.summary.SummaryScreenUserDataContent.<anonymous> (SummaryScreen.kt:111)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var), rVar, 0);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            f3.m mVarB = h0.b(d1.i0.f39176a, t70.i.S(companion, null, rVar, 6, 1), 1.0f, false, 2, null);
            w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarB);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
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
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            m30.i.d(userData.getUserSection().getCardListData(), null, null, rVar, 0, 6);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            j70.h.g(null, null, userData.getUserParentsSection().getTitle(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            m30.i.d(userData.getUserParentsSection().getCardListData(), null, null, rVar, 0, 6);
            rVar.x();
            rVar.x();
            boolean zG = rVar.G(userData);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: fg1.i
                    @Override // er.a
                    public final Object a() {
                        return k.x(userData);
                    }
                };
                rVar.v(objE);
            }
            q0.g(false, (er.a) objE, rVar, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(n.a.UserData userData) {
        userData.a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(n.a.UserData userData, int i15, p076m2.r rVar, int i16) {
        v(userData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
