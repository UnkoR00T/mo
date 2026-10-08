package n3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a7\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\n\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a9\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001aA\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"", "p0", "p1", "p2", "p3", "t", "d", "(FFFFF)F", "c", "(FFF)F", "e", "(FFFF)F", "", "roots", "", "index", "f", "(FFF[FI)I", "p0y", "p1y", "p2y", "p3y", "Lr0/g;", "b", "(FFFF[FI)J", "r", "g", "(F[FI)I", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class z0 {
    public static final long b(float f15, float f16, float f17, float f18, float[] fArr, int i15) {
        float f19 = (f16 - f15) * 3.0f;
        float f25 = (f17 - f16) * 3.0f;
        float f26 = (f18 - f17) * 3.0f;
        int iF = f(f19, f25, f26, fArr, i15);
        float f27 = (f25 - f19) * 2.0f;
        int iG = iF + g((-f27) / (((f26 - f25) * 2.0f) - f27), fArr, i15 + iF);
        float fMin = Math.min(f15, f18);
        float fMax = Math.max(f15, f18);
        for (int i16 = 0; i16 < iG; i16++) {
            float fD = d(f15, f16, f17, f18, fArr[i16]);
            fMin = Math.min(fMin, fD);
            fMax = Math.max(fMax, fD);
        }
        return r0.g.b(fMin, fMax);
    }

    public static final float c(float f15, float f16, float f17) {
        return ((((((f15 - f16) + 0.33333334f) * f17) + (f16 - (2.0f * f15))) * f17) + f15) * 3.0f * f17;
    }

    private static final float d(float f15, float f16, float f17, float f18, float f19) {
        float f25 = (f18 + ((f16 - f17) * 3.0f)) - f15;
        return (((((f25 * f19) + (((f17 - (2.0f * f16)) + f15) * 3.0f)) * f19) + ((f16 - f15) * 3.0f)) * f19) + f15;
    }

    public static final float e(float f15, float f16, float f17, float f18) {
        float f19;
        float f25;
        double d15 = f15;
        double d16 = ((d15 - (((double) f16) * 2.0d)) + ((double) f17)) * 3.0d;
        double d17 = ((double) (f16 - f15)) * 3.0d;
        double d18 = ((double) (-f15)) + (((double) (f16 - f17)) * 3.0d) + ((double) f18);
        if (Math.abs(d18 - 0.0d) < 1.0E-7d) {
            if (Math.abs(d16 - 0.0d) < 1.0E-7d) {
                if (Math.abs(d17 - 0.0d) < 1.0E-7d) {
                    return Float.NaN;
                }
                float f26 = (float) ((-d15) / d17);
                f19 = f26 >= 0.0f ? f26 : 0.0f;
                f25 = f19 <= 1.0f ? f19 : 1.0f;
                if (Math.abs(f25 - f26) > 1.05E-6f) {
                    return Float.NaN;
                }
                return f25;
            }
            double dSqrt = Math.sqrt((d17 * d17) - ((4.0d * d16) * d15));
            double d19 = d16 * 2.0d;
            float f27 = (float) ((dSqrt - d17) / d19);
            float f28 = f27 < 0.0f ? 0.0f : f27;
            if (f28 > 1.0f) {
                f28 = 1.0f;
            }
            if (Math.abs(f28 - f27) > 1.05E-6f) {
                f28 = Float.NaN;
            }
            if (!Float.isNaN(f28)) {
                return f28;
            }
            float f29 = (float) (((-d17) - dSqrt) / d19);
            f19 = f29 >= 0.0f ? f29 : 0.0f;
            f25 = f19 <= 1.0f ? f19 : 1.0f;
            if (Math.abs(f25 - f29) > 1.05E-6f) {
                return Float.NaN;
            }
            return f25;
        }
        double d25 = d16 / d18;
        double d26 = d17 / d18;
        double d27 = d15 / d18;
        double d28 = ((d26 * 3.0d) - (d25 * d25)) / 9.0d;
        double d29 = (((((2.0d * d25) * d25) * d25) - ((9.0d * d25) * d26)) + (d27 * 27.0d)) / 54.0d;
        double d35 = d28 * d28 * d28;
        double d36 = (d29 * d29) + d35;
        double d37 = d25 / 3.0d;
        if (d36 >= 0.0d) {
            if (d36 != 0.0d) {
                double dSqrt2 = Math.sqrt(d36);
                float fA = (float) (((double) (e5.c.a((float) ((-d29) + dSqrt2)) - e5.c.a((float) (d29 + dSqrt2)))) - d37);
                f19 = fA >= 0.0f ? fA : 0.0f;
                f25 = f19 <= 1.0f ? f19 : 1.0f;
                if (Math.abs(f25 - fA) > 1.05E-6f) {
                    return Float.NaN;
                }
                return f25;
            }
            float f35 = -e5.c.a((float) d29);
            float f36 = (float) d37;
            float f37 = (2.0f * f35) - f36;
            float f38 = f37 < 0.0f ? 0.0f : f37;
            if (f38 > 1.0f) {
                f38 = 1.0f;
            }
            if (Math.abs(f38 - f37) > 1.05E-6f) {
                f38 = Float.NaN;
            }
            if (!Float.isNaN(f38)) {
                return f38;
            }
            float f39 = (-f35) - f36;
            f19 = f39 >= 0.0f ? f39 : 0.0f;
            f25 = f19 <= 1.0f ? f19 : 1.0f;
            if (Math.abs(f25 - f39) > 1.05E-6f) {
                return Float.NaN;
            }
            return f25;
        }
        double dSqrt3 = Math.sqrt(-d35);
        double d38 = (-d29) / dSqrt3;
        if (d38 < -1.0d) {
            d38 = -1.0d;
        }
        if (d38 > 1.0d) {
            d38 = 1.0d;
        }
        double dAcos = Math.acos(d38);
        double dA = e5.c.a((float) dSqrt3) * 2.0f;
        float fCos = (float) ((Math.cos(dAcos / 3.0d) * dA) - d37);
        float f45 = fCos < 0.0f ? 0.0f : fCos;
        if (f45 > 1.0f) {
            f45 = 1.0f;
        }
        if (Math.abs(f45 - fCos) > 1.05E-6f) {
            f45 = Float.NaN;
        }
        if (!Float.isNaN(f45)) {
            return f45;
        }
        float fCos2 = (float) ((Math.cos((6.283185307179586d + dAcos) / 3.0d) * dA) - d37);
        float f46 = fCos2 < 0.0f ? 0.0f : fCos2;
        if (f46 > 1.0f) {
            f46 = 1.0f;
        }
        if (Math.abs(f46 - fCos2) > 1.05E-6f) {
            f46 = Float.NaN;
        }
        if (!Float.isNaN(f46)) {
            return f46;
        }
        float fCos3 = (float) ((dA * Math.cos((dAcos + 12.566370614359172d) / 3.0d)) - d37);
        f19 = fCos3 >= 0.0f ? fCos3 : 0.0f;
        f25 = f19 <= 1.0f ? f19 : 1.0f;
        if (Math.abs(f25 - fCos3) > 1.05E-6f) {
            return Float.NaN;
        }
        return f25;
    }

    private static final int f(float f15, float f16, float f17, float[] fArr, int i15) {
        double d15 = f15;
        double d16 = f16;
        double d17 = f17;
        double d18 = d16 * 2.0d;
        double d19 = (d15 - d18) + d17;
        if (d19 == 0.0d) {
            if (d16 == d17) {
                return 0;
            }
            return g((float) ((d18 - d17) / (d18 - (d17 * 2.0d))), fArr, i15);
        }
        double d25 = -Math.sqrt((d16 * d16) - (d17 * d15));
        double d26 = (-d15) + d16;
        int iG = g((float) ((-(d25 + d26)) / d19), fArr, i15);
        int iG2 = iG + g((float) ((d25 - d26) / d19), fArr, i15 + iG);
        if (iG2 <= 1) {
            return iG2;
        }
        float f18 = fArr[i15];
        int i16 = i15 + 1;
        float f19 = fArr[i16];
        if (f18 <= f19) {
            return f18 == f19 ? iG2 - 1 : iG2;
        }
        fArr[i15] = f19;
        fArr[i16] = f18;
        return iG2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(float f15, float[] fArr, int i15) {
        float f16 = f15 >= 0.0f ? f15 : 0.0f;
        if (f16 > 1.0f) {
            f16 = 1.0f;
        }
        if (Math.abs(f16 - f15) > 1.05E-6f) {
            f16 = Float.NaN;
        }
        fArr[i15] = f16;
        return !Float.isNaN(f16) ? 1 : 0;
    }
}
