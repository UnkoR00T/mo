package zp0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: zp0.s, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lzp0/s;", "", "Lzp0/c;", "type", "", "Lzp0/a;", "units", "<init>", "(Lzp0/c;Ljava/util/List;)V", "a", "(Lzp0/c;Ljava/util/List;)Lzp0/s;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lzp0/c;", "c", "()Lzp0/c;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEUnitDefenceTrainingsByType {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEDefenceTrainingType type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<AvailableDefenceTrainings> units;

    public BEUnitDefenceTrainingsByType(BEDefenceTrainingType bEDefenceTrainingType, List<AvailableDefenceTrainings> list) {
        this.type = bEDefenceTrainingType;
        this.units = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BEUnitDefenceTrainingsByType b(BEUnitDefenceTrainingsByType bEUnitDefenceTrainingsByType, BEDefenceTrainingType bEDefenceTrainingType, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            bEDefenceTrainingType = bEUnitDefenceTrainingsByType.type;
        }
        if ((i15 & 2) != 0) {
            list = bEUnitDefenceTrainingsByType.units;
        }
        return bEUnitDefenceTrainingsByType.a(bEDefenceTrainingType, list);
    }

    public final BEUnitDefenceTrainingsByType a(BEDefenceTrainingType type, List<AvailableDefenceTrainings> units) {
        return new BEUnitDefenceTrainingsByType(type, units);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BEDefenceTrainingType getType() {
        return this.type;
    }

    public final List<AvailableDefenceTrainings> d() {
        return this.units;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEUnitDefenceTrainingsByType)) {
            return false;
        }
        BEUnitDefenceTrainingsByType bEUnitDefenceTrainingsByType = (BEUnitDefenceTrainingsByType) other;
        return fr.t.c(this.type, bEUnitDefenceTrainingsByType.type) && fr.t.c(this.units, bEUnitDefenceTrainingsByType.units);
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.units.hashCode();
    }

    public String toString() {
        return "BEUnitDefenceTrainingsByType(type=" + this.type + ", units=" + this.units + ")";
    }
}
