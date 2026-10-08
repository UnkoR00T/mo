package i;

import h.ConcurrentCameraGraphs;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Li/e3;", "", "<init>", "()V", "Lh/u;", "cameraGraphId", "Lh/j0;", "concurrentCameraGraphs", "Li/d3;", "a", "(Lh/u;Lh/j0;)Li/d3;", "Ljava/lang/Object;", "lock", "", "b", "Ljava/util/Map;", "sequencers", "", "c", "Ljava/util/Set;", "pending", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<ConcurrentCameraGraphs, d3> sequencers = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Set<h.u> pending = new LinkedHashSet();

    public final d3 a(h.u cameraGraphId, ConcurrentCameraGraphs concurrentCameraGraphs) {
        d3 d3Var;
        synchronized (this.lock) {
            try {
                if (!this.sequencers.containsKey(concurrentCameraGraphs)) {
                    d3 d3Var2 = new d3();
                    this.sequencers.put(concurrentCameraGraphs, d3Var2);
                    this.pending.addAll(pq.e1.k(concurrentCameraGraphs.a(), cameraGraphId));
                    return d3Var2;
                }
                this.pending.remove(cameraGraphId);
                Set<h.u> setA = concurrentCameraGraphs.a();
                if (!(setA instanceof Collection) || !setA.isEmpty()) {
                    Iterator<T> it = setA.iterator();
                    while (it.hasNext()) {
                        if (this.pending.contains((h.u) it.next())) {
                            d3 d3Var3 = this.sequencers.get(concurrentCameraGraphs);
                            if (d3Var3 == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            d3Var = d3Var3;
                            return d3Var;
                        }
                    }
                }
                d3 d3VarRemove = this.sequencers.remove(concurrentCameraGraphs);
                if (d3VarRemove == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                d3Var = d3VarRemove;
                return d3Var;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
