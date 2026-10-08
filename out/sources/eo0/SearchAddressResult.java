package eo0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: eo0.t0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\rR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001b\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001d\u0010\r¨\u0006\u001e"}, d2 = {"Leo0/t0;", "", "Leo0/u0;", "addressType", "", "buildingNumber", "city", "postalCode", "flatNumber", "street", "<init>", "(Leo0/u0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/u0;", "()Leo0/u0;", "b", "Ljava/lang/String;", "c", "d", "e", "f", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SearchAddressResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final u0 addressType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String buildingNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String city;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String postalCode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String flatNumber;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String street;

    public SearchAddressResult(u0 u0Var, String str, String str2, String str3, String str4, String str5) {
        this.addressType = u0Var;
        this.buildingNumber = str;
        this.city = str2;
        this.postalCode = str3;
        this.flatNumber = str4;
        this.street = str5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final u0 getAddressType() {
        return this.addressType;
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
    public final String getFlatNumber() {
        return this.flatNumber;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchAddressResult)) {
            return false;
        }
        SearchAddressResult searchAddressResult = (SearchAddressResult) other;
        return this.addressType == searchAddressResult.addressType && fr.t.c(this.buildingNumber, searchAddressResult.buildingNumber) && fr.t.c(this.city, searchAddressResult.city) && fr.t.c(this.postalCode, searchAddressResult.postalCode) && fr.t.c(this.flatNumber, searchAddressResult.flatNumber) && fr.t.c(this.street, searchAddressResult.street);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    public int hashCode() {
        u0 u0Var = this.addressType;
        int iHashCode = (u0Var == null ? 0 : u0Var.hashCode()) * 31;
        String str = this.buildingNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.city;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.postalCode;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.flatNumber;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.street;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "SearchAddressResult(addressType=" + this.addressType + ", buildingNumber=" + this.buildingNumber + ", city=" + this.city + ", postalCode=" + this.postalCode + ", flatNumber=" + this.flatNumber + ", street=" + this.street + ")";
    }
}
