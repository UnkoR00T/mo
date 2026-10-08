package androidx.camera.view;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Objects;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import o.e1;
import o.h2;

/* JADX INFO: loaded from: classes.dex */
final class w extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    SurfaceView f9446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final b f9447f;

    private static class a {
        static void a(SurfaceView surfaceView, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }

    class b implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Size f9448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private h2 f9449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private h2 f9450c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private n.a f9451d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Size f9452e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f9453f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f9454g = false;

        b() {
        }

        public static /* synthetic */ void a(n.a aVar, h2.g gVar) {
            e1.a("SurfaceViewImpl", "Safe to release surface.");
            if (aVar != null) {
                aVar.a();
            }
        }

        private boolean b() {
            return (this.f9453f || this.f9449b == null || !Objects.equals(this.f9448a, this.f9452e)) ? false : true;
        }

        private void c() {
            n.a aVar;
            if (this.f9449b != null) {
                e1.a("SurfaceViewImpl", "Request canceled: " + this.f9449b);
                if (!this.f9449b.w() || (aVar = this.f9451d) == null) {
                    return;
                }
                aVar.a();
            }
        }

        private void d() {
            if (this.f9449b != null) {
                e1.a("SurfaceViewImpl", "Surface closed " + this.f9449b);
                this.f9449b.n().d();
            }
        }

        private boolean f() {
            Surface surface = w.this.f9446e.getHolder().getSurface();
            if (!b()) {
                return false;
            }
            e1.a("SurfaceViewImpl", "Surface set on Preview.");
            final n.a aVar = this.f9451d;
            h2 h2Var = this.f9449b;
            Objects.requireNonNull(h2Var);
            h2Var.t(surface, u5.a.i(w.this.f9446e.getContext()), new i6.a() { // from class: androidx.camera.view.x
                @Override // i6.a
                public final void accept(Object obj) {
                    w.b.a(aVar, (h2.g) obj);
                }
            });
            this.f9453f = true;
            w.this.f();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void e(h2 h2Var, n.a aVar) {
            c();
            if (this.f9454g) {
                this.f9454g = false;
                h2Var.r();
                return;
            }
            this.f9449b = h2Var;
            this.f9451d = aVar;
            Size sizeP = h2Var.p();
            this.f9448a = sizeP;
            this.f9453f = false;
            if (f()) {
                return;
            }
            e1.a("SurfaceViewImpl", "Wait for new Surface creation.");
            w.this.f9446e.getHolder().setFixedSize(sizeP.getWidth(), sizeP.getHeight());
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i15, int i16, int i17) {
            e1.a("SurfaceViewImpl", "Surface changed. Size: " + i16 + "x" + i17);
            this.f9452e = new Size(i16, i17);
            f();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            h2 h2Var;
            e1.a("SurfaceViewImpl", "Surface created.");
            if (!this.f9454g || (h2Var = this.f9450c) == null) {
                return;
            }
            h2Var.r();
            this.f9450c = null;
            this.f9454g = false;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            e1.a("SurfaceViewImpl", "Surface destroyed.");
            if (this.f9453f) {
                d();
            } else {
                c();
            }
            this.f9454g = true;
            h2 h2Var = this.f9449b;
            if (h2Var != null) {
                this.f9450c = h2Var;
            }
            this.f9453f = false;
            this.f9449b = null;
            this.f9451d = null;
            this.f9452e = null;
            this.f9448a = null;
        }
    }

    w(FrameLayout frameLayout, f fVar) {
        super(frameLayout, fVar);
        this.f9447f = new b();
    }

    public static /* synthetic */ void k(Semaphore semaphore, int i15) {
        if (i15 == 0) {
            e1.a("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
        } else {
            e1.c("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i15);
        }
        semaphore.release();
    }

    private static boolean m(SurfaceView surfaceView, Size size, h2 h2Var) {
        return surfaceView != null && Objects.equals(size, h2Var.p());
    }

    @Override // androidx.camera.view.n
    View b() {
        return this.f9446e;
    }

    @Override // androidx.camera.view.n
    Bitmap c() {
        SurfaceView surfaceView = this.f9446e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.f9446e.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f9446e.getWidth(), this.f9446e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        a.a(this.f9446e, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: androidx.camera.view.v
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i15) {
                w.k(semaphore, i15);
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                e1.c("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
            }
            return bitmapCreateBitmap;
        } catch (InterruptedException e15) {
            e1.d("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e15);
            return bitmapCreateBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // androidx.camera.view.n
    void d() {
    }

    @Override // androidx.camera.view.n
    void e() {
    }

    @Override // androidx.camera.view.n
    void g(final h2 h2Var, final n.a aVar) {
        if (!m(this.f9446e, this.f9421a, h2Var)) {
            this.f9421a = h2Var.p();
            l();
        }
        if (aVar != null) {
            h2Var.k(u5.a.i(this.f9446e.getContext()), new Runnable() { // from class: androidx.camera.view.t
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.a();
                }
            });
        }
        this.f9446e.post(new Runnable() { // from class: androidx.camera.view.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f9442a.f9447f.e(h2Var, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.view.n
    public com.google.common.util.concurrent.q<Void> i() {
        return a0.f.h(null);
    }

    void l() {
        i6.i.g(this.f9422b);
        i6.i.g(this.f9421a);
        SurfaceView surfaceView = new SurfaceView(this.f9422b.getContext());
        this.f9446e = surfaceView;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.f9421a.getWidth(), this.f9421a.getHeight()));
        this.f9422b.removeAllViews();
        this.f9422b.addView(this.f9446e);
        this.f9446e.getHolder().addCallback(this.f9447f);
    }
}
