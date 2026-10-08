package fj;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static boolean a(float[] fArr) {
        if (fArr.length <= 1) {
            return true;
        }
        float f15 = fArr[0];
        for (int i15 = 1; i15 < fArr.length; i15++) {
            if (fArr[i15] != f15) {
                return false;
            }
        }
        return true;
    }

    public static float b(float f15, float f16, float f17, float f18) {
        return (float) Math.hypot(f17 - f15, f18 - f16);
    }

    public static float c(float f15, float f16, float f17, float f18, float f19, float f25) {
        return e(b(f15, f16, f17, f18), b(f15, f16, f19, f18), b(f15, f16, f19, f25), b(f15, f16, f17, f25));
    }

    public static float d(float f15, float f16, float f17) {
        return ((1.0f - f17) * f15) + (f17 * f16);
    }

    private static float e(float f15, float f16, float f17, float f18) {
        if (f15 > f16 && f15 > f17 && f15 > f18) {
            return f15;
        }
        if (f16 <= f17 || f16 <= f18) {
            return f17 > f18 ? f17 : f18;
        }
        return f16;
    }
}
