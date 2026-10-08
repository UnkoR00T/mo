package yi0;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yi0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001b\u0010\u0016¨\u0006\u001c"}, d2 = {"Lyi0/b;", "", "Liy/b0;", "apartmentNumber", "buildingNumber", "", "city", "postalCode", "street", "<init>", "(Liy/b0;Liy/b0;Ljava/lang/String;Ljava/lang/String;Liy/b0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "c", "Ljava/lang/String;", "d", "e", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CitizenAddress {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 apartmentNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 buildingNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String city;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String postalCode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 street;

    public CitizenAddress(b0 b0Var, b0 b0Var2, String str, String str2, b0 b0Var3) {
        this.apartmentNumber = b0Var;
        this.buildingNumber = b0Var2;
        this.city = str;
        this.postalCode = str2;
        this.street = b0Var3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b0 getApartmentNumber() {
        return this.apartmentNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getBuildingNumber() {
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
    public final b0 getStreet() {
        return this.street;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CitizenAddress)) {
            return false;
        }
        CitizenAddress citizenAddress = (CitizenAddress) other;
        return t.c(this.apartmentNumber, citizenAddress.apartmentNumber) && t.c(this.buildingNumber, citizenAddress.buildingNumber) && t.c(this.city, citizenAddress.city) && t.c(this.postalCode, citizenAddress.postalCode) && t.c(this.street, citizenAddress.street);
    }

    public int hashCode() {
        b0 b0Var = this.apartmentNumber;
        int iHashCode = (b0Var == null ? 0 : b0Var.hashCode()) * 31;
        b0 b0Var2 = this.buildingNumber;
        int iHashCode2 = (iHashCode + (b0Var2 == null ? 0 : b0Var2.hashCode())) * 31;
        String str = this.city;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.postalCode;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        b0 b0Var3 = this.street;
        return iHashCode4 + (b0Var3 != null ? b0Var3.hashCode() : 0);
    }

    public String toString() {
        return "CitizenAddress(apartmentNumber=" + this.apartmentNumber + ", buildingNumber=" + this.buildingNumber + ", city=" + this.city + ", postalCode=" + this.postalCode + ", street=" + this.street + ")";
    }
}
