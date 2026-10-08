package bl0;

import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: bl0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, d2 = {"Lbl0/b;", "", "Liy/b0;", "name", "secondName", "surname", "nationality", "Lfz/b$c;", "birthDate", "<init>", "(Liy/b0;Liy/b0;Liy/b0;Liy/b0;Lfz/b$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "b", "()Liy/b0;", "d", "c", "e", "Lfz/b$c;", "()Lfz/b$c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEChildBirthChildData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 secondName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 surname;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 nationality;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDate birthDate;

    public BEChildBirthChildData(b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4, fz.b.LocalDate localDate) {
        this.name = b0Var;
        this.secondName = b0Var2;
        this.surname = b0Var3;
        this.nationality = b0Var4;
        this.birthDate = localDate;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final fz.b.LocalDate getBirthDate() {
        return this.birthDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getNationality() {
        return this.nationality;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getSecondName() {
        return this.secondName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b0 getSurname() {
        return this.surname;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEChildBirthChildData)) {
            return false;
        }
        BEChildBirthChildData bEChildBirthChildData = (BEChildBirthChildData) other;
        return fr.t.c(this.name, bEChildBirthChildData.name) && fr.t.c(this.secondName, bEChildBirthChildData.secondName) && fr.t.c(this.surname, bEChildBirthChildData.surname) && fr.t.c(this.nationality, bEChildBirthChildData.nationality) && fr.t.c(this.birthDate, bEChildBirthChildData.birthDate);
    }

    public int hashCode() {
        return (((((((this.name.hashCode() * 31) + this.secondName.hashCode()) * 31) + this.surname.hashCode()) * 31) + this.nationality.hashCode()) * 31) + this.birthDate.hashCode();
    }

    public String toString() {
        return "BEChildBirthChildData(name=" + this.name + ", secondName=" + this.secondName + ", surname=" + this.surname + ", nationality=" + this.nationality + ", birthDate=" + this.birthDate + ")";
    }
}
