package pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto;

import androidx.annotation.Keep;
import fr.t;
import java.time.LocalDate;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003Ji\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013¨\u0006,"}, d2 = {"Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/PassportChildApplicationParentDataDto;", "", "dateOfBirth", "Ljava/time/LocalDate;", "firstName", "", "pesel", "gender", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/GenderDto;", "surname", "idCardSeriesAndNumber", "placeOfBirth", "secondName", "checksum", "<init>", "(Ljava/time/LocalDate;Ljava/lang/String;Ljava/lang/String;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/GenderDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDateOfBirth", "()Ljava/time/LocalDate;", "getFirstName", "()Ljava/lang/String;", "getPesel", "getGender", "()Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/GenderDto;", "getSurname", "getIdCardSeriesAndNumber", "getPlaceOfBirth", "getSecondName", "getChecksum", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PassportChildApplicationParentDataDto {
    public static final int $stable = 8;

    @c("checksum")
    private final String checksum;

    @c("dateOfBirth")
    private final LocalDate dateOfBirth;

    @c("firstName")
    private final String firstName;

    @c("gender")
    private final GenderDto gender;

    @c("idCardSeriesAndNumber")
    private final String idCardSeriesAndNumber;

    @c("pesel")
    private final String pesel;

    @c("placeOfBirth")
    private final String placeOfBirth;

    @c("secondName")
    private final String secondName;

    @c("surname")
    private final String surname;

    public PassportChildApplicationParentDataDto(LocalDate localDate, String str, String str2, GenderDto genderDto, String str3, String str4, String str5, String str6, String str7) {
        this.dateOfBirth = localDate;
        this.firstName = str;
        this.pesel = str2;
        this.gender = genderDto;
        this.surname = str3;
        this.idCardSeriesAndNumber = str4;
        this.placeOfBirth = str5;
        this.secondName = str6;
        this.checksum = str7;
    }

    public static /* synthetic */ PassportChildApplicationParentDataDto copy$default(PassportChildApplicationParentDataDto passportChildApplicationParentDataDto, LocalDate localDate, String str, String str2, GenderDto genderDto, String str3, String str4, String str5, String str6, String str7, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            localDate = passportChildApplicationParentDataDto.dateOfBirth;
        }
        if ((i15 & 2) != 0) {
            str = passportChildApplicationParentDataDto.firstName;
        }
        if ((i15 & 4) != 0) {
            str2 = passportChildApplicationParentDataDto.pesel;
        }
        if ((i15 & 8) != 0) {
            genderDto = passportChildApplicationParentDataDto.gender;
        }
        if ((i15 & 16) != 0) {
            str3 = passportChildApplicationParentDataDto.surname;
        }
        if ((i15 & 32) != 0) {
            str4 = passportChildApplicationParentDataDto.idCardSeriesAndNumber;
        }
        if ((i15 & 64) != 0) {
            str5 = passportChildApplicationParentDataDto.placeOfBirth;
        }
        if ((i15 & 128) != 0) {
            str6 = passportChildApplicationParentDataDto.secondName;
        }
        if ((i15 & 256) != 0) {
            str7 = passportChildApplicationParentDataDto.checksum;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        String str12 = str3;
        String str13 = str2;
        return passportChildApplicationParentDataDto.copy(localDate, str, str13, genderDto, str12, str10, str11, str8, str9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final GenderDto getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIdCardSeriesAndNumber() {
        return this.idCardSeriesAndNumber;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPlaceOfBirth() {
        return this.placeOfBirth;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSecondName() {
        return this.secondName;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getChecksum() {
        return this.checksum;
    }

    public final PassportChildApplicationParentDataDto copy(LocalDate dateOfBirth, String firstName, String pesel, GenderDto gender, String surname, String idCardSeriesAndNumber, String placeOfBirth, String secondName, String checksum) {
        return new PassportChildApplicationParentDataDto(dateOfBirth, firstName, pesel, gender, surname, idCardSeriesAndNumber, placeOfBirth, secondName, checksum);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportChildApplicationParentDataDto)) {
            return false;
        }
        PassportChildApplicationParentDataDto passportChildApplicationParentDataDto = (PassportChildApplicationParentDataDto) other;
        return t.c(this.dateOfBirth, passportChildApplicationParentDataDto.dateOfBirth) && t.c(this.firstName, passportChildApplicationParentDataDto.firstName) && t.c(this.pesel, passportChildApplicationParentDataDto.pesel) && this.gender == passportChildApplicationParentDataDto.gender && t.c(this.surname, passportChildApplicationParentDataDto.surname) && t.c(this.idCardSeriesAndNumber, passportChildApplicationParentDataDto.idCardSeriesAndNumber) && t.c(this.placeOfBirth, passportChildApplicationParentDataDto.placeOfBirth) && t.c(this.secondName, passportChildApplicationParentDataDto.secondName) && t.c(this.checksum, passportChildApplicationParentDataDto.checksum);
    }

    public final String getChecksum() {
        return this.checksum;
    }

    public final LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final GenderDto getGender() {
        return this.gender;
    }

    public final String getIdCardSeriesAndNumber() {
        return this.idCardSeriesAndNumber;
    }

    public final String getPesel() {
        return this.pesel;
    }

    public final String getPlaceOfBirth() {
        return this.placeOfBirth;
    }

    public final String getSecondName() {
        return this.secondName;
    }

    public final String getSurname() {
        return this.surname;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.dateOfBirth.hashCode() * 31) + this.firstName.hashCode()) * 31) + this.pesel.hashCode()) * 31) + this.gender.hashCode()) * 31) + this.surname.hashCode()) * 31;
        String str = this.idCardSeriesAndNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.placeOfBirth;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.secondName;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.checksum.hashCode();
    }

    public String toString() {
        return "PassportChildApplicationParentDataDto(dateOfBirth=" + this.dateOfBirth + ", firstName=" + this.firstName + ", pesel=" + this.pesel + ", gender=" + this.gender + ", surname=" + this.surname + ", idCardSeriesAndNumber=" + this.idCardSeriesAndNumber + ", placeOfBirth=" + this.placeOfBirth + ", secondName=" + this.secondName + ", checksum=" + this.checksum + ')';
    }
}
