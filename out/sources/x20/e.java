package x20;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes5.dex */
public class e implements GLSurfaceView.Renderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f216520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f216521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n f216522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f216523d = new float[16];

    public e(b bVar, a aVar) {
        this.f216520a = bVar;
        this.f216521b = aVar;
    }

    private void b() {
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        GLES20.glDisable(2929);
    }

    private void c() {
        l.c(this.f216522c);
    }

    private void d() {
        n nVarA = this.f216520a.a();
        this.f216522c = nVarA;
        nVarA.a();
    }

    private void e() {
        this.f216520a.b().a(this.f216522c);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        GLES20.glClear(16384);
        this.f216522c.h(n.a.ACCELEROMETER_COORDINATES, this.f216521b.a());
        this.f216522c.g(n.a.MVP_MATRIX, this.f216523d);
        l.b(this.f216522c);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i15, int i16) {
        GLES20.glViewport(0, 0, i15, i16);
        Matrix.orthoM(this.f216523d, 0, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        b();
        d();
        e();
        c();
    }
}
