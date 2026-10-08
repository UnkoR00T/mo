package org.bouncycastle.math.ec.rfc8032;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes5.dex */
abstract class ScalarUtil {
    private static final long M = 4294967295L;

    ScalarUtil() {
    }

    static void addShifted_NP(int i15, int i16, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i17 = i15;
        int[] iArr5 = iArr3;
        char c15 = ' ';
        int i18 = 0;
        long j15 = 4294967295L;
        long j16 = 0;
        if (i16 == 0) {
            long j17 = 0;
            while (i18 <= i17) {
                long j18 = ((long) iArr5[i18]) & 4294967295L;
                long j19 = j16 + (((long) iArr[i18]) & 4294967295L) + j18;
                long j25 = j17 + j18 + (((long) iArr2[i18]) & 4294967295L);
                int i19 = (int) j25;
                j17 = j25 >>> 32;
                iArr5[i18] = i19;
                long j26 = j19 + (((long) i19) & 4294967295L);
                iArr[i18] = (int) j26;
                j16 = j26 >>> 32;
                i18++;
            }
            return;
        }
        if (i16 < 32) {
            int i25 = 0;
            long j27 = 0;
            long j28 = 0;
            int i26 = 0;
            int i27 = 0;
            while (i18 <= i17) {
                int i28 = iArr5[i18];
                char c16 = c15;
                int i29 = -i16;
                long j29 = j15;
                long j35 = j27 + (((long) iArr[i18]) & j29) + (((long) ((i25 >>> i29) | (i28 << i16))) & j29);
                int i35 = iArr2[i18];
                long j36 = j28 + (((long) i28) & j29) + (((long) ((i35 << i16) | (i26 >>> i29))) & j29);
                int i36 = (int) j36;
                j28 = j36 >>> c16;
                iArr5[i18] = i36;
                long j37 = j35 + (((long) ((i27 >>> i29) | (i36 << i16))) & j29);
                iArr[i18] = (int) j37;
                j27 = j37 >>> c16;
                i18++;
                i26 = i35;
                i27 = i36;
                i25 = i28;
                c15 = c16;
                j15 = j29;
            }
            return;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, i17);
        int i37 = i16 >>> 5;
        int i38 = i16 & 31;
        if (i38 == 0) {
            long j38 = 0;
            for (int i39 = i37; i39 <= i17; i39++) {
                int i45 = i39 - i37;
                long j39 = j16 + (((long) iArr[i39]) & 4294967295L) + (((long) iArr4[i45]) & 4294967295L);
                long j45 = j38 + (((long) iArr5[i39]) & 4294967295L) + (((long) iArr2[i45]) & 4294967295L);
                iArr5[i39] = (int) j45;
                j38 = j45 >>> 32;
                long j46 = j39 + (((long) iArr5[i45]) & 4294967295L);
                iArr[i39] = (int) j46;
                j16 = j46 >>> 32;
            }
            return;
        }
        int i46 = i37;
        int i47 = 0;
        int i48 = 0;
        long j47 = 0;
        while (i46 <= i17) {
            int i49 = i46 - i37;
            int i55 = iArr4[i49];
            int i56 = -i38;
            int i57 = i38;
            long j48 = j16 + (((long) iArr[i46]) & 4294967295L) + (((long) ((i18 >>> i56) | (i55 << i38))) & 4294967295L);
            int i58 = iArr2[i49];
            long j49 = j47 + (((long) iArr5[i46]) & 4294967295L) + (((long) ((i58 << i57) | (i47 >>> i56))) & 4294967295L);
            iArr3[i46] = (int) j49;
            j47 = j49 >>> 32;
            int i59 = iArr3[i49];
            long j55 = j48 + (((long) ((i59 << i57) | (i48 >>> i56))) & 4294967295L);
            iArr[i46] = (int) j55;
            j16 = j55 >>> 32;
            i46++;
            i38 = i57;
            iArr5 = iArr3;
            i48 = i59;
            i47 = i58;
            i18 = i55;
            i17 = i15;
        }
    }

