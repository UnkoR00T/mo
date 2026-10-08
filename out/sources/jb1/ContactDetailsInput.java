package jb1;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jb1.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0015\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001e\u0010\u001c¨\u0006\u001f"}, d2 = {"Ljb1/e;", "", "", "email", "phoneNumber", "webAddress", "", "consentToPublishData", "publishEmailConsent", "publishPhoneNumberConsent", "publishWebAddressConsent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "g", "d", "Z", "()Z", "e", "f", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ContactDetailsInput {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phoneNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String webAddress;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean consentToPublishData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean publishEmailConsent;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean publishPhoneNumberConsent;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean publishWebAddressConsent;

    public ContactDetailsInput(String str, String str2, String str3, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.email = str;
        this.phoneNumber = str2;
        this.webAddress = str3;
        this.consentToPublishData = z15;
        this.publishEmailConsent = z16;
        this.publishPhoneNumberConsent = z17;
        this.publishWebAddressConsent = z18;
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
        if (!(other instanceof ContactDetailsInput)) {
            return false;
        }
        ContactDetailsInput contactDetailsInput = (ContactDetailsInput) other;
        return t.c(this.email, contactDetailsInput.email) && t.c(this.phoneNumber, contactDetailsInput.phoneNumber) && t.c(this.webAddress, contactDetailsInput.webAddress) && this.consentToPublishData == contactDetailsInput.consentToPublishData && this.publishEmailConsent == contactDetailsInput.publishEmailConsent && this.publishPhoneNumberConsent == contactDetailsInput.publishPhoneNumberConsent && this.publishWebAddressConsent == contactDetailsInput.publishWebAddressConsent;
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
        int iHashCode = this.email.hashCode() * 31;
        String str = this.phoneNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.webAddress;
        return ((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.consentToPublishData)) * 31) + Boolean.hashCode(this.publishEmailConsent)) * 31) + Boolean.hashCode(this.publishPhoneNumberConsent)) * 31) + Boolean.hashCode(this.publishWebAddressConsent);
    }

    public String toString() {
        return "ContactDetailsInput(email=" + this.email + ", phoneNumber=" + this.phoneNumber + ", webAddress=" + this.webAddress + ", consentToPublishData=" + this.consentToPublishData + ", publishEmailConsent=" + this.publishEmailConsent + ", publishPhoneNumberConsent=" + this.publishPhoneNumberConsent + ", publishWebAddressConsent=" + this.publishWebAddressConsent + ')';
    }
}
