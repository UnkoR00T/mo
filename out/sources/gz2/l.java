package gz2;

import d1.a3;
import d1.d3;
import d1.r3;
import i50.BaseScaffoldData;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002"}, d2 = {"Lgz2/p;", "viewModel", "Loq/i0;", "o", "(Lgz2/p;Lm2/r;I)V", "Lgz2/p$a$d;", "data", "k", "(Lgz2/p$a$d;Lm2/r;I)V", "Lgz2/p$a$b;", "u", "(Lgz2/p$a$b;Lm2/r;I)V", "Lgz2/p$a$a;", "r", "(Lgz2/p$a$a;Lm2/r;I)V", "Lgz2/p$a;", "state", "qualifiedsignature_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {
    private static final void k(final p.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(864756854);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(864756854, i16, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.identityconfirmation.confirmmidcard.ConfirmMidInitializedScreen (ConfirmMidScreen.kt:45)");
            }
            rVar2 = rVarH;
            i50.s.r(initialized.getBaseScaffoldData(), y2.m.d(795116523, true, new er.p() { // from class: gz2.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.l(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-593764381, true, new er.q() { // from class: gz2.j
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.m(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | 48, 196608, 32764);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: gz2.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.n(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(p.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(795116523, i15, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.identityconfirmation.confirmmidcard.ConfirmMidInitializedScreen.<anonymous> (ConfirmMidScreen.kt:49)");
            }
            f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            h30.q.p(initialized.getConfirmButton(), false, null, rVar, 0, 6);
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
    public static final oq.i0 m(p.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-593764381, i16, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.identityconfirmation.confirmmidcard.ConfirmMidInitializedScreen.<anonymous> (ConfirmMidScreen.kt:54)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(a3.l(androidx.compose.foundation.layout.d.f(t70.i.S(companion, null, rVar, 6, 1), 0.0f, 1, null), d3Var), rVar, 0);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarD = w0.i.d(mVarN, aVar.a(rVar, i17).getBase().a(), null, 2, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarD);
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
            j70.h.g(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), null, initialized.getTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).g(), null, null, false, false, null, rVar, 6, 0, 0, 33030138);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, initialized.getSubtitle(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            m30.i.d(initialized.getCardListData(), null, null, rVar, 0, 6);
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
    public static final oq.i0 n(p.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        k(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void o(final p pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(149549022);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(pVar) : rVarH.G(pVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(149549022, i16, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.identityconfirmation.confirmmidcard.ConfirmMidScreen (ConfirmMidScreen.kt:31)");
            }
            p.a aVarP = p(m7.b.c(pVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarP, p.a.c.f78604a)) {
                rVarH.X(1982695663);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarP instanceof p.a.Initialized) {
                rVarH.X(1982697855);
                k((p.a.Initialized) aVarP, rVarH, 0);
                rVarH.R();
            } else if (aVarP instanceof p.a.InfoPage) {
                rVarH.X(1982700441);
                u((p.a.InfoPage) aVarP, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarP instanceof p.a.Error)) {
                    rVarH.X(1982693749);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1982702735);
                r((p.a.Error) aVarP, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: gz2.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.q(pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final p.a p(f6<? extends p.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(p pVar, int i15, p076m2.r rVar, int i16) {
        o(pVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void r(final p.a.Error error, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1152578278);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(error) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1152578278, i16, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.identityconfirmation.confirmmidcard.ErrorScreen (ConfirmMidScreen.kt:116)");
            }
            error.getErrorVMS().b(rVarH, 0);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: gz2.c
                    @Override // er.a
                    public final Object a() {
                        return l.s();
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 48, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: gz2.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.t(error, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(p.a.Error error, int i15, p076m2.r rVar, int i16) {
        r(error, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void u(final p.a.InfoPage infoPage, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(702653187);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(infoPage) : rVarH.G(infoPage) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(702653187, i16, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.identityconfirmation.confirmmidcard.InfoPageScreenContent (ConfirmMidScreen.kt:82)");
            }
            int i17 = i16;
            i50.s.r(infoPage.getScaffoldData(), y2.m.d(1702501358, true, new er.p() { // from class: gz2.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.v(infoPage, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-245045002, true, new er.q() { // from class: gz2.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.w(infoPage, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | 48, 196608, 32764);
            rVarH = rVarH;
            boolean z15 = (i17 & 14) == 4 || ((i17 & 8) != 0 && rVarH.G(infoPage));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: gz2.g
                    @Override // er.a
                    public final Object a() {
                        return l.x(infoPage);
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
            d5VarM.a(new er.p() { // from class: gz2.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.y(infoPage, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(p.a.InfoPage infoPage, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1702501358, i15, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.identityconfirmation.confirmmidcard.InfoPageScreenContent.<anonymous> (ConfirmMidScreen.kt:86)");
            }
            f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            h30.q.p(infoPage.getNextButtonData(), false, null, rVar, 0, 6);
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
    public static final oq.i0 w(p.a.InfoPage infoPage, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-245045002, i16, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.identityconfirmation.confirmmidcard.InfoPageScreenContent.<anonymous> (ConfirmMidScreen.kt:91)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(a3.l(androidx.compose.foundation.layout.d.f(t70.i.S(companion, null, rVar, 6, 1), 0.0f, 1, null), d3Var), rVar, 0);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarD = w0.i.d(mVarN, aVar.a(rVar, i17).getBase().a(), null, 2, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarD);
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
            j70.h.g(null, null, infoPage.getTitle(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            s40.g.c(infoPage.getInfoRowListData(), 0.0f, rVar, InfoRowListData.f187643b, 2);
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
    public static final oq.i0 x(p.a.InfoPage infoPage) {
        infoPage.c().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(p.a.InfoPage infoPage, int i15, p076m2.r rVar, int i16) {
        u(infoPage, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