    static void addShifted_UV(int i15, int i16, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i17 = i16 >>> 5;
        int i18 = i16 & 31;
        char c15 = ' ';
        long j15 = 4294967295L;
        long j16 = 0;
        if (i18 == 0) {
            long j17 = 0;
            for (int i19 = i17; i19 <= i15; i19++) {
                long j18 = j16 + (((long) iArr[i19]) & 4294967295L);
                long j19 = j17 + (((long) iArr2[i19]) & 4294967295L);
                int i25 = i19 - i17;
                long j25 = j18 + (((long) iArr3[i25]) & 4294967295L);
                long j26 = j19 + (((long) iArr4[i25]) & 4294967295L);
                iArr[i19] = (int) j25;
                j16 = j25 >>> 32;
                iArr2[i19] = (int) j26;
                j17 = j26 >>> 32;
            }
            return;
        }
        int i26 = i17;
        int i27 = 0;
        int i28 = 0;
        long j27 = 0;
        while (i26 <= i15) {
            int i29 = i26 - i17;
            int i35 = iArr3[i29];
            int i36 = iArr4[i29];
            char c16 = c15;
            int i37 = -i18;
            long j28 = j15;
            long j29 = j16 + (((long) iArr[i26]) & j28);
            long j35 = j29 + (((long) ((i27 >>> i37) | (i35 << i18))) & j28);
            long j36 = j27 + (((long) iArr2[i26]) & j28) + (((long) ((i28 >>> i37) | (i36 << i18))) & j28);
            iArr[i26] = (int) j35;
            j16 = j35 >>> c16;
            iArr2[i26] = (int) j36;
            j27 = j36 >>> c16;
            i26++;
            c15 = c16;
            i28 = i36;
            i27 = i35;
            j15 = j28;
        }
    }

    static int getBitLength(int i15, int[] iArr) {
        int i16 = iArr[i15] >> 31;
        while (i15 > 0 && iArr[i15] == i16) {
            i15--;
        }
        return ((i15 * 32) + 32) - Integers.numberOfLeadingZeros(iArr[i15] ^ i16);
    }

    static int getBitLengthPositive(int i15, int[] iArr) {
        while (i15 > 0 && iArr[i15] == 0) {
            i15--;
        }
        return ((i15 * 32) + 32) - Integers.numberOfLeadingZeros(iArr[i15]);
    }

    static boolean lessThan(int i15, int[] iArr, int[] iArr2) {
        do {
            int i16 = iArr[i15] + PKIFailureInfo.systemUnavail;
            int i17 = iArr2[i15] + PKIFailureInfo.systemUnavail;
            if (i16 < i17) {
                return true;
            }
            if (i16 > i17) {
                return false;
            }
            i15--;
        } while (i15 >= 0);
        return false;
    }

