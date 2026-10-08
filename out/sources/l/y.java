package l;

import CON.j0;
import android.view.Surface;
import fr.w0;
import h.c0;
import h.e0;
import h.q1;
import h.s1;
import io.sentry.android.core.c2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import oq.i0;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B9\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001d\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010 R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010$R$\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\b\u0012\u00060\u0002j\u0002`\u00030)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010$R\u0016\u00100\u001a\u00020.8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010/R\u0016\u00102\u001a\u00020.8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u0010/¨\u00063"}, d2 = {"Ll/y;", "Lh/s1;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Ll/x;", "streamGraphImpl", "Lnq/a;", "Lh/n;", "cameraController", "Lh/e0;", "surfaceManager", "", "Lh/q1;", "Ln/m;", "imageSources", "<init>", "(Ll/x;Lnq/a;Lh/e0;Ljava/util/Map;)V", "Landroid/view/Surface;", "m", "()Ljava/util/Map;", "streamId", "surface", "Loq/i0;", "r", "(ILandroid/view/Surface;)V", "b", "()V", "h", "close", "p", "a", "Ll/x;", "Lnq/a;", "c", "Lh/e0;", "d", "Ljava/util/Map;", "", "e", "Ljava/lang/Object;", "lock", "", "f", "surfaceMap", "g", "surfaceUsageMap", "", "Z", "shouldRegisterSurfaces", "j", "closed", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y implements s1, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final StreamGraph streamGraphImpl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final nq.a<h.n> cameraController;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e0 surfaceManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<q1, n.m> imageSources;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Map<q1, Surface> surfaceMap;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Map<Surface, AutoCloseable> surfaceUsageMap;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean shouldRegisterSurfaces;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* JADX WARN: Multi-variable type inference failed */
    public y(StreamGraph streamGraph, nq.a<h.n> aVar, e0 e0Var, Map<q1, ? extends n.m> map) {
        this.streamGraphImpl = streamGraph;
        this.cameraController = aVar;
        this.surfaceManager = e0Var;
        this.imageSources = map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((n.m) entry.getValue()).getSurface());
        }
        this.surfaceMap = linkedHashMap;
        this.surfaceUsageMap = new LinkedHashMap();
        this.shouldRegisterSurfaces = true;
    }

    private final Map<q1, Surface> m() {
        synchronized (this.lock) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (StreamGraph.c cVar : this.streamGraphImpl.V()) {
                for (c0 c0Var : cVar.k()) {
                    Surface surface = this.surfaceMap.get(q1.a(c0Var.getId()));
                    if (surface != null) {
                        linkedHashMap.put(q1.a(c0Var.getId()), surface);
                    } else if (!cVar.b()) {
                        return v0.i();
                    }
                }
            }
            return linkedHashMap;
        }
    }

    @Override // h.s1
    public void b() throws Exception {
        List listF1;
        synchronized (this.lock) {
            this.shouldRegisterSurfaces = false;
            listF1 = pq.v.f1(this.surfaceUsageMap.values());
            this.surfaceUsageMap.clear();
        }
        Iterator it = listF1.iterator();
        while (it.hasNext()) {
            j0.a((AutoCloseable) it.next());
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        synchronized (this.lock) {
            if (this.closed) {
                return;
            }
            this.closed = true;
            this.surfaceMap.clear();
            List listF1 = pq.v.f1(this.surfaceUsageMap.values());
            this.surfaceUsageMap.clear();
            Iterator it = listF1.iterator();
            while (it.hasNext()) {
                j0.a((AutoCloseable) it.next());
            }
        }
    }

    @Override // h.s1
    public void h() {
        synchronized (this.lock) {
            try {
                if (this.closed) {
                    throw new IllegalStateException("Check failed.");
                }
                for (Surface surface : this.surfaceMap.values()) {
                    this.surfaceUsageMap.put(surface, this.surfaceManager.d(surface));
                }
                this.shouldRegisterSurfaces = true;
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void p() {
        Map<q1, Surface> mapM = m();
        if (mapM.isEmpty()) {
            return;
        }
        this.cameraController.get().a0(mapM);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00de  */
    public final void r(int streamId, Surface surface) throws Exception {
        AutoCloseable autoCloseableRemove;
        if (this.imageSources.keySet().contains(q1.a(streamId))) {
            throw new IllegalStateException(("Cannot configure surface for " + ((Object) q1.f(streamId)) + ", it is permanently assigned to " + this.imageSources.get(q1.a(streamId))).toString());
        }
        synchronized (this.lock) {
            if (this.closed) {
                if (surface != null && k.k.f107055a.d()) {
                    c2.g("CXCP", "Refusing to configure " + ((Object) q1.f(streamId)) + " with " + surface + " after close!");
                }
                return;
            }
            if (k.k.f107055a.c()) {
                if (surface != null) {
                    q1.f(streamId);
                    surface.toString();
                } else {
                    q1.f(streamId);
                }
            }
            if (surface == null) {
                Surface surfaceRemove = this.surfaceMap.remove(q1.a(streamId));
                if (!this.shouldRegisterSurfaces || surfaceRemove == null) {
                    autoCloseableRemove = null;
                } else {
                    autoCloseableRemove = this.surfaceUsageMap.remove(surfaceRemove);
                }
            } else {
                Surface surface2 = this.surfaceMap.get(q1.a(streamId));
                this.surfaceMap.put(q1.a(streamId), surface);
                if (!this.shouldRegisterSurfaces || fr.t.c(surface2, surface)) {
                    autoCloseableRemove = null;
                } else {
                    if (this.surfaceUsageMap.containsKey(surface)) {
                        throw new IllegalStateException(("Surface (" + surface + ") is already in use!").toString());
                    }
                    autoCloseableRemove = (AutoCloseable) w0.d(this.surfaceUsageMap).remove(surface2);
                    this.surfaceUsageMap.put(surface, this.surfaceManager.d(surface));
                }
            }
            p();
            if (autoCloseableRemove != null) {
                j0.a(autoCloseableRemove);
            }
        }
    }
}
