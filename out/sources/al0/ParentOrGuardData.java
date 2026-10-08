package al0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: al0.j0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001a"}, d2 = {"Lal0/j0;", "", "", "firstName", "Liy/b0;", "identityCardSeriesAndNumber", "surname", "secondName", "<init>", "(Ljava/lang/String;Liy/b0;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Liy/b0;", "()Liy/b0;", "c", "d", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ParentOrGuardData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 identityCardSeriesAndNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String surname;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String secondName;

    public ParentOrGuardData(String str, iy.b0 b0Var, String str2, String str3) {
        this.firstName = str;
        this.identityCardSeriesAndNumber = b0Var;
        this.surname = str2;
        this.secondName = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final iy.b0 getIdentityCardSeriesAndNumber() {
        return this.identityCardSeriesAndNumber;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSecondName() {
        return this.secondName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParentOrGuardData)) {
            return false;
        }
        ParentOrGuardData parentOrGuardData = (ParentOrGuardData) other;
        return fr.t.c(this.firstName, parentOrGuardData.firstName) && fr.t.c(this.identityCardSeriesAndNumber, parentOrGuardData.identityCardSeriesAndNumber) && fr.t.c(this.surname, parentOrGuardData.surname) && fr.t.c(this.secondName, parentOrGuardData.secondName);
    }

    public int hashCode() {
        int iHashCode = ((((this.firstName.hashCode() * 31) + this.identityCardSeriesAndNumber.hashCode()) * 31) + this.surname.hashCode()) * 31;
        String str = this.secondName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ParentOrGuardData(firstName=" + this.firstName + ", identityCardSeriesAndNumber=" + this.identityCardSeriesAndNumber + ", surname=" + this.surname + ", secondName=" + this.secondName + ")";
    }
}
