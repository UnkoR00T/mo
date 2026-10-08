package x5;

import android.graphics.Color;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<double[]> f216811a = new ThreadLocal<>();

    public static void a(int i15, int i16, int i17, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d15 = ((double) i15) / 255.0d;
        double dPow = d15 < 0.04045d ? d15 / 12.92d : Math.pow((d15 + 0.055d) / 1.055d, 2.4d);
        double d16 = ((double) i16) / 255.0d;
        double dPow2 = d16 < 0.04045d ? d16 / 12.92d : Math.pow((d16 + 0.055d) / 1.055d, 2.4d);
        double d17 = ((double) i17) / 255.0d;
        double dPow3 = d17 < 0.04045d ? d17 / 12.92d : Math.pow((d17 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * dPow) + (0.3576d * dPow2) + (0.1805d * dPow3)) * 100.0d;
        dArr[1] = ((0.2126d * dPow) + (0.7152d * dPow2) + (0.0722d * dPow3)) * 100.0d;
        dArr[2] = ((dPow * 0.0193d) + (dPow2 * 0.1192d) + (dPow3 * 0.9505d)) * 100.0d;
    }

    public static int b(double d15, double d16, double d17) {
        double d18 = (((3.2406d * d15) + ((-1.5372d) * d16)) + ((-0.4986d) * d17)) / 100.0d;
        double d19 = ((((-0.9689d) * d15) + (1.8758d * d16)) + (0.0415d * d17)) / 100.0d;
        double d25 = (((0.0557d * d15) + ((-0.204d) * d16)) + (1.057d * d17)) / 100.0d;
        return Color.rgb(i((int) Math.round((d18 > 0.0031308d ? (Math.pow(d18, 0.4166666666666667d) * 1.055d) - 0.055d : d18 * 12.92d) * 255.0d), 0, GF2Field.MASK), i((int) Math.round((d19 > 0.0031308d ? (Math.pow(d19, 0.4166666666666667d) * 1.055d) - 0.055d : d19 * 12.92d) * 255.0d), 0, GF2Field.MASK), i((int) Math.round((d25 > 0.0031308d ? (Math.pow(d25, 0.4166666666666667d) * 1.055d) - 0.055d : d25 * 12.92d) * 255.0d), 0, GF2Field.MASK));
    }

    public static int c(int i15, int i16, float f15) {
        float f16 = 1.0f - f15;
        return Color.argb((int) ((Color.alpha(i15) * f16) + (Color.alpha(i16) * f15)), (int) ((Color.red(i15) * f16) + (Color.red(i16) * f15)), (int) ((Color.green(i15) * f16) + (Color.green(i16) * f15)), (int) ((Color.blue(i15) * f16) + (Color.blue(i16) * f15)));
    }

    public static double d(int i15) {
        double[] dArrJ = j();
        e(i15, dArrJ);
        return dArrJ[1] / 100.0d;
    }

    public static void e(int i15, double[] dArr) {
        a(Color.red(i15), Color.green(i15), Color.blue(i15), dArr);
    }

    private static int f(int i15, int i16) {
        return 255 - (((255 - i16) * (255 - i15)) / GF2Field.MASK);
    }

    public static int g(int i15, int i16) {
        int iAlpha = Color.alpha(i16);
        int iAlpha2 = Color.alpha(i15);
        int iF = f(iAlpha2, iAlpha);
        return Color.argb(iF, h(Color.red(i15), iAlpha2, Color.red(i16), iAlpha, iF), h(Color.green(i15), iAlpha2, Color.green(i16), iAlpha, iF), h(Color.blue(i15), iAlpha2, Color.blue(i16), iAlpha, iF));
    }

    private static int h(int i15, int i16, int i17, int i18, int i19) {
        if (i19 == 0) {
            return 0;
        }
        return (((i15 * GF2Field.MASK) * i16) + ((i17 * i18) * (255 - i16))) / (i19 * GF2Field.MASK);
    }

    private static int i(int i15, int i16, int i17) {
        return i15 < i16 ? i16 : Math.min(i15, i17);
    }

    private static double[] j() {
        ThreadLocal<double[]> threadLocal = f216811a;
        double[] dArr = threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    public static int k(int i15, int i16) {
        if (i16 < 0 || i16 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i15 & 16777215) | (i16 << 24);
    }
}
