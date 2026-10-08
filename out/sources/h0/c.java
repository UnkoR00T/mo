package h0;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import g0.c0;
import g0.z;
import java.util.Map;
import o.e1;
import o.h0;
import o.i0;
import o.v1;

/* JADX INFO: loaded from: classes.dex */
public final class c extends z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f79135n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f79136o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final h0 f79137p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final h0 f79138q;

    public c(h0 h0Var, h0 h0Var2) {
        this.f79137p = h0Var;
        this.f79138q = h0Var2;
    }

    private static float[] u(Size size, Size size2, h0 h0Var) {
        float[] fArrL = i0.d.l();
        float[] fArrL2 = i0.d.l();
        float[] fArrL3 = i0.d.l();
        Matrix.scaleM(fArrL, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        if (h0Var.c().f89682a.floatValue() != 0.0f || h0Var.c().f89683b.floatValue() != 0.0f) {
            Matrix.translateM(fArrL2, 0, h0Var.b().f89682a.floatValue() / h0Var.c().f89682a.floatValue(), h0Var.b().f89683b.floatValue() / h0Var.c().f89683b.floatValue(), 0.0f);
        }
        Matrix.multiplyMM(fArrL3, 0, fArrL, 0, fArrL2, 0);
        return fArrL3;
    }

    private void w(i0.g gVar, v1 v1Var, SurfaceTexture surfaceTexture, h0 h0Var, int i15, boolean z15) {
        s(i15);
        GLES20.glViewport(0, 0, gVar.c(), gVar.b());
        GLES20.glScissor(0, 0, gVar.c(), gVar.b());
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        v1Var.F0(fArr2, fArr, z15);
        i0.d.f fVar = (i0.d.f) i6.i.g(this.f69168k);
        if (fVar instanceof i0.d.g) {
            ((i0.d.g) fVar).h(fArr2);
        }
        fVar.e(u(new Size((int) (gVar.c() * h0Var.c().f89682a.floatValue()), (int) (gVar.b() * h0Var.c().f89683b.floatValue())), new Size(gVar.c(), gVar.b()), h0Var));
        fVar.d(h0Var.a());
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        i0.d.g("glDrawArrays");
        GLES20.glDisable(3042);
    }

    @Override // g0.z
    public i0.e h(i0 i0Var, Map<i0.d.e, c0> map) throws Throwable {
        i0.e eVarH = super.h(i0Var, map);
        this.f79135n = i0.d.p();
        this.f79136o = i0.d.p();
        return eVarH;
    }

    @Override // g0.z
    public void k() {
        super.k();
        this.f79135n = -1;
        this.f79136o = -1;
    }

    public int t(boolean z15) {
        i0.d.i(this.f69158a, true);
        i0.d.h(this.f69160c);
        return z15 ? this.f79135n : this.f79136o;
    }

    public void v(long j15, Surface surface, v1 v1Var, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
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
        i0.g gVar = gVarF;
        if (surface != this.f69166i) {
            i(gVar.a());
            this.f69166i = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        w(gVar, v1Var, surfaceTexture, this.f79137p, this.f79135n, true);
        w(gVar, v1Var, surfaceTexture2, this.f79138q, this.f79136o, false);
        EGLExt.eglPresentationTimeANDROID(this.f69161d, gVar.a(), j15);
        if (EGL14.eglSwapBuffers(this.f69161d, gVar.a())) {
            return;
        }
        e1.o("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        m(surface, false);
    }
}
