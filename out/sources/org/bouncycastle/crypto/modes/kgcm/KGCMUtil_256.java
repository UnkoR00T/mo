package org.bouncycastle.crypto.modes.kgcm;

import org.bouncycastle.math.raw.Interleave;

/* JADX INFO: loaded from: classes5.dex */
public class KGCMUtil_256 {
    public static final int SIZE = 4;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void copy(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static boolean equal(long[] jArr, long[] jArr2) {
        return ((jArr2[3] ^ jArr[3]) | (((jArr[0] ^ jArr2[0]) | (jArr[1] ^ jArr2[1])) | (jArr[2] ^ jArr2[2]))) == 0;
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        char c15;
        char c16;
        long j15;
        int i15 = 0;
        long j16 = jArr[0];
        char c17 = 1;
        long j17 = jArr[1];
        char c18 = 2;
        long j18 = jArr[2];
        char c19 = 3;
        long j19 = jArr[3];
        long j25 = jArr2[0];
        long j26 = jArr2[1];
        long j27 = jArr2[2];
        long j28 = jArr2[3];
        long j29 = 0;
        long j35 = 0;
        long j36 = 0;
        long j37 = 0;
        long j38 = 0;
        while (true) {
            c15 = c17;
            c16 = c18;
            j15 = j18;
            if (i15 >= 64) {
                break;
            }
            long j39 = -(j16 & 1);
            j16 >>>= c15;
            j29 ^= j25 & j39;
            char c25 = c19;
            long j45 = -(j17 & 1);
            j17 >>>= c15;
            j35 = (j35 ^ (j26 & j39)) ^ (j25 & j45);
            j36 = (j36 ^ (j27 & j39)) ^ (j26 & j45);
            j37 = (j37 ^ (j28 & j39)) ^ (j27 & j45);
            j38 ^= j28 & j45;
            long j46 = j28 >> 63;
            j28 = (j28 << c15) | (j27 >>> 63);
            j27 = (j27 << c15) | (j26 >>> 63);
            j26 = (j25 >>> 63) | (j26 << c15);
            j25 = (j25 << c15) ^ (j46 & 1061);
            i15++;
            c19 = c25;
            c17 = c15;
            c18 = c16;
            j18 = j15;
            j19 = j19;
        }
        char c26 = c19;
        long j47 = j19;
        char c27 = '>';
        long j48 = (((j28 >>> 62) ^ j25) ^ (j28 >>> 59)) ^ (j28 >>> 54);
        long j49 = ((j28 ^ (j28 << c16)) ^ (j28 << 5)) ^ (j28 << 10);
        int i16 = 0;
        while (i16 < 64) {
            long j55 = -(j15 & 1);
            j15 >>>= c15;
            j29 ^= j49 & j55;
            char c28 = c27;
            long j56 = j48;
            long j57 = -(j47 & 1);
            j47 >>>= c15;
            long j58 = (j35 ^ (j48 & j55)) ^ (j49 & j57);
            j36 = (j36 ^ (j26 & j55)) ^ (j56 & j57);
            j37 = (j37 ^ (j27 & j55)) ^ (j26 & j57);
            j38 ^= j27 & j57;
            long j59 = j27 >> 63;
            j27 = (j27 << c15) | (j26 >>> 63);
            j26 = (j56 >>> 63) | (j26 << c15);
            long j65 = (j56 << c15) | (j49 >>> 63);
            j49 = (j49 << c15) ^ (j59 & 1061);
            i16++;
            c27 = c28;
            j48 = j65;
            j35 = j58;
        }
        jArr3[0] = j29 ^ (((j38 ^ (j38 << c16)) ^ (j38 << 5)) ^ (j38 << 10));
        jArr3[c15] = j35 ^ (((j38 >>> c27) ^ (j38 >>> 59)) ^ (j38 >>> 54));
        jArr3[c16] = j36;
        jArr3[c26] = j37;
    }

    public static void multiplyX(long[] jArr, long[] jArr2) {
        long j15 = jArr[0];
        long j16 = jArr[1];
        long j17 = jArr[2];
        long j18 = jArr[3];
        jArr2[0] = ((j18 >> 63) & 1061) ^ (j15 << 1);
        jArr2[1] = (j15 >>> 63) | (j16 << 1);
        jArr2[2] = (j17 << 1) | (j16 >>> 63);
        jArr2[3] = (j18 << 1) | (j17 >>> 63);
    }

    public static void multiplyX8(long[] jArr, long[] jArr2) {
        long j15 = jArr[0];
        long j16 = jArr[1];
        long j17 = jArr[2];
        long j18 = jArr[3];
        long j19 = j18 >>> 56;
        jArr2[0] = ((((j15 << 8) ^ j19) ^ (j19 << 2)) ^ (j19 << 5)) ^ (j19 << 10);
        jArr2[1] = (j15 >>> 56) | (j16 << 8);
        jArr2[2] = (j17 << 8) | (j16 >>> 56);
        jArr2[3] = (j18 << 8) | (j17 >>> 56);
    }

    public static void one(long[] jArr) {
        jArr[0] = 1;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
    }

    public static void square(long[] jArr, long[] jArr2) {
        int i15 = 8;
        long[] jArr3 = new long[8];
        for (int i16 = 0; i16 < 4; i16++) {
            Interleave.expand64To128(jArr[i16], jArr3, i16 << 1);
        }
        while (true) {
            int i17 = i15 - 1;
            if (i17 < 4) {
                copy(jArr3, jArr2);
                return;
            }
            long j15 = jArr3[i17];
            int i18 = i15 - 5;
            jArr3[i18] = jArr3[i18] ^ ((((j15 << 2) ^ j15) ^ (j15 << 5)) ^ (j15 << 10));
            int i19 = i15 - 4;
            jArr3[i19] = ((j15 >>> 54) ^ ((j15 >>> 62) ^ (j15 >>> 59))) ^ jArr3[i19];
            i15 = i17;
        }
    }

    public static void x(long[] jArr) {
        jArr[0] = 2;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
    }

    public static void zero(long[] jArr) {
        jArr[0] = 0;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
    }
}
