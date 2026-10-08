package gm0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.t4, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u000fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lgm0/t4;", "", "Lgm0/s4;", "city", "", "houseNumber", "postCode", "Lgm0/v4;", "voivodeship", "apartmentNumber", "Lgm0/u4;", "street", "<init>", "(Lgm0/s4;Ljava/lang/String;Ljava/lang/String;Lgm0/v4;Ljava/lang/String;Lgm0/u4;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgm0/s4;", "getCity", "()Lgm0/s4;", "b", "Ljava/lang/String;", "getHouseNumber", "c", "getPostCode", "d", "Lgm0/v4;", "getVoivodeship", "()Lgm0/v4;", "e", "getApartmentNumber", "f", "Lgm0/u4;", "getStreet", "()Lgm0/u4;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PassportChildApplicationPolishCorrespondenceAddressDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("city")
    private final PassportChildApplicationPolishCorrespondenceAddressCityDto city;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("houseNumber")
    private final String houseNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("postCode")
    private final String postCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("voivodeship")
    private final PassportChildApplicationPolishCorrespondenceAddressVoivodeshipDto voivodeship;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("apartmentNumber")
    private final String apartmentNumber;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("street")
    private final PassportChildApplicationPolishCorrespondenceAddressStreetDto street;

    public PassportChildApplicationPolishCorrespondenceAddressDto(PassportChildApplicationPolishCorrespondenceAddressCityDto passportChildApplicationPolishCorrespondenceAddressCityDto, String str, String str2, PassportChildApplicationPolishCorrespondenceAddressVoivodeshipDto passportChildApplicationPolishCorrespondenceAddressVoivodeshipDto, String str3, PassportChildApplicationPolishCorrespondenceAddressStreetDto passportChildApplicationPolishCorrespondenceAddressStreetDto) {
        this.city = passportChildApplicationPolishCorrespondenceAddressCityDto;
        this.houseNumber = str;
        this.postCode = str2;
        this.voivodeship = passportChildApplicationPolishCorrespondenceAddressVoivodeshipDto;
        this.apartmentNumber = str3;
        this.street = passportChildApplicationPolishCorrespondenceAddressStreetDto;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportChildApplicationPolishCorrespondenceAddressDto)) {
            return false;
        }
        PassportChildApplicationPolishCorrespondenceAddressDto passportChildApplicationPolishCorrespondenceAddressDto = (PassportChildApplicationPolishCorrespondenceAddressDto) other;
        return fr.t.c(this.city, passportChildApplicationPolishCorrespondenceAddressDto.city) && fr.t.c(this.houseNumber, passportChildApplicationPolishCorrespondenceAddressDto.houseNumber) && fr.t.c(this.postCode, passportChildApplicationPolishCorrespondenceAddressDto.postCode) && fr.t.c(this.voivodeship, passportChildApplicationPolishCorrespondenceAddressDto.voivodeship) && fr.t.c(this.apartmentNumber, passportChildApplicationPolishCorrespondenceAddressDto.apartmentNumber) && fr.t.c(this.street, passportChildApplicationPolishCorrespondenceAddressDto.street);
    }

    public int hashCode() {
        int iHashCode = ((((((this.city.hashCode() * 31) + this.houseNumber.hashCode()) * 31) + this.postCode.hashCode()) * 31) + this.voivodeship.hashCode()) * 31;
        String str = this.apartmentNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        PassportChildApplicationPolishCorrespondenceAddressStreetDto passportChildApplicationPolishCorrespondenceAddressStreetDto = this.street;
        return iHashCode2 + (passportChildApplicationPolishCorrespondenceAddressStreetDto != null ? passportChildApplicationPolishCorrespondenceAddressStreetDto.hashCode() : 0);
    }

    public String toString() {
        return "PassportChildApplicationPolishCorrespondenceAddressDto(city=" + this.city + ", houseNumber=" + this.houseNumber + ", postCode=" + this.postCode + ", voivodeship=" + this.voivodeship + ", apartmentNumber=" + this.apartmentNumber + ", street=" + this.street + ')';
    }
}
