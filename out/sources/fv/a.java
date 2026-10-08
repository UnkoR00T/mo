package fv;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0000H\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007¢\u0006\f\n\u0004\b*\u00100\u001a\u0004\b1\u00102R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0007¢\u0006\f\n\u0004\b$\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007¢\u0006\f\n\u0004\b4\u00106\u001a\u0004\b(\u00107R\u0017\u0010\u0011\u001a\u00020\u00108\u0007¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b<\u0010>R\u0017\u0010\u001a\u001a\u00020\u00198\u0007¢\u0006\f\n\u0004\b:\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010F\u001a\u00020B8G¢\u0006\f\n\u0004\b@\u0010C\u001a\u0004\bD\u0010ER\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148G¢\u0006\f\n\u0004\b.\u0010G\u001a\u0004\b8\u0010HR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00148G¢\u0006\f\n\u0004\b1\u0010G\u001a\u0004\b,\u0010H¨\u0006I"}, d2 = {"Lfv/a;", "", "", "uriHost", "", "uriPort", "Lfv/q;", "dns", "Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lfv/g;", "certificatePinner", "Lfv/b;", "proxyAuthenticator", "Ljava/net/Proxy;", "proxy", "", "Lfv/a0;", "protocols", "Lfv/l;", "connectionSpecs", "Ljava/net/ProxySelector;", "proxySelector", "<init>", "(Ljava/lang/String;ILfv/q;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lfv/g;Lfv/b;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "that", "d", "(Lfv/a;)Z", "toString", "()Ljava/lang/String;", "a", "Lfv/q;", "c", "()Lfv/q;", "b", "Ljavax/net/SocketFactory;", "j", "()Ljavax/net/SocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "k", "()Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/HostnameVerifier;", "e", "()Ljavax/net/ssl/HostnameVerifier;", "Lfv/g;", "()Lfv/g;", "f", "Lfv/b;", "h", "()Lfv/b;", "g", "Ljava/net/Proxy;", "()Ljava/net/Proxy;", "Ljava/net/ProxySelector;", "i", "()Ljava/net/ProxySelector;", "Lfv/v;", "Lfv/v;", "l", "()Lfv/v;", "url", "Ljava/util/List;", "()Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q dns;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SocketFactory socketFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SSLSocketFactory sslSocketFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final HostnameVerifier hostnameVerifier;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final g certificatePinner;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final b proxyAuthenticator;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Proxy proxy;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ProxySelector proxySelector;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final v url;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<a0> protocols;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final List<l> connectionSpecs;

    public a(String str, int i15, q qVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, g gVar, b bVar, Proxy proxy, List<? extends a0> list, List<l> list2, ProxySelector proxySelector) {
        this.dns = qVar;
        this.socketFactory = socketFactory;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.certificatePinner = gVar;
        this.proxyAuthenticator = bVar;
        this.proxy = proxy;
        this.proxySelector = proxySelector;
        this.url = new v.a().s(sSLSocketFactory != null ? "https" : "http").i(str).o(i15).d();
        this.protocols = gv.d.S(list);
        this.connectionSpecs = gv.d.S(list2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final g getCertificatePinner() {
        return this.certificatePinner;
    }

    public final List<l> b() {
        return this.connectionSpecs;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final q getDns() {
        return this.dns;
    }

    public final boolean d(a that) {
        return fr.t.c(this.dns, that.dns) && fr.t.c(this.proxyAuthenticator, that.proxyAuthenticator) && fr.t.c(this.protocols, that.protocols) && fr.t.c(this.connectionSpecs, that.connectionSpecs) && fr.t.c(this.proxySelector, that.proxySelector) && fr.t.c(this.proxy, that.proxy) && fr.t.c(this.sslSocketFactory, that.sslSocketFactory) && fr.t.c(this.hostnameVerifier, that.hostnameVerifier) && fr.t.c(this.certificatePinner, that.certificatePinner) && this.url.getPort() == that.url.getPort();
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    public boolean equals(Object other) {
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return fr.t.c(this.url, aVar.url) && d(aVar);
    }

    public final List<a0> f() {
        return this.protocols;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final b getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.url.hashCode()) * 31) + this.dns.hashCode()) * 31) + this.proxyAuthenticator.hashCode()) * 31) + this.protocols.hashCode()) * 31) + this.connectionSpecs.hashCode()) * 31) + this.proxySelector.hashCode()) * 31) + Objects.hashCode(this.proxy)) * 31) + Objects.hashCode(this.sslSocketFactory)) * 31) + Objects.hashCode(this.hostnameVerifier)) * 31) + Objects.hashCode(this.certificatePinner);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final v getUrl() {
        return this.url;
    }

    public String toString() {
        StringBuilder sb5;
        Object obj;
        StringBuilder sb6 = new StringBuilder();
        sb6.append("Address{");
        sb6.append(this.url.getHost());
        sb6.append(':');
        sb6.append(this.url.getPort());
        sb6.append(", ");
        if (this.proxy != null) {
            sb5 = new StringBuilder();
            sb5.append("proxy=");
            obj = this.proxy;
        } else {
            sb5 = new StringBuilder();
            sb5.append("proxySelector=");
            obj = this.proxySelector;
        }
        sb5.append(obj);
        sb6.append(sb5.toString());
        sb6.append('}');
        return sb6.toString();
    }
}
