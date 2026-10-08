package n42;

import d1.a3;
import d1.d3;
import i50.BaseScaffoldData;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Ln42/r;", "viewModel", "Loq/i0;", "e", "(Ln42/r;Lm2/r;I)V", "Ln42/r$a;", "paymentsDetailsScreenData", "Li70/p;", "snackBarState", "d", "(Ln42/r$a;Li70/p;Lm2/r;I)Loq/i0;", "Ln42/r$a$c;", "i", "(Ln42/r$a$c;Li70/p;Lm2/r;I)Loq/i0;", "epayments_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class x {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<oq.i0> {
        a(Object obj) {
            super(0, obj, r.class, "close", "close()V", 0);
        }

        public final void E() {
            ((r) this.f66391b).close();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            E();
            return oq.i0.f148189a;
        }
    }

    public static final oq.i0 d(r.a aVar, i70.p pVar, p076m2.r rVar, int i15) {
        oq.i0 i0VarI;
        if (p076m2.t.k()) {
            p076m2.t.o(1499903280, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.details.PaymentsDetailsContent (PaymentsDetailsScreen.kt:41)");
        }
        if (fr.t.c(aVar, r.a.b.f131515a)) {
            rVar.X(-1701952831);
            c60.b.b(rVar, 0);
            rVar.R();
            i0VarI = oq.i0.f148189a;
        } else if (aVar instanceof r.a.Initialized) {
            rVar.X(-1701950513);
            i0VarI = i((r.a.Initialized) aVar, pVar, rVar, i15 & 126);
            rVar.R();
        } else {
            if (!(aVar instanceof r.a.Error)) {
                rVar.X(-1701955009);
                rVar.R();
                throw new oq.p();
            }
            rVar.X(-1701943944);
            ((r.a.Error) aVar).getErrorVMS().b(rVar, 0);
            rVar.R();
            i0VarI = oq.i0.f148189a;
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0VarI;
    }

    public static final void e(final r rVar, p076m2.r rVar2, final int i15) {
        int i16;
        p076m2.r rVarH = rVar2.h(-754285151);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(rVar) : rVarH.G(rVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-754285151, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.details.PaymentsDetailsScreen (PaymentsDetailsScreen.kt:24)");
            }
            f6 f6VarC = m7.b.c(rVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(rVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            oz.l.b(rVar.getLifecycleConnector(), rVarH, 0);
            d(f(f6VarC), g(f6VarB), rVarH, 0);
            boolean z15 = (i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(rVar));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(rVar);
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) ((mr.g) objE), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: n42.u
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return x.h(rVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final r.a f(f6<? extends r.a> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p g(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(r rVar, int i15, p076m2.r rVar2, int i16) {
        e(rVar, rVar2, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final oq.i0 i(final r.a.Initialized initialized, final i70.p pVar, p076m2.r rVar, int i15) {
        oq.i0 i0Var;
        if (p076m2.t.k()) {
            p076m2.t.o(-1959576130, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.details.PaymentsDetailsScreenContent (PaymentsDetailsScreen.kt:55)");
        }
        rVar.X(-1956979790);
        Object objE = rVar.E();
        if (objE == p076m2.r.INSTANCE.a()) {
            objE = new al();
            rVar.v(objE);
        }
        final al alVar = (al) objE;
        i70.m.d(alVar, pVar, initialized.g(), null, null, rVar, (i15 & 112) | 6, 24);
        i50.s.r(initialized.getParentScaffoldData(), null, y2.m.d(-1784321938, true, new er.p() { // from class: n42.v
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return x.j(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
            }
        }, rVar, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1134815579, true, new er.q() { // from class: n42.w
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return x.k(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
        cb4.i dialogVMS = initialized.getDialogVMS();
        if (dialogVMS == null) {
            rVar.X(-2069221567);
            rVar.R();
            i0Var = null;
        } else {
            rVar.X(-1313675072);
            dialogVMS.b(rVar, 0);
            rVar.R();
            i0Var = oq.i0.f148189a;
        }
        rVar.R();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1784321938, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.details.PaymentsDetailsScreenContent.<anonymous>.<anonymous> (PaymentsDetailsScreen.kt:65)");
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
    public static final oq.i0 k(r.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = (rVar.W(d3Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1134815579, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.details.PaymentsDetailsScreenContent.<anonymous>.<anonymous> (PaymentsDetailsScreen.kt:68)");
            }
            f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            g42.i.h(initialized.getInnerScaffoldData(), initialized.getPaymentTitle(), initialized.getAdditionalTitle(), initialized.b().B(rVar, 0).m20unboximpl(), null, initialized.getContentData(), initialized.c(), initialized.getTransactionsData(), rVar, BaseScaffoldData.f89350g | 24576);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }
}
