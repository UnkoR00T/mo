package ck0;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ck0.a0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b*\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u001d\u001a\u0004\b0\u0010\u0014R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u001d\u001a\u0004\b2\u0010\u0014R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u001d\u001a\u0004\b4\u0010\u0014R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u001d\u001a\u0004\b6\u0010\u0014R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010\u001d\u001a\u0004\b8\u0010\u0014¨\u00069"}, d2 = {"Lck0/a0;", "", "", "birthPlace", "firstName", "mobileIdCardNumber", "pesel", "Lck0/e;", "residentialAddress", "surname", "Ljava/time/LocalDate;", "birthDate", "familyName", "fatherName", "gender", "motherName", "secondName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lck0/e;Ljava/lang/String;Ljava/time/LocalDate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBirthPlace", "b", "getFirstName", "c", "getMobileIdCardNumber", "d", "getPesel", "e", "Lck0/e;", "getResidentialAddress", "()Lck0/e;", "f", "getSurname", "g", "Ljava/time/LocalDate;", "getBirthDate", "()Ljava/time/LocalDate;", "h", "getFamilyName", "i", "getFatherName", "j", "getGender", "k", "getMotherName", "l", "getSecondName", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CompanyApplicationSetupApplicantDetailsInputDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("birthPlace")
    private final String birthPlace;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("firstName")
    private final String firstName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("mobileIdCardNumber")
    private final String mobileIdCardNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pesel")
    private final String pesel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("residentialAddress")
    private final CompanyApplicationAddressDto residentialAddress;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("surname")
    private final String surname;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("birthDate")
    private final LocalDate birthDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("familyName")
    private final String familyName;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fatherName")
    private final String fatherName;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("gender")
    private final String gender;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("motherName")
    private final String motherName;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("secondName")
    private final String secondName;

    public CompanyApplicationSetupApplicantDetailsInputDto(String str, String str2, String str3, String str4, CompanyApplicationAddressDto companyApplicationAddressDto, String str5, LocalDate localDate, String str6, String str7, String str8, String str9, String str10) {
        this.birthPlace = str;
        this.firstName = str2;
        this.mobileIdCardNumber = str3;
        this.pesel = str4;
        this.residentialAddress = companyApplicationAddressDto;
        this.surname = str5;
        this.birthDate = localDate;
        this.familyName = str6;
        this.fatherName = str7;
        this.gender = str8;
        this.motherName = str9;
        this.secondName = str10;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanyApplicationSetupApplicantDetailsInputDto)) {
            return false;
        }
        CompanyApplicationSetupApplicantDetailsInputDto companyApplicationSetupApplicantDetailsInputDto = (CompanyApplicationSetupApplicantDetailsInputDto) other;
        return fr.t.c(this.birthPlace, companyApplicationSetupApplicantDetailsInputDto.birthPlace) && fr.t.c(this.firstName, companyApplicationSetupApplicantDetailsInputDto.firstName) && fr.t.c(this.mobileIdCardNumber, companyApplicationSetupApplicantDetailsInputDto.mobileIdCardNumber) && fr.t.c(this.pesel, companyApplicationSetupApplicantDetailsInputDto.pesel) && fr.t.c(this.residentialAddress, companyApplicationSetupApplicantDetailsInputDto.residentialAddress) && fr.t.c(this.surname, companyApplicationSetupApplicantDetailsInputDto.surname) && fr.t.c(this.birthDate, companyApplicationSetupApplicantDetailsInputDto.birthDate) && fr.t.c(this.familyName, companyApplicationSetupApplicantDetailsInputDto.familyName) && fr.t.c(this.fatherName, companyApplicationSetupApplicantDetailsInputDto.fatherName) && fr.t.c(this.gender, companyApplicationSetupApplicantDetailsInputDto.gender) && fr.t.c(this.motherName, companyApplicationSetupApplicantDetailsInputDto.motherName) && fr.t.c(this.secondName, companyApplicationSetupApplicantDetailsInputDto.secondName);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.birthPlace.hashCode() * 31) + this.firstName.hashCode()) * 31) + this.mobileIdCardNumber.hashCode()) * 31) + this.pesel.hashCode()) * 31) + this.residentialAddress.hashCode()) * 31) + this.surname.hashCode()) * 31;
        LocalDate localDate = this.birthDate;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str = this.familyName;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fatherName;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.gender;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.motherName;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.secondName;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "CompanyApplicationSetupApplicantDetailsInputDto(birthPlace=" + this.birthPlace + ", firstName=" + this.firstName + ", mobileIdCardNumber=" + this.mobileIdCardNumber + ", pesel=" + this.pesel + ", residentialAddress=" + this.residentialAddress + ", surname=" + this.surname + ", birthDate=" + this.birthDate + ", familyName=" + this.familyName + ", fatherName=" + this.fatherName + ", gender=" + this.gender + ", motherName=" + this.motherName + ", secondName=" + this.secondName + ')';
    }
}
