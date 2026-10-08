package ck;

import ek.g;
import java.math.RoundingMode;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import zj.p;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final byte[] f27481a = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int[] f27482b = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int[] f27483c = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f27484d = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static int[] f27485e = {Integer.MAX_VALUE, Integer.MAX_VALUE, PKIFailureInfo.notAuthorized, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27486a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f27486a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27486a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27486a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27486a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27486a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27486a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27486a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27486a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static int a(int i15, int i16) {
        long j15 = ((long) i15) + ((long) i16);
        int i17 = (int) j15;
        e.b(j15 == ((long) i17), "checkedAdd", i15, i16);
        return i17;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int b(int i15, int i16, RoundingMode roundingMode) {
        p.q(roundingMode);
        if (i16 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i17 = i15 / i16;
        int i18 = i15 - (i16 * i17);
        if (i18 == 0) {
            return i17;
        }
        int i19 = ((i15 ^ i16) >> 31) | 1;
        switch (a.f27486a[roundingMode.ordinal()]) {
            case 1:
                e.g(i18 == 0);
                return i17;
            case 2:
                return i17;
            case 3:
                if (i19 >= 0) {
                    return i17;
                }
                return i17 + i19;
            case 4:
                return i17 + i19;
            case 5:
                if (i19 <= 0) {
                    return i17;
                }
                return i17 + i19;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i18);
                int iAbs2 = iAbs - (Math.abs(i16) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i17 & 1) != 0))) {
                            return i17;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i17;
                }
                return i17 + i19;
            default:
                throw new AssertionError();
        }
    }

    public static boolean c(int i15) {
        return (i15 > 0) & ((i15 & (i15 + (-1))) == 0);
    }

    static int d(int i15, int i16) {
        return (~(~(i15 - i16))) >>> 31;
    }

    public static int e(int i15, RoundingMode roundingMode) {
        e.f("x", i15);
        switch (a.f27486a[roundingMode.ordinal()]) {
            case 1:
                e.g(c(i15));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i15 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i15);
                return (31 - iNumberOfLeadingZeros) + d((-1257966797) >>> iNumberOfLeadingZeros, i15);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i15);
    }

    public static int f(int i15, int i16) {
        return g.m(((long) i15) * ((long) i16));
    }
}
