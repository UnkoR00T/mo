package org.bouncycastle.util;

/* JADX INFO: loaded from: classes5.dex */
public class Longs {
    public static final int BYTES = 8;
    public static final int SIZE = 64;

    public static long highestOneBit(long j15) {
        return Long.highestOneBit(j15);
    }

    public static long lowestOneBit(long j15) {
        return Long.lowestOneBit(j15);
    }

    public static int numberOfLeadingZeros(long j15) {
        return Long.numberOfLeadingZeros(j15);
    }

    public static int numberOfTrailingZeros(long j15) {
        return Long.numberOfTrailingZeros(j15);
    }

    public static long reverse(long j15) {
        return Long.reverse(j15);
    }

    public static long reverseBytes(long j15) {
        return Long.reverseBytes(j15);
    }

    public static long rotateLeft(long j15, int i15) {
        return Long.rotateLeft(j15, i15);
    }

    public static long rotateRight(long j15, int i15) {
        return Long.rotateRight(j15, i15);
    }

    public static Long valueOf(long j15) {
        return Long.valueOf(j15);
    }

    public static void xorTo(int i15, long[] jArr, int i16, long[] jArr2, int i17) {
        for (int i18 = 0; i18 < i15; i18++) {
            int i19 = i17 + i18;
            jArr2[i19] = jArr2[i19] ^ jArr[i16 + i18];
        }
    }
}
