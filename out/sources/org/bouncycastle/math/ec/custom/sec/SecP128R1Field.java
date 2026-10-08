package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat128;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class SecP128R1Field {
    private static final long M = 4294967295L;
    private static final int P3s1 = 2147483646;
    private static final int PExt7s1 = 2147483646;
    static final int[] P = {-1, -1, -1, -3};
    private static final int[] PExt = {1, 0, 0, 4, -2, -1, 3, -4};
    private static final int[] PExtInv = {-1, -1, -1, -5, 1, 0, -4, 3};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat128.add(iArr, iArr2, iArr3) != 0 || ((iArr3[3] >>> 1) >= 2147483646 && Nat128.gte(iArr3, P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.add(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= 2147483646 && Nat256.gte(iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            Nat.addTo(iArr4.length, iArr4, iArr3);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(4, iArr, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && Nat128.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
        long j15 = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j15;
        long j16 = j15 >> 32;
        if (j16 != 0) {
            long j17 = j16 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j17;
            long j18 = (j17 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j18;
            j16 = j18 >> 32;
        }
        iArr[3] = (int) (j16 + (4294967295L & ((long) iArr[3])) + 2);
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat128.fromBigInteger(bigInteger);
        if ((iArrFromBigInteger[3] >>> 1) >= 2147483646) {
            int[] iArr = P;
            if (Nat128.gte(iArrFromBigInteger, iArr)) {
                Nat128.subFrom(iArr, iArrFromBigInteger);
            }
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(4, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(4, iArr2, Nat128.add(iArr, P, iArr2));
        }
    }

    public static void inv(int[] iArr, int[] iArr2) {
        Mod.checkedModOddInverse(P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i15 = 0;
        for (int i16 = 0; i16 < 4; i16++) {
            i15 |= iArr[i16];
        }
        return (((i15 >>> 1) | (i15 & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreateExt = Nat128.createExt();
        Nat128.mul(iArr, iArr2, iArrCreateExt);
        reduce(iArrCreateExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat128.mulAddTo(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= 2147483646 && Nat256.gte(iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            Nat.addTo(iArr4.length, iArr4, iArr3);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            Nat128.sub(P, iArr, iArr2);
        } else {
            int[] iArr3 = P;
            Nat128.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[16];
        do {
            secureRandom.nextBytes(bArr);
            Pack.littleEndianToInt(bArr, 0, iArr, 0, 4);
        } while (Nat.lessThan(4, iArr, P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j15 = ((long) iArr[0]) & 4294967295L;
        long j16 = ((long) iArr[1]) & 4294967295L;
        long j17 = ((long) iArr[2]) & 4294967295L;
        long j18 = ((long) iArr[3]) & 4294967295L;
        long j19 = ((long) iArr[4]) & 4294967295L;
        long j25 = ((long) iArr[5]) & 4294967295L;
        long j26 = ((long) iArr[6]) & 4294967295L;
        long j27 = ((long) iArr[7]) & 4294967295L;
        long j28 = j18 + j27;
        long j29 = j26 + (j27 << 1);
        long j35 = j25 + (j29 << 1);
        long j36 = j16 + j35;
        long j37 = j19 + (j35 << 1);
        long j38 = j15 + j37;
        iArr2[0] = (int) j38;
        long j39 = j36 + (j38 >>> 32);
        iArr2[1] = (int) j39;
        long j45 = j17 + j29 + (j39 >>> 32);
        iArr2[2] = (int) j45;
        long j46 = j28 + (j37 << 1) + (j45 >>> 32);
        iArr2[3] = (int) j46;
        reduce32((int) (j46 >>> 32), iArr2);
    }

    public static void reduce32(int i15, int[] iArr) {
        while (i15 != 0) {
            long j15 = ((long) i15) & 4294967295L;
            long j16 = (((long) iArr[0]) & 4294967295L) + j15;
            iArr[0] = (int) j16;
            long j17 = j16 >> 32;
            if (j17 != 0) {
                long j18 = j17 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j18;
                long j19 = (j18 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j19;
                j17 = j19 >> 32;
            }
            long j25 = j17 + (4294967295L & ((long) iArr[3])) + (j15 << 1);
            iArr[3] = (int) j25;
            i15 = (int) (j25 >> 32);
        }
        if ((iArr[3] >>> 1) < 2147483646 || !Nat128.gte(iArr, P)) {
            return;
        }
        addPInvTo(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreateExt = Nat128.createExt();
        Nat128.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
    }

    public static void squareN(int[] iArr, int i15, int[] iArr2) {
        int[] iArrCreateExt = Nat128.createExt();
        Nat128.square(iArr, iArrCreateExt);
        while (true) {
            reduce(iArrCreateExt, iArr2);
            i15--;
            if (i15 <= 0) {
                return;
            } else {
                Nat128.square(iArr2, iArrCreateExt);
            }
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j15 = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j15;
        long j16 = j15 >> 32;
        if (j16 != 0) {
            long j17 = j16 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j17;
            long j18 = (j17 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j18;
            j16 = j18 >> 32;
        }
        iArr[3] = (int) (j16 + ((4294967295L & ((long) iArr[3])) - 2));
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat128.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(10, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            Nat.subFrom(iArr4.length, iArr4, iArr3);
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(4, iArr, 0, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && Nat128.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }
}
