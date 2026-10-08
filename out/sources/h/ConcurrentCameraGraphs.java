package h;

import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: h.j0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lh/j0;", "", "", "Lh/u;", "cameraGraphIds", "Lh/v;", "cameraIds", "<init>", "(Ljava/util/Set;Ljava/util/Set;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "b", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ConcurrentCameraGraphs {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<u> cameraGraphIds;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<v> cameraIds;

    public ConcurrentCameraGraphs(Set<u> set, Set<v> set2) {
        this.cameraGraphIds = set;
        this.cameraIds = set2;
        if (set.size() <= 1) {
            throw new IllegalStateException("Check failed.");
        }
        if (set.size() != set2.size()) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final Set<u> a() {
        return this.cameraGraphIds;
    }

    public final Set<v> b() {
        return this.cameraIds;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConcurrentCameraGraphs)) {
            return false;
        }
        ConcurrentCameraGraphs concurrentCameraGraphs = (ConcurrentCameraGraphs) other;
        return fr.t.c(this.cameraGraphIds, concurrentCameraGraphs.cameraGraphIds) && fr.t.c(this.cameraIds, concurrentCameraGraphs.cameraIds);
    }

    public int hashCode() {
        return (this.cameraGraphIds.hashCode() * 31) + this.cameraIds.hashCode();
    }

    public String toString() {
        return "ConcurrentCameraGraphs(cameraGraphIds=" + this.cameraGraphIds + ", cameraIds=" + this.cameraIds + ')';
    }
}
