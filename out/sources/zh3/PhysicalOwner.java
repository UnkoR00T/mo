package zh3;

import p071kotlin.Metadata;
import px.f;
import tv0.l;

/* JADX INFO: renamed from: zh3.d, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lzh3/d;", "", "Ltv0/l$c$c;", "ownerType", "Lzh3/e$b;", "field", "<init>", "(Ltv0/l$c$c;Lzh3/e$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltv0/l$c$c;", "getOwnerType", "()Ltv0/l$c$c;", "b", "Lzh3/e$b;", "getField", "()Lzh3/e$b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PhysicalOwner {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final l.PhysicalOwner.EnumC5029c ownerType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final PersonFieldsData.b field;

    public PhysicalOwner(l.PhysicalOwner.EnumC5029c enumC5029c, PersonFieldsData.b bVar) {
        this.ownerType = enumC5029c;
        this.field = bVar;
        if (bVar == null) {
            f.e(f.f163100a, "Created FieldIndex.PhysicalOwner with null field, this shouldn't happen.", null, px.c.a(this), 2, null);
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhysicalOwner)) {
            return false;
        }
        PhysicalOwner physicalOwner = (PhysicalOwner) other;
        return this.ownerType == physicalOwner.ownerType && this.field == physicalOwner.field;
    }

    public int hashCode() {
        int iHashCode = this.ownerType.hashCode() * 31;
        PersonFieldsData.b bVar = this.field;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public String toString() {
        return "PhysicalOwner(ownerType=" + this.ownerType + ", field=" + this.field + ')';
    }
}
