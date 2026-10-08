package h0;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import g0.c0;
import g0.r0;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import o.e1;
import o.h0;
import o.h2;
import o.i0;
import o.v1;

/* JADX INFO: loaded from: classes.dex */
public class o implements r0, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f79159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final HandlerThread f79160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f79161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Handler f79162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f79163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f79164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f79165g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Map<v1, Surface> f79166h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SurfaceTexture f79167j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private SurfaceTexture f79168k;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static er.q<i0, h0, h0, r0> f79169a = new er.q() { // from class: h0.n
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return new o((i0) obj, (h0) obj2, (h0) obj3);
            }
        };

        public static r0 a(i0 i0Var, h0 h0Var, h0 h0Var2) {
            return f79169a.w(i0Var, h0Var, h0Var2);
        }
    }

    o(i0 i0Var, h0 h0Var, h0 h0Var2) {
        this(i0Var, Collections.EMPTY_MAP, h0Var, h0Var2);
    }

    public static /* synthetic */ void e(o oVar, Runnable runnable, Runnable runnable2) {
        if (oVar.f79164f) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    public static /* synthetic */ void f() {
    }

    public static /* synthetic */ void g(o oVar, SurfaceTexture surfaceTexture, Surface surface, h2.g gVar) {
        oVar.getClass();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        oVar.f79163e--;
        oVar.n();
    }

    public static /* synthetic */ void h(o oVar) {
        oVar.f79164f = true;
        oVar.n();
    }

    public static /* synthetic */ void i(o oVar, v1 v1Var, v1.b bVar) {
        oVar.getClass();
        v1Var.close();
        Surface surfaceRemove = oVar.f79166h.remove(v1Var);
        if (surfaceRemove != null) {
            oVar.f79159a.r(surfaceRemove);
        }
    }

    public static /* synthetic */ void j(final o oVar, final v1 v1Var) {
        Surface surfaceV2 = v1Var.V2(oVar.f79161c, new i6.a() { // from class: h0.j
            @Override // i6.a
            public final void accept(Object obj) {
                o.i(this.f79151a, v1Var, (v1.b) obj);
            }
        });
        oVar.f79159a.j(surfaceV2);
        oVar.f79166h.put(v1Var, surfaceV2);
    }

    public static /* synthetic */ void k(final o oVar, h2 h2Var) {
        oVar.f79163e++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(oVar.f79159a.t(h2Var.s()));
        surfaceTexture.setDefaultBufferSize(h2Var.p().getWidth(), h2Var.p().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        h2Var.t(surface, oVar.f79161c, new i6.a() { // from class: h0.m
            @Override // i6.a
            public final void accept(Object obj) {
                o.g(this.f79156a, surfaceTexture, surface, (h2.g) obj);
            }
        });
        if (h2Var.s()) {
            oVar.f79167j = surfaceTexture;
        } else {
            oVar.f79168k = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(oVar, oVar.f79162d);
        }
    }

    public static /* synthetic */ void l(o oVar, i0 i0Var, Map map, androidx.concurrent.futures.c.a aVar) throws Throwable {
        oVar.getClass();
        try {
            oVar.f79159a.h(i0Var, map);
            aVar.c(null);
        } catch (RuntimeException e15) {
            aVar.f(e15);
        }
    }

    public static /* synthetic */ Object m(final o oVar, final i0 i0Var, final Map map, final androidx.concurrent.futures.c.a aVar) {
        oVar.getClass();
        oVar.o(new Runnable() { // from class: h0.i
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                o.l(this.f79147a, i0Var, map, aVar);
            }
        });
        return "Init GlRenderer";
    }

    private void n() {
        if (this.f79164f && this.f79163e == 0) {
            Iterator<v1> it = this.f79166h.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            this.f79166h.clear();
            this.f79159a.k();
            this.f79160b.quit();
        }
    }

    private void o(Runnable runnable) {
        p(runnable, new Runnable() { // from class: h0.l
            @Override // java.lang.Runnable
            public final void run() {
                o.f();
            }
        });
    }

    private void p(final Runnable runnable, final Runnable runnable2) {
        try {
            this.f79161c.execute(new Runnable() { // from class: h0.k
                @Override // java.lang.Runnable
                public final void run() {
                    o.e(this.f79153a, runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e15) {
            e1.p("DualSurfaceProcessor", "Unable to executor runnable", e15);
            runnable2.run();
        }
    }

    private void q(final i0 i0Var, final Map<i0.d.e, c0> map) {
        try {
            androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0250c() { // from class: h0.g
                @Override // androidx.concurrent.futures.c.InterfaceC0250c
                public final Object a(androidx.concurrent.futures.c.a aVar) {
                    return o.m(this.f79142a, i0Var, map, aVar);
                }
            }).get();
        } catch (InterruptedException | ExecutionException e15) {
            e = e15;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (!(e instanceof RuntimeException)) {
                throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
            }
            throw ((RuntimeException) e);
        }
    }

    @Override // o.w1
    public void a(final h2 h2Var) {
        if (this.f79165g.get()) {
            h2Var.w();
            return;
        }
        Runnable runnable = new Runnable() { // from class: h0.f
            @Override // java.lang.Runnable
            public final void run() {
                o.k(this.f79140a, h2Var);
            }
        };
        Objects.requireNonNull(h2Var);
        p(runnable, new g0.m(h2Var));
    }

    @Override // g0.r0
    public void b() {
        if (this.f79165g.getAndSet(true)) {
            return;
        }
        o(new Runnable() { // from class: h0.e
            @Override // java.lang.Runnable
            public final void run() {
                o.h(this.f79139a);
            }
        });
    }

    @Override // o.w1
    public void c(final v1 v1Var) {
        if (this.f79165g.get()) {
            v1Var.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: h0.h
            @Override // java.lang.Runnable
            public final void run() {
                o.j(this.f79145a, v1Var);
            }
        };
        Objects.requireNonNull(v1Var);
        p(runnable, new g0.k(v1Var));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.f79165g.get() || (surfaceTexture2 = this.f79167j) == null || this.f79168k == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.f79168k.updateTexImage();
        for (Map.Entry<v1, Surface> entry : this.f79166h.entrySet()) {
            Surface value = entry.getValue();
            v1 key = entry.getKey();
            if (key.getFormat() == 34) {
                try {
                    this.f79159a.v(surfaceTexture.getTimestamp(), value, key, this.f79167j, this.f79168k);
                } catch (RuntimeException e15) {
                    e1.d("DualSurfaceProcessor", "Failed to render with OpenGL.", e15);
                }
            }
        }
    }

    o(i0 i0Var, Map<i0.d.e, c0> map, h0 h0Var, h0 h0Var2) {
        this.f79163e = 0;
        this.f79164f = false;
        this.f79165g = new AtomicBoolean(false);
        this.f79166h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.f79160b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f79162d = handler;
        this.f79161c = z.a.e(handler);
        this.f79159a = new c(h0Var, h0Var2);
        try {
            q(i0Var, map);
        } catch (RuntimeException e15) {
            b();
            throw e15;
        }
    }
}
