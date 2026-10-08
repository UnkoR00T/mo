package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat192;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class SecP192R1Field {
    private static final long M = 4294967295L;
    private static final int P5 = -1;
    private static final int PExt11 = -1;
    static final int[] P = {-1, -1, -2, -1, -1, -1};
    private static final int[] PExt = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};
    private static final int[] PExtInv = {-1, -1, -3, -1, -2, -1, 1, 0, 2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat192.add(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && Nat192.gte(iArr3, P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && Nat.gte(12, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(12, iArr3, iArr4.length);
            }
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && Nat192.gte(iArr2, P))) {
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
            j16 = j17 >> 32;
        }
        long j18 = j16 + (4294967295L & ((long) iArr[2])) + 1;
        iArr[2] = (int) j18;
        if ((j18 >> 32) != 0) {
            Nat.incAt(6, iArr, 3);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat192.fromBigInteger(bigInteger);
        if (iArrFromBigInteger[5] == -1) {
            int[] iArr = P;
            if (Nat192.gte(iArrFromBigInteger, iArr)) {
                Nat192.subFrom(iArr, iArrFromBigInteger);
            }
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(6, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(6, iArr2, Nat192.add(iArr, P, iArr2));
        }
    }

    public static void inv(int[] iArr, int[] iArr2) {
        Mod.checkedModOddInverse(P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i15 = 0;
        for (int i16 = 0; i16 < 6; i16++) {
            i15 |= iArr[i16];
        }
        return (((i15 >>> 1) | (i15 & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreateExt = Nat192.createExt();
        Nat192.mul(iArr, iArr2, iArrCreateExt);
        reduce(iArrCreateExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat192.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && Nat.gte(12, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(12, iArr3, iArr4.length);
            }
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            Nat192.sub(P, iArr, iArr2);
        } else {
            int[] iArr3 = P;
            Nat192.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[24];
        do {
            secureRandom.nextBytes(bArr);
            Pack.littleEndianToInt(bArr, 0, iArr, 0, 6);
        } while (Nat.lessThan(6, iArr, P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j15 = ((long) iArr[6]) & 4294967295L;
        long j16 = ((long) iArr[7]) & 4294967295L;
        long j17 = ((long) iArr[8]) & 4294967295L;
        long j18 = ((long) iArr[9]) & 4294967295L;
        long j19 = (((long) iArr[10]) & 4294967295L) + j15;
        long j25 = (((long) iArr[11]) & 4294967295L) + j16;
        long j26 = (((long) iArr[0]) & 4294967295L) + j19;
        int i15 = (int) j26;
        long j27 = (j26 >> 32) + (((long) iArr[1]) & 4294967295L) + j25;
        int i16 = (int) j27;
        iArr2[1] = i16;
        long j28 = j19 + j17;
        long j29 = j25 + j18;
        long j35 = (j27 >> 32) + (((long) iArr[2]) & 4294967295L) + j28;
        long j36 = j35 & 4294967295L;
        long j37 = (j35 >> 32) + (((long) iArr[3]) & 4294967295L) + j29;
        iArr2[3] = (int) j37;
        long j38 = (j37 >> 32) + (((long) iArr[4]) & 4294967295L) + (j28 - j15);
        iArr2[4] = (int) j38;
        long j39 = (j38 >> 32) + (((long) iArr[5]) & 4294967295L) + (j29 - j16);
        iArr2[5] = (int) j39;
        long j45 = j39 >> 32;
        long j46 = j36 + j45;
        long j47 = j45 + (((long) i15) & 4294967295L);
        iArr2[0] = (int) j47;
        long j48 = j47 >> 32;
        if (j48 != 0) {
            long j49 = j48 + (((long) i16) & 4294967295L);
            iArr2[1] = (int) j49;
            j46 += j49 >> 32;
        }
        iArr2[2] = (int) j46;
        if (((j46 >> 32) == 0 || Nat.incAt(6, iArr2, 3) == 0) && !(iArr2[5] == -1 && Nat192.gte(iArr2, P))) {
            return;
        }
        addPInvTo(iArr2);
    }

    public static void reduce32(int i15, int[] iArr) {
        long j15;
        if (i15 != 0) {
            long j16 = ((long) i15) & 4294967295L;
            long j17 = (((long) iArr[0]) & 4294967295L) + j16;
            iArr[0] = (int) j17;
            long j18 = j17 >> 32;
            if (j18 != 0) {
                long j19 = j18 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j19;
                j18 = j19 >> 32;
            }
            long j25 = j18 + (4294967295L & ((long) iArr[2])) + j16;
            iArr[2] = (int) j25;
            j15 = j25 >> 32;
        } else {
            j15 = 0;
        }
        if ((j15 == 0 || Nat.incAt(6, iArr, 3) == 0) && !(iArr[5] == -1 && Nat192.gte(iArr, P))) {
            return;
        }
        addPInvTo(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreateExt = Nat192.createExt();
        Nat192.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
    }

    public static void squareN(int[] iArr, int i15, int[] iArr2) {
        int[] iArrCreateExt = Nat192.createExt();
        Nat192.square(iArr, iArrCreateExt);
        while (true) {
            reduce(iArrCreateExt, iArr2);
            i15--;
            if (i15 <= 0) {
                return;
            } else {
                Nat192.square(iArr2, iArrCreateExt);
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
            j16 = j17 >> 32;
        }
        long j18 = j16 + ((4294967295L & ((long) iArr[2])) - 1);
        iArr[2] = (int) j18;
        if ((j18 >> 32) != 0) {
            Nat.decAt(6, iArr, 3);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat192.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(12, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            if (Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                Nat.decAt(12, iArr3, iArr4.length);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && Nat192.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }
}
