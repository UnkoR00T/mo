package pl.gov.coi.mobywatel.technical.documents.data.model.personal;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import java.time.LocalDate;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0081\u0001\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006-"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalAddressContainerDto;", "", "streetPrefix", "", "streetName", "houseNumber", "apartmentNumber", "postalCode", "localityTerritoryCode", "locality", "municipality", "voivodeship", "permanentAddressRegistrationDate", "Ljava/time/LocalDate;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDate;)V", "getStreetPrefix", "()Ljava/lang/String;", "getStreetName", "getHouseNumber", "getApartmentNumber", "getPostalCode", "getLocalityTerritoryCode", "getLocality", "getMunicipality", "getVoivodeship", "getPermanentAddressRegistrationDate", "()Ljava/time/LocalDate;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonalAddressContainerDto {

    @c("apartmentNumber")
    private final String apartmentNumber;

    @c("houseNumber")
    private final String houseNumber;

    @c("locality")
    private final String locality;

    @c("localityTerritoryCode")
    private final String localityTerritoryCode;

    @c("municipality")
    private final String municipality;

    @c("permanentAddressRegistrationDate")
    private final LocalDate permanentAddressRegistrationDate;

    @c("postalCode")
    private final String postalCode;

    @c("streetName")
    private final String streetName;

    @c("streetPrefix")
    private final String streetPrefix;

    @c("voivodeship")
    private final String voivodeship;

    public PersonalAddressContainerDto() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ PersonalAddressContainerDto copy$default(PersonalAddressContainerDto personalAddressContainerDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, LocalDate localDate, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = personalAddressContainerDto.streetPrefix;
        }
        if ((i15 & 2) != 0) {
            str2 = personalAddressContainerDto.streetName;
        }
        if ((i15 & 4) != 0) {
            str3 = personalAddressContainerDto.houseNumber;
        }
        if ((i15 & 8) != 0) {
            str4 = personalAddressContainerDto.apartmentNumber;
        }
        if ((i15 & 16) != 0) {
            str5 = personalAddressContainerDto.postalCode;
        }
        if ((i15 & 32) != 0) {
            str6 = personalAddressContainerDto.localityTerritoryCode;
        }
        if ((i15 & 64) != 0) {
            str7 = personalAddressContainerDto.locality;
        }
        if ((i15 & 128) != 0) {
            str8 = personalAddressContainerDto.municipality;
        }
        if ((i15 & 256) != 0) {
            str9 = personalAddressContainerDto.voivodeship;
        }
        if ((i15 & 512) != 0) {
            localDate = personalAddressContainerDto.permanentAddressRegistrationDate;
        }
        String str10 = str9;
        LocalDate localDate2 = localDate;
        String str11 = str7;
        String str12 = str8;
        String str13 = str5;
        String str14 = str6;
        return personalAddressContainerDto.copy(str, str2, str3, str4, str13, str14, str11, str12, str10, localDate2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStreetPrefix() {
        return this.streetPrefix;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final LocalDate getPermanentAddressRegistrationDate() {
        return this.permanentAddressRegistrationDate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStreetName() {
        return this.streetName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHouseNumber() {
        return this.houseNumber;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getApartmentNumber() {
        return this.apartmentNumber;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLocalityTerritoryCode() {
        return this.localityTerritoryCode;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLocality() {
        return this.locality;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMunicipality() {
        return this.municipality;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getVoivodeship() {
        return this.voivodeship;
    }

    public final PersonalAddressContainerDto copy(String streetPrefix, String streetName, String houseNumber, String apartmentNumber, String postalCode, String localityTerritoryCode, String locality, String municipality, String voivodeship, LocalDate permanentAddressRegistrationDate) {
        return new PersonalAddressContainerDto(streetPrefix, streetName, houseNumber, apartmentNumber, postalCode, localityTerritoryCode, locality, municipality, voivodeship, permanentAddressRegistrationDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalAddressContainerDto)) {
            return false;
        }
        PersonalAddressContainerDto personalAddressContainerDto = (PersonalAddressContainerDto) other;
        return t.c(this.streetPrefix, personalAddressContainerDto.streetPrefix) && t.c(this.streetName, personalAddressContainerDto.streetName) && t.c(this.houseNumber, personalAddressContainerDto.houseNumber) && t.c(this.apartmentNumber, personalAddressContainerDto.apartmentNumber) && t.c(this.postalCode, personalAddressContainerDto.postalCode) && t.c(this.localityTerritoryCode, personalAddressContainerDto.localityTerritoryCode) && t.c(this.locality, personalAddressContainerDto.locality) && t.c(this.municipality, personalAddressContainerDto.municipality) && t.c(this.voivodeship, personalAddressContainerDto.voivodeship) && t.c(this.permanentAddressRegistrationDate, personalAddressContainerDto.permanentAddressRegistrationDate);
    }

    public final String getApartmentNumber() {
        return this.apartmentNumber;
    }

    public final String getHouseNumber() {
        return this.houseNumber;
    }

    public final String getLocality() {
        return this.locality;
    }

    public final String getLocalityTerritoryCode() {
        return this.localityTerritoryCode;
    }

    public final String getMunicipality() {
        return this.municipality;
    }

    public final LocalDate getPermanentAddressRegistrationDate() {
        return this.permanentAddressRegistrationDate;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getStreetName() {
        return this.streetName;
    }

    public final String getStreetPrefix() {
        return this.streetPrefix;
    }

    public final String getVoivodeship() {
        return this.voivodeship;
    }

    public int hashCode() {
        String str = this.streetPrefix;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.streetName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.houseNumber;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.apartmentNumber;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.postalCode;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.localityTerritoryCode;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.locality;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.municipality;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.voivodeship;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        LocalDate localDate = this.permanentAddressRegistrationDate;
        return iHashCode9 + (localDate != null ? localDate.hashCode() : 0);
    }

    public String toString() {
        return "PersonalAddressContainerDto(streetPrefix=" + this.streetPrefix + ", streetName=" + this.streetName + ", houseNumber=" + this.houseNumber + ", apartmentNumber=" + this.apartmentNumber + ", postalCode=" + this.postalCode + ", localityTerritoryCode=" + this.localityTerritoryCode + ", locality=" + this.locality + ", municipality=" + this.municipality + ", voivodeship=" + this.voivodeship + ", permanentAddressRegistrationDate=" + this.permanentAddressRegistrationDate + ')';
    }

    public PersonalAddressContainerDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, LocalDate localDate) {
        this.streetPrefix = str;
        this.streetName = str2;
        this.houseNumber = str3;
        this.apartmentNumber = str4;
        this.postalCode = str5;
        this.localityTerritoryCode = str6;
        this.locality = str7;
        this.municipality = str8;
        this.voivodeship = str9;
        this.permanentAddressRegistrationDate = localDate;
    }

    public /* synthetic */ PersonalAddressContainerDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, LocalDate localDate, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : str2, (i15 & 4) != 0 ? null : str3, (i15 & 8) != 0 ? null : str4, (i15 & 16) != 0 ? null : str5, (i15 & 32) != 0 ? null : str6, (i15 & 64) != 0 ? null : str7, (i15 & 128) != 0 ? null : str8, (i15 & 256) != 0 ? null : str9, (i15 & 512) != 0 ? null : localDate);
    }
}
