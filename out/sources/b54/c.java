package b54;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u0019\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\fj\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0¨\u00061"}, d2 = {"Lb54/c;", "Lb54/b;", "Lgz/b$a;", "", "", "serializedName", "Lb54/a;", "defaultValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lb54/a;)V", "a", "Ljava/lang/String;", "s", "()Ljava/lang/String;", "b", "Lb54/a;", "()Lb54/a;", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "t", "v", "w", "x", "y", "z", "A", "B", "C", ip.a.f96138c, "E", "F", "G", i.f37087n, "I", "K", i.f37094u, "O", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum c implements b, gz.b.a {
    SECURE_WINDOW("SECURE_WINDOW", new FeatureFlagDefaultValue(false, true)),
    SECURE_DIRECTORY("SECURE_DIRECTORY", new FeatureFlagDefaultValue(true, true)),
    STRICT_MODE("STRICT_MODE", new FeatureFlagDefaultValue(false, false)),
    THREAT_DETECTION("THREAT_DETECTION", new FeatureFlagDefaultValue(false, true)),
    HTTP_CLIENT_SSL("HTTP_CLIENT_SSL", new FeatureFlagDefaultValue(true, true)),
    CERTIFICATE_TRANSPARENCY("CERTIFICATE_TRANSPARENCY", new FeatureFlagDefaultValue(true, true)),
    HTTP_CLIENT_CERT_PINNING("HTTP_CLIENT_CERT_PINNING", new FeatureFlagDefaultValue(true, true)),
    HTTP_CLIENT_OCSP_REVOCATION_CHECK("HTTP_CLIENT_OCSP_REVOCATION_CHECK", new FeatureFlagDefaultValue(true, true)),
    HTTP_CLIENT_CRL_REVOCATION_CHECK("HTTP_CLIENT_CRL_REVOCATION_CHECK", new FeatureFlagDefaultValue(true, true)),
    WEB_VIEW_SSL("WEB_VIEW_SSL", new FeatureFlagDefaultValue(true, true)),
    WEB_VIEW_DEBUGGING("WEB_VIEW_DEBUGGING", new FeatureFlagDefaultValue(true, false)),
    SAFE_BUS_OCR("SAFE_BUS_OCR", new FeatureFlagDefaultValue(true, false)),
    NURSE_CARD("NURSE_CARD", new FeatureFlagDefaultValue(true, true)),
    NEW_OFFICE_ACTIVATION("NEW_OFFICE_ACTIVATION", new FeatureFlagDefaultValue(false, false)),
    ELECTORAL_REGISTER("ELECTORAL_REGISTER", new FeatureFlagDefaultValue(true, false)),
    ID_CARD_SUSPENSION("ID_CARD_SUSPENSION", new FeatureFlagDefaultValue(true, false)),
    TEST_DOMAIN_CERTIFICATE_EXPIRED("TEST_SERVER_DOMAIN_CERTIFICATE_EXPIRED", new FeatureFlagDefaultValue(false, false)),
    DATA_COMPARISON_DOC_SIGNING("DATA_COMPARISON_DOC_SIGNING", new FeatureFlagDefaultValue(false, true)),
    ALERT_ON_VERIFICATION("ALERT_ON_VERIFICATION", new FeatureFlagDefaultValue(false, false)),
    KEYCLOAK_TOKEN_AUTH_WEB_VIEW_VISIBLE("KEYCLOAK_TOKEN_AUTH_WEB_VIEW_VISIBLE", new FeatureFlagDefaultValue(true, false)),
    VOTE_IDEA_DEV("VOTE_IDEA_DEV", new FeatureFlagDefaultValue(true, false)),
    ASYNC_DOWNLOAD_LOCAL_LOGGING("ASYNC_DOWNLOAD_LOCAL_LOGGING", new FeatureFlagDefaultValue(true, false)),
    EDOR_OAUTH_WEB_VIEW_VISIBLE("EDOR_OAUTH_WEB_VIEW_VISIBLE", new FeatureFlagDefaultValue(false, false)),
    IDENTITY_PHOTO_ADJUSTMENT("IDENTITY_PHOTO_ADJUSTMENT", new FeatureFlagDefaultValue(true, true)),
    MJUNIOR_TEMPORARY_DRIVING_LICENCE("MJUNIOR_TEMPORARY_DRIVING_LICENCE", new FeatureFlagDefaultValue(true, true)),
    MJUNIOR_FAMILY_CARD("KDR_DOCUMENT_ADD", new FeatureFlagDefaultValue(true, true)),
    MJUNIOR_UUT_CARD("UUT_DOCUMENT_ADD", new FeatureFlagDefaultValue(true, true)),
    MJUNIOR_LON_CARD("LON_DOCUMENT_ADD", new FeatureFlagDefaultValue(true, true)),
    MOB_DB_CONTAINERS("MOB_DB_CONTAINERS", new FeatureFlagDefaultValue(false, false)),
    MJUNIOR_SCHOOL_TAB("MJUNIOR_SCHOOL_TAB", new FeatureFlagDefaultValue(true, false)),
    SCHOOL_INFO("SCHOOL_INFO", new FeatureFlagDefaultValue(true, false)),
    MJUNIOR_UPDATE_REQUIRED("MJUNIOR_UPDATE_REQUIRED", new FeatureFlagDefaultValue(false, true)),
    ODYSSEUS_GEOLOCATION_NATIVE("ODYSSEUS_GEOLOCATION", new FeatureFlagDefaultValue(false, false));

    private static final /* synthetic */ wq.a R = wq.b.a(v());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String serializedName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final FeatureFlagDefaultValue defaultValue;

    c(String str, FeatureFlagDefaultValue featureFlagDefaultValue) {
        this.serializedName = str;
        this.defaultValue = featureFlagDefaultValue;
    }

    public static wq.a<c> w() {
        return R;
    }

    @Override // b54.b
    /* JADX INFO: renamed from: b, reason: from getter */
    public FeatureFlagDefaultValue getDefaultValue() {
        return this.defaultValue;
    }

    @Override // b54.b
    /* JADX INFO: renamed from: s, reason: from getter */
    public String getSerializedName() {
        return this.serializedName;
    }
}
