package js0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: js0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, d2 = {"Ljs0/a;", "", "", "apartmentNumber", "buildingNumber", "city", "country", "postalCode", "street", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "e", "f", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddressDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("apartmentNumber")
    private final String apartmentNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("buildingNumber")
    private final String buildingNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("city")
    private final String city;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("country")
    private final String country;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("postalCode")
    private final String postalCode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("street")
    private final String street;

    public AddressDto() {
        this(null, null, null, null, null, null, 63, null);
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
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressDto)) {
            return false;
        }
        AddressDto addressDto = (AddressDto) other;
        return fr.t.c(this.apartmentNumber, addressDto.apartmentNumber) && fr.t.c(this.buildingNumber, addressDto.buildingNumber) && fr.t.c(this.city, addressDto.city) && fr.t.c(this.country, addressDto.country) && fr.t.c(this.postalCode, addressDto.postalCode) && fr.t.c(this.street, addressDto.street);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    public int hashCode() {
        String str = this.apartmentNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.buildingNumber;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.city;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.country;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.postalCode;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.street;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "AddressDto(apartmentNumber=" + this.apartmentNumber + ", buildingNumber=" + this.buildingNumber + ", city=" + this.city + ", country=" + this.country + ", postalCode=" + this.postalCode + ", street=" + this.street + ')';
    }

    public AddressDto(String str, String str2, String str3, String str4, String str5, String str6) {
        this.apartmentNumber = str;
        this.buildingNumber = str2;
        this.city = str3;
        this.country = str4;
        this.postalCode = str5;
        this.street = str6;
    }

    public /* synthetic */ AddressDto(String str, String str2, String str3, String str4, String str5, String str6, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : str2, (i15 & 4) != 0 ? null : str3, (i15 & 8) != 0 ? null : str4, (i15 & 16) != 0 ? null : str5, (i15 & 32) != 0 ? null : str6);
    }
}
