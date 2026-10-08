package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Nat448 {
    public static void copy64(long[] jArr, int i15, long[] jArr2, int i16) {
        jArr2[i16] = jArr[i15];
        jArr2[i16 + 1] = jArr[i15 + 1];
        jArr2[i16 + 2] = jArr[i15 + 2];
        jArr2[i16 + 3] = jArr[i15 + 3];
        jArr2[i16 + 4] = jArr[i15 + 4];
        jArr2[i16 + 5] = jArr[i15 + 5];
        jArr2[i16 + 6] = jArr[i15 + 6];
    }

    public static long[] create64() {
        return new long[7];
    }

    public static long[] createExt64() {
        return new long[14];
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i15 = 6; i15 >= 0; i15--) {
            if (jArr[i15] != jArr2[i15]) {
                return false;
            }
        }
        return true;
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 448) {
            throw new IllegalArgumentException();
        }
        long[] jArrCreate64 = create64();
        for (int i15 = 0; i15 < 7; i15++) {
            jArrCreate64[i15] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
        }
        return jArrCreate64;
    }

    public static boolean isOne64(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i15 = 1; i15 < 7; i15++) {
            if (jArr[i15] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i15 = 0; i15 < 7; i15++) {
            if (jArr[i15] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        Nat224.mul(iArr, iArr2, iArr3);
        Nat224.mul(iArr, 7, iArr2, 7, iArr3, 14);
        int iAddToEachOther = Nat224.addToEachOther(iArr3, 7, iArr3, 14);
        int iAddTo = iAddToEachOther + Nat224.addTo(iArr3, 21, iArr3, 14, Nat224.addTo(iArr3, 0, iArr3, 7, 0) + iAddToEachOther);
        int[] iArrCreate = Nat224.create();
        int[] iArrCreate2 = Nat224.create();
        boolean z15 = Nat224.diff(iArr, 7, iArr, 0, iArrCreate, 0) != Nat224.diff(iArr2, 7, iArr2, 0, iArrCreate2, 0);
        int[] iArrCreateExt = Nat224.createExt();
        Nat224.mul(iArrCreate, iArrCreate2, iArrCreateExt);
        Nat.addWordAt(28, iAddTo + (z15 ? Nat.addTo(14, iArrCreateExt, 0, iArr3, 7) : Nat.subFrom(14, iArrCreateExt, 0, iArr3, 7)), iArr3, 21);
    }

    public static void square(int[] iArr, int[] iArr2) {
        Nat224.square(iArr, iArr2);
        Nat224.square(iArr, 7, iArr2, 14);
        int iAddToEachOther = Nat224.addToEachOther(iArr2, 7, iArr2, 14);
        int iAddTo = iAddToEachOther + Nat224.addTo(iArr2, 21, iArr2, 14, Nat224.addTo(iArr2, 0, iArr2, 7, 0) + iAddToEachOther);
        int[] iArrCreate = Nat224.create();
        Nat224.diff(iArr, 7, iArr, 0, iArrCreate, 0);
        int[] iArrCreateExt = Nat224.createExt();
        Nat224.square(iArrCreate, iArrCreateExt);
        Nat.addWordAt(28, iAddTo + Nat.subFrom(14, iArrCreateExt, 0, iArr2, 7), iArr2, 21);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[56];
        for (int i15 = 0; i15 < 7; i15++) {
            long j15 = jArr[i15];
            if (j15 != 0) {
                Pack.longToBigEndian(j15, bArr, (6 - i15) << 3);
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
    }
}
