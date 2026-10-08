package fk0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fk0.f, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001a\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001e\u0010\u000e¨\u0006\u001f"}, d2 = {"Lfk0/f;", "", "", "consentToPublishData", "", "email", "publishEmailConsent", "publishPhoneNumberConsent", "publishWebAddressConsent", "phoneNumber", "webAddress", "<init>", "(ZLjava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/lang/String;", "c", "d", "e", "f", "g", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEApplicationContactDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean consentToPublishData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean publishEmailConsent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean publishPhoneNumberConsent;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean publishWebAddressConsent;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phoneNumber;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String webAddress;

    public BEApplicationContactDetails(boolean z15, String str, boolean z16, boolean z17, boolean z18, String str2, String str3) {
        this.consentToPublishData = z15;
        this.email = str;
        this.publishEmailConsent = z16;
        this.publishPhoneNumberConsent = z17;
        this.publishWebAddressConsent = z18;
        this.phoneNumber = str2;
        this.webAddress = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getConsentToPublishData() {
        return this.consentToPublishData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getPublishEmailConsent() {
        return this.publishEmailConsent;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getPublishPhoneNumberConsent() {
        return this.publishPhoneNumberConsent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEApplicationContactDetails)) {
            return false;
        }
        BEApplicationContactDetails bEApplicationContactDetails = (BEApplicationContactDetails) other;
        return this.consentToPublishData == bEApplicationContactDetails.consentToPublishData && fr.t.c(this.email, bEApplicationContactDetails.email) && this.publishEmailConsent == bEApplicationContactDetails.publishEmailConsent && this.publishPhoneNumberConsent == bEApplicationContactDetails.publishPhoneNumberConsent && this.publishWebAddressConsent == bEApplicationContactDetails.publishWebAddressConsent && fr.t.c(this.phoneNumber, bEApplicationContactDetails.phoneNumber) && fr.t.c(this.webAddress, bEApplicationContactDetails.webAddress);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getPublishWebAddressConsent() {
        return this.publishWebAddressConsent;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getWebAddress() {
        return this.webAddress;
    }

    public int hashCode() {
        int iHashCode = ((((((((Boolean.hashCode(this.consentToPublishData) * 31) + this.email.hashCode()) * 31) + Boolean.hashCode(this.publishEmailConsent)) * 31) + Boolean.hashCode(this.publishPhoneNumberConsent)) * 31) + Boolean.hashCode(this.publishWebAddressConsent)) * 31;
        String str = this.phoneNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.webAddress;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "BEApplicationContactDetails(consentToPublishData=" + this.consentToPublishData + ", email=" + this.email + ", publishEmailConsent=" + this.publishEmailConsent + ", publishPhoneNumberConsent=" + this.publishPhoneNumberConsent + ", publishWebAddressConsent=" + this.publishWebAddressConsent + ", phoneNumber=" + this.phoneNumber + ", webAddress=" + this.webAddress + ')';
    }
}
