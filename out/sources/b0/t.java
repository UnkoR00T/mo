package b0;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import java.util.HashMap;
import java.util.Map;
import o.j2;
import v.n3;

/* JADX INFO: loaded from: classes.dex */
public class t {
    public static Map<j2, Rect> a(Rect rect, boolean z15, Rational rational, int i15, int i16, int i17, Map<j2, n3> map) {
        i6.i.b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        HashMap map2 = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry<j2, n3> entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, entry.getValue().f().getWidth(), entry.getValue().f().getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            map2.put(entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        RectF rectFG = g(rectF2, f0.b.g(i15, rational), i16, z15, i17, i15);
        HashMap map3 = new HashMap();
        RectF rectF5 = new RectF();
        Matrix matrix2 = new Matrix();
        for (Map.Entry entry2 : map2.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix2);
            matrix2.mapRect(rectF5, rectFG);
            Rect rect2 = new Rect();
            rectF5.round(rect2);
            map3.put((j2) entry2.getKey(), rect2);
        }
        return map3;
    }

    private static RectF b(boolean z15, int i15, RectF rectF, RectF rectF2) {
        boolean z16 = false;
        boolean z17 = i15 == 0 && !z15;
        boolean z18 = i15 == 90 && z15;
        if (z17 || z18) {
            return rectF2;
        }
        boolean z19 = i15 == 0 && z15;
        boolean z25 = i15 == 270 && !z15;
        if (z19 || z25) {
            return c(rectF2, rectF.centerX());
        }
        boolean z26 = i15 == 90 && !z15;
        boolean z27 = i15 == 180 && z15;
        if (z26 || z27) {
            return d(rectF2, rectF.centerY());
        }
        boolean z28 = i15 == 180 && !z15;
        if (i15 == 270 && z15) {
            z16 = true;
        }
        if (z28 || z16) {
            return c(d(rectF2, rectF.centerY()), rectF.centerX());
        }
        throw new IllegalArgumentException("Invalid argument: mirrored " + z15 + " rotation " + i15);
    }

    private static RectF c(RectF rectF, float f15) {
        return new RectF(e(rectF.right, f15), rectF.top, e(rectF.left, f15), rectF.bottom);
    }

    private static RectF d(RectF rectF, float f15) {
        return new RectF(rectF.left, f(rectF.bottom, f15), rectF.right, f(rectF.top, f15));
    }

    private static float e(float f15, float f16) {
        return (f16 + f16) - f15;
    }

    private static float f(float f15, float f16) {
        return (f16 + f16) - f15;
    }

    @SuppressLint({"SwitchIntDef"})
    public static RectF g(RectF rectF, Rational rational, int i15, boolean z15, int i16, int i17) {
        if (i15 == 3) {
            return rectF;
        }
        Matrix matrix = new Matrix();
        RectF rectF2 = new RectF(0.0f, 0.0f, rational.getNumerator(), rational.getDenominator());
        if (i15 == 0) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.START);
        } else if (i15 == 1) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.CENTER);
        } else {
            if (i15 != 2) {
                throw new IllegalStateException("Unexpected scale type: " + i15);
            }
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.END);
        }
        RectF rectF3 = new RectF();
        matrix.mapRect(rectF3, rectF2);
        return b(h(z15, i16), i17, rectF, rectF3);
    }

    private static boolean h(boolean z15, int i15) {
        return z15 ^ (i15 == 1);
    }
}
