package ck;

import zj.p;

/* JADX INFO: loaded from: classes4.dex */
final class b {
    static long a(double d15) {
        p.e(b(d15), "not a normal value");
        int exponent = Math.getExponent(d15);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d15) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    static boolean b(double d15) {
        return Math.getExponent(d15) <= 1023;
    }

    static boolean c(double d15) {
        return Math.getExponent(d15) >= -1022;
    }

    static double d(double d15) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(d15) & 4503599627370495L) | 4607182418800017408L);
    }
}
