package ck;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes4.dex */
final class e {
    static void a(boolean z15, double d15, RoundingMode roundingMode) {
        if (z15) {
            return;
        }
        throw new ArithmeticException("rounded value is out of range for input " + d15 + " and rounding mode " + roundingMode);
    }

    static void b(boolean z15, String str, int i15, int i16) {
        if (z15) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + i15 + ", " + i16 + ")");
    }

    static void c(boolean z15, String str, long j15, long j16) {
        if (z15) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j15 + ", " + j16 + ")");
    }

    static double d(String str, double d15) {
        if (d15 >= 0.0d) {
            return d15;
        }
        throw new IllegalArgumentException(str + " (" + d15 + ") must be >= 0");
    }

    static long e(String str, long j15) {
        if (j15 >= 0) {
            return j15;
        }
        throw new IllegalArgumentException(str + " (" + j15 + ") must be >= 0");
    }

    static int f(String str, int i15) {
        if (i15 > 0) {
            return i15;
        }
        throw new IllegalArgumentException(str + " (" + i15 + ") must be > 0");
    }

    static void g(boolean z15) {
        if (!z15) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
