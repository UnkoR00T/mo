package org.bouncycastle.crypto.modes.kgcm;

import org.bouncycastle.math.raw.Interleave;

/* JADX INFO: loaded from: classes5.dex */
public class KGCMUtil_128 {
    public static final int SIZE = 2;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }

    public static void copy(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
    }

    public static boolean equal(long[] jArr, long[] jArr2) {
        return ((jArr2[1] ^ jArr[1]) | (jArr[0] ^ jArr2[0])) == 0;
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        int i15 = 0;
        long j15 = jArr[0];
        long j16 = jArr[1];
        long j17 = jArr2[0];
        long j18 = jArr2[1];
        long j19 = 0;
        long j25 = 0;
        long j26 = 0;
        while (i15 < 64) {
            long j27 = j15;
            int i16 = i15;
            long j28 = -(j27 & 1);
            j19 ^= j17 & j28;
            long j29 = (j28 & j18) ^ j26;
            long j35 = -(j16 & 1);
            j16 >>>= 1;
            long j36 = j29 ^ (j17 & j35);
            j25 ^= j35 & j18;
            long j37 = j18 >> 63;
            j18 = (j18 << 1) | (j17 >>> 63);
            j17 = (j17 << 1) ^ (j37 & 135);
            j26 = j36;
            i15 = i16 + 1;
            j15 = j27 >>> 1;
        }
        jArr3[0] = ((((j25 << 1) ^ j25) ^ (j25 << 2)) ^ (j25 << 7)) ^ j19;
        jArr3[1] = (((j25 >>> 63) ^ (j25 >>> 62)) ^ (j25 >>> 57)) ^ j26;
    }

    public static void multiplyX(long[] jArr, long[] jArr2) {
        long j15 = jArr[0];
        long j16 = jArr[1];
        jArr2[0] = ((j16 >> 63) & 135) ^ (j15 << 1);
        jArr2[1] = (j15 >>> 63) | (j16 << 1);
    }

    public static void multiplyX8(long[] jArr, long[] jArr2) {
        long j15 = jArr[0];
        long j16 = jArr[1];
        long j17 = j16 >>> 56;
        jArr2[0] = (j17 << 7) ^ ((((j15 << 8) ^ j17) ^ (j17 << 1)) ^ (j17 << 2));
        jArr2[1] = (j15 >>> 56) | (j16 << 8);
    }

    public static void one(long[] jArr) {
        jArr[0] = 1;
        jArr[1] = 0;
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[4];
        Interleave.expand64To128(jArr[0], jArr3, 0);
        Interleave.expand64To128(jArr[1], jArr3, 2);
        long j15 = jArr3[0];
        long j16 = jArr3[1];
        long j17 = jArr3[2];
        long j18 = jArr3[3];
        long j19 = j17 ^ ((j18 >>> 57) ^ ((j18 >>> 63) ^ (j18 >>> 62)));
        jArr2[0] = j15 ^ ((((j19 << 1) ^ j19) ^ (j19 << 2)) ^ (j19 << 7));
        jArr2[1] = (j16 ^ ((((j18 << 1) ^ j18) ^ (j18 << 2)) ^ (j18 << 7))) ^ ((j19 >>> 57) ^ ((j19 >>> 63) ^ (j19 >>> 62)));
    }

    public static void x(long[] jArr) {
        jArr[0] = 2;
        jArr[1] = 0;
    }

    public static void zero(long[] jArr) {
        jArr[0] = 0;
        jArr[1] = 0;
    }
}
