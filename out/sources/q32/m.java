package q32;

import androidx.compose.ui.platform.u1;
import d1.a3;
import d1.d3;
import d1.i0;
import d1.r3;
import i50.BaseScaffoldData;
import mx.Label;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import q40.IconPageData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014²\u0006\f\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002"}, d2 = {"Lq32/f;", "viewModel", "Loq/i0;", "o", "(Lq32/f;Lm2/r;I)V", "Lq32/f$a$a;", "data", "i", "(Lq32/f$a$a;Lm2/r;I)V", "Lq32/f$a$d;", "l", "(Lq32/f$a$d;Lm2/r;I)V", "Lw70/c$d;", "load", "Lmx/a;", "loadingLabel", "g", "(Lw70/c$d;Lmx/a;Lm2/r;I)V", "Lq32/f$a;", "state", "electronicdelivery_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {
    private static final void g(final w70.c.Url url, final Label label, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-43920191);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(url) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(label) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-43920191, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.webview.InvisibleProcessContent (OAuthWebViewScreen.kt:98)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarD = w0.i.d(mVarF, aVar.a(rVarH, i17).getBase().a(), null, 2, null);
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarD);
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
            n6.i(rVarC, w0VarI, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.x xVar = d1.x.f39368a;
            f3.m mVarA = k3.a.a(companion, 0.0f);
            w0 w0VarI2 = d1.r.i(companion2.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarA);
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
            n6.i(rVarC2, w0VarI2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            if (((Boolean) rVarH.N(u1.a())).booleanValue()) {
                rVarH.X(-309807251);
            } else {
                rVarH.X(-306524351);
                w70.l.d(url, rVarH, i16 & 14);
            }
            rVarH.R();
            rVarH.x();
            f3.m mVarF2 = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.e(), companion2.g(), rVarH, 54);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = f3.j.e(rVarH, mVarF2);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
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
            n6.i(rVarC3, w0VarA, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            i0 i0Var = i0.f39176a;
            x70.f.g(x70.a.C5796a.f217280c, rVarH, x70.a.C5796a.f217281d);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            rVar2 = rVarH;
            j70.h.g(null, null, label, null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, Float.valueOf(-1.0f), false, false, null, rVar2, (i16 << 3) & 896, 0, 0, 30932955);
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
            d5VarM.a(new er.p() { // from class: q32.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.h(url, label, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(w70.c.Url url, Label label, int i15, p076m2.r rVar, int i16) {
        g(url, label, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void i(final f.a.Empty empty, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-782908137);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(empty) : rVarH.G(empty) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-782908137, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.webview.OAuthWebViewEmpty (OAuthWebViewScreen.kt:56)");
            }
            i50.s.r(empty.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1063938294, true, new er.q() { // from class: q32.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.j(empty, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            q0.g(false, empty.c(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: q32.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.k(empty, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(f.a.Empty empty, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1063938294, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.webview.OAuthWebViewEmpty.<anonymous> (OAuthWebViewScreen.kt:60)");
            }
            f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.l(f3.m.INSTANCE, d3Var), 0.0f, 1, null);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarF);
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
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.x xVar = d1.x.f39368a;
            q40.i.b(empty.b(), b.f164122a.b(), null, rVar, IconPageData.f164667h | 48, 4);
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
    public static final oq.i0 k(f.a.Empty empty, int i15, p076m2.r rVar, int i16) {
        i(empty, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void l(final f.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(603550217);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(603550217, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.webview.OAuthWebViewInitialized (OAuthWebViewScreen.kt:81)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = initialized.getWebViewState();
                rVarH.v(objE);
            }
            w70.c.Url url = (w70.c.Url) objE;
            boolean isWebViewVisible = initialized.getIsWebViewVisible();
            if (isWebViewVisible) {
                rVarH.X(191179107);
                w70.l.d(url, rVarH, 6);
                rVarH.R();
            } else {
                if (isWebViewVisible) {
                    rVarH.X(191177881);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(191180450);
                g(url, initialized.getLoadingLabel(), rVarH, 6);
                rVarH.R();
            }
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = new er.a() { // from class: q32.j
                    @Override // er.a
                    public final Object a() {
                        return m.m();
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
            d5VarM.a(new er.p() { // from class: q32.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.n(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(f.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        l(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void o(final f fVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1449686175);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(fVar) : rVarH.G(fVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1449686175, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.webview.OAuthWebViewScreen (OAuthWebViewScreen.kt:38)");
            }
            f.a aVarP = p(m7.b.c(fVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarP, f.a.c.f164172a)) {
                rVarH.X(-1579003931);
                rVarH.R();
            } else if (aVarP instanceof f.a.Initialized) {
                rVarH.X(-1579002133);
                l((f.a.Initialized) aVarP, rVarH, 0);
                rVarH.R();
            } else if (aVarP instanceof f.a.Empty) {
                rVarH.X(-1578999316);
                i((f.a.Empty) aVarP, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarP instanceof f.a.Error)) {
                    rVarH.X(-1579005816);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1578996055);
                ((f.a.Error) aVarP).getErrorVMS().b(rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: q32.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.q(fVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final f.a p(f6<? extends f.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(f fVar, int i15, p076m2.r rVar, int i16) {
        o(fVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
