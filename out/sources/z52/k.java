package z52;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import d1.r3;
import h30.ButtonData;
import i50.BaseScaffoldData;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lz52/d;", "viewModel", "Loq/i0;", "l", "(Lz52/d;Lm2/r;I)V", "Lz52/d$a;", "screenData", "Li70/p;", "snackBarState", "f", "(Lz52/d$a;Li70/p;Lm2/r;I)V", "Lz52/d$a$b;", "h", "(Lz52/d$a$b;Li70/p;Lm2/r;I)V", "epayments_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    public static final void f(final d.a aVar, final i70.p pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1060181234);
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
                p076m2.t.o(1060181234, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.transactiondetails.PaymentsTransactionDetailsContent (PaymentsTransactionDetailsScreen.kt:41)");
            }
            if (fr.t.c(aVar, d.a.C6262a.f232957a)) {
                rVarH.X(926923491);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVar instanceof d.a.Initialized)) {
                    rVarH.X(926921285);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(926926210);
                h((d.a.Initialized) aVar, pVar, rVarH, i16 & 126);
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
            d5VarM.a(new er.p() { // from class: z52.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.g(aVar, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(d.a aVar, i70.p pVar, int i15, p076m2.r rVar, int i16) {
        f(aVar, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void h(final d.a.Initialized initialized, final i70.p pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1011272617);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1011272617, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.transactiondetails.PaymentsTransactionDetailsInitialized (PaymentsTransactionDetailsScreen.kt:55)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar = (al) objE;
            i70.m.d(alVar, pVar, initialized.c(), null, null, rVarH, (i16 & 112) | 6, 24);
            i50.s.r(initialized.getScaffoldData(), null, y2.m.d(1507099763, true, new er.p() { // from class: z52.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.i(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-136459364, true, new er.q() { // from class: z52.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.j(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
            cb4.i dialogVMS = initialized.getDialogVMS();
            if (dialogVMS == null) {
                rVarH.X(1923241488);
            } else {
                rVarH.X(1170418705);
                dialogVMS.b(rVarH, 0);
            }
            rVarH.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: z52.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.k(initialized, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1507099763, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.transactiondetails.PaymentsTransactionDetailsInitialized.<anonymous> (PaymentsTransactionDetailsScreen.kt:65)");
            }
            i70.d.d(alVar, pVar, false, rVar, 6, 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(d.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-136459364, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.transactiondetails.PaymentsTransactionDetailsInitialized.<anonymous> (PaymentsTransactionDetailsScreen.kt:71)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarS = t70.i.S(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), null, rVar, 6, 1);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarL = a3.l(a3.q(w0.i.d(mVarS, aVar.a(rVar, i17).getBase().a(), null, 2, null), aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing100(), aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing200()), d3Var);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
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
            m30.i.d(initialized.getTransactionDetails(), null, null, rVar, 0, 6);
            ButtonData getConfirmationButtonData = initialized.getGetConfirmationButtonData();
            if (getConfirmationButtonData == null) {
                rVar.X(1636906887);
                rVar.R();
            } else {
                rVar.X(1636906888);
                r3.a(h0.b(i0Var, companion, 1.0f, false, 2, null), rVar, 0);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
                h30.q.p(getConfirmationButtonData, false, null, rVar, 0, 6);
                rVar.R();
            }
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
    public static final i0 k(d.a.Initialized initialized, i70.p pVar, int i15, p076m2.r rVar, int i16) {
        h(initialized, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void l(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1086153565);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1086153565, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.transactiondetails.PaymentsTransactionDetailsScreen (PaymentsTransactionDetailsScreen.kt:29)");
            }
            f6 f6VarC = m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(dVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            f(m(f6VarC), n(f6VarB), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: z52.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.o(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a m(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p n(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(d dVar, int i15, p076m2.r rVar, int i16) {
        l(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
