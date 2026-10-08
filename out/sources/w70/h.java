package w70;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import bz.DownloadFileData;
import iy.c0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 12\u00020\u0001:\u00012B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0015\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010 \u001a\u0004\u0018\u00010\u001c2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u0017\u00100\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00063"}, d2 = {"Lw70/h;", "Landroidx/webkit/WebViewClientCompat;", "Lw70/o;", "configuration", "Lw70/n;", "webViewActions", "", "", "overrideUrlScheme", "<init>", "(Lw70/o;Lw70/n;Ljava/util/List;)V", "Landroid/webkit/WebView;", "view", "url", "Loq/i0;", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Landroid/webkit/SslErrorHandler;", "handler", "Landroid/net/http/SslError;", "error", "onReceivedSslError", "(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V", "Landroid/webkit/WebResourceRequest;", "request", "", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "Landroid/webkit/WebResourceResponse;", "errorResponse", "onReceivedHttpError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V", "shouldInterceptRequest", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "b", "Lw70/o;", "c", "Lw70/n;", "d", "Ljava/util/List;", "Lw70/b;", "e", "interceptIgnoreSuffixes", "Landroid/webkit/DownloadListener;", "f", "Landroid/webkit/DownloadListener;", "h", "()Landroid/webkit/DownloadListener;", "downloadListener", "g", "a", "webview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h extends WebViewClientCompat {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f210852h = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o configuration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final n webViewActions;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<String> overrideUrlScheme;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<Suffix> interceptIgnoreSuffixes;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final DownloadListener downloadListener;

    public h(o oVar, n nVar, List<String> list) {
        this.configuration = oVar;
        this.webViewActions = nVar;
        this.overrideUrlScheme = list;
        List<Object> listF = oVar.f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            if (obj instanceof Suffix) {
                arrayList.add(obj);
            }
        }
        this.interceptIgnoreSuffixes = arrayList;
        this.downloadListener = new DownloadListener() { // from class: w70.f
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j15) {
                h.g(this.f210850a, str, str2, str3, str4, j15);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(h hVar, String str, String str2, String str3, String str4, long j15) {
        hVar.webViewActions.O1(new DownloadFileData(str == null ? "" : str, CookieManager.getInstance().getCookie(str), str4, str3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(WebView webView, String str) {
        webView.evaluateJavascript(str, new ValueCallback() { // from class: w70.g
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                h.j((String) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(h hVar, String str, WebView webView, String str2) {
        px.f.f163100a.b("onPageFinished, content: " + str2, px.c.a(hVar));
        n nVar = hVar.webViewActions;
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        nVar.n1(str, c0.g(str2), webView.getTitle());
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final DownloadListener getDownloadListener() {
        return this.downloadListener;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(final WebView view, final String url) {
        super.onPageFinished(view, url);
        px.f.f163100a.b("onPageFinished, url: " + url, px.c.a(this));
        if (view != null) {
            this.webViewActions.N7(url, new er.l() { // from class: w70.d
                @Override // er.l
                public final Object b(Object obj) {
                    return h.i(view, (String) obj);
                }
            });
        }
        if (view != null) {
            view.evaluateJavascript("(function(){return window.document.body.outerHTML})();", new ValueCallback() { // from class: w70.e
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    h.k(this.f210847a, url, view, (String) obj);
                }
            });
        }
    }

    @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        this.webViewActions.R2(errorResponse.getStatusCode());
        super.onReceivedHttpError(view, request, errorResponse);
    }

    @Override // android.webkit.WebViewClient
    @SuppressLint({"WebViewClientOnReceivedSslError"})
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        if (!this.configuration.getF163107a()) {
            if (handler != null) {
                handler.proceed();
                return;
            }
            return;
        }
        if (error != null) {
            px.f fVar = px.f.f163100a;
            fVar.b("ssl error, url: " + error.getUrl(), px.c.a(error));
            fVar.b("ssl error, primaryError: " + error.getPrimaryError(), px.c.a(error));
            fVar.b("ssl error, certificate: " + error.getCertificate(), px.c.a(error));
            this.webViewActions.f6(error.getUrl(), error.getPrimaryError(), error.getCertificate());
        }
        super.onReceivedSslError(view, handler, error);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        Uri url;
        String string;
        this.webViewActions.z7(request != null ? request.getUrl() : null);
        if (request != null && (url = request.getUrl()) != null && (string = url.toString()) != null) {
            List<Suffix> list = this.interceptIgnoreSuffixes;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (fu.r.E(string, '.' + ((Suffix) it.next()).getSuffix(), true)) {
                        return new WebResourceResponse("text/plain", "UTF-8", null);
                    }
                }
            }
        }
        return super.shouldInterceptRequest(view, request);
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        String string = request.getUrl().toString();
        String scheme = Uri.parse(string).getScheme();
        px.f fVar = px.f.f163100a;
        fVar.b("shouldOverrideUrlLoading, url: " + string, px.c.a(this));
        fVar.b("shouldOverrideUrlLoading, scheme: " + scheme, px.c.a(this));
        if (scheme == null || !this.overrideUrlScheme.contains(scheme)) {
            return false;
        }
        this.webViewActions.c2(scheme, request.getUrl());
        return true;
    }
}
