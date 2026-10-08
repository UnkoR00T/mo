package w5;

import android.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final float[][] f210231a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final float[][] f210232b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final float[] f210233c = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final float[][] f210234d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    static int a(float f15) {
        if (f15 < 1.0f) {
            return -16777216;
        }
        if (f15 > 99.0f) {
            return -1;
        }
        float f16 = (f15 + 16.0f) / 116.0f;
        float f17 = f15 > 8.0f ? f16 * f16 * f16 : f15 / 903.2963f;
        float f18 = f16 * f16 * f16;
        boolean z15 = f18 > 0.008856452f;
        float f19 = z15 ? f18 : ((f16 * 116.0f) - 16.0f) / 903.2963f;
        if (!z15) {
            f18 = ((f16 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f210233c;
        return x5.c.b(f19 * fArr[0], f17 * fArr[1], f18 * fArr[2]);
    }

    static float b(int i15) {
        return c(g(i15));
    }

    static float c(float f15) {
        float f16 = f15 / 100.0f;
        return f16 <= 0.008856452f ? f16 * 903.2963f : (((float) Math.cbrt(f16)) * 116.0f) - 16.0f;
    }

    static float d(float f15, float f16, float f17) {
        return f15 + ((f16 - f15) * f17);
    }

    static float e(int i15) {
        float f15 = i15 / 255.0f;
        return (f15 <= 0.04045f ? f15 / 12.92f : (float) Math.pow((f15 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    static void f(int i15, float[] fArr) {
        float fE = e(Color.red(i15));
        float fE2 = e(Color.green(i15));
        float fE3 = e(Color.blue(i15));
        float[][] fArr2 = f210234d;
        float[] fArr3 = fArr2[0];
        fArr[0] = (fArr3[0] * fE) + (fArr3[1] * fE2) + (fArr3[2] * fE3);
        float[] fArr4 = fArr2[1];
        fArr[1] = (fArr4[0] * fE) + (fArr4[1] * fE2) + (fArr4[2] * fE3);
        float[] fArr5 = fArr2[2];
        fArr[2] = (fE * fArr5[0]) + (fE2 * fArr5[1]) + (fE3 * fArr5[2]);
    }

    static float g(int i15) {
        float fE = e(Color.red(i15));
        float fE2 = e(Color.green(i15));
        float fE3 = e(Color.blue(i15));
        float[] fArr = f210234d[1];
        return (fE * fArr[0]) + (fE2 * fArr[1]) + (fE3 * fArr[2]);
    }

    static float h(float f15) {
        return (f15 > 8.0f ? (float) Math.pow((((double) f15) + 16.0d) / 116.0d, 3.0d) : f15 / 903.2963f) * 100.0f;
    }
}
