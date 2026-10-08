package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Nat {
    private static final long M = 4294967295L;

    public static int add(int i15, int[] iArr, int[] iArr2, int[] iArr3) {
        long j15 = 0;
        for (int i16 = 0; i16 < i15; i16++) {
            long j16 = j15 + (((long) iArr[i16]) & 4294967295L) + (4294967295L & ((long) iArr2[i16]));
            iArr3[i16] = (int) j16;
            j15 = j16 >>> 32;
        }
        return (int) j15;
    }

    public static int add33At(int i15, int i16, int[] iArr, int i17) {
        long j15 = (((long) iArr[i17]) & 4294967295L) + (((long) i16) & 4294967295L);
        iArr[i17] = (int) j15;
        int i18 = i17 + 1;
        long j16 = (j15 >>> 32) + (4294967295L & ((long) iArr[i18])) + 1;
        iArr[i18] = (int) j16;
        if ((j16 >>> 32) == 0) {
            return 0;
        }
        return incAt(i15, iArr, i17 + 2);
    }

    public static int add33To(int i15, int i16, int[] iArr) {
        long j15 = (((long) iArr[0]) & 4294967295L) + (((long) i16) & 4294967295L);
        iArr[0] = (int) j15;
        long j16 = (j15 >>> 32) + (4294967295L & ((long) iArr[1])) + 1;
        iArr[1] = (int) j16;
        if ((j16 >>> 32) == 0) {
            return 0;
        }
        return incAt(i15, iArr, 2);
    }

    public static int addBothTo(int i15, int[] iArr, int i16, int[] iArr2, int i17, int[] iArr3, int i18) {
        long j15 = 0;
        for (int i19 = 0; i19 < i15; i19++) {
            int i25 = i18 + i19;
            long j16 = j15 + (((long) iArr[i16 + i19]) & 4294967295L) + (((long) iArr2[i17 + i19]) & 4294967295L) + (4294967295L & ((long) iArr3[i25]));
            iArr3[i25] = (int) j16;
            j15 = j16 >>> 32;
        }
        return (int) j15;
    }

    public static int addDWordAt(int i15, long j15, int[] iArr, int i16) {
        long j16 = (((long) iArr[i16]) & 4294967295L) + (j15 & 4294967295L);
        iArr[i16] = (int) j16;
        int i17 = i16 + 1;
        long j17 = (j16 >>> 32) + (4294967295L & ((long) iArr[i17])) + (j15 >>> 32);
        iArr[i17] = (int) j17;
        if ((j17 >>> 32) == 0) {
            return 0;
        }
        return incAt(i15, iArr, i16 + 2);
    }

    public static int addDWordTo(int i15, long j15, int[] iArr) {
        long j16 = (((long) iArr[0]) & 4294967295L) + (j15 & 4294967295L);
        iArr[0] = (int) j16;
        long j17 = (j16 >>> 32) + (4294967295L & ((long) iArr[1])) + (j15 >>> 32);
        iArr[1] = (int) j17;
        if ((j17 >>> 32) == 0) {
            return 0;
        }
        return incAt(i15, iArr, 2);
    }

    public static int addTo(int i15, int[] iArr, int i16, int[] iArr2, int i17) {
        long j15 = 0;
        for (int i18 = 0; i18 < i15; i18++) {
            int i19 = i17 + i18;
            long j16 = j15 + (((long) iArr[i16 + i18]) & 4294967295L) + (4294967295L & ((long) iArr2[i19]));
            iArr2[i19] = (int) j16;
            j15 = j16 >>> 32;
        }
        return (int) j15;
    }

    public static int addToEachOther(int i15, int[] iArr, int i16, int[] iArr2, int i17) {
        long j15 = 0;
        for (int i18 = 0; i18 < i15; i18++) {
            int i19 = i16 + i18;
            int i25 = i17 + i18;
            long j16 = j15 + (((long) iArr[i19]) & 4294967295L) + (4294967295L & ((long) iArr2[i25]));
            int i26 = (int) j16;
            iArr[i19] = i26;
            iArr2[i25] = i26;
            j15 = j16 >>> 32;
        }
        return (int) j15;
    }

    public static int addWordAt(int i15, int i16, int[] iArr, int i17) {
        long j15 = (((long) i16) & 4294967295L) + (4294967295L & ((long) iArr[i17]));
        iArr[i17] = (int) j15;
        if ((j15 >>> 32) == 0) {
            return 0;
        }
        return incAt(i15, iArr, i17 + 1);
    }

    public static int addWordTo(int i15, int i16, int[] iArr) {
        long j15 = (((long) i16) & 4294967295L) + (4294967295L & ((long) iArr[0]));
        iArr[0] = (int) j15;
        if ((j15 >>> 32) == 0) {
            return 0;
        }
        return incAt(i15, iArr, 1);
    }

    public static int cadd(int i15, int i16, int[] iArr, int[] iArr2, int[] iArr3) {
        long j15 = ((long) (-(i16 & 1))) & 4294967295L;
        long j16 = 0;
        for (int i17 = 0; i17 < i15; i17++) {
            long j17 = j16 + (((long) iArr[i17]) & 4294967295L) + (((long) iArr2[i17]) & j15);
            iArr3[i17] = (int) j17;
            j16 = j17 >>> 32;
        }
        return (int) j16;
    }

    public static int caddTo(int i15, int i16, int[] iArr, int[] iArr2) {
        long j15 = ((long) (-(i16 & 1))) & 4294967295L;
        long j16 = 0;
        for (int i17 = 0; i17 < i15; i17++) {
            long j17 = j16 + (((long) iArr2[i17]) & 4294967295L) + (((long) iArr[i17]) & j15);
            iArr2[i17] = (int) j17;
            j16 = j17 >>> 32;
        }
        return (int) j16;
    }

    public static void cmov(int i15, int i16, int[] iArr, int i17, int[] iArr2, int i18) {
        int i19 = -(i16 & 1);
        for (int i25 = 0; i25 < i15; i25++) {
            int i26 = i18 + i25;
            int i27 = iArr2[i26];
            iArr2[i26] = i27 ^ ((iArr[i17 + i25] ^ i27) & i19);
        }
    }

    public static int compare(int i15, int[] iArr, int i16, int[] iArr2, int i17) {
        for (int i18 = i15 - 1; i18 >= 0; i18--) {
            int i19 = iArr[i16 + i18] ^ PKIFailureInfo.systemUnavail;
            int i25 = Integer.MIN_VALUE ^ iArr2[i17 + i18];
            if (i19 < i25) {
                return -1;
            }
            if (i19 > i25) {
                return 1;
            }
        }
        return 0;
    }

    public static void copy(int i15, int[] iArr, int i16, int[] iArr2, int i17) {
        System.arraycopy(iArr, i16, iArr2, i17, i15);
    }

    public static void copy64(int i15, long[] jArr, int i16, long[] jArr2, int i17) {
        System.arraycopy(jArr, i16, jArr2, i17, i15);
    }

    public static int[] create(int i15) {
        return new int[i15];
    }

    public static long[] create64(int i15) {
        return new long[i15];
    }

    public static int csub(int i15, int i16, int[] iArr, int i17, int[] iArr2, int i18, int[] iArr3, int i19) {
        long j15 = ((long) (-(i16 & 1))) & 4294967295L;
        long j16 = 0;
        for (int i25 = 0; i25 < i15; i25++) {
            long j17 = j16 + ((((long) iArr[i17 + i25]) & 4294967295L) - (((long) iArr2[i18 + i25]) & j15));
            iArr3[i19 + i25] = (int) j17;
            j16 = j17 >> 32;
        }
        return (int) j16;
    }

    public static int dec(int i15, int[] iArr) {
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = iArr[i16] - 1;
            iArr[i16] = i17;
            if (i17 != -1) {
                return 0;
            }
        }
        return -1;
    }

    public static int decAt(int i15, int[] iArr, int i16) {
        while (i16 < i15) {
            int i17 = iArr[i16] - 1;
            iArr[i16] = i17;
            if (i17 != -1) {
                return 0;
            }
            i16++;
        }
        return -1;
    }

    public static boolean diff(int i15, int[] iArr, int i16, int[] iArr2, int i17, int[] iArr3, int i18) {
        boolean zGte = gte(i15, iArr, i16, iArr2, i17);
        if (zGte) {
            sub(i15, iArr, i16, iArr2, i17, iArr3, i18);
            return zGte;
        }
        sub(i15, iArr2, i17, iArr, i16, iArr3, i18);
        return zGte;
    }

    public static boolean eq(int i15, int[] iArr, int[] iArr2) {
        for (int i16 = i15 - 1; i16 >= 0; i16--) {
            if (iArr[i16] != iArr2[i16]) {
                return false;
            }
        }
        return true;
    }

    public static int equalTo(int i15, int[] iArr, int i16) {
        int i17 = i16 ^ iArr[0];
        for (int i18 = 1; i18 < i15; i18++) {
            i17 |= iArr[i18];
        }
        return (((i17 >>> 1) | (i17 & 1)) - 1) >> 31;
    }

    public static int equalToZero(int i15, int[] iArr) {
        int i16 = 0;
        for (int i17 = 0; i17 < i15; i17++) {
            i16 |= iArr[i17];
        }
        return (((i16 >>> 1) | (i16 & 1)) - 1) >> 31;
    }

    public static int[] fromBigInteger(int i15, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i15) {
            throw new IllegalArgumentException();
        }
        int i16 = (i15 + 31) >> 5;
        int[] iArrCreate = create(i16);
        for (int i17 = 0; i17 < i16; i17++) {
            iArrCreate[i17] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArrCreate;
    }

    public static long[] fromBigInteger64(int i15, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i15) {
            throw new IllegalArgumentException();
        }
        int i16 = (i15 + 63) >> 6;
        long[] jArrCreate64 = create64(i16);
        for (int i17 = 0; i17 < i16; i17++) {
            jArrCreate64[i17] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
        }
        return jArrCreate64;
    }

    public static int getBit(int[] iArr, int i15) {
        int i16;
        if (i15 == 0) {
            i16 = iArr[0];
        } else {
            int i17 = i15 >> 5;
            if (i17 < 0 || i17 >= iArr.length) {
                return 0;
            }
            i16 = iArr[i17] >>> (i15 & 31);
        }
        return i16 & 1;
    }

    public static int getBitLength(int i15, int[] iArr) {
        for (int i16 = i15 - 1; i16 >= 0; i16--) {
            int i17 = iArr[i16];
            if (i17 != 0) {
                return ((i16 * 32) + 32) - Integers.numberOfLeadingZeros(i17);
            }
        }
        return 0;
    }

    public static boolean gte(int i15, int[] iArr, int i16, int[] iArr2, int i17) {
        for (int i18 = i15 - 1; i18 >= 0; i18--) {
            int i19 = iArr[i16 + i18] ^ PKIFailureInfo.systemUnavail;
            int i25 = Integer.MIN_VALUE ^ iArr2[i17 + i18];
            if (i19 < i25) {
                return false;
            }
            if (i19 > i25) {
                return true;
            }
        }
        return true;
    }

    public static int inc(int i15, int[] iArr) {
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = iArr[i16] + 1;
            iArr[i16] = i17;
            if (i17 != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int incAt(int i15, int[] iArr, int i16) {
        while (i16 < i15) {
            int i17 = iArr[i16] + 1;
            iArr[i16] = i17;
            if (i17 != 0) {
                return 0;
            }
            i16++;
        }
        return 1;
    }

    public static boolean isOne(int i15, int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i16 = 1; i16 < i15; i16++) {
            if (iArr[i16] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int i15, int[] iArr) {
        for (int i16 = 0; i16 < i15; i16++) {
            if (iArr[i16] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int lessThan(int i15, int[] iArr, int i16, int[] iArr2, int i17) {
        long j15 = 0;
        for (int i18 = 0; i18 < i15; i18++) {
            j15 = (j15 + ((((long) iArr[i16 + i18]) & 4294967295L) - (4294967295L & ((long) iArr2[i17 + i18])))) >> 32;
        }
        return (int) j15;
    }

    public static void mul(int i15, int[] iArr, int i16, int[] iArr2, int i17, int[] iArr3, int i18) {
        iArr3[i18 + i15] = mulWord(i15, iArr[i16], iArr2, i17, iArr3, i18);
        for (int i19 = 1; i19 < i15; i19++) {
            int i25 = i18 + i19;
            iArr3[i25 + i15] = mulWordAddTo(i15, iArr[i16 + i19], iArr2, i17, iArr3, i25);
        }
    }

    public static int mul31BothAdd(int i15, int i16, int[] iArr, int i17, int[] iArr2, int[] iArr3, int i18) {
        long j15 = ((long) i16) & 4294967295L;
        long j16 = ((long) i17) & 4294967295L;
        long j17 = 0;
        int i19 = 0;
        do {
            int i25 = i18 + i19;
            long j18 = j17 + ((((long) iArr[i19]) & 4294967295L) * j15) + ((((long) iArr2[i19]) & 4294967295L) * j16) + (((long) iArr3[i25]) & 4294967295L);
            iArr3[i25] = (int) j18;
            j17 = j18 >>> 32;
            i19++;
        } while (i19 < i15);
        return (int) j17;
    }

    public static int mulAddTo(int i15, int[] iArr, int i16, int[] iArr2, int i17, int[] iArr3, int i18) {
        long j15 = 0;
        int i19 = 0;
        int i25 = i18;
        while (i19 < i15) {
            int i26 = i15;
            int[] iArr4 = iArr2;
            int i27 = i17;
            int[] iArr5 = iArr3;
            int i28 = i25 + i26;
            long jMulWordAddTo = j15 + (((long) mulWordAddTo(i26, iArr[i16 + i19], iArr4, i27, iArr5, i25)) & 4294967295L) + (((long) iArr5[i28]) & 4294967295L);
            iArr5[i28] = (int) jMulWordAddTo;
            j15 = jMulWordAddTo >>> 32;
            i25++;
            i19++;
            i15 = i26;
            iArr2 = iArr4;
            i17 = i27;
            iArr3 = iArr5;
        }
        return (int) j15;
    }

    public static int mulWord(int i15, int i16, int[] iArr, int i17, int[] iArr2, int i18) {
        long j15 = ((long) i16) & 4294967295L;
        long j16 = 0;
        int i19 = 0;
        do {
            long j17 = j16 + ((((long) iArr[i17 + i19]) & 4294967295L) * j15);
            iArr2[i18 + i19] = (int) j17;
            j16 = j17 >>> 32;
            i19++;
        } while (i19 < i15);
        return (int) j16;
    }

    public static int mulWordAddTo(int i15, int i16, int[] iArr, int i17, int[] iArr2, int i18) {
        long j15 = ((long) i16) & 4294967295L;
        long j16 = 0;
        int i19 = 0;
        do {
            int i25 = i18 + i19;
            long j17 = j16 + ((((long) iArr[i17 + i19]) & 4294967295L) * j15) + (((long) iArr2[i25]) & 4294967295L);
            iArr2[i25] = (int) j17;
            j16 = j17 >>> 32;
            i19++;
        } while (i19 < i15);
        return (int) j16;
    }

    public static int mulWordDwordAddAt(int i15, int i16, long j15, int[] iArr, int i17) {
        long j16 = ((long) i16) & 4294967295L;
        long j17 = ((j15 & 4294967295L) * j16) + (((long) iArr[i17]) & 4294967295L);
        iArr[i17] = (int) j17;
        long j18 = j16 * (j15 >>> 32);
        int i18 = i17 + 1;
        long j19 = (j17 >>> 32) + j18 + (((long) iArr[i18]) & 4294967295L);
        iArr[i18] = (int) j19;
        int i19 = i17 + 2;
        long j25 = (j19 >>> 32) + (((long) iArr[i19]) & 4294967295L);
        iArr[i19] = (int) j25;
        if ((j25 >>> 32) == 0) {
            return 0;
        }
        return incAt(i15, iArr, i17 + 3);
    }

    public static int shiftDownBit(int i15, int[] iArr, int i16) {
        while (true) {
            i15--;
            if (i15 < 0) {
                return i16 << 31;
            }
            int i17 = iArr[i15];
            iArr[i15] = (i16 << 31) | (i17 >>> 1);
            i16 = i17;
        }
    }

    public static int shiftDownBits(int i15, int[] iArr, int i16, int i17) {
        while (true) {
            i15--;
            if (i15 < 0) {
                return i17 << (-i16);
            }
            int i18 = iArr[i15];
            iArr[i15] = (i17 << (-i16)) | (i18 >>> i16);
            i17 = i18;
        }
    }

    public static int shiftDownWord(int i15, int[] iArr, int i16) {
        while (true) {
            i15--;
            if (i15 < 0) {
                return i16;
            }
            int i17 = iArr[i15];
            iArr[i15] = i16;
            i16 = i17;
        }
    }

    public static int shiftUpBit(int i15, int[] iArr, int i16) {
        int i17 = 0;
        while (i17 < i15) {
            int i18 = iArr[i17];
            iArr[i17] = (i16 >>> 31) | (i18 << 1);
            i17++;
            i16 = i18;
        }
        return i16 >>> 31;
    }

    public static long shiftUpBit64(int i15, long[] jArr, int i16, long j15, long[] jArr2, int i17) {
        int i18 = 0;
        while (i18 < i15) {
            long j16 = jArr[i16 + i18];
            jArr2[i17 + i18] = (j15 >>> 63) | (j16 << 1);
            i18++;
            j15 = j16;
        }
        return j15 >>> 63;
    }

    public static int shiftUpBits(int i15, int[] iArr, int i16, int i17) {
        int i18 = 0;
        while (i18 < i15) {
            int i19 = iArr[i18];
            iArr[i18] = (i17 >>> (-i16)) | (i19 << i16);
            i18++;
            i17 = i19;
        }
        return i17 >>> (-i16);
    }

    public static long shiftUpBits64(int i15, long[] jArr, int i16, int i17, long j15) {
        int i18 = 0;
        while (i18 < i15) {
            int i19 = i16 + i18;
            long j16 = jArr[i19];
            jArr[i19] = (j15 >>> (-i17)) | (j16 << i17);
            i18++;
            j15 = j16;
        }
        return j15 >>> (-i17);
    }

    public static void square(int i15, int[] iArr, int i16, int[] iArr2, int i17) {
        int i18;
        int i19 = i15 << 1;
        int i25 = 0;
        int i26 = i15;
        int i27 = i19;
        do {
            i26--;
            long j15 = ((long) iArr[i16 + i26]) & 4294967295L;
            long j16 = j15 * j15;
            iArr2[(i27 - 1) + i17] = (i25 << 31) | ((int) (j16 >>> 33));
            i27 -= 2;
            iArr2[i17 + i27] = (int) (j16 >>> 1);
            i25 = (int) j16;
        } while (i26 > 0);
        int i28 = i17 + 2;
        long j17 = 0;
        for (i18 = 1; i18 < i15; i18++) {
            long jSquareWordAddTo = j17 + (((long) squareWordAddTo(iArr, i16, i18, iArr2, i17)) & 4294967295L) + (((long) iArr2[i28]) & 4294967295L);
            int i29 = i28 + 1;
            iArr2[i28] = (int) jSquareWordAddTo;
            long j18 = (jSquareWordAddTo >>> 32) + (((long) iArr2[i29]) & 4294967295L);
            i28 += 2;
            iArr2[i29] = (int) j18;
            j17 = j18 >>> 32;
        }
        shiftUpBit(i19, iArr2, i17, iArr[i16] << 31);
    }

    public static int squareWordAddTo(int[] iArr, int i15, int i16, int[] iArr2, int i17) {
        long j15 = ((long) iArr[i15 + i16]) & 4294967295L;
        int i18 = 0;
        long j16 = 0;
        int i19 = i17;
        do {
            int i25 = i16 + i19;
            long j17 = j16 + ((((long) iArr[i15 + i18]) & 4294967295L) * j15) + (((long) iArr2[i25]) & 4294967295L);
            iArr2[i25] = (int) j17;
            j16 = j17 >>> 32;
            i19++;
            i18++;
        } while (i18 < i16);
        return (int) j16;
    }

    public static int sub(int i15, int[] iArr, int i16, int[] iArr2, int i17, int[] iArr3, int i18) {
        long j15 = 0;
        for (int i19 = 0; i19 < i15; i19++) {
            long j16 = j15 + ((((long) iArr[i16 + i19]) & 4294967295L) - (4294967295L & ((long) iArr2[i17 + i19])));
            iArr3[i18 + i19] = (int) j16;
            j15 = j16 >> 32;
        }
        return (int) j15;
    }

    public static int sub33At(int i15, int i16, int[] iArr, int i17) {
        long j15 = (((long) iArr[i17]) & 4294967295L) - (((long) i16) & 4294967295L);
        iArr[i17] = (int) j15;
        int i18 = i17 + 1;
        long j16 = (j15 >> 32) + ((4294967295L & ((long) iArr[i18])) - 1);
        iArr[i18] = (int) j16;
        if ((j16 >> 32) == 0) {
            return 0;
        }
        return decAt(i15, iArr, i17 + 2);
    }

    public static int sub33From(int i15, int i16, int[] iArr) {
        long j15 = (((long) iArr[0]) & 4294967295L) - (((long) i16) & 4294967295L);
        iArr[0] = (int) j15;
        long j16 = (j15 >> 32) + ((4294967295L & ((long) iArr[1])) - 1);
        iArr[1] = (int) j16;
        if ((j16 >> 32) == 0) {
            return 0;
        }
        return decAt(i15, iArr, 2);
    }

    public static int subBothFrom(int i15, int[] iArr, int i16, int[] iArr2, int i17, int[] iArr3, int i18) {
        long j15 = 0;
        for (int i19 = 0; i19 < i15; i19++) {
            int i25 = i18 + i19;
            long j16 = j15 + (((((long) iArr3[i25]) & 4294967295L) - (((long) iArr[i16 + i19]) & 4294967295L)) - (4294967295L & ((long) iArr2[i17 + i19])));
            iArr3[i25] = (int) j16;
            j15 = j16 >> 32;
        }
        return (int) j15;
    }

    public static int subDWordAt(int i15, long j15, int[] iArr, int i16) {
        long j16 = (((long) iArr[i16]) & 4294967295L) - (j15 & 4294967295L);
        iArr[i16] = (int) j16;
        int i17 = i16 + 1;
        long j17 = (j16 >> 32) + ((4294967295L & ((long) iArr[i17])) - (j15 >>> 32));
        iArr[i17] = (int) j17;
        if ((j17 >> 32) == 0) {
            return 0;
        }
        return decAt(i15, iArr, i16 + 2);
    }

    public static int subDWordFrom(int i15, long j15, int[] iArr) {
        long j16 = (((long) iArr[0]) & 4294967295L) - (j15 & 4294967295L);
        iArr[0] = (int) j16;
        long j17 = (j16 >> 32) + ((4294967295L & ((long) iArr[1])) - (j15 >>> 32));
        iArr[1] = (int) j17;
        if ((j17 >> 32) == 0) {
            return 0;
        }
        return decAt(i15, iArr, 2);
    }

    public static int subFrom(int i15, int[] iArr, int i16, int[] iArr2, int i17) {
        long j15 = 0;
        for (int i18 = 0; i18 < i15; i18++) {
            int i19 = i17 + i18;
            long j16 = j15 + ((((long) iArr2[i19]) & 4294967295L) - (4294967295L & ((long) iArr[i16 + i18])));
            iArr2[i19] = (int) j16;
            j15 = j16 >> 32;
        }
        return (int) j15;
    }

    public static int subWordAt(int i15, int i16, int[] iArr, int i17) {
        long j15 = (((long) iArr[i17]) & 4294967295L) - (4294967295L & ((long) i16));
        iArr[i17] = (int) j15;
        if ((j15 >> 32) == 0) {
            return 0;
        }
        return decAt(i15, iArr, i17 + 1);
    }

    public static int subWordFrom(int i15, int i16, int[] iArr) {
        long j15 = (((long) iArr[0]) & 4294967295L) - (4294967295L & ((long) i16));
        iArr[0] = (int) j15;
        if ((j15 >> 32) == 0) {
            return 0;
        }
        return decAt(i15, iArr, 1);
    }

    public static BigInteger toBigInteger(int i15, int[] iArr) {
        byte[] bArr = new byte[i15 << 2];
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = iArr[i16];
            if (i17 != 0) {
                Pack.intToBigEndian(i17, bArr, ((i15 - 1) - i16) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int i15, int[] iArr) {
        for (int i16 = 0; i16 < i15; i16++) {
            iArr[i16] = 0;
        }
    }

    public static void zero64(int i15, long[] jArr) {
        for (int i16 = 0; i16 < i15; i16++) {
            jArr[i16] = 0;
        }
    }

    public static int add33At(int i15, int i16, int[] iArr, int i17, int i18) {
        int i19 = i17 + i18;
        long j15 = (((long) iArr[i19]) & 4294967295L) + (((long) i16) & 4294967295L);
        iArr[i19] = (int) j15;
        int i25 = i19 + 1;
        long j16 = (j15 >>> 32) + (4294967295L & ((long) iArr[i25])) + 1;
        iArr[i25] = (int) j16;
        if ((j16 >>> 32) == 0) {
            return 0;
        }
        return incAt(i15, iArr, i17, i18 + 2);
    }

    public static int add33To(int i15, int i16, int[] iArr, int i17) {
        long j15 = (((long) iArr[i17]) & 4294967295L) + (((long) i16) & 4294967295L);
        iArr[i17] = (int) j15;
        int i18 = i17 + 1;
        long j16 = (j15 >>> 32) + (4294967295L & ((long) iArr[i18])) + 1;
        iArr[i18] = (int) j16;
        if ((j16 >>> 32) == 0) {
            return 0;
        }
        return incAt(i15, iArr, i17, 2);
    }

    public static int addBothTo(int i15, int[] iArr, int[] iArr2, int[] iArr3) {
        long j15 = 0;
        for (int i16 = 0; i16 < i15; i16++) {
            long j16 = j15 + (((long) iArr[i16]) & 4294967295L) + (((long) iArr2[i16]) & 4294967295L) + (4294967295L & ((long) iArr3[i16]));
            iArr3[i16] = (int) j16;
            j15 = j16 >>> 32;
        }
        return (int) j15;
    }

    public static int addDWordAt(int i15, long j15, int[] iArr, int i16, int i17) {
        int i18 = i16 + i17;
        long j16 = (((long) iArr[i18]) & 4294967295L) + (j15 & 4294967295L);
        iArr[i18] = (int) j16;
        int i19 = i18 + 1;
        long j17 = (j16 >>> 32) + (4294967295L & ((long) iArr[i19])) + (j15 >>> 32);
        iArr[i19] = (int) j17;
        if ((j17 >>> 32) == 0) {
            return 0;
        }
        return incAt(i15, iArr, i16, i17 + 2);
    }

    public static int addDWordTo(int i15, long j15, int[] iArr, int i16) {
        long j16 = (((long) iArr[i16]) & 4294967295L) + (j15 & 4294967295L);
        iArr[i16] = (int) j16;
        int i17 = i16 + 1;
        long j17 = (j16 >>> 32) + (4294967295L & ((long) iArr[i17])) + (j15 >>> 32);
        iArr[i17] = (int) j17;
        if ((j17 >>> 32) == 0) {
            return 0;
        }
        return incAt(i15, iArr, i16, 2);
    }

    public static int addTo(int i15, int[] iArr, int i16, int[] iArr2, int i17, int i18) {
        long j15 = ((long) i18) & 4294967295L;
        for (int i19 = 0; i19 < i15; i19++) {
            int i25 = i17 + i19;
            long j16 = j15 + (((long) iArr[i16 + i19]) & 4294967295L) + (((long) iArr2[i25]) & 4294967295L);
            iArr2[i25] = (int) j16;
            j15 = j16 >>> 32;
        }
        return (int) j15;
    }

    public static int addWordAt(int i15, int i16, int[] iArr, int i17, int i18) {
        long j15 = ((long) i16) & 4294967295L;
        int i19 = i17 + i18;
        long j16 = j15 + (4294967295L & ((long) iArr[i19]));
        iArr[i19] = (int) j16;
        if ((j16 >>> 32) == 0) {
            return 0;
        }
        return incAt(i15, iArr, i17, i18 + 1);
    }

    public static int addWordTo(int i15, int i16, int[] iArr, int i17) {
        long j15 = (((long) i16) & 4294967295L) + (4294967295L & ((long) iArr[i17]));
        iArr[i17] = (int) j15;
        if ((j15 >>> 32) == 0) {
            return 0;
        }
        return incAt(i15, iArr, i17, 1);
    }

    public static int compare(int i15, int[] iArr, int[] iArr2) {
        for (int i16 = i15 - 1; i16 >= 0; i16--) {
            int i17 = iArr[i16] ^ PKIFailureInfo.systemUnavail;
            int i18 = Integer.MIN_VALUE ^ iArr2[i16];
            if (i17 < i18) {
                return -1;
            }
            if (i17 > i18) {
                return 1;
            }
        }
        return 0;
    }

    public static void copy(int i15, int[] iArr, int[] iArr2) {
        System.arraycopy(iArr, 0, iArr2, 0, i15);
    }

    public static void copy64(int i15, long[] jArr, long[] jArr2) {
        System.arraycopy(jArr, 0, jArr2, 0, i15);
    }

    public static int csub(int i15, int i16, int[] iArr, int[] iArr2, int[] iArr3) {
        long j15 = ((long) (-(i16 & 1))) & 4294967295L;
        long j16 = 0;
        for (int i17 = 0; i17 < i15; i17++) {
            long j17 = j16 + ((((long) iArr[i17]) & 4294967295L) - (((long) iArr2[i17]) & j15));
            iArr3[i17] = (int) j17;
            j16 = j17 >> 32;
        }
        return (int) j16;
    }

    public static int dec(int i15, int[] iArr, int[] iArr2) {
        int i16 = 0;
        while (i16 < i15) {
            int i17 = iArr[i16] - 1;
            iArr2[i16] = i17;
            i16++;
            if (i17 != -1) {
                while (i16 < i15) {
                    iArr2[i16] = iArr[i16];
                    i16++;
                }
                return 0;
            }
        }
        return -1;
    }

    public static int decAt(int i15, int[] iArr, int i16, int i17) {
        while (i17 < i15) {
            int i18 = i16 + i17;
            int i19 = iArr[i18] - 1;
            iArr[i18] = i19;
            if (i19 != -1) {
                return 0;
            }
            i17++;
        }
        return -1;
    }

    public static int equalTo(int i15, int[] iArr, int i16, int i17) {
        int i18 = i17 ^ iArr[i16];
        for (int i19 = 1; i19 < i15; i19++) {
            i18 |= iArr[i16 + i19];
        }
        return (((i18 >>> 1) | (i18 & 1)) - 1) >> 31;
    }

    public static int equalToZero(int i15, int[] iArr, int i16) {
        int i17 = 0;
        for (int i18 = 0; i18 < i15; i18++) {
            i17 |= iArr[i16 + i18];
        }
        return (((i17 >>> 1) | (i17 & 1)) - 1) >> 31;
    }

    public static int getBitLength(int i15, int[] iArr, int i16) {
        for (int i17 = i15 - 1; i17 >= 0; i17--) {
            int i18 = iArr[i16 + i17];
            if (i18 != 0) {
                return ((i17 * 32) + 32) - Integers.numberOfLeadingZeros(i18);
            }
        }
        return 0;
    }

    public static boolean gte(int i15, int[] iArr, int[] iArr2) {
        for (int i16 = i15 - 1; i16 >= 0; i16--) {
            int i17 = iArr[i16] ^ PKIFailureInfo.systemUnavail;
            int i18 = Integer.MIN_VALUE ^ iArr2[i16];
            if (i17 < i18) {
                return false;
            }
            if (i17 > i18) {
                return true;
            }
        }
        return true;
    }

    public static int inc(int i15, int[] iArr, int[] iArr2) {
        int i16 = 0;
        while (i16 < i15) {
            int i17 = iArr[i16] + 1;
            iArr2[i16] = i17;
            i16++;
            if (i17 != 0) {
                while (i16 < i15) {
                    iArr2[i16] = iArr[i16];
                    i16++;
                }
                return 0;
            }
        }
        return 1;
    }

    public static int incAt(int i15, int[] iArr, int i16, int i17) {
        while (i17 < i15) {
            int i18 = i16 + i17;
            int i19 = iArr[i18] + 1;
            iArr[i18] = i19;
            if (i19 != 0) {
                return 0;
            }
            i17++;
        }
        return 1;
    }

    public static int lessThan(int i15, int[] iArr, int[] iArr2) {
        long j15 = 0;
        for (int i16 = 0; i16 < i15; i16++) {
            j15 = (j15 + ((((long) iArr[i16]) & 4294967295L) - (4294967295L & ((long) iArr2[i16])))) >> 32;
        }
        return (int) j15;
    }

    public static void mul(int i15, int[] iArr, int[] iArr2, int[] iArr3) {
        iArr3[i15] = mulWord(i15, iArr[0], iArr2, iArr3);
        int i16 = 1;
        while (i16 < i15) {
            int i17 = i15;
            iArr3[i16 + i15] = mulWordAddTo(i17, iArr[i16], iArr2, 0, iArr3, i16);
            i16++;
            i15 = i17;
        }
    }

    public static int mulAddTo(int i15, int[] iArr, int[] iArr2, int[] iArr3) {
        long j15 = 0;
        int i16 = 0;
        while (i16 < i15) {
            int i17 = i15;
            int[] iArr4 = iArr2;
            int[] iArr5 = iArr3;
            int i18 = i16 + i17;
            long jMulWordAddTo = j15 + (((long) mulWordAddTo(i17, iArr[i16], iArr4, 0, iArr5, i16)) & 4294967295L) + (((long) iArr5[i18]) & 4294967295L);
            iArr5[i18] = (int) jMulWordAddTo;
            j15 = jMulWordAddTo >>> 32;
            i16++;
            i15 = i17;
            iArr2 = iArr4;
            iArr3 = iArr5;
        }
        return (int) j15;
    }

    public static int mulWord(int i15, int i16, int[] iArr, int[] iArr2) {
        long j15 = ((long) i16) & 4294967295L;
        long j16 = 0;
        int i17 = 0;
        do {
            long j17 = j16 + ((((long) iArr[i17]) & 4294967295L) * j15);
            iArr2[i17] = (int) j17;
            j16 = j17 >>> 32;
            i17++;
        } while (i17 < i15);
        return (int) j16;
    }

    public static int shiftDownBit(int i15, int[] iArr, int i16, int i17) {
        while (true) {
            i15--;
            if (i15 < 0) {
                return i17 << 31;
            }
            int i18 = i16 + i15;
            int i19 = iArr[i18];
            iArr[i18] = (i17 << 31) | (i19 >>> 1);
            i17 = i19;
        }
    }

    public static int shiftDownBits(int i15, int[] iArr, int i16, int i17, int i18) {
        while (true) {
            i15--;
            if (i15 < 0) {
                return i18 << (-i17);
            }
            int i19 = i16 + i15;
            int i25 = iArr[i19];
            iArr[i19] = (i18 << (-i17)) | (i25 >>> i17);
            i18 = i25;
        }
    }

    public static int shiftUpBit(int i15, int[] iArr, int i16, int i17) {
        int i18 = 0;
        while (i18 < i15) {
            int i19 = i16 + i18;
            int i25 = iArr[i19];
            iArr[i19] = (i17 >>> 31) | (i25 << 1);
            i18++;
            i17 = i25;
        }
        return i17 >>> 31;
    }

    public static int shiftUpBits(int i15, int[] iArr, int i16, int i17, int i18) {
        int i19 = 0;
        while (i19 < i15) {
            int i25 = i16 + i19;
            int i26 = iArr[i25];
            iArr[i25] = (i18 >>> (-i17)) | (i26 << i17);
            i19++;
            i18 = i26;
        }
        return i18 >>> (-i17);
    }

    public static long shiftUpBits64(int i15, long[] jArr, int i16, int i17, long j15, long[] jArr2, int i18) {
        int i19 = 0;
        while (i19 < i15) {
            long j16 = jArr[i16 + i19];
            jArr2[i18 + i19] = (j15 >>> (-i17)) | (j16 << i17);
            i19++;
            j15 = j16;
        }
        return j15 >>> (-i17);
    }

    public static void square(int i15, int[] iArr, int[] iArr2) {
        int i16;
        int i17 = i15 << 1;
        int i18 = i15;
        int i19 = i17;
        int i25 = 0;
        while (true) {
            i18--;
            long j15 = ((long) iArr[i18]) & 4294967295L;
            long j16 = j15 * j15;
            iArr2[i19 - 1] = (i25 << 31) | ((int) (j16 >>> 33));
            i19 -= 2;
            iArr2[i19] = (int) (j16 >>> 1);
            int i26 = (int) j16;
            if (i18 <= 0) {
                break;
            } else {
                i25 = i26;
            }
        }
        long j17 = 0;
        int i27 = 2;
        for (i16 = 1; i16 < i15; i16++) {
            long jSquareWordAddTo = j17 + (((long) squareWordAddTo(iArr, i16, iArr2)) & 4294967295L) + (((long) iArr2[i27]) & 4294967295L);
            int i28 = i27 + 1;
            iArr2[i27] = (int) jSquareWordAddTo;
            long j18 = (jSquareWordAddTo >>> 32) + (((long) iArr2[i28]) & 4294967295L);
            i27 += 2;
            iArr2[i28] = (int) j18;
            j17 = j18 >>> 32;
        }
        shiftUpBit(i17, iArr2, iArr[0] << 31);
    }

    public static int squareWordAddTo(int[] iArr, int i15, int[] iArr2) {
        long j15 = ((long) iArr[i15]) & 4294967295L;
        long j16 = 0;
        int i16 = 0;
        do {
            int i17 = i15 + i16;
            long j17 = j16 + ((((long) iArr[i16]) & 4294967295L) * j15) + (((long) iArr2[i17]) & 4294967295L);
            iArr2[i17] = (int) j17;
            j16 = j17 >>> 32;
            i16++;
        } while (i16 < i15);
        return (int) j16;
    }

    public static int sub(int i15, int[] iArr, int[] iArr2, int[] iArr3) {
        long j15 = 0;
        for (int i16 = 0; i16 < i15; i16++) {
            long j16 = j15 + ((((long) iArr[i16]) & 4294967295L) - (4294967295L & ((long) iArr2[i16])));
            iArr3[i16] = (int) j16;
            j15 = j16 >> 32;
        }
        return (int) j15;
    }

    public static int sub33At(int i15, int i16, int[] iArr, int i17, int i18) {
        int i19 = i17 + i18;
        long j15 = (((long) iArr[i19]) & 4294967295L) - (((long) i16) & 4294967295L);
        iArr[i19] = (int) j15;
        int i25 = i19 + 1;
        long j16 = (j15 >> 32) + ((4294967295L & ((long) iArr[i25])) - 1);
        iArr[i25] = (int) j16;
        if ((j16 >> 32) == 0) {
            return 0;
        }
        return decAt(i15, iArr, i17, i18 + 2);
    }

    public static int sub33From(int i15, int i16, int[] iArr, int i17) {
        long j15 = (((long) iArr[i17]) & 4294967295L) - (((long) i16) & 4294967295L);
        iArr[i17] = (int) j15;
        int i18 = i17 + 1;
        long j16 = (j15 >> 32) + ((4294967295L & ((long) iArr[i18])) - 1);
        iArr[i18] = (int) j16;
        if ((j16 >> 32) == 0) {
            return 0;
        }
        return decAt(i15, iArr, i17, 2);
    }

    public static int subBothFrom(int i15, int[] iArr, int[] iArr2, int[] iArr3) {
        long j15 = 0;
        for (int i16 = 0; i16 < i15; i16++) {
            long j16 = j15 + (((((long) iArr3[i16]) & 4294967295L) - (((long) iArr[i16]) & 4294967295L)) - (4294967295L & ((long) iArr2[i16])));
            iArr3[i16] = (int) j16;
            j15 = j16 >> 32;
        }
        return (int) j15;
    }

    public static int subDWordAt(int i15, long j15, int[] iArr, int i16, int i17) {
        int i18 = i16 + i17;
        long j16 = (((long) iArr[i18]) & 4294967295L) - (j15 & 4294967295L);
        iArr[i18] = (int) j16;
        int i19 = i18 + 1;
        long j17 = (j16 >> 32) + ((4294967295L & ((long) iArr[i19])) - (j15 >>> 32));
        iArr[i19] = (int) j17;
        if ((j17 >> 32) == 0) {
            return 0;
        }
        return decAt(i15, iArr, i16, i17 + 2);
    }

    public static int subDWordFrom(int i15, long j15, int[] iArr, int i16) {
        long j16 = (((long) iArr[i16]) & 4294967295L) - (j15 & 4294967295L);
        iArr[i16] = (int) j16;
        int i17 = i16 + 1;
        long j17 = (j16 >> 32) + ((4294967295L & ((long) iArr[i17])) - (j15 >>> 32));
        iArr[i17] = (int) j17;
        if ((j17 >> 32) == 0) {
            return 0;
        }
        return decAt(i15, iArr, i16, 2);
    }

    public static int subFrom(int i15, int[] iArr, int[] iArr2) {
        long j15 = 0;
        for (int i16 = 0; i16 < i15; i16++) {
            long j16 = j15 + ((((long) iArr2[i16]) & 4294967295L) - (4294967295L & ((long) iArr[i16])));
            iArr2[i16] = (int) j16;
            j15 = j16 >> 32;
        }
        return (int) j15;
    }

    public static int subWordAt(int i15, int i16, int[] iArr, int i17, int i18) {
        int i19 = i17 + i18;
        long j15 = (((long) iArr[i19]) & 4294967295L) - (4294967295L & ((long) i16));
        iArr[i19] = (int) j15;
        if ((j15 >> 32) == 0) {
            return 0;
        }
        return decAt(i15, iArr, i17, i18 + 1);
    }

    public static int subWordFrom(int i15, int i16, int[] iArr, int i17) {
        long j15 = (((long) iArr[i17]) & 4294967295L) - (4294967295L & ((long) i16));
        iArr[i17] = (int) j15;
        if ((j15 >> 32) == 0) {
            return 0;
        }
        return decAt(i15, iArr, i17, 1);
    }

    public static void zero(int i15, int[] iArr, int i16) {
        for (int i17 = 0; i17 < i15; i17++) {
            iArr[i16 + i17] = 0;
        }
    }

    public static int addTo(int i15, int[] iArr, int[] iArr2) {
        long j15 = 0;
        for (int i16 = 0; i16 < i15; i16++) {
            long j16 = j15 + (((long) iArr[i16]) & 4294967295L) + (4294967295L & ((long) iArr2[i16]));
            iArr2[i16] = (int) j16;
            j15 = j16 >>> 32;
        }
        return (int) j15;
    }

    public static int[] copy(int i15, int[] iArr) {
        int[] iArr2 = new int[i15];
        System.arraycopy(iArr, 0, iArr2, 0, i15);
        return iArr2;
    }

    public static long[] copy64(int i15, long[] jArr) {
        long[] jArr2 = new long[i15];
        System.arraycopy(jArr, 0, jArr2, 0, i15);
        return jArr2;
    }

    public static int equalTo(int i15, int[] iArr, int i16, int[] iArr2, int i17) {
        int i18 = 0;
        for (int i19 = 0; i19 < i15; i19++) {
            i18 |= iArr[i16 + i19] ^ iArr2[i17 + i19];
        }
        return (((i18 >>> 1) | (i18 & 1)) - 1) >> 31;
    }

    public static void mul(int[] iArr, int i15, int i16, int[] iArr2, int i17, int i18, int[] iArr3, int i19) {
        iArr3[i19 + i18] = mulWord(i18, iArr[i15], iArr2, i17, iArr3, i19);
        for (int i25 = 1; i25 < i16; i25++) {
            int i26 = i19 + i25;
            iArr3[i26 + i18] = mulWordAddTo(i18, iArr[i15 + i25], iArr2, i17, iArr3, i26);
        }
    }

    public static int shiftDownBit(int i15, int[] iArr, int i16, int i17, int[] iArr2, int i18) {
        while (true) {
            i15--;
            if (i15 < 0) {
                return i17 << 31;
            }
            int i19 = iArr[i16 + i15];
            iArr2[i18 + i15] = (i17 << 31) | (i19 >>> 1);
            i17 = i19;
        }
    }

    public static int shiftDownBits(int i15, int[] iArr, int i16, int i17, int i18, int[] iArr2, int i19) {
        while (true) {
            i15--;
            if (i15 < 0) {
                return i18 << (-i17);
            }
            int i25 = iArr[i16 + i15];
            iArr2[i19 + i15] = (i18 << (-i17)) | (i25 >>> i17);
            i18 = i25;
        }
    }

    public static int shiftUpBit(int i15, int[] iArr, int i16, int i17, int[] iArr2, int i18) {
        int i19 = 0;
        while (i19 < i15) {
            int i25 = iArr[i16 + i19];
            iArr2[i18 + i19] = (i17 >>> 31) | (i25 << 1);
            i19++;
            i17 = i25;
        }
        return i17 >>> 31;
    }

    public static int shiftUpBits(int i15, int[] iArr, int i16, int i17, int i18, int[] iArr2, int i19) {
        int i25 = 0;
        while (i25 < i15) {
            int i26 = iArr[i16 + i25];
            iArr2[i19 + i25] = (i18 >>> (-i17)) | (i26 << i17);
            i25++;
            i18 = i26;
        }
        return i18 >>> (-i17);
    }

    public static int equalTo(int i15, int[] iArr, int[] iArr2) {
        int i16 = 0;
        for (int i17 = 0; i17 < i15; i17++) {
            i16 |= iArr[i17] ^ iArr2[i17];
        }
        return (((i16 >>> 1) | (i16 & 1)) - 1) >> 31;
    }

    public static int shiftDownBit(int i15, int[] iArr, int i16, int[] iArr2) {
        while (true) {
            i15--;
            if (i15 < 0) {
                return i16 << 31;
            }
            int i17 = iArr[i15];
            iArr2[i15] = (i16 << 31) | (i17 >>> 1);
            i16 = i17;
        }
    }

    public static int shiftDownBits(int i15, int[] iArr, int i16, int i17, int[] iArr2) {
        while (true) {
            i15--;
            if (i15 < 0) {
                return i17 << (-i16);
            }
            int i18 = iArr[i15];
            iArr2[i15] = (i17 << (-i16)) | (i18 >>> i16);
            i17 = i18;
        }
    }

    public static int shiftUpBit(int i15, int[] iArr, int i16, int[] iArr2) {
        int i17 = 0;
        while (i17 < i15) {
            int i18 = iArr[i17];
            iArr2[i17] = (i16 >>> 31) | (i18 << 1);
            i17++;
            i16 = i18;
        }
        return i16 >>> 31;
    }

    public static int shiftUpBits(int i15, int[] iArr, int i16, int i17, int[] iArr2) {
        int i18 = 0;
        while (i18 < i15) {
            int i19 = iArr[i18];
            iArr2[i18] = (i17 >>> (-i16)) | (i19 << i16);
            i18++;
            i17 = i19;
        }
        return i17 >>> (-i16);
    }
}
