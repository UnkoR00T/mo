package ic1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u000e\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"Lic1/b;", "", "", "email", "countryCode", "phoneNumber", "websiteUrl", "", "ceidgConsent", "publishEmailConsent", "publishPhoneNumberConsent", "publishWebAddressConsent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZ)V", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "d", "h", "e", "Z", "()Z", "f", "g", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String email;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String countryCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String phoneNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String websiteUrl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean ceidgConsent;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean publishEmailConsent;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean publishPhoneNumberConsent;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean publishWebAddressConsent;

    public b(String str, String str2, String str3, String str4, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.email = str;
        this.countryCode = str2;
        this.phoneNumber = str3;
        this.websiteUrl = str4;
        this.ceidgConsent = z15;
        this.publishEmailConsent = z16;
        this.publishPhoneNumberConsent = z17;
        this.publishWebAddressConsent = z18;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCeidgConsent() {
        return this.ceidgConsent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getPublishEmailConsent() {
        return this.publishEmailConsent;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getPublishPhoneNumberConsent() {
        return this.publishPhoneNumberConsent;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getPublishWebAddressConsent() {
        return this.publishWebAddressConsent;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getWebsiteUrl() {
        return this.websiteUrl;
    }
}
