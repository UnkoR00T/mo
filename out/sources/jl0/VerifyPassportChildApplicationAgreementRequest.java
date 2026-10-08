package jl0;

import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jl0.z, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001f\u0010\u0018¨\u0006 "}, d2 = {"Ljl0/z;", "", "Liy/b0;", "childPesel", "Lfz/b$c;", "dateOfBirth", "firstName", "placeOfBirth", "secondName", "surname", "<init>", "(Liy/b0;Lfz/b$c;Liy/b0;Liy/b0;Liy/b0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "Lfz/b$c;", "()Lfz/b$c;", "c", "d", "e", "f", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VerifyPassportChildApplicationAgreementRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 childPesel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDate dateOfBirth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 firstName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 placeOfBirth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 secondName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 surname;

    public VerifyPassportChildApplicationAgreementRequest(b0 b0Var, fz.b.LocalDate localDate, b0 b0Var2, b0 b0Var3, b0 b0Var4, b0 b0Var5) {
        this.childPesel = b0Var;
        this.dateOfBirth = localDate;
        this.firstName = b0Var2;
        this.placeOfBirth = b0Var3;
        this.secondName = b0Var4;
        this.surname = b0Var5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b0 getChildPesel() {
        return this.childPesel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final fz.b.LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getPlaceOfBirth() {
        return this.placeOfBirth;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b0 getSecondName() {
        return this.secondName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyPassportChildApplicationAgreementRequest)) {
            return false;
        }
        VerifyPassportChildApplicationAgreementRequest verifyPassportChildApplicationAgreementRequest = (VerifyPassportChildApplicationAgreementRequest) other;
        return fr.t.c(this.childPesel, verifyPassportChildApplicationAgreementRequest.childPesel) && fr.t.c(this.dateOfBirth, verifyPassportChildApplicationAgreementRequest.dateOfBirth) && fr.t.c(this.firstName, verifyPassportChildApplicationAgreementRequest.firstName) && fr.t.c(this.placeOfBirth, verifyPassportChildApplicationAgreementRequest.placeOfBirth) && fr.t.c(this.secondName, verifyPassportChildApplicationAgreementRequest.secondName) && fr.t.c(this.surname, verifyPassportChildApplicationAgreementRequest.surname);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b0 getSurname() {
        return this.surname;
    }

    public int hashCode() {
        return (((((((((this.childPesel.hashCode() * 31) + this.dateOfBirth.hashCode()) * 31) + this.firstName.hashCode()) * 31) + this.placeOfBirth.hashCode()) * 31) + this.secondName.hashCode()) * 31) + this.surname.hashCode();
    }

    public String toString() {
        return "VerifyPassportChildApplicationAgreementRequest(childPesel=" + this.childPesel + ", dateOfBirth=" + this.dateOfBirth + ", firstName=" + this.firstName + ", placeOfBirth=" + this.placeOfBirth + ", secondName=" + this.secondName + ", surname=" + this.surname + ")";
    }
}
