package ab3;

import fr.k;
import m3.e;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ab3.b, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u001a"}, d2 = {"Lab3/b;", "", "Lm3/e;", "centroid", "", "zoomChange", "panChange", "<init>", "(JFJLfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "F", "c", "()F", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Transformation {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long centroid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float zoomChange;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long panChange;

    public /* synthetic */ Transformation(long j15, float f15, long j16, k kVar) {
        this(j15, f15, j16);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCentroid() {
        return this.centroid;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getPanChange() {
        return this.panChange;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getZoomChange() {
        return this.zoomChange;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Transformation)) {
            return false;
        }
        Transformation transformation = (Transformation) other;
        return e.j(this.centroid, transformation.centroid) && Float.compare(this.zoomChange, transformation.zoomChange) == 0 && e.j(this.panChange, transformation.panChange);
    }

    public int hashCode() {
        return (((e.o(this.centroid) * 31) + Float.hashCode(this.zoomChange)) * 31) + e.o(this.panChange);
    }

    public String toString() {
        return "Transformation(centroid=" + ((Object) e.s(this.centroid)) + ", zoomChange=" + this.zoomChange + ", panChange=" + ((Object) e.s(this.panChange)) + ')';
    }

    private Transformation(long j15, float f15, long j16) {
        this.centroid = j15;
        this.zoomChange = f15;
        this.panChange = j16;
    }
}
