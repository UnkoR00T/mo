package nc1;

import d1.a3;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lnc1/i;", "viewModel", "Loq/i0;", "i", "(Lnc1/i;Lm2/r;I)V", "Lnc1/i$a$a;", "data", "e", "(Lnc1/i$a$a;Lm2/r;I)V", "Lnc1/i$a;", "state", "company_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class o {
    private static final void e(i.a.DataDisplayed dataDisplayed, p076m2.r rVar, final int i15) {
        int i16;
        final i.a.DataDisplayed dataDisplayed2;
        p076m2.r rVarH = rVar.h(-1108511683);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(dataDisplayed) : rVarH.G(dataDisplayed) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1108511683, i16, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.presentation.steps.correspondencepostofficebox.CorrespondencePostOfficeBoxDataDisplayed (CorrespondencePostOfficeBoxScreen.kt:39)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarD = w0.i.d(mVarF, aVar.a(rVarH, i17).getBase().a(), null, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarD);
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
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVarH, 0);
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
            j70.h.g(null, null, dataDisplayed.getTitle(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            dataDisplayed2 = dataDisplayed;
            x30.c.c(null, 0.0f, y2.m.d(869550730, true, new er.p() { // from class: nc1.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.f(dataDisplayed2, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 3);
            rVarH.x();
            f3.m mVarN = a3.n(companion, aVar.b(rVarH, i17).getSpacing200());
            w0 w0VarA3 = d1.e0.a(iVar.k(), companion2.k(), rVarH, 0);
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
            h30.q.p(dataDisplayed2.getNextButton(), false, null, rVarH, 0, 6);
            rVarH.x();
            rVarH.x();
            boolean z15 = (i18 & 14) == 4 || ((i18 & 8) != 0 && rVarH.G(dataDisplayed2));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: nc1.m
                    @Override // er.a
                    public final Object a() {
                        return o.g(dataDisplayed2);
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            dataDisplayed2 = dataDisplayed;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: nc1.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.h(dataDisplayed2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(i.a.DataDisplayed dataDisplayed, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(869550730, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.presentation.steps.correspondencepostofficebox.CorrespondencePostOfficeBoxDataDisplayed.<anonymous>.<anonymous>.<anonymous> (CorrespondencePostOfficeBoxScreen.kt:62)");
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
            i0 i0Var = i0.f39176a;
            v50.c data = dataDisplayed.getPostalCodeInputData().getData();
            int i16 = v50.c.f203957t;
            v0.g(data, null, rVar, i16, 2);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            v0.g(dataDisplayed.getCityInputData().getData(), null, rVar, i16, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            v0.g(dataDisplayed.getPostOfficeNameInputData().getData(), null, rVar, i16, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            v0.g(dataDisplayed.getBoxNumberTextInputData().getData(), null, rVar, i16, 2);
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
    public static final oq.i0 g(i.a.DataDisplayed dataDisplayed) {
        dataDisplayed.d().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(i.a.DataDisplayed dataDisplayed, int i15, p076m2.r rVar, int i16) {
        e(dataDisplayed, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void i(final i iVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-66485363);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(iVar) : rVarH.G(iVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-66485363, i16, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.presentation.steps.correspondencepostofficebox.CorrespondencePostOfficeBoxScreen (CorrespondencePostOfficeBoxScreen.kt:27)");
            }
            i.a aVarJ = j(m7.b.c(iVar.getState(), null, null, null, rVarH, 0, 7));
            if (!(aVarJ instanceof i.a.DataDisplayed)) {
                rVarH.X(532080816);
                rVarH.R();
                throw new oq.p();
            }
            rVarH.X(532083695);
            e((i.a.DataDisplayed) aVarJ, rVarH, 0);
            rVarH.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: nc1.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.k(iVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final i.a j(f6<? extends i.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(i iVar, int i15, p076m2.r rVar, int i16) {
        i(iVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
