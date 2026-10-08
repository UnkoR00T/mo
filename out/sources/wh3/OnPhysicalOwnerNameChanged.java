package wh3;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: wh3.k, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lwh3/k;", "", "Ltv0/l$c$c;", "physicalOwnerType", "Liy/b0;", "name", "<init>", "(Ltv0/l$c$c;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltv0/l$c$c;", "b", "()Ltv0/l$c$c;", "Liy/b0;", "()Liy/b0;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OnPhysicalOwnerNameChanged {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f213423c = iy.b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final tv0.l.PhysicalOwner.EnumC5029c physicalOwnerType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 name;

    public OnPhysicalOwnerNameChanged(tv0.l.PhysicalOwner.EnumC5029c enumC5029c, iy.b0 b0Var) {
        this.physicalOwnerType = enumC5029c;
        this.name = b0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final iy.b0 getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final tv0.l.PhysicalOwner.EnumC5029c getPhysicalOwnerType() {
        return this.physicalOwnerType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnPhysicalOwnerNameChanged)) {
            return false;
        }
        OnPhysicalOwnerNameChanged onPhysicalOwnerNameChanged = (OnPhysicalOwnerNameChanged) other;
        return this.physicalOwnerType == onPhysicalOwnerNameChanged.physicalOwnerType && fr.t.c(this.name, onPhysicalOwnerNameChanged.name);
    }

    public int hashCode() {
        return (this.physicalOwnerType.hashCode() * 31) + this.name.hashCode();
    }

    public String toString() {
        return "OnPhysicalOwnerNameChanged(physicalOwnerType=" + this.physicalOwnerType + ", name=" + this.name + ')';
    }
}
