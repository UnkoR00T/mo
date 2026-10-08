package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

/* JADX INFO: loaded from: classes5.dex */
public class SecT239Field {
    private static final long M47 = 140737488355327L;
    private static final long M60 = 1152921504606846975L;

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
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
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
        return Nat.fromBigInteger64(239, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        Nat256.copy64(jArr, jArr2);
        for (int i15 = 1; i15 < 239; i15 += 2) {
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
        jArr[0] = j15 ^ (j16 << 60);
        jArr[1] = (j16 >>> 4) ^ (j17 << 56);
        jArr[2] = (j17 >>> 8) ^ (j18 << 52);
        jArr[3] = (j18 >>> 12) ^ (j19 << 48);
        jArr[4] = (j19 >>> 16) ^ (j25 << 44);
        jArr[5] = (j25 >>> 20) ^ (j26 << 40);
        jArr[6] = (j26 >>> 24) ^ (j27 << 36);
        jArr[7] = j27 >>> 28;
    }

    protected static void implExpand(long[] jArr, long[] jArr2) {
        long j15 = jArr[0];
        long j16 = jArr[1];
        long j17 = jArr[2];
        long j18 = jArr[3];
        jArr2[0] = j15 & M60;
        jArr2[1] = ((j15 >>> 60) ^ (j16 << 4)) & M60;
        jArr2[2] = ((j16 >>> 56) ^ (j17 << 8)) & M60;
        jArr2[3] = (j17 >>> 52) ^ (j18 << 12);
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
        jArr2[i15] = jArr2[i15] ^ (M60 & j26);
        int i19 = i15 + 1;
        jArr2[i19] = ((((((j15 & 585610922974906400L) & ((j16 << 4) >> 63)) >>> 5) ^ j27) << 4) ^ (j26 >>> 60)) ^ jArr2[i19];
    }

    protected static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr, 0, 4, jArr2, 0);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat256.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrCreate64 = Nat256.create64();
        long[] jArrCreate65 = Nat256.create64();
        square(jArr, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        square(jArrCreate64, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        squareN(jArrCreate64, 3, jArrCreate65);
        multiply(jArrCreate65, jArrCreate64, jArrCreate65);
        square(jArrCreate65, jArrCreate65);
        multiply(jArrCreate65, jArr, jArrCreate65);
        squareN(jArrCreate65, 7, jArrCreate64);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 14, jArrCreate65);
        multiply(jArrCreate65, jArrCreate64, jArrCreate65);
        square(jArrCreate65, jArrCreate65);
        multiply(jArrCreate65, jArr, jArrCreate65);
        squareN(jArrCreate65, 29, jArrCreate64);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        square(jArrCreate64, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        squareN(jArrCreate64, 59, jArrCreate65);
        multiply(jArrCreate65, jArrCreate64, jArrCreate65);
        square(jArrCreate65, jArrCreate65);
        multiply(jArrCreate65, jArr, jArrCreate65);
        squareN(jArrCreate65, 119, jArrCreate64);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        square(jArrCreate64, jArr2);
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
        long j27 = jArr[7];
        long j28 = j26 ^ (j27 >>> 17);
        long j29 = (j25 ^ (j27 << 47)) ^ (j28 >>> 17);
        long j35 = ((j19 ^ (j27 >>> 47)) ^ (j28 << 47)) ^ (j29 >>> 17);
        long j36 = j15 ^ (j35 << 17);
        long j37 = (j16 ^ (j29 << 17)) ^ (j35 >>> 47);
        long j38 = ((j17 ^ (j28 << 17)) ^ (j29 >>> 47)) ^ (j35 << 47);
        long j39 = (((j18 ^ (j27 << 17)) ^ (j28 >>> 47)) ^ (j29 << 47)) ^ (j35 >>> 17);
        long j45 = j39 >>> 47;
        jArr2[0] = j36 ^ j45;
        jArr2[1] = j37;
        jArr2[2] = (j45 << 30) ^ j38;
        jArr2[3] = M47 & j39;
    }

    public static void reduce17(long[] jArr, int i15) {
        int i16 = i15 + 3;
        long j15 = jArr[i16];
        long j16 = j15 >>> 47;
        jArr[i15] = jArr[i15] ^ j16;
        int i17 = i15 + 2;
        jArr[i17] = (j16 << 30) ^ jArr[i17];
        jArr[i16] = j15 & M47;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long jUnshuffle = Interleave.unshuffle(jArr[0]);
        long jUnshuffle2 = Interleave.unshuffle(jArr[1]);
        long j15 = (jUnshuffle & BodyPartID.bodyIdMax) | (jUnshuffle2 << 32);
        long j16 = (jUnshuffle >>> 32) | (jUnshuffle2 & (-4294967296L));
        int i15 = 2;
        long jUnshuffle3 = Interleave.unshuffle(jArr[2]);
        long jUnshuffle4 = Interleave.unshuffle(jArr[3]);
        long j17 = (jUnshuffle3 & BodyPartID.bodyIdMax) | (jUnshuffle4 << 32);
        long j18 = (jUnshuffle4 & (-4294967296L)) | (jUnshuffle3 >>> 32);
        long j19 = j18 >>> 49;
        long j25 = (j16 >>> 49) | (j18 << 15);
        long j26 = j18 ^ (j16 << 15);
        long[] jArrCreateExt64 = Nat256.createExt64();
        int[] iArr = {39, 120};
        int i16 = 0;
        while (i16 < i15) {
            int i17 = iArr[i16];
            int i18 = i17 >>> 6;
            int i19 = i17 & 63;
            jArrCreateExt64[i18] = jArrCreateExt64[i18] ^ (j16 << i19);
            int i25 = i18 + 1;
            int[] iArr2 = iArr;
            int i26 = -i19;
            jArrCreateExt64[i25] = jArrCreateExt64[i25] ^ ((j26 << i19) | (j16 >>> i26));
            int i27 = i18 + 2;
            jArrCreateExt64[i27] = jArrCreateExt64[i27] ^ ((j25 << i19) | (j26 >>> i26));
            int i28 = i18 + 3;
            jArrCreateExt64[i28] = jArrCreateExt64[i28] ^ ((j19 << i19) | (j25 >>> i26));
            int i29 = i18 + 4;
            jArrCreateExt64[i29] = jArrCreateExt64[i29] ^ (j19 >>> i26);
            i16++;
            i15 = 2;
            iArr = iArr2;
        }
        reduce(jArrCreateExt64, jArr2);
        jArr2[0] = jArr2[0] ^ j15;
        jArr2[1] = jArr2[1] ^ j17;
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
        return ((int) ((jArr[0] ^ (jArr[1] >>> 17)) ^ (jArr[2] >>> 34))) & 1;
    }
}
