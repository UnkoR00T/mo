package id1;

import d1.a3;
import d1.d3;
import i50.BaseScaffoldData;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lid1/i0;", "viewModel", "Lkotlin/Function0;", "Loq/i0;", "innerNavContent", "c", "(Lid1/i0;Ler/p;Lm2/r;I)V", "Lid1/i0$a;", "state", "company_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l0 {
    public static final void c(final i0 i0Var, final er.p<? super p076m2.r, ? super Integer, oq.i0> pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-2093521132);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(i0Var) : rVarH.G(i0Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2093521132, i16, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.presentation.wizardmain.OpenCompanyWizardScreen (OpenCompanyWizardScreen.kt:17)");
            }
            rVar2 = rVarH;
            i50.s.r(d(m7.b.c(i0Var.getState(), null, null, null, rVarH, 0, 7)).getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(369759937, true, new er.q() { // from class: id1.j0
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l0.e(pVar, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: id1.k0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l0.f(i0Var, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final i0.Data d(f6<i0.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(er.p pVar, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(369759937, i15, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.presentation.wizardmain.OpenCompanyWizardScreen.<anonymous> (OpenCompanyWizardScreen.kt:23)");
            }
            f3.m mVarL = a3.l(w0.i.d(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().a(), null, 2, null), d3Var);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
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
            pVar.B(rVar, 0);
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
    public static final oq.i0 f(i0 i0Var, er.p pVar, int i15, p076m2.r rVar, int i16) {
        c(i0Var, pVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
