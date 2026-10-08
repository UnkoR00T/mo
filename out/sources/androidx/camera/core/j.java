package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import o.b1;
import o.e1;
import v.g2;
import y.x;

/* JADX INFO: loaded from: classes.dex */
abstract class j implements g2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g.a f9273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile int f9274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f9275c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f9277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f9278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Executor f9279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private r f9280h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ImageWriter f9281i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ByteBuffer f9286n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ByteBuffer f9287o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ByteBuffer f9288p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ByteBuffer f9289q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    ByteBuffer f9290r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    ByteBuffer f9291s;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile int f9276d = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Rect f9282j = new Rect();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Rect f9283k = new Rect();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Matrix f9284l = new Matrix();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Matrix f9285m = new Matrix();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Object f9292t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f9293u = true;

    j() {
    }

    public static /* synthetic */ void b(j jVar, o oVar, Matrix matrix, o oVar2, Rect rect, g.a aVar, androidx.concurrent.futures.c.a aVar2) {
        if (!jVar.f9293u) {
            aVar2.f(new e6.k("ImageAnalysis is detached"));
            return;
        }
        s sVar = new s(oVar2, b1.b(oVar.v3().d(), oVar.v3().getTimestamp(), jVar.f9277e ? 0 : jVar.f9274b, matrix, oVar.v3().c()));
        if (!rect.isEmpty()) {
            sVar.y1(rect);
        }
        aVar.c(sVar);
        aVar2.c(null);
    }

    public static /* synthetic */ Object c(final j jVar, Executor executor, final o oVar, final Matrix matrix, final o oVar2, final Rect rect, final g.a aVar, final androidx.concurrent.futures.c.a aVar2) {
        jVar.getClass();
        executor.execute(new Runnable() { // from class: androidx.camera.core.i
            @Override // java.lang.Runnable
            public final void run() {
                j.b(this.f9256a, oVar, matrix, oVar2, rect, aVar, aVar2);
            }
        });
        return "analyzeImage";
    }

    private void g(o oVar) {
        if (this.f9276d != 1 && this.f9276d != 3) {
            if (this.f9276d == 2 && this.f9286n == null) {
                this.f9286n = ByteBuffer.allocateDirect(oVar.l() * oVar.getHeight() * 4);
                return;
            }
            return;
        }
        if (this.f9287o == null) {
            this.f9287o = ByteBuffer.allocateDirect(oVar.l() * oVar.getHeight());
        }
        this.f9287o.position(0);
        if (this.f9288p == null) {
            this.f9288p = ByteBuffer.allocateDirect((oVar.l() * oVar.getHeight()) / 4);
        }
        this.f9288p.position(0);
        if (this.f9289q == null) {
            this.f9289q = ByteBuffer.allocateDirect((oVar.l() * oVar.getHeight()) / 4);
        }
        this.f9289q.position(0);
        if (this.f9276d == 3) {
            if (this.f9290r == null) {
                this.f9290r = ByteBuffer.allocateDirect(oVar.l() * oVar.getHeight());
            }
            this.f9290r.position(0);
            if (this.f9291s == null) {
                this.f9291s = ByteBuffer.allocateDirect((oVar.l() * oVar.getHeight()) / 2);
            }
            this.f9291s.position(0);
        }
    }

    private static r h(int i15, int i16, int i17, int i18, int i19) {
        boolean z15 = i17 == 90 || i17 == 270;
        int i25 = z15 ? i16 : i15;
        if (!z15) {
            i15 = i16;
        }
        return new r(p.a(i25, i15, i18, i19));
    }

    static Matrix j(int i15, int i16, int i17, int i18, int i19) {
        Matrix matrix = new Matrix();
        if (i19 > 0) {
            matrix.setRectToRect(new RectF(0.0f, 0.0f, i15, i16), x.f222516a, Matrix.ScaleToFit.FILL);
            matrix.postRotate(i19);
            matrix.postConcat(x.c(new RectF(0.0f, 0.0f, i17, i18)));
        }
        return matrix;
    }

    static Rect k(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    private void m(int i15, int i16, int i17, int i18) {
        Matrix matrixJ = j(i15, i16, i17, i18, this.f9274b);
        this.f9283k = k(this.f9282j, matrixJ);
        this.f9285m.setConcat(this.f9284l, matrixJ);
    }

    private void n(o oVar, int i15) {
        r rVar = this.f9280h;
        if (rVar == null) {
            return;
        }
        rVar.j();
        this.f9280h = h(oVar.l(), oVar.getHeight(), i15, this.f9280h.d(), this.f9280h.a());
        if (this.f9276d == 1) {
            ImageWriter imageWriter = this.f9281i;
            if (imageWriter != null) {
                c0.a.a(imageWriter);
            }
            this.f9281i = c0.a.c(this.f9280h.getSurface(), this.f9280h.a());
        }
    }

    @Override // v.g2.a
    public void a(g2 g2Var) {
        try {
            o oVarD = d(g2Var);
            if (oVarD != null) {
                l(oVarD);
            }
        } catch (IllegalStateException e15) {
            e1.d("ImageAnalysisAnalyzer", "Failed to acquire image.", e15);
        }
    }

    abstract o d(g2 g2Var);

    com.google.common.util.concurrent.q<Void> e(final o oVar) throws Throwable {
        Object obj;
        final Executor executor;
        final g.a aVar;
        boolean z15;
        r rVar;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        ByteBuffer byteBuffer5;
        ByteBuffer byteBuffer6;
        o oVarO;
        o oVar2;
        int i15 = this.f9277e ? this.f9274b : 0;
        Object obj2 = this.f9292t;
        synchronized (obj2) {
            try {
                try {
                    executor = this.f9279g;
                    aVar = this.f9273a;
                    z15 = this.f9277e && i15 != this.f9275c;
                    if (z15) {
                        n(oVar, i15);
                    }
                    if (this.f9277e || this.f9276d == 3) {
                        g(oVar);
                    }
                    try {
                        rVar = this.f9280h;
                        try {
                            imageWriter = this.f9281i;
                            byteBuffer = this.f9286n;
                            byteBuffer2 = this.f9287o;
                            byteBuffer3 = this.f9288p;
                            byteBuffer4 = this.f9289q;
                            byteBuffer5 = this.f9290r;
                            byteBuffer6 = this.f9291s;
                        } catch (Throwable th4) {
                            th = th4;
                            obj = obj2;
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        obj = obj2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
                obj = obj2;
            }
        }
        if (aVar == null || executor == null || !this.f9293u) {
            return a0.f.f(new e6.k("No analyzer or executor currently set."));
        }
        if (rVar != null) {
            if (this.f9276d == 2) {
                oVarO = ImageProcessingUtil.g(oVar, rVar, byteBuffer, i15, this.f9278f);
            } else {
                if (this.f9276d == 1) {
                    if (this.f9278f) {
                        ImageProcessingUtil.c(oVar);
                    }
                    if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                        oVarO = ImageProcessingUtil.n(oVar, rVar, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i15);
                    }
                }
                oVar2 = null;
            }
            oVar2 = oVarO;
        } else {
            if (this.f9276d == 3) {
                if (this.f9278f) {
                    ImageProcessingUtil.c(oVar);
                }
                if (byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null && byteBuffer5 != null && byteBuffer6 != null) {
                    oVarO = ImageProcessingUtil.o(oVar, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5, byteBuffer6, i15);
                    oVar2 = oVarO;
                }
            }
            oVar2 = null;
        }
        boolean z16 = oVar2 == null;
        final o oVar3 = z16 ? oVar : oVar2;
        final Rect rect = new Rect();
        final Matrix matrix = new Matrix();
        synchronized (this.f9292t) {
            if (z15 && !z16) {
                try {
                    m(oVar.l(), oVar.getHeight(), oVar3.l(), oVar3.getHeight());
                } catch (Throwable th8) {
                    throw th8;
                }
            }
            this.f9275c = i15;
            rect.set(this.f9283k);
            matrix.set(this.f9285m);
        }
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0250c() { // from class: androidx.camera.core.h
            @Override // androidx.concurrent.futures.c.InterfaceC0250c
            public final Object a(androidx.concurrent.futures.c.a aVar2) {
                return j.c(this.f9249a, executor, oVar, matrix, oVar3, rect, aVar, aVar2);
            }
        });
    }

    abstract void f();

    void i() {
        this.f9293u = false;
        f();
    }

    abstract void l(o oVar);

    void o(Executor executor, g.a aVar) {
        if (aVar == null) {
            f();
        }
        synchronized (this.f9292t) {
            this.f9273a = aVar;
            this.f9279g = executor;
        }
    }

    void p(boolean z15) {
        this.f9278f = z15;
    }

    void q(int i15) {
        this.f9276d = i15;
    }

    void r(boolean z15) {
        this.f9277e = z15;
    }

    void s(r rVar) {
        synchronized (this.f9292t) {
            this.f9280h = rVar;
        }
    }

    void t(int i15) {
        this.f9274b = i15;
    }

    void u(Matrix matrix) {
        synchronized (this.f9292t) {
            this.f9284l = matrix;
            this.f9285m = new Matrix(this.f9284l);
        }
    }

    void v(Rect rect) {
        synchronized (this.f9292t) {
            this.f9282j = rect;
            this.f9283k = new Rect(this.f9282j);
        }
    }
}
