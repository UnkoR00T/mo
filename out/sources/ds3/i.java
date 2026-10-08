package ds3;

import d1.a3;
import d1.e0;
import d1.h0;
import d1.r3;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import u50.v0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lds3/c;", "viewModel", "Loq/i0;", "m", "(Lds3/c;Lm2/r;I)V", "Lds3/c$a;", "screenData", "f", "(Lds3/c$a;Lm2/r;I)V", "Lds3/c$a$b;", "j", "(Lds3/c$a$b;Lm2/r;I)V", "Lds3/c$a$a;", "h", "(Lds3/c$a$a;Lm2/r;I)V", "zusvisit_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    public static final void f(final c.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1653649917);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1653649917, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.choosedepartment.ChooseDepartmentContent (ChooseDepartmentScreen.kt:39)");
            }
            if (aVar instanceof c.a.DisplayedInput) {
                rVarH.X(19677370);
                j((c.a.DisplayedInput) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else {
                if (!(aVar instanceof c.a.DisplayedDepartment)) {
                    rVarH.X(19673589);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(19681306);
                h((c.a.DisplayedDepartment) aVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: ds3.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.g(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(c.a aVar, int i15, p076m2.r rVar, int i16) {
        f(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void h(final c.a.DisplayedDepartment displayedDepartment, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        f3.m.Companion companion;
        p076m2.r rVarH = rVar.h(1763337739);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(displayedDepartment) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1763337739, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.choosedepartment.ChooseDepartmentFoundScreen (ChooseDepartmentScreen.kt:100)");
            }
            f3.m.Companion companion2 = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(w0.i.d(companion2, aVar.a(rVarH, i17).getBase().a(), null, 2, null), 0.0f, 1, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion3.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarF);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
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
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            f3.m mVarN = t70.s.n(t70.i.S(h0.b(d1.i0.f39176a, companion2, 1.0f, false, 2, null), null, rVarH, 0, 1), rVarH, 0);
            w0 w0VarA2 = e0.a(iVar.k(), companion3.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarN);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
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
            n6.i(rVarC2, w0VarA2, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            j70.h.g(null, null, displayedDepartment.getHeadline(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).i(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            j70.h.g(null, null, displayedDepartment.getDescription(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
            c30.b alertData = displayedDepartment.getAlertData();
            if (alertData == null) {
                rVarH.X(-394951293);
                rVarH.R();
                companion = companion2;
            } else {
                rVarH.X(-394951292);
                companion = companion2;
                c30.e.c(a3.r(companion, 0.0f, 0.0f, 0.0f, aVar.b(rVarH, i17).getSpacing200(), 7, null), alertData, rVarH, c30.b.f22944i << 3, 0);
                i0 i0Var = i0.f148189a;
                rVarH.R();
            }
            n50.h0.v(displayedDepartment.getDepartmentCardData(), null, rVarH, 0, 2);
            rVarH.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            f3.m mVarN2 = a3.n(companion, aVar.b(rVarH, i17).getSpacing200());
            w0 w0VarI = d1.r.i(companion3.o(), false);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = f3.j.e(rVarH, mVarN2);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion4.b();
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
            n6.i(rVarC3, w0VarI, companion4.d());
            n6.i(rVarC3, e0VarT3, companion4.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
            n6.g(rVarC3, companion4.a());
            n6.i(rVarC3, mVarE3, companion4.e());
            d1.x xVar = d1.x.f39368a;
            h30.q.p(displayedDepartment.getNextButtonData(), false, null, rVarH, 0, 6);
            rVar2 = rVarH;
            rVar2.x();
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ds3.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.i(displayedDepartment, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(c.a.DisplayedDepartment displayedDepartment, int i15, p076m2.r rVar, int i16) {
        h(displayedDepartment, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void j(c.a.DisplayedInput displayedInput, p076m2.r rVar, final int i15) {
        int i16;
        final c.a.DisplayedInput displayedInput2;
        p076m2.r rVarH = rVar.h(-2084369413);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(displayedInput) : rVarH.G(displayedInput) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2084369413, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.choosedepartment.ChooseDepartmentInputScreen (ChooseDepartmentScreen.kt:53)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(androidx.compose.foundation.layout.d.f(w0.i.d(companion, aVar.a(rVarH, i17).getBase().a(), null, 2, null), 0.0f, 1, null), aVar.b(rVarH, i17).getSpacing200(), 0.0f, aVar.b(rVarH, i17).getSpacing200(), aVar.b(rVarH, i17).getSpacing200(), 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarR);
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
            f3.m mVarR2 = a3.r(t70.i.S(h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null), null, rVarH, 0, 1), 0.0f, aVar.b(rVarH, i17).getSpacing100(), 0.0f, aVar.b(rVarH, i17).getSpacing200(), 5, null);
            w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarR2);
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
            j70.h.g(null, null, displayedInput.getHeadline(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).i(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            j70.h.g(null, null, displayedInput.getDescription(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
            displayedInput2 = displayedInput;
            x30.c.c(null, 0.0f, y2.m.d(2029414344, true, new er.p() { // from class: ds3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.k(displayedInput2, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 3);
            rVarH.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            h30.q.p(displayedInput2.getNextButtonData(), false, null, rVarH, 0, 6);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            displayedInput2 = displayedInput;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ds3.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.l(displayedInput2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(c.a.DisplayedInput displayedInput, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2029414344, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.choosedepartment.ChooseDepartmentInputScreen.<anonymous>.<anonymous>.<anonymous> (ChooseDepartmentScreen.kt:87)");
            }
            v0.g(displayedInput.getTextInputData(), null, rVar, v50.c.f203957t, 2);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(c.a.DisplayedInput displayedInput, int i15, p076m2.r rVar, int i16) {
        j(displayedInput, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void m(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(477106318);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(477106318, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.choosedepartment.ChooseDepartmentScreen (ChooseDepartmentScreen.kt:30)");
            }
            f(n(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ds3.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.o(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a n(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(c cVar, int i15, p076m2.r rVar, int i16) {
        m(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
