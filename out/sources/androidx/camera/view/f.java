package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import o.e1;
import o.h2;

/* JADX INFO: loaded from: classes.dex */
final class f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final m.d f9368i = m.d.FILL_CENTER;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Size f9369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Rect f9370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Matrix f9372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f9373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f9374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f9375g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private m.d f9376h = f9368i;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9377a;

        static {
            int[] iArr = new int[m.d.values().length];
            f9377a = iArr;
            try {
                iArr[m.d.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9377a[m.d.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9377a[m.d.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9377a[m.d.FILL_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9377a[m.d.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9377a[m.d.FILL_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    f() {
    }

    private static RectF b(RectF rectF, float f15) {
        float f16 = f15 + f15;
        return new RectF(f16 - rectF.right, rectF.top, f16 - rectF.left, rectF.bottom);
    }

    private int e() {
        return !this.f9375g ? this.f9371c : -y.c.b(this.f9373e);
    }

    private Size f() {
        return y.x.i(this.f9371c) ? new Size(this.f9370b.height(), this.f9370b.width()) : new Size(this.f9370b.width(), this.f9370b.height());
    }

    private RectF l(Size size, int i15) {
        i6.i.i(m());
        Matrix matrixJ = j(size, i15);
        RectF rectF = new RectF(0.0f, 0.0f, this.f9369a.getWidth(), this.f9369a.getHeight());
        matrixJ.mapRect(rectF);
        return rectF;
    }

    private boolean m() {
        return (this.f9370b == null || this.f9369a == null || !(!this.f9375g || this.f9373e != -1)) ? false : true;
    }

    private static void p(Matrix matrix, RectF rectF, RectF rectF2, m.d dVar) {
        Matrix.ScaleToFit scaleToFit;
        switch (a.f9377a[dVar.ordinal()]) {
            case 1:
            case 2:
                scaleToFit = Matrix.ScaleToFit.CENTER;
                break;
            case 3:
            case 4:
                scaleToFit = Matrix.ScaleToFit.END;
                break;
            case 5:
            case 6:
                scaleToFit = Matrix.ScaleToFit.START;
                break;
            default:
                e1.c("PreviewTransform", "Unexpected crop rect: " + dVar);
                scaleToFit = Matrix.ScaleToFit.FILL;
                break;
        }
        if (dVar == m.d.FIT_CENTER || dVar == m.d.FIT_START || dVar == m.d.FIT_END) {
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
        } else {
            matrix.setRectToRect(rectF2, rectF, scaleToFit);
            matrix.invert(matrix);
        }
    }

    Bitmap a(Bitmap bitmap, Size size, int i15) {
        if (!m()) {
            return bitmap;
        }
        Matrix matrixK = k();
        RectF rectFL = l(size, i15);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixK);
        matrix.postScale(rectFL.width() / this.f9369a.getWidth(), rectFL.height() / this.f9369a.getHeight());
        matrix.postTranslate(rectFL.left, rectFL.top);
        canvas.drawBitmap(bitmap, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    Matrix c(Size size, int i15, Rect rect) {
        if (!m()) {
            return null;
        }
        Matrix matrix = new Matrix();
        h(size, i15).invert(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    RectF d(Size size, int i15) {
        RectF rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        Size sizeF = f();
        RectF rectF2 = new RectF(0.0f, 0.0f, sizeF.getWidth(), sizeF.getHeight());
        Matrix matrix = new Matrix();
        p(matrix, rectF2, rectF, this.f9376h);
        matrix.mapRect(rectF2);
        return i15 == 1 ? b(rectF2, size.getWidth() / 2.0f) : rectF2;
    }

    m.d g() {
        return this.f9376h;
    }

    Matrix h(Size size, int i15) {
        if (!m()) {
            return null;
        }
        Matrix matrix = new Matrix(this.f9372d);
        matrix.postConcat(j(size, i15));
        return matrix;
    }

    Rect i() {
        return this.f9370b;
    }

    Matrix j(Size size, int i15) {
        i6.i.i(m());
        Matrix matrixD = y.x.d(new RectF(this.f9370b), n(size) ? new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()) : d(size, i15), this.f9371c);
        if (this.f9374f && this.f9375g) {
            if (y.x.i(this.f9371c)) {
                matrixD.preScale(1.0f, -1.0f, this.f9370b.centerX(), this.f9370b.centerY());
                return matrixD;
            }
            matrixD.preScale(-1.0f, 1.0f, this.f9370b.centerX(), this.f9370b.centerY());
        }
        return matrixD;
    }

    Matrix k() {
        i6.i.i(m());
        RectF rectF = new RectF(0.0f, 0.0f, this.f9369a.getWidth(), this.f9369a.getHeight());
        return y.x.d(rectF, rectF, e());
    }

    boolean n(Size size) {
        return y.x.k(size, true, f(), false);
    }

    void o(int i15, int i16) {
        if (this.f9375g) {
            this.f9371c = i15;
            this.f9373e = i16;
        }
    }

    void q(m.d dVar) {
        this.f9376h = dVar;
    }

    void r(h2.h hVar, Size size, boolean z15) {
        e1.a("PreviewTransform", "Transformation info set: " + hVar + " " + size + " " + z15);
        this.f9370b = hVar.a();
        this.f9371c = hVar.b();
        this.f9373e = hVar.d();
        this.f9369a = size;
        this.f9374f = z15;
        this.f9375g = hVar.e();
        this.f9372d = hVar.c();
    }

    void s(Size size, int i15, View view) {
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            e1.o("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
            return;
        }
        if (m()) {
            if (view instanceof TextureView) {
                ((TextureView) view).setTransform(k());
            } else {
                Display display = view.getDisplay();
                boolean z15 = false;
                boolean z16 = (!this.f9375g || display == null || display.getRotation() == this.f9373e) ? false : true;
                if (!this.f9375g && e() != 0) {
                    z15 = true;
                }
                if (z16 || z15) {
                    e1.c("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            RectF rectFL = l(size, i15);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setScaleX(rectFL.width() / this.f9369a.getWidth());
            view.setScaleY(rectFL.height() / this.f9369a.getHeight());
            view.setTranslationX(rectFL.left - view.getLeft());
            view.setTranslationY(rectFL.top - view.getTop());
        }
    }
}
