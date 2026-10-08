package y63;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: y63.f, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Ly63/f;", "", "Liy/b0;", "prefix", "phoneNumber", "previousPrefix", "previousPhoneNumber", "", "isAnyContactRegistered", "<init>", "(Liy/b0;Liy/b0;Liy/b0;Liy/b0;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "b", "()Liy/b0;", "c", "d", "e", "Z", "()Z", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Confirm implements a.k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f224701f = iy.b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 prefix;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 phoneNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 previousPrefix;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 previousPhoneNumber;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAnyContactRegistered;

    public Confirm(iy.b0 b0Var, iy.b0 b0Var2, iy.b0 b0Var3, iy.b0 b0Var4, boolean z15) {
        this.prefix = b0Var;
        this.phoneNumber = b0Var2;
        this.previousPrefix = b0Var3;
        this.previousPhoneNumber = b0Var4;
        this.isAnyContactRegistered = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final iy.b0 getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final iy.b0 getPrefix() {
        return this.prefix;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final iy.b0 getPreviousPhoneNumber() {
        return this.previousPhoneNumber;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final iy.b0 getPreviousPrefix() {
        return this.previousPrefix;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsAnyContactRegistered() {
        return this.isAnyContactRegistered;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Confirm)) {
            return false;
        }
        Confirm confirm = (Confirm) other;
        return fr.t.c(this.prefix, confirm.prefix) && fr.t.c(this.phoneNumber, confirm.phoneNumber) && fr.t.c(this.previousPrefix, confirm.previousPrefix) && fr.t.c(this.previousPhoneNumber, confirm.previousPhoneNumber) && this.isAnyContactRegistered == confirm.isAnyContactRegistered;
    }

    public int hashCode() {
        int iHashCode = ((this.prefix.hashCode() * 31) + this.phoneNumber.hashCode()) * 31;
        iy.b0 b0Var = this.previousPrefix;
        int iHashCode2 = (iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        iy.b0 b0Var2 = this.previousPhoneNumber;
        return ((iHashCode2 + (b0Var2 != null ? b0Var2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isAnyContactRegistered);
    }

    public String toString() {
        return "Confirm(prefix=" + this.prefix + ", phoneNumber=" + this.phoneNumber + ", previousPrefix=" + this.previousPrefix + ", previousPhoneNumber=" + this.previousPhoneNumber + ", isAnyContactRegistered=" + this.isAnyContactRegistered + ')';
    }
}
