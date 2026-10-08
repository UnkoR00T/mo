package e81;

import fr.t;
import i61.DataSplit;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: e81.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Le81/b;", "", "Ld81/b;", "splitType", "Li61/j;", "dataSplit", "<init>", "(Ld81/b;Li61/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ld81/b;", "b", "()Ld81/b;", "Li61/j;", "()Li61/j;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SetupData {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f48352c = b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final d81.b splitType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DataSplit dataSplit;

    public SetupData(d81.b bVar, DataSplit dataSplit) {
        this.splitType = bVar;
        this.dataSplit = dataSplit;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DataSplit getDataSplit() {
        return this.dataSplit;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d81.b getSplitType() {
        return this.splitType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetupData)) {
            return false;
        }
        SetupData setupData = (SetupData) other;
        return this.splitType == setupData.splitType && t.c(this.dataSplit, setupData.dataSplit);
    }

    public int hashCode() {
        d81.b bVar = this.splitType;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        DataSplit dataSplit = this.dataSplit;
        return iHashCode + (dataSplit != null ? dataSplit.hashCode() : 0);
    }

    public String toString() {
        return "SetupData(splitType=" + this.splitType + ", dataSplit=" + this.dataSplit + ')';
    }
}
