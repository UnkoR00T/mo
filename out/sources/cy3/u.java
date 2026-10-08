package cy3;

import d1.a3;
import d1.d3;
import d1.r3;
import i50.BaseScaffoldData;
import n30.CardListData;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcy3/k;", "viewModel", "Loq/i0;", "q", "(Lcy3/k;Lm2/r;I)V", "Lcy3/k$a;", "screenData", "Li70/p;", "snackBarState", "k", "(Lcy3/k$a;Li70/p;Lm2/r;I)V", "Lcy3/k$a$d;", "h", "(Lcy3/k$a$d;Lm2/r;I)V", "Lcy3/k$a$c;", "m", "(Lcy3/k$a$c;Li70/p;Lm2/r;I)V", "makepayment_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class u {
    public static final void h(final k.a.WebView webView, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1649322895);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(webView) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1649322895, i16, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.cards.CardsWebView (PaymentsCardsScreen.kt:59)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = webView.getLoad();
                rVarH.v(objE);
            }
            final w70.c cVar = (w70.c) objE;
            w70.l.d(cVar, rVarH, 6);
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = new er.a() { // from class: cy3.p
                    @Override // er.a
                    public final Object a() {
                        return u.i(cVar);
                    }
                };
                rVarH.v(objE2);
            }
            p088nul.q0.g(false, (er.a) objE2, rVarH, 48, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: cy3.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.j(webView, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(w70.c cVar) {
        cVar.getController().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(k.a.WebView webView, int i15, p076m2.r rVar, int i16) {
        h(webView, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void k(final k.a aVar, final i70.p pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1928073723);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1928073723, i16, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.cards.PaymentsCardsContent (PaymentsCardsScreen.kt:43)");
            }
            if (fr.t.c(aVar, k.a.b.f38585a)) {
                rVarH.X(-1747937706);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVar instanceof k.a.Initialized) {
                rVarH.X(-1747935410);
                m((k.a.Initialized) aVar, pVar, rVarH, i16 & 126);
                rVarH.R();
            } else if (aVar instanceof k.a.WebView) {
                rVarH.X(-1747930582);
                h((k.a.WebView) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else if (fr.t.c(aVar, k.a.e.f38594a)) {
                rVarH.X(-1747927786);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVar instanceof k.a.Error)) {
                    rVarH.X(-1747939302);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1747925139);
                ((k.a.Error) aVar).getErrorVMS().b(rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: cy3.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.l(aVar, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(k.a aVar, i70.p pVar, int i15, p076m2.r rVar, int i16) {
        k(aVar, pVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void m(final k.a.Initialized initialized, final i70.p pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-646621278);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-646621278, i16, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.cards.PaymentsCardsInitializedScreen (PaymentsCardsScreen.kt:71)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar = (al) objE;
            i70.m.d(alVar, pVar, initialized.a(), null, null, rVarH, (i16 & 112) | 6, 24);
            i50.s.r(initialized.getScaffoldData(), null, y2.m.d(2066338386, true, new er.p() { // from class: cy3.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.n(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-368682615, true, new er.q() { // from class: cy3.s
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return u.o(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: cy3.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.p(initialized, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2066338386, i15, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.cards.PaymentsCardsInitializedScreen.<anonymous>.<anonymous> (PaymentsCardsScreen.kt:80)");
            }
            i70.d.d(alVar, pVar, false, rVar, 6, 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(k.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        p076m2.r rVar2;
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-368682615, i15, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.cards.PaymentsCardsInitializedScreen.<anonymous>.<anonymous> (PaymentsCardsScreen.kt:82)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarS = t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null), null, rVar, 0, 1);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarQ = a3.q(w0.i.d(mVarS, aVar.a(rVar, i16).getBase().a(), null, 2, null), aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing100(), aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing200());
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarQ);
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
            CardListData userCardsListData = initialized.getUserCardsListData();
            if (userCardsListData == null) {
                rVar.X(-1439321426);
                rVar.R();
                rVar2 = rVar;
            } else {
                rVar.X(-1439321425);
                rVar2 = rVar;
                m30.i.d(userCardsListData, null, null, rVar2, 0, 6);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i16).getSpacing200()), rVar2, 0);
                rVar2.R();
            }
            n50.h0.v(initialized.getPayAndSaveCardData(), null, rVar2, 0, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i16).getSpacing100()), rVar2, 0);
            n50.h0.v(initialized.getPayWithoutSaveCardData(), null, rVar2, 0, 2);
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(k.a.Initialized initialized, i70.p pVar, int i15, p076m2.r rVar, int i16) {
        m(initialized, pVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void q(final k kVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1166444662);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(kVar) : rVarH.G(kVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1166444662, i16, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.cards.PaymentsCardsScreen (PaymentsCardsScreen.kt:31)");
            }
            f6 f6VarC = m7.b.c(kVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(kVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            k(r(f6VarC), s(f6VarB), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: cy3.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.t(kVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final k.a r(f6<? extends k.a> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p s(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(k kVar, int i15, p076m2.r rVar, int i16) {
        q(kVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
