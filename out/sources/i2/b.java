package i2;

import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u0013\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\rJ\u0015\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\b!\u0010\rJ%\u0010$\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b$\u0010\nJ\u0015\u0010%\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0017¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b'\u0010\u001cJ\u0015\u0010)\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\b+\u0010,R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020(0-8\u0006¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b/\u00100R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020(0-8\u0006¢\u0006\f\n\u0004\b\u0016\u0010.\u001a\u0004\b#\u00100R\u0017\u00106\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u00105R\u001a\u00109\u001a\b\u0012\u0004\u0012\u0002070-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00108R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u0002070-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00108¨\u0006;"}, d2 = {"Li2/b;", "", "<init>", "()V", "", "x", "y", "z", "", "d", "(DDD)I", "rgbComponent", "f", "(D)I", "min", "max", "input", "e", "(III)I", "red", "green", "blue", "c", "", "m", "(F)F", "argb", "p", "(I)F", "k", "num", "n", "lstar", "b", "r", "g", "a", "j", "(F)I", "l", "", "o", "(I)[F", "q", "(D)D", "", "[[F", "i", "()[[F", "XYZ_TO_CAM16RGB", "CAM16RGB_TO_XYZ", "[F", "h", "()[F", "WHITE_POINT_D65", "", "[[D", "SRGB_TO_XYZ", "XYZ_TO_SRGB", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f88366a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float[][] XYZ_TO_CAM16RGB = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float[][] CAM16RGB_TO_XYZ = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float[] WHITE_POINT_D65 = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final double[][] SRGB_TO_XYZ = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final double[][] XYZ_TO_SRGB = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f88372g = 8;

    private b() {
    }

    private final int c(int red, int green, int blue) {
        return ((red & GF2Field.MASK) << 16) | (-16777216) | ((green & GF2Field.MASK) << 8) | (blue & GF2Field.MASK);
    }

    private final int d(double x15, double y15, double z15) {
        double[][] dArr = XYZ_TO_SRGB;
        double[] dArr2 = dArr[0];
        double d15 = (dArr2[0] * x15) + (dArr2[1] * y15) + (dArr2[2] * z15);
        double[] dArr3 = dArr[1];
        double d16 = (dArr3[0] * x15) + (dArr3[1] * y15) + (dArr3[2] * z15);
        double[] dArr4 = dArr[2];
        return c(f(d15), f(d16), f((dArr4[0] * x15) + (dArr4[1] * y15) + (dArr4[2] * z15)));
    }

    private final int e(int min, int max, int input) {
        if (input < min) {
            return min;
        }
        return input > max ? max : input;
    }

    private final int f(double rgbComponent) {
        double d15 = rgbComponent / 100.0d;
        return e(0, GF2Field.MASK, (int) Math.round((d15 <= 0.0031308d ? d15 * 12.92d : (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d));
    }

    private final float k(int rgbComponent) {
        float f15 = rgbComponent / 255.0f;
        return (f15 <= 0.04045f ? f15 / 12.92f : (float) Math.pow((f15 + 0.055f) / 1.055f, 2.4f)) * 100.0f;
    }

    private final float m(float y15) {
        float f15 = y15 / 100.0f;
        return f15 <= 0.008856452f ? f15 * 903.2963f : (((float) Math.cbrt(f15)) * 116.0f) - 16.0f;
    }

    private final float p(int argb) {
        float fK = k((argb >> 16) & GF2Field.MASK);
        float fK2 = k((argb >> 8) & GF2Field.MASK);
        float fK3 = k(argb & GF2Field.MASK);
        double[] dArr = SRGB_TO_XYZ[1];
        return (float) ((((double) fK) * dArr[0]) + (((double) fK2) * dArr[1]) + (((double) fK3) * dArr[2]));
    }

    public final int a(double r15, double g15, double b15) {
        return c(f(r15), f(g15), f(b15));
    }

    public final int b(double lstar) {
        double d15 = (lstar + 16.0d) / 116.0d;
        double d16 = lstar > 8.0d ? d15 * d15 * d15 : lstar / 903.2962962962963d;
        double d17 = d15 * d15 * d15;
        boolean z15 = d17 > 0.008856451679035631d;
        double d18 = z15 ? d17 : lstar / 903.2962962962963d;
        if (!z15) {
            d17 = lstar / 903.2962962962963d;
        }
        float[] fArr = WHITE_POINT_D65;
        return d(d18 * ((double) fArr[0]), d16 * ((double) fArr[1]), d17 * ((double) fArr[2]));
    }

    public final float[][] g() {
        return CAM16RGB_TO_XYZ;
    }

    public final float[] h() {
        return WHITE_POINT_D65;
    }

    public final float[][] i() {
        return XYZ_TO_CAM16RGB;
    }

    public final int j(float lstar) {
        if (lstar < 1.0f) {
            return -16777216;
        }
        if (lstar > 99.0f) {
            return -1;
        }
        float f15 = (lstar + 16.0f) / 116.0f;
        float f16 = lstar > 8.0f ? f15 * f15 * f15 : lstar / 903.2963f;
        float f17 = f15 * f15 * f15;
        boolean z15 = f17 > 0.008856452f;
        float f18 = z15 ? f17 : ((f15 * 116.0f) - 16.0f) / 903.2963f;
        if (!z15) {
            f17 = ((f15 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = WHITE_POINT_D65;
        return x5.c.b(f18 * fArr[0], f16 * fArr[1], f17 * fArr[2]);
    }

    public final float l(int argb) {
        return m(p(argb));
    }

    public final int n(double num) {
        if (num < 0.0d) {
            return -1;
        }
        return num == 0.0d ? 0 : 1;
    }

    public final float[] o(int argb) {
        float fK = k((argb >> 16) & GF2Field.MASK);
        float fK2 = k((argb >> 8) & GF2Field.MASK);
        float fK3 = k(argb & GF2Field.MASK);
        double[][] dArr = SRGB_TO_XYZ;
        double d15 = fK;
        double[] dArr2 = dArr[0];
        double d16 = fK2;
        double d17 = fK3;
        double d18 = (dArr2[0] * d15) + (dArr2[1] * d16) + (dArr2[2] * d17);
        double[] dArr3 = dArr[1];
        double d19 = (dArr3[0] * d15) + (dArr3[1] * d16) + (dArr3[2] * d17);
        double[] dArr4 = dArr[2];
        return new float[]{(float) d18, (float) d19, (float) ((d15 * dArr4[0]) + (d16 * dArr4[1]) + (d17 * dArr4[2]))};
    }

    public final double q(double lstar) {
        return (lstar > 8.0d ? Math.pow((lstar + 16.0d) / 116.0d, 3.0d) : lstar / 903.2962962962963d) * 100.0d;
    }
}
