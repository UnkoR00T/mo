package uk2;

import d1.a3;
import d1.d3;
import i50.BaseScaffoldData;
import o20.BaseDocumentData;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e²\u0006\f\u0010\u0006\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Luk2/x;", "viewModel", "Loq/i0;", "e", "(Luk2/x;Lm2/r;I)V", "Luk2/x$a$a;", "data", "Li70/p;", "snackBarState", "Lkotlin/Function0;", "onSnackBarHidden", "i", "(Luk2/x$a$a;Li70/p;Ler/a;Lm2/r;I)V", "Luk2/x$a;", "midcard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c0 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<oq.i0> {
        a(Object obj) {
            super(0, obj, x.class, "hideSnackBar", "hideSnackBar()V", 0);
        }

        public final void E() {
            ((x) this.f66391b).B0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            E();
            return oq.i0.f148189a;
        }
    }

    public static final void e(final x xVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-909840851);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(xVar) : rVarH.G(xVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = true;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-909840851, i16, -1, "pl.gov.coi.mobywatel.feature.midcard.presentation.screen.midcard.MIdCardScreen (MIdCardScreen.kt:28)");
            }
            f6 f6VarC = m7.b.c(xVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(xVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            x.a aVarF = f(f6VarC);
            if (fr.t.c(aVarF, x.a.c.f198905a)) {
                rVarH.X(1816280830);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarF instanceof x.a.DocumentView) {
                rVarH.X(1816283002);
                x.a.DocumentView documentView = (x.a.DocumentView) aVarF;
                i70.p pVarG = g(f6VarB);
                if ((i16 & 14) != 4 && ((i16 & 8) == 0 || !rVarH.G(xVar))) {
                    z15 = false;
                }
                Object objE = rVarH.E();
                if (z15 || objE == p076m2.r.INSTANCE.a()) {
                    objE = new a(xVar);
                    rVarH.v(objE);
                }
                i(documentView, pVarG, (er.a) ((mr.g) objE), rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarF instanceof x.a.Error)) {
                    rVarH.X(1816278891);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1816289365);
                ((x.a.Error) aVarF).getErrorVMS().b(rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: uk2.y
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c0.h(xVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final x.a f(f6<? extends x.a> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p g(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(x xVar, int i15, p076m2.r rVar, int i16) {
        e(xVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void i(final x.a.DocumentView documentView, final i70.p pVar, final er.a<oq.i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1274893516);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(documentView) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1274893516, i16, -1, "pl.gov.coi.mobywatel.feature.midcard.presentation.screen.midcard.MIdCardScreenContent (MIdCardScreen.kt:50)");
            }
            p088nul.q0.g(false, documentView.c(), rVarH, 0, 1);
            cb4.i dialogVMS = documentView.getDialogVMS();
            if (dialogVMS == null) {
                rVarH.X(-42855795);
            } else {
                rVarH.X(1106996212);
                dialogVMS.b(rVarH, 0);
            }
            rVarH.R();
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar = (al) objE;
            p088nul.q0.g(false, documentView.c(), rVarH, 0, 1);
            i70.m.d(alVar, pVar, aVar, null, null, rVarH, (i16 & 112) | 6 | (i16 & 896), 24);
            i50.s.r(documentView.getScaffoldData(), null, y2.m.d(798362946, true, new er.p() { // from class: uk2.z
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c0.j(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1833744583, true, new er.q() { // from class: uk2.a0
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return c0.k(documentView, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: uk2.b0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c0.l(documentView, pVar, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(798362946, i15, -1, "pl.gov.coi.mobywatel.feature.midcard.presentation.screen.midcard.MIdCardScreenContent.<anonymous> (MIdCardScreen.kt:68)");
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
    public static final oq.i0 k(x.a.DocumentView documentView, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1833744583, i15, -1, "pl.gov.coi.mobywatel.feature.midcard.presentation.screen.midcard.MIdCardScreenContent.<anonymous> (MIdCardScreen.kt:70)");
            }
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.d(f3.m.INSTANCE, 0.0f, 1, null), d3Var);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.g(), rVar, 48);
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
            o20.i.m(documentView.getBaseDocumentData(), rVar, BaseDocumentData.f140741h);
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
    public static final oq.i0 l(x.a.DocumentView documentView, i70.p pVar, er.a aVar, int i15, p076m2.r rVar, int i16) {
        i(documentView, pVar, aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
