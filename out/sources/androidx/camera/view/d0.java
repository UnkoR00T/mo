package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import o.e1;
import o.h2;

/* JADX INFO: loaded from: classes.dex */
final class d0 extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    TextureView f9344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    SurfaceTexture f9345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    com.google.common.util.concurrent.q<h2.g> f9346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    h2 f9347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f9348i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    SurfaceTexture f9349j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    AtomicReference<androidx.concurrent.futures.c.a<Void>> f9350k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    n.a f9351l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Executor f9352m;

    class a implements TextureView.SurfaceTextureListener {

        /* JADX INFO: renamed from: androidx.camera.view.d0$a$a, reason: collision with other inner class name */
        class C0193a implements a0.c<h2.g> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SurfaceTexture f9354a;

            C0193a(SurfaceTexture surfaceTexture) {
                this.f9354a = surfaceTexture;
            }

            @Override // a0.c
            public void b(Throwable th4) {
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th4);
            }

            @Override // a0.c
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(h2.g gVar) {
                i6.i.j(gVar.a() != 3, "Unexpected result from SurfaceRequest. Surface was provided twice.");
                e1.a("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                this.f9354a.release();
                d0 d0Var = d0.this;
                if (d0Var.f9349j != null) {
                    d0Var.f9349j = null;
                }
            }
        }

        a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i15, int i16) {
            e1.a("TextureViewImpl", "SurfaceTexture available. Size: " + i15 + "x" + i16);
            d0 d0Var = d0.this;
            d0Var.f9345f = surfaceTexture;
            if (d0Var.f9346g == null) {
                d0Var.q();
                return;
            }
            i6.i.g(d0Var.f9347h);
            e1.a("TextureViewImpl", "Surface invalidated " + d0.this.f9347h);
            d0.this.f9347h.n().d();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            d0 d0Var = d0.this;
            d0Var.f9345f = null;
            com.google.common.util.concurrent.q<h2.g> qVar = d0Var.f9346g;
            if (qVar == null) {
                e1.a("TextureViewImpl", "SurfaceTexture about to be destroyed");
                return true;
            }
            a0.f.b(qVar, new C0193a(surfaceTexture), u5.a.i(d0.this.f9344e.getContext()));
            d0.this.f9349j = surfaceTexture;
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i15, int i16) {
            e1.a("TextureViewImpl", "SurfaceTexture size changed: " + i15 + "x" + i16);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            androidx.concurrent.futures.c.a<Void> andSet = d0.this.f9350k.getAndSet(null);
            if (andSet != null) {
                andSet.c(null);
            }
            d0.this.getClass();
            Executor executor = d0.this.f9352m;
        }
    }

    d0(FrameLayout frameLayout, f fVar) {
        super(frameLayout, fVar);
        this.f9348i = false;
        this.f9350k = new AtomicReference<>();
    }

    public static /* synthetic */ Object j(d0 d0Var, Surface surface, final androidx.concurrent.futures.c.a aVar) {
        d0Var.getClass();
        e1.a("TextureViewImpl", "Surface set on Preview.");
        h2 h2Var = d0Var.f9347h;
        Executor executorA = z.a.a();
        Objects.requireNonNull(aVar);
        h2Var.t(surface, executorA, new i6.a() { // from class: androidx.camera.view.c0
            @Override // i6.a
            public final void accept(Object obj) {
                aVar.c((h2.g) obj);
            }
        });
        return "provideSurface[request=" + d0Var.f9347h + " surface=" + surface + "]";
    }

    public static /* synthetic */ void k(d0 d0Var, Surface surface, com.google.common.util.concurrent.q qVar, h2 h2Var) {
        d0Var.getClass();
        e1.a("TextureViewImpl", "Safe to release surface.");
        d0Var.o();
        surface.release();
        if (d0Var.f9346g == qVar) {
            d0Var.f9346g = null;
        }
        if (d0Var.f9347h == h2Var) {
            d0Var.f9347h = null;
        }
    }

    public static /* synthetic */ void l(d0 d0Var, h2 h2Var) {
        h2 h2Var2 = d0Var.f9347h;
        if (h2Var2 != null && h2Var2 == h2Var) {
            d0Var.f9347h = null;
            d0Var.f9346g = null;
        }
        d0Var.o();
    }

    public static /* synthetic */ Object m(d0 d0Var, androidx.concurrent.futures.c.a aVar) {
        d0Var.f9350k.set(aVar);
        return "textureViewImpl_waitForNextFrame";
    }

    private void o() {
        n.a aVar = this.f9351l;
        if (aVar != null) {
            aVar.a();
            this.f9351l = null;
        }
    }

    private void p() {
        if (!this.f9348i || this.f9349j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.f9344e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.f9349j;
        if (surfaceTexture != surfaceTexture2) {
            this.f9344e.setSurfaceTexture(surfaceTexture2);
            this.f9349j = null;
            this.f9348i = false;
        }
    }

    @Override // androidx.camera.view.n
    View b() {
        return this.f9344e;
    }

    @Override // androidx.camera.view.n
    Bitmap c() {
        TextureView textureView = this.f9344e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f9344e.getBitmap();
    }

    @Override // androidx.camera.view.n
    void d() {
        p();
    }

    @Override // androidx.camera.view.n
    void e() {
        this.f9348i = true;
    }

    @Override // androidx.camera.view.n
    void g(final h2 h2Var, n.a aVar) {
        this.f9421a = h2Var.p();
        n();
        h2 h2Var2 = this.f9347h;
        if (h2Var2 != null && h2Var2.w()) {
            o();
        }
        this.f9347h = h2Var;
        this.f9351l = aVar;
        h2Var.k(u5.a.i(this.f9344e.getContext()), new Runnable() { // from class: androidx.camera.view.y
            @Override // java.lang.Runnable
            public final void run() {
                d0.l(this.f9457a, h2Var);
            }
        });
        q();
    }

    @Override // androidx.camera.view.n
    com.google.common.util.concurrent.q<Void> i() {
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0250c() { // from class: androidx.camera.view.z
            @Override // androidx.concurrent.futures.c.InterfaceC0250c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return d0.m(this.f9459a, aVar);
            }
        });
    }

    public void n() {
        i6.i.g(this.f9422b);
        i6.i.g(this.f9421a);
        TextureView textureView = new TextureView(this.f9422b.getContext());
        this.f9344e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f9421a.getWidth(), this.f9421a.getHeight()));
        this.f9344e.setSurfaceTextureListener(new a());
        this.f9422b.removeAllViews();
        this.f9422b.addView(this.f9344e);
    }

    void q() {
        SurfaceTexture surfaceTexture;
        Size size = this.f9421a;
        if (size == null || (surfaceTexture = this.f9345f) == null || this.f9347h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f9421a.getHeight());
        final Surface surface = new Surface(this.f9345f);
        final h2 h2Var = this.f9347h;
        final com.google.common.util.concurrent.q<h2.g> qVarA = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0250c() { // from class: androidx.camera.view.a0
            @Override // androidx.concurrent.futures.c.InterfaceC0250c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return d0.j(this.f9332a, surface, aVar);
            }
        });
        this.f9346g = qVarA;
        qVarA.b(new Runnable() { // from class: androidx.camera.view.b0
            @Override // java.lang.Runnable
            public final void run() {
                d0.k(this.f9335a, surface, qVarA, h2Var);
            }
        }, u5.a.i(this.f9344e.getContext()));
        f();
    }
}
