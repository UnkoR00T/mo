package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat384;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class SecP384R1Field {
    private static final long M = 4294967295L;
    private static final int P11 = -1;
    private static final int PExt23 = -1;
    static final int[] P = {-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};
    private static final int[] PExt = {1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};
    private static final int[] PExtInv = {-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && Nat.gte(12, iArr3, P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(24, iArr, iArr2, iArr3) != 0 || (iArr3[23] == -1 && Nat.gte(24, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(24, iArr3, iArr4.length);
            }
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(12, iArr, iArr2) != 0 || (iArr2[11] == -1 && Nat.gte(12, iArr2, P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
        long j15 = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j15;
        long j16 = (j15 >> 32) + ((((long) iArr[1]) & 4294967295L) - 1);
        iArr[1] = (int) j16;
        long j17 = j16 >> 32;
        if (j17 != 0) {
            long j18 = j17 + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j18;
            j17 = j18 >> 32;
        }
        long j19 = j17 + (((long) iArr[3]) & 4294967295L) + 1;
        iArr[3] = (int) j19;
        long j25 = (j19 >> 32) + (4294967295L & ((long) iArr[4])) + 1;
        iArr[4] = (int) j25;
        if ((j25 >> 32) != 0) {
            Nat.incAt(12, iArr, 5);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat.fromBigInteger(MLKEMEngine.KyberPolyBytes, bigInteger);
        if (iArrFromBigInteger[11] == -1) {
            int[] iArr = P;
            if (Nat.gte(12, iArrFromBigInteger, iArr)) {
                Nat.subFrom(12, iArr, iArrFromBigInteger);
            }
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(12, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(12, iArr2, Nat.add(12, iArr, P, iArr2));
        }
    }

    public static void inv(int[] iArr, int[] iArr2) {
        Mod.checkedModOddInverse(P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i15 = 0;
        for (int i16 = 0; i16 < 12; i16++) {
            i15 |= iArr[i16];
        }
        return (((i15 >>> 1) | (i15 & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreate = Nat.create(24);
        Nat384.mul(iArr, iArr2, iArrCreate);
        reduce(iArrCreate, iArr3);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            Nat.sub(12, P, iArr, iArr2);
        } else {
            int[] iArr3 = P;
            Nat.sub(12, iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[48];
        do {
            secureRandom.nextBytes(bArr);
            Pack.littleEndianToInt(bArr, 0, iArr, 0, 12);
        } while (Nat.lessThan(12, iArr, P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j15 = ((long) iArr[16]) & 4294967295L;
        long j16 = ((long) iArr[17]) & 4294967295L;
        long j17 = ((long) iArr[18]) & 4294967295L;
        long j18 = ((long) iArr[19]) & 4294967295L;
        long j19 = ((long) iArr[20]) & 4294967295L;
        long j25 = ((long) iArr[21]) & 4294967295L;
        long j26 = ((long) iArr[22]) & 4294967295L;
        long j27 = ((long) iArr[23]) & 4294967295L;
        long j28 = ((((long) iArr[12]) & 4294967295L) + j19) - 1;
        long j29 = (((long) iArr[13]) & 4294967295L) + j26;
        long j35 = (((long) iArr[14]) & 4294967295L) + j26 + j27;
        long j36 = (((long) iArr[15]) & 4294967295L) + j27;
        long j37 = j16 + j25;
        long j38 = j25 - j27;
        long j39 = j26 - j27;
        long j45 = j28 + j38;
        long j46 = (((long) iArr[0]) & 4294967295L) + j45;
        iArr2[0] = (int) j46;
        long j47 = (j46 >> 32) + (((((long) iArr[1]) & 4294967295L) + j27) - j28) + j29;
        iArr2[1] = (int) j47;
        long j48 = (j47 >> 32) + (((((long) iArr[2]) & 4294967295L) - j25) - j29) + j35;
        iArr2[2] = (int) j48;
        long j49 = (j48 >> 32) + ((((long) iArr[3]) & 4294967295L) - j35) + j36 + j45;
        iArr2[3] = (int) j49;
        long j55 = (j49 >> 32) + (((((((long) iArr[4]) & 4294967295L) + j15) + j25) + j29) - j36) + j45;
        iArr2[4] = (int) j55;
        long j56 = (j55 >> 32) + ((((long) iArr[5]) & 4294967295L) - j15) + j29 + j35 + j37;
        iArr2[5] = (int) j56;
        long j57 = (j56 >> 32) + (((((long) iArr[6]) & 4294967295L) + j17) - j16) + j35 + j36;
        iArr2[6] = (int) j57;
        long j58 = (j57 >> 32) + ((((((long) iArr[7]) & 4294967295L) + j15) + j18) - j17) + j36;
        iArr2[7] = (int) j58;
        long j59 = (j58 >> 32) + (((((((long) iArr[8]) & 4294967295L) + j15) + j16) + j19) - j18);
        iArr2[8] = (int) j59;
        long j65 = (j59 >> 32) + (((((long) iArr[9]) & 4294967295L) + j17) - j19) + j37;
        iArr2[9] = (int) j65;
        long j66 = (j65 >> 32) + ((((((long) iArr[10]) & 4294967295L) + j17) + j18) - j38) + j39;
        iArr2[10] = (int) j66;
        long j67 = (j66 >> 32) + ((((((long) iArr[11]) & 4294967295L) + j18) + j19) - j39);
        iArr2[11] = (int) j67;
        reduce32((int) ((j67 >> 32) + 1), iArr2);
    }

    public static void reduce32(int i15, int[] iArr) {
        long j15;
        if (i15 != 0) {
            long j16 = ((long) i15) & 4294967295L;
            long j17 = (((long) iArr[0]) & 4294967295L) + j16;
            iArr[0] = (int) j17;
            long j18 = (j17 >> 32) + ((((long) iArr[1]) & 4294967295L) - j16);
            iArr[1] = (int) j18;
            long j19 = j18 >> 32;
            if (j19 != 0) {
                long j25 = j19 + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j25;
                j19 = j25 >> 32;
            }
            long j26 = j19 + (((long) iArr[3]) & 4294967295L) + j16;
            iArr[3] = (int) j26;
            long j27 = (j26 >> 32) + (4294967295L & ((long) iArr[4])) + j16;
            iArr[4] = (int) j27;
            j15 = j27 >> 32;
        } else {
            j15 = 0;
        }
        if ((j15 == 0 || Nat.incAt(12, iArr, 5) == 0) && !(iArr[11] == -1 && Nat.gte(12, iArr, P))) {
            return;
        }
        addPInvTo(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreate = Nat.create(24);
        Nat384.square(iArr, iArrCreate);
        reduce(iArrCreate, iArr2);
    }

    public static void squareN(int[] iArr, int i15, int[] iArr2) {
        int[] iArrCreate = Nat.create(24);
        Nat384.square(iArr, iArrCreate);
        while (true) {
            reduce(iArrCreate, iArr2);
            i15--;
            if (i15 <= 0) {
                return;
            } else {
                Nat384.square(iArr2, iArrCreate);
            }
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j15 = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j15;
        long j16 = (j15 >> 32) + (((long) iArr[1]) & 4294967295L) + 1;
        iArr[1] = (int) j16;
        long j17 = j16 >> 32;
        if (j17 != 0) {
            long j18 = j17 + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j18;
            j17 = j18 >> 32;
        }
        long j19 = j17 + ((((long) iArr[3]) & 4294967295L) - 1);
        iArr[3] = (int) j19;
        long j25 = (j19 >> 32) + ((4294967295L & ((long) iArr[4])) - 1);
        iArr[4] = (int) j25;
        if ((j25 >> 32) != 0) {
            Nat.decAt(12, iArr, 5);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(12, iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(24, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            if (Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                Nat.decAt(24, iArr3, iArr4.length);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(12, iArr, 0, iArr2) != 0 || (iArr2[11] == -1 && Nat.gte(12, iArr2, P))) {
            addPInvTo(iArr2);
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        Nat384.mul(iArr, iArr2, iArr4);
        reduce(iArr4, iArr3);
    }

    public static void square(int[] iArr, int[] iArr2, int[] iArr3) {
        Nat384.square(iArr, iArr3);
        reduce(iArr3, iArr2);
    }

    public static void squareN(int[] iArr, int i15, int[] iArr2, int[] iArr3) {
        Nat384.square(iArr, iArr3);
        while (true) {
            reduce(iArr3, iArr2);
            i15--;
            if (i15 <= 0) {
                return;
            } else {
                Nat384.square(iArr2, iArr3);
            }
        }
    }
}
