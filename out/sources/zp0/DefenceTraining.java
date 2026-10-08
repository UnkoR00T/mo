package zp0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: zp0.v, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001b\u0010 ¨\u0006!"}, d2 = {"Lzp0/v;", "", "", "id", "", "Lzp0/w;", "days", "Lzp0/c;", "type", "Lzp0/b;", "occupancy", "<init>", "(ILjava/util/List;Lzp0/c;Lzp0/b;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Lzp0/c;", "d", "()Lzp0/c;", "Lzp0/b;", "()Lzp0/b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DefenceTraining {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DefenceTrainingDay> days;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEDefenceTrainingType type;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b occupancy;

    public DefenceTraining(int i15, List<DefenceTrainingDay> list, BEDefenceTrainingType bEDefenceTrainingType, b bVar) {
        this.id = i15;
        this.days = list;
        this.type = bEDefenceTrainingType;
        this.occupancy = bVar;
    }

    public final List<DefenceTrainingDay> a() {
        return this.days;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getOccupancy() {
        return this.occupancy;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BEDefenceTrainingType getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefenceTraining)) {
            return false;
        }
        DefenceTraining defenceTraining = (DefenceTraining) other;
        return this.id == defenceTraining.id && fr.t.c(this.days, defenceTraining.days) && fr.t.c(this.type, defenceTraining.type) && this.occupancy == defenceTraining.occupancy;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.id) * 31) + this.days.hashCode()) * 31) + this.type.hashCode()) * 31) + this.occupancy.hashCode();
    }

    public String toString() {
        return "DefenceTraining(id=" + this.id + ", days=" + this.days + ", type=" + this.type + ", occupancy=" + this.occupancy + ")";
    }
}
