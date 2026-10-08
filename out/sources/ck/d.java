package ck;

import java.math.RoundingMode;
import zj.p;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final byte[] f27487a = {19, 18, 18, 18, 18, 17, 17, 17, 16, 16, 16, 15, 15, 15, 15, 14, 14, 14, 13, 13, 13, 12, 12, 12, 12, 11, 11, 11, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final long[] f27488b = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final long[] f27489c = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final long[] f27490d = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int[] f27491e = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, 265, 206, 169, 143, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int[] f27492f = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, 419, 287, 214, 169, 139, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long[][] f27493g = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27494a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f27494a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27494a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27494a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27494a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27494a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27494a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27494a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27494a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static long a(long j15, long j16) {
        long j17 = j15 + j16;
        e.c(((j15 ^ j16) < 0) | ((j15 ^ j17) >= 0), "checkedAdd", j15, j16);
        return j17;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long b(long j15, long j16, RoundingMode roundingMode) {
        p.q(roundingMode);
        long j17 = j15 / j16;
        long j18 = j15 - (j16 * j17);
        if (j18 == 0) {
            return j17;
        }
        int i15 = ((int) ((j15 ^ j16) >> 63)) | 1;
        switch (a.f27494a[roundingMode.ordinal()]) {
            case 1:
                e.g(j18 == 0);
                return j17;
            case 2:
                return j17;
            case 3:
                if (i15 >= 0) {
                    return j17;
                }
                return j17 + ((long) i15);
            case 4:
                return j17 + ((long) i15);
            case 5:
                if (i15 <= 0) {
                    return j17;
                }
                return j17 + ((long) i15);
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j18);
                long jAbs2 = jAbs - (Math.abs(j16) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j17) == 0)) {
                        return j17;
                    }
                } else if (jAbs2 <= 0) {
                    return j17;
                }
                return j17 + ((long) i15);
            default:
                throw new AssertionError();
        }
    }

    public static long c(long j15, long j16) {
        e.e("a", j15);
        e.e("b", j16);
        if (j15 == 0) {
            return j16;
        }
        if (j16 == 0) {
            return j15;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j15);
        long jNumberOfTrailingZeros = j15 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j16);
        long j17 = j16 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j17) {
            long j18 = jNumberOfTrailingZeros - j17;
            long j19 = (j18 >> 63) & j18;
            long j25 = (j18 - j19) - j19;
            j17 += j19;
            jNumberOfTrailingZeros = j25 >> Long.numberOfTrailingZeros(j25);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static long d(long j15, long j16) {
        long j17 = j15 + j16;
        return (((j16 ^ j15) > 0L ? 1 : ((j16 ^ j15) == 0L ? 0 : -1)) < 0) | ((j15 ^ j17) >= 0) ? j17 : ((j17 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    public static long e(long j15, long j16) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j15) + Long.numberOfLeadingZeros(~j15) + Long.numberOfLeadingZeros(j16) + Long.numberOfLeadingZeros(~j16);
        if (iNumberOfLeadingZeros > 65) {
            return j15 * j16;
        }
        long j17 = ((j15 ^ j16) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j16 == Long.MIN_VALUE) & (j15 < 0)))) {
            long j18 = j15 * j16;
            if (j15 == 0 || j18 / j15 == j16) {
                return j18;
            }
        }
        return j17;
    }

    public static long f(long j15, long j16) {
        long j17 = j15 - j16;
        return (((j16 ^ j15) > 0L ? 1 : ((j16 ^ j15) == 0L ? 0 : -1)) >= 0) | ((j15 ^ j17) >= 0) ? j17 : ((j17 >>> 63) ^ 1) + Long.MAX_VALUE;
    }
}
