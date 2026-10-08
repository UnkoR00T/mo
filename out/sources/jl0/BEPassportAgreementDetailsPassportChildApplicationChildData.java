package jl0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: jl0.g, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u0016\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001c\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001d\u0010\u000eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001e\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001f\u0010\u000e¨\u0006 "}, d2 = {"Ljl0/g;", "", "Lfz/b$c;", "dateOfBirth", "", "placeOfBirth", "anotherNames", "firstName", "pesel", "secondName", "surname", "<init>", "(Lfz/b$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfz/b$c;", "b", "()Lfz/b$c;", "Ljava/lang/String;", "e", "c", "d", "f", "g", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEPassportAgreementDetailsPassportChildApplicationChildData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDate dateOfBirth;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String placeOfBirth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String anotherNames;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pesel;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String secondName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String surname;

    public BEPassportAgreementDetailsPassportChildApplicationChildData(fz.b.LocalDate localDate, String str, String str2, String str3, String str4, String str5, String str6) {
        this.dateOfBirth = localDate;
        this.placeOfBirth = str;
        this.anotherNames = str2;
        this.firstName = str3;
        this.pesel = str4;
        this.secondName = str5;
        this.surname = str6;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAnotherNames() {
        return this.anotherNames;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final fz.b.LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPlaceOfBirth() {
        return this.placeOfBirth;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEPassportAgreementDetailsPassportChildApplicationChildData)) {
            return false;
        }
        BEPassportAgreementDetailsPassportChildApplicationChildData bEPassportAgreementDetailsPassportChildApplicationChildData = (BEPassportAgreementDetailsPassportChildApplicationChildData) other;
        return fr.t.c(this.dateOfBirth, bEPassportAgreementDetailsPassportChildApplicationChildData.dateOfBirth) && fr.t.c(this.placeOfBirth, bEPassportAgreementDetailsPassportChildApplicationChildData.placeOfBirth) && fr.t.c(this.anotherNames, bEPassportAgreementDetailsPassportChildApplicationChildData.anotherNames) && fr.t.c(this.firstName, bEPassportAgreementDetailsPassportChildApplicationChildData.firstName) && fr.t.c(this.pesel, bEPassportAgreementDetailsPassportChildApplicationChildData.pesel) && fr.t.c(this.secondName, bEPassportAgreementDetailsPassportChildApplicationChildData.secondName) && fr.t.c(this.surname, bEPassportAgreementDetailsPassportChildApplicationChildData.surname);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSecondName() {
        return this.secondName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    public int hashCode() {
        int iHashCode = ((this.dateOfBirth.hashCode() * 31) + this.placeOfBirth.hashCode()) * 31;
        String str = this.anotherNames;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.firstName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pesel;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.secondName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.surname;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "BEPassportAgreementDetailsPassportChildApplicationChildData(dateOfBirth=" + this.dateOfBirth + ", placeOfBirth=" + this.placeOfBirth + ", anotherNames=" + this.anotherNames + ", firstName=" + this.firstName + ", pesel=" + this.pesel + ", secondName=" + this.secondName + ", surname=" + this.surname + ")";
    }
}
