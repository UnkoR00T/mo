package org.bouncycastle.math.raw;

import java.util.Random;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Mod {
    private static final int M30 = 1073741823;
    private static final long M32L = 4294967295L;

    private static int add30(int i15, int[] iArr, int[] iArr2) {
        int i16 = i15 - 1;
        int i17 = 0;
        for (int i18 = 0; i18 < i16; i18++) {
            int i19 = i17 + iArr[i18] + iArr2[i18];
            iArr[i18] = M30 & i19;
            i17 = i19 >> 30;
        }
        int i25 = i17 + iArr[i16] + iArr2[i16];
        iArr[i16] = i25;
        return i25 >> 30;
    }

    public static void checkedModOddInverse(int[] iArr, int[] iArr2, int[] iArr3) {
        if (modOddInverse(iArr, iArr2, iArr3) == 0) {
            throw new ArithmeticException("Inverse does not exist.");
        }
    }

    public static void checkedModOddInverseVar(int[] iArr, int[] iArr2, int[] iArr3) {
        if (!modOddInverseVar(iArr, iArr2, iArr3)) {
            throw new ArithmeticException("Inverse does not exist.");
        }
    }

    private static void cnegate30(int i15, int i16, int[] iArr) {
        int i17 = i15 - 1;
        int i18 = 0;
        for (int i19 = 0; i19 < i17; i19++) {
            int i25 = i18 + ((iArr[i19] ^ i16) - i16);
            iArr[i19] = M30 & i25;
            i18 = i25 >> 30;
        }
        iArr[i17] = i18 + ((iArr[i17] ^ i16) - i16);
    }

    private static void cnormalize30(int i15, int i16, int[] iArr, int[] iArr2) {
        int i17 = i15 - 1;
        int i18 = iArr[i17] >> 31;
        int i19 = 0;
        for (int i25 = 0; i25 < i17; i25++) {
            int i26 = i19 + (((iArr[i25] + (iArr2[i25] & i18)) ^ i16) - i16);
            iArr[i25] = M30 & i26;
            i19 = i26 >> 30;
        }
        int i27 = i19 + (((iArr[i17] + (i18 & iArr2[i17])) ^ i16) - i16);
        iArr[i17] = i27;
        int i28 = i27 >> 31;
        int i29 = 0;
        for (int i35 = 0; i35 < i17; i35++) {
            int i36 = i29 + iArr[i35] + (iArr2[i35] & i28);
            iArr[i35] = i36 & M30;
            i29 = i36 >> 30;
        }
        iArr[i17] = i29 + iArr[i17] + (i28 & iArr2[i17]);
    }

    private static void decode30(int i15, int[] iArr, int[] iArr2) {
        int i16 = 0;
        long j15 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i15 > 0) {
            while (i16 < Math.min(32, i15)) {
                j15 |= ((long) iArr[i17]) << i16;
                i16 += 30;
                i17++;
            }
            iArr2[i18] = (int) j15;
            j15 >>>= 32;
            i16 -= 32;
            i15 -= 32;
            i18++;
        }
    }

    private static int divsteps30Var(int i15, int i16, int i17, int[] iArr) {
        int i18;
        int i19 = 30;
        int i25 = 1;
        int i26 = 1;
        int i27 = 0;
        int i28 = 0;
        while (true) {
            int iNumberOfTrailingZeros = Integers.numberOfTrailingZeros(((-1) << i19) | i17);
            int i29 = i17 >> iNumberOfTrailingZeros;
            i25 <<= iNumberOfTrailingZeros;
            i27 <<= iNumberOfTrailingZeros;
            i15 -= iNumberOfTrailingZeros;
            i19 -= iNumberOfTrailingZeros;
            if (i19 <= 0) {
                iArr[0] = i25;
                iArr[1] = i27;
                iArr[2] = i28;
                iArr[3] = i26;
                return i15;
            }
            if (i15 <= 0) {
                i15 = 2 - i15;
                int i35 = -i16;
                int i36 = -i25;
                int i37 = -i27;
                i18 = ((-1) >>> (32 - (i15 > i19 ? i19 : i15))) & 63 & (i29 * i35 * ((i29 * i29) - 2));
                i29 = i35;
                i16 = i29;
                int i38 = i28;
                i28 = i36;
                i25 = i38;
                int i39 = i26;
                i26 = i37;
                i27 = i39;
            } else {
                i18 = ((-1) >>> (32 - (i15 > i19 ? i19 : i15))) & 15 & (((((i16 + 1) & 4) << 1) + i16) * (-i29));
            }
            i17 = i29 + (i16 * i18);
            i28 += i25 * i18;
            i26 += i18 * i27;
        }
    }

    private static void encode30(int i15, int[] iArr, int[] iArr2) {
        int i16 = 0;
        long j15 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i15 > 0) {
            if (i16 < Math.min(30, i15)) {
                j15 |= (((long) iArr[i17]) & 4294967295L) << i16;
                i16 += 32;
                i17++;
            }
            iArr2[i18] = ((int) j15) & M30;
            j15 >>>= 30;
            i16 -= 30;
            i15 -= 30;
            i18++;
        }
    }

    private static int equalTo(int i15, int[] iArr, int i16) {
        int i17 = i16 ^ iArr[0];
        for (int i18 = 1; i18 < i15; i18++) {
            i17 |= iArr[i18];
        }
        return (((i17 >>> 1) | (i17 & 1)) - 1) >> 31;
    }

    private static boolean equalToVar(int i15, int[] iArr, int i16) {
        int i17 = i16 ^ iArr[0];
        if (i17 != 0) {
            return false;
        }
        for (int i18 = 1; i18 < i15; i18++) {
            i17 |= iArr[i18];
        }
        return i17 == 0;
    }

    private static int getMaximumDivsteps(int i15) {
        return (int) (((((long) i15) * 188898) + ((long) (i15 < 46 ? 308405 : 181188))) >>> 16);
    }

    private static int getMaximumHDDivsteps(int i15) {
        return (int) (((((long) i15) * 150964) + 99243) >>> 16);
    }

    private static int hddivsteps30(int i15, int i16, int i17, int[] iArr) {
        int i18 = 1073741824;
        int i19 = 1073741824;
        int i25 = 0;
        int i26 = 0;
        for (int i27 = 0; i27 < 30; i27++) {
            int i28 = i15 >> 31;
            int i29 = -(i17 & 1);
            int i35 = i17 - ((i16 ^ i28) & i29);
            int i36 = i26 - ((i18 ^ i28) & i29);
            int i37 = i19 - ((i25 ^ i28) & i29);
            int i38 = (~i28) & i29;
            i15 = (i15 ^ i38) + 1;
            i16 += i35 & i38;
            i18 += i36 & i38;
            i25 += i38 & i37;
            i17 = i35 >> 1;
            i26 = i36 >> 1;
            i19 = i37 >> 1;
        }
        iArr[0] = i18;
        iArr[1] = i25;
        iArr[2] = i26;
        iArr[3] = i19;
        return i15;
    }

    public static int inverse32(int i15) {
        int i16 = (2 - (i15 * i15)) * i15;
        int i17 = i16 * (2 - (i15 * i16));
        int i18 = i17 * (2 - (i15 * i17));
        return i18 * (2 - (i15 * i18));
    }

    public static int modOddInverse(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        int iNumberOfLeadingZeros = (length << 5) - Integers.numberOfLeadingZeros(iArr[length - 1]);
        int i15 = (iNumberOfLeadingZeros + 29) / 30;
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[i15];
        int[] iArr6 = new int[i15];
        int[] iArr7 = new int[i15];
        int[] iArr8 = new int[i15];
        int[] iArr9 = new int[i15];
        iArr6[0] = 1;
        encode30(iNumberOfLeadingZeros, iArr2, iArr8);
        encode30(iNumberOfLeadingZeros, iArr, iArr9);
        System.arraycopy(iArr9, 0, iArr7, 0, i15);
        int iInverse32 = inverse32(iArr9[0]);
        int maximumHDDivsteps = getMaximumHDDivsteps(iNumberOfLeadingZeros);
        int iHddivsteps30 = 0;
        for (int i16 = 0; i16 < maximumHDDivsteps; i16 += 30) {
            iHddivsteps30 = hddivsteps30(iHddivsteps30, iArr7[0], iArr8[0], iArr4);
            updateDE30(i15, iArr5, iArr6, iArr4, iInverse32, iArr9);
            updateFG30(i15, iArr7, iArr8, iArr4);
        }
        int i17 = iArr7[i15 - 1] >> 31;
        cnegate30(i15, i17, iArr7);
        cnormalize30(i15, i17, iArr5, iArr9);
        decode30(iNumberOfLeadingZeros, iArr5, iArr3);
        return equalTo(i15, iArr7, 1) & equalTo(i15, iArr8, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r16v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    public static boolean modOddInverseVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        int iNumberOfLeadingZeros = (length << 5) - Integers.numberOfLeadingZeros(iArr[length - 1]);
        int i15 = (iNumberOfLeadingZeros + 29) / 30;
        int bitLength = iNumberOfLeadingZeros - Nat.getBitLength(length, iArr2);
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[i15];
        int[] iArr6 = new int[i15];
        int[] iArr7 = new int[i15];
        int[] iArr8 = new int[i15];
        int[] iArr9 = new int[i15];
        ?? r15 = 0;
        iArr6[0] = 1;
        encode30(iNumberOfLeadingZeros, iArr2, iArr8);
        encode30(iNumberOfLeadingZeros, iArr, iArr9);
        System.arraycopy(iArr9, 0, iArr7, 0, i15);
        int iDivsteps30Var = -bitLength;
        int iInverse32 = inverse32(iArr9[0]);
        int maximumDivsteps = getMaximumDivsteps(iNumberOfLeadingZeros);
        int iTrimFG30 = i15;
        while (!equalToVar(iTrimFG30, iArr8, r15)) {
            if (bitLength >= maximumDivsteps) {
                return r15;
            }
            bitLength += 30;
            ?? r16 = r15;
            iDivsteps30Var = divsteps30Var(iDivsteps30Var, iArr7[r15], iArr8[r16 == true ? 1 : 0], iArr4);
            updateDE30(i15, iArr5, iArr6, iArr4, iInverse32, iArr9);
            updateFG30(iTrimFG30, iArr7, iArr8, iArr4);
            iTrimFG30 = trimFG30(iTrimFG30, iArr7, iArr8);
            r15 = r16 == true ? 1 : 0;
        }
        ?? r17 = r15;
        int i16 = iArr7[iTrimFG30 - 1] >> 31;
        int iNegate30 = iArr5[i15 - 1] >> 31;
        if (iNegate30 < 0) {
            iNegate30 = add30(i15, iArr5, iArr9);
        }
        if (i16 < 0) {
            iNegate30 = negate30(i15, iArr5);
            negate30(iTrimFG30, iArr7);
        }
        if (!equalToVar(iTrimFG30, iArr7, 1)) {
            return r17;
        }
        if (iNegate30 < 0) {
            add30(i15, iArr5, iArr9);
        }
        decode30(iNumberOfLeadingZeros, iArr5, iArr3);
        return true;
    }

    public static int modOddIsCoprime(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int iNumberOfLeadingZeros = (length << 5) - Integers.numberOfLeadingZeros(iArr[length - 1]);
        int i15 = (iNumberOfLeadingZeros + 29) / 30;
        int[] iArr3 = new int[4];
        int[] iArr4 = new int[i15];
        int[] iArr5 = new int[i15];
        int[] iArr6 = new int[i15];
        encode30(iNumberOfLeadingZeros, iArr2, iArr5);
        encode30(iNumberOfLeadingZeros, iArr, iArr6);
        System.arraycopy(iArr6, 0, iArr4, 0, i15);
        int maximumHDDivsteps = getMaximumHDDivsteps(iNumberOfLeadingZeros);
        int iHddivsteps30 = 0;
        for (int i16 = 0; i16 < maximumHDDivsteps; i16 += 30) {
            iHddivsteps30 = hddivsteps30(iHddivsteps30, iArr4[0], iArr5[0], iArr3);
            updateFG30(i15, iArr4, iArr5, iArr3);
        }
        cnegate30(i15, iArr4[i15 - 1] >> 31, iArr4);
        return equalTo(i15, iArr5, 0) & equalTo(i15, iArr4, 1);
    }

    public static boolean modOddIsCoprimeVar(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int iNumberOfLeadingZeros = (length << 5) - Integers.numberOfLeadingZeros(iArr[length - 1]);
        int iTrimFG30 = (iNumberOfLeadingZeros + 29) / 30;
        int bitLength = iNumberOfLeadingZeros - Nat.getBitLength(length, iArr2);
        int[] iArr3 = new int[4];
        int[] iArr4 = new int[iTrimFG30];
        int[] iArr5 = new int[iTrimFG30];
        int[] iArr6 = new int[iTrimFG30];
        encode30(iNumberOfLeadingZeros, iArr2, iArr5);
        encode30(iNumberOfLeadingZeros, iArr, iArr6);
        System.arraycopy(iArr6, 0, iArr4, 0, iTrimFG30);
        int iDivsteps30Var = -bitLength;
        int maximumDivsteps = getMaximumDivsteps(iNumberOfLeadingZeros);
        while (!equalToVar(iTrimFG30, iArr5, 0)) {
            if (bitLength >= maximumDivsteps) {
                return false;
            }
            bitLength += 30;
            iDivsteps30Var = divsteps30Var(iDivsteps30Var, iArr4[0], iArr5[0], iArr3);
            updateFG30(iTrimFG30, iArr4, iArr5, iArr3);
            iTrimFG30 = trimFG30(iTrimFG30, iArr4, iArr5);
        }
        if ((iArr4[iTrimFG30 - 1] >> 31) < 0) {
            negate30(iTrimFG30, iArr4);
        }
        return equalToVar(iTrimFG30, iArr4, 1);
    }

    private static int negate30(int i15, int[] iArr) {
        int i16 = i15 - 1;
        int i17 = 0;
        for (int i18 = 0; i18 < i16; i18++) {
            int i19 = i17 - iArr[i18];
            iArr[i18] = M30 & i19;
            i17 = i19 >> 30;
        }
        int i25 = i17 - iArr[i16];
        iArr[i16] = i25;
        return i25 >> 30;
    }

    public static int[] random(int[] iArr) {
        int length = iArr.length;
        Random random = new Random();
        int[] iArrCreate = Nat.create(length);
        int i15 = length - 1;
        int i16 = iArr[i15];
        int i17 = i16 | (i16 >>> 1);
        int i18 = i17 | (i17 >>> 2);
        int i19 = i18 | (i18 >>> 4);
        int i25 = i19 | (i19 >>> 8);
        int i26 = i25 | (i25 >>> 16);
        do {
            for (int i27 = 0; i27 != length; i27++) {
                iArrCreate[i27] = random.nextInt();
            }
            iArrCreate[i15] = iArrCreate[i15] & i26;
        } while (Nat.gte(length, iArrCreate, iArr));
        return iArrCreate;
    }

    private static int trimFG30(int i15, int[] iArr, int[] iArr2) {
        int i16 = i15 - 1;
        int i17 = iArr[i16];
        int i18 = iArr2[i16];
        int i19 = i15 - 2;
        if (((i19 >> 31) | ((i17 >> 31) ^ i17) | ((i18 >> 31) ^ i18)) != 0) {
            return i15;
        }
        iArr[i19] = (i17 << 30) | iArr[i19];
        iArr2[i19] = iArr2[i19] | (i18 << 30);
        return i15 - 1;
    }

    private static void updateDE30(int i15, int[] iArr, int[] iArr2, int[] iArr3, int i16, int[] iArr4) {
        int i17 = i15;
        int i18 = iArr3[0];
        int i19 = iArr3[1];
        int i25 = iArr3[2];
        int i26 = iArr3[3];
        int i27 = i17 - 1;
        int i28 = iArr[i27] >> 31;
        int i29 = iArr2[i27] >> 31;
        int i35 = (i18 & i28) + (i19 & i29);
        int i36 = (i28 & i25) + (i29 & i26);
        int i37 = iArr4[0];
        long j15 = i18;
        long j16 = iArr[0];
        long j17 = i19;
        long j18 = iArr2[0];
        long j19 = (j15 * j16) + (j17 * j18);
        long j25 = i25;
        long j26 = i26;
        long j27 = (j16 * j25) + (j26 * j18);
        int i38 = i35 - (((((int) j19) * i16) + i35) & M30);
        long j28 = i37;
        long j29 = i38;
        long j35 = j19 + (j28 * j29);
        long j36 = i36 - (((((int) j27) * i16) + i36) & M30);
        long j37 = (j27 + (j28 * j36)) >> 30;
        int i39 = 1;
        long j38 = j35 >> 30;
        while (i39 < i17) {
            int i45 = iArr4[i39];
            long j39 = j36;
            long j45 = j25;
            long j46 = iArr[i39];
            long j47 = iArr2[i39];
            long j48 = (j15 * j46) + (j17 * j47);
            long j49 = i45;
            long j55 = j38 + j48 + (j49 * j29);
            long j56 = j37 + (j45 * j46) + (j26 * j47) + (j49 * j39);
            int i46 = i39 - 1;
            iArr[i46] = ((int) j55) & M30;
            j38 = j55 >> 30;
            iArr2[i46] = ((int) j56) & M30;
            j37 = j56 >> 30;
            i39++;
            i17 = i15;
            j36 = j39;
            j25 = j45;
        }
        iArr[i27] = (int) j38;
        iArr2[i27] = (int) j37;
    }

    private static void updateFG30(int i15, int[] iArr, int[] iArr2, int[] iArr3) {
        int i16 = iArr3[0];
        boolean z15 = true;
        int i17 = iArr3[1];
        int i18 = iArr3[2];
        int i19 = iArr3[3];
        long j15 = i16;
        long j16 = iArr[0];
        long j17 = i17;
        long j18 = iArr2[0];
        long j19 = (j15 * j16) + (j17 * j18);
        long j25 = i18;
        long j26 = i19;
        long j27 = (j16 * j25) + (j18 * j26);
        char c15 = 30;
        long j28 = j19 >> 30;
        long j29 = j27 >> 30;
        int i25 = 1;
        while (i25 < i15) {
            char c16 = c15;
            long j35 = iArr[i25];
            long j36 = j15 * j35;
            long j37 = iArr2[i25];
            long j38 = j28 + j36 + (j17 * j37);
            long j39 = j29 + (j25 * j35) + (j37 * j26);
            int i26 = i25 - 1;
            iArr[i26] = ((int) j38) & M30;
            j28 = j38 >> c16;
            iArr2[i26] = ((int) j39) & M30;
            j29 = j39 >> c16;
            i25++;
            c15 = c16;
            z15 = z15;
        }
        int i27 = i15 - 1;
        iArr[i27] = (int) j28;
        iArr2[i27] = (int) j29;
    }
}
