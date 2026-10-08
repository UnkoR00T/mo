package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Nat256 {
    private static final long M = 4294967295L;

    public static int add(int[] iArr, int i15, int[] iArr2, int i16, int[] iArr3, int i17) {
        long j15 = (((long) iArr[i15]) & 4294967295L) + (((long) iArr2[i16]) & 4294967295L);
        iArr3[i17] = (int) j15;
        long j16 = (j15 >>> 32) + (((long) iArr[i15 + 1]) & 4294967295L) + (((long) iArr2[i16 + 1]) & 4294967295L);
        iArr3[i17 + 1] = (int) j16;
        long j17 = (j16 >>> 32) + (((long) iArr[i15 + 2]) & 4294967295L) + (((long) iArr2[i16 + 2]) & 4294967295L);
        iArr3[i17 + 2] = (int) j17;
        long j18 = (j17 >>> 32) + (((long) iArr[i15 + 3]) & 4294967295L) + (((long) iArr2[i16 + 3]) & 4294967295L);
        iArr3[i17 + 3] = (int) j18;
        long j19 = (j18 >>> 32) + (((long) iArr[i15 + 4]) & 4294967295L) + (((long) iArr2[i16 + 4]) & 4294967295L);
        iArr3[i17 + 4] = (int) j19;
        long j25 = (j19 >>> 32) + (((long) iArr[i15 + 5]) & 4294967295L) + (((long) iArr2[i16 + 5]) & 4294967295L);
        iArr3[i17 + 5] = (int) j25;
        long j26 = (j25 >>> 32) + (((long) iArr[i15 + 6]) & 4294967295L) + (((long) iArr2[i16 + 6]) & 4294967295L);
        iArr3[i17 + 6] = (int) j26;
        long j27 = (j26 >>> 32) + (((long) iArr[i15 + 7]) & 4294967295L) + (((long) iArr2[i16 + 7]) & 4294967295L);
        iArr3[i17 + 7] = (int) j27;
        return (int) (j27 >>> 32);
    }

    public static int addBothTo(int[] iArr, int i15, int[] iArr2, int i16, int[] iArr3, int i17) {
        long j15 = (((long) iArr[i15]) & 4294967295L) + (((long) iArr2[i16]) & 4294967295L) + (((long) iArr3[i17]) & 4294967295L);
        iArr3[i17] = (int) j15;
        int i18 = i17 + 1;
        long j16 = (j15 >>> 32) + (((long) iArr[i15 + 1]) & 4294967295L) + (((long) iArr2[i16 + 1]) & 4294967295L) + (((long) iArr3[i18]) & 4294967295L);
        iArr3[i18] = (int) j16;
        int i19 = i17 + 2;
        long j17 = (j16 >>> 32) + (((long) iArr[i15 + 2]) & 4294967295L) + (((long) iArr2[i16 + 2]) & 4294967295L) + (((long) iArr3[i19]) & 4294967295L);
        iArr3[i19] = (int) j17;
        int i25 = i17 + 3;
        long j18 = (j17 >>> 32) + (((long) iArr[i15 + 3]) & 4294967295L) + (((long) iArr2[i16 + 3]) & 4294967295L) + (((long) iArr3[i25]) & 4294967295L);
        iArr3[i25] = (int) j18;
        int i26 = i17 + 4;
        long j19 = (j18 >>> 32) + (((long) iArr[i15 + 4]) & 4294967295L) + (((long) iArr2[i16 + 4]) & 4294967295L) + (((long) iArr3[i26]) & 4294967295L);
        iArr3[i26] = (int) j19;
        int i27 = i17 + 5;
        long j25 = (j19 >>> 32) + (((long) iArr[i15 + 5]) & 4294967295L) + (((long) iArr2[i16 + 5]) & 4294967295L) + (((long) iArr3[i27]) & 4294967295L);
        iArr3[i27] = (int) j25;
        int i28 = i17 + 6;
        long j26 = (j25 >>> 32) + (((long) iArr[i15 + 6]) & 4294967295L) + (((long) iArr2[i16 + 6]) & 4294967295L) + (((long) iArr3[i28]) & 4294967295L);
        iArr3[i28] = (int) j26;
        int i29 = i17 + 7;
        long j27 = (j26 >>> 32) + (((long) iArr[i15 + 7]) & 4294967295L) + (((long) iArr2[i16 + 7]) & 4294967295L) + (((long) iArr3[i29]) & 4294967295L);
        iArr3[i29] = (int) j27;
        return (int) (j27 >>> 32);
    }

    public static int addTo(int[] iArr, int i15, int[] iArr2, int i16, int i17) {
        long j15 = (((long) i17) & 4294967295L) + (((long) iArr[i15]) & 4294967295L) + (((long) iArr2[i16]) & 4294967295L);
        iArr2[i16] = (int) j15;
        int i18 = i16 + 1;
        long j16 = (j15 >>> 32) + (((long) iArr[i15 + 1]) & 4294967295L) + (((long) iArr2[i18]) & 4294967295L);
        iArr2[i18] = (int) j16;
        int i19 = i16 + 2;
        long j17 = (j16 >>> 32) + (((long) iArr[i15 + 2]) & 4294967295L) + (((long) iArr2[i19]) & 4294967295L);
        iArr2[i19] = (int) j17;
        int i25 = i16 + 3;
        long j18 = (j17 >>> 32) + (((long) iArr[i15 + 3]) & 4294967295L) + (((long) iArr2[i25]) & 4294967295L);
        iArr2[i25] = (int) j18;
        int i26 = i16 + 4;
        long j19 = (j18 >>> 32) + (((long) iArr[i15 + 4]) & 4294967295L) + (((long) iArr2[i26]) & 4294967295L);
        iArr2[i26] = (int) j19;
        int i27 = i16 + 5;
        long j25 = (j19 >>> 32) + (((long) iArr[i15 + 5]) & 4294967295L) + (((long) iArr2[i27]) & 4294967295L);
        iArr2[i27] = (int) j25;
        int i28 = i16 + 6;
        long j26 = (j25 >>> 32) + (((long) iArr[i15 + 6]) & 4294967295L) + (((long) iArr2[i28]) & 4294967295L);
        iArr2[i28] = (int) j26;
        int i29 = i16 + 7;
        long j27 = (j26 >>> 32) + (((long) iArr[i15 + 7]) & 4294967295L) + (4294967295L & ((long) iArr2[i29]));
        iArr2[i29] = (int) j27;
        return (int) (j27 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i15, int[] iArr2, int i16) {
        long j15 = (((long) iArr[i15]) & 4294967295L) + (((long) iArr2[i16]) & 4294967295L);
        int i17 = (int) j15;
        iArr[i15] = i17;
        iArr2[i16] = i17;
        int i18 = i15 + 1;
        int i19 = i16 + 1;
        long j16 = (j15 >>> 32) + (((long) iArr[i18]) & 4294967295L) + (((long) iArr2[i19]) & 4294967295L);
        int i25 = (int) j16;
        iArr[i18] = i25;
        iArr2[i19] = i25;
        int i26 = i15 + 2;
        int i27 = i16 + 2;
        long j17 = (j16 >>> 32) + (((long) iArr[i26]) & 4294967295L) + (((long) iArr2[i27]) & 4294967295L);
        int i28 = (int) j17;
        iArr[i26] = i28;
        iArr2[i27] = i28;
        int i29 = i15 + 3;
        int i35 = i16 + 3;
        long j18 = (j17 >>> 32) + (((long) iArr[i29]) & 4294967295L) + (((long) iArr2[i35]) & 4294967295L);
        int i36 = (int) j18;
        iArr[i29] = i36;
        iArr2[i35] = i36;
        int i37 = i15 + 4;
        int i38 = i16 + 4;
        long j19 = (j18 >>> 32) + (((long) iArr[i37]) & 4294967295L) + (((long) iArr2[i38]) & 4294967295L);
        int i39 = (int) j19;
        iArr[i37] = i39;
        iArr2[i38] = i39;
        int i45 = i15 + 5;
        int i46 = i16 + 5;
        long j25 = (j19 >>> 32) + (((long) iArr[i45]) & 4294967295L) + (((long) iArr2[i46]) & 4294967295L);
        int i47 = (int) j25;
        iArr[i45] = i47;
        iArr2[i46] = i47;
        int i48 = i15 + 6;
        int i49 = i16 + 6;
        long j26 = (j25 >>> 32) + (((long) iArr[i48]) & 4294967295L) + (((long) iArr2[i49]) & 4294967295L);
        int i55 = (int) j26;
        iArr[i48] = i55;
        iArr2[i49] = i55;
        int i56 = i15 + 7;
        int i57 = i16 + 7;
        long j27 = (j26 >>> 32) + (((long) iArr[i56]) & 4294967295L) + (4294967295L & ((long) iArr2[i57]));
        int i58 = (int) j27;
        iArr[i56] = i58;
        iArr2[i57] = i58;
        return (int) (j27 >>> 32);
    }

    public static void copy(int[] iArr, int i15, int[] iArr2, int i16) {
        iArr2[i16] = iArr[i15];
        iArr2[i16 + 1] = iArr[i15 + 1];
        iArr2[i16 + 2] = iArr[i15 + 2];
        iArr2[i16 + 3] = iArr[i15 + 3];
        iArr2[i16 + 4] = iArr[i15 + 4];
        iArr2[i16 + 5] = iArr[i15 + 5];
        iArr2[i16 + 6] = iArr[i15 + 6];
        iArr2[i16 + 7] = iArr[i15 + 7];
    }

    public static void copy64(long[] jArr, int i15, long[] jArr2, int i16) {
        jArr2[i16] = jArr[i15];
        jArr2[i16 + 1] = jArr[i15 + 1];
        jArr2[i16 + 2] = jArr[i15 + 2];
        jArr2[i16 + 3] = jArr[i15 + 3];
    }

    public static int[] create() {
        return new int[8];
    }

    public static long[] create64() {
        return new long[4];
    }

    public static int[] createExt() {
        return new int[16];
    }

    public static long[] createExt64() {
        return new long[8];
    }

    public static boolean diff(int[] iArr, int i15, int[] iArr2, int i16, int[] iArr3, int i17) {
        boolean zGte = gte(iArr, i15, iArr2, i16);
        if (zGte) {
            sub(iArr, i15, iArr2, i16, iArr3, i17);
            return zGte;
        }
        sub(iArr2, i16, iArr, i15, iArr3, i17);
        return zGte;
    }

    public static boolean eq(int[] iArr, int[] iArr2) {
        for (int i15 = 7; i15 >= 0; i15--) {
            if (iArr[i15] != iArr2[i15]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i15 = 3; i15 >= 0; i15--) {
            if (jArr[i15] != jArr2[i15]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        int[] iArrCreate = create();
        for (int i15 = 0; i15 < 8; i15++) {
            iArrCreate[i15] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArrCreate;
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        long[] jArrCreate64 = create64();
        for (int i15 = 0; i15 < 4; i15++) {
            jArrCreate64[i15] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
        }
        return jArrCreate64;
    }

    public static int getBit(int[] iArr, int i15) {
        int i16;
        if (i15 == 0) {
            i16 = iArr[0];
        } else {
            if ((i15 & GF2Field.MASK) != i15) {
                return 0;
            }
            i16 = iArr[i15 >>> 5] >>> (i15 & 31);
        }
        return i16 & 1;
    }

    public static boolean gte(int[] iArr, int i15, int[] iArr2, int i16) {
        for (int i17 = 7; i17 >= 0; i17--) {
            int i18 = iArr[i15 + i17] ^ PKIFailureInfo.systemUnavail;
            int i19 = Integer.MIN_VALUE ^ iArr2[i16 + i17];
            if (i18 < i19) {
                return false;
            }
            if (i18 > i19) {
                return true;
            }
        }
        return true;
    }

    public static boolean isOne(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i15 = 1; i15 < 8; i15++) {
            if (iArr[i15] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOne64(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i15 = 1; i15 < 4; i15++) {
            if (jArr[i15] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i15 = 0; i15 < 8; i15++) {
            if (iArr[i15] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i15 = 0; i15 < 4; i15++) {
            if (jArr[i15] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int i15, int[] iArr2, int i16, int[] iArr3, int i17) {
        long j15 = ((long) iArr2[i16]) & 4294967295L;
        long j16 = ((long) iArr2[i16 + 1]) & 4294967295L;
        long j17 = ((long) iArr2[i16 + 2]) & 4294967295L;
        long j18 = ((long) iArr2[i16 + 3]) & 4294967295L;
        long j19 = ((long) iArr2[i16 + 4]) & 4294967295L;
        long j25 = ((long) iArr2[i16 + 5]) & 4294967295L;
        long j26 = ((long) iArr2[i16 + 6]) & 4294967295L;
        long j27 = ((long) iArr2[i16 + 7]) & 4294967295L;
        long j28 = ((long) iArr[i15]) & 4294967295L;
        long j29 = j28 * j15;
        iArr3[i17] = (int) j29;
        long j35 = (j29 >>> 32) + (j28 * j16);
        iArr3[i17 + 1] = (int) j35;
        long j36 = (j35 >>> 32) + (j28 * j17);
        iArr3[i17 + 2] = (int) j36;
        long j37 = (j36 >>> 32) + (j28 * j18);
        iArr3[i17 + 3] = (int) j37;
        long j38 = (j37 >>> 32) + (j28 * j19);
        iArr3[i17 + 4] = (int) j38;
        long j39 = (j38 >>> 32) + (j28 * j25);
        iArr3[i17 + 5] = (int) j39;
        long j45 = (j39 >>> 32) + (j28 * j26);
        iArr3[i17 + 6] = (int) j45;
        long j46 = (j45 >>> 32) + (j28 * j27);
        iArr3[i17 + 7] = (int) j46;
        iArr3[i17 + 8] = (int) (j46 >>> 32);
        int i18 = 1;
        int i19 = i17;
        while (i18 < 8) {
            int i25 = i19 + 1;
            int i26 = i19;
            long j47 = ((long) iArr[i15 + i18]) & 4294967295L;
            long j48 = (j47 * j15) + (((long) iArr3[i25]) & 4294967295L);
            iArr3[i25] = (int) j48;
            int i27 = i26 + 2;
            long j49 = (j48 >>> 32) + (j47 * j16) + (((long) iArr3[i27]) & 4294967295L);
            iArr3[i27] = (int) j49;
            int i28 = i26 + 3;
            long j55 = (j49 >>> 32) + (j47 * j17) + (((long) iArr3[i28]) & 4294967295L);
            iArr3[i28] = (int) j55;
            int i29 = i26 + 4;
            long j56 = (j55 >>> 32) + (j47 * j18) + (((long) iArr3[i29]) & 4294967295L);
            iArr3[i29] = (int) j56;
            int i35 = i26 + 5;
            long j57 = (j56 >>> 32) + (j47 * j19) + (((long) iArr3[i35]) & 4294967295L);
            iArr3[i35] = (int) j57;
            int i36 = i26 + 6;
            long j58 = (j57 >>> 32) + (j47 * j25) + (((long) iArr3[i36]) & 4294967295L);
            iArr3[i36] = (int) j58;
            int i37 = i26 + 7;
            long j59 = (j58 >>> 32) + (j47 * j26) + (((long) iArr3[i37]) & 4294967295L);
            iArr3[i37] = (int) j59;
            int i38 = i26 + 8;
            long j65 = (j59 >>> 32) + (j47 * j27) + (((long) iArr3[i38]) & 4294967295L);
            iArr3[i38] = (int) j65;
            iArr3[i26 + 9] = (int) (j65 >>> 32);
            i18++;
            i19 = i25;
        }
    }

    public static void mul128(int[] iArr, int[] iArr2, int[] iArr3) {
        long j15 = ((long) iArr[0]) & 4294967295L;
        long j16 = ((long) iArr[1]) & 4294967295L;
        long j17 = ((long) iArr[2]) & 4294967295L;
        long j18 = ((long) iArr[3]) & 4294967295L;
        long j19 = ((long) iArr[4]) & 4294967295L;
        long j25 = ((long) iArr[5]) & 4294967295L;
        long j26 = ((long) iArr[6]) & 4294967295L;
        long j27 = ((long) iArr[7]) & 4294967295L;
        long j28 = ((long) iArr2[0]) & 4294967295L;
        long j29 = j28 * j15;
        iArr3[0] = (int) j29;
        long j35 = (j29 >>> 32) + (j28 * j16);
        iArr3[1] = (int) j35;
        long j36 = (j35 >>> 32) + (j28 * j17);
        iArr3[2] = (int) j36;
        long j37 = (j36 >>> 32) + (j28 * j18);
        iArr3[3] = (int) j37;
        long j38 = (j37 >>> 32) + (j28 * j19);
        iArr3[4] = (int) j38;
        long j39 = (j38 >>> 32) + (j28 * j25);
        iArr3[5] = (int) j39;
        long j45 = (j39 >>> 32) + (j28 * j26);
        iArr3[6] = (int) j45;
        long j46 = (j45 >>> 32) + (j28 * j27);
        iArr3[7] = (int) j46;
        iArr3[8] = (int) (j46 >>> 32);
        int i15 = 1;
        for (int i16 = 4; i15 < i16; i16 = 4) {
            long j47 = ((long) iArr2[i15]) & 4294967295L;
            long j48 = j19;
            long j49 = (j47 * j15) + (((long) iArr3[i15]) & 4294967295L);
            iArr3[i15] = (int) j49;
            int i17 = i15 + 1;
            long j55 = (j49 >>> 32) + (j47 * j16) + (((long) iArr3[i17]) & 4294967295L);
            iArr3[i17] = (int) j55;
            int i18 = i15 + 2;
            long j56 = (j55 >>> 32) + (j47 * j17) + (((long) iArr3[i18]) & 4294967295L);
            iArr3[i18] = (int) j56;
            int i19 = i15 + 3;
            long j57 = (j56 >>> 32) + (j47 * j18) + (((long) iArr3[i19]) & 4294967295L);
            iArr3[i19] = (int) j57;
            int i25 = i15 + 4;
            long j58 = (j57 >>> 32) + (j47 * j48) + (((long) iArr3[i25]) & 4294967295L);
            iArr3[i25] = (int) j58;
            int i26 = i15 + 5;
            long j59 = (j58 >>> 32) + (j47 * j25) + (((long) iArr3[i26]) & 4294967295L);
            iArr3[i26] = (int) j59;
            int i27 = i15 + 6;
            long j65 = (j59 >>> 32) + (j47 * j26) + (((long) iArr3[i27]) & 4294967295L);
            iArr3[i27] = (int) j65;
            int i28 = i15 + 7;
            long j66 = (j65 >>> 32) + (j47 * j27) + (((long) iArr3[i28]) & 4294967295L);
            iArr3[i28] = (int) j66;
            iArr3[i15 + 8] = (int) (j66 >>> 32);
            i15 = i17;
            j19 = j48;
        }
    }

    public static long mul33Add(int i15, int[] iArr, int i16, int[] iArr2, int i17, int[] iArr3, int i18) {
        long j15 = ((long) i15) & 4294967295L;
        long j16 = ((long) iArr[i16]) & 4294967295L;
        long j17 = (j15 * j16) + (((long) iArr2[i17]) & 4294967295L);
        iArr3[i18] = (int) j17;
        long j18 = ((long) iArr[i16 + 1]) & 4294967295L;
        long j19 = (j17 >>> 32) + (j15 * j18) + j16 + (((long) iArr2[i17 + 1]) & 4294967295L);
        iArr3[i18 + 1] = (int) j19;
        long j25 = j19 >>> 32;
        long j26 = ((long) iArr[i16 + 2]) & 4294967295L;
        long j27 = j25 + (j15 * j26) + j18 + (((long) iArr2[i17 + 2]) & 4294967295L);
        iArr3[i18 + 2] = (int) j27;
        long j28 = ((long) iArr[i16 + 3]) & 4294967295L;
        long j29 = (j27 >>> 32) + (j15 * j28) + j26 + (((long) iArr2[i17 + 3]) & 4294967295L);
        iArr3[i18 + 3] = (int) j29;
        long j35 = ((long) iArr[i16 + 4]) & 4294967295L;
        long j36 = (j29 >>> 32) + (j15 * j35) + j28 + (((long) iArr2[i17 + 4]) & 4294967295L);
        iArr3[i18 + 4] = (int) j36;
        long j37 = ((long) iArr[i16 + 5]) & 4294967295L;
        long j38 = (j36 >>> 32) + (j15 * j37) + j35 + (((long) iArr2[i17 + 5]) & 4294967295L);
        iArr3[i18 + 5] = (int) j38;
        long j39 = ((long) iArr[i16 + 6]) & 4294967295L;
        long j45 = (j38 >>> 32) + (j15 * j39) + j37 + (((long) iArr2[i17 + 6]) & 4294967295L);
        iArr3[i18 + 6] = (int) j45;
        long j46 = ((long) iArr[i16 + 7]) & 4294967295L;
        long j47 = (j45 >>> 32) + (j15 * j46) + j39 + (4294967295L & ((long) iArr2[i17 + 7]));
        iArr3[i18 + 7] = (int) j47;
        return (j47 >>> 32) + j46;
    }

    public static int mul33DWordAdd(int i15, long j15, int[] iArr, int i16) {
        long j16 = ((long) i15) & 4294967295L;
        long j17 = j15 & 4294967295L;
        long j18 = (j16 * j17) + (((long) iArr[i16]) & 4294967295L);
        iArr[i16] = (int) j18;
        long j19 = j15 >>> 32;
        long j25 = (j16 * j19) + j17;
        int i17 = i16 + 1;
        long j26 = (j18 >>> 32) + j25 + (((long) iArr[i17]) & 4294967295L);
        iArr[i17] = (int) j26;
        int i18 = i16 + 2;
        long j27 = (j26 >>> 32) + j19 + (((long) iArr[i18]) & 4294967295L);
        iArr[i18] = (int) j27;
        long j28 = j27 >>> 32;
        int i19 = i16 + 3;
        long j29 = j28 + (((long) iArr[i19]) & 4294967295L);
        iArr[i19] = (int) j29;
        if ((j29 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(8, iArr, i16, 4);
    }

    public static int mul33WordAdd(int i15, int i16, int[] iArr, int i17) {
        long j15 = ((long) i15) & 4294967295L;
        long j16 = ((long) i16) & 4294967295L;
        long j17 = (j15 * j16) + (((long) iArr[i17]) & 4294967295L);
        iArr[i17] = (int) j17;
        int i18 = i17 + 1;
        long j18 = (j17 >>> 32) + j16 + (((long) iArr[i18]) & 4294967295L);
        iArr[i18] = (int) j18;
        long j19 = j18 >>> 32;
        int i19 = i17 + 2;
        long j25 = j19 + (((long) iArr[i19]) & 4294967295L);
        iArr[i19] = (int) j25;
        if ((j25 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(8, iArr, i17, 3);
    }

    public static int mulAddTo(int[] iArr, int i15, int[] iArr2, int i16, int[] iArr3, int i17) {
        long j15 = ((long) iArr2[i16]) & 4294967295L;
        long j16 = ((long) iArr2[i16 + 1]) & 4294967295L;
        long j17 = ((long) iArr2[i16 + 2]) & 4294967295L;
        long j18 = ((long) iArr2[i16 + 3]) & 4294967295L;
        long j19 = ((long) iArr2[i16 + 4]) & 4294967295L;
        long j25 = ((long) iArr2[i16 + 5]) & 4294967295L;
        long j26 = ((long) iArr2[i16 + 6]) & 4294967295L;
        long j27 = ((long) iArr2[i16 + 7]) & 4294967295L;
        int i18 = i17;
        int i19 = 0;
        long j28 = 0;
        while (i19 < 8) {
            long j29 = j16;
            long j35 = ((long) iArr[i15 + i19]) & 4294967295L;
            long j36 = (j35 * j15) + (((long) iArr3[i18]) & 4294967295L);
            iArr3[i18] = (int) j36;
            int i25 = i18 + 1;
            long j37 = (j36 >>> 32) + (j35 * j29) + (((long) iArr3[i25]) & 4294967295L);
            iArr3[i25] = (int) j37;
            int i26 = i18 + 2;
            int i27 = i19;
            long j38 = (j37 >>> 32) + (j35 * j17) + (((long) iArr3[i26]) & 4294967295L);
            iArr3[i26] = (int) j38;
            int i28 = i18 + 3;
            long j39 = (j38 >>> 32) + (j35 * j18) + (((long) iArr3[i28]) & 4294967295L);
            iArr3[i28] = (int) j39;
            int i29 = i18 + 4;
            long j45 = (j39 >>> 32) + (j35 * j19) + (((long) iArr3[i29]) & 4294967295L);
            iArr3[i29] = (int) j45;
            int i35 = i18 + 5;
            long j46 = (j45 >>> 32) + (j35 * j25) + (((long) iArr3[i35]) & 4294967295L);
            iArr3[i35] = (int) j46;
            int i36 = i18 + 6;
            long j47 = (j46 >>> 32) + (j35 * j26) + (((long) iArr3[i36]) & 4294967295L);
            iArr3[i36] = (int) j47;
            int i37 = i18 + 7;
            long j48 = (j47 >>> 32) + (j35 * j27) + (((long) iArr3[i37]) & 4294967295L);
            iArr3[i37] = (int) j48;
            int i38 = i18 + 8;
            long j49 = j28 + (j48 >>> 32) + (((long) iArr3[i38]) & 4294967295L);
            iArr3[i38] = (int) j49;
            j28 = j49 >>> 32;
            i19 = i27 + 1;
            j16 = j29;
            i18 = i25;
        }
        return (int) j28;
    }

    public static int mulByWord(int i15, int[] iArr) {
        long j15 = ((long) i15) & 4294967295L;
        long j16 = (((long) iArr[0]) & 4294967295L) * j15;
        iArr[0] = (int) j16;
        long j17 = (j16 >>> 32) + ((((long) iArr[1]) & 4294967295L) * j15);
        iArr[1] = (int) j17;
        long j18 = (j17 >>> 32) + ((((long) iArr[2]) & 4294967295L) * j15);
        iArr[2] = (int) j18;
        long j19 = (j18 >>> 32) + ((((long) iArr[3]) & 4294967295L) * j15);
        iArr[3] = (int) j19;
        long j25 = (j19 >>> 32) + ((((long) iArr[4]) & 4294967295L) * j15);
        iArr[4] = (int) j25;
        long j26 = (j25 >>> 32) + ((((long) iArr[5]) & 4294967295L) * j15);
        iArr[5] = (int) j26;
        long j27 = (j26 >>> 32) + ((((long) iArr[6]) & 4294967295L) * j15);
        iArr[6] = (int) j27;
        long j28 = (j27 >>> 32) + (j15 * (4294967295L & ((long) iArr[7])));
        iArr[7] = (int) j28;
        return (int) (j28 >>> 32);
    }

    public static int mulByWordAddTo(int i15, int[] iArr, int[] iArr2) {
        long j15 = ((long) i15) & 4294967295L;
        long j16 = ((((long) iArr2[0]) & 4294967295L) * j15) + (((long) iArr[0]) & 4294967295L);
        iArr2[0] = (int) j16;
        long j17 = (j16 >>> 32) + ((((long) iArr2[1]) & 4294967295L) * j15) + (((long) iArr[1]) & 4294967295L);
        iArr2[1] = (int) j17;
        long j18 = (j17 >>> 32) + ((((long) iArr2[2]) & 4294967295L) * j15) + (((long) iArr[2]) & 4294967295L);
        iArr2[2] = (int) j18;
        long j19 = (j18 >>> 32) + ((((long) iArr2[3]) & 4294967295L) * j15) + (((long) iArr[3]) & 4294967295L);
        iArr2[3] = (int) j19;
        long j25 = (j19 >>> 32) + ((((long) iArr2[4]) & 4294967295L) * j15) + (((long) iArr[4]) & 4294967295L);
        iArr2[4] = (int) j25;
        long j26 = (j25 >>> 32) + ((((long) iArr2[5]) & 4294967295L) * j15) + (((long) iArr[5]) & 4294967295L);
        iArr2[5] = (int) j26;
        long j27 = (j26 >>> 32) + ((((long) iArr2[6]) & 4294967295L) * j15) + (((long) iArr[6]) & 4294967295L);
        iArr2[6] = (int) j27;
        long j28 = (j27 >>> 32) + (j15 * (((long) iArr2[7]) & 4294967295L)) + (4294967295L & ((long) iArr[7]));
        iArr2[7] = (int) j28;
        return (int) (j28 >>> 32);
    }

    public static int mulWord(int i15, int[] iArr, int[] iArr2, int i16) {
        long j15 = ((long) i15) & 4294967295L;
        long j16 = 0;
        int i17 = 0;
        do {
            long j17 = j16 + ((((long) iArr[i17]) & 4294967295L) * j15);
            iArr2[i16 + i17] = (int) j17;
            j16 = j17 >>> 32;
            i17++;
        } while (i17 < 8);
        return (int) j16;
    }

    public static int mulWordAddTo(int i15, int[] iArr, int i16, int[] iArr2, int i17) {
        long j15 = ((long) i15) & 4294967295L;
        long j16 = ((((long) iArr[i16]) & 4294967295L) * j15) + (((long) iArr2[i17]) & 4294967295L);
        iArr2[i17] = (int) j16;
        int i18 = i17 + 1;
        long j17 = (j16 >>> 32) + ((((long) iArr[i16 + 1]) & 4294967295L) * j15) + (((long) iArr2[i18]) & 4294967295L);
        iArr2[i18] = (int) j17;
        int i19 = i17 + 2;
        long j18 = (j17 >>> 32) + ((((long) iArr[i16 + 2]) & 4294967295L) * j15) + (((long) iArr2[i19]) & 4294967295L);
        iArr2[i19] = (int) j18;
        int i25 = i17 + 3;
        long j19 = (j18 >>> 32) + ((((long) iArr[i16 + 3]) & 4294967295L) * j15) + (((long) iArr2[i25]) & 4294967295L);
        iArr2[i25] = (int) j19;
        int i26 = i17 + 4;
        long j25 = (j19 >>> 32) + ((((long) iArr[i16 + 4]) & 4294967295L) * j15) + (((long) iArr2[i26]) & 4294967295L);
        iArr2[i26] = (int) j25;
        int i27 = i17 + 5;
        long j26 = (j25 >>> 32) + ((((long) iArr[i16 + 5]) & 4294967295L) * j15) + (((long) iArr2[i27]) & 4294967295L);
        iArr2[i27] = (int) j26;
        int i28 = i17 + 6;
        long j27 = (j26 >>> 32) + ((((long) iArr[i16 + 6]) & 4294967295L) * j15) + (((long) iArr2[i28]) & 4294967295L);
        iArr2[i28] = (int) j27;
        int i29 = i17 + 7;
        long j28 = (j27 >>> 32) + (j15 * (((long) iArr[i16 + 7]) & 4294967295L)) + (((long) iArr2[i29]) & 4294967295L);
        iArr2[i29] = (int) j28;
        return (int) (j28 >>> 32);
    }

    public static int mulWordDwordAdd(int i15, long j15, int[] iArr, int i16) {
        long j16 = ((long) i15) & 4294967295L;
        long j17 = ((j15 & 4294967295L) * j16) + (((long) iArr[i16]) & 4294967295L);
        iArr[i16] = (int) j17;
        long j18 = j16 * (j15 >>> 32);
        int i17 = i16 + 1;
        long j19 = (j17 >>> 32) + j18 + (((long) iArr[i17]) & 4294967295L);
        iArr[i17] = (int) j19;
        int i18 = i16 + 2;
        long j25 = (j19 >>> 32) + (((long) iArr[i18]) & 4294967295L);
        iArr[i18] = (int) j25;
        if ((j25 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(8, iArr, i16, 3);
    }

    public static void square(int[] iArr, int i15, int[] iArr2, int i16) {
        long j15 = ((long) iArr[i15]) & 4294967295L;
        int i17 = 0;
        int i18 = 16;
        int i19 = 7;
        while (true) {
            int i25 = i19 - 1;
            long j16 = ((long) iArr[i15 + i19]) & 4294967295L;
            long j17 = j16 * j16;
            iArr2[i16 + (i18 - 1)] = (i17 << 31) | ((int) (j17 >>> 33));
            i18 -= 2;
            iArr2[i16 + i18] = (int) (j17 >>> 1);
            i17 = (int) j17;
            if (i25 <= 0) {
                long j18 = j15 * j15;
                long j19 = (j18 >>> 33) | (((long) (i17 << 31)) & 4294967295L);
                iArr2[i16] = (int) j18;
                int i26 = ((int) (j18 >>> 32)) & 1;
                long j25 = ((long) iArr[i15 + 1]) & 4294967295L;
                int i27 = i16 + 2;
                long j26 = ((long) iArr2[i27]) & 4294967295L;
                long j27 = j19 + (j25 * j15);
                int i28 = (int) j27;
                iArr2[i16 + 1] = (i28 << 1) | i26;
                int i29 = i28 >>> 31;
                long j28 = j26 + (j27 >>> 32);
                long j29 = ((long) iArr[i15 + 2]) & 4294967295L;
                int i35 = i16 + 3;
                long j35 = ((long) iArr2[i35]) & 4294967295L;
                int i36 = i16 + 4;
                long j36 = ((long) iArr2[i36]) & 4294967295L;
                long j37 = j28 + (j29 * j15);
                int i37 = (int) j37;
                iArr2[i27] = (i37 << 1) | i29;
                long j38 = j35 + (j37 >>> 32) + (j29 * j25);
                long j39 = j36 + (j38 >>> 32);
                long j45 = ((long) iArr[i15 + 3]) & 4294967295L;
                int i38 = i16 + 5;
                long j46 = (((long) iArr2[i38]) & 4294967295L) + (j39 >>> 32);
                int i39 = i16 + 6;
                long j47 = (((long) iArr2[i39]) & 4294967295L) + (j46 >>> 32);
                long j48 = j46 & 4294967295L;
                long j49 = (j38 & 4294967295L) + (j45 * j15);
                int i45 = (int) j49;
                iArr2[i35] = (i45 << 1) | (i37 >>> 31);
                int i46 = i45 >>> 31;
                long j55 = (j39 & 4294967295L) + (j49 >>> 32) + (j45 * j25);
                long j56 = j48 + (j55 >>> 32) + (j45 * j29);
                long j57 = j47 + (j56 >>> 32);
                long j58 = ((long) iArr[i15 + 4]) & 4294967295L;
                int i47 = i16 + 7;
                long j59 = (((long) iArr2[i47]) & 4294967295L) + (j57 >>> 32);
                int i48 = i16 + 8;
                long j65 = (((long) iArr2[i48]) & 4294967295L) + (j59 >>> 32);
                long j66 = j59 & 4294967295L;
                long j67 = (j55 & 4294967295L) + (j58 * j15);
                int i49 = (int) j67;
                iArr2[i36] = (i49 << 1) | i46;
                int i55 = i49 >>> 31;
                long j68 = (j56 & 4294967295L) + (j67 >>> 32) + (j58 * j25);
                long j69 = (j57 & 4294967295L) + (j68 >>> 32) + (j58 * j29);
                long j75 = j68 & 4294967295L;
                long j76 = j66 + (j69 >>> 32) + (j58 * j45);
                long j77 = j65 + (j76 >>> 32);
                long j78 = ((long) iArr[i15 + 5]) & 4294967295L;
                int i56 = i16 + 9;
                long j79 = (((long) iArr2[i56]) & 4294967295L) + (j77 >>> 32);
                int i57 = i16 + 10;
                long j85 = (((long) iArr2[i57]) & 4294967295L) + (j79 >>> 32);
                long j86 = j79 & 4294967295L;
                long j87 = j75 + (j78 * j15);
                int i58 = (int) j87;
                iArr2[i38] = (i58 << 1) | i55;
                int i59 = i58 >>> 31;
                long j88 = (j69 & 4294967295L) + (j87 >>> 32) + (j78 * j25);
                long j89 = (j76 & 4294967295L) + (j88 >>> 32) + (j78 * j29);
                long j95 = j88 & 4294967295L;
                long j96 = (j77 & 4294967295L) + (j89 >>> 32) + (j78 * j45);
                long j97 = j89 & 4294967295L;
                long j98 = j86 + (j96 >>> 32) + (j78 * j58);
                long j99 = j85 + (j98 >>> 32);
                long j100 = ((long) iArr[i15 + 6]) & 4294967295L;
                int i65 = i16 + 11;
                long j101 = (((long) iArr2[i65]) & 4294967295L) + (j99 >>> 32);
                int i66 = i16 + 12;
                long j102 = (((long) iArr2[i66]) & 4294967295L) + (j101 >>> 32);
                long j103 = j101 & 4294967295L;
                long j104 = j95 + (j100 * j15);
                int i67 = (int) j104;
                iArr2[i39] = (i67 << 1) | i59;
                int i68 = i67 >>> 31;
                long j105 = j97 + (j104 >>> 32) + (j100 * j25);
                long j106 = (j96 & 4294967295L) + (j105 >>> 32) + (j100 * j29);
                long j107 = j105 & 4294967295L;
                long j108 = (j98 & 4294967295L) + (j106 >>> 32) + (j100 * j45);
                long j109 = j106 & 4294967295L;
                long j110 = (j99 & 4294967295L) + (j108 >>> 32) + (j100 * j58);
                long j111 = j108 & 4294967295L;
                long j112 = j103 + (j110 >>> 32) + (j100 * j78);
                long j113 = j102 + (j112 >>> 32);
                long j114 = ((long) iArr[i15 + 7]) & 4294967295L;
                int i69 = i16 + 13;
                long j115 = (((long) iArr2[i69]) & 4294967295L) + (j113 >>> 32);
                int i75 = i16 + 14;
                long j116 = (((long) iArr2[i75]) & 4294967295L) + (j115 >>> 32);
                long j117 = j115 & 4294967295L;
                long j118 = j107 + (j15 * j114);
                int i76 = (int) j118;
                iArr2[i47] = (i76 << 1) | i68;
                long j119 = j109 + (j118 >>> 32) + (j25 * j114);
                long j120 = j111 + (j119 >>> 32) + (j114 * j29);
                long j121 = (j110 & 4294967295L) + (j120 >>> 32) + (j114 * j45);
                long j122 = (j112 & 4294967295L) + (j121 >>> 32) + (j114 * j58);
                long j123 = (j113 & 4294967295L) + (j122 >>> 32) + (j114 * j78);
                long j124 = j117 + (j123 >>> 32) + (j114 * j100);
                long j125 = j116 + (j124 >>> 32);
                int i77 = (int) j119;
                iArr2[i48] = (i76 >>> 31) | (i77 << 1);
                int i78 = i77 >>> 31;
                int i79 = (int) j120;
                iArr2[i56] = i78 | (i79 << 1);
                int i85 = (int) j121;
                iArr2[i57] = (i85 << 1) | (i79 >>> 31);
                int i86 = (int) j122;
                iArr2[i65] = (i85 >>> 31) | (i86 << 1);
                int i87 = i86 >>> 31;
                int i88 = (int) j123;
                iArr2[i66] = i87 | (i88 << 1);
                int i89 = i88 >>> 31;
                int i95 = (int) j124;
                iArr2[i69] = i89 | (i95 << 1);
                int i96 = i95 >>> 31;
                int i97 = (int) j125;
                iArr2[i75] = i96 | (i97 << 1);
                int i98 = i97 >>> 31;
                int i99 = i16 + 15;
                iArr2[i99] = i98 | ((iArr2[i99] + ((int) (j125 >>> 32))) << 1);
                return;
            }
            i19 = i25;
        }
    }

    public static int sub(int[] iArr, int i15, int[] iArr2, int i16, int[] iArr3, int i17) {
        long j15 = (((long) iArr[i15]) & 4294967295L) - (((long) iArr2[i16]) & 4294967295L);
        iArr3[i17] = (int) j15;
        long j16 = (j15 >> 32) + ((((long) iArr[i15 + 1]) & 4294967295L) - (((long) iArr2[i16 + 1]) & 4294967295L));
        iArr3[i17 + 1] = (int) j16;
        long j17 = (j16 >> 32) + ((((long) iArr[i15 + 2]) & 4294967295L) - (((long) iArr2[i16 + 2]) & 4294967295L));
        iArr3[i17 + 2] = (int) j17;
        long j18 = (j17 >> 32) + ((((long) iArr[i15 + 3]) & 4294967295L) - (((long) iArr2[i16 + 3]) & 4294967295L));
        iArr3[i17 + 3] = (int) j18;
        long j19 = (j18 >> 32) + ((((long) iArr[i15 + 4]) & 4294967295L) - (((long) iArr2[i16 + 4]) & 4294967295L));
        iArr3[i17 + 4] = (int) j19;
        long j25 = (j19 >> 32) + ((((long) iArr[i15 + 5]) & 4294967295L) - (((long) iArr2[i16 + 5]) & 4294967295L));
        iArr3[i17 + 5] = (int) j25;
        long j26 = (j25 >> 32) + ((((long) iArr[i15 + 6]) & 4294967295L) - (((long) iArr2[i16 + 6]) & 4294967295L));
        iArr3[i17 + 6] = (int) j26;
        long j27 = (j26 >> 32) + ((((long) iArr[i15 + 7]) & 4294967295L) - (((long) iArr2[i16 + 7]) & 4294967295L));
        iArr3[i17 + 7] = (int) j27;
        return (int) (j27 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j15 = ((((long) iArr3[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L)) - (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j15;
        long j16 = (j15 >> 32) + (((((long) iArr3[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) - (((long) iArr2[1]) & 4294967295L));
        iArr3[1] = (int) j16;
        long j17 = (j16 >> 32) + (((((long) iArr3[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) - (((long) iArr2[2]) & 4294967295L));
        iArr3[2] = (int) j17;
        long j18 = (j17 >> 32) + (((((long) iArr3[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L)) - (((long) iArr2[3]) & 4294967295L));
        iArr3[3] = (int) j18;
        long j19 = (j18 >> 32) + (((((long) iArr3[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L)) - (((long) iArr2[4]) & 4294967295L));
        iArr3[4] = (int) j19;
        long j25 = (j19 >> 32) + (((((long) iArr3[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L)) - (((long) iArr2[5]) & 4294967295L));
        iArr3[5] = (int) j25;
        long j26 = (j25 >> 32) + (((((long) iArr3[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L)) - (((long) iArr2[6]) & 4294967295L));
        iArr3[6] = (int) j26;
        long j27 = (j26 >> 32) + (((((long) iArr3[7]) & 4294967295L) - (((long) iArr[7]) & 4294967295L)) - (((long) iArr2[7]) & 4294967295L));
        iArr3[7] = (int) j27;
        return (int) (j27 >> 32);
    }

    public static int subFrom(int[] iArr, int i15, int[] iArr2, int i16) {
        long j15 = (((long) iArr2[i16]) & 4294967295L) - (((long) iArr[i15]) & 4294967295L);
        iArr2[i16] = (int) j15;
        int i17 = i16 + 1;
        long j16 = (j15 >> 32) + ((((long) iArr2[i17]) & 4294967295L) - (((long) iArr[i15 + 1]) & 4294967295L));
        iArr2[i17] = (int) j16;
        int i18 = i16 + 2;
        long j17 = (j16 >> 32) + ((((long) iArr2[i18]) & 4294967295L) - (((long) iArr[i15 + 2]) & 4294967295L));
        iArr2[i18] = (int) j17;
        int i19 = i16 + 3;
        long j18 = (j17 >> 32) + ((((long) iArr2[i19]) & 4294967295L) - (((long) iArr[i15 + 3]) & 4294967295L));
        iArr2[i19] = (int) j18;
        int i25 = i16 + 4;
        long j19 = (j18 >> 32) + ((((long) iArr2[i25]) & 4294967295L) - (((long) iArr[i15 + 4]) & 4294967295L));
        iArr2[i25] = (int) j19;
        int i26 = i16 + 5;
        long j25 = (j19 >> 32) + ((((long) iArr2[i26]) & 4294967295L) - (((long) iArr[i15 + 5]) & 4294967295L));
        iArr2[i26] = (int) j25;
        int i27 = i16 + 6;
        long j26 = (j25 >> 32) + ((((long) iArr2[i27]) & 4294967295L) - (((long) iArr[i15 + 6]) & 4294967295L));
        iArr2[i27] = (int) j26;
        int i28 = i16 + 7;
        long j27 = (j26 >> 32) + ((((long) iArr2[i28]) & 4294967295L) - (((long) iArr[i15 + 7]) & 4294967295L));
        iArr2[i28] = (int) j27;
        return (int) (j27 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i15 = 0; i15 < 8; i15++) {
            int i16 = iArr[i15];
            if (i16 != 0) {
                Pack.intToBigEndian(i16, bArr, (7 - i15) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i15 = 0; i15 < 4; i15++) {
            long j15 = jArr[i15];
            if (j15 != 0) {
                Pack.longToBigEndian(j15, bArr, (3 - i15) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
    }

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j15 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j15;
        long j16 = (j15 >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L);
        iArr3[1] = (int) j16;
        long j17 = (j16 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L);
        iArr3[2] = (int) j17;
        long j18 = (j17 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L);
        iArr3[3] = (int) j18;
        long j19 = (j18 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L);
        iArr3[4] = (int) j19;
        long j25 = (j19 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L);
        iArr3[5] = (int) j25;
        long j26 = (j25 >>> 32) + (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L);
        iArr3[6] = (int) j26;
        long j27 = (j26 >>> 32) + (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L);
        iArr3[7] = (int) j27;
        return (int) (j27 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j15 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L);
        iArr3[0] = (int) j15;
        long j16 = (j15 >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L);
        iArr3[1] = (int) j16;
        long j17 = (j16 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L);
        iArr3[2] = (int) j17;
        long j18 = (j17 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L);
        iArr3[3] = (int) j18;
        long j19 = (j18 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (((long) iArr3[4]) & 4294967295L);
        iArr3[4] = (int) j19;
        long j25 = (j19 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (((long) iArr3[5]) & 4294967295L);
        iArr3[5] = (int) j25;
        long j26 = (j25 >>> 32) + (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (((long) iArr3[6]) & 4294967295L);
        iArr3[6] = (int) j26;
        long j27 = (j26 >>> 32) + (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L) + (((long) iArr3[7]) & 4294967295L);
        iArr3[7] = (int) j27;
        return (int) (j27 >>> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j15 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr2[0] = (int) j15;
        long j16 = (j15 >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L);
        iArr2[1] = (int) j16;
        long j17 = (j16 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L);
        iArr2[2] = (int) j17;
        long j18 = (j17 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L);
        iArr2[3] = (int) j18;
        long j19 = (j18 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L);
        iArr2[4] = (int) j19;
        long j25 = (j19 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L);
        iArr2[5] = (int) j25;
        long j26 = (j25 >>> 32) + (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L);
        iArr2[6] = (int) j26;
        long j27 = (j26 >>> 32) + (((long) iArr[7]) & 4294967295L) + (4294967295L & ((long) iArr2[7]));
        iArr2[7] = (int) j27;
        return (int) (j27 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
        iArr2[7] = iArr[7];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i15 = 7; i15 >= 0; i15--) {
            int i16 = iArr[i15] ^ PKIFailureInfo.systemUnavail;
            int i17 = Integer.MIN_VALUE ^ iArr2[i15];
            if (i16 < i17) {
                return false;
            }
            if (i16 > i17) {
                return true;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j15 = ((long) iArr2[0]) & 4294967295L;
        long j16 = ((long) iArr2[1]) & 4294967295L;
        long j17 = ((long) iArr2[2]) & 4294967295L;
        long j18 = ((long) iArr2[3]) & 4294967295L;
        long j19 = ((long) iArr2[4]) & 4294967295L;
        long j25 = ((long) iArr2[5]) & 4294967295L;
        long j26 = ((long) iArr2[6]) & 4294967295L;
        long j27 = ((long) iArr2[7]) & 4294967295L;
        long j28 = ((long) iArr[0]) & 4294967295L;
        long j29 = j28 * j15;
        iArr3[0] = (int) j29;
        long j35 = (j29 >>> 32) + (j28 * j16);
        iArr3[1] = (int) j35;
        long j36 = (j35 >>> 32) + (j28 * j17);
        iArr3[2] = (int) j36;
        long j37 = (j36 >>> 32) + (j28 * j18);
        iArr3[3] = (int) j37;
        long j38 = (j37 >>> 32) + (j28 * j19);
        iArr3[4] = (int) j38;
        long j39 = (j38 >>> 32) + (j28 * j25);
        iArr3[5] = (int) j39;
        long j45 = (j39 >>> 32) + (j28 * j26);
        iArr3[6] = (int) j45;
        long j46 = (j45 >>> 32) + (j28 * j27);
        iArr3[7] = (int) j46;
        iArr3[8] = (int) (j46 >>> 32);
        int i15 = 1;
        for (int i16 = 8; i15 < i16; i16 = 8) {
            long j47 = ((long) iArr[i15]) & 4294967295L;
            long j48 = j19;
            long j49 = (j47 * j15) + (((long) iArr3[i15]) & 4294967295L);
            iArr3[i15] = (int) j49;
            int i17 = i15 + 1;
            long j55 = (j49 >>> 32) + (j47 * j16) + (((long) iArr3[i17]) & 4294967295L);
            iArr3[i17] = (int) j55;
            int i18 = i15 + 2;
            long j56 = (j55 >>> 32) + (j47 * j17) + (((long) iArr3[i18]) & 4294967295L);
            iArr3[i18] = (int) j56;
            int i19 = i15 + 3;
            long j57 = (j56 >>> 32) + (j47 * j18) + (((long) iArr3[i19]) & 4294967295L);
            iArr3[i19] = (int) j57;
            int i25 = i15 + 4;
            long j58 = (j57 >>> 32) + (j47 * j48) + (((long) iArr3[i25]) & 4294967295L);
            iArr3[i25] = (int) j58;
            int i26 = i15 + 5;
            long j59 = (j58 >>> 32) + (j47 * j25) + (((long) iArr3[i26]) & 4294967295L);
            iArr3[i26] = (int) j59;
            int i27 = i15 + 6;
            long j65 = (j59 >>> 32) + (j47 * j26) + (((long) iArr3[i27]) & 4294967295L);
            iArr3[i27] = (int) j65;
            int i28 = i15 + 7;
            long j66 = (j65 >>> 32) + (j47 * j27) + (((long) iArr3[i28]) & 4294967295L);
            iArr3[i28] = (int) j66;
            iArr3[i15 + 8] = (int) (j66 >>> 32);
            i15 = i17;
            j19 = j48;
        }
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j15 = ((long) iArr2[0]) & 4294967295L;
        long j16 = ((long) iArr2[1]) & 4294967295L;
        long j17 = ((long) iArr2[2]) & 4294967295L;
        long j18 = ((long) iArr2[3]) & 4294967295L;
        long j19 = ((long) iArr2[4]) & 4294967295L;
        long j25 = ((long) iArr2[5]) & 4294967295L;
        long j26 = ((long) iArr2[6]) & 4294967295L;
        long j27 = ((long) iArr2[7]) & 4294967295L;
        long j28 = 0;
        int i15 = 0;
        while (i15 < 8) {
            long j29 = ((long) iArr[i15]) & 4294967295L;
            long j35 = (j29 * j15) + (((long) iArr3[i15]) & 4294967295L);
            int i16 = i15;
            iArr3[i16] = (int) j35;
            int i17 = i16 + 1;
            long j36 = (j35 >>> 32) + (j29 * j16) + (((long) iArr3[i17]) & 4294967295L);
            iArr3[i17] = (int) j36;
            int i18 = i16 + 2;
            long j37 = (j36 >>> 32) + (j29 * j17) + (((long) iArr3[i18]) & 4294967295L);
            iArr3[i18] = (int) j37;
            int i19 = i16 + 3;
            long j38 = (j37 >>> 32) + (j29 * j18) + (((long) iArr3[i19]) & 4294967295L);
            iArr3[i19] = (int) j38;
            int i25 = i16 + 4;
            long j39 = (j38 >>> 32) + (j29 * j19) + (((long) iArr3[i25]) & 4294967295L);
            iArr3[i25] = (int) j39;
            int i26 = i16 + 5;
            long j45 = (j39 >>> 32) + (j29 * j25) + (((long) iArr3[i26]) & 4294967295L);
            iArr3[i26] = (int) j45;
            int i27 = i16 + 6;
            long j46 = (j45 >>> 32) + (j29 * j26) + (((long) iArr3[i27]) & 4294967295L);
            iArr3[i27] = (int) j46;
            int i28 = i16 + 7;
            long j47 = (j46 >>> 32) + (j29 * j27) + (((long) iArr3[i28]) & 4294967295L);
            iArr3[i28] = (int) j47;
            int i29 = i16 + 8;
            long j48 = j28 + (j47 >>> 32) + (((long) iArr3[i29]) & 4294967295L);
            iArr3[i29] = (int) j48;
            j28 = j48 >>> 32;
            i15 = i17;
        }
        return (int) j28;
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j15 = ((long) iArr[0]) & 4294967295L;
        int i15 = 16;
        int i16 = 0;
        int i17 = 7;
        while (true) {
            int i18 = i17 - 1;
            long j16 = ((long) iArr[i17]) & 4294967295L;
            long j17 = j16 * j16;
            iArr2[i15 - 1] = (i16 << 31) | ((int) (j17 >>> 33));
            i15 -= 2;
            iArr2[i15] = (int) (j17 >>> 1);
            i16 = (int) j17;
            if (i18 <= 0) {
                long j18 = j15 * j15;
                long j19 = (j18 >>> 33) | (((long) (i16 << 31)) & 4294967295L);
                iArr2[0] = (int) j18;
                long j25 = ((long) iArr[1]) & 4294967295L;
                long j26 = ((long) iArr2[2]) & 4294967295L;
                long j27 = j19 + (j25 * j15);
                int i19 = (int) j27;
                iArr2[1] = (i19 << 1) | (((int) (j18 >>> 32)) & 1);
                long j28 = j26 + (j27 >>> 32);
                long j29 = ((long) iArr[2]) & 4294967295L;
                long j35 = ((long) iArr2[3]) & 4294967295L;
                long j36 = ((long) iArr2[4]) & 4294967295L;
                long j37 = j28 + (j29 * j15);
                int i25 = (int) j37;
                iArr2[2] = (i25 << 1) | (i19 >>> 31);
                long j38 = j35 + (j37 >>> 32) + (j29 * j25);
                long j39 = j36 + (j38 >>> 32);
                long j45 = ((long) iArr[3]) & 4294967295L;
                long j46 = (((long) iArr2[5]) & 4294967295L) + (j39 >>> 32);
                long j47 = (((long) iArr2[6]) & 4294967295L) + (j46 >>> 32);
                long j48 = (j38 & 4294967295L) + (j45 * j15);
                int i26 = (int) j48;
                iArr2[3] = (i26 << 1) | (i25 >>> 31);
                int i27 = i26 >>> 31;
                long j49 = (j39 & 4294967295L) + (j48 >>> 32) + (j45 * j25);
                long j55 = (j46 & 4294967295L) + (j49 >>> 32) + (j45 * j29);
                long j56 = j49 & 4294967295L;
                long j57 = j47 + (j55 >>> 32);
                long j58 = j55 & 4294967295L;
                long j59 = ((long) iArr[4]) & 4294967295L;
                long j65 = (((long) iArr2[7]) & 4294967295L) + (j57 >>> 32);
                long j66 = (((long) iArr2[8]) & 4294967295L) + (j65 >>> 32);
                long j67 = j56 + (j59 * j15);
                int i28 = (int) j67;
                iArr2[4] = (i28 << 1) | i27;
                int i29 = i28 >>> 31;
                long j68 = j58 + (j67 >>> 32) + (j59 * j25);
                long j69 = (j57 & 4294967295L) + (j68 >>> 32) + (j59 * j29);
                long j75 = j68 & 4294967295L;
                long j76 = (j65 & 4294967295L) + (j69 >>> 32) + (j59 * j45);
                long j77 = j69 & 4294967295L;
                long j78 = j66 + (j76 >>> 32);
                long j79 = j76 & 4294967295L;
                long j85 = ((long) iArr[5]) & 4294967295L;
                long j86 = (((long) iArr2[9]) & 4294967295L) + (j78 >>> 32);
                long j87 = j78 & 4294967295L;
                long j88 = (((long) iArr2[10]) & 4294967295L) + (j86 >>> 32);
                long j89 = j75 + (j85 * j15);
                int i35 = (int) j89;
                iArr2[5] = (i35 << 1) | i29;
                int i36 = i35 >>> 31;
                long j95 = j77 + (j89 >>> 32) + (j85 * j25);
                long j96 = j79 + (j95 >>> 32) + (j85 * j29);
                long j97 = j95 & 4294967295L;
                long j98 = j87 + (j96 >>> 32) + (j85 * j45);
                long j99 = j96 & 4294967295L;
                long j100 = (j86 & 4294967295L) + (j98 >>> 32) + (j85 * j59);
                long j101 = j98 & 4294967295L;
                long j102 = j88 + (j100 >>> 32);
                long j103 = j100 & 4294967295L;
                long j104 = ((long) iArr[6]) & 4294967295L;
                long j105 = (((long) iArr2[11]) & 4294967295L) + (j102 >>> 32);
                long j106 = j102 & 4294967295L;
                long j107 = (((long) iArr2[12]) & 4294967295L) + (j105 >>> 32);
                long j108 = j97 + (j104 * j15);
                int i37 = (int) j108;
                iArr2[6] = (i37 << 1) | i36;
                int i38 = i37 >>> 31;
                long j109 = j99 + (j108 >>> 32) + (j104 * j25);
                long j110 = j101 + (j109 >>> 32) + (j104 * j29);
                long j111 = j109 & 4294967295L;
                long j112 = j103 + (j110 >>> 32) + (j104 * j45);
                long j113 = j110 & 4294967295L;
                long j114 = j106 + (j112 >>> 32) + (j104 * j59);
                long j115 = j112 & 4294967295L;
                long j116 = (j105 & 4294967295L) + (j114 >>> 32) + (j104 * j85);
                long j117 = j114 & 4294967295L;
                long j118 = j107 + (j116 >>> 32);
                long j119 = j116 & 4294967295L;
                long j120 = ((long) iArr[7]) & 4294967295L;
                long j121 = (((long) iArr2[13]) & 4294967295L) + (j118 >>> 32);
                long j122 = j118 & 4294967295L;
                long j123 = (((long) iArr2[14]) & 4294967295L) + (j121 >>> 32);
                long j124 = j111 + (j15 * j120);
                int i39 = (int) j124;
                iArr2[7] = (i39 << 1) | i38;
                int i45 = i39 >>> 31;
                long j125 = j113 + (j124 >>> 32) + (j120 * j25);
                long j126 = j115 + (j125 >>> 32) + (j120 * j29);
                long j127 = j117 + (j126 >>> 32) + (j120 * j45);
                long j128 = j119 + (j127 >>> 32) + (j120 * j59);
                long j129 = j122 + (j128 >>> 32) + (j85 * j120);
                long j130 = (j121 & 4294967295L) + (j129 >>> 32) + (j120 * j104);
                long j131 = j123 + (j130 >>> 32);
                int i46 = (int) j125;
                iArr2[8] = i45 | (i46 << 1);
                int i47 = i46 >>> 31;
                int i48 = (int) j126;
                iArr2[9] = i47 | (i48 << 1);
                int i49 = (int) j127;
                iArr2[10] = (i48 >>> 31) | (i49 << 1);
                int i55 = i49 >>> 31;
                int i56 = (int) j128;
                iArr2[11] = i55 | (i56 << 1);
                int i57 = i56 >>> 31;
                int i58 = (int) j129;
                iArr2[12] = i57 | (i58 << 1);
                int i59 = i58 >>> 31;
                int i65 = (int) j130;
                iArr2[13] = i59 | (i65 << 1);
                int i66 = i65 >>> 31;
                int i67 = (int) j131;
                iArr2[14] = i66 | (i67 << 1);
                iArr2[15] = ((iArr2[15] + ((int) (j131 >>> 32))) << 1) | (i67 >>> 31);
                return;
            }
            i17 = i18;
        }
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j15 = (((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j15;
        long j16 = (j15 >> 32) + ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L));
        iArr3[1] = (int) j16;
        long j17 = (j16 >> 32) + ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L));
        iArr3[2] = (int) j17;
        long j18 = (j17 >> 32) + ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L));
        iArr3[3] = (int) j18;
        long j19 = (j18 >> 32) + ((((long) iArr[4]) & 4294967295L) - (((long) iArr2[4]) & 4294967295L));
        iArr3[4] = (int) j19;
        long j25 = (j19 >> 32) + ((((long) iArr[5]) & 4294967295L) - (((long) iArr2[5]) & 4294967295L));
        iArr3[5] = (int) j25;
        long j26 = (j25 >> 32) + ((((long) iArr[6]) & 4294967295L) - (((long) iArr2[6]) & 4294967295L));
        iArr3[6] = (int) j26;
        long j27 = (j26 >> 32) + ((((long) iArr[7]) & 4294967295L) - (((long) iArr2[7]) & 4294967295L));
        iArr3[7] = (int) j27;
        return (int) (j27 >> 32);
    }

    public static int subFrom(int[] iArr, int i15, int[] iArr2, int i16, int i17) {
        long j15 = (((long) i17) & 4294967295L) + ((((long) iArr2[i16]) & 4294967295L) - (((long) iArr[i15]) & 4294967295L));
        iArr2[i16] = (int) j15;
        int i18 = i16 + 1;
        long j16 = (j15 >> 32) + ((((long) iArr2[i18]) & 4294967295L) - (((long) iArr[i15 + 1]) & 4294967295L));
        iArr2[i18] = (int) j16;
        int i19 = i16 + 2;
        long j17 = (j16 >> 32) + ((((long) iArr2[i19]) & 4294967295L) - (((long) iArr[i15 + 2]) & 4294967295L));
        iArr2[i19] = (int) j17;
        int i25 = i16 + 3;
        long j18 = (j17 >> 32) + ((((long) iArr2[i25]) & 4294967295L) - (((long) iArr[i15 + 3]) & 4294967295L));
        iArr2[i25] = (int) j18;
        int i26 = i16 + 4;
        long j19 = (j18 >> 32) + ((((long) iArr2[i26]) & 4294967295L) - (((long) iArr[i15 + 4]) & 4294967295L));
        iArr2[i26] = (int) j19;
        int i27 = i16 + 5;
        long j25 = (j19 >> 32) + ((((long) iArr2[i27]) & 4294967295L) - (((long) iArr[i15 + 5]) & 4294967295L));
        iArr2[i27] = (int) j25;
        int i28 = i16 + 6;
        long j26 = (j25 >> 32) + ((((long) iArr2[i28]) & 4294967295L) - (((long) iArr[i15 + 6]) & 4294967295L));
        iArr2[i28] = (int) j26;
        int i29 = i16 + 7;
        long j27 = (j26 >> 32) + ((((long) iArr2[i29]) & 4294967295L) - (((long) iArr[i15 + 7]) & 4294967295L));
        iArr2[i29] = (int) j27;
        return (int) (j27 >> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2, int i15) {
        long j15 = (((long) i15) & 4294967295L) + (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr2[0] = (int) j15;
        long j16 = (j15 >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L);
        iArr2[1] = (int) j16;
        long j17 = (j16 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L);
        iArr2[2] = (int) j17;
        long j18 = (j17 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L);
        iArr2[3] = (int) j18;
        long j19 = (j18 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L);
        iArr2[4] = (int) j19;
        long j25 = (j19 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L);
        iArr2[5] = (int) j25;
        long j26 = (j25 >>> 32) + (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L);
        iArr2[6] = (int) j26;
        long j27 = (j26 >>> 32) + (((long) iArr[7]) & 4294967295L) + (4294967295L & ((long) iArr2[7]));
        iArr2[7] = (int) j27;
        return (int) (j27 >>> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j15 = (((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L);
        iArr2[0] = (int) j15;
        long j16 = (j15 >> 32) + ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L));
        iArr2[1] = (int) j16;
        long j17 = (j16 >> 32) + ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L));
        iArr2[2] = (int) j17;
        long j18 = (j17 >> 32) + ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L));
        iArr2[3] = (int) j18;
        long j19 = (j18 >> 32) + ((((long) iArr2[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L));
        iArr2[4] = (int) j19;
        long j25 = (j19 >> 32) + ((((long) iArr2[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L));
        iArr2[5] = (int) j25;
        long j26 = (j25 >> 32) + ((((long) iArr2[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L));
        iArr2[6] = (int) j26;
        long j27 = (j26 >> 32) + ((((long) iArr2[7]) & 4294967295L) - (4294967295L & ((long) iArr[7])));
        iArr2[7] = (int) j27;
        return (int) (j27 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2, int i15) {
        long j15 = (((long) i15) & 4294967295L) + ((((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L));
        iArr2[0] = (int) j15;
        long j16 = (j15 >> 32) + ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L));
        iArr2[1] = (int) j16;
        long j17 = (j16 >> 32) + ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L));
        iArr2[2] = (int) j17;
        long j18 = (j17 >> 32) + ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L));
        iArr2[3] = (int) j18;
        long j19 = (j18 >> 32) + ((((long) iArr2[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L));
        iArr2[4] = (int) j19;
        long j25 = (j19 >> 32) + ((((long) iArr2[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L));
        iArr2[5] = (int) j25;
        long j26 = (j25 >> 32) + ((((long) iArr2[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L));
        iArr2[6] = (int) j26;
        long j27 = (j26 >> 32) + ((((long) iArr2[7]) & 4294967295L) - (4294967295L & ((long) iArr[7])));
        iArr2[7] = (int) j27;
        return (int) (j27 >> 32);
    }
}
