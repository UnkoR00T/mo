package zr0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: zr0.d, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\f¨\u0006!"}, d2 = {"Lzr0/d;", "", "", "buildingNumber", "city", "name", "postalCode", "apartmentNumber", "street", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBuildingNumber", "b", "getCity", "c", "getName", "d", "getPostalCode", "e", "getApartmentNumber", "f", "getStreet", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEInstitutionAddress {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String buildingNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String city;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String postalCode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String apartmentNumber;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String street;

    public BEInstitutionAddress(String str, String str2, String str3, String str4, String str5, String str6) {
        this.buildingNumber = str;
        this.city = str2;
        this.name = str3;
        this.postalCode = str4;
        this.apartmentNumber = str5;
        this.street = str6;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEInstitutionAddress)) {
            return false;
        }
        BEInstitutionAddress bEInstitutionAddress = (BEInstitutionAddress) other;
        return t.c(this.buildingNumber, bEInstitutionAddress.buildingNumber) && t.c(this.city, bEInstitutionAddress.city) && t.c(this.name, bEInstitutionAddress.name) && t.c(this.postalCode, bEInstitutionAddress.postalCode) && t.c(this.apartmentNumber, bEInstitutionAddress.apartmentNumber) && t.c(this.street, bEInstitutionAddress.street);
    }

    public int hashCode() {
        int iHashCode = ((((((this.buildingNumber.hashCode() * 31) + this.city.hashCode()) * 31) + this.name.hashCode()) * 31) + this.postalCode.hashCode()) * 31;
        String str = this.apartmentNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.street;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "BEInstitutionAddress(buildingNumber=" + this.buildingNumber + ", city=" + this.city + ", name=" + this.name + ", postalCode=" + this.postalCode + ", apartmentNumber=" + this.apartmentNumber + ", street=" + this.street + ")";
    }
}
