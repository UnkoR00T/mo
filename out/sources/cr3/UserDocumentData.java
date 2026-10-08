package cr3;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: cr3.d, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcr3/d;", "", "", "photo", "firstName", "secondName", "surname", "pesel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "e", "wru_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserDocumentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String photo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String secondName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String surname;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pesel;

    public UserDocumentData(String str, String str2, String str3, String str4, String str5) {
        this.photo = str;
        this.firstName = str2;
        this.secondName = str3;
        this.surname = str4;
        this.pesel = str5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPhoto() {
        return this.photo;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSecondName() {
        return this.secondName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserDocumentData)) {
            return false;
        }
        UserDocumentData userDocumentData = (UserDocumentData) other;
        return t.c(this.photo, userDocumentData.photo) && t.c(this.firstName, userDocumentData.firstName) && t.c(this.secondName, userDocumentData.secondName) && t.c(this.surname, userDocumentData.surname) && t.c(this.pesel, userDocumentData.pesel);
    }

    public int hashCode() {
        String str = this.photo;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.firstName.hashCode()) * 31;
        String str2 = this.secondName;
        return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.surname.hashCode()) * 31) + this.pesel.hashCode();
    }

    public String toString() {
        return "UserDocumentData(photo=" + this.photo + ", firstName=" + this.firstName + ", secondName=" + this.secondName + ", surname=" + this.surname + ", pesel=" + this.pesel + ')';
    }
}
