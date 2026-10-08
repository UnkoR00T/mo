package org.bouncycastle.crypto.modes.kgcm;

import org.bouncycastle.math.raw.Interleave;

/* JADX INFO: loaded from: classes5.dex */
public class KGCMUtil_512 {
    public static final int SIZE = 8;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static void copy(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
        jArr2[5] = jArr[5];
        jArr2[6] = jArr[6];
        jArr2[7] = jArr[7];
    }

    public static boolean equal(long[] jArr, long[] jArr2) {
        return ((jArr2[7] ^ jArr[7]) | (((((((jArr[0] ^ jArr2[0]) | (jArr[1] ^ jArr2[1])) | (jArr[2] ^ jArr2[2])) | (jArr[3] ^ jArr2[3])) | (jArr[4] ^ jArr2[4])) | (jArr[5] ^ jArr2[5])) | (jArr[6] ^ jArr2[6]))) == 0;
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        int i15 = 0;
        long j15 = jArr2[0];
        char c15 = 1;
        long j16 = jArr2[1];
        char c16 = 2;
        long j17 = jArr2[2];
        char c17 = 3;
        long j18 = jArr2[3];
        long j19 = jArr2[4];
        long j25 = jArr2[5];
        long j26 = jArr2[6];
        long j27 = jArr2[7];
        long j28 = 0;
        long j29 = 0;
        long j35 = 0;
        long j36 = 0;
        long j37 = 0;
        long j38 = 0;
        long j39 = 0;
        long j45 = 0;
        long j46 = 0;
        while (true) {
            char c18 = c15;
            if (i15 >= 8) {
                char c19 = c16;
                jArr3[0] = j28 ^ (((j29 ^ (j29 << c19)) ^ (j29 << 5)) ^ (j29 << 8));
                jArr3[c18] = j35 ^ (((j29 >>> 62) ^ (j29 >>> 59)) ^ (j29 >>> 56));
                jArr3[c19] = j36;
                jArr3[c17] = j37;
                jArr3[4] = j38;
                jArr3[5] = j39;
                jArr3[6] = j45;
                jArr3[7] = j46;
                return;
            }
            long j47 = jArr[i15];
            long j48 = jArr[i15 + 1];
            long j49 = j17;
            long j55 = j16;
            long j56 = j26;
            j26 = j25;
            j25 = j19;
            j19 = j18;
            long j57 = j49;
            char c25 = c16;
            int i16 = 0;
            while (i16 < 64) {
                char c26 = c17;
                long j58 = j57;
                long j59 = -(j47 & 1);
                j47 >>>= c18;
                j28 ^= j15 & j59;
                long j65 = j55;
                long j66 = -(j48 & 1);
                j48 >>>= c18;
                j35 = (j35 ^ (j55 & j59)) ^ (j15 & j66);
                j36 = (j36 ^ (j58 & j59)) ^ (j65 & j66);
                j37 = (j37 ^ (j19 & j59)) ^ (j58 & j66);
                j38 = (j38 ^ (j25 & j59)) ^ (j19 & j66);
                j39 = (j39 ^ (j26 & j59)) ^ (j25 & j66);
                j45 = (j45 ^ (j56 & j59)) ^ (j26 & j66);
                j46 = (j46 ^ (j27 & j59)) ^ (j56 & j66);
                j29 ^= j27 & j66;
                long j67 = j27 >> 63;
                j27 = (j27 << c18) | (j56 >>> 63);
                j56 = (j56 << c18) | (j26 >>> 63);
                j26 = (j26 << c18) | (j25 >>> 63);
                j25 = (j25 << c18) | (j19 >>> 63);
                j19 = (j19 << c18) | (j58 >>> 63);
                long j68 = (j65 << c18) | (j15 >>> 63);
                j15 = (j15 << c18) ^ (j67 & 293);
                i16++;
                c17 = c26;
                j57 = (j58 << c18) | (j65 >>> 63);
                j55 = j68;
            }
            long j69 = ((j15 ^ (j27 >>> 62)) ^ (j27 >>> 59)) ^ (j27 >>> 56);
            long j75 = ((j27 ^ (j27 << c25)) ^ (j27 << 5)) ^ (j27 << 8);
            i15 += 2;
            j27 = j56;
            c17 = c17;
            c15 = c18;
            j18 = j57;
            j16 = j69;
            j15 = j75;
            c16 = c25;
            j17 = j55;
        }
    }

