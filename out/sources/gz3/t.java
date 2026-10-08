package gz3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.widget.TextView;
import d1.a3;
import d1.d3;
import d1.m3;
import d1.q3;
import d1.r3;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q4.TextStyle;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001c²\u0006\f\u0010\u001b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lgz3/j;", "viewModel", "", "testMode", "Loq/i0;", "n", "(Lgz3/j;ZLm2/r;I)V", "Lgz3/j$a;", "data", "Li70/p;", "snackBarState", "Lkotlin/Function0;", "onSnackBarHidden", "r", "(Lgz3/j$a;Li70/p;Ler/a;ZLm2/r;I)V", "Lh30/a;", "saveButtonData", "x", "(Lh30/a;Lm2/r;I)V", "Lgz3/j$b;", "loadDataError", "v", "(Lgz3/j$b;Lm2/r;I)V", "Lw70/c;", "load", "j", "(Lw70/c;Lm2/r;I)V", "state", "webpreview_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class t {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<oq.i0> {
        a(Object obj) {
            super(0, obj, j.class, "hideSnackBar", "hideSnackBar()V", 0);
        }

        public final void E() {
            ((j) this.f66391b).B0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            E();
            return oq.i0.f148189a;
        }
    }

    private static final void j(final w70.c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1015773254);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1015773254, i16, -1, "pl.gov.coi.mobywatel.segment.webpreview.presentation.TestModeWebView (WebPreviewScreen.kt:153)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarS = t70.i.S(a3.n(w0.i.d(companion, aVar.a(rVarH, i17).getNeutral().c(), null, 2, null), aVar.b(rVarH, i17).getSpacing100()), null, rVarH, 0, 1);
            Object objE = rVarH.E();
            p076m2.r.Companion companion2 = p076m2.r.INSTANCE;
            if (objE == companion2.a()) {
                objE = new er.l() { // from class: gz3.p
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t.k((Context) obj);
                    }
                };
                rVarH.v(objE);
            }
            er.l lVar = (er.l) objE;
            boolean z15 = (i16 & 14) == 4;
            Object objE2 = rVarH.E();
            if (z15 || objE2 == companion2.a()) {
                objE2 = new er.l() { // from class: gz3.q
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t.l(cVar, (TextView) obj);
                    }
                };
                rVarH.v(objE2);
            }
            androidx.compose.ui.viewinterop.e.b(lVar, mVarS, (er.l) objE2, rVarH, 6, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: gz3.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.m(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView k(Context context) {
        return new TextView(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(w70.c cVar, TextView textView) {
        CharSequence url;
        textView.setTextColor(ColorStateList.valueOf(Color.parseColor("#000000")));
        if (cVar instanceof w70.c.HtmlData) {
            url = h6.b.a(((w70.c.HtmlData) cVar).getData(), 63);
        } else if (cVar instanceof w70.c.Url) {
            url = ((w70.c.Url) cVar).getUrl();
        } else {
            if (!(cVar instanceof w70.c.Post)) {
                throw new oq.p();
            }
            url = ((w70.c.Post) cVar).getUrl();
        }
        textView.setText(url);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(w70.c cVar, int i15, p076m2.r rVar, int i16) {
        j(cVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void n(final j jVar, boolean z15, p076m2.r rVar, final int i15) {
        int i16;
        final boolean z16;
        p076m2.r rVarH = rVar.h(-1185496788);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(jVar) : rVarH.G(jVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.a(z15) ? 32 : 16;
        }
        boolean z17 = true;
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1185496788, i16, -1, "pl.gov.coi.mobywatel.segment.webpreview.presentation.WebPreviewScreen (WebPreviewScreen.kt:43)");
            }
            f6 f6VarC = m7.b.c(jVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(jVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            j.Data dataO = o(f6VarC);
            i70.p pVarP = p(f6VarB);
            if ((i16 & 14) != 4 && ((i16 & 8) == 0 || !rVarH.G(jVar))) {
                z17 = false;
            }
            Object objE = rVarH.E();
            if (z17 || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(jVar);
                rVarH.v(objE);
            }
            z16 = z15;
            r(dataO, pVarP, (er.a) ((mr.g) objE), z16, rVarH, (i16 << 6) & 7168);
            cb4.i vmsAdapter = o(f6VarC).getVmsAdapter();
            if (vmsAdapter == null) {
                rVarH.X(381712333);
            } else {
                rVarH.X(-1096065356);
                vmsAdapter.b(rVarH, 0);
            }
            rVarH.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            z16 = z15;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: gz3.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.q(jVar, z16, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final j.Data o(f6<j.Data> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p p(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(j jVar, boolean z15, int i15, p076m2.r rVar, int i16) {
        n(jVar, z15, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void r(final j.Data data, i70.p pVar, final er.a<oq.i0> aVar, final boolean z15, p076m2.r rVar, final int i15) {
        int i16;
        final i70.p pVar2 = pVar;
        p076m2.r rVarH = rVar.h(-1535122653);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.a(z15) ? 2048 : 1024;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1535122653, i16, -1, "pl.gov.coi.mobywatel.segment.webpreview.presentation.WebPreviewScreenContent (WebPreviewScreen.kt:65)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar = (al) objE;
            i70.m.d(alVar, pVar2, aVar, null, null, rVarH, (i16 & 112) | 6 | (i16 & 896), 24);
            pVar2 = pVar2;
            i50.s.r(data.getBaseScaffoldData(), null, y2.m.d(1968286745, true, new er.p() { // from class: gz3.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.s(alVar, pVar2, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1568893776, true, new er.q() { // from class: gz3.m
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return t.t(data, z15, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: gz3.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.u(data, pVar2, aVar, z15, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1968286745, i15, -1, "pl.gov.coi.mobywatel.segment.webpreview.presentation.WebPreviewScreenContent.<anonymous> (WebPreviewScreen.kt:75)");
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
    public static final oq.i0 t(j.Data data, boolean z15, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1568893776, i15, -1, "pl.gov.coi.mobywatel.segment.webpreview.presentation.WebPreviewScreenContent.<anonymous> (WebPreviewScreen.kt:78)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(companion, d3Var);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
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
            f3.m mVarB = d1.h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null);
            w0 w0VarB = m3.b(iVar.j(), companion2.l(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarB);
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
            n6.i(rVarC2, w0VarB, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            q3 q3Var = q3.f39261a;
            if (z15) {
                rVar.X(-1717324479);
                j(data.getLoad(), rVar, 0);
                rVar.R();
            } else {
                rVar.X(-1717383069);
                w70.l.d(data.getLoad(), rVar, 0);
                rVar.R();
            }
            rVar.x();
            ButtonData saveButtonData = data.getSaveButtonData();
            if (saveButtonData == null) {
                rVar.X(-819484884);
            } else {
                rVar.X(-819484883);
                x(saveButtonData, rVar, 0);
            }
            rVar.R();
            j.LoadDataError loadDataError = data.getLoadDataError();
            if (loadDataError == null) {
                rVar.X(-819379670);
            } else {
                rVar.X(-819379669);
                v(loadDataError, rVar, 0);
            }
            rVar.R();
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
    public static final oq.i0 u(j.Data data, i70.p pVar, er.a aVar, boolean z15, int i15, p076m2.r rVar, int i16) {
        r(data, pVar, aVar, z15, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void v(final j.LoadDataError loadDataError, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(880709528);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(loadDataError) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(880709528, i16, -1, "pl.gov.coi.mobywatel.segment.webpreview.presentation.WebPreviewScreenLoadDataError (WebPreviewScreen.kt:116)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarN = a3.n(w0.i.d(mVarF, aVar.a(rVarH, i17).getBase().a(), null, 2, null), aVar.b(rVarH, i17).getSpacing200());
            f3.c.Companion companion2 = f3.c.INSTANCE;
            f3.c.b bVarG = companion2.g();
            d1.i iVar = d1.i.f39152a;
            w0 w0VarA = d1.e0.a(iVar.e(), bVarG, rVarH, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarN);
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
            f3.m mVarB = d1.h0.b(d1.i0.f39176a, androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), 1.0f, false, 2, null);
            w0 w0VarA2 = d1.e0.a(iVar.e(), companion2.g(), rVarH, 54);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarB);
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
            Label errorTitle = loadDataError.getErrorTitle();
            TextStyle textStyleI = aVar.f(rVarH, i17).i();
            b5.j.Companion companion4 = b5.j.INSTANCE;
            rVar2 = rVarH;
            j70.h.g(null, null, errorTitle, null, null, 0L, 0L, null, null, null, 0L, null, b5.j.h(companion4.a()), 0L, 0, false, 0, 0, null, textStyleI, null, null, false, false, null, rVar2, 0, 0, 0, 33026043);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300()), rVar2, 0);
            j70.h.g(null, null, loadDataError.getErrorDescription(), null, null, 0L, 0L, null, null, null, 0L, null, b5.j.h(companion4.a()), 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).b(), null, null, false, false, null, rVar2, 0, 0, 0, 33026043);
            rVar2.x();
            h30.q.p(loadDataError.getRefreshButton(), false, null, rVar2, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing150()), rVar2, 0);
            h30.q.p(loadDataError.getErrorActionButton(), false, null, rVar2, 0, 6);
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
            d5VarM.a(new er.p() { // from class: gz3.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.w(loadDataError, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(j.LoadDataError loadDataError, int i15, p076m2.r rVar, int i16) {
        v(loadDataError, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void x(ButtonData buttonData, p076m2.r rVar, final int i15) {
        int i16;
        final ButtonData buttonData2;
        p076m2.r rVarH = rVar.h(1106831563);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(buttonData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1106831563, i16, -1, "pl.gov.coi.mobywatel.segment.webpreview.presentation.WebPreviewScreenSaveButton (WebPreviewScreen.kt:102)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            f3.m mVarP = a3.p(companion, aVar.b(rVarH, i17).getSpacing200(), 0.0f, 2, null);
            w0 w0VarB = m3.b(d1.i.f39152a.j(), f3.c.INSTANCE.l(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarP);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarB, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            q3 q3Var = q3.f39261a;
            buttonData2 = buttonData;
            h30.q.p(buttonData2, false, null, rVarH, i16 & 14, 6);
            rVarH.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            buttonData2 = buttonData;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: gz3.s
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.y(buttonData2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(ButtonData buttonData, int i15, p076m2.r rVar, int i16) {
        x(buttonData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
