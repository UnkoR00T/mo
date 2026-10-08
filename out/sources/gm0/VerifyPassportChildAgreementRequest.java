package gm0;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.h7, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\r¨\u0006$"}, d2 = {"Lgm0/h7;", "", "", "childPesel", "Ljava/time/LocalDate;", "dateOfBirth", "firstName", "placeOfBirth", "surname", "secondName", "<init>", "(Ljava/lang/String;Ljava/time/LocalDate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getChildPesel", "b", "Ljava/time/LocalDate;", "getDateOfBirth", "()Ljava/time/LocalDate;", "c", "getFirstName", "d", "getPlaceOfBirth", "e", "getSurname", "f", "getSecondName", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VerifyPassportChildAgreementRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("childPesel")
    private final String childPesel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dateOfBirth")
    private final LocalDate dateOfBirth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("firstName")
    private final String firstName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("placeOfBirth")
    private final String placeOfBirth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("surname")
    private final String surname;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("secondName")
    private final String secondName;

    public VerifyPassportChildAgreementRequest(String str, LocalDate localDate, String str2, String str3, String str4, String str5) {
        this.childPesel = str;
        this.dateOfBirth = localDate;
        this.firstName = str2;
        this.placeOfBirth = str3;
        this.surname = str4;
        this.secondName = str5;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyPassportChildAgreementRequest)) {
            return false;
        }
        VerifyPassportChildAgreementRequest verifyPassportChildAgreementRequest = (VerifyPassportChildAgreementRequest) other;
        return fr.t.c(this.childPesel, verifyPassportChildAgreementRequest.childPesel) && fr.t.c(this.dateOfBirth, verifyPassportChildAgreementRequest.dateOfBirth) && fr.t.c(this.firstName, verifyPassportChildAgreementRequest.firstName) && fr.t.c(this.placeOfBirth, verifyPassportChildAgreementRequest.placeOfBirth) && fr.t.c(this.surname, verifyPassportChildAgreementRequest.surname) && fr.t.c(this.secondName, verifyPassportChildAgreementRequest.secondName);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.childPesel.hashCode() * 31) + this.dateOfBirth.hashCode()) * 31) + this.firstName.hashCode()) * 31) + this.placeOfBirth.hashCode()) * 31) + this.surname.hashCode()) * 31;
        String str = this.secondName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "VerifyPassportChildAgreementRequest(childPesel=" + this.childPesel + ", dateOfBirth=" + this.dateOfBirth + ", firstName=" + this.firstName + ", placeOfBirth=" + this.placeOfBirth + ", surname=" + this.surname + ", secondName=" + this.secondName + ')';
    }
}
