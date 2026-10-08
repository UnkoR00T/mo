package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

/* JADX INFO: loaded from: classes5.dex */
public class SecT193Field {
    private static final long M01 = 1;
    private static final long M49 = 562949953421311L;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ M01;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    private static void addTo(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
        jArr2[3] = jArr2[3] ^ jArr[3];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return Nat.fromBigInteger64(193, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        Nat256.copy64(jArr, jArr2);
        for (int i15 = 1; i15 < 193; i15 += 2) {
            implSquare(jArr2, jArrCreateExt64);
            reduce(jArrCreateExt64, jArr2);
            implSquare(jArr2, jArrCreateExt64);
            reduce(jArrCreateExt64, jArr2);
            addTo(jArr, jArr2);
        }
    }

    protected static void implCompactExt(long[] jArr) {
        long j15 = jArr[0];
        long j16 = jArr[1];
        long j17 = jArr[2];
        long j18 = jArr[3];
        long j19 = jArr[4];
        long j25 = jArr[5];
        long j26 = jArr[6];
        long j27 = jArr[7];
        jArr[0] = j15 ^ (j16 << 49);
        jArr[1] = (j16 >>> 15) ^ (j17 << 34);
        jArr[2] = (j17 >>> 30) ^ (j18 << 19);
        jArr[3] = ((j18 >>> 45) ^ (j19 << 4)) ^ (j25 << 53);
        jArr[4] = ((j19 >>> 60) ^ (j26 << 38)) ^ (j25 >>> 11);
        jArr[5] = (j26 >>> 26) ^ (j27 << 23);
        jArr[6] = j27 >>> 41;
        jArr[7] = 0;
    }

    protected static void implExpand(long[] jArr, long[] jArr2) {
        long j15 = jArr[0];
        long j16 = jArr[1];
        long j17 = jArr[2];
        long j18 = jArr[3];
        jArr2[0] = j15 & M49;
        jArr2[1] = ((j15 >>> 49) ^ (j16 << 15)) & M49;
        jArr2[2] = ((j16 >>> 34) ^ (j17 << 30)) & M49;
        jArr2[3] = (j17 >>> 19) ^ (j18 << 45);
    }

    protected static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        implExpand(jArr, jArr4);
        implExpand(jArr2, jArr5);
        long[] jArr6 = new long[8];
        implMulwAcc(jArr6, jArr4[0], jArr5[0], jArr3, 0);
        implMulwAcc(jArr6, jArr4[1], jArr5[1], jArr3, 1);
        implMulwAcc(jArr6, jArr4[2], jArr5[2], jArr3, 2);
        implMulwAcc(jArr6, jArr4[3], jArr5[3], jArr3, 3);
        for (int i15 = 5; i15 > 0; i15--) {
            jArr3[i15] = jArr3[i15] ^ jArr3[i15 - 1];
        }
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        implMulwAcc(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i16 = 7; i16 > 1; i16--) {
            jArr3[i16] = jArr3[i16] ^ jArr3[i16 - 2];
        }
        long j15 = jArr4[0] ^ jArr4[2];
        long j16 = jArr4[1] ^ jArr4[3];
        long j17 = jArr5[0] ^ jArr5[2];
        long j18 = jArr5[3] ^ jArr5[1];
        implMulwAcc(jArr6, j15 ^ j16, j17 ^ j18, jArr3, 3);
        long[] jArr7 = new long[3];
        implMulwAcc(jArr6, j15, j17, jArr7, 0);
        implMulwAcc(jArr6, j16, j18, jArr7, 1);
        long j19 = jArr7[0];
        long j25 = jArr7[1];
        long j26 = jArr7[2];
        jArr3[2] = jArr3[2] ^ j19;
        jArr3[3] = (j19 ^ j25) ^ jArr3[3];
        jArr3[4] = jArr3[4] ^ (j25 ^ j26);
        jArr3[5] = jArr3[5] ^ j26;
        implCompactExt(jArr3);
    }

