package y;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.util.SizeF;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RectF f222516a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static float a(float f15, float f16, float f17, float f18) {
        float f19 = (f15 * f17) + (f16 * f18);
        float f25 = (f15 * f18) - (f16 * f17);
        double dSqrt = Math.sqrt((f15 * f15) + (f16 * f16)) * Math.sqrt((f17 * f17) + (f18 * f18));
        return (float) Math.toDegrees(Math.atan2(((double) f25) / dSqrt, ((double) f19) / dSqrt));
    }

    public static Matrix b(Rect rect) {
        return c(new RectF(rect));
    }

    public static Matrix c(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(f222516a, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    public static Matrix d(RectF rectF, RectF rectF2, int i15) {
        return e(rectF, rectF2, i15, false);
    }

    public static Matrix e(RectF rectF, RectF rectF2, int i15, boolean z15) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, f222516a, Matrix.ScaleToFit.FILL);
        matrix.postRotate(i15);
        if (z15) {
            matrix.postScale(-1.0f, 1.0f);
        }
        matrix.postConcat(c(rectF2));
        return matrix;
    }

    public static Size f(Rect rect, int i15) {
        return p(m(rect), i15);
    }

    public static int g(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return v((int) Math.round(Math.atan2(fArr[3], fArr[0]) * 57.29577951308232d));
    }

    public static boolean h(Rect rect, Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    public static boolean i(int i15) {
        if (i15 == 90 || i15 == 270) {
            return true;
        }
        if (i15 == 0 || i15 == 180) {
            return false;
        }
        throw new IllegalArgumentException("Invalid rotation degrees: " + i15);
    }

    public static boolean j(Size size, Size size2) {
        return k(size, false, size2, false);
    }

    public static boolean k(Size size, boolean z15, Size size2, boolean z16) {
        float width;
        float width2;
        float width3;
        float f15;
        if (z15) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        if (z16) {
            width3 = size2.getWidth() / size2.getHeight();
            f15 = width3;
        } else {
            float width4 = (size2.getWidth() + 1.0f) / (size2.getHeight() - 1.0f);
            width3 = (size2.getWidth() - 1.0f) / (size2.getHeight() + 1.0f);
            f15 = width4;
        }
        return width >= width3 && f15 >= width2;
    }

    public static boolean l(Matrix matrix) {
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        return a(fArr[0], fArr[1], fArr[2], fArr[3]) > 0.0f;
    }

    public static Size m(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    public static Size n(Size size) {
        return new Size(size.getHeight(), size.getWidth());
    }

    public static SizeF o(SizeF sizeF) {
        return new SizeF(sizeF.getHeight(), sizeF.getWidth());
    }

    public static Size p(Size size, int i15) {
        i6.i.b(i15 % 90 == 0, "Invalid rotation degrees: " + i15);
        return i(v(i15)) ? n(size) : size;
    }

    public static Rect q(Size size) {
        return r(size, 0, 0);
    }

    public static Rect r(Size size, int i15, int i16) {
        return new Rect(i15, i16, size.getWidth() + i15, size.getHeight() + i16);
    }

    public static RectF s(Size size) {
        return t(size, 0, 0);
    }

    public static RectF t(Size size, int i15, int i16) {
        return new RectF(i15, i16, i15 + size.getWidth(), i16 + size.getHeight());
    }

    public static Matrix u(Matrix matrix, Rect rect) {
        Matrix matrix2 = new Matrix(matrix);
        matrix2.postTranslate(-rect.left, -rect.top);
        return matrix2;
    }

    public static int v(int i15) {
        return ((i15 % 360) + 360) % 360;
    }
}
