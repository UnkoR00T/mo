package pl.gov.coi.common.network;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 02\u00020\u0001:\u0001\u0017BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Lpl/gov/coi/common/network/s;", "", "Lpl/gov/coi/common/network/r;", "configuration", "Ly00/h0;", "securityProviderFactory", "Lp00/g;", "interceptorsFactory", "Lpl/gov/coi/common/network/c0;", "insecureTrustManagerFactory", "Lpl/gov/coi/common/network/a0;", "insecureHostnameVerifierFactory", "Ly00/x;", "nonCTTrustManagerProvider", "Lpl/gov/coi/common/network/n0;", "mTLSKeyManagerFactoryOverride", "Lpx/d;", "remoteLogger", "<init>", "(Lpl/gov/coi/common/network/r;Ly00/h0;Lp00/g;Lpl/gov/coi/common/network/c0;Lpl/gov/coi/common/network/a0;Ly00/x;Lpl/gov/coi/common/network/n0;Lpx/d;)V", "Lpl/gov/coi/common/network/t;", "profile", "Lfv/z;", "a", "(Lpl/gov/coi/common/network/t;)Lfv/z;", "client", "Lgu/b;", "timeout", "c", "(Lfv/z;Lgu/b;)Lfv/z;", "Lpl/gov/coi/common/network/r;", "b", "Ly00/h0;", "Lp00/g;", "d", "Lpl/gov/coi/common/network/c0;", "e", "Lpl/gov/coi/common/network/a0;", "f", "Ly00/x;", "g", "Lpl/gov/coi/common/network/n0;", "h", "Lpx/d;", "Lpl/gov/coi/common/network/i;", "i", "Lpl/gov/coi/common/network/i;", "dnsResolver", "j", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r configuration;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y00.h0 securityProviderFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p00.g interceptorsFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final c0 insecureTrustManagerFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a0 insecureHostnameVerifierFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final y00.x nonCTTrustManagerProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final n0 mTLSKeyManagerFactoryOverride;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final i dnsResolver;

    public s(r rVar, y00.h0 h0Var, p00.g gVar, c0 c0Var, a0 a0Var, y00.x xVar, n0 n0Var, px.d dVar) {
        this.configuration = rVar;
        this.securityProviderFactory = h0Var;
        this.interceptorsFactory = gVar;
        this.insecureTrustManagerFactory = c0Var;
        this.insecureHostnameVerifierFactory = a0Var;
        this.nonCTTrustManagerProvider = xVar;
        this.mTLSKeyManagerFactoryOverride = n0Var;
        this.remoteLogger = dVar;
        this.dnsResolver = new i(rVar.h(), dVar);
    }

    public static /* synthetic */ fv.z b(s sVar, t tVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            tVar = new t.Backend(null, 1, null);
        }
        return sVar.a(tVar);
    }

    public final fv.z a(t profile) throws NoSuchAlgorithmException, KeyManagementException {
        X509TrustManager x509TrustManagerC;
        fv.z.a aVar = new fv.z.a();
        px.f.f163100a.b("Creating OkHttpClient for profile: " + profile, px.c.a(aVar));
        aVar.i(this.dnsResolver);
        long jO = this.configuration.o();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.c(jO, timeUnit);
        aVar.R(this.configuration.a(), timeUnit);
        aVar.k(this.configuration.f());
        aVar.l(this.configuration.f());
        if (!this.configuration.g()) {
            aVar.Q(this.insecureHostnameVerifierFactory.b());
        }
        Iterator<T> it = this.interceptorsFactory.a(profile.getInterceptorsProfile()).iterator();
        while (it.hasNext()) {
            aVar.a((fv.w) it.next());
        }
        if (!this.configuration.g()) {
            x509TrustManagerC = this.insecureTrustManagerFactory.c();
        } else if ((profile instanceof t.Backend) || (profile instanceof t.SSE)) {
            aVar.h(pq.v.e(fv.l.f67446i));
            List<CertificatePin> listK = this.configuration.k();
            if (!listK.isEmpty()) {
                fv.g.a aVar2 = new fv.g.a();
                for (CertificatePin certificatePin : listK) {
                    aVar2.a(certificatePin.getHostPattern(), certificatePin.getSha256());
                }
                aVar.e(aVar2.b());
            }
            dx.i<dx.b, X509TrustManager> iVarC = this.nonCTTrustManagerProvider.c();
            if (iVarC instanceof dx.i.Left) {
                this.remoteLogger.n7("Failed to create non CT TrustManager for HttpClientFactory. Using system default TrustManager from SecurityProvider.", px.c.a(aVar));
                x509TrustManagerC = null;
            } else {
                if (!(iVarC instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                x509TrustManagerC = (X509TrustManager) ((dx.i.Right) iVarC).b();
            }
        } else if (profile instanceof t.NonCTRaw) {
            aVar.h(pq.v.q(fv.l.f67446i, fv.l.f67448k));
            dx.i<dx.b, X509TrustManager> iVarC2 = this.nonCTTrustManagerProvider.c();
            if (iVarC2 instanceof dx.i.Left) {
                this.remoteLogger.n7("Failed to create non CT TrustManager for CTLogListHttpClientFactory. Using insecure TrustManager.", px.c.a(aVar));
                x509TrustManagerC = this.insecureTrustManagerFactory.c();
            } else {
                if (!(iVarC2 instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                x509TrustManagerC = (X509TrustManager) ((dx.i.Right) iVarC2).b();
            }
        } else {
            if (!(profile instanceof t.Public)) {
                throw new oq.p();
            }
            aVar.h(pq.v.e(fv.l.f67446i));
            x509TrustManagerC = null;
        }
        if (x509TrustManagerC != null) {
            if ((profile instanceof t.Backend) || (profile instanceof t.SSE)) {
                this.configuration.j();
            } else if (!(profile instanceof t.Public) && !(profile instanceof t.NonCTRaw)) {
                throw new oq.p();
            }
            SSLContext sSLContext = SSLContext.getInstance("TLS", this.securityProviderFactory.c());
            this.remoteLogger.F8("SSL context provider: " + sSLContext.getProvider().getName() + ", " + profile, px.d.a.NETWORK);
            sSLContext.init(null, new X509TrustManager[]{x509TrustManagerC}, null);
            SSLSocket sSLSocket = (SSLSocket) sSLContext.getSocketFactory().createSocket();
            if (!pq.n.f0(sSLSocket.getEnabledProtocols(), "TLSv1.3")) {
                px.b.y5(this.remoteLogger, "TLSv1.3 is NOT enabled. Provider: " + sSLContext.getProvider().getName() + ", protocols: " + pq.n.L0(sSLSocket.getSupportedProtocols(), null, null, null, 0, null, null, 63, null) + ", enabled: " + pq.n.L0(sSLSocket.getEnabledProtocols(), null, null, null, 0, null, null, 63, null), null, px.c.a(aVar), 2, null);
            }
            aVar.T(sSLContext.getSocketFactory(), x509TrustManagerC);
        }
        return aVar.b();
    }

    public final fv.z c(fv.z client, gu.b timeout) {
        if (timeout == null) {
            return client;
        }
        fv.z.a aVarH = client.H();
        long rawValue = timeout.getRawValue();
        fv.z.a aVarD = aVarH.d(Duration.ofSeconds(gu.b.F(rawValue), gu.b.H(rawValue)));
        long rawValue2 = timeout.getRawValue();
        fv.z.a aVarG = aVarD.g(Duration.ofSeconds(gu.b.F(rawValue2), gu.b.H(rawValue2)));
        long rawValue3 = timeout.getRawValue();
        fv.z.a aVarS = aVarG.S(Duration.ofSeconds(gu.b.F(rawValue3), gu.b.H(rawValue3)));
        long rawValue4 = timeout.getRawValue();
        return aVarS.V(Duration.ofSeconds(gu.b.F(rawValue4), gu.b.H(rawValue4))).b();
    }
}
