package ru2;

import a50.RadioButtonData;
import d1.a3;
import d1.r3;
import h30.ButtonData;
import mx.Label;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import u50.v0;
import w0.f3;
import w0.u2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lru2/o;", "viewModel", "Loq/i0;", "d", "(Lru2/o;Lm2/r;I)V", "Lru2/o$a;", "screenData", "g", "(Lru2/o$a;Lm2/r;I)V", "peselrestrictionverification_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class w {
    public static final void d(final o oVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-656978057);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(oVar) : rVarH.G(oVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-656978057, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.wizard.companydata.CompanyDataScreen (CompanyDataScreen.kt:37)");
            }
            g(e(m7.b.c(oVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, RadioButtonData.f3462h);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ru2.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.f(oVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final o.Data e(f6<o.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(o oVar, int i15, p076m2.r rVar, int i16) {
        d(oVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void g(final o.Data data, p076m2.r rVar, final int i15) {
        int i16;
        final o.Data data2 = data;
        p076m2.r rVarH = rVar.h(579484172);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(data2) : rVarH.G(data2) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(579484172, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.wizard.companydata.CompanyDataScreenDisplayed (CompanyDataScreen.kt:43)");
            }
            f3 f3VarB = u2.b(0, rVarH, 0, 1);
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(w0.i.d(mVarF, aVar.a(rVarH, i17).getBase().a(), null, 2, null), aVar.b(rVarH, i17).getSpacing200(), 0.0f, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarP);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            f3.m mVarR = a3.r(t70.i.S(d1.h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null), f3VarB, rVarH, 0, 0), 0.0f, aVar.b(rVarH, i17).getSpacing100(), 0.0f, aVar.b(rVarH, i17).getSpacing200(), 5, null);
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarR);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            a50.k.j(data2.getRadioButtonData(), rVarH, RadioButtonData.f3462h);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
            j70.h.g(null, null, mx.b.b(data2.getCompanyDataTitle(), "companyDataTitle"), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            x30.c.c(null, 0.0f, y2.m.d(-128345973, true, new er.p() { // from class: ru2.u
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.h(data, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 3);
            rVarH.x();
            data2 = data;
            f3.m mVarR2 = a3.r(companion, 0.0f, aVar.b(rVarH, i17).getSpacing200(), 0.0f, aVar.b(rVarH, i17).getSpacing200(), 5, null);
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = f3.j.e(rVarH, mVarR2);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB3);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarI, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            d1.x xVar = d1.x.f39368a;
            h30.q.p(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(data2.getNextButtonLabel(), null, 2, null), k30.d.a.f107773a, null, data2.s(), 35, null), false, null, rVarH, 0, 6);
            rVarH.x();
            rVarH.x();
            oq.i0 i0Var = oq.i0.f148189a;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ru2.v
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.i(data2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(o.Data data, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-128345973, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestrictionverification.presentation.screen.wizard.companydata.CompanyDataScreenDisplayed.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CompanyDataScreen.kt:69)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            Label companyDataNameInputLabel = data.getCompanyDataNameInputLabel();
            Label content = data.getCompanyNameScreenData().getContent();
            er.l<String, oq.i0> lVarP = data.p();
            v4.t.Companion companion3 = v4.t.INSTANCE;
            v50.c.Text text = new v50.c.Text(null, companyDataNameInputLabel, null, content, data.getCompanyNameScreenData().getValidationState(), null, null, lVarP, null, false, companion3.d(), null, false, null, false, null, null, null, null, null, 1047397, null);
            int i16 = v50.c.Text.P;
            v0.g(text, null, rVar, i16, 2);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            v0.g(new v50.c.Text(null, data.getCityInputLabel(), null, data.getCompanyCityScreenData().getContent(), data.getCompanyCityScreenData().getValidationState(), null, null, data.o(), null, false, companion3.d(), null, false, null, false, null, null, null, null, null, 1047397, null), null, rVar, i16, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            v0.g(new v50.c.Number(null, data.getPostalCodeInputLabel(), null, data.getCompanyPostalCodeScreenData().getContent(), data.getCompanyPostalCodeScreenData().getValidationState(), null, null, data.q(), null, false, companion3.d(), null, false, null, false, null, null, null, null, false, 1047397, null), null, rVar, v50.c.Number.P, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            v0.g(new v50.c.Text(null, data.getStreetInputLabel(), null, data.getCompanyStreetScreenData().getContent(), data.getCompanyStreetScreenData().getValidationState(), null, null, data.r(), null, false, companion3.d(), null, false, null, false, null, null, null, null, null, 1047397, null), null, rVar, i16, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            v0.g(new v50.c.Text(null, data.getBuildingInputNumber(), null, data.getCompanyBuildingScreenData().getContent(), data.getCompanyBuildingScreenData().getValidationState(), null, null, data.n(), null, false, companion3.d(), null, false, null, false, null, null, null, null, null, 1047397, null), null, rVar, i16, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            v0.g(new v50.c.Text(null, data.getApartmentNumberInputLabel(), null, data.getCompanyApartmentScreenData().getContent(), data.getCompanyApartmentScreenData().getValidationState(), null, null, data.m(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null), null, rVar, i16, 2);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(o.Data data, int i15, p076m2.r rVar, int i16) {
        g(data, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
