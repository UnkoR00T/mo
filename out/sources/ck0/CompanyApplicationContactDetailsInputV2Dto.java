package ck0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ck0.j, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0015\u001a\u0004\b\"\u0010\r¨\u0006#"}, d2 = {"Lck0/j;", "", "", "email", "", "publishEmailConsent", "publishPhoneNumberConsent", "publishWebAddressConsent", "phoneNumber", "webAddress", "<init>", "(Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getEmail", "b", "Z", "getPublishEmailConsent", "()Z", "c", "getPublishPhoneNumberConsent", "d", "getPublishWebAddressConsent", "e", "getPhoneNumber", "f", "getWebAddress", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CompanyApplicationContactDetailsInputV2Dto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("email")
    private final String email;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("publishEmailConsent")
    private final boolean publishEmailConsent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("publishPhoneNumberConsent")
    private final boolean publishPhoneNumberConsent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("publishWebAddressConsent")
    private final boolean publishWebAddressConsent;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("phoneNumber")
    private final String phoneNumber;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("webAddress")
    private final String webAddress;

    public CompanyApplicationContactDetailsInputV2Dto(String str, boolean z15, boolean z16, boolean z17, String str2, String str3) {
        this.email = str;
        this.publishEmailConsent = z15;
        this.publishPhoneNumberConsent = z16;
        this.publishWebAddressConsent = z17;
        this.phoneNumber = str2;
        this.webAddress = str3;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanyApplicationContactDetailsInputV2Dto)) {
            return false;
        }
        CompanyApplicationContactDetailsInputV2Dto companyApplicationContactDetailsInputV2Dto = (CompanyApplicationContactDetailsInputV2Dto) other;
        return fr.t.c(this.email, companyApplicationContactDetailsInputV2Dto.email) && this.publishEmailConsent == companyApplicationContactDetailsInputV2Dto.publishEmailConsent && this.publishPhoneNumberConsent == companyApplicationContactDetailsInputV2Dto.publishPhoneNumberConsent && this.publishWebAddressConsent == companyApplicationContactDetailsInputV2Dto.publishWebAddressConsent && fr.t.c(this.phoneNumber, companyApplicationContactDetailsInputV2Dto.phoneNumber) && fr.t.c(this.webAddress, companyApplicationContactDetailsInputV2Dto.webAddress);
    }

    public int hashCode() {
        int iHashCode = ((((((this.email.hashCode() * 31) + Boolean.hashCode(this.publishEmailConsent)) * 31) + Boolean.hashCode(this.publishPhoneNumberConsent)) * 31) + Boolean.hashCode(this.publishWebAddressConsent)) * 31;
        String str = this.phoneNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.webAddress;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CompanyApplicationContactDetailsInputV2Dto(email=" + this.email + ", publishEmailConsent=" + this.publishEmailConsent + ", publishPhoneNumberConsent=" + this.publishPhoneNumberConsent + ", publishWebAddressConsent=" + this.publishWebAddressConsent + ", phoneNumber=" + this.phoneNumber + ", webAddress=" + this.webAddress + ')';
    }
}
