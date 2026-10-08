package xk0;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: xk0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lxk0/b;", "", "", "level", "", "Lxk0/d;", "multiPolygons", "<init>", "(Ljava/lang/Integer;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "Ljava/util/List;", "()Ljava/util/List;", "disasteralertservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEHydroWarningArea {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer level;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEHydroWarningMultiPolygon> multiPolygons;

    public BEHydroWarningArea(Integer num, List<BEHydroWarningMultiPolygon> list) {
        this.level = num;
        this.multiPolygons = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getLevel() {
        return this.level;
    }

    public final List<BEHydroWarningMultiPolygon> b() {
        return this.multiPolygons;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEHydroWarningArea)) {
            return false;
        }
        BEHydroWarningArea bEHydroWarningArea = (BEHydroWarningArea) other;
        return t.c(this.level, bEHydroWarningArea.level) && t.c(this.multiPolygons, bEHydroWarningArea.multiPolygons);
    }

    public int hashCode() {
        Integer num = this.level;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<BEHydroWarningMultiPolygon> list = this.multiPolygons;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "BEHydroWarningArea(level=" + this.level + ", multiPolygons=" + this.multiPolygons + ')';
    }
}
