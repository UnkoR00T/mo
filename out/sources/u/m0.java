package u;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class m0 implements g0.a0<w0.b, g0.b0<androidx.camera.core.o>> {
    m0() {
    }

    private static g0.b0<androidx.camera.core.o> b(x0 x0Var, y.f fVar, androidx.camera.core.o oVar) {
        return g0.b0.k(oVar, fVar, x0Var.b(), x0Var.f(), x0Var.h(), d(oVar));
    }

    private static g0.b0<androidx.camera.core.o> c(x0 x0Var, y.f fVar, androidx.camera.core.o oVar) {
        Size size = new Size(oVar.l(), oVar.getHeight());
        int iF = x0Var.f() - fVar.s();
        Size sizeE = e(iF, size);
        Matrix matrixD = y.x.d(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, sizeE.getWidth(), sizeE.getHeight()), iF);
        return g0.b0.l(oVar, fVar, sizeE, f(x0Var.b(), matrixD), fVar.s(), g(x0Var.h(), matrixD), d(oVar));
    }

    private static v.c0 d(androidx.camera.core.o oVar) {
        return oVar.v3() instanceof b0.c ? ((b0.c) oVar.v3()).b() : v.c0.a.b();
    }

    private static Size e(int i15, Size size) {
        return y.x.i(y.x.v(i15)) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    private static Rect f(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    private static Matrix g(Matrix matrix, Matrix matrix2) {
        Matrix matrix3 = new Matrix(matrix);
        matrix3.postConcat(matrix2);
        return matrix3;
    }

    @Override // g0.a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g0.b0<androidx.camera.core.o> apply(w0.b bVar) throws o.v0 {
        y.f fVarJ;
        androidx.camera.core.o oVarA = bVar.a();
        x0 x0VarB = bVar.b();
        if (f0.b.j(oVarA.getFormat())) {
            try {
                fVarJ = y.f.j(oVarA);
                oVarA.o2()[0].v().rewind();
            } catch (IOException e15) {
                throw new o.v0(1, "Failed to extract EXIF data.", e15);
            }
        } else {
            fVarJ = null;
        }
        if (!e0.f193362g.b(oVarA)) {
            return b(x0VarB, fVarJ, oVarA);
        }
        i6.i.h(fVarJ, "JPEG image must have exif.");
        return c(x0VarB, fVarJ, oVarA);
    }
}
