package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat128;

/* JADX INFO: loaded from: classes5.dex */
public class SecT113Field {
    private static final long M49 = 562949953421311L;
    private static final long M57 = 144115188075855871L;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
    }

    private static void addTo(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return Nat.fromBigInteger64(113, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat128.createExt64();
        Nat128.copy64(jArr, jArr2);
        for (int i15 = 1; i15 < 113; i15 += 2) {
            implSquare(jArr2, jArrCreateExt64);
            reduce(jArrCreateExt64, jArr2);
            implSquare(jArr2, jArrCreateExt64);
            reduce(jArrCreateExt64, jArr2);
            addTo(jArr, jArr2);
        }
    }

    protected static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long j15 = jArr[0];
        long j16 = ((jArr[1] << 7) ^ (j15 >>> 57)) & M57;
        long j17 = j15 & M57;
        long j18 = jArr2[0];
        long j19 = ((j18 >>> 57) ^ (jArr2[1] << 7)) & M57;
        long j25 = j18 & M57;
        long[] jArr4 = new long[6];
        implMulw(jArr3, j17, j25, jArr4, 0);
        implMulw(jArr3, j16, j19, jArr4, 2);
        implMulw(jArr3, j17 ^ j16, j25 ^ j19, jArr4, 4);
        long j26 = jArr4[1] ^ jArr4[2];
        long j27 = jArr4[0];
        long j28 = jArr4[3];
        long j29 = (jArr4[4] ^ j27) ^ j26;
        long j35 = j26 ^ (jArr4[5] ^ j28);
        jArr3[0] = j27 ^ (j29 << 57);
        jArr3[1] = (j29 >>> 7) ^ (j35 << 50);
        jArr3[2] = (j35 >>> 14) ^ (j28 << 43);
        jArr3[3] = j28 >>> 21;
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
        Interleave.expand64To128(jArr, 0, 2, jArr2, 0);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat128.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrCreate64 = Nat128.create64();
        long[] jArrCreate65 = Nat128.create64();
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
        squareN(jArrCreate65, 28, jArrCreate64);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 56, jArrCreate65);
        multiply(jArrCreate65, jArrCreate64, jArrCreate65);
        square(jArrCreate65, jArr2);
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
        long j19 = j17 ^ ((j18 >>> 40) ^ (j18 >>> 49));
        long j25 = j15 ^ ((j19 << 15) ^ (j19 << 24));
        long j26 = (j16 ^ ((j18 << 15) ^ (j18 << 24))) ^ ((j19 >>> 40) ^ (j19 >>> 49));
        long j27 = j26 >>> 49;
        jArr2[0] = (j25 ^ j27) ^ (j27 << 9);
        jArr2[1] = M49 & j26;
    }

    public static void reduce15(long[] jArr, int i15) {
        int i16 = i15 + 1;
        long j15 = jArr[i16];
        long j16 = j15 >>> 49;
        jArr[i15] = (j16 ^ (j16 << 9)) ^ jArr[i15];
        jArr[i16] = j15 & M49;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long jUnshuffle = Interleave.unshuffle(jArr[0]);
        long jUnshuffle2 = Interleave.unshuffle(jArr[1]);
        long j15 = (BodyPartID.bodyIdMax & jUnshuffle) | (jUnshuffle2 << 32);
        long j16 = (jUnshuffle >>> 32) | (jUnshuffle2 & (-4294967296L));
        jArr2[0] = ((j16 << 57) ^ j15) ^ (j16 << 5);
        jArr2[1] = (j16 >>> 59) ^ (j16 >>> 7);
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat128.createExt64();
        implSquare(jArr, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat128.createExt64();
        implSquare(jArr, jArrCreateExt64);
        addExt(jArr2, jArrCreateExt64, jArr2);
    }

    public static void squareN(long[] jArr, int i15, long[] jArr2) {
        long[] jArrCreateExt64 = Nat128.createExt64();
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
