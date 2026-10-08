package md4;

import b54.c;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oq.y;
import p00.f;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.CertificatePin;
import pl.gov.coi.common.network.CustomDns;
import pl.gov.coi.common.network.r;
import pl.gov.coi.common.network.x0;
import pl.gov.mc.fringers.mobywatel.e0;
import pq.v;
import pq.v0;
import y00.j;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R\u001a\u0010!\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b \u0010\u0014R\u001a\u0010#\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\u001c\u0010\u0014R\u001a\u0010$\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u0018\u0010\u0014R \u0010)\u001a\b\u0012\u0004\u0012\u00020\r0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001a\u0010(R\u001a\u0010+\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b\"\u0010\u0014R\u001a\u00101\u001a\u00020,8\u0016X\u0096D¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00102\u001a\u00020,8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b\u0016\u00100R \u00105\u001a\b\u0012\u0004\u0012\u0002030\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u00104\u001a\u0004\b&\u0010\u000fR&\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u000207068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u00108\u001a\u0004\b*\u00109R\u001c\u0010<\u001a\u0004\u0018\u00010;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b-\u0010>¨\u0006?"}, d2 = {"Lmd4/a;", "Lpl/gov/coi/common/network/r;", "Lp00/f;", "Ly00/j;", "Lc54/b;", "isFeatureEnabledUseCase", "Ly04/a;", "buildConfigRepository", "Lq00/b;", "ctDomainsParser", "<init>", "(Lc54/b;Ly04/a;Lq00/b;)V", "", "", "n", "()Ljava/util/List;", "Lpl/gov/coi/common/network/c;", "k", "", "l", "()Z", "e", "a", "Lc54/b;", "b", "Ly04/a;", "c", "Lq00/b;", "d", "Z", "g", "sslEnabled", "m", "certificateTransparencyEnabled", "f", "ocspRevocationCheckEnabled", "crlRevocationCheckEnabled", "", "h", "Ljava/util/Set;", "()Ljava/util/Set;", "ctWhitelistedHostnames", "i", "followRedirects", "", "j", "J", "o", "()J", "defaultCallTimeoutInSeconds", "defaultReadTimeoutInSeconds", "Lpl/gov/coi/common/network/g;", "Ljava/util/List;", "customDns", "", "", "Ljava/util/Map;", "()Ljava/util/Map;", "customCerts", "Lpl/gov/coi/common/network/x0;", "mTLS", "Lpl/gov/coi/common/network/x0;", "()Lpl/gov/coi/common/network/x0;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements r, f, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c54.b isFeatureEnabledUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y04.a buildConfigRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q00.b ctDomainsParser;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean sslEnabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean certificateTransparencyEnabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean ocspRevocationCheckEnabled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean crlRevocationCheckEnabled;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Set<String> ctWhitelistedHostnames;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean followRedirects;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long defaultCallTimeoutInSeconds;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long defaultReadTimeoutInSeconds;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final List<CustomDns> customDns;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Integer> customCerts;

    public a(c54.b bVar, y04.a aVar, q00.b bVar2) {
        this.isFeatureEnabledUseCase = bVar;
        this.buildConfigRepository = aVar;
        this.ctDomainsParser = bVar2;
        this.sslEnabled = bVar.a(c.HTTP_CLIENT_SSL).booleanValue();
        boolean z15 = false;
        this.certificateTransparencyEnabled = getSslEnabled() && bVar.a(c.CERTIFICATE_TRANSPARENCY).booleanValue();
        this.ocspRevocationCheckEnabled = getSslEnabled() && bVar.a(c.HTTP_CLIENT_OCSP_REVOCATION_CHECK).booleanValue();
        if (getSslEnabled() && bVar.a(c.HTTP_CLIENT_CRL_REVOCATION_CHECK).booleanValue()) {
            z15 = true;
        }
        this.crlRevocationCheckEnabled = z15;
        this.ctWhitelistedHostnames = bVar2.parse(aVar.getCtWhitelistDomains());
        this.followRedirects = !getSslEnabled();
        this.defaultCallTimeoutInSeconds = 220L;
        this.defaultReadTimeoutInSeconds = 200L;
        this.customDns = v.n();
        this.customCerts = v0.f(y.a("certum_trusted_root_ca", Integer.valueOf(e0.f160696a)));
    }

    @Override // pl.gov.coi.common.network.r
    /* JADX INFO: renamed from: a, reason: from getter */
    public long getDefaultReadTimeoutInSeconds() {
        return this.defaultReadTimeoutInSeconds;
    }

    @Override // pl.gov.coi.common.network.r
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getCrlRevocationCheckEnabled() {
        return this.crlRevocationCheckEnabled;
    }

    @Override // pl.gov.coi.common.network.r
    public Set<String> c() {
        return this.ctWhitelistedHostnames;
    }

    @Override // pl.gov.coi.common.network.r
    /* JADX INFO: renamed from: d, reason: from getter */
    public boolean getOcspRevocationCheckEnabled() {
        return this.ocspRevocationCheckEnabled;
    }

    @Override // p00.f
    public boolean e() {
        return this.buildConfigRepository.getRemoteHttpLoggingEnabled();
    }

    @Override // pl.gov.coi.common.network.r
    /* JADX INFO: renamed from: f, reason: from getter */
    public boolean getFollowRedirects() {
        return this.followRedirects;
    }

    @Override // pl.gov.coi.common.network.r
    /* JADX INFO: renamed from: g, reason: from getter */
    public boolean getSslEnabled() {
        return this.sslEnabled;
    }

    @Override // pl.gov.coi.common.network.r
    public List<CustomDns> h() {
        return this.customDns;
    }

    @Override // y00.j
    public Map<String, Integer> i() {
        return this.customCerts;
    }

    @Override // pl.gov.coi.common.network.r
    public x0 j() {
        return null;
    }

    @Override // pl.gov.coi.common.network.r
    public List<CertificatePin> k() {
        if (!getSslEnabled() || !this.isFeatureEnabledUseCase.a(c.HTTP_CLIENT_CERT_PINNING).booleanValue()) {
            return v.n();
        }
        String serverHost = this.buildConfigRepository.getServerHost();
        String certPin = this.buildConfigRepository.getCertPin();
        String certPinAlt = this.buildConfigRepository.getCertPinAlt();
        String certPinExpired = this.buildConfigRepository.getCertPinExpired();
        if (fu.r.t0(serverHost) || fu.r.t0(certPinExpired) || !this.isFeatureEnabledUseCase.a(c.TEST_DOMAIN_CERTIFICATE_EXPIRED).booleanValue()) {
            return (fu.r.t0(serverHost) || fu.r.t0(certPin) || fu.r.t0(certPinAlt)) ? v.n() : v.q(new CertificatePin(serverHost, certPin), new CertificatePin(serverHost, certPinAlt));
        }
        return v.e(new CertificatePin(serverHost, certPinExpired));
    }

    @Override // p00.f
    public boolean l() {
        return this.buildConfigRepository.getHttpLoggingEnabled();
    }

    @Override // pl.gov.coi.common.network.r
    /* JADX INFO: renamed from: m, reason: from getter */
    public boolean getCertificateTransparencyEnabled() {
        return this.certificateTransparencyEnabled;
    }

    @Override // p00.f
    public List<String> n() {
        return v.q("feedback/mobile/api/report-issue/categories", "feedback/mobile/api/topics", "mobile-settings/mobile/api/trusted-certificates", "authentication/mobile/api/challenge", "authentication/mobile/api/authentication/challenge", "authentication/mobile/api/jwt", "authentication/mobile/api/source-documents/download-async", "authentication/mobile/api/activation/by-personal-id-signature/signature-challenge", "authentication/mobile/api/activation/by-personal-id-signature/activation-challenge-with-keys", "mobile-settings/mobile/api/anonymous-feature-flags", "junior/mobile/api/activation/start", "authentication/mobile/api/activation/junior/activation-challenge-with-keys", "authentication/mobile/api/activation/junior/activate/async");
    }

    @Override // pl.gov.coi.common.network.r
    /* JADX INFO: renamed from: o, reason: from getter */
    public long getDefaultCallTimeoutInSeconds() {
        return this.defaultCallTimeoutInSeconds;
    }
}