    static void subShifted_NP(int i15, int i16, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i17 = i15;
        int[] iArr5 = iArr3;
        char c15 = ' ';
        int i18 = 0;
        long j15 = 4294967295L;
        long j16 = 0;
        if (i16 == 0) {
            long j17 = 0;
            while (i18 <= i17) {
                long j18 = ((long) iArr5[i18]) & 4294967295L;
                long j19 = (j16 + (((long) iArr[i18]) & 4294967295L)) - j18;
                long j25 = (j17 + j18) - (((long) iArr2[i18]) & 4294967295L);
                int i19 = (int) j25;
                j17 = j25 >> 32;
                iArr5[i18] = i19;
                long j26 = j19 - (((long) i19) & 4294967295L);
                iArr[i18] = (int) j26;
                j16 = j26 >> 32;
                i18++;
            }
            return;
        }
        if (i16 < 32) {
            int i25 = 0;
            long j27 = 0;
            long j28 = 0;
            int i26 = 0;
            int i27 = 0;
            while (i18 <= i17) {
                int i28 = iArr5[i18];
                char c16 = c15;
                int i29 = -i16;
                long j29 = j15;
                long j35 = (j27 + (((long) iArr[i18]) & j29)) - (((long) ((i25 >>> i29) | (i28 << i16))) & j29);
                int i35 = iArr2[i18];
                long j36 = (j28 + (((long) i28) & j29)) - (((long) ((i35 << i16) | (i26 >>> i29))) & j29);
                int i36 = (int) j36;
                j28 = j36 >> c16;
                iArr5[i18] = i36;
                long j37 = j35 - (((long) ((i27 >>> i29) | (i36 << i16))) & j29);
                iArr[i18] = (int) j37;
                j27 = j37 >> c16;
                i18++;
                i26 = i35;
                i27 = i36;
                i25 = i28;
                c15 = c16;
                j15 = j29;
            }
            return;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, i17);
        int i37 = i16 >>> 5;
        int i38 = i16 & 31;
        if (i38 == 0) {
            long j38 = 0;
            for (int i39 = i37; i39 <= i17; i39++) {
                int i45 = i39 - i37;
                long j39 = (j16 + (((long) iArr[i39]) & 4294967295L)) - (((long) iArr4[i45]) & 4294967295L);
                long j45 = (j38 + (((long) iArr5[i39]) & 4294967295L)) - (((long) iArr2[i45]) & 4294967295L);
                iArr5[i39] = (int) j45;
                j38 = j45 >> 32;
                long j46 = j39 - (((long) iArr5[i45]) & 4294967295L);
                iArr[i39] = (int) j46;
                j16 = j46 >> 32;
            }
            return;
        }
        int i46 = i37;
        int i47 = 0;
        int i48 = 0;
        long j47 = 0;
        while (i46 <= i17) {
            int i49 = i46 - i37;
            int i55 = iArr4[i49];
            int i56 = -i38;
            int i57 = i38;
            long j48 = (j16 + (((long) iArr[i46]) & 4294967295L)) - (((long) ((i18 >>> i56) | (i55 << i38))) & 4294967295L);
            int i58 = iArr2[i49];
            long j49 = (j47 + (((long) iArr5[i46]) & 4294967295L)) - (((long) ((i58 << i57) | (i47 >>> i56))) & 4294967295L);
            iArr3[i46] = (int) j49;
            j47 = j49 >> 32;
            int i59 = iArr3[i49];
            long j55 = j48 - (((long) ((i59 << i57) | (i48 >>> i56))) & 4294967295L);
            iArr[i46] = (int) j55;
            j16 = j55 >> 32;
            i46++;
            i38 = i57;
            iArr5 = iArr3;
            i48 = i59;
            i47 = i58;
            i18 = i55;
            i17 = i15;
        }
    }

    static void subShifted_UV(int i15, int i16, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i17 = i16 >>> 5;
        int i18 = i16 & 31;
        char c15 = ' ';
        long j15 = 4294967295L;
        long j16 = 0;
        if (i18 == 0) {
            long j17 = 0;
            for (int i19 = i17; i19 <= i15; i19++) {
                long j18 = j16 + (((long) iArr[i19]) & 4294967295L);
                long j19 = j17 + (((long) iArr2[i19]) & 4294967295L);
                int i25 = i19 - i17;
                long j25 = j18 - (((long) iArr3[i25]) & 4294967295L);
                long j26 = j19 - (((long) iArr4[i25]) & 4294967295L);
                iArr[i19] = (int) j25;
                j16 = j25 >> 32;
                iArr2[i19] = (int) j26;
                j17 = j26 >> 32;
            }
            return;
        }
        int i26 = i17;
        int i27 = 0;
        int i28 = 0;
        long j27 = 0;
        while (i26 <= i15) {
            int i29 = i26 - i17;
            int i35 = iArr3[i29];
            int i36 = iArr4[i29];
            char c16 = c15;
            int i37 = -i18;
            long j28 = j15;
            long j29 = j16 + (((long) iArr[i26]) & j28);
            long j35 = j29 - (((long) ((i27 >>> i37) | (i35 << i18))) & j28);
            long j36 = (j27 + (((long) iArr2[i26]) & j28)) - (((long) ((i28 >>> i37) | (i36 << i18))) & j28);
            iArr[i26] = (int) j35;
            j16 = j35 >> c16;
            iArr2[i26] = (int) j36;
            j27 = j36 >> c16;
            i26++;
            c15 = c16;
            i28 = i36;
            i27 = i35;
            j15 = j28;
        }
    }
}
