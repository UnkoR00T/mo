package k34;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: k34.f0, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, d2 = {"Lk34/f0;", "", "Liy/b0;", "photo", "firstName", "secondName", "surname", "pesel", "<init>", "(Liy/b0;Liy/b0;Liy/b0;Liy/b0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "c", "()Liy/b0;", "b", "d", "e", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserDocumentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 photo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 firstName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 secondName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 surname;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 pesel;

    public UserDocumentData(iy.b0 b0Var, iy.b0 b0Var2, iy.b0 b0Var3, iy.b0 b0Var4, iy.b0 b0Var5) {
        this.photo = b0Var;
        this.firstName = b0Var2;
        this.secondName = b0Var3;
        this.surname = b0Var4;
        this.pesel = b0Var5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final iy.b0 getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final iy.b0 getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final iy.b0 getPhoto() {
        return this.photo;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final iy.b0 getSecondName() {
        return this.secondName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final iy.b0 getSurname() {
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
        return fr.t.c(this.photo, userDocumentData.photo) && fr.t.c(this.firstName, userDocumentData.firstName) && fr.t.c(this.secondName, userDocumentData.secondName) && fr.t.c(this.surname, userDocumentData.surname) && fr.t.c(this.pesel, userDocumentData.pesel);
    }

    public int hashCode() {
        int iHashCode = ((this.photo.hashCode() * 31) + this.firstName.hashCode()) * 31;
        iy.b0 b0Var = this.secondName;
        return ((((iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31) + this.surname.hashCode()) * 31) + this.pesel.hashCode();
    }

    public String toString() {
        return "UserDocumentData(photo=" + this.photo + ", firstName=" + this.firstName + ", secondName=" + this.secondName + ", surname=" + this.surname + ", pesel=" + this.pesel + ")";
    }
}
