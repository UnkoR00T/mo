package jo0;

import java.util.List;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jo0.f, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010\u0011R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001e\u001a\u0004\b+\u0010\u0011R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u001e\u001a\u0004\b-\u0010\u0011¨\u0006."}, d2 = {"Ljo0/f;", "", "", "Ljo0/q1;", "addressType", "", "buildingNumber", "city", "Ljo0/w;", "country", "countryCode", "flatNumber", "postalCode", "street", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljo0/w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getAddressType", "()Ljava/util/List;", "b", "Ljava/lang/String;", "getBuildingNumber", "c", "getCity", "d", "Ljo0/w;", "getCountry", "()Ljo0/w;", "e", "getCountryCode", "f", "getFlatNumber", "g", "getPostalCode", "h", "getStreet", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddressRequestDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("addressType")
    private final List<q1> addressType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("buildingNumber")
    private final String buildingNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("city")
    private final String city;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("country")
    private final CountryDtoDto country;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("countryCode")
    private final String countryCode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("flatNumber")
    private final String flatNumber;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("postalCode")
    private final String postalCode;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("street")
    private final String street;

    public AddressRequestDtoDto() {
        this(null, null, null, null, null, null, null, null, GF2Field.MASK, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressRequestDtoDto)) {
            return false;
        }
        AddressRequestDtoDto addressRequestDtoDto = (AddressRequestDtoDto) other;
        return fr.t.c(this.addressType, addressRequestDtoDto.addressType) && fr.t.c(this.buildingNumber, addressRequestDtoDto.buildingNumber) && fr.t.c(this.city, addressRequestDtoDto.city) && fr.t.c(this.country, addressRequestDtoDto.country) && fr.t.c(this.countryCode, addressRequestDtoDto.countryCode) && fr.t.c(this.flatNumber, addressRequestDtoDto.flatNumber) && fr.t.c(this.postalCode, addressRequestDtoDto.postalCode) && fr.t.c(this.street, addressRequestDtoDto.street);
    }

    public int hashCode() {
        List<q1> list = this.addressType;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.buildingNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.city;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CountryDtoDto countryDtoDto = this.country;
        int iHashCode4 = (iHashCode3 + (countryDtoDto == null ? 0 : countryDtoDto.hashCode())) * 31;
        String str3 = this.countryCode;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.flatNumber;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.postalCode;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.street;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "AddressRequestDtoDto(addressType=" + this.addressType + ", buildingNumber=" + this.buildingNumber + ", city=" + this.city + ", country=" + this.country + ", countryCode=" + this.countryCode + ", flatNumber=" + this.flatNumber + ", postalCode=" + this.postalCode + ", street=" + this.street + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddressRequestDtoDto(List<? extends q1> list, String str, String str2, CountryDtoDto countryDtoDto, String str3, String str4, String str5, String str6) {
        this.addressType = list;
        this.buildingNumber = str;
        this.city = str2;
        this.country = countryDtoDto;
        this.countryCode = str3;
        this.flatNumber = str4;
        this.postalCode = str5;
        this.street = str6;
    }

    public /* synthetic */ AddressRequestDtoDto(List list, String str, String str2, CountryDtoDto countryDtoDto, String str3, String str4, String str5, String str6, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : list, (i15 & 2) != 0 ? null : str, (i15 & 4) != 0 ? null : str2, (i15 & 8) != 0 ? null : countryDtoDto, (i15 & 16) != 0 ? null : str3, (i15 & 32) != 0 ? null : str4, (i15 & 64) != 0 ? null : str5, (i15 & 128) != 0 ? null : str6);
    }
}
