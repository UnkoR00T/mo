package h;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u0007\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010&R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010+R\u0016\u0010!\u001a\u00020-8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010.¨\u0006/"}, d2 = {"Lh/a0;", "Lh/z;", "Lj/p;", "component", "<init>", "(Lj/p;)V", "Lh/s$b;", "config", "Lh/u;", "cameraGraphId", "Lh/s;", "g", "(Lh/s$b;Lh/u;)Lh/s;", "graphConfig", "Lh/e;", "h", "(Lh/s$b;)Lh/e;", "d", "(Lh/s$b;)Lh/s;", "Lh/s$a;", "", "e", "(Lh/s$a;)Ljava/util/List;", "Lh/p;", "a", "()Lh/p;", "Lh/e0;", "b", "()Lh/e0;", "Lh/k0;", "c", "(Lh/s$b;Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "shutdown", "()V", "", "toString", "()Ljava/lang/String;", "Lj/p;", "", "I", "debugId", "", "Ljava/lang/Object;", "lock", "", "Z", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a0 implements z {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j.p component;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int debugId = b0.b().d();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean shutdown;

    public a0(j.p pVar) {
        this.component = pVar;
    }

    private final s g(s.b config, u cameraGraphId) {
        k.h hVar = k.h.f107050a;
        try {
            Trace.beginSection("CXCP#CameraGraph-" + ((Object) v.f(config.getCamera())));
            return this.component.c().a(new j.m(config, cameraGraphId)).build().a();
        } finally {
            Trace.endSection();
        }
    }

    private final e h(s.b graphConfig) {
        e eVarA;
        synchronized (this.lock) {
            try {
                if (this.shutdown) {
                    throw new IllegalStateException("Check failed.");
                }
                f customCameraBackend = graphConfig.getCustomCameraBackend();
                if (customCameraBackend != null) {
                    eVarA = customCameraBackend.a(this.component.d());
                } else {
                    String cameraBackendId = graphConfig.getCameraBackendId();
                    if (cameraBackendId != null) {
                        e eVarA2 = this.component.e().a(cameraBackendId);
                        if (eVarA2 == null) {
                            throw new IllegalStateException(("Failed to initialize " + ((Object) g.f(cameraBackendId)) + " from " + graphConfig).toString());
                        }
                        eVarA = eVarA2;
                    } else {
                        eVarA = this.component.e().getDefault();
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return eVarA;
    }

    @Override // h.z
    public p a() {
        p pVarA;
        synchronized (this.lock) {
            if (this.shutdown) {
                throw new IllegalStateException("Check failed.");
            }
            pVarA = this.component.a();
        }
        return pVarA;
    }

    @Override // h.z
    public e0 b() {
        e0 e0VarB;
        synchronized (this.lock) {
            if (this.shutdown) {
                throw new IllegalStateException("Check failed.");
            }
            e0VarB = this.component.b();
        }
        return e0VarB;
    }

    @Override // h.z
    public Object c(s.b bVar, tq.e<? super k0> eVar) {
        e eVarH = h(bVar);
        if (eVarH != null) {
            return eVarH.c(bVar, eVar);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // h.z
    public s d(s.b config) {
        s sVarG;
        synchronized (this.lock) {
            if (this.shutdown) {
                throw new IllegalStateException("Check failed.");
            }
            sVarG = g(config, u.INSTANCE.a());
        }
        return sVarG;
    }

    @Override // h.z
    public List<s> e(s.a config) {
        ArrayList arrayList;
        synchronized (this.lock) {
            try {
                if (this.shutdown) {
                    throw new IllegalStateException("Check failed.");
                }
                Map mapC = pq.v0.c();
                Iterator<s.b> it = config.a().iterator();
                while (it.hasNext()) {
                    mapC.put(it.next(), u.INSTANCE.a());
                }
                Map mapB = pq.v0.b(mapC);
                List<s.b> listA = config.a();
                ArrayList arrayList2 = new ArrayList(pq.v.y(listA, 10));
                Iterator<T> it4 = listA.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(v.a(((s.b) it4.next()).getCamera()));
                }
                ConcurrentCameraGraphs concurrentCameraGraphs = new ConcurrentCameraGraphs(pq.v.k1(mapB.values()), pq.v.k1(arrayList2));
                List<s.b> listA2 = config.a();
                arrayList = new ArrayList(pq.v.y(listA2, 10));
                for (s.b bVar : listA2) {
                    bVar.s(concurrentCameraGraphs);
                    Object obj = mapB.get(bVar);
                    if (obj == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    arrayList.add(g(bVar, (u) obj));
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return arrayList;
    }

    @Override // h.z
    public void shutdown() {
        synchronized (this.lock) {
            if (this.shutdown) {
                throw new IllegalStateException("Check failed.");
            }
            this.component.f().f();
            this.shutdown = true;
            oq.i0 i0Var = oq.i0.f148189a;
        }
    }

    public String toString() {
        return "CameraPipe-" + this.debugId;
    }
}
