package y42;

import android.annotation.SuppressLint;
import d1.a3;
import d1.d3;
import d1.e0;
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
import p088nul.q0;
import q40.IconPageBottomContentData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Ly42/g;", "viewModel", "Loq/i0;", "f", "(Ly42/g;Lm2/r;I)V", "Ly42/g$a$b;", "screenData", "Li70/p;", "snackBarState", "j", "(Ly42/g$a$b;Li70/p;Lm2/r;I)V", "Ly42/g$a;", "state", "epayments_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {
    public static final void f(final g gVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(99941262);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(99941262, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.result.PaymentResultScreen (PaymentResultScreen.kt:36)");
            }
            f6 f6VarC = m7.b.c(gVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(gVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            g.a aVarG = g(f6VarC);
            if (fr.t.c(aVarG, g.a.C5997a.f224073a)) {
                rVarH.X(1554283039);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarG instanceof g.a.Result)) {
                    rVarH.X(1554280903);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1554285177);
                j((g.a.Result) aVarG, h(f6VarB), rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: y42.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.i(gVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final g.a g(f6<? extends g.a> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p h(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(g gVar, int i15, p076m2.r rVar, int i16) {
        f(gVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    @SuppressLint({"UnusedMaterial3ScaffoldPaddingParameter"})
    public static final void j(final g.a.Result result, final i70.p pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1457194706);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(result) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1457194706, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.result.PaymentResultScreenContentScreen (PaymentResultScreen.kt:56)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar = (al) objE;
            i70.m.d(alVar, pVar, result.d(), null, null, rVarH, (i16 & 112) | 6, 24);
            i50.s.r(result.getScaffoldData(), null, y2.m.d(979266120, true, new er.p() { // from class: y42.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.k(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-585287745, true, new er.q() { // from class: y42.j
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.l(result, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
            boolean zG = rVarH.G(result);
            Object objE2 = rVarH.E();
            if (zG || objE2 == companion.a()) {
                objE2 = new er.a() { // from class: y42.k
                    @Override // er.a
                    public final Object a() {
                        return m.m(result);
                    }
                };
                rVarH.v(objE2);
            }
            q0.g(false, (er.a) objE2, rVarH, 0, 1);
            cb4.i dialogVMS = result.getDialogVMS();
            if (dialogVMS == null) {
                rVarH.X(2055431623);
            } else {
                rVarH.X(204851578);
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
            d5VarM.a(new er.p() { // from class: y42.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.n(result, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(979266120, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.result.PaymentResultScreenContentScreen.<anonymous> (PaymentResultScreen.kt:66)");
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
    public static final i0 l(g.a.Result result, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-585287745, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.result.PaymentResultScreenContentScreen.<anonymous> (PaymentResultScreen.kt:72)");
            }
            f3.m mVarL = a3.l(w0.i.d(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().a(), null, 2, null), d3Var);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            IconPageData<g.a.Result.ContentData, IconPageBottomContentData> iconPageDataC = result.c();
            c cVar = c.f224033a;
            q40.i.b(iconPageDataC, cVar.c(), cVar.d(), rVar, IconPageData.f164667h | IconPageBottomContentData.f164663d | 432, 0);
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
    public static final i0 m(g.a.Result result) {
        result.a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(g.a.Result result, i70.p pVar, int i15, p076m2.r rVar, int i16) {
        j(result, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
