package hj1;

import java.util.List;
import p071kotlin.Metadata;
import zp0.BEUnitDefenceTrainingsByType;

/* JADX INFO: renamed from: hj1.q, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lhj1/q;", "", "", "Lzp0/s;", "trainingPlaces", "", "showTypesList", "<init>", "(Ljava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Z", "()Z", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SetupData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEUnitDefenceTrainingsByType> trainingPlaces;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showTypesList;

    public SetupData(List<BEUnitDefenceTrainingsByType> list, boolean z15) {
        this.trainingPlaces = list;
        this.showTypesList = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getShowTypesList() {
        return this.showTypesList;
    }

    public final List<BEUnitDefenceTrainingsByType> b() {
        return this.trainingPlaces;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetupData)) {
            return false;
        }
        SetupData setupData = (SetupData) other;
        return fr.t.c(this.trainingPlaces, setupData.trainingPlaces) && this.showTypesList == setupData.showTypesList;
    }

    public int hashCode() {
        return (this.trainingPlaces.hashCode() * 31) + Boolean.hashCode(this.showTypesList);
    }

    public String toString() {
        return "SetupData(trainingPlaces=" + this.trainingPlaces + ", showTypesList=" + this.showTypesList + ')';
    }
}
