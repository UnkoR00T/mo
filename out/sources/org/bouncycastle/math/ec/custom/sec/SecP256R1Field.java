package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class SecP256R1Field {
    private static final long M = 4294967295L;
    private static final int P7 = -1;
    private static final int PExt15s1 = Integer.MAX_VALUE;
    static final int[] P = {-1, -1, -1, 0, 0, 0, 1, -1};
    private static final int[] PExt = {1, 0, 0, -2, -1, -1, -2, 1, -2, 1, -2, 1, 1, -2, 2, -2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.add(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && Nat256.gte(iArr3, P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(16, iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= PExt15s1 && Nat.gte(16, iArr3, PExt))) {
            Nat.subFrom(16, PExt, iArr3);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && Nat256.gte(iArr2, P))) {
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
        long j19 = j16 + ((((long) iArr[3]) & 4294967295L) - 1);
        iArr[3] = (int) j19;
        long j25 = j19 >> 32;
        if (j25 != 0) {
            long j26 = j25 + (((long) iArr[4]) & 4294967295L);
            iArr[4] = (int) j26;
            long j27 = (j26 >> 32) + (((long) iArr[5]) & 4294967295L);
            iArr[5] = (int) j27;
            j25 = j27 >> 32;
        }
        long j28 = j25 + ((((long) iArr[6]) & 4294967295L) - 1);
        iArr[6] = (int) j28;
        iArr[7] = (int) ((j28 >> 32) + (4294967295L & ((long) iArr[7])) + 1);
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat256.fromBigInteger(bigInteger);
        if (iArrFromBigInteger[7] == -1) {
            int[] iArr = P;
            if (Nat256.gte(iArrFromBigInteger, iArr)) {
                Nat256.subFrom(iArr, iArrFromBigInteger);
            }
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(8, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(8, iArr2, Nat256.add(iArr, P, iArr2));
        }
    }

    public static void inv(int[] iArr, int[] iArr2) {
        Mod.checkedModOddInverse(P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i15 = 0;
        for (int i16 = 0; i16 < 8; i16++) {
            i15 |= iArr[i16];
        }
        return (((i15 >>> 1) | (i15 & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreateExt = Nat256.createExt();
        Nat256.mul(iArr, iArr2, iArrCreateExt);
        reduce(iArrCreateExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.mulAddTo(iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= PExt15s1 && Nat.gte(16, iArr3, PExt))) {
            Nat.subFrom(16, PExt, iArr3);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            Nat256.sub(P, iArr, iArr2);
        } else {
            int[] iArr3 = P;
            Nat256.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[32];
        do {
            secureRandom.nextBytes(bArr);
            Pack.littleEndianToInt(bArr, 0, iArr, 0, 8);
        } while (Nat.lessThan(8, iArr, P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j15 = ((long) iArr[8]) & 4294967295L;
        long j16 = ((long) iArr[9]) & 4294967295L;
        long j17 = ((long) iArr[10]) & 4294967295L;
        long j18 = ((long) iArr[11]) & 4294967295L;
        long j19 = ((long) iArr[12]) & 4294967295L;
        long j25 = ((long) iArr[13]) & 4294967295L;
        long j26 = ((long) iArr[14]) & 4294967295L;
        long j27 = ((long) iArr[15]) & 4294967295L;
        long j28 = j15 - 6;
        long j29 = j28 + j16;
        long j35 = j16 + j17;
        long j36 = (j17 + j18) - j27;
        long j37 = j18 + j19;
        long j38 = j19 + j25;
        long j39 = j25 + j26;
        long j45 = j26 + j27;
        long j46 = j39 - j29;
        long j47 = ((((long) iArr[0]) & 4294967295L) - j37) - j46;
        iArr2[0] = (int) j47;
        long j48 = (j47 >> 32) + ((((((long) iArr[1]) & 4294967295L) + j35) - j38) - j45);
        iArr2[1] = (int) j48;
        long j49 = (j48 >> 32) + (((((long) iArr[2]) & 4294967295L) + j36) - j39);
        iArr2[2] = (int) j49;
        long j55 = (j49 >> 32) + ((((((long) iArr[3]) & 4294967295L) + (j37 << 1)) + j46) - j45);
        iArr2[3] = (int) j55;
        long j56 = (j55 >> 32) + ((((((long) iArr[4]) & 4294967295L) + (j38 << 1)) + j26) - j35);
        iArr2[4] = (int) j56;
        long j57 = (j56 >> 32) + (((((long) iArr[5]) & 4294967295L) + (j39 << 1)) - j36);
        iArr2[5] = (int) j57;
        long j58 = (j57 >> 32) + (((long) iArr[6]) & 4294967295L) + (j45 << 1) + j46;
        iArr2[6] = (int) j58;
        long j59 = (j58 >> 32) + (((((((long) iArr[7]) & 4294967295L) + (j27 << 1)) + j28) - j36) - j38);
        iArr2[7] = (int) j59;
        reduce32((int) ((j59 >> 32) + 6), iArr2);
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
                long j25 = (j19 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j25;
                j18 = j25 >> 32;
            }
            long j26 = j18 + ((((long) iArr[3]) & 4294967295L) - j16);
            iArr[3] = (int) j26;
            long j27 = j26 >> 32;
            if (j27 != 0) {
                long j28 = j27 + (((long) iArr[4]) & 4294967295L);
                iArr[4] = (int) j28;
                long j29 = (j28 >> 32) + (((long) iArr[5]) & 4294967295L);
                iArr[5] = (int) j29;
                j27 = j29 >> 32;
            }
            long j35 = j27 + ((((long) iArr[6]) & 4294967295L) - j16);
            iArr[6] = (int) j35;
            long j36 = (j35 >> 32) + (4294967295L & ((long) iArr[7])) + j16;
            iArr[7] = (int) j36;
            j15 = j36 >> 32;
        } else {
            j15 = 0;
        }
        if (j15 != 0 || (iArr[7] == -1 && Nat256.gte(iArr, P))) {
            addPInvTo(iArr);
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreateExt = Nat256.createExt();
        Nat256.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
    }

    public static void squareN(int[] iArr, int i15, int[] iArr2) {
        int[] iArrCreateExt = Nat256.createExt();
        Nat256.square(iArr, iArrCreateExt);
        while (true) {
            reduce(iArrCreateExt, iArr2);
            i15--;
            if (i15 <= 0) {
                return;
            } else {
                Nat256.square(iArr2, iArrCreateExt);
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
        long j19 = j16 + (((long) iArr[3]) & 4294967295L) + 1;
        iArr[3] = (int) j19;
        long j25 = j19 >> 32;
        if (j25 != 0) {
            long j26 = j25 + (((long) iArr[4]) & 4294967295L);
            iArr[4] = (int) j26;
            long j27 = (j26 >> 32) + (((long) iArr[5]) & 4294967295L);
            iArr[5] = (int) j27;
            j25 = j27 >> 32;
        }
        long j28 = j25 + (((long) iArr[6]) & 4294967295L) + 1;
        iArr[6] = (int) j28;
        iArr[7] = (int) ((j28 >> 32) + ((4294967295L & ((long) iArr[7])) - 1));
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(16, iArr, iArr2, iArr3) != 0) {
            Nat.addTo(16, PExt, iArr3);
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && Nat256.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        Nat256.mul(iArr, iArr2, iArr4);
        reduce(iArr4, iArr3);
    }

    public static void square(int[] iArr, int[] iArr2, int[] iArr3) {
        Nat256.square(iArr, iArr3);
        reduce(iArr3, iArr2);
    }

    public static void squareN(int[] iArr, int i15, int[] iArr2, int[] iArr3) {
        Nat256.square(iArr, iArr3);
        while (true) {
            reduce(iArr3, iArr2);
            i15--;
            if (i15 <= 0) {
                return;
            } else {
                Nat256.square(iArr2, iArr3);
            }
        }
    }
}
