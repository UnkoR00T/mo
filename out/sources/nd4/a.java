package nd4;

import org.bouncycastle.asn1.x509.DisplayText;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u000e\n\u0002\b/\n\u0002\u0010\b\n\u0002\b\u001f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\r\u001a\u00020\u00048\u0016X\u0096D¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000f\u0010\bR \u0010\u0015\u001a\u00020\u00048\u0016X\u0096D¢\u0006\u0012\n\u0004\b\u0012\u0010\u0006\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0013\u0010\bR \u0010\u0019\u001a\u00020\u00048\u0016X\u0096D¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR \u0010\u001d\u001a\u00020\u00048\u0016X\u0096D¢\u0006\u0012\n\u0004\b\u001a\u0010\u0006\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001b\u0010\bR \u0010!\u001a\u00020\u00048\u0016X\u0096D¢\u0006\u0012\n\u0004\b\u001e\u0010\u0006\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001f\u0010\bR \u0010%\u001a\u00020\u00048\u0016X\u0096D¢\u0006\u0012\n\u0004\b\"\u0010\u0006\u0012\u0004\b$\u0010\u0003\u001a\u0004\b#\u0010\bR\u001a\u0010+\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010.\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*R\u001a\u00101\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b0\u0010*R\u001a\u00103\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010(\u001a\u0004\b2\u0010*R\u001a\u00106\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\b4\u0010(\u001a\u0004\b5\u0010*R\u001a\u00109\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\b7\u0010(\u001a\u0004\b8\u0010*R\u001a\u0010:\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010(\u001a\u0004\b\n\u0010*R\u001a\u0010=\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\b;\u0010(\u001a\u0004\b<\u0010*R\u001a\u0010>\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b\u001a\u0010*R\u001a\u0010@\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\b?\u0010(\u001a\u0004\b4\u0010*R\u001a\u0010B\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001f\u0010(\u001a\u0004\bA\u0010*R\u001a\u0010E\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\bC\u0010(\u001a\u0004\bD\u0010*R\u001a\u0010F\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\bC\u0010*R\u001a\u0010I\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\bG\u0010(\u001a\u0004\bH\u0010*R\u001a\u0010K\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\bJ\u0010(\u001a\u0004\b,\u0010*R\u001a\u0010M\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\bL\u0010(\u001a\u0004\b?\u0010*R\u001a\u0010P\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\bN\u0010(\u001a\u0004\bO\u0010*R\u001a\u0010R\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\bQ\u0010(\u001a\u0004\bQ\u0010*R\u001a\u0010S\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b'\u0010*R\u001a\u0010U\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\bT\u0010(\u001a\u0004\b\u001e\u0010*R\u001a\u0010Y\u001a\u00020V8\u0016X\u0096D¢\u0006\f\n\u0004\bW\u0010\u0017\u001a\u0004\b\u0012\u0010XR\u001a\u0010Z\u001a\u00020V8\u0016X\u0096D¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b\u0005\u0010XR\u001a\u0010[\u001a\u00020V8\u0016X\u0096D¢\u0006\f\n\u0004\b)\u0010\u0017\u001a\u0004\b\u000e\u0010XR\u001a\u0010\\\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\bA\u0010(\u001a\u0004\bW\u0010*R\u001a\u0010]\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\bN\u0010*R\u001a\u0010`\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\b^\u0010(\u001a\u0004\b_\u0010*R\u001a\u0010a\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010(\u001a\u0004\bT\u0010*R\u001a\u0010b\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\bO\u0010(\u001a\u0004\b/\u0010*R\u001a\u0010c\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\bD\u0010(\u001a\u0004\b\u0016\u0010*R\u001a\u0010e\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\bd\u0010(\u001a\u0004\bJ\u0010*R\u001a\u0010g\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\bf\u0010(\u001a\u0004\b7\u0010*R\u001a\u0010i\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\bh\u0010(\u001a\u0004\bL\u0010*R\u001a\u0010k\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\bj\u0010(\u001a\u0004\b;\u0010*R\u001a\u0010m\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\bl\u0010(\u001a\u0004\bG\u0010*R\u001a\u0010o\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\bn\u0010(\u001a\u0004\b\"\u0010*R\u001a\u0010r\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\bp\u0010(\u001a\u0004\bq\u0010*R\u001a\u0010t\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\bs\u0010(\u001a\u0004\b^\u0010*¨\u0006u"}, d2 = {"Lnd4/a;", "Ly04/a;", "<init>", "()V", "", "a", "Z", "A", "()Z", "debug", "b", "q", "getHttpLoggingEnabled$annotations", "httpLoggingEnabled", "c", "G", "getRemoteHttpLoggingEnabled$annotations", "remoteHttpLoggingEnabled", "d", "l", "getProdFeatureFlags$annotations", "prodFeatureFlags", "e", "I", "isAutomaticTest$annotations", "isAutomaticTest", "f", "o", "isSecurityAudit$annotations", "isSecurityAudit", "g", "s", "isInstitution$annotations", "isInstitution", "h", ip.a.f96138c, "getGooglePayTestEnv$annotations", "googlePayTestEnv", "", "i", "Ljava/lang/String;", "E", "()Ljava/lang/String;", "serverScheme", "j", "getServerPort", "serverPort", "k", "u", "serverHost", "getPzDomain", "pzDomain", "m", "getServerProtocolVersion", "serverProtocolVersion", "n", "getAppDomain", "appDomain", "wkDomain", "p", "getWkSso", "wkSso", "certPin", "r", "certPinAlt", "F", "certPinExpired", "t", "K", "coalProposalScheme", "coalProposalHost", "v", "getCoalProposalPort", "coalProposalPort", "w", "coalProposalContext", "x", "trustedDomains", "y", "J", "trustedDomainPrefix", "z", "ctWhitelistDomains", "pinningWhitelistDomains", "B", "verificationUrl", "", "C", "()I", "defaultImageQuality", "thumbnailMaxSide", "defaultImageMaxSide", "prescriptionScheme", "prescriptionHost", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "getPrescriptionPort", "prescriptionPort", "prescriptionContext", "ipolakScheme", "ipolakHost", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "ipolakContext", "M", "cityCardScheme", "N", "cityCardHost", "O", "cityCardContext", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "pkpScheme", "Q", "pkpHost", "R", "getPkpPort", "pkpPort", ip.a.f96137b, "pkpContext", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements y04.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean debug;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean httpLoggingEnabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isAutomaticTest;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isSecurityAudit;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean isInstitution;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean googlePayTestEnv;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean remoteHttpLoggingEnabled = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean prodFeatureFlags = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String serverScheme = "https";

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final String serverPort = "443";

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final String serverHost = "api.mobywatel.gov.pl";

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final String pzDomain = "https://int.pz.gov.pl/";

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final String serverProtocolVersion = "4150";

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String appDomain = "https://api.mobywatel.gov.pl/";

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final String wkDomain = "https://login.gov.pl/";

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final String wkSso = "pz-sso";

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final String certPin = "sha256/ulb4RAJO+MueOh02jPkDpzMii1VGRhOLRa0GVUnGaRA=";

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final String certPinAlt = "sha256/T5oco5BLHUosMjklNSpO6nfnj90WstbKwrPmT4Os1FY=";

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final String certPinExpired = "sha256/42e1c/mjVxobge3sdS0dHnxld7wtGlXkftUhC2wNDhM=";

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final String coalProposalScheme = "https";

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final String coalProposalHost = "serwis.epuap.gov.pl";

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final String coalProposalPort = "443";

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final String coalProposalContext = "mlpz/api/m-obywatel";

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final String trustedDomains = "pz.gov.pl;login.gov.pl;mod.ezdrowie.gov.pl";

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final String trustedDomainPrefix = "int.";

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final String ctWhitelistDomains = "sentry.puch.coi.gov.pl;api.mobywatel.gov.pl;*.api.mobywatel.gov.pl";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final String pinningWhitelistDomains = "app-measurement.com;sentry.puch.coi.gov.pl;fonts.gstatic.com;fonts.googleapis.com";

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final String verificationUrl = "https://weryfikator.mobywatel.gov.pl/verification-process";

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final int defaultImageQuality = 100;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final int thumbnailMaxSide = DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final int defaultImageMaxSide = 2000;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final String prescriptionScheme = "https";

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final String prescriptionHost = "mod.ezdrowie.gov.pl";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final String prescriptionPort = "443";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final String prescriptionContext = "mod/v1.0";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final String ipolakScheme = "https";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final String ipolakHost = "www.gov.pl";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final String ipolakContext = "static/ipolak";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final String cityCardScheme = "https";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final String cityCardHost = "mka.malopolska.pl";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final String cityCardContext = "mcobw";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final String pkpScheme = "https";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final String pkpHost = "bilkom.pl";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final String pkpPort = "443";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private final String pkpContext = "mobywatel/wallet";

    @Override // y04.a
    /* JADX INFO: renamed from: A, reason: from getter */
    public boolean getDebug() {
        return this.debug;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: B, reason: from getter */
    public String getPrescriptionContext() {
        return this.prescriptionContext;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: C, reason: from getter */
    public String getPrescriptionScheme() {
        return this.prescriptionScheme;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: D, reason: from getter */
    public boolean getGooglePayTestEnv() {
        return this.googlePayTestEnv;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: E, reason: from getter */
    public String getServerScheme() {
        return this.serverScheme;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: F, reason: from getter */
    public String getCertPinExpired() {
        return this.certPinExpired;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: G, reason: from getter */
    public boolean getRemoteHttpLoggingEnabled() {
        return this.remoteHttpLoggingEnabled;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: H, reason: from getter */
    public String getPkpContext() {
        return this.pkpContext;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: I, reason: from getter */
    public boolean getIsAutomaticTest() {
        return this.isAutomaticTest;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: J, reason: from getter */
    public String getTrustedDomainPrefix() {
        return this.trustedDomainPrefix;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: K, reason: from getter */
    public String getCoalProposalScheme() {
        return this.coalProposalScheme;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getThumbnailMaxSide() {
        return this.thumbnailMaxSide;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public String getWkDomain() {
        return this.wkDomain;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: c, reason: from getter */
    public int getDefaultImageMaxSide() {
        return this.defaultImageMaxSide;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: d, reason: from getter */
    public int getDefaultImageQuality() {
        return this.defaultImageQuality;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getIpolakHost() {
        return this.ipolakHost;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: f, reason: from getter */
    public String getCertPin() {
        return this.certPin;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: g, reason: from getter */
    public String getVerificationUrl() {
        return this.verificationUrl;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: h, reason: from getter */
    public String getPkpHost() {
        return this.pkpHost;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: i, reason: from getter */
    public String getPinningWhitelistDomains() {
        return this.pinningWhitelistDomains;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: j, reason: from getter */
    public String getCoalProposalContext() {
        return this.coalProposalContext;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: k, reason: from getter */
    public String getIpolakScheme() {
        return this.ipolakScheme;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: l, reason: from getter */
    public boolean getProdFeatureFlags() {
        return this.prodFeatureFlags;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: m, reason: from getter */
    public String getCertPinAlt() {
        return this.certPinAlt;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: n, reason: from getter */
    public String getCityCardScheme() {
        return this.cityCardScheme;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: o, reason: from getter */
    public boolean getIsSecurityAudit() {
        return this.isSecurityAudit;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: p, reason: from getter */
    public String getCityCardContext() {
        return this.cityCardContext;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: q, reason: from getter */
    public boolean getHttpLoggingEnabled() {
        return this.httpLoggingEnabled;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: r, reason: from getter */
    public String getTrustedDomains() {
        return this.trustedDomains;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: s, reason: from getter */
    public boolean getIsInstitution() {
        return this.isInstitution;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: t, reason: from getter */
    public String getCoalProposalHost() {
        return this.coalProposalHost;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: u, reason: from getter */
    public String getServerHost() {
        return this.serverHost;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: v, reason: from getter */
    public String getPkpScheme() {
        return this.pkpScheme;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: w, reason: from getter */
    public String getIpolakContext() {
        return this.ipolakContext;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: x, reason: from getter */
    public String getCityCardHost() {
        return this.cityCardHost;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: y, reason: from getter */
    public String getPrescriptionHost() {
        return this.prescriptionHost;
    }

    @Override // y04.a
    /* JADX INFO: renamed from: z, reason: from getter */
    public String getCtWhitelistDomains() {
        return this.ctWhitelistDomains;
    }
}
