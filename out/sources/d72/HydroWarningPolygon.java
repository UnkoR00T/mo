package d72;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: d72.g, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Ld72/g;", "", "", "Ld72/d;", "holes", "outline", "<init>", "(Ljava/util/List;Ld72/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ld72/d;", "()Ld72/d;", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HydroWarningPolygon {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HydroWarningLine> holes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final HydroWarningLine outline;

    public HydroWarningPolygon(List<HydroWarningLine> list, HydroWarningLine hydroWarningLine) {
        this.holes = list;
        this.outline = hydroWarningLine;
    }

    public final List<HydroWarningLine> a() {
        return this.holes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final HydroWarningLine getOutline() {
        return this.outline;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HydroWarningPolygon)) {
            return false;
        }
        HydroWarningPolygon hydroWarningPolygon = (HydroWarningPolygon) other;
        return t.c(this.holes, hydroWarningPolygon.holes) && t.c(this.outline, hydroWarningPolygon.outline);
    }

    public int hashCode() {
        return (this.holes.hashCode() * 31) + this.outline.hashCode();
    }

    public String toString() {
        return "HydroWarningPolygon(holes=" + this.holes + ", outline=" + this.outline + ')';
    }
}
