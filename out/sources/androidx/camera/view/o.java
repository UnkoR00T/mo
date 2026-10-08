package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Rational;
import android.util.Size;
import o.h1;

/* JADX INFO: loaded from: classes.dex */
class o extends h1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final PointF f9425e = new PointF(2.0f, 2.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f9426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Rect f9427c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Matrix f9428d;

    o(f fVar) {
        this.f9426b = fVar;
    }

    void b(Size size, int i15) {
        Rect rect;
        y.w.b();
        synchronized (this) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = this.f9427c) != null) {
                    this.f9428d = this.f9426b.c(size, i15, rect);
                    return;
                }
                this.f9428d = null;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public void c(Rect rect) {
        a(new Rational(rect.width(), rect.height()));
        synchronized (this) {
            this.f9427c = rect;
        }
    }
}
