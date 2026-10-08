package cl0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: cl0.v, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b\u0018\u0010\u001e¨\u0006&"}, d2 = {"Lcl0/v;", "", "Lcl0/w;", "city", "Liy/b0;", "houseNumber", "postCode", "Lcl0/x;", "street", "Lcl0/y;", "voivodeship", "apartmentNumber", "<init>", "(Lcl0/w;Liy/b0;Liy/b0;Lcl0/x;Lcl0/y;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcl0/w;", "b", "()Lcl0/w;", "Liy/b0;", "c", "()Liy/b0;", "d", "Lcl0/x;", "e", "()Lcl0/x;", "Lcl0/y;", "f", "()Lcl0/y;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEPassportChildApplicationPolishCorrespondenceAddress {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEPassportChildApplicationPolishCorrespondenceAddressCity city;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 houseNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 postCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEPassportChildApplicationPolishCorrespondenceAddressStreet street;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEPassportChildApplicationPolishCorrespondenceAddressVoivodeship voivodeship;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 apartmentNumber;

    public BEPassportChildApplicationPolishCorrespondenceAddress(BEPassportChildApplicationPolishCorrespondenceAddressCity bEPassportChildApplicationPolishCorrespondenceAddressCity, iy.b0 b0Var, iy.b0 b0Var2, BEPassportChildApplicationPolishCorrespondenceAddressStreet bEPassportChildApplicationPolishCorrespondenceAddressStreet, BEPassportChildApplicationPolishCorrespondenceAddressVoivodeship bEPassportChildApplicationPolishCorrespondenceAddressVoivodeship, iy.b0 b0Var3) {
        this.city = bEPassportChildApplicationPolishCorrespondenceAddressCity;
        this.houseNumber = b0Var;
        this.postCode = b0Var2;
        this.street = bEPassportChildApplicationPolishCorrespondenceAddressStreet;
        this.voivodeship = bEPassportChildApplicationPolishCorrespondenceAddressVoivodeship;
        this.apartmentNumber = b0Var3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final iy.b0 getApartmentNumber() {
        return this.apartmentNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BEPassportChildApplicationPolishCorrespondenceAddressCity getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final iy.b0 getHouseNumber() {
        return this.houseNumber;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final iy.b0 getPostCode() {
        return this.postCode;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final BEPassportChildApplicationPolishCorrespondenceAddressStreet getStreet() {
        return this.street;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEPassportChildApplicationPolishCorrespondenceAddress)) {
            return false;
        }
        BEPassportChildApplicationPolishCorrespondenceAddress bEPassportChildApplicationPolishCorrespondenceAddress = (BEPassportChildApplicationPolishCorrespondenceAddress) other;
        return fr.t.c(this.city, bEPassportChildApplicationPolishCorrespondenceAddress.city) && fr.t.c(this.houseNumber, bEPassportChildApplicationPolishCorrespondenceAddress.houseNumber) && fr.t.c(this.postCode, bEPassportChildApplicationPolishCorrespondenceAddress.postCode) && fr.t.c(this.street, bEPassportChildApplicationPolishCorrespondenceAddress.street) && fr.t.c(this.voivodeship, bEPassportChildApplicationPolishCorrespondenceAddress.voivodeship) && fr.t.c(this.apartmentNumber, bEPassportChildApplicationPolishCorrespondenceAddress.apartmentNumber);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final BEPassportChildApplicationPolishCorrespondenceAddressVoivodeship getVoivodeship() {
        return this.voivodeship;
    }

    public int hashCode() {
        int iHashCode = ((((this.city.hashCode() * 31) + this.houseNumber.hashCode()) * 31) + this.postCode.hashCode()) * 31;
        BEPassportChildApplicationPolishCorrespondenceAddressStreet bEPassportChildApplicationPolishCorrespondenceAddressStreet = this.street;
        int iHashCode2 = (((iHashCode + (bEPassportChildApplicationPolishCorrespondenceAddressStreet == null ? 0 : bEPassportChildApplicationPolishCorrespondenceAddressStreet.hashCode())) * 31) + this.voivodeship.hashCode()) * 31;
        iy.b0 b0Var = this.apartmentNumber;
        return iHashCode2 + (b0Var != null ? b0Var.hashCode() : 0);
    }

    public String toString() {
        return "BEPassportChildApplicationPolishCorrespondenceAddress(city=" + this.city + ", houseNumber=" + this.houseNumber + ", postCode=" + this.postCode + ", street=" + this.street + ", voivodeship=" + this.voivodeship + ", apartmentNumber=" + this.apartmentNumber + ")";
    }
}
