package pf1;

import fr.t;
import java.time.LocalDate;
import ld1.CompanyApplicationAddress;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: pf1.d, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b \u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b!\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\u0011R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b%\u0010\u0011¨\u0006'"}, d2 = {"Lpf1/d;", "", "Ljava/time/LocalDate;", "birthDate", "", "firstName", "gender", "nip", "pesel", "regon", "Lld1/c;", "residentialAddress", "surname", "secondName", "<init>", "(Ljava/time/LocalDate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lld1/c;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "b", "Ljava/lang/String;", "c", "d", "e", "f", "g", "Lld1/c;", "()Lld1/c;", "h", "i", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SuspensionApplicantDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate birthDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String gender;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nip;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pesel;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String regon;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final CompanyApplicationAddress residentialAddress;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String surname;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String secondName;

    public SuspensionApplicantDetails(LocalDate localDate, String str, String str2, String str3, String str4, String str5, CompanyApplicationAddress companyApplicationAddress, String str6, String str7) {
        this.birthDate = localDate;
        this.firstName = str;
        this.gender = str2;
        this.nip = str3;
        this.pesel = str4;
        this.regon = str5;
        this.residentialAddress = companyApplicationAddress;
        this.surname = str6;
        this.secondName = str7;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getBirthDate() {
        return this.birthDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getNip() {
        return this.nip;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPesel() {
        return this.pesel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuspensionApplicantDetails)) {
            return false;
        }
        SuspensionApplicantDetails suspensionApplicantDetails = (SuspensionApplicantDetails) other;
        return t.c(this.birthDate, suspensionApplicantDetails.birthDate) && t.c(this.firstName, suspensionApplicantDetails.firstName) && t.c(this.gender, suspensionApplicantDetails.gender) && t.c(this.nip, suspensionApplicantDetails.nip) && t.c(this.pesel, suspensionApplicantDetails.pesel) && t.c(this.regon, suspensionApplicantDetails.regon) && t.c(this.residentialAddress, suspensionApplicantDetails.residentialAddress) && t.c(this.surname, suspensionApplicantDetails.surname) && t.c(this.secondName, suspensionApplicantDetails.secondName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getRegon() {
        return this.regon;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final CompanyApplicationAddress getResidentialAddress() {
        return this.residentialAddress;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSecondName() {
        return this.secondName;
    }

    public int hashCode() {
        int iHashCode = ((((this.birthDate.hashCode() * 31) + this.firstName.hashCode()) * 31) + this.gender.hashCode()) * 31;
        String str = this.nip;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.pesel.hashCode()) * 31;
        String str2 = this.regon;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.residentialAddress.hashCode()) * 31) + this.surname.hashCode()) * 31;
        String str3 = this.secondName;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    public String toString() {
        return "SuspensionApplicantDetails(birthDate=" + this.birthDate + ", firstName=" + this.firstName + ", gender=" + this.gender + ", nip=" + this.nip + ", pesel=" + this.pesel + ", regon=" + this.regon + ", residentialAddress=" + this.residentialAddress + ", surname=" + this.surname + ", secondName=" + this.secondName + ')';
    }
}
