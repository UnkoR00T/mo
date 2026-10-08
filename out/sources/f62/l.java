package f62;

import d1.e0;
import i30.ButtonIconData;
import mx.Label;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import q40.IconPageBottomContentData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lf62/e;", "viewModel", "Loq/i0;", "j", "(Lf62/e;Lm2/r;I)V", "Lf62/e$a;", "screenData", "f", "(Lf62/e$a;Lm2/r;I)V", "Lf62/e$a$d;", "m", "(Lf62/e$a$d;Lm2/r;I)V", "Lf62/e$a$c;", "h", "(Lf62/e$a$c;Lm2/r;I)V", "epayments_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {
    public static final void f(final e.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1694450301);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1694450301, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.yourcards.addcard.PaymentsAddCardContent (PaymentsAddCardScreen.kt:29)");
            }
            if (fr.t.c(aVar, e.a.b.f59440a)) {
                rVarH.X(-574129561);
                rVarH.R();
            } else if (aVar instanceof e.a.WebView) {
                rVarH.X(-574127790);
                m((e.a.WebView) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else if (aVar instanceof e.a.C1337a) {
                rVarH.X(-574124601);
                rVarH.R();
            } else {
                if (!(aVar instanceof e.a.ResultPending)) {
                    rVarH.X(-574131339);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-574122632);
                h((e.a.ResultPending) aVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: f62.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.g(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(e.a aVar, int i15, p076m2.r rVar, int i16) {
        f(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void h(final e.a.ResultPending resultPending, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-244886925);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(resultPending) : rVarH.G(resultPending) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-244886925, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.yourcards.addcard.PaymentsAddCardPendingScreen (PaymentsAddCardScreen.kt:48)");
            }
            q0.g(false, resultPending.a(), rVarH, 0, 1);
            f3.m mVarD = w0.i.d(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a(), null, 2, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarD);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            rVar2 = rVarH;
            p70.n.g(null, null, Label.INSTANCE.c(), null, null, 0L, null, resultPending.getCloseButtonData(), rVar2, ButtonIconData.f88935g << 21, 123);
            q40.i.b(resultPending.c(), null, b.f59417a.b(), rVar2, IconPageData.f164667h | IconPageBottomContentData.f164663d | MLKEMEngine.KyberPolyBytes, 2);
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
            d5VarM.a(new er.p() { // from class: f62.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.i(resultPending, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(e.a.ResultPending resultPending, int i15, p076m2.r rVar, int i16) {
        h(resultPending, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void j(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-387070380);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-387070380, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.yourcards.addcard.PaymentsAddCardScreen (PaymentsAddCardScreen.kt:23)");
            }
            f(k(m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: f62.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.l(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.a k(f6<? extends e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(e eVar, int i15, p076m2.r rVar, int i16) {
        j(eVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void m(final e.a.WebView webView, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1064300222);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(webView) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1064300222, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.yourcards.addcard.PaymentsAddCardWebView (PaymentsAddCardScreen.kt:39)");
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
                objE2 = new er.a() { // from class: f62.i
                    @Override // er.a
                    public final Object a() {
                        return l.n(cVar);
                    }
                };
                rVarH.v(objE2);
            }
            q0.g(false, (er.a) objE2, rVarH, 48, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: f62.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.o(webView, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(w70.c cVar) {
        cVar.getController().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(e.a.WebView webView, int i15, p076m2.r rVar, int i16) {
        m(webView, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
