package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat224;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class SecP224R1Field {
    private static final long M = 4294967295L;
    private static final int P6 = -1;
    private static final int PExt13 = -1;
    static final int[] P = {1, 0, 0, -1, -1, -1, -1};
    private static final int[] PExt = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};
    private static final int[] PExtInv = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat224.add(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && Nat224.gte(iArr3, P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(14, iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && Nat.gte(14, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && Nat224.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
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
        long j19 = j16 + (4294967295L & ((long) iArr[3])) + 1;
        iArr[3] = (int) j19;
        if ((j19 >> 32) != 0) {
            Nat.incAt(7, iArr, 4);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat224.fromBigInteger(bigInteger);
        if (iArrFromBigInteger[6] == -1) {
            int[] iArr = P;
            if (Nat224.gte(iArrFromBigInteger, iArr)) {
                Nat224.subFrom(iArr, iArrFromBigInteger);
            }
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(7, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(7, iArr2, Nat224.add(iArr, P, iArr2));
        }
    }

    public static void inv(int[] iArr, int[] iArr2) {
        Mod.checkedModOddInverse(P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i15 = 0;
        for (int i16 = 0; i16 < 7; i16++) {
            i15 |= iArr[i16];
        }
        return (((i15 >>> 1) | (i15 & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreateExt = Nat224.createExt();
        Nat224.mul(iArr, iArr2, iArrCreateExt);
        reduce(iArrCreateExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat224.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && Nat.gte(14, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            Nat224.sub(P, iArr, iArr2);
        } else {
            int[] iArr3 = P;
            Nat224.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[28];
        do {
            secureRandom.nextBytes(bArr);
            Pack.littleEndianToInt(bArr, 0, iArr, 0, 7);
        } while (Nat.lessThan(7, iArr, P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j15 = ((long) iArr[10]) & 4294967295L;
        long j16 = ((long) iArr[11]) & 4294967295L;
        long j17 = ((long) iArr[12]) & 4294967295L;
        long j18 = ((long) iArr[13]) & 4294967295L;
        long j19 = ((((long) iArr[7]) & 4294967295L) + j16) - 1;
        long j25 = (((long) iArr[8]) & 4294967295L) + j17;
        long j26 = (((long) iArr[9]) & 4294967295L) + j18;
        long j27 = (((long) iArr[0]) & 4294967295L) - j19;
        long j28 = j27 & 4294967295L;
        long j29 = (j27 >> 32) + ((((long) iArr[1]) & 4294967295L) - j25);
        int i15 = (int) j29;
        iArr2[1] = i15;
        long j35 = (j29 >> 32) + ((((long) iArr[2]) & 4294967295L) - j26);
        int i16 = (int) j35;
        iArr2[2] = i16;
        long j36 = (j35 >> 32) + (((((long) iArr[3]) & 4294967295L) + j19) - j15);
        long j37 = j36 & 4294967295L;
        long j38 = (j36 >> 32) + (((((long) iArr[4]) & 4294967295L) + j25) - j16);
        iArr2[4] = (int) j38;
        long j39 = (j38 >> 32) + (((((long) iArr[5]) & 4294967295L) + j26) - j17);
        iArr2[5] = (int) j39;
        long j45 = (j39 >> 32) + (((((long) iArr[6]) & 4294967295L) + j15) - j18);
        iArr2[6] = (int) j45;
        long j46 = (j45 >> 32) + 1;
        long j47 = j37 + j46;
        long j48 = j28 - j46;
        iArr2[0] = (int) j48;
        long j49 = j48 >> 32;
        if (j49 != 0) {
            long j55 = j49 + (((long) i15) & 4294967295L);
            iArr2[1] = (int) j55;
            long j56 = (j55 >> 32) + (((long) i16) & 4294967295L);
            iArr2[2] = (int) j56;
            j47 += j56 >> 32;
        }
        iArr2[3] = (int) j47;
        if (((j47 >> 32) == 0 || Nat.incAt(7, iArr2, 4) == 0) && !(iArr2[6] == -1 && Nat224.gte(iArr2, P))) {
            return;
        }
        addPInvTo(iArr2);
    }

    public static void reduce32(int i15, int[] iArr) {
        long j15;
        if (i15 != 0) {
            long j16 = ((long) i15) & 4294967295L;
            long j17 = (((long) iArr[0]) & 4294967295L) - j16;
            iArr[0] = (int) j17;
            long j18 = j17 >> 32;
            if (j18 != 0) {
                long j19 = j18 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j19;
                long j25 = (j19 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j25;
                j18 = j25 >> 32;
            }
            long j26 = j18 + (4294967295L & ((long) iArr[3])) + j16;
            iArr[3] = (int) j26;
            j15 = j26 >> 32;
        } else {
            j15 = 0;
        }
        if ((j15 == 0 || Nat.incAt(7, iArr, 4) == 0) && !(iArr[6] == -1 && Nat224.gte(iArr, P))) {
            return;
        }
        addPInvTo(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreateExt = Nat224.createExt();
        Nat224.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
    }

    public static void squareN(int[] iArr, int i15, int[] iArr2) {
        int[] iArrCreateExt = Nat224.createExt();
        Nat224.square(iArr, iArrCreateExt);
        while (true) {
            reduce(iArrCreateExt, iArr2);
            i15--;
            if (i15 <= 0) {
                return;
            } else {
                Nat224.square(iArr2, iArrCreateExt);
            }
        }
    }

    private static void subPInvFrom(int[] iArr) {
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
        long j19 = j16 + ((4294967295L & ((long) iArr[3])) - 1);
        iArr[3] = (int) j19;
        if ((j19 >> 32) != 0) {
            Nat.decAt(7, iArr, 4);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat224.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(14, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            if (Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                Nat.decAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && Nat224.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }
}
