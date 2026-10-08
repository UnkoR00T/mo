package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat192;

/* JADX INFO: loaded from: classes5.dex */
public class SecT131Field {
    private static final long M03 = 7;
    private static final long M44 = 17592186044415L;
    private static final long[] ROOT_Z = {2791191049453778211L, 2791191049453778402L, 6};

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
        jArr3[4] = jArr2[4] ^ jArr[4];
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
        return Nat.fromBigInteger64(131, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(5);
        Nat192.copy64(jArr, jArr2);
        for (int i15 = 1; i15 < 131; i15 += 2) {
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
        jArr[0] = j15 ^ (j16 << 44);
        jArr[1] = (j16 >>> 20) ^ (j17 << 24);
        jArr[2] = ((j17 >>> 40) ^ (j18 << 4)) ^ (j19 << 48);
        jArr[3] = ((j18 >>> 60) ^ (j25 << 28)) ^ (j19 >>> 16);
        jArr[4] = j25 >>> 36;
        jArr[5] = 0;
    }

    protected static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long j15 = jArr[0];
        long j16 = jArr[1];
        long j17 = ((jArr[2] << 40) ^ (j16 >>> 24)) & M44;
        long j18 = ((j15 >>> 44) ^ (j16 << 20)) & M44;
        long j19 = j15 & M44;
        long j25 = jArr2[0];
        long j26 = jArr2[1];
        long j27 = ((j26 >>> 24) ^ (jArr2[2] << 40)) & M44;
        long j28 = ((j25 >>> 44) ^ (j26 << 20)) & M44;
        long j29 = j25 & M44;
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
        long j67 = (((j57 ^ j49) ^ (j66 << 4)) ^ (j66 << 1)) ^ (j65 >>> 44);
        long j68 = (j58 ^ j47) ^ (j67 >>> 44);
        long j69 = ((j65 & M44) >>> 1) ^ ((j67 & 1) << 43);
        long j75 = ((j67 & M44) >>> 1) ^ ((j68 & 1) << 43);
        long j76 = j69 ^ (j69 << 1);
        long j77 = j76 ^ (j76 << 2);
        long j78 = j77 ^ (j77 << 4);
        long j79 = j78 ^ (j78 << 8);
        long j85 = j79 ^ (j79 << 16);
        long j86 = (j85 ^ (j85 << 32)) & M44;
        long j87 = j75 ^ (j86 >>> 43);
        long j88 = j87 ^ (j87 << 1);
        long j89 = j88 ^ (j88 << 2);
        long j95 = j89 ^ (j89 << 4);
        long j96 = j95 ^ (j95 << 8);
        long j97 = j96 ^ (j96 << 16);
        long j98 = (j97 ^ (j97 << 32)) & M44;
        long j99 = (j98 >>> 43) ^ (j68 >>> 1);
        long j100 = j99 ^ (j99 << 1);
        long j101 = j100 ^ (j100 << 2);
        long j102 = j101 ^ (j101 << 4);
        long j103 = j102 ^ (j102 << 8);
        long j104 = j103 ^ (j103 << 16);
        long j105 = j104 ^ (j104 << 32);
        jArr3[0] = j55;
        jArr3[1] = (j57 ^ j86) ^ j59;
        jArr3[2] = ((j58 ^ j98) ^ j86) ^ j66;
        jArr3[3] = j105 ^ j98;
        jArr3[4] = jArr4[2] ^ j105;
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
        int i16 = (int) j15;
        long j26 = (((jArr[i16 & 7] ^ (jArr[(i16 >>> 3) & 7] << 3)) ^ (jArr[(i16 >>> 6) & 7] << 6)) ^ (jArr[(i16 >>> 9) & 7] << 9)) ^ (jArr[(i16 >>> 12) & 7] << 12);
        long j27 = 0;
        int i17 = 30;
        do {
            int i18 = (int) (j15 >>> i17);
            long j28 = (((jArr[i18 & 7] ^ (jArr[(i18 >>> 3) & 7] << 3)) ^ (jArr[(i18 >>> 6) & 7] << 6)) ^ (jArr[(i18 >>> 9) & 7] << 9)) ^ (jArr[(i18 >>> 12) & 7] << 12);
            j26 ^= j28 << i17;
            j27 ^= j28 >>> (-i17);
            i17 -= 15;
        } while (i17 > 0);
        jArr2[i15] = M44 & j26;
        jArr2[i15 + 1] = (j26 >>> 44) ^ (j27 << 20);
    }

    protected static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr, 0, 2, jArr2, 0);
        jArr2[4] = ((long) Interleave.expand8to16((int) jArr[2])) & BodyPartID.bodyIdMax;
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat192.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrCreate64 = Nat192.create64();
        long[] jArrCreate65 = Nat192.create64();
        square(jArr, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        squareN(jArrCreate64, 2, jArrCreate65);
        multiply(jArrCreate65, jArrCreate64, jArrCreate65);
        squareN(jArrCreate65, 4, jArrCreate64);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 8, jArrCreate65);
        multiply(jArrCreate65, jArrCreate64, jArrCreate65);
        squareN(jArrCreate65, 16, jArrCreate64);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 32, jArrCreate65);
        multiply(jArrCreate65, jArrCreate64, jArrCreate65);
        square(jArrCreate65, jArrCreate65);
        multiply(jArrCreate65, jArr, jArrCreate65);
        squareN(jArrCreate65, 65, jArrCreate64);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        square(jArrCreate64, jArr2);
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
        long j25 = j18 ^ (j19 >>> 59);
        long j26 = j15 ^ ((j25 << 61) ^ (j25 << 63));
        long j27 = (j16 ^ ((j19 << 61) ^ (j19 << 63))) ^ ((((j25 >>> 3) ^ (j25 >>> 1)) ^ j25) ^ (j25 << 5));
        long j28 = (j17 ^ ((((j19 >>> 3) ^ (j19 >>> 1)) ^ j19) ^ (j19 << 5))) ^ (j25 >>> 59);
        long j29 = j28 >>> 3;
        jArr2[0] = (((j26 ^ j29) ^ (j29 << 2)) ^ (j29 << 3)) ^ (j29 << 8);
        jArr2[1] = (j28 >>> 59) ^ j27;
        jArr2[2] = M03 & j28;
    }

    public static void reduce61(long[] jArr, int i15) {
        int i16 = i15 + 2;
        long j15 = jArr[i16];
        long j16 = j15 >>> 3;
        jArr[i15] = ((j16 << 8) ^ (((j16 << 2) ^ j16) ^ (j16 << 3))) ^ jArr[i15];
        int i17 = i15 + 1;
        jArr[i17] = jArr[i17] ^ (j15 >>> 59);
        jArr[i16] = j15 & M03;
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
        long[] jArrCreate64 = Nat.create64(5);
        implSquare(jArr, jArrCreate64);
        reduce(jArrCreate64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(5);
        implSquare(jArr, jArrCreate64);
        addExt(jArr2, jArrCreate64, jArr2);
    }

    public static void squareN(long[] jArr, int i15, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(5);
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
        return ((int) ((jArr[0] ^ (jArr[1] >>> 59)) ^ (jArr[2] >>> 1))) & 1;
    }
}
