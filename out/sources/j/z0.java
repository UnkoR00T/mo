package j;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import ju.CoroutineName;
import ju.d2;
import ju.v1;
import ju.z2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011¨\u0006\u0019"}, d2 = {"Lj/z0;", "", "Lh/z$g;", "threadConfig", "<init>", "(Lh/z$g;)V", "Lm/g;", "cameraPipeLifetime", "Lju/d2;", "cameraPipeJob", "Lk/z;", "g", "(Lm/g;Lju/d2;)Lk/z;", "a", "Lh/z$g;", "", "b", "I", "lightweightThreadCount", "c", "backgroundThreadCount", "d", "cameraThreadPriority", "e", "defaultThreadPriority", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h.z.ThreadConfig threadConfig;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int lightweightThreadCount = Math.max(4, Runtime.getRuntime().availableProcessors() - 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int backgroundThreadCount = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int cameraThreadPriority = -3;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int defaultThreadPriority = -1;

    public z0(h.z.ThreadConfig threadConfig) {
        this.threadConfig = threadConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(List list) throws InterruptedException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ExecutorService) it.next()).shutdownNow();
        }
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            ((ExecutorService) it4.next()).awaitTermination(1L, TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler i(z0 z0Var, m.g gVar) {
        if (z0Var.threadConfig.getDefaultCameraHandler() != null) {
            return z0Var.threadConfig.getDefaultCameraHandler();
        }
        final HandlerThread handlerThread = new HandlerThread("CXCP-Camera-H", z0Var.cameraThreadPriority);
        handlerThread.start();
        gVar.d(m.g.b.THREAD, new Runnable() { // from class: j.x0
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                z0.j(handlerThread);
            }
        });
        return new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(HandlerThread handlerThread) throws InterruptedException {
        handlerThread.quit();
        handlerThread.join(1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor k(z0 z0Var, m.g gVar) {
        if (z0Var.threadConfig.getDefaultCameraExecutor() != null) {
            return z0Var.threadConfig.getDefaultCameraExecutor();
        }
        k.d dVar = k.d.f107032a;
        final ExecutorService executorServiceE = dVar.e(dVar.h(dVar.k(dVar.g(), "CXCP-Camera-E"), z0Var.cameraThreadPriority), 1);
        gVar.d(m.g.b.THREAD, new Runnable() { // from class: j.y0
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                z0.l(executorServiceE);
            }
        });
        return executorServiceE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(ExecutorService executorService) throws InterruptedException {
        executorService.shutdownNow();
        executorService.awaitTermination(1L, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(fr.p0 p0Var, fr.p0 p0Var2) {
        ju.q0.d((ju.p0) p0Var.f66410a, null, 1, null);
        ju.q0.d((ju.p0) p0Var2.f66410a, null, 1, null);
    }

    /* JADX WARN: Type inference failed for: r14v4, types: [T, ju.p0] */
    /* JADX WARN: Type inference failed for: r14v6, types: [T, ju.p0] */
    /* JADX WARN: Type inference failed for: r15v3, types: [T, ju.p0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, ju.p0] */
    public final k.z g(final m.g cameraPipeLifetime, d2 cameraPipeJob) {
        final ArrayList arrayList = new ArrayList();
        Executor defaultBlockingExecutor = this.threadConfig.getDefaultBlockingExecutor();
        if (defaultBlockingExecutor == null) {
            k.d dVar = k.d.f107032a;
            defaultBlockingExecutor = dVar.f(dVar.h(dVar.k(dVar.g(), "CXCP-IO-"), this.defaultThreadPriority), 8);
            arrayList.add(defaultBlockingExecutor);
        }
        Executor executor = defaultBlockingExecutor;
        ju.l0 l0VarB = v1.b(executor);
        Executor defaultBackgroundExecutor = this.threadConfig.getDefaultBackgroundExecutor();
        if (defaultBackgroundExecutor == null) {
            k.d dVar2 = k.d.f107032a;
            defaultBackgroundExecutor = dVar2.f(dVar2.h(dVar2.k(dVar2.g(), "CXCP-BG-"), this.defaultThreadPriority), this.backgroundThreadCount);
            arrayList.add(defaultBackgroundExecutor);
        }
        Executor executor2 = defaultBackgroundExecutor;
        ju.l0 l0VarB2 = v1.b(executor2);
        Executor defaultLightweightExecutor = this.threadConfig.getDefaultLightweightExecutor();
        if (defaultLightweightExecutor == null) {
            k.d dVar3 = k.d.f107032a;
            defaultLightweightExecutor = dVar3.f(dVar3.h(dVar3.k(dVar3.g(), "CXCP-"), this.cameraThreadPriority), this.lightweightThreadCount);
            arrayList.add(defaultLightweightExecutor);
        }
        Executor executor3 = defaultLightweightExecutor;
        ju.l0 l0VarB3 = v1.b(executor3);
        cameraPipeLifetime.d(m.g.b.THREAD, new Runnable() { // from class: j.t0
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                z0.h(arrayList);
            }
        });
        er.a<Handler> aVarE = this.threadConfig.e();
        if (aVarE == null) {
            aVarE = new er.a() { // from class: j.u0
                @Override // er.a
                public final Object a() {
                    return z0.i(this.f98408a, cameraPipeLifetime);
                }
            };
        }
        er.a<Handler> aVar = aVarE;
        er.a aVar2 = new er.a() { // from class: j.v0
            @Override // er.a
            public final Object a() {
                return z0.k(this.f98414a, cameraPipeLifetime);
            }
        };
        final fr.p0 p0Var = new fr.p0();
        final fr.p0 p0Var2 = new fr.p0();
        if (this.threadConfig.getTestOnlyScope() != null) {
            p0Var.f66410a = this.threadConfig.getTestOnlyScope();
            p0Var2.f66410a = this.threadConfig.getTestOnlyScope();
        } else {
            p0Var.f66410a = ju.q0.a(z2.a(cameraPipeJob).n0(l0VarB3).n0(new CoroutineName("CXCP")));
            p0Var2.f66410a = ju.q0.a(z2.a(cameraPipeJob).n0(new CoroutineName("CXCP-Dispatch")));
            cameraPipeLifetime.d(m.g.b.SCOPE, new Runnable() { // from class: j.w0
                @Override // java.lang.Runnable
                public final void run() {
                    z0.m(p0Var, p0Var2);
                }
            });
        }
        return new k.z((ju.p0) p0Var.f66410a, (ju.p0) p0Var2.f66410a, executor, l0VarB, executor2, l0VarB2, executor3, l0VarB3, aVar, aVar2);
    }
}
