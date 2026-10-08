package sc1;

import a50.RadioButtonData;
import d1.a3;
import d1.d3;
import d1.h0;
import d1.r3;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import mx.Label;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import x40.LinkData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, d2 = {"Lsc1/r;", "viewModel", "Loq/i0;", "k", "(Lsc1/r;Lm2/r;I)V", "Lsc1/r$a$b;", "data", "n", "(Lsc1/r$a$b;Lm2/r;I)V", "Lsc1/r$a$a;", "r", "(Lsc1/r$a$a;Lm2/r;I)V", "Lmx/a;", "title", "description", "i", "(Lmx/a;Lmx/a;Lm2/r;I)V", "Lsc1/r$a;", "state", "company_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    private static final void i(final Label label, Label label2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        final Label label3 = label2;
        p076m2.r rVarH = rVar.h(-847298389);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(label) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(label3) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-847298389, i16, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.presentation.steps.incometaxformselection.CustomInfoRow (IncomeTaxFormSelectionScreen.kt:132)");
            }
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            rVar2 = rVarH;
            j70.h.g(null, null, label, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVar2, (i16 << 6) & 896, 0, 0, 33030139);
            j70.h.g(null, null, label2, null, null, aVar.a(rVar2, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).b(), null, null, false, false, null, rVar2, (i16 << 3) & 896, 0, 0, 33030107);
            label3 = label2;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sc1.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.j(label, label3, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(Label label, Label label2, int i15, p076m2.r rVar, int i16) {
        i(label, label2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void k(final r rVar, p076m2.r rVar2, final int i15) {
        int i16;
        p076m2.r rVarH = rVar2.h(31445264);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(rVar) : rVarH.G(rVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(31445264, i16, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.presentation.steps.incometaxformselection.IncomeTaxFormSelectionScreen (IncomeTaxFormSelectionScreen.kt:29)");
            }
            r.a aVarL = l(m7.b.c(rVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarL instanceof r.a.InfoPage) {
                rVarH.X(154135186);
                r((r.a.InfoPage) aVarL, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarL instanceof r.a.Initialized)) {
                    rVarH.X(154132666);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(154138304);
                n((r.a.Initialized) aVarL, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: sc1.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.m(rVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final r.a l(f6<? extends r.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(r rVar, int i15, p076m2.r rVar2, int i16) {
        k(rVar, rVar2, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void n(final r.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1641222279);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1641222279, i16, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.presentation.steps.incometaxformselection.IncomeTaxFormSelectionScreenContent (IncomeTaxFormSelectionScreen.kt:40)");
            }
            rVar2 = rVarH;
            i50.s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(493490298, true, new er.q() { // from class: sc1.b
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i.o(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: sc1.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.q(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(final r.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(493490298, i16, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.presentation.steps.incometaxformselection.IncomeTaxFormSelectionScreenContent.<anonymous> (IncomeTaxFormSelectionScreen.kt:42)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(companion, d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.r(mVarL, aVar.b(rVar, i17).getSpacing200(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 0.0f, 10, null), 0.0f, 1, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarF);
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
            f3.m mVarS = t70.i.S(h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null), null, rVar, 0, 1);
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVar, 0);
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
            r3.a(a3.r(companion, 0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, 0.0f, 13, null), rVar, 0);
            j70.h.g(null, null, initialized.getTitle(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(a3.r(companion, 0.0f, aVar.b(rVar, i17).getSpacing200(), 0.0f, 0.0f, 13, null), rVar, 0);
            j70.h.g(null, null, initialized.getDescription(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(a3.r(companion, 0.0f, aVar.b(rVar, i17).getSpacing200(), 0.0f, 0.0f, 13, null), rVar, 0);
            j30.f.e(null, initialized.getButtonTextData(), false, rVar, ButtonTextData.f99099f << 3, 5);
            r3.a(a3.r(companion, 0.0f, aVar.b(rVar, i17).getSpacing200(), 0.0f, 0.0f, 13, null), rVar, 0);
            a50.k.j(initialized.getRadioButtonData(), rVar, RadioButtonData.f3462h);
            rVar.x();
            h30.q.p(initialized.getNextButton(), false, null, rVar, 0, 6);
            r3.a(a3.r(companion, 0.0f, aVar.b(rVar, i17).getSpacing200(), 0.0f, 0.0f, 13, null), rVar, 0);
            rVar.x();
            boolean zG = rVar.G(initialized);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: sc1.h
                    @Override // er.a
                    public final Object a() {
                        return i.p(initialized);
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
    public static final i0 p(r.a.Initialized initialized) {
        initialized.d().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(r.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        n(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void r(final r.a.InfoPage infoPage, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-2107400023);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(infoPage) : rVarH.G(infoPage) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2107400023, i16, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.presentation.steps.incometaxformselection.InfoPageTaxationRules (IncomeTaxFormSelectionScreen.kt:87)");
            }
            int i17 = i16;
            i50.s.r(infoPage.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(355881046, true, new er.q() { // from class: sc1.d
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i.s(infoPage, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            boolean z15 = (i17 & 14) == 4 || ((i17 & 8) != 0 && rVarH.G(infoPage));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: sc1.e
                    @Override // er.a
                    public final Object a() {
                        return i.t(infoPage);
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
            d5VarM.a(new er.p() { // from class: sc1.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.u(infoPage, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(r.a.InfoPage infoPage, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(355881046, i16, -1, "pl.gov.coi.mobywatel.feature.companyappliacation.presentation.steps.incometaxformselection.InfoPageTaxationRules.<anonymous> (IncomeTaxFormSelectionScreen.kt:89)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarS = t70.i.S(a3.r(mVarL, aVar.b(rVar, i17).getSpacing200(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 0.0f, 10, null), null, rVar, 0, 1);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.r(aVar.b(rVar, i17).getSpacing200()), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarS);
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
            r3.a(a3.r(companion, 0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, 0.0f, 13, null), rVar, 0);
            i(infoPage.getFirstTaxationRuleTitle(), infoPage.getFirstTaxationRuleDescription(), rVar, 0);
            i(infoPage.getSecondTaxationRuleTitle(), infoPage.getSecondTaxationRuleDescription(), rVar, 0);
            i(infoPage.getThirdTaxationRuleTitle(), infoPage.getThirdTaxationRuleDescription(), rVar, 0);
            j70.h.g(null, null, infoPage.getDescription(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            x40.h.g(infoPage.getCeidgUrlButtonLinkData(), rVar, LinkData.f216731g);
            r3.a(a3.r(companion, 0.0f, aVar.b(rVar, i17).getSpacing200(), 0.0f, 0.0f, 13, null), rVar, 0);
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
    public static final i0 t(r.a.InfoPage infoPage) {
        infoPage.e().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(r.a.InfoPage infoPage, int i15, p076m2.r rVar, int i16) {
        r(infoPage, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
