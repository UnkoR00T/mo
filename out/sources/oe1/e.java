package oe1;

import a50.RadioButtonData;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import d1.r3;
import i50.BaseScaffoldData;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Loe1/n;", "viewModel", "Loq/i0;", "e", "(Loe1/n;Lm2/r;I)V", "Loe1/n$a;", "data", "h", "(Loe1/n$a;Lm2/r;I)V", "state", "company_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {
    public static final void e(final n nVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-766064256);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(nVar) : rVarH.G(nVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-766064256, i16, -1, "pl.gov.coi.mobywatel.feature.companycommon.krus.presentation.socialinsurancequestions.SocialInsuranceQuestionsScreen (SocialInsuranceQuestionsScreen.kt:26)");
            }
            n.Data dataF = f(m7.b.c(nVar.getState(), null, null, null, rVarH, 0, 7));
            int i17 = BaseScaffoldData.f89350g;
            int i18 = RadioButtonData.f3462h;
            h(dataF, rVarH, i17 | i18 | i18 | i18);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: oe1.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.g(nVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final n.Data f(f6<n.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(n nVar, int i15, p076m2.r rVar, int i16) {
        e(nVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void h(final n.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(110420029);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(110420029, i16, -1, "pl.gov.coi.mobywatel.feature.companycommon.krus.presentation.socialinsurancequestions.SocialInsuranceQuestionsScreenContent (SocialInsuranceQuestionsScreen.kt:34)");
            }
            rVar2 = rVarH;
            i50.s.r(data.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-906460368, true, new er.q() { // from class: oe1.b
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return e.i(data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: oe1.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.k(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(final n.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-906460368, i16, -1, "pl.gov.coi.mobywatel.feature.companycommon.krus.presentation.socialinsurancequestions.SocialInsuranceQuestionsScreenContent.<anonymous> (SocialInsuranceQuestionsScreen.kt:36)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarL = a3.l(w0.i.d(mVarF, aVar.a(rVar, i17).getBase().a(), null, 2, null), d3Var);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
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
            f3.m mVarS = t70.i.S(a3.r(h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null), aVar.b(rVar, i17).getSpacing200(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 0.0f, 10, null), null, rVar, 0, 1);
            w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarS);
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
            r3.a(a3.n(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            RadioButtonData firstRadioButtonData = data.getFirstRadioButtonData();
            int i18 = RadioButtonData.f3462h;
            a50.k.j(firstRadioButtonData, rVar, i18);
            r3.a(a3.n(companion, aVar.b(rVar, i17).getSpacing250()), rVar, 0);
            a50.k.j(data.getSecondRadioButtonData(), rVar, i18);
            r3.a(a3.n(companion, aVar.b(rVar, i17).getSpacing250()), rVar, 0);
            j70.h.g(null, null, data.getThirdQuestion(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).p(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(a3.n(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, data.getThirdQuestionDescription(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(a3.n(companion, aVar.b(rVar, i17).getSpacing150()), rVar, 0);
            a50.k.j(data.getThirdRadioButtonData(), rVar, i18);
            r3.a(a3.n(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            rVar.x();
            f3.m mVarN = a3.n(companion, aVar.b(rVar, i17).getSpacing200());
            w0 w0VarA3 = e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT3 = rVar.t();
            f3.m mVarE3 = f3.j.e(rVar, mVarN);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
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
            n6.i(rVarC3, w0VarA3, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            h30.q.p(data.getNextButton(), false, null, rVar, 0, 6);
            rVar.x();
            rVar.x();
            boolean zG = rVar.G(data);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: oe1.d
                    @Override // er.a
                    public final Object a() {
                        return e.j(data);
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
    public static final i0 j(n.Data data) {
        data.c().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(n.Data data, int i15, p076m2.r rVar, int i16) {
        h(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
