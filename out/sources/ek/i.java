package ek;

import java.util.Arrays;
import zj.p;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final byte[] f51764a;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i15 = 0; i15 < 10; i15++) {
                bArr[i15 + 48] = (byte) i15;
            }
            for (int i16 = 0; i16 < 26; i16++) {
                byte b15 = (byte) (i16 + 10);
                bArr[i16 + 65] = b15;
                bArr[i16 + 97] = b15;
            }
            f51764a = bArr;
        }

        static int a(char c15) {
            if (c15 < 128) {
                return f51764a[c15];
            }
            return -1;
        }
    }

    private static int a(long j15) {
        int i15 = (int) j15;
        p.k(j15 == ((long) i15), "the total number of elements (%s) in the arrays must fit in an int", j15);
        return i15;
    }

    public static long[] b(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        long[] jArr3 = new long[a(length)];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    public static int c(long j15) {
        return (int) (j15 ^ (j15 >>> 32));
    }

    public static long d(long... jArr) {
        p.d(jArr.length > 0);
        long j15 = jArr[0];
        for (int i15 = 1; i15 < jArr.length; i15++) {
            long j16 = jArr[i15];
            if (j16 > j15) {
                j15 = j16;
            }
        }
        return j15;
    }

    public static Long e(String str, int i15) {
        if (((String) p.q(str)).isEmpty()) {
            return null;
        }
        if (i15 < 2 || i15 > 36) {
            throw new IllegalArgumentException("radix must be between MIN_RADIX and MAX_RADIX but was " + i15);
        }
        int i16 = str.charAt(0) == '-' ? 1 : 0;
        if (i16 == str.length()) {
            return null;
        }
        int i17 = i16 + 1;
        int iA = a.a(str.charAt(i16));
        if (iA < 0 || iA >= i15) {
            return null;
        }
        long j15 = -iA;
        long j16 = i15;
        long j17 = Long.MIN_VALUE / j16;
        while (i17 < str.length()) {
            int i18 = i17 + 1;
            int iA2 = a.a(str.charAt(i17));
            if (iA2 < 0 || iA2 >= i15 || j15 < j17) {
                return null;
            }
            long j18 = j15 * j16;
            long j19 = iA2;
            if (j18 < j19 - Long.MIN_VALUE) {
                return null;
            }
            j15 = j18 - j19;
            i17 = i18;
        }
        if (i16 != 0) {
            return Long.valueOf(j15);
        }
        if (j15 == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j15);
    }
}
