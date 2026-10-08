package wm;

import androidx.p016lifecycle.d0;
import androidx.p016lifecycle.j;
import androidx.p016lifecycle.p;
import dh.jb;
import java.io.Closeable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import jg.k;
import jg.s;
import vh.l;
import vh.o;

/* JADX INFO: loaded from: classes4.dex */
public class e<DetectionResultT> implements Closeable, p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final k f214077f = new k("MobileVisionBase", "");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f214078g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f214079a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pm.f f214080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vh.b f214081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f214082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f214083e;

    public e(pm.f<DetectionResultT, vm.a> fVar, Executor executor) {
        this.f214080b = fVar;
        vh.b bVar = new vh.b();
        this.f214081c = bVar;
        this.f214082d = executor;
        fVar.c();
        this.f214083e = fVar.a(executor, new Callable() { // from class: wm.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i15 = e.f214078g;
                return null;
            }
        }, bVar.b()).e(new vh.g() { // from class: wm.h
            @Override // vh.g
            public final void c(Exception exc) {
                e.f214077f.d("MobileVisionBase", "Error preloading model resource", exc);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, rm.a
    @d0(j.a.ON_DESTROY)
    public synchronized void close() {
        if (this.f214079a.getAndSet(true)) {
            return;
        }
        this.f214081c.a();
        this.f214080b.e(this.f214082d);
    }

    public synchronized l<DetectionResultT> h(final vm.a aVar) {
        s.m(aVar, "InputImage can not be null");
        if (this.f214079a.get()) {
            return o.e(new lm.a("This detector is already closed!", 14));
        }
        if (aVar.m() < 32 || aVar.i() < 32) {
            return o.e(new lm.a("InputImage width and height should be at least 32!", 3));
        }
        return this.f214080b.a(this.f214082d, new Callable() { // from class: wm.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f214084a.p(aVar);
            }
        }, this.f214081c.b());
    }

    final /* synthetic */ Object p(vm.a aVar) {
        jb jbVarR = jb.r("detectorTaskWithResource#run");
        jbVarR.h();
        try {
            Object objI = this.f214080b.i(aVar);
            jbVarR.close();
            return objI;
        } catch (Throwable th4) {
            try {
                jbVarR.close();
            } catch (Throwable th5) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th4, th5);
                } catch (Exception unused) {
                }
            }
            throw th4;
        }
    }
}
