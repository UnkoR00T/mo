package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat448;

/* JADX INFO: loaded from: classes5.dex */
public class SecT409Field {
    private static final long M25 = 33554431;
    private static final long M59 = 576460752303423487L;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i15 = 0; i15 < 13; i15++) {
            jArr3[i15] = jArr[i15] ^ jArr2[i15];
        }
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
        jArr2[5] = jArr[5];
        jArr2[6] = jArr[6];
    }

    private static void addTo(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
        jArr2[3] = jArr2[3] ^ jArr[3];
        jArr2[4] = jArr2[4] ^ jArr[4];
        jArr2[5] = jArr2[5] ^ jArr[5];
        jArr2[6] = jArr2[6] ^ jArr[6];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return Nat.fromBigInteger64(409, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(13);
        Nat448.copy64(jArr, jArr2);
        for (int i15 = 1; i15 < 409; i15 += 2) {
            implSquare(jArr2, jArrCreate64);
            reduce(jArrCreate64, jArr2);
            implSquare(jArr2, jArrCreate64);
            reduce(jArrCreate64, jArr2);
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
        long j28 = jArr[8];
        long j29 = jArr[9];
        long j35 = jArr[10];
        long j36 = jArr[11];
        long j37 = jArr[12];
        long j38 = jArr[13];
        jArr[0] = j15 ^ (j16 << 59);
        jArr[1] = (j16 >>> 5) ^ (j17 << 54);
        jArr[2] = (j17 >>> 10) ^ (j18 << 49);
        jArr[3] = (j18 >>> 15) ^ (j19 << 44);
        jArr[4] = (j19 >>> 20) ^ (j25 << 39);
        jArr[5] = (j25 >>> 25) ^ (j26 << 34);
        jArr[6] = (j26 >>> 30) ^ (j27 << 29);
        jArr[7] = (j27 >>> 35) ^ (j28 << 24);
        jArr[8] = (j28 >>> 40) ^ (j29 << 19);
        jArr[9] = (j29 >>> 45) ^ (j35 << 14);
        jArr[10] = (j35 >>> 50) ^ (j36 << 9);
        jArr[11] = ((j36 >>> 55) ^ (j37 << 4)) ^ (j38 << 63);
        jArr[12] = j38 >>> 1;
    }

    protected static void implExpand(long[] jArr, long[] jArr2) {
        long j15 = jArr[0];
        long j16 = jArr[1];
        long j17 = jArr[2];
        long j18 = jArr[3];
        long j19 = jArr[4];
        long j25 = jArr[5];
        long j26 = jArr[6];
        jArr2[0] = j15 & M59;
        jArr2[1] = ((j15 >>> 59) ^ (j16 << 5)) & M59;
        jArr2[2] = ((j16 >>> 54) ^ (j17 << 10)) & M59;
        jArr2[3] = ((j17 >>> 49) ^ (j18 << 15)) & M59;
        jArr2[4] = ((j18 >>> 44) ^ (j19 << 20)) & M59;
        jArr2[5] = ((j19 >>> 39) ^ (j25 << 25)) & M59;
        jArr2[6] = (j25 >>> 34) ^ (j26 << 30);
    }

    protected static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[7];
        long[] jArr5 = new long[7];
        implExpand(jArr, jArr4);
        implExpand(jArr2, jArr5);
        long[] jArr6 = new long[8];
        for (int i15 = 0; i15 < 7; i15++) {
            implMulwAcc(jArr6, jArr4[i15], jArr5[i15], jArr3, i15 << 1);
        }
        long j15 = jArr3[0];
        long j16 = jArr3[1];
        long j17 = jArr3[2] ^ j15;
        long j18 = j17 ^ j16;
        jArr3[1] = j18;
        long j19 = j16 ^ jArr3[3];
        long j25 = j17 ^ jArr3[4];
        long j26 = j25 ^ j19;
        jArr3[2] = j26;
        long j27 = j19 ^ jArr3[5];
        long j28 = j25 ^ jArr3[6];
        long j29 = j28 ^ j27;
        jArr3[3] = j29;
        long j35 = j27 ^ jArr3[7];
        long j36 = j28 ^ jArr3[8];
        long j37 = j36 ^ j35;
        jArr3[4] = j37;
        long j38 = j35 ^ jArr3[9];
        long j39 = j36 ^ jArr3[10];
        long j45 = j39 ^ j38;
        jArr3[5] = j45;
        long j46 = j38 ^ jArr3[11];
        long j47 = j39 ^ jArr3[12];
        long j48 = j47 ^ j46;
        jArr3[6] = j48;
        long j49 = (j46 ^ jArr3[13]) ^ j47;
        jArr3[7] = j15 ^ j49;
        jArr3[8] = j18 ^ j49;
        jArr3[9] = j26 ^ j49;
        jArr3[10] = j29 ^ j49;
        jArr3[11] = j37 ^ j49;
        jArr3[12] = j45 ^ j49;
        jArr3[13] = j48 ^ j49;
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[2], jArr5[0] ^ jArr5[2], jArr3, 2);
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[3], jArr5[0] ^ jArr5[3], jArr3, 3);
        implMulwAcc(jArr6, jArr4[1] ^ jArr4[2], jArr5[1] ^ jArr5[2], jArr3, 3);
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[4], jArr5[0] ^ jArr5[4], jArr3, 4);
        implMulwAcc(jArr6, jArr4[1] ^ jArr4[3], jArr5[1] ^ jArr5[3], jArr3, 4);
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[5], jArr5[0] ^ jArr5[5], jArr3, 5);
        implMulwAcc(jArr6, jArr4[1] ^ jArr4[4], jArr5[1] ^ jArr5[4], jArr3, 5);
        implMulwAcc(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 5);
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[6], jArr5[0] ^ jArr5[6], jArr3, 6);
        implMulwAcc(jArr6, jArr4[1] ^ jArr4[5], jArr5[1] ^ jArr5[5], jArr3, 6);
        implMulwAcc(jArr6, jArr4[2] ^ jArr4[4], jArr5[2] ^ jArr5[4], jArr3, 6);
        implMulwAcc(jArr6, jArr4[1] ^ jArr4[6], jArr5[1] ^ jArr5[6], jArr3, 7);
        implMulwAcc(jArr6, jArr4[2] ^ jArr4[5], jArr5[2] ^ jArr5[5], jArr3, 7);
        implMulwAcc(jArr6, jArr4[3] ^ jArr4[4], jArr5[3] ^ jArr5[4], jArr3, 7);
        implMulwAcc(jArr6, jArr4[2] ^ jArr4[6], jArr5[2] ^ jArr5[6], jArr3, 8);
        implMulwAcc(jArr6, jArr4[3] ^ jArr4[5], jArr5[3] ^ jArr5[5], jArr3, 8);
        implMulwAcc(jArr6, jArr4[3] ^ jArr4[6], jArr5[3] ^ jArr5[6], jArr3, 9);
        implMulwAcc(jArr6, jArr4[4] ^ jArr4[5], jArr5[4] ^ jArr5[5], jArr3, 9);
        implMulwAcc(jArr6, jArr4[4] ^ jArr4[6], jArr5[4] ^ jArr5[6], jArr3, 10);
        implMulwAcc(jArr6, jArr4[5] ^ jArr4[6], jArr5[6] ^ jArr5[5], jArr3, 11);
        implCompactExt(jArr3);
    }

    protected static void implMulwAcc(long[] jArr, long j15, long j16, long[] jArr2, int i15) {
        jArr[1] = j16;
        long j17 = j16 << 1;
        jArr[2] = j17;
        long j18 = j17 ^ j16;
        jArr[3] = j18;
        long j19 = j16 << 2;
        jArr[4] = j19;
        jArr[5] = j19 ^ j16;
        long j25 = j18 << 1;
        jArr[6] = j25;
        jArr[7] = j25 ^ j16;
        int i16 = (int) j15;
        long j26 = (jArr[(i16 >>> 3) & 7] << 3) ^ jArr[i16 & 7];
        long j27 = 0;
        int i17 = 54;
        do {
            int i18 = (int) (j15 >>> i17);
            long j28 = jArr[i18 & 7] ^ (jArr[(i18 >>> 3) & 7] << 3);
            j26 ^= j28 << i17;
            j27 ^= j28 >>> (-i17);
            i17 -= 6;
        } while (i17 > 0);
        jArr2[i15] = jArr2[i15] ^ (M59 & j26);
        int i19 = i15 + 1;
        jArr2[i19] = jArr2[i19] ^ ((j26 >>> 59) ^ (j27 << 5));
    }

    protected static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr, 0, 6, jArr2, 0);
        jArr2[12] = Interleave.expand32to64((int) jArr[6]);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat448.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrCreate64 = Nat448.create64();
        long[] jArrCreate65 = Nat448.create64();
        long[] jArrCreate66 = Nat448.create64();
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
        multiply(jArrCreate64, jArrCreate65, jArrCreate66);
        squareN(jArrCreate66, 24, jArrCreate64);
        squareN(jArrCreate64, 24, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 48, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 96, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 192, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        multiply(jArrCreate64, jArrCreate66, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat448.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat448.createExt64();
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
        long j27 = jArr[7];
        long j28 = jArr[12];
        long j29 = j25 ^ (j28 << 39);
        long j35 = j26 ^ ((j28 >>> 25) ^ (j28 << 62));
        long j36 = j27 ^ (j28 >>> 2);
        long j37 = jArr[11];
        long j38 = j19 ^ (j37 << 39);
        long j39 = j29 ^ ((j37 >>> 25) ^ (j37 << 62));
        long j45 = j35 ^ (j37 >>> 2);
        long j46 = jArr[10];
        long j47 = j18 ^ (j46 << 39);
        long j48 = j38 ^ ((j46 >>> 25) ^ (j46 << 62));
        long j49 = j39 ^ (j46 >>> 2);
        long j55 = jArr[9];
        long j56 = j17 ^ (j55 << 39);
        long j57 = j47 ^ ((j55 >>> 25) ^ (j55 << 62));
        long j58 = j48 ^ (j55 >>> 2);
        long j59 = jArr[8];
        long j65 = j15 ^ (j36 << 39);
        long j66 = (j16 ^ (j59 << 39)) ^ ((j36 >>> 25) ^ (j36 << 62));
        long j67 = (j56 ^ ((j59 >>> 25) ^ (j59 << 62))) ^ (j36 >>> 2);
        long j68 = j45 >>> 25;
        jArr2[0] = j65 ^ j68;
        jArr2[1] = (j68 << 23) ^ j66;
        jArr2[2] = j67;
        jArr2[3] = j57 ^ (j59 >>> 2);
        jArr2[4] = j58;
        jArr2[5] = j49;
        jArr2[6] = j45 & M25;
    }

    public static void reduce39(long[] jArr, int i15) {
        int i16 = i15 + 6;
        long j15 = jArr[i16];
        long j16 = j15 >>> 25;
        jArr[i15] = jArr[i15] ^ j16;
        int i17 = i15 + 1;
        jArr[i17] = (j16 << 23) ^ jArr[i17];
        jArr[i16] = j15 & M25;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long jUnshuffle = Interleave.unshuffle(jArr[0]);
        long jUnshuffle2 = Interleave.unshuffle(jArr[1]);
        long j15 = (jUnshuffle & BodyPartID.bodyIdMax) | (jUnshuffle2 << 32);
        long j16 = (jUnshuffle >>> 32) | (jUnshuffle2 & (-4294967296L));
        long jUnshuffle3 = Interleave.unshuffle(jArr[2]);
        long jUnshuffle4 = Interleave.unshuffle(jArr[3]);
        long j17 = (jUnshuffle3 & BodyPartID.bodyIdMax) | (jUnshuffle4 << 32);
        long j18 = (jUnshuffle3 >>> 32) | (jUnshuffle4 & (-4294967296L));
        long jUnshuffle5 = Interleave.unshuffle(jArr[4]);
        long jUnshuffle6 = Interleave.unshuffle(jArr[5]);
        long j19 = (jUnshuffle5 & BodyPartID.bodyIdMax) | (jUnshuffle6 << 32);
        long j25 = (jUnshuffle5 >>> 32) | (jUnshuffle6 & (-4294967296L));
        long jUnshuffle7 = Interleave.unshuffle(jArr[6]);
        long j26 = jUnshuffle7 & BodyPartID.bodyIdMax;
        long j27 = jUnshuffle7 >>> 32;
        jArr2[0] = j15 ^ (j16 << 44);
        jArr2[1] = (j17 ^ (j18 << 44)) ^ (j16 >>> 20);
        jArr2[2] = (j19 ^ (j25 << 44)) ^ (j18 >>> 20);
        jArr2[3] = (((j27 << 44) ^ j26) ^ (j25 >>> 20)) ^ (j16 << 13);
        jArr2[4] = (j16 >>> 51) ^ ((jUnshuffle7 >>> 52) ^ (j18 << 13));
        jArr2[5] = (j25 << 13) ^ (j18 >>> 51);
        jArr2[6] = (j27 << 13) ^ (j25 >>> 51);
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(13);
        implSquare(jArr, jArrCreate64);
        reduce(jArrCreate64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(13);
        implSquare(jArr, jArrCreate64);
        addExt(jArr2, jArrCreate64, jArr2);
    }

    public static void squareN(long[] jArr, int i15, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(13);
        implSquare(jArr, jArrCreate64);
        while (true) {
            reduce(jArrCreate64, jArr2);
            i15--;
            if (i15 <= 0) {
                return;
            } else {
                implSquare(jArr2, jArrCreate64);
            }
        }
    }

    public static int trace(long[] jArr) {
        return ((int) jArr[0]) & 1;
    }
}
