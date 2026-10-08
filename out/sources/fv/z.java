package fv;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 %2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0013\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00128G¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00188G¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8G¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8G¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R\u0017\u0010,\u001a\u00020'8G¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u00102\u001a\u00020-8G¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u00108\u001a\u0002038G¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010;\u001a\u00020-8G¢\u0006\f\n\u0004\b9\u0010/\u001a\u0004\b:\u00101R\u0017\u0010>\u001a\u00020-8G¢\u0006\f\n\u0004\b<\u0010/\u001a\u0004\b=\u00101R\u0017\u0010D\u001a\u00020?8G¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010J\u001a\u00020E8G¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010P\u001a\u0004\u0018\u00010K8G¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010V\u001a\u00020Q8G¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010X\u001a\u0002038G¢\u0006\f\n\u0004\b\u001a\u00105\u001a\u0004\bW\u00107R\u0017\u0010^\u001a\u00020Y8G¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0016\u0010b\u001a\u0004\u0018\u00010_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0019\u0010g\u001a\u0004\u0018\u00010c8G¢\u0006\f\n\u0004\bB\u0010d\u001a\u0004\be\u0010fR\u001d\u0010i\u001a\b\u0012\u0004\u0012\u00020h0\u001d8G¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\bZ\u0010\"R\u001d\u0010l\u001a\b\u0012\u0004\u0012\u00020j0\u001d8G¢\u0006\f\n\u0004\bH\u0010 \u001a\u0004\bk\u0010\"R\u0017\u0010q\u001a\u00020m8G¢\u0006\f\n\u0004\b*\u0010n\u001a\u0004\bo\u0010pR\u0017\u0010u\u001a\u00020r8G¢\u0006\f\n\u0004\b:\u0010s\u001a\u0004\bR\u0010tR\u0019\u0010y\u001a\u0004\u0018\u00010v8G¢\u0006\f\n\u0004\b=\u0010w\u001a\u0004\bL\u0010xR\u0017\u0010~\u001a\u00020z8G¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\bF\u0010}R\u0018\u0010\u0080\u0001\u001a\u00020z8G¢\u0006\f\n\u0004\bo\u0010|\u001a\u0004\b\u007f\u0010}R\u001a\u0010\u0083\u0001\u001a\u00020z8G¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010|\u001a\u0005\b\u0082\u0001\u0010}R\u001a\u0010\u0086\u0001\u001a\u00020z8G¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010|\u001a\u0005\b\u0085\u0001\u0010}R\u0018\u0010\u0087\u0001\u001a\u00020z8G¢\u0006\f\n\u0004\b!\u0010|\u001a\u0004\b|\u0010}R\u001c\u0010\u008c\u0001\u001a\u00030\u0088\u00018G¢\u0006\u000f\n\u0005\b\u0089\u0001\u0010k\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001c\u0010\u0090\u0001\u001a\u00030\u008d\u00018\u0006¢\u0006\u000f\n\u0006\b\u008a\u0001\u0010\u008e\u0001\u001a\u0005\b{\u0010\u008f\u0001R\u001e\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0091\u00018G¢\u0006\u000f\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0005\b<\u0010\u0094\u0001R\u0014\u0010\u0097\u0001\u001a\u00020_8G¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001¨\u0006\u0098\u0001"}, d2 = {"Lfv/z;", "", "Lfv/e$a;", "", "Lfv/z$a;", "builder", "<init>", "(Lfv/z$a;)V", "()V", "Loq/i0;", "T", "Lfv/b0;", "request", "Lfv/e;", "b", "(Lfv/b0;)Lfv/e;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "()Lfv/z$a;", "Lfv/p;", "a", "Lfv/p;", "t", "()Lfv/p;", "dispatcher", "Lfv/k;", "Lfv/k;", "p", "()Lfv/k;", "connectionPool", "", "Lfv/w;", "c", "Ljava/util/List;", ip.a.f96138c, "()Ljava/util/List;", "interceptors", "d", "G", "networkInterceptors", "Lfv/r$c;", "e", "Lfv/r$c;", "w", "()Lfv/r$c;", "eventListenerFactory", "", "f", "Z", "Q", "()Z", "retryOnConnectionFailure", "Lfv/b;", "g", "Lfv/b;", "i", "()Lfv/b;", "authenticator", "h", "x", "followRedirects", "j", "y", "followSslRedirects", "Lfv/n;", "k", "Lfv/n;", "s", "()Lfv/n;", "cookieJar", "Lfv/q;", "l", "Lfv/q;", "v", "()Lfv/q;", "dns", "Ljava/net/Proxy;", "m", "Ljava/net/Proxy;", "K", "()Ljava/net/Proxy;", "proxy", "Ljava/net/ProxySelector;", "n", "Ljava/net/ProxySelector;", "O", "()Ljava/net/ProxySelector;", "proxySelector", "N", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "q", "Ljavax/net/SocketFactory;", "R", "()Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "r", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactoryOrNull", "Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/X509TrustManager;", "W", "()Ljavax/net/ssl/X509TrustManager;", "x509TrustManager", "Lfv/l;", "connectionSpecs", "Lfv/a0;", "J", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "A", "()Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lfv/g;", "Lfv/g;", "()Lfv/g;", "certificatePinner", "Lsv/c;", "Lsv/c;", "()Lsv/c;", "certificateChainCleaner", "", "z", "I", "()I", "callTimeoutMillis", "o", "connectTimeoutMillis", "B", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "readTimeoutMillis", "C", "U", "writeTimeoutMillis", "pingIntervalMillis", "", "E", "F", "()J", "minWebSocketMessageToCompress", "Lkv/h;", "Lkv/h;", "()Lkv/h;", "routeDatabase", "Lfv/c;", "cache", "Lfv/c;", "()Lfv/c;", ip.a.f96137b, "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class z implements Cloneable, e.a {

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<a0> H = gv.d.w(a0.HTTP_2, a0.HTTP_1_1);
    private static final List<l> I = gv.d.w(l.f67446i, l.f67448k);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final int connectTimeoutMillis;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final int readTimeoutMillis;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final int writeTimeoutMillis;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final int pingIntervalMillis;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final long minWebSocketMessageToCompress;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final kv.h routeDatabase;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p dispatcher;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k connectionPool;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<w> interceptors;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<w> networkInterceptors;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final r.c eventListenerFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean retryOnConnectionFailure;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final b authenticator;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean followRedirects;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean followSslRedirects;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final n cookieJar;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final q dns;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Proxy proxy;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ProxySelector proxySelector;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final b proxyAuthenticator;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final SocketFactory socketFactory;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final SSLSocketFactory sslSocketFactoryOrNull;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final X509TrustManager x509TrustManager;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final List<l> connectionSpecs;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final List<a0> protocols;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final HostnameVerifier hostnameVerifier;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final g certificatePinner;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final sv.c certificateChainCleaner;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final int callTimeoutMillis;

    /* JADX INFO: renamed from: fv.z$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lfv/z$b;", "", "<init>", "()V", "", "Lfv/a0;", "DEFAULT_PROTOCOLS", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lfv/l;", "DEFAULT_CONNECTION_SPECS", "a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final List<l> a() {
            return z.I;
        }

        public final List<a0> b() {
            return z.H;
        }

        private Companion() {
        }
    }

    public z(a aVar) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelector;
        aVar.j(new io.sentry.okhttp.b(aVar.getEventListenerFactory()));
        this.dispatcher = aVar.getDispatcher();
        this.connectionPool = aVar.getConnectionPool();
        this.interceptors = gv.d.S(aVar.B());
        this.networkInterceptors = gv.d.S(aVar.D());
        this.eventListenerFactory = aVar.getEventListenerFactory();
        this.retryOnConnectionFailure = aVar.getRetryOnConnectionFailure();
        this.authenticator = aVar.getAuthenticator();
        this.followRedirects = aVar.getFollowRedirects();
        this.followSslRedirects = aVar.getFollowSslRedirects();
        this.cookieJar = aVar.getCookieJar();
        aVar.n();
        this.dns = aVar.getDns();
        this.proxy = aVar.getProxy();
        if (aVar.getProxy() != null) {
            proxySelector = qv.a.f169021a;
        } else {
            proxySelector = aVar.getProxySelector();
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = qv.a.f169021a;
            }
        }
        this.proxySelector = proxySelector;
        this.proxyAuthenticator = aVar.getProxyAuthenticator();
        this.socketFactory = aVar.getSocketFactory();
        List<l> listT = aVar.t();
        this.connectionSpecs = listT;
        this.protocols = aVar.F();
        this.hostnameVerifier = aVar.getHostnameVerifier();
        this.callTimeoutMillis = aVar.getCallTimeout();
        this.connectTimeoutMillis = aVar.getConnectTimeout();
        this.readTimeoutMillis = aVar.getReadTimeout();
        this.writeTimeoutMillis = aVar.getWriteTimeout();
        this.pingIntervalMillis = aVar.getPingInterval();
        this.minWebSocketMessageToCompress = aVar.getMinWebSocketMessageToCompress();
        kv.h routeDatabase = aVar.getRouteDatabase();
        this.routeDatabase = routeDatabase == null ? new kv.h() : routeDatabase;
        List<l> list = listT;
        if ((list instanceof Collection) && list.isEmpty()) {
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = g.f67350d;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).getIsTls()) {
                    if (aVar.getSslSocketFactoryOrNull() != null) {
                        this.sslSocketFactoryOrNull = aVar.getSslSocketFactoryOrNull();
                        sv.c certificateChainCleaner = aVar.getCertificateChainCleaner();
                        this.certificateChainCleaner = certificateChainCleaner;
                        this.x509TrustManager = aVar.getX509TrustManagerOrNull();
                        this.certificatePinner = aVar.getCertificatePinner().e(certificateChainCleaner);
                    } else {
                        ov.h.Companion companion = ov.h.INSTANCE;
                        X509TrustManager x509TrustManagerO = companion.g().o();
                        this.x509TrustManager = x509TrustManagerO;
                        this.sslSocketFactoryOrNull = companion.g().n(x509TrustManagerO);
                        sv.c cVarA = sv.c.INSTANCE.a(x509TrustManagerO);
                        this.certificateChainCleaner = cVarA;
                        this.certificatePinner = aVar.getCertificatePinner().e(cVarA);
                    }
                }
            }
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = g.f67350d;
        }
        T();
    }

    private final void T() {
        if (this.interceptors.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + this.interceptors).toString());
        }
        if (this.networkInterceptors.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + this.networkInterceptors).toString());
        }
        List<l> list = this.connectionSpecs;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).getIsTls()) {
                    if (this.sslSocketFactoryOrNull == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.certificateChainCleaner == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.x509TrustManager == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.sslSocketFactoryOrNull != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.certificateChainCleaner != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.x509TrustManager != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!fr.t.c(this.certificatePinner, g.f67350d)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final List<w> D() {
        return this.interceptors;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final long getMinWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    public final List<w> G() {
        return this.networkInterceptors;
    }

    public a H() {
        return new a(this);
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final int getPingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    public final List<a0> J() {
        return this.protocols;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final b getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final boolean getRetryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory S() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    /* JADX INFO: renamed from: W, reason: from getter */
    public final X509TrustManager getX509TrustManager() {
        return this.x509TrustManager;
    }

    @Override // fv.e.a
    public e b(b0 request) {
        return new kv.e(this, request, false);
    }

    public Object clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final b getAuthenticator() {
        return this.authenticator;
    }

    public final c j() {
        return null;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getCallTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final sv.c getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final g getCertificatePinner() {
        return this.certificatePinner;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final k getConnectionPool() {
        return this.connectionPool;
    }

    public final List<l> q() {
        return this.connectionSpecs;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final n getCookieJar() {
        return this.cookieJar;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final p getDispatcher() {
        return this.dispatcher;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final q getDns() {
        return this.dns;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final r.c getEventListenerFactory() {
        return this.eventListenerFactory;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getFollowRedirects() {
        return this.followRedirects;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final boolean getFollowSslRedirects() {
        return this.followSslRedirects;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final kv.h getRouteDatabase() {
        return this.routeDatabase;
    }

    @Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\"\u001a\u00020\u00002\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u001d\u00100\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00002\u0006\u00103\u001a\u000202H\u0007¢\u0006\u0004\b4\u00105J\u001d\u00106\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b6\u00101J\u0017\u00107\u001a\u00020\u00002\u0006\u00103\u001a\u000202H\u0007¢\u0006\u0004\b7\u00105J\u001d\u00108\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b8\u00101J\u0017\u00109\u001a\u00020\u00002\u0006\u00103\u001a\u000202H\u0007¢\u0006\u0004\b9\u00105J\u001d\u0010:\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b:\u00101J\u0017\u0010;\u001a\u00020\u00002\u0006\u00103\u001a\u000202H\u0007¢\u0006\u0004\b;\u00105J\r\u0010<\u001a\u00020\u0004¢\u0006\u0004\b<\u0010=R\"\u0010D\u001a\u00020>8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010K\u001a\u00020E8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR \u0010P\u001a\b\u0012\u0004\u0012\u00020\u00070L8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010M\u001a\u0004\bN\u0010OR \u0010R\u001a\b\u0012\u0004\u0012\u00020\u00070L8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u0010M\u001a\u0004\bQ\u0010OR\"\u0010Y\u001a\u00020S8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010_\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010f\u001a\u00020`8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010Z\u001a\u0004\bg\u0010\\\"\u0004\bh\u0010^R\"\u0010k\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010Z\u001a\u0004\bi\u0010\\\"\u0004\bj\u0010^R\"\u0010r\u001a\u00020l8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010\u0016\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR$\u0010~\u001a\u0004\u0018\u00010x8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R*\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u007f8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bb\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R&\u0010\u0089\u0001\u001a\u00020`8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010a\u001a\u0005\b\u0087\u0001\u0010c\"\u0005\b\u0088\u0001\u0010eR*\u0010\u0091\u0001\u001a\u00030\u008a\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R+\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R+\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R,\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b \u0001\u0010M\u001a\u0005\b¡\u0001\u0010O\"\u0006\b¢\u0001\u0010£\u0001R-\u0010§\u0001\u001a\t\u0012\u0005\u0012\u00030¤\u00010\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\bG\u0010M\u001a\u0005\b¥\u0001\u0010O\"\u0006\b¦\u0001\u0010£\u0001R(\u0010%\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¡\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R'\u0010)\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bn\u0010\u00ad\u0001\u001a\u0006\b\u0099\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R+\u0010¶\u0001\u001a\u0005\u0018\u00010±\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b@\u0010²\u0001\u001a\u0006\b\u0092\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R)\u0010»\u0001\u001a\u00030·\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bt\u0010\u0081\u0001\u001a\u0006\b\u008b\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R)\u0010½\u0001\u001a\u00030·\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bU\u0010\u0081\u0001\u001a\u0006\b \u0001\u0010¸\u0001\"\u0006\b¼\u0001\u0010º\u0001R)\u0010À\u0001\u001a\u00030·\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bg\u0010\u0081\u0001\u001a\u0006\b¾\u0001\u0010¸\u0001\"\u0006\b¿\u0001\u0010º\u0001R)\u0010Ã\u0001\u001a\u00030·\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bi\u0010\u0081\u0001\u001a\u0006\bÁ\u0001\u0010¸\u0001\"\u0006\bÂ\u0001\u0010º\u0001R*\u0010Æ\u0001\u001a\u00030·\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b©\u0001\u0010\u0081\u0001\u001a\u0006\bÄ\u0001\u0010¸\u0001\"\u0006\bÅ\u0001\u0010º\u0001R(\u0010Ë\u0001\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bN\u0010¾\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001\"\u0006\bÉ\u0001\u0010Ê\u0001R,\u0010Ò\u0001\u001a\u0005\u0018\u00010Ì\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÇ\u0001\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001R,\u0010Ô\u0001\u001a\u0005\u0018\u00010Ó\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÔ\u0001\u0010Õ\u0001\u001a\u0006\b\u0086\u0001\u0010Ö\u0001\"\u0006\b×\u0001\u0010Ø\u0001¨\u0006Ù\u0001"}, d2 = {"Lfv/z$a;", "", "<init>", "()V", "Lfv/z;", "okHttpClient", "(Lfv/z;)V", "Lfv/w;", "interceptor", "a", "(Lfv/w;)Lfv/z$a;", "Lfv/r;", "eventListener", "j", "(Lfv/r;)Lfv/z$a;", "", "followRedirects", "k", "(Z)Lfv/z$a;", "followProtocolRedirects", "l", "Lfv/q;", "dns", "i", "(Lfv/q;)Lfv/z$a;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "T", "(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lfv/z$a;", "", "Lfv/l;", "connectionSpecs", "h", "(Ljava/util/List;)Lfv/z$a;", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Q", "(Ljavax/net/ssl/HostnameVerifier;)Lfv/z$a;", "Lfv/g;", "certificatePinner", "e", "(Lfv/g;)Lfv/z$a;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "c", "(JLjava/util/concurrent/TimeUnit;)Lfv/z$a;", "Ljava/time/Duration;", "duration", "d", "(Ljava/time/Duration;)Lfv/z$a;", "f", "g", "R", ip.a.f96137b, "U", "V", "b", "()Lfv/z;", "Lfv/p;", "Lfv/p;", "v", "()Lfv/p;", "setDispatcher$okhttp", "(Lfv/p;)V", "dispatcher", "Lfv/k;", "Lfv/k;", "s", "()Lfv/k;", "setConnectionPool$okhttp", "(Lfv/k;)V", "connectionPool", "", "Ljava/util/List;", "B", "()Ljava/util/List;", "interceptors", ip.a.f96138c, "networkInterceptors", "Lfv/r$c;", "Lfv/r$c;", "x", "()Lfv/r$c;", "setEventListenerFactory$okhttp", "(Lfv/r$c;)V", "eventListenerFactory", "Z", "K", "()Z", "setRetryOnConnectionFailure$okhttp", "(Z)V", "retryOnConnectionFailure", "Lfv/b;", "Lfv/b;", "m", "()Lfv/b;", "setAuthenticator$okhttp", "(Lfv/b;)V", "authenticator", "y", "setFollowRedirects$okhttp", "z", "setFollowSslRedirects$okhttp", "followSslRedirects", "Lfv/n;", "Lfv/n;", "u", "()Lfv/n;", "setCookieJar$okhttp", "(Lfv/n;)V", "cookieJar", "Lfv/q;", "w", "()Lfv/q;", "setDns$okhttp", "(Lfv/q;)V", "Ljava/net/Proxy;", "Ljava/net/Proxy;", "G", "()Ljava/net/Proxy;", "setProxy$okhttp", "(Ljava/net/Proxy;)V", "proxy", "Ljava/net/ProxySelector;", "Ljava/net/ProxySelector;", "I", "()Ljava/net/ProxySelector;", "setProxySelector$okhttp", "(Ljava/net/ProxySelector;)V", "proxySelector", "n", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "setProxyAuthenticator$okhttp", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "o", "Ljavax/net/SocketFactory;", "M", "()Ljavax/net/SocketFactory;", "setSocketFactory$okhttp", "(Ljavax/net/SocketFactory;)V", "socketFactory", "p", "Ljavax/net/ssl/SSLSocketFactory;", "N", "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactoryOrNull$okhttp", "(Ljavax/net/ssl/SSLSocketFactory;)V", "sslSocketFactoryOrNull", "q", "Ljavax/net/ssl/X509TrustManager;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "()Ljavax/net/ssl/X509TrustManager;", "setX509TrustManagerOrNull$okhttp", "(Ljavax/net/ssl/X509TrustManager;)V", "x509TrustManagerOrNull", "r", "t", "setConnectionSpecs$okhttp", "(Ljava/util/List;)V", "Lfv/a0;", "F", "setProtocols$okhttp", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "A", "()Ljavax/net/ssl/HostnameVerifier;", "setHostnameVerifier$okhttp", "(Ljavax/net/ssl/HostnameVerifier;)V", "Lfv/g;", "()Lfv/g;", "setCertificatePinner$okhttp", "(Lfv/g;)V", "Lsv/c;", "Lsv/c;", "()Lsv/c;", "setCertificateChainCleaner$okhttp", "(Lsv/c;)V", "certificateChainCleaner", "", "()I", "setCallTimeout$okhttp", "(I)V", "callTimeout", "setConnectTimeout$okhttp", "connectTimeout", "J", "setReadTimeout$okhttp", "readTimeout", "O", "setWriteTimeout$okhttp", "writeTimeout", "E", "setPingInterval$okhttp", "pingInterval", "C", "()J", "setMinWebSocketMessageToCompress$okhttp", "(J)V", "minWebSocketMessageToCompress", "Lkv/h;", "Lkv/h;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "()Lkv/h;", "setRouteDatabase$okhttp", "(Lkv/h;)V", "routeDatabase", "Lfv/c;", "cache", "Lfv/c;", "()Lfv/c;", "setCache$okhttp", "(Lfv/c;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        private int pingInterval;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        private long minWebSocketMessageToCompress;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        private kv.h routeDatabase;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private p dispatcher;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private k connectionPool;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<w> interceptors;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<w> networkInterceptors;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private r.c eventListenerFactory;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean retryOnConnectionFailure;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private b authenticator;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean followRedirects;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private boolean followSslRedirects;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private n cookieJar;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private q dns;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private Proxy proxy;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private ProxySelector proxySelector;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private b proxyAuthenticator;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private SocketFactory socketFactory;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private SSLSocketFactory sslSocketFactoryOrNull;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private X509TrustManager x509TrustManagerOrNull;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private List<l> connectionSpecs;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        private List<? extends a0> protocols;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private HostnameVerifier hostnameVerifier;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        private g certificatePinner;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        private sv.c certificateChainCleaner;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
        private int callTimeout;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
        private int connectTimeout;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
        private int readTimeout;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
        private int writeTimeout;

        public a() {
            this.dispatcher = new p();
            this.connectionPool = new k();
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.eventListenerFactory = gv.d.g(r.f67486b);
            this.retryOnConnectionFailure = true;
            b bVar = b.f67263b;
            this.authenticator = bVar;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = n.f67472b;
            this.dns = q.f67483b;
            this.proxyAuthenticator = bVar;
            this.socketFactory = SocketFactory.getDefault();
            Companion companion = z.INSTANCE;
            this.connectionSpecs = companion.a();
            this.protocols = companion.b();
            this.hostnameVerifier = sv.d.f184435a;
            this.certificatePinner = g.f67350d;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.minWebSocketMessageToCompress = 1024L;
        }

        /* JADX INFO: renamed from: A, reason: from getter */
        public final HostnameVerifier getHostnameVerifier() {
            return this.hostnameVerifier;
        }

        public final List<w> B() {
            return this.interceptors;
        }

        /* JADX INFO: renamed from: C, reason: from getter */
        public final long getMinWebSocketMessageToCompress() {
            return this.minWebSocketMessageToCompress;
        }

        public final List<w> D() {
            return this.networkInterceptors;
        }

        /* JADX INFO: renamed from: E, reason: from getter */
        public final int getPingInterval() {
            return this.pingInterval;
        }

        public final List<a0> F() {
            return this.protocols;
        }

        /* JADX INFO: renamed from: G, reason: from getter */
        public final Proxy getProxy() {
            return this.proxy;
        }

        /* JADX INFO: renamed from: H, reason: from getter */
        public final b getProxyAuthenticator() {
            return this.proxyAuthenticator;
        }

        /* JADX INFO: renamed from: I, reason: from getter */
        public final ProxySelector getProxySelector() {
            return this.proxySelector;
        }

        /* JADX INFO: renamed from: J, reason: from getter */
        public final int getReadTimeout() {
            return this.readTimeout;
        }

        /* JADX INFO: renamed from: K, reason: from getter */
        public final boolean getRetryOnConnectionFailure() {
            return this.retryOnConnectionFailure;
        }

        /* JADX INFO: renamed from: L, reason: from getter */
        public final kv.h getRouteDatabase() {
            return this.routeDatabase;
        }

        /* JADX INFO: renamed from: M, reason: from getter */
        public final SocketFactory getSocketFactory() {
            return this.socketFactory;
        }

        /* JADX INFO: renamed from: N, reason: from getter */
        public final SSLSocketFactory getSslSocketFactoryOrNull() {
            return this.sslSocketFactoryOrNull;
        }

        /* JADX INFO: renamed from: O, reason: from getter */
        public final int getWriteTimeout() {
            return this.writeTimeout;
        }

        /* JADX INFO: renamed from: P, reason: from getter */
        public final X509TrustManager getX509TrustManagerOrNull() {
            return this.x509TrustManagerOrNull;
        }

        public final a Q(HostnameVerifier hostnameVerifier) {
            if (!fr.t.c(hostnameVerifier, this.hostnameVerifier)) {
                this.routeDatabase = null;
            }
            this.hostnameVerifier = hostnameVerifier;
            return this;
        }

        public final a R(long timeout, TimeUnit unit) {
            this.readTimeout = gv.d.k("timeout", timeout, unit);
            return this;
        }

        @IgnoreJRERequirement
        public final a S(Duration duration) {
            R(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final a T(SSLSocketFactory sslSocketFactory, X509TrustManager trustManager) {
            if (!fr.t.c(sslSocketFactory, this.sslSocketFactoryOrNull) || !fr.t.c(trustManager, this.x509TrustManagerOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            this.certificateChainCleaner = sv.c.INSTANCE.a(trustManager);
            this.x509TrustManagerOrNull = trustManager;
            return this;
        }

        public final a U(long timeout, TimeUnit unit) {
            this.writeTimeout = gv.d.k("timeout", timeout, unit);
            return this;
        }

        @IgnoreJRERequirement
        public final a V(Duration duration) {
            U(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final a a(w interceptor) {
            this.interceptors.add(interceptor);
            return this;
        }

        public final z b() {
            return new z(this);
        }

        public final a c(long timeout, TimeUnit unit) {
            this.callTimeout = gv.d.k("timeout", timeout, unit);
            return this;
        }

        @IgnoreJRERequirement
        public final a d(Duration duration) {
            c(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final a e(g certificatePinner) {
            if (!fr.t.c(certificatePinner, this.certificatePinner)) {
                this.routeDatabase = null;
            }
            this.certificatePinner = certificatePinner;
            return this;
        }

        public final a f(long timeout, TimeUnit unit) {
            this.connectTimeout = gv.d.k("timeout", timeout, unit);
            return this;
        }

        @IgnoreJRERequirement
        public final a g(Duration duration) {
            f(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final a h(List<l> connectionSpecs) {
            if (!fr.t.c(connectionSpecs, this.connectionSpecs)) {
                this.routeDatabase = null;
            }
            this.connectionSpecs = gv.d.S(connectionSpecs);
            return this;
        }

        public final a i(q dns) {
            if (!fr.t.c(dns, this.dns)) {
                this.routeDatabase = null;
            }
            this.dns = dns;
            return this;
        }

        public final a j(r eventListener) {
            this.eventListenerFactory = gv.d.g(eventListener);
            return this;
        }

        public final a k(boolean followRedirects) {
            this.followRedirects = followRedirects;
            return this;
        }

        public final a l(boolean followProtocolRedirects) {
            this.followSslRedirects = followProtocolRedirects;
            return this;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final b getAuthenticator() {
            return this.authenticator;
        }

        public final c n() {
            return null;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final int getCallTimeout() {
            return this.callTimeout;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final sv.c getCertificateChainCleaner() {
            return this.certificateChainCleaner;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final g getCertificatePinner() {
            return this.certificatePinner;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final int getConnectTimeout() {
            return this.connectTimeout;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final k getConnectionPool() {
            return this.connectionPool;
        }

        public final List<l> t() {
            return this.connectionSpecs;
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final n getCookieJar() {
            return this.cookieJar;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final p getDispatcher() {
            return this.dispatcher;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public final q getDns() {
            return this.dns;
        }

        /* JADX INFO: renamed from: x, reason: from getter */
        public final r.c getEventListenerFactory() {
            return this.eventListenerFactory;
        }

        /* JADX INFO: renamed from: y, reason: from getter */
        public final boolean getFollowRedirects() {
            return this.followRedirects;
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final boolean getFollowSslRedirects() {
            return this.followSslRedirects;
        }

        public a(z zVar) {
            this();
            this.dispatcher = zVar.getDispatcher();
            this.connectionPool = zVar.getConnectionPool();
            pq.v.D(this.interceptors, zVar.D());
            pq.v.D(this.networkInterceptors, zVar.G());
            this.eventListenerFactory = zVar.getEventListenerFactory();
            this.retryOnConnectionFailure = zVar.getRetryOnConnectionFailure();
            this.authenticator = zVar.getAuthenticator();
            this.followRedirects = zVar.getFollowRedirects();
            this.followSslRedirects = zVar.getFollowSslRedirects();
            this.cookieJar = zVar.getCookieJar();
            zVar.j();
            this.dns = zVar.getDns();
            this.proxy = zVar.getProxy();
            this.proxySelector = zVar.getProxySelector();
            this.proxyAuthenticator = zVar.getProxyAuthenticator();
            this.socketFactory = zVar.getSocketFactory();
            this.sslSocketFactoryOrNull = zVar.sslSocketFactoryOrNull;
            this.x509TrustManagerOrNull = zVar.getX509TrustManager();
            this.connectionSpecs = zVar.q();
            this.protocols = zVar.J();
            this.hostnameVerifier = zVar.getHostnameVerifier();
            this.certificatePinner = zVar.getCertificatePinner();
            this.certificateChainCleaner = zVar.getCertificateChainCleaner();
            this.callTimeout = zVar.getCallTimeoutMillis();
            this.connectTimeout = zVar.getConnectTimeoutMillis();
            this.readTimeout = zVar.getReadTimeoutMillis();
            this.writeTimeout = zVar.getWriteTimeoutMillis();
            this.pingInterval = zVar.getPingIntervalMillis();
            this.minWebSocketMessageToCompress = zVar.getMinWebSocketMessageToCompress();
            this.routeDatabase = zVar.getRouteDatabase();
        }
    }

    public z() {
        this(new a());
    }
}
