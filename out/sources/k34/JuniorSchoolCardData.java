package k34;

import java.util.Date;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: k34.v, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b!\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\u0017\u0010 R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b\u001a\u0010#¨\u0006$"}, d2 = {"Lk34/v;", "", "", "name", "secondName", "surname", "Ljava/util/Date;", "expirationDate", "pesel", "dateOfBirth", "issueDate", "", "disability", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "g", "c", "h", "d", "Ljava/util/Date;", "()Ljava/util/Date;", "f", "Z", "()Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorSchoolCardData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String secondName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String surname;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date expirationDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pesel;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date dateOfBirth;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date issueDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean disability;

    public JuniorSchoolCardData(String str, String str2, String str3, Date date, String str4, Date date2, Date date3, boolean z15) {
        this.name = str;
        this.secondName = str2;
        this.surname = str3;
        this.expirationDate = date;
        this.pesel = str4;
        this.dateOfBirth = date2;
        this.issueDate = date3;
        this.disability = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDisability() {
        return this.disability;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Date getIssueDate() {
        return this.issueDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JuniorSchoolCardData)) {
            return false;
        }
        JuniorSchoolCardData juniorSchoolCardData = (JuniorSchoolCardData) other;
        return fr.t.c(this.name, juniorSchoolCardData.name) && fr.t.c(this.secondName, juniorSchoolCardData.secondName) && fr.t.c(this.surname, juniorSchoolCardData.surname) && fr.t.c(this.expirationDate, juniorSchoolCardData.expirationDate) && fr.t.c(this.pesel, juniorSchoolCardData.pesel) && fr.t.c(this.dateOfBirth, juniorSchoolCardData.dateOfBirth) && fr.t.c(this.issueDate, juniorSchoolCardData.issueDate) && this.disability == juniorSchoolCardData.disability;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSecondName() {
        return this.secondName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.secondName;
        return ((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.surname.hashCode()) * 31) + this.expirationDate.hashCode()) * 31) + this.pesel.hashCode()) * 31) + this.dateOfBirth.hashCode()) * 31) + this.issueDate.hashCode()) * 31) + Boolean.hashCode(this.disability);
    }

    public String toString() {
        return "JuniorSchoolCardData(name=" + this.name + ", secondName=" + this.secondName + ", surname=" + this.surname + ", expirationDate=" + this.expirationDate + ", pesel=" + this.pesel + ", dateOfBirth=" + this.dateOfBirth + ", issueDate=" + this.issueDate + ", disability=" + this.disability + ")";
    }
}
