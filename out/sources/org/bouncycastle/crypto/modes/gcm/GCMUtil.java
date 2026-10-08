package org.bouncycastle.crypto.modes.gcm;

import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.util.Longs;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public abstract class GCMUtil {
    private static final int E1 = -520093696;
    private static final long E1L = -2233785415175766016L;
    public static final int SIZE_BYTES = 16;
    public static final int SIZE_INTS = 4;
    public static final int SIZE_LONGS = 2;

    public static byte areEqual(byte[] bArr, byte[] bArr2) {
        int i15 = 0;
        for (int i16 = 0; i16 < 16; i16++) {
            i15 |= bArr[i16] ^ bArr2[i16];
        }
        return (byte) ((((i15 >>> 1) | (i15 & 1)) - 1) >> 31);
    }

    public static void asBytes(int[] iArr, byte[] bArr) {
        Pack.intToBigEndian(iArr, 0, 4, bArr, 0);
    }

    public static void asInts(byte[] bArr, int[] iArr) {
        Pack.bigEndianToInt(bArr, 0, iArr, 0, 4);
    }

    public static void asLongs(byte[] bArr, long[] jArr) {
        Pack.bigEndianToLong(bArr, 0, jArr, 0, 2);
    }

    public static void copy(byte[] bArr, byte[] bArr2) {
        for (int i15 = 0; i15 < 16; i15++) {
            bArr2[i15] = bArr[i15];
        }
    }

    public static void divideP(long[] jArr, long[] jArr2) {
        long j15 = jArr[0];
        long j16 = jArr[1];
        long j17 = j15 >> 63;
        jArr2[0] = ((j15 ^ (E1L & j17)) << 1) | (j16 >>> 63);
        jArr2[1] = (j16 << 1) | (-j17);
    }

    private static long implMul64(long j15, long j16) {
        long j17 = j15 & 1229782938247303441L;
        long j18 = j15 & 2459565876494606882L;
        long j19 = j15 & 4919131752989213764L;
        long j25 = j15 & (-8608480567731124088L);
        long j26 = j16 & 1229782938247303441L;
        long j27 = j16 & 2459565876494606882L;
        long j28 = j16 & 4919131752989213764L;
        long j29 = j16 & (-8608480567731124088L);
        long j35 = (((j17 * j26) ^ (j18 * j29)) ^ (j19 * j28)) ^ (j25 * j27);
        long j36 = (((j17 * j27) ^ (j18 * j26)) ^ (j19 * j29)) ^ (j25 * j28);
        long j37 = (((j17 * j28) ^ (j18 * j27)) ^ (j19 * j26)) ^ (j25 * j29);
        return (j35 & 1229782938247303441L) | (j36 & 2459565876494606882L) | (j37 & 4919131752989213764L) | (((((j17 * j29) ^ (j18 * j28)) ^ (j19 * j27)) ^ (j25 * j26)) & (-8608480567731124088L));
    }

    public static void multiply(byte[] bArr, byte[] bArr2) {
        long[] jArrAsLongs = asLongs(bArr);
        multiply(jArrAsLongs, asLongs(bArr2));
        asBytes(jArrAsLongs, bArr);
    }

    public static void multiplyP(int[] iArr) {
        int i15 = iArr[0];
        int i16 = iArr[1];
        int i17 = iArr[2];
        int i18 = iArr[3];
        iArr[0] = (((i18 << 31) >> 31) & E1) ^ (i15 >>> 1);
        iArr[1] = (i16 >>> 1) | (i15 << 31);
        iArr[2] = (i17 >>> 1) | (i16 << 31);
        iArr[3] = (i18 >>> 1) | (i17 << 31);
    }

    public static void multiplyP16(long[] jArr) {
        long j15 = jArr[0];
        long j16 = jArr[1];
        long j17 = j16 << 48;
        jArr[0] = (j17 >>> 7) ^ ((((j15 >>> 16) ^ j17) ^ (j17 >>> 1)) ^ (j17 >>> 2));
        jArr[1] = (j15 << 48) | (j16 >>> 16);
    }

    public static void multiplyP3(long[] jArr, long[] jArr2) {
        long j15 = jArr[0];
        long j16 = jArr[1];
        long j17 = j16 << 61;
        jArr2[0] = (j17 >>> 7) ^ ((((j15 >>> 3) ^ j17) ^ (j17 >>> 1)) ^ (j17 >>> 2));
        jArr2[1] = (j15 << 61) | (j16 >>> 3);
    }

    public static void multiplyP4(long[] jArr, long[] jArr2) {
        long j15 = jArr[0];
        long j16 = jArr[1];
        long j17 = j16 << 60;
        jArr2[0] = (j17 >>> 7) ^ ((((j15 >>> 4) ^ j17) ^ (j17 >>> 1)) ^ (j17 >>> 2));
        jArr2[1] = (j15 << 60) | (j16 >>> 4);
    }

    public static void multiplyP7(long[] jArr, long[] jArr2) {
        long j15 = jArr[0];
        long j16 = jArr[1];
        long j17 = j16 << 57;
        jArr2[0] = (j17 >>> 7) ^ ((((j15 >>> 7) ^ j17) ^ (j17 >>> 1)) ^ (j17 >>> 2));
        jArr2[1] = (j15 << 57) | (j16 >>> 7);
    }

    public static void multiplyP8(int[] iArr) {
        int i15 = iArr[0];
        int i16 = iArr[1];
        int i17 = iArr[2];
        int i18 = iArr[3];
        int i19 = i18 << 24;
        iArr[0] = (i19 >>> 7) ^ ((((i15 >>> 8) ^ i19) ^ (i19 >>> 1)) ^ (i19 >>> 2));
        iArr[1] = (i16 >>> 8) | (i15 << 24);
        iArr[2] = (i17 >>> 8) | (i16 << 24);
        iArr[3] = (i18 >>> 8) | (i17 << 24);
    }

    public static byte[] oneAsBytes() {
        byte[] bArr = new byte[16];
        bArr[0] = -128;
        return bArr;
    }

    public static int[] oneAsInts() {
        int[] iArr = new int[4];
        iArr[0] = Integer.MIN_VALUE;
        return iArr;
    }

    public static long[] oneAsLongs() {
        return new long[]{Long.MIN_VALUE, 0};
    }

    public static long[] pAsLongs() {
        return new long[]{4611686018427387904L, 0};
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[4];
        Interleave.expand64To128Rev(jArr[0], jArr3, 0);
        Interleave.expand64To128Rev(jArr[1], jArr3, 2);
        long j15 = jArr3[0];
        long j16 = jArr3[1];
        long j17 = jArr3[2];
        long j18 = jArr3[3];
        long j19 = j17 ^ ((j18 << 57) ^ ((j18 << 63) ^ (j18 << 62)));
        jArr2[0] = j15 ^ ((((j19 >>> 1) ^ j19) ^ (j19 >>> 2)) ^ (j19 >>> 7));
        jArr2[1] = (j16 ^ ((((j18 >>> 1) ^ j18) ^ (j18 >>> 2)) ^ (j18 >>> 7))) ^ ((j19 << 57) ^ ((j19 << 63) ^ (j19 << 62)));
    }

    public static void xor(byte[] bArr, int i15, byte[] bArr2, int i16, int i17) {
        while (true) {
            i17--;
            if (i17 < 0) {
                return;
            }
            int i18 = i15 + i17;
            bArr[i18] = (byte) (bArr[i18] ^ bArr2[i16 + i17]);
        }
    }

    public static int areEqual(int[] iArr, int[] iArr2) {
        int i15 = (iArr[3] ^ iArr2[3]) | (iArr2[0] ^ iArr[0]) | (iArr[1] ^ iArr2[1]) | (iArr2[2] ^ iArr[2]);
        return (((i15 & 1) | (i15 >>> 1)) - 1) >> 31;
    }

    public static void asBytes(long[] jArr, byte[] bArr) {
        Pack.longToBigEndian(jArr, 0, 2, bArr, 0);
    }

    public static int[] asInts(byte[] bArr) {
        int[] iArr = new int[4];
        Pack.bigEndianToInt(bArr, 0, iArr, 0, 4);
        return iArr;
    }

    public static long[] asLongs(byte[] bArr) {
        long[] jArr = new long[2];
        Pack.bigEndianToLong(bArr, 0, jArr, 0, 2);
        return jArr;
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
    }

    static void multiply(byte[] bArr, long[] jArr) {
        long jBigEndianToLong = Pack.bigEndianToLong(bArr, 0);
        long jBigEndianToLong2 = Pack.bigEndianToLong(bArr, 8);
        long j15 = jArr[0];
        long j16 = jArr[1];
        long jReverse = Longs.reverse(jBigEndianToLong);
        long jReverse2 = Longs.reverse(jBigEndianToLong2);
        long jReverse3 = Longs.reverse(j15);
        long jReverse4 = Longs.reverse(j16);
        long jReverse5 = Longs.reverse(implMul64(jReverse, jReverse3));
        long jImplMul64 = implMul64(jBigEndianToLong, j15) << 1;
        long jReverse6 = Longs.reverse(implMul64(jReverse2, jReverse4));
        long jImplMul65 = implMul64(jBigEndianToLong2, j16);
        long j17 = jImplMul65 << 1;
        long jReverse7 = Longs.reverse(implMul64(jReverse ^ jReverse2, jReverse3 ^ jReverse4));
        long jImplMul66 = ((implMul64(jBigEndianToLong ^ jBigEndianToLong2, j15 ^ j16) << 1) ^ ((jReverse6 ^ jImplMul64) ^ j17)) ^ ((jImplMul65 << 63) ^ (jImplMul65 << 58));
        Pack.longToBigEndian(jReverse5 ^ (((jImplMul66 >>> 2) ^ ((jImplMul66 >>> 1) ^ jImplMul66)) ^ (jImplMul66 >>> 7)), bArr, 0);
        Pack.longToBigEndian(((jImplMul66 << 57) ^ ((jImplMul66 << 63) ^ (jImplMul66 << 62))) ^ ((jReverse7 ^ ((jImplMul64 ^ jReverse5) ^ jReverse6)) ^ (((j17 ^ (j17 >>> 1)) ^ (j17 >>> 2)) ^ (j17 >>> 7))), bArr, 8);
    }

    public static void multiplyP(int[] iArr, int[] iArr2) {
        int i15 = iArr[0];
        int i16 = iArr[1];
        int i17 = iArr[2];
        int i18 = iArr[3];
        iArr2[0] = (((i18 << 31) >> 31) & E1) ^ (i15 >>> 1);
        iArr2[1] = (i16 >>> 1) | (i15 << 31);
        iArr2[2] = (i17 >>> 1) | (i16 << 31);
        iArr2[3] = (i18 >>> 1) | (i17 << 31);
    }

    public static void multiplyP8(int[] iArr, int[] iArr2) {
        int i15 = iArr[0];
        int i16 = iArr[1];
        int i17 = iArr[2];
        int i18 = iArr[3];
        int i19 = i18 << 24;
        iArr2[0] = (i19 >>> 7) ^ ((((i15 >>> 8) ^ i19) ^ (i19 >>> 1)) ^ (i19 >>> 2));
        iArr2[1] = (i16 >>> 8) | (i15 << 24);
        iArr2[2] = (i17 >>> 8) | (i16 << 24);
        iArr2[3] = (i18 >>> 8) | (i17 << 24);
    }

    public static void xor(byte[] bArr, int i15, byte[] bArr2, int i16, byte[] bArr3, int i17) {
        int i18 = 0;
        do {
            bArr3[i17 + i18] = (byte) (bArr[i15 + i18] ^ bArr2[i16 + i18]);
            int i19 = i18 + 1;
            bArr3[i17 + i19] = (byte) (bArr2[i19 + i16] ^ bArr[i15 + i19]);
            int i25 = i18 + 2;
            bArr3[i17 + i25] = (byte) (bArr2[i25 + i16] ^ bArr[i15 + i25]);
            int i26 = i18 + 3;
            bArr3[i17 + i26] = (byte) (bArr2[i26 + i16] ^ bArr[i15 + i26]);
            i18 += 4;
        } while (i18 < 16);
    }

    public static long areEqual(long[] jArr, long[] jArr2) {
        long j15 = (jArr2[1] ^ jArr[1]) | (jArr[0] ^ jArr2[0]);
        return (((j15 & 1) | (j15 >>> 1)) - 1) >> 63;
    }

    public static byte[] asBytes(int[] iArr) {
        byte[] bArr = new byte[16];
        Pack.intToBigEndian(iArr, 0, 4, bArr, 0);
        return bArr;
    }

    public static void copy(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
    }

    public static void multiply(int[] iArr, int[] iArr2) {
        int i15 = iArr2[0];
        int i16 = iArr2[1];
        int i17 = iArr2[2];
        int i18 = iArr2[3];
        int i19 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        for (int i28 = 0; i28 < 4; i28++) {
            int i29 = iArr[i28];
            for (int i35 = 0; i35 < 32; i35++) {
                int i36 = i29 >> 31;
                i29 <<= 1;
                i19 ^= i15 & i36;
                i25 ^= i16 & i36;
                i26 ^= i17 & i36;
                i27 ^= i36 & i18;
                int i37 = (i18 << 31) >> 8;
                i18 = (i18 >>> 1) | (i17 << 31);
                i17 = (i17 >>> 1) | (i16 << 31);
                i16 = (i16 >>> 1) | (i15 << 31);
                i15 = (i15 >>> 1) ^ (i37 & E1);
            }
        }
        iArr[0] = i19;
        iArr[1] = i25;
        iArr[2] = i26;
        iArr[3] = i27;
    }

    public static void multiplyP(long[] jArr) {
        long j15 = jArr[0];
        long j16 = jArr[1];
        jArr[0] = (((j16 << 63) >> 63) & E1L) ^ (j15 >>> 1);
        jArr[1] = (j15 << 63) | (j16 >>> 1);
    }

    public static void multiplyP8(long[] jArr) {
        long j15 = jArr[0];
        long j16 = jArr[1];
        long j17 = j16 << 56;
        jArr[0] = (j17 >>> 7) ^ ((((j15 >>> 8) ^ j17) ^ (j17 >>> 1)) ^ (j17 >>> 2));
        jArr[1] = (j15 << 56) | (j16 >>> 8);
    }

    public static void xor(byte[] bArr, byte[] bArr2) {
        int i15 = 0;
        do {
            bArr[i15] = (byte) (bArr[i15] ^ bArr2[i15]);
            int i16 = i15 + 1;
            bArr[i16] = (byte) (bArr[i16] ^ bArr2[i16]);
            int i17 = i15 + 2;
            bArr[i17] = (byte) (bArr[i17] ^ bArr2[i17]);
            int i18 = i15 + 3;
            bArr[i18] = (byte) (bArr[i18] ^ bArr2[i18]);
            i15 += 4;
        } while (i15 < 16);
    }

    public static byte[] asBytes(long[] jArr) {
        byte[] bArr = new byte[16];
        Pack.longToBigEndian(jArr, 0, 2, bArr, 0);
        return bArr;
    }

    public static void multiply(long[] jArr, long[] jArr2) {
        long j15 = jArr[0];
        long j16 = jArr[1];
        long j17 = jArr2[0];
        long j18 = jArr2[1];
        long jReverse = Longs.reverse(j15);
        long jReverse2 = Longs.reverse(j16);
        long jReverse3 = Longs.reverse(j17);
        long jReverse4 = Longs.reverse(j18);
        long jReverse5 = Longs.reverse(implMul64(jReverse, jReverse3));
        long jImplMul64 = implMul64(j15, j17) << 1;
        long jReverse6 = Longs.reverse(implMul64(jReverse2, jReverse4));
        long jImplMul65 = implMul64(j16, j18);
        long j19 = jImplMul65 << 1;
        long jReverse7 = Longs.reverse(implMul64(jReverse ^ jReverse2, jReverse3 ^ jReverse4));
        long jImplMul66 = ((implMul64(j15 ^ j16, j17 ^ j18) << 1) ^ ((jReverse6 ^ jImplMul64) ^ j19)) ^ ((jImplMul65 << 63) ^ (jImplMul65 << 58));
        jArr[0] = jReverse5 ^ ((jImplMul66 >>> 7) ^ (((jImplMul66 >>> 1) ^ jImplMul66) ^ (jImplMul66 >>> 2)));
        jArr[1] = ((jImplMul66 << 57) ^ ((jImplMul66 << 63) ^ (jImplMul66 << 62))) ^ ((jReverse7 ^ ((jImplMul64 ^ jReverse5) ^ jReverse6)) ^ (((j19 ^ (j19 >>> 1)) ^ (j19 >>> 2)) ^ (j19 >>> 7)));
    }

    public static void multiplyP(long[] jArr, long[] jArr2) {
        long j15 = jArr[0];
        long j16 = jArr[1];
        jArr2[0] = (((j16 << 63) >> 63) & E1L) ^ (j15 >>> 1);
        jArr2[1] = (j15 << 63) | (j16 >>> 1);
    }

    public static void multiplyP8(long[] jArr, long[] jArr2) {
        long j15 = jArr[0];
        long j16 = jArr[1];
        long j17 = j16 << 56;
        jArr2[0] = (j17 >>> 7) ^ ((((j15 >>> 8) ^ j17) ^ (j17 >>> 1)) ^ (j17 >>> 2));
        jArr2[1] = (j15 << 56) | (j16 >>> 8);
    }

    public static void xor(byte[] bArr, byte[] bArr2, int i15) {
        int i16 = 0;
        do {
            bArr[i16] = (byte) (bArr[i16] ^ bArr2[i15 + i16]);
            int i17 = i16 + 1;
            bArr[i17] = (byte) (bArr[i17] ^ bArr2[i15 + i17]);
            int i18 = i16 + 2;
            bArr[i18] = (byte) (bArr[i18] ^ bArr2[i15 + i18]);
            int i19 = i16 + 3;
            bArr[i19] = (byte) (bArr[i19] ^ bArr2[i15 + i19]);
            i16 += 4;
        } while (i16 < 16);
    }

    public static void xor(byte[] bArr, byte[] bArr2, int i15, int i16) {
        while (true) {
            i16--;
            if (i16 < 0) {
                return;
            } else {
                bArr[i16] = (byte) (bArr[i16] ^ bArr2[i15 + i16]);
            }
        }
    }

    public static void xor(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i15 = 0;
        do {
            bArr3[i15] = (byte) (bArr[i15] ^ bArr2[i15]);
            int i16 = i15 + 1;
            bArr3[i16] = (byte) (bArr[i16] ^ bArr2[i16]);
            int i17 = i15 + 2;
            bArr3[i17] = (byte) (bArr[i17] ^ bArr2[i17]);
            int i18 = i15 + 3;
            bArr3[i18] = (byte) (bArr[i18] ^ bArr2[i18]);
            i15 += 4;
        } while (i15 < 16);
    }

    public static void xor(int[] iArr, int[] iArr2) {
        iArr[0] = iArr[0] ^ iArr2[0];
        iArr[1] = iArr[1] ^ iArr2[1];
        iArr[2] = iArr[2] ^ iArr2[2];
        iArr[3] = iArr2[3] ^ iArr[3];
    }

    public static void xor(int[] iArr, int[] iArr2, int[] iArr3) {
        iArr3[0] = iArr[0] ^ iArr2[0];
        iArr3[1] = iArr[1] ^ iArr2[1];
        iArr3[2] = iArr[2] ^ iArr2[2];
        iArr3[3] = iArr[3] ^ iArr2[3];
    }

    public static void xor(long[] jArr, long[] jArr2) {
        jArr[0] = jArr[0] ^ jArr2[0];
        jArr[1] = jArr[1] ^ jArr2[1];
    }

    public static void xor(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }
}