    protected static void implMulwAcc(long[] jArr, long j15, long j16, long[] jArr2, int i15) {
        jArr[1] = j16;
        long j17 = j16 << M01;
        jArr[2] = j17;
        long j18 = j17 ^ j16;
        jArr[3] = j18;
        long j19 = j16 << 2;
        jArr[4] = j19;
        jArr[5] = j19 ^ j16;
        long j25 = j18 << M01;
        jArr[6] = j25;
        jArr[7] = j25 ^ j16;
        int i16 = (int) j15;
        long j26 = (jArr[(i16 >>> 3) & 7] << 3) ^ jArr[i16 & 7];
        long j27 = 0;
        int i17 = 36;
        do {
            int i18 = (int) (j15 >>> i17);
            long j28 = (((jArr[i18 & 7] ^ (jArr[(i18 >>> 3) & 7] << 3)) ^ (jArr[(i18 >>> 6) & 7] << 6)) ^ (jArr[(i18 >>> 9) & 7] << 9)) ^ (jArr[(i18 >>> 12) & 7] << 12);
            j26 ^= j28 << i17;
            j27 ^= j28 >>> (-i17);
            i17 -= 15;
        } while (i17 > 0);
        jArr2[i15] = jArr2[i15] ^ (M49 & j26);
        int i19 = i15 + 1;
        jArr2[i19] = jArr2[i19] ^ ((j26 >>> 49) ^ (j27 << 15));
    }

    protected static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr, 0, 3, jArr2, 0);
        jArr2[6] = jArr[3] & M01;
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat256.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrCreate64 = Nat256.create64();
        long[] jArrCreate65 = Nat256.create64();
        square(jArr, jArrCreate64);
        squareN(jArrCreate64, 1, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate65, 1, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 3, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 6, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 12, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 24, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 48, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 96, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        addExt(jArr3, jArrCreateExt64, jArr3);
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        long j15 = jArr[0];
        long j16 = jArr[1];
        long j17 = jArr[2];
        long j18 = jArr[3];
        long j19 = jArr[4];
        long j25 = jArr[5];
        long j26 = jArr[6];
        long j27 = j18 ^ ((j26 >>> M01) ^ (j26 << 14));
        long j28 = j19 ^ (j26 >>> 50);
        long j29 = (j17 ^ (j26 << 63)) ^ ((j25 >>> M01) ^ (j25 << 14));
        long j35 = j27 ^ (j25 >>> 50);
        long j36 = j15 ^ (j28 << 63);
        long j37 = (j16 ^ (j25 << 63)) ^ ((j28 >>> M01) ^ (j28 << 14));
        long j38 = j29 ^ (j28 >>> 50);
        long j39 = j35 >>> M01;
        jArr2[0] = (j36 ^ j39) ^ (j39 << 15);
        jArr2[1] = (j35 >>> 50) ^ j37;
        jArr2[2] = j38;
        jArr2[3] = M01 & j35;
    }

    public static void reduce63(long[] jArr, int i15) {
        int i16 = i15 + 3;
        long j15 = jArr[i16];
        long j16 = j15 >>> M01;
        jArr[i15] = (j16 ^ (j16 << 15)) ^ jArr[i15];
        int i17 = i15 + 1;
        jArr[i17] = jArr[i17] ^ (j15 >>> 50);
        jArr[i16] = j15 & M01;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long jUnshuffle = Interleave.unshuffle(jArr[0]);
        long jUnshuffle2 = Interleave.unshuffle(jArr[1]);
        long j15 = (jUnshuffle & BodyPartID.bodyIdMax) | (jUnshuffle2 << 32);
        long j16 = (jUnshuffle >>> 32) | (jUnshuffle2 & (-4294967296L));
        long jUnshuffle3 = Interleave.unshuffle(jArr[2]);
        long j17 = (jUnshuffle3 & BodyPartID.bodyIdMax) ^ (jArr[3] << 32);
        long j18 = jUnshuffle3 >>> 32;
        jArr2[0] = j15 ^ (j16 << 8);
        jArr2[1] = ((j17 ^ (j18 << 8)) ^ (j16 >>> 56)) ^ (j16 << 33);
        jArr2[2] = (j16 >>> 31) ^ (j18 << 33);
        jArr2[3] = jUnshuffle3 >>> 63;
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        implSquare(jArr, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        implSquare(jArr, jArrCreateExt64);
        addExt(jArr2, jArrCreateExt64, jArr2);
    }

    public static void squareN(long[] jArr, int i15, long[] jArr2) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        implSquare(jArr, jArrCreateExt64);
        while (true) {
            reduce(jArrCreateExt64, jArr2);
            i15--;
            if (i15 <= 0) {
                return;
            } else {
                implSquare(jArr2, jArrCreateExt64);
            }
        }
    }

    public static int trace(long[] jArr) {
        return ((int) jArr[0]) & 1;
    }
}
