package i;

import android.view.Surface;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: i.m3, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u001e\u0010\u001d¨\u0006\""}, d2 = {"Li/m3;", "", "", "Li/l3;", "all", "", "Lh/q1;", "deferred", "postviewOutput", "Lh/c1;", "Landroid/view/Surface;", "outputSurfaceMap", "<init>", "(Ljava/util/List;Ljava/util/Map;Li/l3;Ljava/util/Map;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "Li/l3;", "d", "()Li/l3;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class OutputConfigurations {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<l3> all;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<h.q1, l3> deferred;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final l3 postviewOutput;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<h.c1, Surface> outputSurfaceMap;

    /* JADX WARN: Multi-variable type inference failed */
    public OutputConfigurations(List<? extends l3> list, Map<h.q1, ? extends l3> map, l3 l3Var, Map<h.c1, ? extends Surface> map2) {
        this.all = list;
        this.deferred = map;
        this.postviewOutput = l3Var;
        this.outputSurfaceMap = map2;
    }

    public final List<l3> a() {
        return this.all;
    }

    public final Map<h.q1, l3> b() {
        return this.deferred;
    }

    public final Map<h.c1, Surface> c() {
        return this.outputSurfaceMap;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final l3 getPostviewOutput() {
        return this.postviewOutput;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OutputConfigurations)) {
            return false;
        }
        OutputConfigurations outputConfigurations = (OutputConfigurations) other;
        return fr.t.c(this.all, outputConfigurations.all) && fr.t.c(this.deferred, outputConfigurations.deferred) && fr.t.c(this.postviewOutput, outputConfigurations.postviewOutput) && fr.t.c(this.outputSurfaceMap, outputConfigurations.outputSurfaceMap);
    }

    public int hashCode() {
        int iHashCode = ((this.all.hashCode() * 31) + this.deferred.hashCode()) * 31;
        l3 l3Var = this.postviewOutput;
        return ((iHashCode + (l3Var == null ? 0 : l3Var.hashCode())) * 31) + this.outputSurfaceMap.hashCode();
    }

    public String toString() {
        return "OutputConfigurations(all=" + this.all + ", deferred=" + this.deferred + ", postviewOutput=" + this.postviewOutput + ", outputSurfaceMap=" + this.outputSurfaceMap + ')';
    }
}
