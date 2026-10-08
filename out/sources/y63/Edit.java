package y63;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: y63.g, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"Ly63/g;", "", "Liy/b0;", "prefix", "phoneNumber", "<init>", "(Liy/b0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "b", "()Liy/b0;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Edit implements a.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f224777c = iy.b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 prefix;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 phoneNumber;

    public Edit(iy.b0 b0Var, iy.b0 b0Var2) {
        this.prefix = b0Var;
        this.phoneNumber = b0Var2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final iy.b0 getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final iy.b0 getPrefix() {
        return this.prefix;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Edit)) {
            return false;
        }
        Edit edit = (Edit) other;
        return fr.t.c(this.prefix, edit.prefix) && fr.t.c(this.phoneNumber, edit.phoneNumber);
    }

    public int hashCode() {
        return (this.prefix.hashCode() * 31) + this.phoneNumber.hashCode();
    }

    public String toString() {
        return "Edit(prefix=" + this.prefix + ", phoneNumber=" + this.phoneNumber + ')';
    }
}
