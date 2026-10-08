package cl1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: cl1.h, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcl1/h;", "", "Liy/b0;", "firstName", "lastName", "Lxw/g;", "pesel", "<init>", "(Liy/b0;Liy/b0;Liy/b0;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "c", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Data {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f28091d = iy.b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 firstName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 lastName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 pesel;

    public /* synthetic */ Data(iy.b0 b0Var, iy.b0 b0Var2, iy.b0 b0Var3, fr.k kVar) {
        this(b0Var, b0Var2, b0Var3);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final iy.b0 getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final iy.b0 getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final iy.b0 getPesel() {
        return this.pesel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return fr.t.c(this.firstName, data.firstName) && fr.t.c(this.lastName, data.lastName) && xw.g.f(this.pesel, data.pesel);
    }

    public int hashCode() {
        return (((this.firstName.hashCode() * 31) + this.lastName.hashCode()) * 31) + xw.g.h(this.pesel);
    }

    public String toString() {
        return "Data(firstName=" + this.firstName + ", lastName=" + this.lastName + ", pesel=" + ((Object) xw.g.i(this.pesel)) + ')';
    }

    private Data(iy.b0 b0Var, iy.b0 b0Var2, iy.b0 b0Var3) {
        this.firstName = b0Var;
        this.lastName = b0Var2;
        this.pesel = b0Var3;
    }
}
