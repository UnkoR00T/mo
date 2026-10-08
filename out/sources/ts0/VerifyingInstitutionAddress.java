package ts0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ts0.u, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0019"}, d2 = {"Lts0/u;", "", "", "city", "postalCode", "buildingNumber", "street", "apartmentNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "e", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VerifyingInstitutionAddress {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String city;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String postalCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String buildingNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String street;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String apartmentNumber;

    public VerifyingInstitutionAddress(String str, String str2, String str3, String str4, String str5) {
        this.city = str;
        this.postalCode = str2;
        this.buildingNumber = str3;
        this.street = str4;
        this.apartmentNumber = str5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getApartmentNumber() {
        return this.apartmentNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBuildingNumber() {
        return this.buildingNumber;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyingInstitutionAddress)) {
            return false;
        }
        VerifyingInstitutionAddress verifyingInstitutionAddress = (VerifyingInstitutionAddress) other;
        return fr.t.c(this.city, verifyingInstitutionAddress.city) && fr.t.c(this.postalCode, verifyingInstitutionAddress.postalCode) && fr.t.c(this.buildingNumber, verifyingInstitutionAddress.buildingNumber) && fr.t.c(this.street, verifyingInstitutionAddress.street) && fr.t.c(this.apartmentNumber, verifyingInstitutionAddress.apartmentNumber);
    }

    public int hashCode() {
        int iHashCode = ((((this.city.hashCode() * 31) + this.postalCode.hashCode()) * 31) + this.buildingNumber.hashCode()) * 31;
        String str = this.street;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.apartmentNumber;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "VerifyingInstitutionAddress(city=" + this.city + ", postalCode=" + this.postalCode + ", buildingNumber=" + this.buildingNumber + ", street=" + this.street + ", apartmentNumber=" + this.apartmentNumber + ")";
    }
}
