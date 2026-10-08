package pl.gov.coi.mobywatel.technical.containers.data.model;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lpl/gov/coi/mobywatel/technical/containers/data/model/OwnerAddressDto;", "", "street", "", "city", "postalCode", "country", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStreet", "()Ljava/lang/String;", "getCity", "getPostalCode", "getCountry", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OwnerAddressDto {

    @c("city")
    private final String city;

    @c("country")
    private final String country;

    @c("postalCode")
    private final String postalCode;

    @c("street")
    private final String street;

    public OwnerAddressDto() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ OwnerAddressDto copy$default(OwnerAddressDto ownerAddressDto, String str, String str2, String str3, String str4, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = ownerAddressDto.street;
        }
        if ((i15 & 2) != 0) {
            str2 = ownerAddressDto.city;
        }
        if ((i15 & 4) != 0) {
            str3 = ownerAddressDto.postalCode;
        }
        if ((i15 & 8) != 0) {
            str4 = ownerAddressDto.country;
        }
        return ownerAddressDto.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    public final OwnerAddressDto copy(String street, String city, String postalCode, String country) {
        return new OwnerAddressDto(street, city, postalCode, country);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OwnerAddressDto)) {
            return false;
        }
        OwnerAddressDto ownerAddressDto = (OwnerAddressDto) other;
        return t.c(this.street, ownerAddressDto.street) && t.c(this.city, ownerAddressDto.city) && t.c(this.postalCode, ownerAddressDto.postalCode) && t.c(this.country, ownerAddressDto.country);
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getStreet() {
        return this.street;
    }

    public int hashCode() {
        String str = this.street;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.city;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.postalCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.country;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "OwnerAddressDto(street=" + this.street + ", city=" + this.city + ", postalCode=" + this.postalCode + ", country=" + this.country + ')';
    }

    public OwnerAddressDto(String str, String str2, String str3, String str4) {
        this.street = str;
        this.city = str2;
        this.postalCode = str3;
        this.country = str4;
    }

    public /* synthetic */ OwnerAddressDto(String str, String str2, String str3, String str4, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : str2, (i15 & 4) != 0 ? null : str3, (i15 & 8) != 0 ? null : str4);
    }
}
