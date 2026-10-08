package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat192;

/* JADX INFO: loaded from: classes5.dex */
public class SecT163Field {
    private static final long M35 = 34359738367L;
    private static final long M55 = 36028797018963967L;
    private static final long[] ROOT_Z = {-5270498306774157648L, 5270498306774195053L, 19634136210L};

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr2[2] ^ jArr[2];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr2[5] ^ jArr[5];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    private static void addTo(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return Nat.fromBigInteger64(163, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat192.createExt64();
        Nat192.copy64(jArr, jArr2);
        for (int i15 = 1; i15 < 163; i15 += 2) {
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
        jArr[0] = j15 ^ (j16 << 55);
        jArr[1] = (j16 >>> 9) ^ (j17 << 46);
        jArr[2] = (j17 >>> 18) ^ (j18 << 37);
        jArr[3] = (j18 >>> 27) ^ (j19 << 28);
        jArr[4] = (j19 >>> 36) ^ (j25 << 19);
        jArr[5] = j25 >>> 45;
    }

    protected static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long j15 = jArr[0];
        long j16 = jArr[1];
        long j17 = (j16 >>> 46) ^ (jArr[2] << 18);
        long j18 = ((j16 << 9) ^ (j15 >>> 55)) & M55;
        long j19 = j15 & M55;
        long j25 = jArr2[0];
        long j26 = jArr2[1];
        long j27 = (j26 >>> 46) ^ (jArr2[2] << 18);
        long j28 = ((j25 >>> 55) ^ (j26 << 9)) & M55;
        long j29 = j25 & M55;
        long[] jArr4 = new long[10];
        implMulw(jArr3, j19, j29, jArr4, 0);
        implMulw(jArr3, j17, j27, jArr4, 2);
        long j35 = (j19 ^ j18) ^ j17;
        long j36 = (j29 ^ j28) ^ j27;
        implMulw(jArr3, j35, j36, jArr4, 4);
        long j37 = (j18 << 1) ^ (j17 << 2);
        long j38 = (j28 << 1) ^ (j27 << 2);
        implMulw(jArr3, j19 ^ j37, j29 ^ j38, jArr4, 6);
        implMulw(jArr3, j35 ^ j37, j36 ^ j38, jArr4, 8);
        long j39 = jArr4[6];
        long j45 = jArr4[8] ^ j39;
        long j46 = jArr4[7];
        long j47 = jArr4[9] ^ j46;
        long j48 = (j45 << 1) ^ j39;
        long j49 = (j45 ^ (j47 << 1)) ^ j46;
        long j55 = jArr4[0];
        long j56 = jArr4[1];
        long j57 = (j56 ^ j55) ^ jArr4[4];
        long j58 = j56 ^ jArr4[5];
        long j59 = jArr4[2];
        long j65 = ((j48 ^ j55) ^ (j59 << 4)) ^ (j59 << 1);
        long j66 = jArr4[3];
        long j67 = (((j57 ^ j49) ^ (j66 << 4)) ^ (j66 << 1)) ^ (j65 >>> 55);
        long j68 = j65 & M55;
        long j69 = (j58 ^ j47) ^ (j67 >>> 55);
        long j75 = (j68 >>> 1) ^ ((j67 & 1) << 54);
        long j76 = ((j67 & M55) >>> 1) ^ ((j69 & 1) << 54);
        long j77 = j75 ^ (j75 << 1);
        long j78 = j77 ^ (j77 << 2);
        long j79 = j78 ^ (j78 << 4);
        long j85 = j79 ^ (j79 << 8);
        long j86 = j85 ^ (j85 << 16);
        long j87 = (j86 ^ (j86 << 32)) & M55;
        long j88 = j76 ^ (j87 >>> 54);
        long j89 = j88 ^ (j88 << 1);
        long j95 = j89 ^ (j89 << 2);
        long j96 = j95 ^ (j95 << 4);
        long j97 = j96 ^ (j96 << 8);
        long j98 = j97 ^ (j97 << 16);
        long j99 = M55 & (j98 ^ (j98 << 32));
        long j100 = (j69 >>> 1) ^ (j99 >>> 54);
        long j101 = j100 ^ (j100 << 1);
        long j102 = j101 ^ (j101 << 2);
        long j103 = j102 ^ (j102 << 4);
        long j104 = j103 ^ (j103 << 8);
        long j105 = j104 ^ (j104 << 16);
        long j106 = j105 ^ (j105 << 32);
        jArr3[0] = j55;
        jArr3[1] = (j57 ^ j87) ^ j59;
        jArr3[2] = ((j58 ^ j99) ^ j87) ^ j66;
        jArr3[3] = j106 ^ j99;
        jArr3[4] = jArr4[2] ^ j106;
        jArr3[5] = jArr4[3];
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
        long j26 = jArr[((int) j15) & 3];
        long j27 = 0;
        int i16 = 47;
        do {
            int i17 = (int) (j15 >>> i16);
            long j28 = (jArr[i17 & 7] ^ (jArr[(i17 >>> 3) & 7] << 3)) ^ (jArr[(i17 >>> 6) & 7] << 6);
            j26 ^= j28 << i16;
            j27 ^= j28 >>> (-i16);
            i16 -= 9;
        } while (i16 > 0);
        jArr2[i15] = M55 & j26;
        jArr2[i15 + 1] = (j26 >>> 55) ^ (j27 << 9);
    }

    protected static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr, 0, 3, jArr2, 0);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat192.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrCreate64 = Nat192.create64();
        long[] jArrCreate65 = Nat192.create64();
        square(jArr, jArrCreate64);
        squareN(jArrCreate64, 1, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate65, 1, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 3, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate65, 3, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 9, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate65, 9, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 27, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate65, 27, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 81, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        implMultiply(jArr, jArr2, jArr4);
        reduce(jArr4, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        implMultiply(jArr, jArr2, jArr4);
        addExt(jArr3, jArr4, jArr3);
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        long j15 = jArr[0];
        long j16 = jArr[1];
        long j17 = jArr[2];
        long j18 = jArr[3];
        long j19 = jArr[4];
        long j25 = jArr[5];
        long j26 = j18 ^ ((((j25 >>> 35) ^ (j25 >>> 32)) ^ (j25 >>> 29)) ^ (j25 >>> 28));
        long j27 = (j17 ^ ((((j25 << 29) ^ (j25 << 32)) ^ (j25 << 35)) ^ (j25 << 36))) ^ ((j19 >>> 28) ^ (((j19 >>> 35) ^ (j19 >>> 32)) ^ (j19 >>> 29)));
        long j28 = j15 ^ ((((j26 << 29) ^ (j26 << 32)) ^ (j26 << 35)) ^ (j26 << 36));
        long j29 = (j16 ^ ((((j19 << 29) ^ (j19 << 32)) ^ (j19 << 35)) ^ (j19 << 36))) ^ ((j26 >>> 28) ^ (((j26 >>> 35) ^ (j26 >>> 32)) ^ (j26 >>> 29)));
        long j35 = j27 >>> 35;
        jArr2[0] = (((j28 ^ j35) ^ (j35 << 3)) ^ (j35 << 6)) ^ (j35 << 7);
        jArr2[1] = j29;
        jArr2[2] = M35 & j27;
    }

    public static void reduce29(long[] jArr, int i15) {
        int i16 = i15 + 2;
        long j15 = jArr[i16];
        long j16 = j15 >>> 35;
        jArr[i15] = ((j16 << 7) ^ (((j16 << 3) ^ j16) ^ (j16 << 6))) ^ jArr[i15];
        jArr[i16] = j15 & M35;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat192.create64();
        long jUnshuffle = Interleave.unshuffle(jArr[0]);
        long jUnshuffle2 = Interleave.unshuffle(jArr[1]);
        long j15 = (jUnshuffle & BodyPartID.bodyIdMax) | (jUnshuffle2 << 32);
        jArrCreate64[0] = (jUnshuffle >>> 32) | (jUnshuffle2 & (-4294967296L));
        long jUnshuffle3 = Interleave.unshuffle(jArr[2]);
        long j16 = jUnshuffle3 & BodyPartID.bodyIdMax;
        jArrCreate64[1] = jUnshuffle3 >>> 32;
        multiply(jArrCreate64, ROOT_Z, jArr2);
        jArr2[0] = jArr2[0] ^ j15;
        jArr2[1] = jArr2[1] ^ j16;
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat192.createExt64();
        implSquare(jArr, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat192.createExt64();
        implSquare(jArr, jArrCreateExt64);
        addExt(jArr2, jArrCreateExt64, jArr2);
    }

    public static void squareN(long[] jArr, int i15, long[] jArr2) {
        long[] jArrCreateExt64 = Nat192.createExt64();
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
        return ((int) (jArr[0] ^ (jArr[2] >>> 29))) & 1;
    }
}
