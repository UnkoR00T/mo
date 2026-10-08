package fd1;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import d1.r3;
import i50.BaseScaffoldData;
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
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002"}, d2 = {"Lfd1/c;", "viewModel", "Loq/i0;", "k", "(Lfd1/c;Lm2/r;I)V", "Lfd1/c$a$a;", "data", "n", "(Lfd1/c$a$a;Lm2/r;I)V", "Lfd1/c$a$c;", "v", "(Lfd1/c$a$c;Lm2/r;I)V", "Lfd1/c$a$b;", "r", "(Lfd1/c$a$b;Lm2/r;I)V", "Lfd1/c$a;", "state", "company_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {
    public static final void k(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-554486532);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-554486532, i16, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.presentation.steps.summary.SummaryScreen (SummaryScreen.kt:29)");
            }
            c.a aVarL = l(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarL instanceof c.a.Initialized) {
                rVarH.X(-285606424);
                n((c.a.Initialized) aVarL, rVarH, 0);
                rVarH.R();
            } else if (aVarL instanceof c.a.YourData) {
                rVarH.X(-285603643);
                v((c.a.YourData) aVarL, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarL instanceof c.a.Pkd)) {
                    rVarH.X(-285608459);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-285601116);
                r((c.a.Pkd) aVarL, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: fd1.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.m(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a l(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(c cVar, int i15, p076m2.r rVar, int i16) {
        k(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void n(final c.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-313877785);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-313877785, i16, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.presentation.steps.summary.SummaryScreenInitializedContent (SummaryScreen.kt:42)");
            }
            rVar2 = rVarH;
            i50.s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(793675674, true, new er.q() { // from class: fd1.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.o(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: fd1.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.q(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(final c.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        f3.m.Companion companion;
        char c15;
        Object obj;
        f3.m.Companion companion2;
        char c16;
        Object obj2;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(793675674, i16, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.presentation.steps.summary.SummaryScreenInitializedContent.<anonymous> (SummaryScreen.kt:44)");
            }
            f3.m.Companion companion3 = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(a3.l(androidx.compose.foundation.layout.d.f(companion3, 0.0f, 1, null), d3Var), rVar, 0);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion4 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion4.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
            androidx.compose.ui.node.c.Companion companion5 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion5.b();
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
            n6.i(rVarC, w0VarA, companion5.d());
            n6.i(rVarC, e0VarT, companion5.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion5.c());
            n6.g(rVarC, companion5.a());
            n6.i(rVarC, mVarE, companion5.e());
            f3.m mVarB = h0.b(d1.i0.f39176a, t70.i.S(companion3, null, rVar, 6, 1), 1.0f, false, 2, null);
            w0 w0VarA2 = e0.a(iVar.k(), companion4.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarB);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion5.b();
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
            n6.i(rVarC2, w0VarA2, companion5.d());
            n6.i(rVarC2, e0VarT2, companion5.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion5.c());
            n6.g(rVarC2, companion5.a());
            n6.i(rVarC2, mVarE2, companion5.e());
            Label title = initialized.getTitle();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, title, null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, initialized.getDescription(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            j70.h.g(null, null, initialized.getYourDataSectionTitle(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            p076m2.r rVar2 = rVar;
            int i18 = i17;
            f3.m mVarI = androidx.compose.foundation.layout.d.i(companion3, aVar.b(rVar2, i18).getSpacing200());
            int i19 = 0;
            r3.a(mVarI, rVar2, 0);
            n50.h0.v(initialized.getYourDataSingleCardData(), null, rVar2, 0, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar.b(rVar2, i18).getSpacing300()), rVar2, 0);
            Label accommodationSectionTitle = initialized.getAccommodationSectionTitle();
            if (accommodationSectionTitle == null) {
                rVar2.X(-236938568);
                rVar2.R();
                companion = companion3;
            } else {
                rVar2.X(-236938567);
                j70.h.g(null, null, accommodationSectionTitle, null, null, aVar.a(rVar2, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i18).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                rVar2 = rVar;
                i18 = i18;
                companion = companion3;
                f3.m mVarI2 = androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i18).getSpacing200());
                i19 = 0;
                r3.a(mVarI2, rVar2, 0);
                i0 i0Var = i0.f148189a;
                rVar2.R();
            }
            n50.k accommodationSingleCardData = initialized.getAccommodationSingleCardData();
            if (accommodationSingleCardData == null) {
                rVar2.X(-236618586);
                rVar2.R();
                c15 = 2;
                obj = null;
            } else {
                rVar2.X(-236618585);
                c15 = 2;
                obj = null;
                n50.h0.v(accommodationSingleCardData, null, rVar2, i19, 2);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i18).getSpacing300()), rVar2, i19);
                i0 i0Var2 = i0.f148189a;
                rVar2.R();
            }
            f3.m.Companion companion6 = companion;
            int i25 = i18;
            j70.h.g(null, null, initialized.getCompanyDetailsSectionTitle(), null, null, aVar.a(rVar2, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i18).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion6, aVar.b(rVar, i25).getSpacing200()), rVar, 0);
            m30.i.d(initialized.getCompanyDetailsCardListData(), null, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion6, aVar.b(rVar, i25).getSpacing300()), rVar, 0);
            j70.h.g(null, null, initialized.getCompanyContactDataSectionTitle(), null, null, aVar.a(rVar, i25).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i25).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion6, aVar.b(rVar, i25).getSpacing200()), rVar, 0);
            m30.i.d(initialized.getCompanyContactDataCardListData(), null, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion6, aVar.b(rVar, i25).getSpacing300()), rVar, 0);
            j70.h.g(null, null, initialized.getPkdCodesSectionTitle(), null, null, aVar.a(rVar, i25).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i25).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            p076m2.r rVar3 = rVar;
            int i26 = i25;
            f3.m mVarI3 = androidx.compose.foundation.layout.d.i(companion6, aVar.b(rVar3, i26).getSpacing200());
            int i27 = 0;
            r3.a(mVarI3, rVar3, 0);
            n50.h0.v(initialized.getPkdCodesSingleCardData(), null, rVar3, 0, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion6, aVar.b(rVar3, i26).getSpacing300()), rVar3, 0);
            Label permanentBusinessPlaceSectionTitle = initialized.getPermanentBusinessPlaceSectionTitle();
            if (permanentBusinessPlaceSectionTitle == null) {
                rVar3.X(-235136104);
                rVar3.R();
                companion2 = companion6;
            } else {
                rVar3.X(-235136103);
                j70.h.g(null, null, permanentBusinessPlaceSectionTitle, null, null, aVar.a(rVar3, i26).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar3, i26).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                rVar3 = rVar;
                i26 = i26;
                companion2 = companion6;
                f3.m mVarI4 = androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVar3, i26).getSpacing200());
                i27 = 0;
                r3.a(mVarI4, rVar3, 0);
                i0 i0Var3 = i0.f148189a;
                rVar3.R();
            }
            n50.k permanentBusinessPlaceSingleCardData = initialized.getPermanentBusinessPlaceSingleCardData();
            if (permanentBusinessPlaceSingleCardData == null) {
                rVar3.X(-234807194);
                rVar3.R();
                c16 = 2;
                obj2 = null;
            } else {
                rVar3.X(-234807193);
                c16 = 2;
                obj2 = null;
                n50.h0.v(permanentBusinessPlaceSingleCardData, null, rVar3, i27, 2);
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVar3, i26).getSpacing300()), rVar3, i27);
                i0 i0Var4 = i0.f148189a;
                rVar3.R();
            }
            f3.m.Companion companion7 = companion2;
            int i28 = i26;
            j70.h.g(null, null, initialized.getCorrespondenceAddressSectionTitle(), null, null, aVar.a(rVar3, i26).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar3, i26).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion7, aVar.b(rVar, i28).getSpacing200()), rVar, 0);
            n50.h0.v(initialized.getCorrespondenceAddressSingleCardData(), null, rVar, 0, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion7, aVar.b(rVar, i28).getSpacing300()), rVar, 0);
            j70.h.g(null, null, initialized.getElectronicDeliverySectionTitle(), null, null, aVar.a(rVar, i28).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i28).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion7, aVar.b(rVar, i28).getSpacing200()), rVar, 0);
            m30.i.d(initialized.getElectronicDeliveryCardListData(), null, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion7, aVar.b(rVar, i28).getSpacing300()), rVar, 0);
            j70.h.g(null, null, initialized.getInsuranceSectionTitle(), null, null, aVar.a(rVar, i28).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i28).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion7, aVar.b(rVar, i28).getSpacing200()), rVar, 0);
            m30.i.d(initialized.getInsuranceCardListData(), null, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion7, aVar.b(rVar, i28).getSpacing300()), rVar, 0);
            j70.h.g(null, null, initialized.getTaxOfficeSectionTitle(), null, null, aVar.a(rVar, i28).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i28).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion7, aVar.b(rVar, i28).getSpacing200()), rVar, 0);
            n50.h0.v(initialized.getTaxOfficeSingleCardData(), null, rVar, 0, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion7, aVar.b(rVar, i28).getSpacing300()), rVar, 0);
            j70.h.g(null, null, initialized.getAccountingRecordsSectionTitle(), null, null, aVar.a(rVar, i28).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i28).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion7, aVar.b(rVar, i28).getSpacing200()), rVar, 0);
            m30.i.d(initialized.getAccountingRecordsCardListData(), null, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion7, aVar.b(rVar, i28).getSpacing300()), rVar, 0);
            c30.e.c(null, initialized.getAlertData(), rVar, c30.b.f22944i << 3, 1);
            rVar.x();
            f3.m mVarR = a3.r(companion7, 0.0f, aVar.b(rVar, i28).getSpacing200(), 0.0f, 0.0f, 13, null);
            w0 w0VarA3 = e0.a(iVar.k(), companion4.k(), rVar, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT3 = rVar.t();
            f3.m mVarE3 = f3.j.e(rVar, mVarR);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion5.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB3);
            } else {
                rVar.u();
            }
            p076m2.r rVarC3 = n6.c(rVar);
            n6.i(rVarC3, w0VarA3, companion5.d());
            n6.i(rVarC3, e0VarT3, companion5.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion5.c());
            n6.g(rVarC3, companion5.a());
            n6.i(rVarC3, mVarE3, companion5.e());
            h30.q.p(initialized.getNextButton(), false, null, rVar, 0, 6);
            rVar.x();
            rVar.x();
            boolean zG = rVar.G(initialized);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: fd1.m
                    @Override // er.a
                    public final Object a() {
                        return n.p(initialized);
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
    public static final i0 p(c.a.Initialized initialized) {
        initialized.r().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(c.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        n(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void r(final c.a.Pkd pkd, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1640043217);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(pkd) : rVarH.G(pkd) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1640043217, i16, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.presentation.steps.summary.SummaryScreenPkdDataContent (SummaryScreen.kt:230)");
            }
            rVar2 = rVarH;
            i50.s.r(pkd.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-2141965308, true, new er.q() { // from class: fd1.e
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.s(pkd, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: fd1.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.u(pkd, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(final c.a.Pkd pkd, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2141965308, i16, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.presentation.steps.summary.SummaryScreenPkdDataContent.<anonymous> (SummaryScreen.kt:232)");
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
            m30.i.d(pkd.getPkdCodesCardList(), null, null, rVar, 0, 6);
            rVar.x();
            rVar.x();
            boolean zG = rVar.G(pkd);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: fd1.k
                    @Override // er.a
                    public final Object a() {
                        return n.t(pkd);
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
    public static final i0 t(c.a.Pkd pkd) {
        pkd.a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(c.a.Pkd pkd, int i15, p076m2.r rVar, int i16) {
        r(pkd, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void v(final c.a.YourData yourData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(2144082671);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(yourData) : rVarH.G(yourData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2144082671, i16, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.presentation.steps.summary.SummaryScreenYourDataContent (SummaryScreen.kt:194)");
            }
            rVar2 = rVarH;
            i50.s.r(yourData.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1537231330, true, new er.q() { // from class: fd1.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.w(yourData, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: fd1.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.y(yourData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(final c.a.YourData yourData, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1537231330, i16, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.presentation.steps.summary.SummaryScreenYourDataContent.<anonymous> (SummaryScreen.kt:196)");
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
            m30.i.d(yourData.getYourDataCardList(), null, null, rVar, 0, 6);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            j70.h.g(null, null, yourData.getParentsDataTitle(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            m30.i.d(yourData.getParentsDataCardList(), null, null, rVar, 0, 6);
            rVar.x();
            rVar.x();
            boolean zG = rVar.G(yourData);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: fd1.l
                    @Override // er.a
                    public final Object a() {
                        return n.x(yourData);
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
    public static final i0 x(c.a.YourData yourData) {
        yourData.a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(c.a.YourData yourData, int i15, p076m2.r rVar, int i16) {
        v(yourData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
