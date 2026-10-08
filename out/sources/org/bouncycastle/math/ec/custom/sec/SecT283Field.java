package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat320;
import org.conscrypt.metrics.ConscryptStatsLog;

/* JADX INFO: loaded from: classes5.dex */
public class SecT283Field {
    private static final long M27 = 134217727;
    private static final long M57 = 144115188075855871L;
    private static final long[] ROOT_Z = {878416384462358536L, 3513665537849438403L, -9076969306111048948L, 585610922974906400L, 34087042};

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr[7] ^ jArr2[7];
        jArr3[8] = jArr2[8] ^ jArr[8];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
    }

    private static void addTo(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
        jArr2[3] = jArr2[3] ^ jArr[3];
        jArr2[4] = jArr2[4] ^ jArr[4];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return Nat.fromBigInteger64(283, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(9);
        Nat320.copy64(jArr, jArr2);
        for (int i15 = 1; i15 < 283; i15 += 2) {
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
        jArr[0] = j15 ^ (j16 << 57);
        jArr[1] = (j16 >>> 7) ^ (j17 << 50);
        jArr[2] = (j17 >>> 14) ^ (j18 << 43);
        jArr[3] = (j18 >>> 21) ^ (j19 << 36);
        jArr[4] = (j19 >>> 28) ^ (j25 << 29);
        jArr[5] = (j25 >>> 35) ^ (j26 << 22);
        jArr[6] = (j26 >>> 42) ^ (j27 << 15);
        jArr[7] = (j27 >>> 49) ^ (j28 << 8);
        jArr[8] = (j28 >>> 56) ^ (j29 << 1);
        jArr[9] = j29 >>> 63;
    }

    protected static void implExpand(long[] jArr, long[] jArr2) {
        long j15 = jArr[0];
        long j16 = jArr[1];
        long j17 = jArr[2];
        long j18 = jArr[3];
        long j19 = jArr[4];
        jArr2[0] = j15 & M57;
        jArr2[1] = ((j15 >>> 57) ^ (j16 << 7)) & M57;
        jArr2[2] = ((j16 >>> 50) ^ (j17 << 14)) & M57;
        jArr2[3] = ((j17 >>> 43) ^ (j18 << 21)) & M57;
        jArr2[4] = (j18 >>> 36) ^ (j19 << 28);
    }

    protected static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[5];
        implExpand(jArr, jArr4);
        implExpand(jArr2, jArr5);
        long[] jArr6 = new long[26];
        implMulw(jArr3, jArr4[0], jArr5[0], jArr6, 0);
        implMulw(jArr3, jArr4[1], jArr5[1], jArr6, 2);
        implMulw(jArr3, jArr4[2], jArr5[2], jArr6, 4);
        implMulw(jArr3, jArr4[3], jArr5[3], jArr6, 6);
        implMulw(jArr3, jArr4[4], jArr5[4], jArr6, 8);
        long j15 = jArr4[0];
        long j16 = j15 ^ jArr4[1];
        long j17 = jArr5[0];
        long j18 = j17 ^ jArr5[1];
        long j19 = jArr4[2];
        long j25 = j15 ^ j19;
        long j26 = jArr5[2];
        long j27 = j17 ^ j26;
        long j28 = jArr4[4];
        long j29 = j19 ^ j28;
        long j35 = jArr5[4];
        long j36 = j26 ^ j35;
        long j37 = jArr4[3];
        long j38 = j37 ^ j28;
        long j39 = jArr5[3];
        long j45 = j39 ^ j35;
        implMulw(jArr3, j25 ^ j37, j27 ^ j39, jArr6, 18);
        implMulw(jArr3, j29 ^ jArr4[1], j36 ^ jArr5[1], jArr6, 20);
        long j46 = j16 ^ j38;
        long j47 = j18 ^ j45;
        long j48 = j46 ^ jArr4[2];
        long j49 = jArr5[2] ^ j47;
        implMulw(jArr3, j46, j47, jArr6, 22);
        implMulw(jArr3, j48, j49, jArr6, 24);
        implMulw(jArr3, j16, j18, jArr6, 10);
        implMulw(jArr3, j25, j27, jArr6, 12);
        implMulw(jArr3, j29, j36, jArr6, 14);
        implMulw(jArr3, j38, j45, jArr6, 16);
        jArr3[0] = jArr6[0];
        jArr3[9] = jArr6[9];
        long j55 = jArr6[0];
        long j56 = jArr6[1] ^ j55;
        long j57 = jArr6[2] ^ j56;
        long j58 = jArr6[10] ^ j57;
        jArr3[1] = j58;
        long j59 = jArr6[3] ^ jArr6[4];
        long j65 = j57 ^ (j59 ^ (jArr6[11] ^ jArr6[12]));
        jArr3[2] = j65;
        long j66 = j56 ^ j59;
        long j67 = jArr6[5] ^ jArr6[6];
        long j68 = jArr6[8];
        long j69 = (j66 ^ j67) ^ j68;
        long j75 = jArr6[13] ^ jArr6[14];
        long j76 = jArr6[18];
        long j77 = jArr6[22];
        long j78 = jArr6[24];
        jArr3[3] = (j69 ^ j75) ^ ((j76 ^ j77) ^ j78);
        long j79 = jArr6[7] ^ j68;
        long j85 = jArr6[9];
        long j86 = j79 ^ j85;
        long j87 = j86 ^ jArr6[17];
        jArr3[8] = j87;
        long j88 = (j86 ^ j67) ^ (jArr6[15] ^ jArr6[16]);
        jArr3[7] = j88;
        long j89 = j88 ^ j58;
        long j95 = jArr6[19] ^ jArr6[20];
        long j96 = jArr6[25];
        long j97 = j96 ^ j78;
        long j98 = jArr6[23];
        long j99 = j95 ^ j97;
        jArr3[4] = (j99 ^ (j76 ^ j98)) ^ j89;
        long j100 = jArr6[21];
        jArr3[5] = ((j65 ^ j87) ^ j99) ^ (j100 ^ j77);
        jArr3[6] = (((((j69 ^ j55) ^ j85) ^ j75) ^ j100) ^ j98) ^ j96;
        implCompactExt(jArr3);
    }

    protected static void implMulw(long[] jArr, long j15, long j16, long[] jArr2, int i15) {
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
        long j26 = jArr[((int) j15) & 7];
        long j27 = 0;
        int i16 = 48;
        do {
            int i17 = (int) (j15 >>> i16);
            long j28 = (jArr[i17 & 7] ^ (jArr[(i17 >>> 3) & 7] << 3)) ^ (jArr[(i17 >>> 6) & 7] << 6);
            j26 ^= j28 << i16;
            j27 ^= j28 >>> (-i16);
            i16 -= 9;
        } while (i16 > 0);
        jArr2[i15] = M57 & j26;
        jArr2[i15 + 1] = (((((j15 & 72198606942111744L) & ((j16 << 7) >> 63)) >>> 8) ^ j27) << 7) ^ (j26 >>> 57);
    }

    protected static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr, 0, 4, jArr2, 0);
        jArr2[8] = Interleave.expand32to64((int) jArr[4]);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat320.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrCreate64 = Nat320.create64();
        long[] jArrCreate65 = Nat320.create64();
        square(jArr, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        squareN(jArrCreate64, 2, jArrCreate65);
        multiply(jArrCreate65, jArrCreate64, jArrCreate65);
        squareN(jArrCreate65, 4, jArrCreate64);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 8, jArrCreate65);
        multiply(jArrCreate65, jArrCreate64, jArrCreate65);
        square(jArrCreate65, jArrCreate65);
        multiply(jArrCreate65, jArr, jArrCreate65);
        squareN(jArrCreate65, 17, jArrCreate64);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        square(jArrCreate64, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        squareN(jArrCreate64, 35, jArrCreate65);
        multiply(jArrCreate65, jArrCreate64, jArrCreate65);
        squareN(jArrCreate65, 70, jArrCreate64);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        square(jArrCreate64, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        squareN(jArrCreate64, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_256_CBC_SHA, jArrCreate65);
        multiply(jArrCreate65, jArrCreate64, jArrCreate65);
        square(jArrCreate65, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat320.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat320.createExt64();
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
        long j28 = jArr[8];
        long j29 = j19 ^ ((((j28 >>> 27) ^ (j28 >>> 22)) ^ (j28 >>> 20)) ^ (j28 >>> 15));
        long j35 = j15 ^ ((((j25 << 37) ^ (j25 << 42)) ^ (j25 << 44)) ^ (j25 << 49));
        long j36 = (j16 ^ ((((j26 << 37) ^ (j26 << 42)) ^ (j26 << 44)) ^ (j26 << 49))) ^ ((((j25 >>> 27) ^ (j25 >>> 22)) ^ (j25 >>> 20)) ^ (j25 >>> 15));
        long j37 = j29 >>> 27;
        jArr2[0] = (((j35 ^ j37) ^ (j37 << 5)) ^ (j37 << 7)) ^ (j37 << 12);
        jArr2[1] = j36;
        jArr2[2] = (j17 ^ ((((j27 << 37) ^ (j27 << 42)) ^ (j27 << 44)) ^ (j27 << 49))) ^ ((((j26 >>> 27) ^ (j26 >>> 22)) ^ (j26 >>> 20)) ^ (j26 >>> 15));
        jArr2[3] = (j18 ^ ((((j28 << 37) ^ (j28 << 42)) ^ (j28 << 44)) ^ (j28 << 49))) ^ ((((j27 >>> 27) ^ (j27 >>> 22)) ^ (j27 >>> 20)) ^ (j27 >>> 15));
        jArr2[4] = M27 & j29;
    }

    public static void reduce37(long[] jArr, int i15) {
        int i16 = i15 + 4;
        long j15 = jArr[i16];
        long j16 = j15 >>> 27;
        jArr[i15] = ((j16 << 12) ^ (((j16 << 5) ^ j16) ^ (j16 << 7))) ^ jArr[i15];
        jArr[i16] = j15 & M27;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat320.create64();
        long jUnshuffle = Interleave.unshuffle(jArr[0]);
        long jUnshuffle2 = Interleave.unshuffle(jArr[1]);
        long j15 = (jUnshuffle & BodyPartID.bodyIdMax) | (jUnshuffle2 << 32);
        jArrCreate64[0] = (jUnshuffle >>> 32) | (jUnshuffle2 & (-4294967296L));
        long jUnshuffle3 = Interleave.unshuffle(jArr[2]);
        long jUnshuffle4 = Interleave.unshuffle(jArr[3]);
        long j16 = (jUnshuffle3 & BodyPartID.bodyIdMax) | (jUnshuffle4 << 32);
        jArrCreate64[1] = (jUnshuffle3 >>> 32) | ((-4294967296L) & jUnshuffle4);
        long jUnshuffle5 = Interleave.unshuffle(jArr[4]);
        long j17 = BodyPartID.bodyIdMax & jUnshuffle5;
        jArrCreate64[2] = jUnshuffle5 >>> 32;
        multiply(jArrCreate64, ROOT_Z, jArr2);
        jArr2[0] = jArr2[0] ^ j15;
        jArr2[1] = jArr2[1] ^ j16;
        jArr2[2] = jArr2[2] ^ j17;
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(9);
        implSquare(jArr, jArrCreate64);
        reduce(jArrCreate64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(9);
        implSquare(jArr, jArrCreate64);
        addExt(jArr2, jArrCreate64, jArr2);
    }

    public static void squareN(long[] jArr, int i15, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(9);
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
        return ((int) (jArr[0] ^ (jArr[4] >>> 15))) & 1;
    }
}
