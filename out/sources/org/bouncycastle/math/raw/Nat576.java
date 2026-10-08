package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Nat576 {
    public static void copy64(long[] jArr, int i15, long[] jArr2, int i16) {
        jArr2[i16] = jArr[i15];
        jArr2[i16 + 1] = jArr[i15 + 1];
        jArr2[i16 + 2] = jArr[i15 + 2];
        jArr2[i16 + 3] = jArr[i15 + 3];
        jArr2[i16 + 4] = jArr[i15 + 4];
        jArr2[i16 + 5] = jArr[i15 + 5];
        jArr2[i16 + 6] = jArr[i15 + 6];
        jArr2[i16 + 7] = jArr[i15 + 7];
        jArr2[i16 + 8] = jArr[i15 + 8];
    }

    public static long[] create64() {
        return new long[9];
    }

    public static long[] createExt64() {
        return new long[18];
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i15 = 8; i15 >= 0; i15--) {
            if (jArr[i15] != jArr2[i15]) {
                return false;
            }
        }
        return true;
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 576) {
            throw new IllegalArgumentException();
        }
        long[] jArrCreate64 = create64();
        for (int i15 = 0; i15 < 9; i15++) {
            jArrCreate64[i15] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
        }
        return jArrCreate64;
    }

    public static boolean isOne64(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i15 = 1; i15 < 9; i15++) {
            if (jArr[i15] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i15 = 0; i15 < 9; i15++) {
            if (jArr[i15] != 0) {
                return false;
            }
        }
        return true;
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[72];
        for (int i15 = 0; i15 < 9; i15++) {
            long j15 = jArr[i15];
            if (j15 != 0) {
                Pack.longToBigEndian(j15, bArr, (8 - i15) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
        jArr2[5] = jArr[5];
        jArr2[6] = jArr[6];
        jArr2[7] = jArr[7];
        jArr2[8] = jArr[8];
    }
}
