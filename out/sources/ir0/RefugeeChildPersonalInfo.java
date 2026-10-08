package ir0;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ir0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u001a"}, d2 = {"Lir0/a;", "", "Liy/b0;", "firstName", "secondName", "lastName", "pesel", "<init>", "(Liy/b0;Liy/b0;Liy/b0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "getSecondName", "c", "d", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RefugeeChildPersonalInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 firstName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 secondName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 lastName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 pesel;

    public RefugeeChildPersonalInfo(b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4) {
        this.firstName = b0Var;
        this.secondName = b0Var2;
        this.lastName = b0Var3;
        this.pesel = b0Var4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b0 getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getPesel() {
        return this.pesel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RefugeeChildPersonalInfo)) {
            return false;
        }
        RefugeeChildPersonalInfo refugeeChildPersonalInfo = (RefugeeChildPersonalInfo) other;
        return t.c(this.firstName, refugeeChildPersonalInfo.firstName) && t.c(this.secondName, refugeeChildPersonalInfo.secondName) && t.c(this.lastName, refugeeChildPersonalInfo.lastName) && t.c(this.pesel, refugeeChildPersonalInfo.pesel);
    }

    public int hashCode() {
        int iHashCode = this.firstName.hashCode() * 31;
        b0 b0Var = this.secondName;
        return ((((iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31) + this.lastName.hashCode()) * 31) + this.pesel.hashCode();
    }

    public String toString() {
        return "RefugeeChildPersonalInfo(firstName=" + this.firstName + ", secondName=" + this.secondName + ", lastName=" + this.lastName + ", pesel=" + this.pesel + ")";
    }
}
