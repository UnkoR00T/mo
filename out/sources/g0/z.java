package g0;

import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import o.e1;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Thread f69160c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected EGLConfig f69164g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected Surface f69166i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final AtomicBoolean f69158a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Map<Surface, i0.g> f69159b = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected EGLDisplay f69161d = EGL14.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected EGLContext f69162e = EGL14.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int[] f69163f = i0.d.f87687a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected EGLSurface f69165h = EGL14.EGL_NO_SURFACE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected Map<i0.d.e, i0.d.f> f69167j = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected i0.d.f f69168k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected i0.d.e f69169l = i0.d.e.UNKNOWN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f69170m = -1;

    private void a(int i15) {
        GLES20.glActiveTexture(33984);
        i0.d.g("glActiveTexture");
        GLES20.glBindTexture(36197, i15);
        i0.d.g("glBindTexture");
    }

    private void b(o.i0 i0Var, i0.e.a aVar) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f69161d = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f69161d, iArr, 0, iArr, 1)) {
            this.f69161d = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (aVar != null) {
            aVar.c(iArr[0] + "." + iArr[1]);
        }
        int i15 = i0Var.d() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f69161d, new int[]{12324, i15, 12323, i15, 12322, i15, 12321, i0Var.d() ? 2 : 8, 12325, 0, 12326, 0, 12352, i0Var.d() ? 64 : 4, 12610, i0Var.d() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f69161d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, i0Var.d() ? 3 : 2, 12344}, 0);
        i0.d.f("eglCreateContext");
        this.f69164g = eGLConfig;
        this.f69162e = eGLContextEglCreateContext;
        EGL14.eglQueryContext(this.f69161d, eGLContextEglCreateContext, 12440, new int[1], 0);
    }

    private void d() {
        EGLDisplay eGLDisplay = this.f69161d;
        EGLConfig eGLConfig = this.f69164g;
        Objects.requireNonNull(eGLConfig);
        this.f69165h = i0.d.n(eGLDisplay, eGLConfig, 1, 1);
    }

    private i6.d<String, String> e(o.i0 i0Var) {
        i0.d.i(this.f69158a, false);
        try {
            b(i0Var, null);
            d();
            i(this.f69165h);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString(this.f69161d, 12373);
            if (strGlGetString == null) {
                strGlGetString = "";
            }
            if (strEglQueryString == null) {
                strEglQueryString = "";
            }
            return new i6.d<>(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e15) {
            e1.p("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e15.getMessage(), e15);
            return new i6.d<>("", "");
        } finally {
            l();
        }
    }

    private void l() {
        Iterator<i0.d.f> it = this.f69167j.values().iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.f69167j = Collections.EMPTY_MAP;
        this.f69168k = null;
        if (!Objects.equals(this.f69161d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.f69161d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (i0.g gVar : this.f69159b.values()) {
                if (!Objects.equals(gVar.a(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f69161d, gVar.a())) {
                    i0.d.e("eglDestroySurface");
                }
            }
            this.f69159b.clear();
            if (!Objects.equals(this.f69165h, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f69161d, this.f69165h);
                this.f69165h = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.f69162e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f69161d, this.f69162e);
                this.f69162e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f69161d);
            this.f69161d = EGL14.EGL_NO_DISPLAY;
        }
        this.f69164g = null;
        this.f69170m = -1;
        this.f69169l = i0.d.e.UNKNOWN;
        this.f69166i = null;
        this.f69160c = null;
    }

    private void q(ByteBuffer byteBuffer, Size size, float[] fArr) {
        i6.i.b(byteBuffer.capacity() == (size.getWidth() * size.getHeight()) * 4, "ByteBuffer capacity is not equal to width * height * 4.");
        i6.i.b(byteBuffer.isDirect(), "ByteBuffer is not direct.");
        int iU = i0.d.u();
        GLES20.glActiveTexture(33985);
        i0.d.g("glActiveTexture");
        GLES20.glBindTexture(3553, iU);
        i0.d.g("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, size.getWidth(), size.getHeight(), 0, 6407, 5121, null);
        i0.d.g("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int iT = i0.d.t();
        GLES20.glBindFramebuffer(36160, iT);
        i0.d.g("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iU, 0);
        i0.d.g("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        i0.d.g("glActiveTexture");
        GLES20.glBindTexture(36197, this.f69170m);
        i0.d.g("glBindTexture");
        this.f69166i = null;
        GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
        GLES20.glScissor(0, 0, size.getWidth(), size.getHeight());
        i0.d.f fVar = (i0.d.f) i6.i.g(this.f69168k);
        if (fVar instanceof i0.d.g) {
            ((i0.d.g) fVar).h(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        i0.d.g("glDrawArrays");
        GLES20.glReadPixels(0, 0, size.getWidth(), size.getHeight(), 6408, 5121, byteBuffer);
        i0.d.g("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        i0.d.s(iU);
        i0.d.r(iT);
        a(this.f69170m);
    }

    protected i0.g c(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.f69161d;
            EGLConfig eGLConfig = this.f69164g;
            Objects.requireNonNull(eGLConfig);
            EGLSurface eGLSurfaceQ = i0.d.q(eGLDisplay, eGLConfig, surface, this.f69163f);
            Size sizeX = i0.d.x(this.f69161d, eGLSurfaceQ);
            return i0.g.d(eGLSurfaceQ, sizeX.getWidth(), sizeX.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e15) {
            e1.p("OpenGlRenderer", "Failed to create EGL surface: " + e15.getMessage(), e15);
            return null;
        }
    }

    protected i0.g f(Surface surface) {
        i6.i.j(this.f69159b.containsKey(surface), "The surface is not registered.");
        i0.g gVar = this.f69159b.get(surface);
        Objects.requireNonNull(gVar);
        return gVar;
    }

    public int g() {
        i0.d.i(this.f69158a, true);
        i0.d.h(this.f69160c);
        return this.f69170m;
    }

    public i0.e h(o.i0 i0Var, Map<i0.d.e, c0> map) throws Throwable {
        i0.d.i(this.f69158a, false);
        i0.e.a aVarA = i0.e.a();
        try {
            if (i0Var.d()) {
                i6.d<String, String> dVarE = e(i0Var);
                String str = (String) i6.i.g(dVarE.f89682a);
                String str2 = (String) i6.i.g(dVarE.f89683b);
                if (!str.contains("GL_EXT_YUV_target")) {
                    e1.o("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    i0Var = o.i0.f140011d;
                }
                this.f69163f = i0.d.k(str2, i0Var);
                aVarA.d(str);
                aVarA.b(str2);
            }
            b(i0Var, aVarA);
            d();
            i(this.f69165h);
            aVarA.e(i0.d.w());
            this.f69167j = i0.d.o(i0Var, map);
            int iP = i0.d.p();
            this.f69170m = iP;
            s(iP);
            this.f69160c = Thread.currentThread();
            this.f69158a.set(true);
            return aVarA.a();
        } catch (IllegalArgumentException e15) {
            e = e15;
            l();
            throw e;
        } catch (IllegalStateException e16) {
            e = e16;
            l();
            throw e;
        }
    }

    protected void i(EGLSurface eGLSurface) {
        i6.i.g(this.f69161d);
        i6.i.g(this.f69162e);
        if (!EGL14.eglMakeCurrent(this.f69161d, eGLSurface, eGLSurface, this.f69162e)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public void j(Surface surface) {
        i0.d.i(this.f69158a, true);
        i0.d.h(this.f69160c);
        if (this.f69159b.containsKey(surface)) {
            return;
        }
        this.f69159b.put(surface, i0.d.f87698l);
    }

    public void k() {
        if (this.f69158a.getAndSet(false)) {
            i0.d.h(this.f69160c);
            l();
        }
    }

    protected void m(Surface surface, boolean z15) {
        if (this.f69166i == surface) {
            this.f69166i = null;
            i(this.f69165h);
        }
        i0.g gVarRemove = z15 ? this.f69159b.remove(surface) : this.f69159b.put(surface, i0.d.f87698l);
        if (gVarRemove == null || gVarRemove == i0.d.f87698l) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.f69161d, gVarRemove.a());
        } catch (RuntimeException e15) {
            e1.p("OpenGlRenderer", "Failed to destroy EGL surface: " + e15.getMessage(), e15);
        }
    }

    public void n(long j15, float[] fArr, Surface surface) {
        i0.d.i(this.f69158a, true);
        i0.d.h(this.f69160c);
        i0.g gVarF = f(surface);
        if (gVarF == i0.d.f87698l) {
            gVarF = c(surface);
            if (gVarF == null) {
                return;
            } else {
                this.f69159b.put(surface, gVarF);
            }
        }
        if (surface != this.f69166i) {
            i(gVarF.a());
            this.f69166i = surface;
            GLES20.glViewport(0, 0, gVarF.c(), gVarF.b());
            GLES20.glScissor(0, 0, gVarF.c(), gVarF.b());
        }
        i0.d.f fVar = (i0.d.f) i6.i.g(this.f69168k);
        if (fVar instanceof i0.d.g) {
            ((i0.d.g) fVar).h(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        i0.d.g("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.f69161d, gVarF.a(), j15);
        if (EGL14.eglSwapBuffers(this.f69161d, gVarF.a())) {
            return;
        }
        e1.o("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        m(surface, false);
    }

    public void o(i0.d.e eVar) {
        i0.d.i(this.f69158a, true);
        i0.d.h(this.f69160c);
        if (this.f69169l != eVar) {
            this.f69169l = eVar;
            s(this.f69170m);
        }
    }

    public Bitmap p(Size size, float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(size.getWidth() * size.getHeight() * 4);
        q(byteBufferAllocateDirect, size, fArr);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.j(bitmapCreateBitmap, byteBufferAllocateDirect, size.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    public void r(Surface surface) {
        i0.d.i(this.f69158a, true);
        i0.d.h(this.f69160c);
        m(surface, true);
    }

    protected void s(int i15) {
        i0.d.f fVar = this.f69167j.get(this.f69169l);
        if (fVar == null) {
            throw new IllegalStateException("Unable to configure program for input format: " + this.f69169l);
        }
        if (this.f69168k != fVar) {
            this.f69168k = fVar;
            fVar.f();
            Objects.toString(this.f69169l);
            Objects.toString(this.f69168k);
        }
        a(i15);
    }
}
