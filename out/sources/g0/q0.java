package g0;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import o.e1;
import o.v1;

/* JADX INFO: loaded from: classes.dex */
final class q0 implements v1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Surface f69095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f69096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f69097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Size f69098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final v1.a f69099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final v1.a f69100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f69101h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float[] f69102j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float[] f69103k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float[] f69104l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private i6.a<v1.b> f69105m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Executor f69106n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.google.common.util.concurrent.q<Void> f69109r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private androidx.concurrent.futures.c.a<Void> f69110s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Matrix f69111t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f69094a = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f69107p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f69108q = false;

    q0(Surface surface, int i15, int i16, Size size, v1.a aVar, v1.a aVar2, Matrix matrix) {
        float[] fArr = new float[16];
        this.f69101h = fArr;
        float[] fArr2 = new float[16];
        this.f69102j = fArr2;
        float[] fArr3 = new float[16];
        this.f69103k = fArr3;
        float[] fArr4 = new float[16];
        this.f69104l = fArr4;
        this.f69095b = surface;
        this.f69096c = i15;
        this.f69097d = i16;
        this.f69098e = size;
        this.f69099f = aVar;
        this.f69100g = aVar2;
        this.f69111t = matrix;
        m(fArr, fArr3, aVar);
        m(fArr2, fArr4, aVar2);
        this.f69109r = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0250c() { // from class: g0.o0
            @Override // androidx.concurrent.futures.c.InterfaceC0250c
            public final Object a(androidx.concurrent.futures.c.a aVar3) {
                return q0.b(this.f69085a, aVar3);
            }
        });
    }

    public static /* synthetic */ Object b(q0 q0Var, androidx.concurrent.futures.c.a aVar) {
        q0Var.f69110s = aVar;
        return "SurfaceOutputImpl close future complete";
    }

    public static /* synthetic */ void h(q0 q0Var, AtomicReference atomicReference) {
        q0Var.getClass();
        ((i6.a) atomicReference.get()).accept(v1.b.c(0, q0Var));
    }

    private static void m(float[] fArr, float[] fArr2, v1.a aVar) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        if (aVar == null) {
            return;
        }
        y.s.d(fArr, 0.5f);
        y.s.c(fArr, aVar.e(), 0.5f, 0.5f);
        if (aVar.d()) {
            android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size sizeP = y.x.p(aVar.c(), aVar.e());
        Matrix matrixE = y.x.e(y.x.s(aVar.c()), y.x.s(sizeP), aVar.e(), aVar.d());
        RectF rectF = new RectF(aVar.b());
        matrixE.mapRect(rectF);
        float width = rectF.left / sizeP.getWidth();
        float height = ((sizeP.getHeight() - rectF.height()) - rectF.top) / sizeP.getHeight();
        float fWidth = rectF.width() / sizeP.getWidth();
        float fHeight = rectF.height() / sizeP.getHeight();
        android.opengl.Matrix.translateM(fArr, 0, width, height, 0.0f);
        android.opengl.Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        p(fArr2, aVar.a());
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    private static void p(float[] fArr, v.n0 n0Var) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        y.s.d(fArr, 0.5f);
        if (n0Var != null) {
            i6.i.j(n0Var.s(), "Camera has no transform.");
            y.s.c(fArr, n0Var.c().g(), 0.5f, 0.5f);
            if (n0Var.p()) {
                android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
                android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        android.opengl.Matrix.invertM(fArr, 0, fArr, 0);
    }

    @Override // o.v1
    public void F0(float[] fArr, float[] fArr2, boolean z15) {
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, z15 ? this.f69101h : this.f69102j, 0);
    }

    @Override // o.v1
    public Surface V2(Executor executor, i6.a<v1.b> aVar) {
        boolean z15;
        synchronized (this.f69094a) {
            this.f69106n = executor;
            this.f69105m = aVar;
            z15 = this.f69107p;
        }
        if (z15) {
            u();
        }
        return this.f69095b;
    }

    @Override // o.v1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f69094a) {
            try {
                if (!this.f69108q) {
                    this.f69108q = true;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f69110s.c(null);
    }

    @Override // o.v1
    public int getFormat() {
        return this.f69097d;
    }

    @Override // o.v1
    public Size getSize() {
        return this.f69098e;
    }

    public com.google.common.util.concurrent.q<Void> r() {
        return this.f69109r;
    }

    public void u() {
        Executor executor;
        i6.a<v1.b> aVar;
        final AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f69094a) {
            try {
                if (this.f69106n == null || (aVar = this.f69105m) == null) {
                    this.f69107p = true;
                } else if (!this.f69108q) {
                    atomicReference.set(aVar);
                    executor = this.f69106n;
                    this.f69107p = false;
                }
                executor = null;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new Runnable() { // from class: g0.p0
                    @Override // java.lang.Runnable
                    public final void run() {
                        q0.h(this.f69088a, atomicReference);
                    }
                });
            } catch (RejectedExecutionException e15) {
                e1.b("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e15);
            }
        }
    }

    @Override // o.v1
    public void w2(float[] fArr, float[] fArr2) {
        F0(fArr, fArr2, true);
    }
}
