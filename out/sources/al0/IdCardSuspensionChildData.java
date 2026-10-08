package al0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: al0.d0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, d2 = {"Lal0/d0;", "", "Liy/b0;", "firstName", "Lxw/g;", "pesel", "surname", "secondName", "seriesAndNumber", "<init>", "(Liy/b0;Liy/b0;Liy/b0;Liy/b0;Liy/b0;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "c", "e", "d", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IdCardSuspensionChildData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 firstName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 pesel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 surname;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 secondName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 seriesAndNumber;

    public /* synthetic */ IdCardSuspensionChildData(iy.b0 b0Var, iy.b0 b0Var2, iy.b0 b0Var3, iy.b0 b0Var4, iy.b0 b0Var5, fr.k kVar) {
        this(b0Var, b0Var2, b0Var3, b0Var4, b0Var5);
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
    public final iy.b0 getSecondName() {
        return this.secondName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final iy.b0 getSeriesAndNumber() {
        return this.seriesAndNumber;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final iy.b0 getSurname() {
        return this.surname;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdCardSuspensionChildData)) {
            return false;
        }
        IdCardSuspensionChildData idCardSuspensionChildData = (IdCardSuspensionChildData) other;
        return fr.t.c(this.firstName, idCardSuspensionChildData.firstName) && xw.g.f(this.pesel, idCardSuspensionChildData.pesel) && fr.t.c(this.surname, idCardSuspensionChildData.surname) && fr.t.c(this.secondName, idCardSuspensionChildData.secondName) && fr.t.c(this.seriesAndNumber, idCardSuspensionChildData.seriesAndNumber);
    }

    public int hashCode() {
        int iHashCode = ((((this.firstName.hashCode() * 31) + xw.g.h(this.pesel)) * 31) + this.surname.hashCode()) * 31;
        iy.b0 b0Var = this.secondName;
        int iHashCode2 = (iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        iy.b0 b0Var2 = this.seriesAndNumber;
        return iHashCode2 + (b0Var2 != null ? b0Var2.hashCode() : 0);
    }

    public String toString() {
        return "IdCardSuspensionChildData(firstName=" + this.firstName + ", pesel=" + xw.g.i(this.pesel) + ", surname=" + this.surname + ", secondName=" + this.secondName + ", seriesAndNumber=" + this.seriesAndNumber + ")";
    }

    private IdCardSuspensionChildData(iy.b0 b0Var, iy.b0 b0Var2, iy.b0 b0Var3, iy.b0 b0Var4, iy.b0 b0Var5) {
        this.firstName = b0Var;
        this.pesel = b0Var2;
        this.surname = b0Var3;
        this.secondName = b0Var4;
        this.seriesAndNumber = b0Var5;
    }
}
