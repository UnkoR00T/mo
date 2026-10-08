package w70;

import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lw70/c;", "load", "Loq/i0;", "d", "(Lw70/c;Lm2/r;I)V", "Landroid/webkit/WebView;", "Lw70/h;", "h", "(Landroid/webkit/WebView;)Lw70/h;", "webview_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J9\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"w70/l$a", "Landroid/webkit/WebChromeClient;", "Landroid/webkit/WebView;", "webView", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "filePathCallback", "Landroid/webkit/WebChromeClient$FileChooserParams;", "fileChooserParams", "", "onShowFileChooser", "(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z", "webview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends WebChromeClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w70.c f210862a;

        a(w70.c cVar) {
            this.f210862a = cVar;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            if (filePathCallback == null) {
                return true;
            }
            this.f210862a.getActions().b8(filePathCallback);
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"w70/l$b", "Lw70/q;", "Loq/i0;", "a", "()V", "webview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w70.c f210863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebView f210864b;

        b(w70.c cVar, WebView webView) {
            this.f210863a = cVar;
            this.f210864b = webView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 c(WebView webView) {
            webView.goBack();
            return i0.f148189a;
        }

        @Override // w70.q
        public void a() {
            n actions = this.f210863a.getActions();
            String url = this.f210864b.getUrl();
            if (url == null) {
                url = "";
            }
            boolean zCanGoBack = this.f210864b.canGoBack();
            final WebView webView = this.f210864b;
            actions.M1(url, zCanGoBack, new er.a() { // from class: w70.m
                @Override // er.a
                public final Object a() {
                    return l.b.c(webView);
                }
            });
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f210865a;

        static {
            int[] iArr = new int[p.a.values().length];
            try {
                iArr[p.a.ALLOW_REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.a.ONLY_LOAD_FIRST_PAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.a.ONLY_LOAD_IF_NEW_PAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f210865a = iArr;
        }
    }

    public static final void d(final w70.c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(697767059);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(697767059, i16, -1, "pl.gov.coi.common.webview.SecureWebView (SecureWebView.kt:86)");
            }
            f3.m mVarB = k3.f.b(f3.m.INSTANCE);
            int i17 = i16 & 14;
            boolean z15 = i17 == 4;
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: w70.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return l.e(cVar, (Context) obj);
                    }
                };
                rVarH.v(objE);
            }
            er.l lVar = (er.l) objE;
            boolean z16 = i17 == 4;
            Object objE2 = rVarH.E();
            if (z16 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: w70.j
                    @Override // er.l
                    public final Object b(Object obj) {
                        return l.f(cVar, (WebView) obj);
                    }
                };
                rVarH.v(objE2);
            }
            androidx.compose.ui.viewinterop.e.b(lVar, mVarB, (er.l) objE2, rVarH, 48, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: w70.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.g(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView e(w70.c cVar, Context context) {
        WebView webView = new WebView(context);
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        webView.setWebViewClient(new h(cVar.getConfiguration(), cVar.getActions(), cVar.d()));
        return webView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(w70.c cVar, WebView webView) {
        webView.setLayerType(cVar.getConfiguration().i() ? 1 : 2, null);
        webView.getSettings().setAllowFileAccess(cVar.getConfiguration().h());
        webView.getSettings().setJavaScriptEnabled(cVar.getConfiguration().b());
        webView.getSettings().setDomStorageEnabled(cVar.getConfiguration().g());
        webView.getSettings().setMixedContentMode(cVar.getConfiguration().e());
        webView.getSettings().setCacheMode(cVar.getConfiguration().c());
        String f150620b = cVar.getConfiguration().getF150620b();
        if (f150620b != null) {
            webView.getSettings().setUserAgentString(webView.getSettings().getUserAgentString() + ' ' + f150620b);
        }
        webView.setDownloadListener(h(webView).getDownloadListener());
        webView.setWebChromeClient(new a(cVar));
        cVar.e(new b(cVar, webView));
        if (cVar instanceof w70.c.Url) {
            w70.c.Url url = (w70.c.Url) cVar;
            int i15 = c.f210865a[url.getConfiguration().j().ordinal()];
            if (i15 == 1) {
                webView.loadUrl(url.getUrl(), url.f());
            } else if (i15 == 2) {
                String url2 = webView.getUrl();
                if (url2 == null || url2.length() == 0) {
                    webView.loadUrl(url.getUrl(), url.f());
                }
            } else {
                if (i15 != 3) {
                    throw new oq.p();
                }
                if (!fr.t.c(url.getUrl(), webView.getUrl())) {
                    webView.loadUrl(url.getUrl(), url.f());
                }
            }
        } else if (cVar instanceof w70.c.Post) {
            w70.c.Post post = (w70.c.Post) cVar;
            webView.postUrl(post.getUrl(), post.getPostData().getData());
        } else {
            if (!(cVar instanceof w70.c.HtmlData)) {
                throw new oq.p();
            }
            w70.c.HtmlData htmlData = (w70.c.HtmlData) cVar;
            webView.loadDataWithBaseURL(htmlData.getBaseUrl(), htmlData.getData(), htmlData.getMimeType(), htmlData.getEncoding(), htmlData.getHistoryUrl());
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(w70.c cVar, int i15, p076m2.r rVar, int i16) {
        d(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final h h(WebView webView) {
        return (h) webView.getWebViewClient();
    }
}
