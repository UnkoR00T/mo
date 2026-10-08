package yd3;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yd3.d, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u001b"}, d2 = {"Lyd3/d;", "", "Liy/b0;", "streetName", "houseNumber", "postalCode", "municipality", "apartmentNumber", "<init>", "(Liy/b0;Liy/b0;Liy/b0;Liy/b0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "e", "()Liy/b0;", "b", "c", "d", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonalAddressContainer {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f226588f = b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 streetName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 houseNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 postalCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 municipality;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 apartmentNumber;

    public PersonalAddressContainer(b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4, b0 b0Var5) {
        this.streetName = b0Var;
        this.houseNumber = b0Var2;
        this.postalCode = b0Var3;
        this.municipality = b0Var4;
        this.apartmentNumber = b0Var5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b0 getApartmentNumber() {
        return this.apartmentNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getHouseNumber() {
        return this.houseNumber;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getMunicipality() {
        return this.municipality;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getPostalCode() {
        return this.postalCode;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b0 getStreetName() {
        return this.streetName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalAddressContainer)) {
            return false;
        }
        PersonalAddressContainer personalAddressContainer = (PersonalAddressContainer) other;
        return t.c(this.streetName, personalAddressContainer.streetName) && t.c(this.houseNumber, personalAddressContainer.houseNumber) && t.c(this.postalCode, personalAddressContainer.postalCode) && t.c(this.municipality, personalAddressContainer.municipality) && t.c(this.apartmentNumber, personalAddressContainer.apartmentNumber);
    }

    public int hashCode() {
        b0 b0Var = this.streetName;
        int iHashCode = (b0Var == null ? 0 : b0Var.hashCode()) * 31;
        b0 b0Var2 = this.houseNumber;
        int iHashCode2 = (iHashCode + (b0Var2 == null ? 0 : b0Var2.hashCode())) * 31;
        b0 b0Var3 = this.postalCode;
        int iHashCode3 = (iHashCode2 + (b0Var3 == null ? 0 : b0Var3.hashCode())) * 31;
        b0 b0Var4 = this.municipality;
        int iHashCode4 = (iHashCode3 + (b0Var4 == null ? 0 : b0Var4.hashCode())) * 31;
        b0 b0Var5 = this.apartmentNumber;
        return iHashCode4 + (b0Var5 != null ? b0Var5.hashCode() : 0);
    }

    public String toString() {
        return "PersonalAddressContainer(streetName=" + this.streetName + ", houseNumber=" + this.houseNumber + ", postalCode=" + this.postalCode + ", municipality=" + this.municipality + ", apartmentNumber=" + this.apartmentNumber + ')';
    }
}
