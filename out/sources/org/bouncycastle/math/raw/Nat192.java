package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Nat192 {
    private static final long M = 4294967295L;

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
        return (int) (j25 >>> 32);
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
        return (int) (j25 >>> 32);
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
        long j25 = (j19 >>> 32) + (((long) iArr[i15 + 5]) & 4294967295L) + (4294967295L & ((long) iArr2[i27]));
        iArr2[i27] = (int) j25;
        return (int) (j25 >>> 32);
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
        long j25 = (j19 >>> 32) + (((long) iArr[i45]) & 4294967295L) + (4294967295L & ((long) iArr2[i46]));
        int i47 = (int) j25;
        iArr[i45] = i47;
        iArr2[i46] = i47;
        return (int) (j25 >>> 32);
    }

    public static void copy(int[] iArr, int i15, int[] iArr2, int i16) {
        iArr2[i16] = iArr[i15];
        iArr2[i16 + 1] = iArr[i15 + 1];
        iArr2[i16 + 2] = iArr[i15 + 2];
        iArr2[i16 + 3] = iArr[i15 + 3];
        iArr2[i16 + 4] = iArr[i15 + 4];
        iArr2[i16 + 5] = iArr[i15 + 5];
    }

    public static void copy64(long[] jArr, int i15, long[] jArr2, int i16) {
        jArr2[i16] = jArr[i15];
        jArr2[i16 + 1] = jArr[i15 + 1];
        jArr2[i16 + 2] = jArr[i15 + 2];
    }

    public static int[] create() {
        return new int[6];
    }

    public static long[] create64() {
        return new long[3];
    }

    public static int[] createExt() {
        return new int[12];
    }

    public static long[] createExt64() {
        return new long[6];
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
        for (int i15 = 5; i15 >= 0; i15--) {
            if (iArr[i15] != iArr2[i15]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i15 = 2; i15 >= 0; i15--) {
            if (jArr[i15] != jArr2[i15]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        int[] iArrCreate = create();
        for (int i15 = 0; i15 < 6; i15++) {
            iArrCreate[i15] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArrCreate;
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        long[] jArrCreate64 = create64();
        for (int i15 = 0; i15 < 3; i15++) {
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
            int i17 = i15 >> 5;
            if (i17 < 0 || i17 >= 6) {
                return 0;
            }
            i16 = iArr[i17] >>> (i15 & 31);
        }
        return i16 & 1;
    }

    public static boolean gte(int[] iArr, int i15, int[] iArr2, int i16) {
        for (int i17 = 5; i17 >= 0; i17--) {
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
        for (int i15 = 1; i15 < 6; i15++) {
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
        for (int i15 = 1; i15 < 3; i15++) {
            if (jArr[i15] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i15 = 0; i15 < 6; i15++) {
            if (iArr[i15] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i15 = 0; i15 < 3; i15++) {
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
        long j26 = ((long) iArr[i15]) & 4294967295L;
        long j27 = j26 * j15;
        iArr3[i17] = (int) j27;
        long j28 = (j27 >>> 32) + (j26 * j16);
        iArr3[i17 + 1] = (int) j28;
        long j29 = (j28 >>> 32) + (j26 * j17);
        iArr3[i17 + 2] = (int) j29;
        long j35 = (j29 >>> 32) + (j26 * j18);
        iArr3[i17 + 3] = (int) j35;
        long j36 = (j35 >>> 32) + (j26 * j19);
        iArr3[i17 + 4] = (int) j36;
        long j37 = (j36 >>> 32) + (j26 * j25);
        iArr3[i17 + 5] = (int) j37;
        iArr3[i17 + 6] = (int) (j37 >>> 32);
        int i18 = 1;
        int i19 = i17;
        while (i18 < 6) {
            int i25 = i19 + 1;
            long j38 = ((long) iArr[i15 + i18]) & 4294967295L;
            int i26 = i19;
            long j39 = (j38 * j15) + (((long) iArr3[i25]) & 4294967295L);
            iArr3[i25] = (int) j39;
            int i27 = i26 + 2;
            long j45 = (j39 >>> 32) + (j38 * j16) + (((long) iArr3[i27]) & 4294967295L);
            iArr3[i27] = (int) j45;
            int i28 = i26 + 3;
            long j46 = (j45 >>> 32) + (j38 * j17) + (((long) iArr3[i28]) & 4294967295L);
            iArr3[i28] = (int) j46;
            int i29 = i26 + 4;
            long j47 = (j46 >>> 32) + (j38 * j18) + (((long) iArr3[i29]) & 4294967295L);
            iArr3[i29] = (int) j47;
            int i35 = i26 + 5;
            long j48 = (j47 >>> 32) + (j38 * j19) + (((long) iArr3[i35]) & 4294967295L);
            iArr3[i35] = (int) j48;
            int i36 = i26 + 6;
            long j49 = (j48 >>> 32) + (j38 * j25) + (((long) iArr3[i36]) & 4294967295L);
            iArr3[i36] = (int) j49;
            iArr3[i26 + 7] = (int) (j49 >>> 32);
            i18++;
            i19 = i25;
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
        long j38 = (j36 >>> 32) + (j15 * j37) + j35 + (4294967295L & ((long) iArr2[i17 + 5]));
        iArr3[i18 + 5] = (int) j38;
        return (j38 >>> 32) + j37;
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
        return Nat.incAt(6, iArr, i16, 4);
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
        return Nat.incAt(6, iArr, i17, 3);
    }

    public static int mulAddTo(int[] iArr, int i15, int[] iArr2, int i16, int[] iArr3, int i17) {
        long j15 = ((long) iArr2[i16]) & 4294967295L;
        long j16 = ((long) iArr2[i16 + 1]) & 4294967295L;
        long j17 = ((long) iArr2[i16 + 2]) & 4294967295L;
        long j18 = ((long) iArr2[i16 + 3]) & 4294967295L;
        long j19 = ((long) iArr2[i16 + 4]) & 4294967295L;
        long j25 = ((long) iArr2[i16 + 5]) & 4294967295L;
        long j26 = 0;
        int i18 = 0;
        int i19 = i17;
        while (i18 < 6) {
            long j27 = ((long) iArr[i15 + i18]) & 4294967295L;
            long j28 = (j27 * j15) + (((long) iArr3[i19]) & 4294967295L);
            long j29 = j16;
            iArr3[i19] = (int) j28;
            int i25 = i19 + 1;
            long j35 = (j28 >>> 32) + (j27 * j29) + (((long) iArr3[i25]) & 4294967295L);
            iArr3[i25] = (int) j35;
            int i26 = i19 + 2;
            long j36 = (j35 >>> 32) + (j27 * j17) + (((long) iArr3[i26]) & 4294967295L);
            iArr3[i26] = (int) j36;
            int i27 = i19 + 3;
            long j37 = (j36 >>> 32) + (j27 * j18) + (((long) iArr3[i27]) & 4294967295L);
            iArr3[i27] = (int) j37;
            int i28 = i19 + 4;
            long j38 = (j37 >>> 32) + (j27 * j19) + (((long) iArr3[i28]) & 4294967295L);
            iArr3[i28] = (int) j38;
            int i29 = i19 + 5;
            long j39 = (j38 >>> 32) + (j27 * j25) + (((long) iArr3[i29]) & 4294967295L);
            iArr3[i29] = (int) j39;
            int i35 = i19 + 6;
            long j45 = j26 + (j39 >>> 32) + (((long) iArr3[i35]) & 4294967295L);
            iArr3[i35] = (int) j45;
            j26 = j45 >>> 32;
            i18++;
            i19 = i25;
            j16 = j29;
        }
        return (int) j26;
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
        } while (i17 < 6);
        return (int) j16;
    }

    public static int mulWordAddExt(int i15, int[] iArr, int i16, int[] iArr2, int i17) {
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
        long j26 = (j25 >>> 32) + (j15 * (((long) iArr[i16 + 5]) & 4294967295L)) + (((long) iArr2[i27]) & 4294967295L);
        iArr2[i27] = (int) j26;
        return (int) (j26 >>> 32);
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
        return Nat.incAt(6, iArr, i16, 3);
    }

    public static void square(int[] iArr, int i15, int[] iArr2, int i16) {
        long j15 = ((long) iArr[i15]) & 4294967295L;
        int i17 = 0;
        int i18 = 12;
        int i19 = 5;
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
                long j87 = j75 + (j15 * j78);
                int i58 = (int) j87;
                iArr2[i38] = (i58 << 1) | i55;
                long j88 = (j69 & 4294967295L) + (j87 >>> 32) + (j25 * j78);
                long j89 = (j76 & 4294967295L) + (j88 >>> 32) + (j78 * j29);
                long j95 = (j77 & 4294967295L) + (j89 >>> 32) + (j78 * j45);
                long j96 = j86 + (j95 >>> 32) + (j78 * j58);
                long j97 = j85 + (j96 >>> 32);
                int i59 = (int) j88;
                iArr2[i39] = (i58 >>> 31) | (i59 << 1);
                int i65 = (int) j89;
                iArr2[i47] = (i65 << 1) | (i59 >>> 31);
                int i66 = (int) j95;
                iArr2[i48] = (i65 >>> 31) | (i66 << 1);
                int i67 = i66 >>> 31;
                int i68 = (int) j96;
                iArr2[i56] = i67 | (i68 << 1);
                int i69 = i68 >>> 31;
                int i75 = (int) j97;
                iArr2[i57] = i69 | (i75 << 1);
                int i76 = i75 >>> 31;
                int i77 = i16 + 11;
                iArr2[i77] = i76 | ((iArr2[i77] + ((int) (j97 >>> 32))) << 1);
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
        return (int) (j25 >> 32);
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
        return (int) (j25 >> 32);
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
        return (int) (j25 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i15 = 0; i15 < 6; i15++) {
            int i16 = iArr[i15];
            if (i16 != 0) {
                Pack.intToBigEndian(i16, bArr, (5 - i15) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i15 = 0; i15 < 3; i15++) {
            long j15 = jArr[i15];
            if (j15 != 0) {
                Pack.longToBigEndian(j15, bArr, (2 - i15) << 3);
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
        long j25 = (j19 >>> 32) + (((long) iArr[5]) & 4294967295L) + (4294967295L & ((long) iArr2[5]));
        iArr2[5] = (int) j25;
        return (int) (j25 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i15 = 5; i15 >= 0; i15--) {
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
        int i15 = 1;
        long j26 = ((long) iArr[0]) & 4294967295L;
        long j27 = j26 * j15;
        iArr3[0] = (int) j27;
        long j28 = (j27 >>> 32) + (j26 * j16);
        iArr3[1] = (int) j28;
        long j29 = (j28 >>> 32) + (j26 * j17);
        iArr3[2] = (int) j29;
        long j35 = (j29 >>> 32) + (j26 * j18);
        iArr3[3] = (int) j35;
        long j36 = (j35 >>> 32) + (j26 * j19);
        iArr3[4] = (int) j36;
        long j37 = (j36 >>> 32) + (j26 * j25);
        iArr3[5] = (int) j37;
        int i16 = 6;
        iArr3[6] = (int) (j37 >>> 32);
        while (true) {
            int i17 = i15;
            if (i17 >= i16) {
                return;
            }
            long j38 = ((long) iArr[i17]) & 4294967295L;
            long j39 = (j38 * j15) + (((long) iArr3[i17]) & 4294967295L);
            iArr3[i17] = (int) j39;
            i15 = i17 + 1;
            long j45 = j19;
            long j46 = (j39 >>> 32) + (j38 * j16) + (((long) iArr3[i15]) & 4294967295L);
            iArr3[i15] = (int) j46;
            int i18 = i17 + 2;
            long j47 = (j46 >>> 32) + (j38 * j17) + (((long) iArr3[i18]) & 4294967295L);
            iArr3[i18] = (int) j47;
            int i19 = i17 + 3;
            long j48 = (j47 >>> 32) + (j38 * j18) + (((long) iArr3[i19]) & 4294967295L);
            iArr3[i19] = (int) j48;
            int i25 = i17 + 4;
            long j49 = (j48 >>> 32) + (j38 * j45) + (((long) iArr3[i25]) & 4294967295L);
            iArr3[i25] = (int) j49;
            int i26 = i17 + 5;
            long j55 = (j49 >>> 32) + (j38 * j25) + (((long) iArr3[i26]) & 4294967295L);
            iArr3[i26] = (int) j55;
            iArr3[i17 + 6] = (int) (j55 >>> 32);
            j19 = j45;
            i16 = 6;
        }
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        int i15 = 0;
        long j15 = ((long) iArr2[0]) & 4294967295L;
        long j16 = ((long) iArr2[1]) & 4294967295L;
        long j17 = ((long) iArr2[2]) & 4294967295L;
        long j18 = ((long) iArr2[3]) & 4294967295L;
        long j19 = ((long) iArr2[4]) & 4294967295L;
        long j25 = ((long) iArr2[5]) & 4294967295L;
        long j26 = 0;
        while (i15 < 6) {
            long j27 = j15;
            int i16 = i15;
            long j28 = ((long) iArr[i15]) & 4294967295L;
            long j29 = (((long) iArr3[i16]) & 4294967295L) + (j28 * j27);
            iArr3[i16] = (int) j29;
            int i17 = i16 + 1;
            long j35 = (j29 >>> 32) + (j28 * j16) + (((long) iArr3[i17]) & 4294967295L);
            iArr3[i17] = (int) j35;
            int i18 = i16 + 2;
            long j36 = (j35 >>> 32) + (j28 * j17) + (((long) iArr3[i18]) & 4294967295L);
            iArr3[i18] = (int) j36;
            int i19 = i16 + 3;
            long j37 = (j36 >>> 32) + (j28 * j18) + (((long) iArr3[i19]) & 4294967295L);
            iArr3[i19] = (int) j37;
            int i25 = i16 + 4;
            long j38 = (j37 >>> 32) + (j28 * j19) + (((long) iArr3[i25]) & 4294967295L);
            iArr3[i25] = (int) j38;
            int i26 = i16 + 5;
            long j39 = (j38 >>> 32) + (j28 * j25) + (((long) iArr3[i26]) & 4294967295L);
            iArr3[i26] = (int) j39;
            int i27 = i16 + 6;
            long j45 = j26 + (j39 >>> 32) + (((long) iArr3[i27]) & 4294967295L);
            iArr3[i27] = (int) j45;
            j26 = j45 >>> 32;
            i15 = i17;
            j15 = j27;
        }
        return (int) j26;
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j15 = ((long) iArr[0]) & 4294967295L;
        int i15 = 12;
        int i16 = 0;
        int i17 = 5;
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
                long j89 = j75 + (j15 * j85);
                int i35 = (int) j89;
                iArr2[5] = (i35 << 1) | i29;
                long j95 = j77 + (j89 >>> 32) + (j25 * j85);
                long j96 = j79 + (j95 >>> 32) + (j29 * j85);
                long j97 = j87 + (j96 >>> 32) + (j85 * j45);
                long j98 = (j86 & 4294967295L) + (j97 >>> 32) + (j59 * j85);
                long j99 = j88 + (j98 >>> 32);
                int i36 = (int) j95;
                iArr2[6] = (i35 >>> 31) | (i36 << 1);
                int i37 = i36 >>> 31;
                int i38 = (int) j96;
                iArr2[7] = i37 | (i38 << 1);
                int i39 = (int) j97;
                iArr2[8] = (i38 >>> 31) | (i39 << 1);
                int i45 = i39 >>> 31;
                int i46 = (int) j98;
                iArr2[9] = i45 | (i46 << 1);
                int i47 = i46 >>> 31;
                int i48 = (int) j99;
                iArr2[10] = i47 | (i48 << 1);
                iArr2[11] = ((iArr2[11] + ((int) (j99 >>> 32))) << 1) | (i48 >>> 31);
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
        return (int) (j25 >> 32);
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
        long j25 = (j19 >> 32) + ((((long) iArr2[5]) & 4294967295L) - (4294967295L & ((long) iArr[5])));
        iArr2[5] = (int) j25;
        return (int) (j25 >> 32);
    }
}
