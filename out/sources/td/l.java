package td;

import android.graphics.Matrix;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class l {
    public static void a(Matrix matrix, float f15, float f16, float f17, float f18, float f19) {
        if (f17 != 0.0f) {
            matrix.preRotate(f17);
        }
        if (f16 != 0.0f) {
            d(matrix, f19);
        }
        if (f15 != 0.0f) {
            c(matrix, f18);
        }
    }

    public static void b(Matrix matrix, PointF pointF, PointF pointF2, float f15, float f16, float f17, float f18, float f19, float f25, float f26) {
        matrix.reset();
        if (pointF2 != null) {
            float f27 = pointF2.x;
            if (f27 != 0.0f || pointF2.y != 0.0f) {
                matrix.preTranslate(f27, pointF2.y);
            }
        }
        if (f19 != 0.0f) {
            matrix.preRotate(f19);
        }
        if (f18 != 0.0f) {
            d(matrix, f26);
        }
        if (f17 != 0.0f) {
            c(matrix, f25);
        }
        if (f15 != 1.0f || f16 != 1.0f) {
            matrix.preScale(f15, f16);
        }
        if (pointF != null) {
            float f28 = pointF.x;
            if (f28 == 0.0f && pointF.y == 0.0f) {
                return;
            }
            matrix.preTranslate(-f28, -pointF.y);
        }
    }

    private static void c(Matrix matrix, float f15) {
        matrix.preScale(1.0f, f15);
    }

    private static void d(Matrix matrix, float f15) {
        matrix.preScale(f15, 1.0f);
    }
}
