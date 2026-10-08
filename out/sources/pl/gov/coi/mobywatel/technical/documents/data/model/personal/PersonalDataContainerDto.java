package pl.gov.coi.mobywatel.technical.documents.data.model.personal;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import java.time.LocalDate;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vl.c;
import wq.a;
import wq.b;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001@B\u009f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0014HÆ\u0003J¯\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006A"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataContainerDto;", "", "name", "", "surname", "fatherName", "motherName", "pesel", "birthDate", "Ljava/time/LocalDate;", "citizenship", "secondName", "familyName", "fatherFamilySurname", "motherFamilySurname", "birthPlace", "birthCountry", "gender", "Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataContainerDto$Gender;", "permanentAddress", "Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalAddressContainerDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataContainerDto$Gender;Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalAddressContainerDto;)V", "getName", "()Ljava/lang/String;", "getSurname", "getFatherName", "getMotherName", "getPesel", "getBirthDate", "()Ljava/time/LocalDate;", "getCitizenship", "getSecondName", "getFamilyName", "getFatherFamilySurname", "getMotherFamilySurname", "getBirthPlace", "getBirthCountry", "getGender", "()Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataContainerDto$Gender;", "getPermanentAddress", "()Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalAddressContainerDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "", "other", "hashCode", "", "toString", "Gender", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonalDataContainerDto {

    @c("birthCountry")
    private final String birthCountry;

    @c("birthDate")
    private final LocalDate birthDate;

    @c("birthPlace")
    private final String birthPlace;

    @c("citizenship")
    private final String citizenship;

    @c("familyName")
    private final String familyName;

    @c("fatherFamilySurname")
    private final String fatherFamilySurname;

    @c("fatherName")
    private final String fatherName;

    @c("gender")
    private final Gender gender;

    @c("motherFamilySurname")
    private final String motherFamilySurname;

    @c("motherName")
    private final String motherName;

    @c("name")
    private final String name;

    @c("permanentAddress")
    private final PersonalAddressContainerDto permanentAddress;

    @c("pesel")
    private final String pesel;

    @c("secondName")
    private final String secondName;

    @c("surname")
    private final String surname;

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataContainerDto$Gender;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MALE", "FEMALE", "UNKNOWN", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum Gender {
        MALE("MALE"),
        FEMALE("FEMALE"),
        UNKNOWN("UNKNOWN");

        private static final /* synthetic */ a $ENTRIES = b.a(values());
        private final String value;

        Gender(String str) {
            this.value = str;
        }

        public static a<Gender> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public PersonalDataContainerDto(String str, String str2, String str3, String str4, String str5, LocalDate localDate, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Gender gender, PersonalAddressContainerDto personalAddressContainerDto) {
        this.name = str;
        this.surname = str2;
        this.fatherName = str3;
        this.motherName = str4;
        this.pesel = str5;
        this.birthDate = localDate;
        this.citizenship = str6;
        this.secondName = str7;
        this.familyName = str8;
        this.fatherFamilySurname = str9;
        this.motherFamilySurname = str10;
        this.birthPlace = str11;
        this.birthCountry = str12;
        this.gender = gender;
        this.permanentAddress = personalAddressContainerDto;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getFatherFamilySurname() {
        return this.fatherFamilySurname;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getMotherFamilySurname() {
        return this.motherFamilySurname;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getBirthPlace() {
        return this.birthPlace;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getBirthCountry() {
        return this.birthCountry;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Gender getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final PersonalAddressContainerDto getPermanentAddress() {
        return this.permanentAddress;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFatherName() {
        return this.fatherName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMotherName() {
        return this.motherName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final LocalDate getBirthDate() {
        return this.birthDate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCitizenship() {
        return this.citizenship;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSecondName() {
        return this.secondName;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getFamilyName() {
        return this.familyName;
    }

    public final PersonalDataContainerDto copy(String name, String surname, String fatherName, String motherName, String pesel, LocalDate birthDate, String citizenship, String secondName, String familyName, String fatherFamilySurname, String motherFamilySurname, String birthPlace, String birthCountry, Gender gender, PersonalAddressContainerDto permanentAddress) {
        return new PersonalDataContainerDto(name, surname, fatherName, motherName, pesel, birthDate, citizenship, secondName, familyName, fatherFamilySurname, motherFamilySurname, birthPlace, birthCountry, gender, permanentAddress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalDataContainerDto)) {
            return false;
        }
        PersonalDataContainerDto personalDataContainerDto = (PersonalDataContainerDto) other;
        return t.c(this.name, personalDataContainerDto.name) && t.c(this.surname, personalDataContainerDto.surname) && t.c(this.fatherName, personalDataContainerDto.fatherName) && t.c(this.motherName, personalDataContainerDto.motherName) && t.c(this.pesel, personalDataContainerDto.pesel) && t.c(this.birthDate, personalDataContainerDto.birthDate) && t.c(this.citizenship, personalDataContainerDto.citizenship) && t.c(this.secondName, personalDataContainerDto.secondName) && t.c(this.familyName, personalDataContainerDto.familyName) && t.c(this.fatherFamilySurname, personalDataContainerDto.fatherFamilySurname) && t.c(this.motherFamilySurname, personalDataContainerDto.motherFamilySurname) && t.c(this.birthPlace, personalDataContainerDto.birthPlace) && t.c(this.birthCountry, personalDataContainerDto.birthCountry) && this.gender == personalDataContainerDto.gender && t.c(this.permanentAddress, personalDataContainerDto.permanentAddress);
    }

    public final String getBirthCountry() {
        return this.birthCountry;
    }

    public final LocalDate getBirthDate() {
        return this.birthDate;
    }

    public final String getBirthPlace() {
        return this.birthPlace;
    }

    public final String getCitizenship() {
        return this.citizenship;
    }

    public final String getFamilyName() {
        return this.familyName;
    }

    public final String getFatherFamilySurname() {
        return this.fatherFamilySurname;
    }

    public final String getFatherName() {
        return this.fatherName;
    }

    public final Gender getGender() {
        return this.gender;
    }

    public final String getMotherFamilySurname() {
        return this.motherFamilySurname;
    }

    public final String getMotherName() {
        return this.motherName;
    }

    public final String getName() {
        return this.name;
    }

    public final PersonalAddressContainerDto getPermanentAddress() {
        return this.permanentAddress;
    }

    public final String getPesel() {
        return this.pesel;
    }

    public final String getSecondName() {
        return this.secondName;
    }

    public final String getSurname() {
        return this.surname;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.name.hashCode() * 31) + this.surname.hashCode()) * 31) + this.fatherName.hashCode()) * 31) + this.motherName.hashCode()) * 31) + this.pesel.hashCode()) * 31) + this.birthDate.hashCode()) * 31) + this.citizenship.hashCode()) * 31;
        String str = this.secondName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.familyName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fatherFamilySurname;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.motherFamilySurname;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.birthPlace;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.birthCountry;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Gender gender = this.gender;
        int iHashCode8 = (iHashCode7 + (gender == null ? 0 : gender.hashCode())) * 31;
        PersonalAddressContainerDto personalAddressContainerDto = this.permanentAddress;
        return iHashCode8 + (personalAddressContainerDto != null ? personalAddressContainerDto.hashCode() : 0);
    }

    public String toString() {
        return "PersonalDataContainerDto(name=" + this.name + ", surname=" + this.surname + ", fatherName=" + this.fatherName + ", motherName=" + this.motherName + ", pesel=" + this.pesel + ", birthDate=" + this.birthDate + ", citizenship=" + this.citizenship + ", secondName=" + this.secondName + ", familyName=" + this.familyName + ", fatherFamilySurname=" + this.fatherFamilySurname + ", motherFamilySurname=" + this.motherFamilySurname + ", birthPlace=" + this.birthPlace + ", birthCountry=" + this.birthCountry + ", gender=" + this.gender + ", permanentAddress=" + this.permanentAddress + ')';
    }

    public /* synthetic */ PersonalDataContainerDto(String str, String str2, String str3, String str4, String str5, LocalDate localDate, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Gender gender, PersonalAddressContainerDto personalAddressContainerDto, int i15, k kVar) {
        this(str, str2, str3, str4, str5, localDate, str6, (i15 & 128) != 0 ? null : str7, (i15 & 256) != 0 ? null : str8, (i15 & 512) != 0 ? null : str9, (i15 & 1024) != 0 ? null : str10, (i15 & 2048) != 0 ? null : str11, (i15 & PKIFailureInfo.certConfirmed) != 0 ? null : str12, (i15 & PKIFailureInfo.certRevoked) != 0 ? null : gender, (i15 & 16384) != 0 ? null : personalAddressContainerDto);
    }
}
