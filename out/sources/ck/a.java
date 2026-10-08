package ck;

import java.math.RoundingMode;
import zj.p;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f27478a = Math.log(2.0d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final double[] f27479b = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    /* JADX INFO: renamed from: ck.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0714a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27480a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f27480a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27480a[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27480a[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27480a[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27480a[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27480a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27480a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27480a[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static boolean a(double d15, double d16, double d17) {
        e.d("tolerance", d17);
        if (Math.copySign(d15 - d16, 1.0d) <= d17 || d15 == d16) {
            return true;
        }
        return Double.isNaN(d15) && Double.isNaN(d16);
    }

    public static boolean b(double d15) {
        if (b.b(d15)) {
            return d15 == 0.0d || 52 - Long.numberOfTrailingZeros(b.a(d15)) <= Math.getExponent(d15);
        }
        return false;
    }

    public static boolean c(double d15) {
        if (d15 > 0.0d && b.b(d15)) {
            long jA = b.a(d15);
            if ((jA & (jA - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public static int d(double d15, RoundingMode roundingMode) {
        boolean zC;
        boolean z15 = false;
        p.e(d15 > 0.0d && b.b(d15), "x must be positive and finite");
        int exponent = Math.getExponent(d15);
        if (!b.c(d15)) {
            return d(d15 * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (C0714a.f27480a[roundingMode.ordinal()]) {
            case 1:
                e.g(c(d15));
                if (z15) {
                    return exponent + 1;
                }
                return exponent;
            case 2:
                if (z15) {
                    return exponent + 1;
                }
                return exponent;
            case 3:
                z15 = !c(d15);
                if (z15) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                z15 = exponent < 0;
                zC = c(d15);
                z15 &= !zC;
                if (z15) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                z15 = exponent >= 0;
                zC = c(d15);
                z15 &= !zC;
                if (z15) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double d16 = b.d(d15);
                if (d16 * d16 > 2.0d) {
                    z15 = true;
                }
                if (z15) {
                    return exponent + 1;
                }
                return exponent;
            default:
                throw new AssertionError();
        }
    }

    static double e(double d15, RoundingMode roundingMode) {
        if (!b.b(d15)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (C0714a.f27480a[roundingMode.ordinal()]) {
            case 1:
                e.g(b(d15));
                return d15;
            case 2:
                return (d15 >= 0.0d || b(d15)) ? d15 : ((long) d15) - 1;
            case 3:
                return (d15 <= 0.0d || b(d15)) ? d15 : ((long) d15) + 1;
            case 4:
                return d15;
            case 5:
                if (b(d15)) {
                    return d15;
                }
                return ((long) d15) + ((long) (d15 > 0.0d ? 1 : -1));
            case 6:
                return Math.rint(d15);
            case 7:
                double dRint = Math.rint(d15);
                return Math.abs(d15 - dRint) == 0.5d ? d15 + Math.copySign(0.5d, d15) : dRint;
            case 8:
                double dRint2 = Math.rint(d15);
                return Math.abs(d15 - dRint2) == 0.5d ? d15 : dRint2;
            default:
                throw new AssertionError();
        }
    }

    public static long f(double d15, RoundingMode roundingMode) {
        double dE = e(d15, roundingMode);
        e.a(((-9.223372036854776E18d) - dE < 1.0d) & (dE < 9.223372036854776E18d), d15, roundingMode);
        return (long) dE;
    }
}