    public static void multiplyX(long[] jArr, long[] jArr2) {
        long j15 = jArr[0];
        long j16 = jArr[1];
        long j17 = jArr[2];
        long j18 = jArr[3];
        long j19 = jArr[4];
        long j25 = jArr[5];
        long j26 = jArr[6];
        long j27 = jArr[7];
        jArr2[0] = (j15 << 1) ^ ((j27 >> 63) & 293);
        jArr2[1] = (j16 << 1) | (j15 >>> 63);
        jArr2[2] = (j17 << 1) | (j16 >>> 63);
        jArr2[3] = (j18 << 1) | (j17 >>> 63);
        jArr2[4] = (j19 << 1) | (j18 >>> 63);
        jArr2[5] = (j25 << 1) | (j19 >>> 63);
        jArr2[6] = (j26 << 1) | (j25 >>> 63);
        jArr2[7] = (j27 << 1) | (j26 >>> 63);
    }

    public static void multiplyX8(long[] jArr, long[] jArr2) {
        long j15 = jArr[0];
        long j16 = jArr[1];
        long j17 = jArr[2];
        long j18 = jArr[3];
        long j19 = jArr[4];
        long j25 = jArr[5];
        long j26 = jArr[6];
        long j27 = jArr[7];
        long j28 = j27 >>> 56;
        jArr2[0] = ((((j15 << 8) ^ j28) ^ (j28 << 2)) ^ (j28 << 5)) ^ (j28 << 8);
        jArr2[1] = (j16 << 8) | (j15 >>> 56);
        jArr2[2] = (j17 << 8) | (j16 >>> 56);
        jArr2[3] = (j18 << 8) | (j17 >>> 56);
        jArr2[4] = (j19 << 8) | (j18 >>> 56);
        jArr2[5] = (j25 << 8) | (j19 >>> 56);
        jArr2[6] = (j26 << 8) | (j25 >>> 56);
        jArr2[7] = (j27 << 8) | (j26 >>> 56);
    }

    public static void one(long[] jArr) {
        jArr[0] = 1;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
        jArr[4] = 0;
        jArr[5] = 0;
        jArr[6] = 0;
        jArr[7] = 0;
    }

    public static void square(long[] jArr, long[] jArr2) {
        int i15 = 16;
        long[] jArr3 = new long[16];
        for (int i16 = 0; i16 < 8; i16++) {
            Interleave.expand64To128(jArr[i16], jArr3, i16 << 1);
        }
        while (true) {
            int i17 = i15 - 1;
            if (i17 < 8) {
                copy(jArr3, jArr2);
                return;
            }
            long j15 = jArr3[i17];
            int i18 = i15 - 9;
            jArr3[i18] = jArr3[i18] ^ ((((j15 << 2) ^ j15) ^ (j15 << 5)) ^ (j15 << 8));
            int i19 = i15 - 8;
            jArr3[i19] = ((j15 >>> 56) ^ ((j15 >>> 62) ^ (j15 >>> 59))) ^ jArr3[i19];
            i15 = i17;
        }
    }

    public static void x(long[] jArr) {
        jArr[0] = 2;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
        jArr[4] = 0;
        jArr[5] = 0;
        jArr[6] = 0;
        jArr[7] = 0;
    }

    public static void zero(long[] jArr) {
        jArr[0] = 0;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
        jArr[4] = 0;
        jArr[5] = 0;
        jArr[6] = 0;
        jArr[7] = 0;
    }
}
