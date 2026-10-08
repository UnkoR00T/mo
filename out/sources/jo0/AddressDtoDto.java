package jo0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: jo0.e, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001b\u0010\u0004¨\u0006\u001f"}, d2 = {"Ljo0/e;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljo0/q1;", "a", "Ljo0/q1;", "()Ljo0/q1;", "addressType", "b", "Ljava/lang/String;", "c", "city", "getCountryCode", "countryCode", "d", "buildingNumber", "e", "flatNumber", "f", "postalCode", "g", "street", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddressDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("addressType")
    private final q1 addressType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("city")
    private final String city;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("countryCode")
    private final String countryCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("buildingNumber")
    private final String buildingNumber;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("flatNumber")
    private final String flatNumber;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("postalCode")
    private final String postalCode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("street")
    private final String street;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final q1 getAddressType() {
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
        if (!(other instanceof AddressDtoDto)) {
            return false;
        }
        AddressDtoDto addressDtoDto = (AddressDtoDto) other;
        return this.addressType == addressDtoDto.addressType && fr.t.c(this.city, addressDtoDto.city) && fr.t.c(this.countryCode, addressDtoDto.countryCode) && fr.t.c(this.buildingNumber, addressDtoDto.buildingNumber) && fr.t.c(this.flatNumber, addressDtoDto.flatNumber) && fr.t.c(this.postalCode, addressDtoDto.postalCode) && fr.t.c(this.street, addressDtoDto.street);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    public int hashCode() {
        int iHashCode = ((((this.addressType.hashCode() * 31) + this.city.hashCode()) * 31) + this.countryCode.hashCode()) * 31;
        String str = this.buildingNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.flatNumber;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.postalCode;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.street;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "AddressDtoDto(addressType=" + this.addressType + ", city=" + this.city + ", countryCode=" + this.countryCode + ", buildingNumber=" + this.buildingNumber + ", flatNumber=" + this.flatNumber + ", postalCode=" + this.postalCode + ", street=" + this.street + ')';
    }
}
