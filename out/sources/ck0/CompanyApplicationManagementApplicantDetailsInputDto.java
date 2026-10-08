package ck0;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ck0.q, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001a\u001a\u0004\b+\u0010\u0011R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u001a\u001a\u0004\b-\u0010\u0011R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u001a\u001a\u0004\b/\u0010\u0011¨\u00060"}, d2 = {"Lck0/q;", "", "", "firstName", "pesel", "Lck0/e;", "residentialAddress", "surname", "Ljava/time/LocalDate;", "birthDate", "gender", "nip", "regon", "secondName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lck0/e;Ljava/lang/String;Ljava/time/LocalDate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getFirstName", "b", "getPesel", "c", "Lck0/e;", "getResidentialAddress", "()Lck0/e;", "d", "getSurname", "e", "Ljava/time/LocalDate;", "getBirthDate", "()Ljava/time/LocalDate;", "f", "getGender", "g", "getNip", "h", "getRegon", "i", "getSecondName", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CompanyApplicationManagementApplicantDetailsInputDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("firstName")
    private final String firstName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pesel")
    private final String pesel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("residentialAddress")
    private final CompanyApplicationAddressDto residentialAddress;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("surname")
    private final String surname;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("birthDate")
    private final LocalDate birthDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("gender")
    private final String gender;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("nip")
    private final String nip;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("regon")
    private final String regon;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("secondName")
    private final String secondName;

    public CompanyApplicationManagementApplicantDetailsInputDto(String str, String str2, CompanyApplicationAddressDto companyApplicationAddressDto, String str3, LocalDate localDate, String str4, String str5, String str6, String str7) {
        this.firstName = str;
        this.pesel = str2;
        this.residentialAddress = companyApplicationAddressDto;
        this.surname = str3;
        this.birthDate = localDate;
        this.gender = str4;
        this.nip = str5;
        this.regon = str6;
        this.secondName = str7;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanyApplicationManagementApplicantDetailsInputDto)) {
            return false;
        }
        CompanyApplicationManagementApplicantDetailsInputDto companyApplicationManagementApplicantDetailsInputDto = (CompanyApplicationManagementApplicantDetailsInputDto) other;
        return fr.t.c(this.firstName, companyApplicationManagementApplicantDetailsInputDto.firstName) && fr.t.c(this.pesel, companyApplicationManagementApplicantDetailsInputDto.pesel) && fr.t.c(this.residentialAddress, companyApplicationManagementApplicantDetailsInputDto.residentialAddress) && fr.t.c(this.surname, companyApplicationManagementApplicantDetailsInputDto.surname) && fr.t.c(this.birthDate, companyApplicationManagementApplicantDetailsInputDto.birthDate) && fr.t.c(this.gender, companyApplicationManagementApplicantDetailsInputDto.gender) && fr.t.c(this.nip, companyApplicationManagementApplicantDetailsInputDto.nip) && fr.t.c(this.regon, companyApplicationManagementApplicantDetailsInputDto.regon) && fr.t.c(this.secondName, companyApplicationManagementApplicantDetailsInputDto.secondName);
    }

    public int hashCode() {
        int iHashCode = ((((((this.firstName.hashCode() * 31) + this.pesel.hashCode()) * 31) + this.residentialAddress.hashCode()) * 31) + this.surname.hashCode()) * 31;
        LocalDate localDate = this.birthDate;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str = this.gender;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nip;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.regon;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.secondName;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "CompanyApplicationManagementApplicantDetailsInputDto(firstName=" + this.firstName + ", pesel=" + this.pesel + ", residentialAddress=" + this.residentialAddress + ", surname=" + this.surname + ", birthDate=" + this.birthDate + ", gender=" + this.gender + ", nip=" + this.nip + ", regon=" + this.regon + ", secondName=" + this.secondName + ')';
    }
}
