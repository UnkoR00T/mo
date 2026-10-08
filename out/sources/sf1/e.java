package sf1;

import d1.a3;
import d1.e0;
import d1.h0;
import d1.i0;
import d1.r3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import u50.v0;
import w30.CheckBoxSingleData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lsf1/m;", "viewModel", "Loq/i0;", "i", "(Lsf1/m;Lm2/r;I)V", "Lsf1/m$a$a;", "data", "e", "(Lsf1/m$a$a;Lm2/r;I)V", "Lsf1/m$a;", "state", "company_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {
    private static final void e(m.a.FormDisplayed formDisplayed, p076m2.r rVar, final int i15) {
        int i16;
        final m.a.FormDisplayed formDisplayed2;
        p076m2.r rVarH = rVar.h(1768130539);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(formDisplayed) : rVarH.G(formDisplayed) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1768130539, i16, -1, "pl.gov.coi.mobywatel.feature.companysuspension.presentation.steps.contactinfo.ContactInfoInitialized (ContactInfoScreen.kt:40)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarS = t70.i.S(w0.i.d(mVarF, aVar.a(rVarH, i17).getBase().a(), null, 2, null), null, rVarH, 0, 1);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarS);
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
            f3.m mVarB = h0.b(i0.f39176a, t70.i.S(a3.r(companion, aVar.b(rVarH, i17).getSpacing200(), aVar.b(rVarH, i17).getSpacing100(), aVar.b(rVarH, i17).getSpacing200(), 0.0f, 8, null), null, rVarH, 0, 1), 1.0f, false, 2, null);
            w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarB);
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
            int i18 = i16;
            j70.h.g(null, null, formDisplayed.getTitle(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            j70.h.g(null, null, formDisplayed.getDescription(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).d(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            v30.d.f(formDisplayed.getHasNoEmailCheckBoxData(), rVarH, CheckBoxSingleData.f210090f);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            if (formDisplayed.getHasNoEmailCheckBoxData().getCheckbox().getIsChecked()) {
                formDisplayed2 = formDisplayed;
                rVarH.X(1044253451);
            } else {
                rVarH.X(1046997695);
                formDisplayed2 = formDisplayed;
                x30.c.c(null, 0.0f, y2.m.d(-983165613, true, new er.p() { // from class: sf1.b
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return e.f(formDisplayed2, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 3);
            }
            rVarH.R();
            rVarH.x();
            f3.m mVarN = a3.n(companion, aVar.b(rVarH, i17).getSpacing200());
            w0 w0VarA3 = e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = f3.j.e(rVarH, mVarN);
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
            n6.i(rVarC3, w0VarA3, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            h30.q.p(formDisplayed2.getNextButton(), false, null, rVarH, 0, 6);
            rVarH.x();
            rVarH.x();
            boolean z15 = (i18 & 14) == 4 || ((i18 & 8) != 0 && rVarH.G(formDisplayed2));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: sf1.c
                    @Override // er.a
                    public final Object a() {
                        return e.g(formDisplayed2);
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            formDisplayed2 = formDisplayed;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sf1.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.h(formDisplayed2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(m.a.FormDisplayed formDisplayed, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-983165613, i15, -1, "pl.gov.coi.mobywatel.feature.companysuspension.presentation.steps.contactinfo.ContactInfoInitialized.<anonymous>.<anonymous>.<anonymous> (ContactInfoScreen.kt:75)");
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
            i0 i0Var = i0.f39176a;
            v0.g(formDisplayed.getEmailTextInputData(), null, rVar, v50.c.f203957t, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
            v30.d.f(formDisplayed.getCeigdCheckBoxData(), rVar, CheckBoxSingleData.f210090f);
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
    public static final oq.i0 g(m.a.FormDisplayed formDisplayed) {
        formDisplayed.f().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(m.a.FormDisplayed formDisplayed, int i15, p076m2.r rVar, int i16) {
        e(formDisplayed, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void i(final m mVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1111745004);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(mVar) : rVarH.G(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1111745004, i16, -1, "pl.gov.coi.mobywatel.feature.companysuspension.presentation.steps.contactinfo.ContactInfoScreen (ContactInfoScreen.kt:28)");
            }
            m.a aVarJ = j(m7.b.c(mVar.getState(), null, null, null, rVarH, 0, 7));
            if (!(aVarJ instanceof m.a.FormDisplayed)) {
                rVarH.X(-1059903633);
                rVarH.R();
                throw new oq.p();
            }
            rVarH.X(-1059901188);
            e((m.a.FormDisplayed) aVarJ, rVarH, 0);
            rVarH.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sf1.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.k(mVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final m.a j(f6<? extends m.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(m mVar, int i15, p076m2.r rVar, int i16) {
        i(mVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
