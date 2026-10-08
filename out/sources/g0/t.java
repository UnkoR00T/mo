package g0;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import o.e1;
import o.h2;
import o.v1;
import p105prN.o2;

/* JADX INFO: loaded from: classes.dex */
public class t implements r0, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f69119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final HandlerThread f69120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f69121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Handler f69122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f69123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float[] f69124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f69125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Map<v1, Surface> f69126h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f69127j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f69128k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<b> f69129l;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static o2<o.i0, r0> f69130a = new o2() { // from class: g0.s
            @Override // p105prN.o2
            public final Object apply(Object obj) {
                return new t((o.i0) obj);
            }
        };

        public static r0 a(o.i0 i0Var) {
            return f69130a.apply(i0Var);
        }
    }

    static abstract class b {
        b() {
        }

        static g0.a d(int i15, int i16, androidx.concurrent.futures.c.a<Void> aVar) {
            return new g0.a(i15, i16, aVar);
        }

        abstract androidx.concurrent.futures.c.a<Void> a();

        abstract int b();

        abstract int c();
    }

    t(o.i0 i0Var) {
        this(i0Var, Collections.EMPTY_MAP);
    }

    public static /* synthetic */ void f(t tVar, h2 h2Var, SurfaceTexture surfaceTexture, Surface surface, h2.g gVar) {
        tVar.getClass();
        h2Var.l();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        tVar.f69127j--;
        tVar.r();
    }

    public static /* synthetic */ void g(t tVar) {
        tVar.f69128k = true;
        tVar.r();
    }

    public static /* synthetic */ void h(t tVar, o.i0 i0Var, Map map, androidx.concurrent.futures.c.a aVar) throws Throwable {
        tVar.getClass();
        try {
            tVar.f69119a.h(i0Var, map);
            aVar.c(null);
        } catch (RuntimeException e15) {
            aVar.f(e15);
        }
    }

    public static /* synthetic */ Object i(final t tVar, int i15, int i16, final androidx.concurrent.futures.c.a aVar) {
        tVar.getClass();
        final g0.a aVarD = b.d(i15, i16, aVar);
        tVar.t(new Runnable() { // from class: g0.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f69046a.f69129l.add(aVarD);
            }
        }, new Runnable() { // from class: g0.i
            @Override // java.lang.Runnable
            public final void run() {
                aVar.f(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
            }
        });
        return "DefaultSurfaceProcessor#snapshot";
    }

    public static /* synthetic */ void j(t tVar, h2 h2Var, h2.h hVar) {
        tVar.getClass();
        i0.d.e eVar = i0.d.e.DEFAULT;
        if (h2Var.o().d() && hVar.e()) {
            eVar = i0.d.e.YUV;
        }
        tVar.f69119a.o(eVar);
    }

    public static /* synthetic */ void k(final t tVar, final v1 v1Var) {
        Surface surfaceV2 = v1Var.V2(tVar.f69121c, new i6.a() { // from class: g0.o
            @Override // i6.a
            public final void accept(Object obj) {
                t.l(this.f69083a, v1Var, (v1.b) obj);
            }
        });
        tVar.f69119a.j(surfaceV2);
        tVar.f69126h.put(v1Var, surfaceV2);
    }

    public static /* synthetic */ void l(t tVar, v1 v1Var, v1.b bVar) {
        tVar.getClass();
        v1Var.close();
        Surface surfaceRemove = tVar.f69126h.remove(v1Var);
        if (surfaceRemove != null) {
            tVar.f69119a.r(surfaceRemove);
        }
    }

    public static /* synthetic */ Object m(final t tVar, final o.i0 i0Var, final Map map, final androidx.concurrent.futures.c.a aVar) {
        tVar.getClass();
        tVar.s(new Runnable() { // from class: g0.r
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                t.h(this.f69112a, i0Var, map, aVar);
            }
        });
        return "Init GlRenderer";
    }

    public static /* synthetic */ void n() {
    }

    public static /* synthetic */ void p(final t tVar, final h2 h2Var) {
        tVar.f69127j++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(tVar.f69119a.g());
        surfaceTexture.setDefaultBufferSize(h2Var.p().getWidth(), h2Var.p().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        h2Var.u(tVar.f69121c, new h2.i() { // from class: g0.p
            @Override // o.h2.i
            public final void a(h2.h hVar) {
                t.j(this.f69086a, h2Var, hVar);
            }
        });
        h2Var.t(surface, tVar.f69121c, new i6.a() { // from class: g0.q
            @Override // i6.a
            public final void accept(Object obj) {
                t.f(this.f69090a, h2Var, surfaceTexture, surface, (h2.g) obj);
            }
        });
        surfaceTexture.setOnFrameAvailableListener(tVar, tVar.f69122d);
    }

    public static /* synthetic */ void q(t tVar, Runnable runnable, Runnable runnable2) {
        if (tVar.f69128k) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    private void r() {
        if (this.f69128k && this.f69127j == 0) {
            Iterator<v1> it = this.f69126h.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            Iterator<b> it4 = this.f69129l.iterator();
            while (it4.hasNext()) {
                it4.next().a().f(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            this.f69126h.clear();
            this.f69119a.k();
            this.f69120b.quit();
        }
    }

    private void s(Runnable runnable) {
        t(runnable, new Runnable() { // from class: g0.e
            @Override // java.lang.Runnable
            public final void run() {
                t.n();
            }
        });
    }

    private void t(final Runnable runnable, final Runnable runnable2) {
        try {
            this.f69121c.execute(new Runnable() { // from class: g0.f
                @Override // java.lang.Runnable
                public final void run() {
                    t.q(this.f69034a, runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e15) {
            e1.p("DefaultSurfaceProcessor", "Unable to executor runnable", e15);
            runnable2.run();
        }
    }

    private void u(Throwable th4) {
        Iterator<b> it = this.f69129l.iterator();
        while (it.hasNext()) {
            it.next().a().f(th4);
        }
        this.f69129l.clear();
    }

    private Bitmap v(Size size, float[] fArr, int i15) {
        float[] fArr2 = (float[]) fArr.clone();
        y.s.c(fArr2, i15, 0.5f, 0.5f);
        y.s.d(fArr2, 0.5f);
        return this.f69119a.p(y.x.p(size, i15), fArr2);
    }

    private void w(final o.i0 i0Var, final Map<i0.d.e, c0> map) {
        try {
            androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0250c() { // from class: g0.d
                @Override // androidx.concurrent.futures.c.InterfaceC0250c
                public final Object a(androidx.concurrent.futures.c.a aVar) {
                    return t.m(this.f69029a, i0Var, map, aVar);
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

    private void x(oq.x<Surface, Size, float[]> xVar) {
        if (this.f69129l.isEmpty()) {
            return;
        }
        if (xVar == null) {
            u(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator<b> it = this.f69129l.iterator();
                int iC = -1;
                int iB = -1;
                Bitmap bitmapV = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    b next = it.next();
                    if (iC != next.c() || bitmapV == null) {
                        iC = next.c();
                        if (bitmapV != null) {
                            bitmapV.recycle();
                        }
                        bitmapV = v(xVar.e(), xVar.f(), iC);
                        iB = -1;
                    }
                    if (iB != next.b()) {
                        byteArrayOutputStream.reset();
                        iB = next.b();
                        bitmapV.compress(Bitmap.CompressFormat.JPEG, iB, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                    }
                    Surface surfaceD = xVar.d();
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.q(surfaceD, byteArray);
                    next.a().c(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (IOException e15) {
            u(e15);
        }
    }

    @Override // o.w1
    public void a(final h2 h2Var) {
        if (this.f69123e.get()) {
            h2Var.w();
            return;
        }
        Runnable runnable = new Runnable() { // from class: g0.l
            @Override // java.lang.Runnable
            public final void run() {
                t.p(this.f69058a, h2Var);
            }
        };
        Objects.requireNonNull(h2Var);
        t(runnable, new m(h2Var));
    }

    @Override // g0.r0
    public void b() {
        if (this.f69123e.getAndSet(true)) {
            return;
        }
        s(new Runnable() { // from class: g0.n
            @Override // java.lang.Runnable
            public final void run() {
                t.g(this.f69063a);
            }
        });
    }

    @Override // o.w1
    public void c(final v1 v1Var) {
        if (this.f69123e.get()) {
            v1Var.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: g0.j
            @Override // java.lang.Runnable
            public final void run() {
                t.k(this.f69053a, v1Var);
            }
        };
        Objects.requireNonNull(v1Var);
        t(runnable, new k(v1Var));
    }

    @Override // g0.r0
    public com.google.common.util.concurrent.q<Void> d(final int i15, final int i16) {
        return a0.f.i(androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0250c() { // from class: g0.g
            @Override // androidx.concurrent.futures.c.InterfaceC0250c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return t.i(this.f69038a, i15, i16, aVar);
            }
        }));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.f69123e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(this.f69124f);
        oq.x<Surface, Size, float[]> xVar = null;
        for (Map.Entry<v1, Surface> entry : this.f69126h.entrySet()) {
            Surface value = entry.getValue();
            v1 key = entry.getKey();
            key.w2(this.f69125g, this.f69124f);
            if (key.getFormat() == 34) {
                try {
                    this.f69119a.n(surfaceTexture.getTimestamp(), this.f69125g, value);
                } catch (RuntimeException e15) {
                    e1.d("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e15);
                }
            } else {
                i6.i.j(key.getFormat() == 256, "Unsupported format: " + key.getFormat());
                i6.i.j(xVar == null, "Only one JPEG output is supported.");
                xVar = new oq.x<>(value, key.getSize(), (float[]) this.f69125g.clone());
            }
        }
        try {
            x(xVar);
        } catch (RuntimeException e16) {
            u(e16);
        }
    }

    t(o.i0 i0Var, Map<i0.d.e, c0> map) {
        this.f69123e = new AtomicBoolean(false);
        this.f69124f = new float[16];
        this.f69125g = new float[16];
        this.f69126h = new LinkedHashMap();
        this.f69127j = 0;
        this.f69128k = false;
        this.f69129l = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.f69120b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f69122d = handler;
        this.f69121c = z.a.e(handler);
        this.f69119a = new z();
        try {
            w(i0Var, map);
        } catch (RuntimeException e15) {
            b();
            throw e15;
        }
    }
}
