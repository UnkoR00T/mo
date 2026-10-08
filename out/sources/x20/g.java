package x20;

import android.graphics.SurfaceTexture;
import android.opengl.GLUtils;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes5.dex */
public class g extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SurfaceTexture f216530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f216531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EGL10 f216532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EGLDisplay f216533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EGLConfig f216534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private EGLContext f216535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private EGLSurface f216536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private GL f216537h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f216538j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f216539k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int[] f216542n = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile boolean f216540l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile boolean f216541m = true;

    public g(SurfaceTexture surfaceTexture, e eVar, int i15, int i16) {
        this.f216530a = surfaceTexture;
        this.f216531b = eVar;
        this.f216538j = i15;
        this.f216539k = i16;
    }

    private boolean a() {
        return !this.f216532c.eglSwapBuffers(this.f216533d, this.f216536g);
    }

    private void b() {
        if (this.f216535f.equals(this.f216532c.eglGetCurrentContext()) && this.f216536g.equals(this.f216532c.eglGetCurrentSurface(12377))) {
            return;
        }
        c();
        EGL10 egl10 = this.f216532c;
        EGLDisplay eGLDisplay = this.f216533d;
        EGLSurface eGLSurface = this.f216536g;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f216535f)) {
            c();
            return;
        }
        throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f216532c.eglGetError()));
    }

    private void c() {
        int iEglGetError = this.f216532c.eglGetError();
        if (this.f216532c.eglGetError() != 12288) {
            px.f.f163100a.d("EGL error = 0x" + Integer.toHexString(iEglGetError), null, px.c.a("TextureView"));
        }
    }

    private EGLConfig d(EGLConfig[] eGLConfigArr, int[] iArr) {
        if (this.f216532c.eglChooseConfig(this.f216533d, this.f216542n, eGLConfigArr, 1, iArr)) {
            if (iArr[0] > 0) {
                return eGLConfigArr[0];
            }
            return null;
        }
        throw new IllegalArgumentException("eglChooseConfig failed " + GLUtils.getEGLErrorString(this.f216532c.eglGetError()));
    }

    private EGLContext e() {
        return this.f216532c.eglCreateContext(this.f216533d, this.f216534e, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
    }

    private void f() {
        EGLSurface eGLSurface;
        if (this.f216532c == null) {
            throw new RuntimeException("egl not initialized");
        }
        if (this.f216533d == null) {
            throw new RuntimeException("eglDisplay not initialized");
        }
        if (this.f216534e == null) {
            throw new RuntimeException("eglConfig not initialized");
        }
        h();
        try {
            g();
            if (this.f216536g == null || (eGLSurface = this.f216536g) == EGL10.EGL_NO_SURFACE) {
                return;
            }
            this.f216532c.eglMakeCurrent(this.f216533d, eGLSurface, eGLSurface, this.f216535f);
        } catch (IllegalArgumentException unused) {
        }
    }

    private void g() {
        this.f216536g = this.f216532c.eglCreateWindowSurface(this.f216533d, this.f216534e, this.f216530a, null);
    }

    private void h() {
        if (this.f216536g != null) {
            EGLSurface eGLSurface = this.f216536g;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            if (eGLSurface != eGLSurface2) {
                this.f216532c.eglMakeCurrent(this.f216533d, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
                this.f216532c.eglDestroySurface(this.f216533d, this.f216536g);
                this.f216536g = null;
            }
        }
    }

    private void i() {
        EGL10 egl10 = this.f216532c;
        EGLDisplay eGLDisplay = this.f216533d;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        this.f216532c.eglDestroyContext(this.f216533d, this.f216535f);
        this.f216532c.eglDestroySurface(this.f216533d, this.f216536g);
        this.f216532c.eglTerminate(this.f216533d);
    }

    private void j() {
        EGLConfig eGLConfigL = l();
        this.f216534e = eGLConfigL;
        if (eGLConfigL == null) {
            throw new RuntimeException("eglConfig not initialized");
        }
    }

    private void k() {
        this.f216533d = this.f216532c.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        q();
        r();
    }

    private EGLConfig l() {
        return d(new EGLConfig[1], new int[1]);
    }

    private void m() {
        this.f216532c = (EGL10) EGLContext.getEGL();
        k();
        j();
        this.f216535f = e();
        f();
        EGL10 egl10 = this.f216532c;
        EGLDisplay eGLDisplay = this.f216533d;
        EGLSurface eGLSurface = this.f216536g;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f216535f)) {
            this.f216537h = this.f216535f.getGL();
            return;
        }
        throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f216532c.eglGetError()));
    }

    private void q() {
        if (this.f216533d != EGL10.EGL_NO_DISPLAY) {
            return;
        }
        throw new RuntimeException("eglGetDisplay failed " + GLUtils.getEGLErrorString(this.f216532c.eglGetError()));
    }

    private void r() {
        if (this.f216532c.eglInitialize(this.f216533d, new int[2])) {
            return;
        }
        throw new RuntimeException("eglInitialize failed " + GLUtils.getEGLErrorString(this.f216532c.eglGetError()));
    }

    public boolean n() {
        return this.f216540l;
    }

    public synchronized void o(int i15, int i16) {
        this.f216538j = i15;
        this.f216539k = i16;
        this.f216541m = true;
    }

    public void p() {
        this.f216540l = false;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        m();
        GL10 gl10 = (GL10) this.f216537h;
        this.f216531b.onSurfaceCreated(gl10, this.f216534e);
        while (this.f216540l) {
            try {
                Thread.sleep(50L);
                b();
                if (this.f216541m) {
                    f();
                    this.f216531b.onSurfaceChanged(gl10, this.f216538j, this.f216539k);
                    this.f216541m = false;
                }
                this.f216531b.onDrawFrame(gl10);
                if (a()) {
                    throw new RuntimeException("Cannot swap buffers");
                }
            } catch (InterruptedException e15) {
                px.f.f163100a.d("GLThread run error", e15, px.c.a(this));
            }
        }
        i();
    }
}
