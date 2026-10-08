package pj2;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.m3;
import d1.p3;
import d1.q3;
import h30.ButtonData;
import mx.Label;
import n3.o1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.C6461wc;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001aa\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\nH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lmx/a;", "title", "downloadButtonText", "closeButtonText", "", "url", "Lkotlin/Function0;", "Loq/i0;", "onDownloadPdfClick", "onCloseClick", "Lkotlin/Function1;", "openUrl", "f", "(Lmx/a;Lmx/a;Lmx/a;Ljava/lang/String;Ler/a;Ler/a;Ler/l;Lm2/r;I)V", "", "backgroundColor", "i", "(Ljava/lang/String;ILer/l;Lm2/r;I)V", "legalinformation_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"pj2/h$a", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", "Landroid/webkit/WebResourceRequest;", "request", "", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "legalinformation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.l<String, oq.i0> f157993a;

        /* JADX WARN: Multi-variable type inference failed */
        a(er.l<? super String, oq.i0> lVar) {
            this.f157993a = lVar;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            if (request == null) {
                return true;
            }
            this.f157993a.b(request.getUrl().toString());
            return true;
        }
    }

    public static final void f(final Label label, final Label label2, final Label label3, final String str, final er.a<oq.i0> aVar, final er.a<oq.i0> aVar2, final er.l<? super String, oq.i0> lVar, p076m2.r rVar, final int i15) {
        int i16;
        float spacing100;
        p076m2.r rVarH = rVar.h(419284573);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(label) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(label2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.W(label3) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.W(str) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.G(aVar) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i16 |= rVarH.G(aVar2) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((1572864 & i15) == 0) {
            i16 |= rVarH.G(lVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if (rVarH.r((599187 & i16) != 599186, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(419284573, i16, -1, "pl.gov.coi.mobywatel.feature.legalinformation.presentation.screens.LegalInformationBottomSheetContent (LegalInformationBottomSheetContent.kt:47)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarC = androidx.compose.foundation.layout.d.c(companion, 0.9f);
            k70.a aVar3 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarD = w0.i.d(mVarC, aVar3.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().c(), null, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarD);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            int i18 = i16;
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
            d1.i0 i0Var = d1.i0.f39176a;
            f3.m mVarQ = a3.q(companion, aVar3.b(rVarH, i17).getSpacing250(), aVar3.b(rVarH, i17).getSpacing200(), aVar3.b(rVarH, i17).getSpacing250(), aVar3.b(rVarH, i17).getSpacing100());
            w0 w0VarB = m3.b(iVar.j(), companion2.i(), rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarQ);
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
            n6.i(rVarC2, w0VarB, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            j70.h.g(p3.c(q3.f39261a, companion, 1.0f, false, 2, null), null, label, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVarH, i17).j(), null, null, false, false, null, rVarH, (i18 << 6) & 896, 0, 0, 33030138);
            boolean z15 = (i18 & 458752) == 131072;
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: pj2.c
                    @Override // er.a
                    public final Object a() {
                        return h.g(aVar2);
                    }
                };
                rVarH.v(objE);
            }
            C6461wc.c((er.a) objE, null, false, null, null, null, b.f157936a.b(), rVarH, 1572864, 62);
            rVarH.x();
            f3.m mVarB = d1.h0.b(i0Var, companion, 1.0f, false, 2, null);
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = f3.j.e(rVarH, mVarB);
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
            n6.i(rVarC3, w0VarA2, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            i(str, o1.j(Color.INSTANCE.i()), lVar, rVarH, ((i18 >> 9) & 14) | 48 | ((i18 >> 12) & 896));
            rVarH.x();
            float spacing250 = aVar3.b(rVarH, i17).getSpacing250();
            if (label2 == null) {
                rVarH.X(-1924476605);
                spacing100 = aVar3.b(rVarH, i17).getSpacing250();
                rVarH.R();
            } else {
                rVarH.X(-1924415101);
                spacing100 = aVar3.b(rVarH, i17).getSpacing100();
                rVarH.R();
            }
            f3.m mVarQ2 = a3.q(companion, aVar3.b(rVarH, i17).getSpacing250(), spacing250, aVar3.b(rVarH, i17).getSpacing250(), spacing100);
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT4 = rVarH.t();
            f3.m mVarE4 = f3.j.e(rVarH, mVarQ2);
            er.a<androidx.compose.ui.node.c> aVarB4 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB4);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC4 = n6.c(rVarH);
            n6.i(rVarC4, w0VarI, companion3.d());
            n6.i(rVarC4, e0VarT4, companion3.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion3.c());
            n6.g(rVarC4, companion3.a());
            n6.i(rVarC4, mVarE4, companion3.e());
            d1.x xVar = d1.x.f39368a;
            k30.a.Large large = new k30.a.Large(false, 1, null);
            k30.d.a aVar4 = k30.d.a.f107773a;
            rVarH = rVarH;
            h30.q.p(new ButtonData(null, null, large, new k30.c.WithText(label3, null, 2, null), aVar4, null, aVar2, 35, null), false, null, rVarH, 0, 6);
            rVarH.x();
            if (label2 == null) {
                rVarH.X(-1923919288);
            } else {
                rVarH.X(-1923919287);
                f3.m mVarR = a3.r(companion, aVar3.b(rVarH, i17).getSpacing250(), 0.0f, aVar3.b(rVarH, i17).getSpacing250(), aVar3.b(rVarH, i17).getSpacing250(), 2, null);
                w0 w0VarI2 = d1.r.i(companion2.o(), false);
                int iHashCode5 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT5 = rVarH.t();
                f3.m mVarE5 = f3.j.e(rVarH, mVarR);
                er.a<androidx.compose.ui.node.c> aVarB5 = companion3.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB5);
                } else {
                    rVarH.u();
                }
                p076m2.r rVarC5 = n6.c(rVarH);
                n6.i(rVarC5, w0VarI2, companion3.d());
                n6.i(rVarC5, e0VarT5, companion3.f());
                n6.i(rVarC5, Integer.valueOf(iHashCode5), companion3.c());
                n6.g(rVarC5, companion3.a());
                n6.i(rVarC5, mVarE5, companion3.e());
                h30.q.p(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(label2, null, 2, null), aVar4, null, aVar, 35, null), false, null, rVarH, 0, 6);
                rVarH.x();
                oq.i0 i0Var2 = oq.i0.f148189a;
            }
            rVarH.R();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: pj2.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.h(label, label2, label3, str, aVar, aVar2, lVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(er.a aVar) {
        aVar.a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(Label label, Label label2, Label label3, String str, er.a aVar, er.a aVar2, er.l lVar, int i15, p076m2.r rVar, int i16) {
        f(label, label2, label3, str, aVar, aVar2, lVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void i(final String str, final int i15, final er.l<? super String, oq.i0> lVar, p076m2.r rVar, final int i16) {
        int i17;
        p076m2.r rVarH = rVar.h(-656791796);
        if ((i16 & 6) == 0) {
            i17 = (rVarH.W(str) ? 4 : 2) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i17 |= rVarH.c(i15) ? 32 : 16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.G(lVar) ? 256 : 128;
        }
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-656791796, i17, -1, "pl.gov.coi.mobywatel.feature.legalinformation.presentation.screens.LegalInformationWebView (LegalInformationBottomSheetContent.kt:146)");
            }
            boolean z15 = ((i17 & 896) == 256) | ((i17 & 112) == 32);
            int i18 = i17 & 14;
            boolean z16 = z15 | (i18 == 4);
            Object objE = rVarH.E();
            if (z16 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: pj2.e
                    @Override // er.l
                    public final Object b(Object obj) {
                        return h.j(i15, str, lVar, (Context) obj);
                    }
                };
                rVarH.v(objE);
            }
            er.l lVar2 = (er.l) objE;
            boolean z17 = i18 == 4;
            Object objE2 = rVarH.E();
            if (z17 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: pj2.f
                    @Override // er.l
                    public final Object b(Object obj) {
                        return h.k(str, (l0) obj);
                    }
                };
                rVarH.v(objE2);
            }
            androidx.compose.ui.viewinterop.e.b(lVar2, null, (er.l) objE2, rVarH, 0, 2);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: pj2.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.l(str, i15, lVar, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l0 j(int i15, String str, er.l lVar, Context context) {
        l0 l0Var = new l0(context, null, 2, null);
        l0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        l0Var.setLayerType(2, null);
        l0Var.setWebViewClient(new a(lVar));
        l0Var.setBackgroundColor(i15);
        l0Var.setVerticalScrollBarEnabled(true);
        l0Var.setHorizontalScrollBarEnabled(false);
        l0Var.loadUrl(str);
        return l0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(String str, l0 l0Var) {
        l0Var.loadUrl(str);
        l0Var.pageUp(true);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(String str, int i15, er.l lVar, int i16, p076m2.r rVar, int i17) {
        i(str, i15, lVar, rVar, g4.a(i16 | 1));
        return oq.i0.f148189a;
    }
}
