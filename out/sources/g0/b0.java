package g0;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0<T> {
    public static b0<Bitmap> j(Bitmap bitmap, y.f fVar, Rect rect, int i15, Matrix matrix, v.c0 c0Var) {
        return new b(bitmap, fVar, 42, new Size(bitmap.getWidth(), bitmap.getHeight()), rect, i15, matrix, c0Var);
    }

    public static b0<androidx.camera.core.o> k(androidx.camera.core.o oVar, y.f fVar, Rect rect, int i15, Matrix matrix, v.c0 c0Var) {
        return l(oVar, fVar, new Size(oVar.l(), oVar.getHeight()), rect, i15, matrix, c0Var);
    }

    public static b0<androidx.camera.core.o> l(androidx.camera.core.o oVar, y.f fVar, Size size, Rect rect, int i15, Matrix matrix, v.c0 c0Var) {
        if (f0.b.j(oVar.getFormat())) {
            i6.i.h(fVar, "JPEG image must have Exif.");
        }
        return new b(oVar, fVar, oVar.getFormat(), size, rect, i15, matrix, c0Var);
    }

    public static b0<byte[]> m(byte[] bArr, y.f fVar, int i15, Size size, Rect rect, int i16, Matrix matrix, v.c0 c0Var) {
        return new b(bArr, fVar, i15, size, rect, i16, matrix, c0Var);
    }

    public abstract v.c0 a();

    public abstract Rect b();

    public abstract T c();

    public abstract y.f d();

    public abstract int e();

    public abstract int f();

    public abstract Matrix g();

    public abstract Size h();

    public boolean i() {
        return y.x.h(b(), h());
    }
}
