package org.bouncycastle.math.ec.rfc7748;

import org.bouncycastle.math.raw.Mod;

/* JADX INFO: loaded from: classes5.dex */
public abstract class X25519Field {
    private static final int M24 = 16777215;
    private static final int M25 = 33554431;
    private static final int M26 = 67108863;
    private static final int[] P32 = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    private static final int[] ROOT_NEG_ONE = {-32595792, -7943725, 4688975, 3500415, 6194736, 33281959, -12573105, -1002827, 163343, 5703241};
    public static final int SIZE = 10;

    protected X25519Field() {
    }

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i15 = 0; i15 < 10; i15++) {
            iArr3[i15] = iArr[i15] + iArr2[i15];
        }
    }

    public static void addOne(int[] iArr) {
        iArr[0] = iArr[0] + 1;
    }

    public static void apm(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        for (int i15 = 0; i15 < 10; i15++) {
            int i16 = iArr[i15];
            int i17 = iArr2[i15];
            iArr3[i15] = i16 + i17;
            iArr4[i15] = i16 - i17;
        }
    }

    public static int areEqual(int[] iArr, int[] iArr2) {
        int i15 = 0;
        for (int i16 = 0; i16 < 10; i16++) {
            i15 |= iArr[i16] ^ iArr2[i16];
        }
        return (((i15 >>> 1) | (i15 & 1)) - 1) >> 31;
    }

    public static boolean areEqualVar(int[] iArr, int[] iArr2) {
        return areEqual(iArr, iArr2) != 0;
    }

    public static void carry(int[] iArr) {
        int i15 = iArr[0];
        int i16 = iArr[1];
        int i17 = iArr[2];
        int i18 = iArr[3];
        int i19 = iArr[4];
        int i25 = iArr[5];
        int i26 = iArr[6];
        int i27 = iArr[7];
        int i28 = iArr[8];
        int i29 = iArr[9];
        int i35 = i17 + (i16 >> 26);
        int i36 = i16 & M26;
        int i37 = i19 + (i18 >> 26);
        int i38 = i18 & M26;
        int i39 = i27 + (i26 >> 26);
        int i45 = i26 & M26;
        int i46 = i29 + (i28 >> 26);
        int i47 = i28 & M26;
        int i48 = i38 + (i35 >> 25);
        int i49 = i35 & M25;
        int i55 = i25 + (i37 >> 25);
        int i56 = i37 & M25;
        int i57 = i47 + (i39 >> 25);
        int i58 = i39 & M25;
        int i59 = i15 + ((i46 >> 25) * 38);
        int i65 = i46 & M25;
        int i66 = i36 + (i59 >> 26);
        int i67 = i59 & M26;
        int i68 = i45 + (i55 >> 26);
        int i69 = i55 & M26;
        int i75 = i49 + (i66 >> 26);
        int i76 = i66 & M26;
        int i77 = i56 + (i48 >> 26);
        int i78 = i48 & M26;
        int i79 = i58 + (i68 >> 26);
        int i85 = i68 & M26;
        int i86 = i65 + (i57 >> 26);
        int i87 = i57 & M26;
        iArr[0] = i67;
        iArr[1] = i76;
        iArr[2] = i75;
        iArr[3] = i78;
        iArr[4] = i77;
        iArr[5] = i69;
        iArr[6] = i85;
        iArr[7] = i79;
        iArr[8] = i87;
        iArr[9] = i86;
    }

    public static void cmov(int i15, int[] iArr, int i16, int[] iArr2, int i17) {
        for (int i18 = 0; i18 < 10; i18++) {
            int i19 = i17 + i18;
            int i25 = iArr2[i19];
            iArr2[i19] = i25 ^ ((iArr[i16 + i18] ^ i25) & i15);
        }
    }

    public static void cnegate(int i15, int[] iArr) {
        int i16 = 0 - i15;
        for (int i17 = 0; i17 < 10; i17++) {
            iArr[i17] = (iArr[i17] ^ i16) - i16;
        }
    }

    public static void copy(int[] iArr, int i15, int[] iArr2, int i16) {
        for (int i17 = 0; i17 < 10; i17++) {
            iArr2[i16 + i17] = iArr[i15 + i17];
        }
    }

    public static int[] create() {
        return new int[10];
    }

    public static int[] createTable(int i15) {
        return new int[i15 * 10];
    }

    public static void cswap(int i15, int[] iArr, int[] iArr2) {
        int i16 = 0 - i15;
        for (int i17 = 0; i17 < 10; i17++) {
            int i18 = iArr[i17];
            int i19 = iArr2[i17];
            int i25 = (i18 ^ i19) & i16;
            iArr[i17] = i18 ^ i25;
            iArr2[i17] = i19 ^ i25;
        }
    }

    public static void decode(byte[] bArr, int i15, int[] iArr) {
        decode128(bArr, i15, iArr, 0);
        decode128(bArr, i15 + 16, iArr, 5);
        iArr[9] = iArr[9] & M24;
    }

    private static void decode128(byte[] bArr, int i15, int[] iArr, int i16) {
        int iDecode32 = decode32(bArr, i15);
        int iDecode33 = decode32(bArr, i15 + 4);
        int iDecode34 = decode32(bArr, i15 + 8);
        int iDecode35 = decode32(bArr, i15 + 12);
        iArr[i16] = iDecode32 & M26;
        iArr[i16 + 1] = ((iDecode32 >>> 26) | (iDecode33 << 6)) & M26;
        iArr[i16 + 2] = ((iDecode33 >>> 20) | (iDecode34 << 12)) & M25;
        iArr[i16 + 3] = M26 & ((iDecode35 << 19) | (iDecode34 >>> 13));
        iArr[i16 + 4] = iDecode35 >>> 7;
    }

    private static int decode32(byte[] bArr, int i15) {
        return (bArr[i15 + 3] << 24) | (bArr[i15] & 255) | ((bArr[i15 + 1] & 255) << 8) | ((bArr[i15 + 2] & 255) << 16);
    }

    public static void encode(int[] iArr, int i15, byte[] bArr, int i16) {
        encode128(iArr, i15, bArr, i16);
        encode128(iArr, i15 + 5, bArr, i16 + 16);
    }

    private static void encode128(int[] iArr, int i15, byte[] bArr, int i16) {
        int i17 = iArr[i15];
        int i18 = iArr[i15 + 1];
        int i19 = iArr[i15 + 2];
        int i25 = iArr[i15 + 3];
        int i26 = iArr[i15 + 4];
        encode32((i18 << 26) | i17, bArr, i16);
        encode32((i18 >>> 6) | (i19 << 20), bArr, i16 + 4);
        encode32((i19 >>> 12) | (i25 << 13), bArr, i16 + 8);
        encode32((i26 << 7) | (i25 >>> 19), bArr, i16 + 12);
    }

    private static void encode32(int i15, byte[] bArr, int i16) {
        bArr[i16] = (byte) i15;
        bArr[i16 + 1] = (byte) (i15 >>> 8);
        bArr[i16 + 2] = (byte) (i15 >>> 16);
        bArr[i16 + 3] = (byte) (i15 >>> 24);
    }

    public static void inv(int[] iArr, int[] iArr2) {
        int[] iArrCreate = create();
        int[] iArr3 = new int[8];
        copy(iArr, 0, iArrCreate, 0);
        normalize(iArrCreate);
        encode(iArrCreate, iArr3, 0);
        Mod.modOddInverse(P32, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    public static void invVar(int[] iArr, int[] iArr2) {
        int[] iArrCreate = create();
        int[] iArr3 = new int[8];
        copy(iArr, 0, iArrCreate, 0);
        normalize(iArrCreate);
        encode(iArrCreate, iArr3, 0);
        Mod.modOddInverseVar(P32, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    public static int isOne(int[] iArr) {
        int i15 = iArr[0] ^ 1;
        for (int i16 = 1; i16 < 10; i16++) {
            i15 |= iArr[i16];
        }
        return (((i15 >>> 1) | (i15 & 1)) - 1) >> 31;
    }

    public static boolean isOneVar(int[] iArr) {
        return isOne(iArr) != 0;
    }

    public static int isZero(int[] iArr) {
        int i15 = 0;
        for (int i16 = 0; i16 < 10; i16++) {
            i15 |= iArr[i16];
        }
        return (((i15 >>> 1) | (i15 & 1)) - 1) >> 31;
    }

    public static boolean isZeroVar(int[] iArr) {
        return isZero(iArr) != 0;
    }

    public static void mul(int[] iArr, int i15, int[] iArr2) {
        int i16 = iArr[0];
        int i17 = iArr[1];
        int i18 = iArr[2];
        int i19 = iArr[3];
        int i25 = iArr[4];
        int i26 = iArr[5];
        int i27 = iArr[6];
        int i28 = iArr[7];
        int i29 = iArr[8];
        int i35 = iArr[9];
        long j15 = i15;
        long j16 = ((long) i18) * j15;
        int i36 = ((int) j16) & M25;
        long j17 = j16 >> 25;
        long j18 = ((long) i25) * j15;
        int i37 = ((int) j18) & M25;
        long j19 = ((long) i28) * j15;
        int i38 = ((int) j19) & M25;
        long j25 = ((long) i35) * j15;
        int i39 = ((int) j25) & M25;
        long j26 = ((j25 >> 25) * 38) + (((long) i16) * j15);
        iArr2[0] = ((int) j26) & M26;
        long j27 = (j18 >> 25) + (((long) i26) * j15);
        iArr2[5] = ((int) j27) & M26;
        long j28 = (j26 >> 26) + (((long) i17) * j15);
        iArr2[1] = ((int) j28) & M26;
        long j29 = j17 + (((long) i19) * j15);
        iArr2[3] = ((int) j29) & M26;
        long j35 = (j27 >> 26) + (((long) i27) * j15);
        iArr2[6] = ((int) j35) & M26;
        long j36 = (j19 >> 25) + (((long) i29) * j15);
        iArr2[8] = ((int) j36) & M26;
        iArr2[2] = i36 + ((int) (j28 >> 26));
        iArr2[4] = i37 + ((int) (j29 >> 26));
        iArr2[7] = i38 + ((int) (j35 >> 26));
        iArr2[9] = i39 + ((int) (j36 >> 26));
    }

    public static void negate(int[] iArr, int[] iArr2) {
        for (int i15 = 0; i15 < 10; i15++) {
            iArr2[i15] = -iArr[i15];
        }
    }

    public static void normalize(int[] iArr) {
        int i15 = (iArr[9] >>> 23) & 1;
        reduce(iArr, i15);
        reduce(iArr, -i15);
    }

    public static void one(int[] iArr) {
        iArr[0] = 1;
        for (int i15 = 1; i15 < 10; i15++) {
            iArr[i15] = 0;
        }
    }

    private static void powPm5d8(int[] iArr, int[] iArr2, int[] iArr3) {
        sqr(iArr, iArr2);
        mul(iArr, iArr2, iArr2);
        int[] iArrCreate = create();
        sqr(iArr2, iArrCreate);
        mul(iArr, iArrCreate, iArrCreate);
        sqr(iArrCreate, 2, iArrCreate);
        mul(iArr2, iArrCreate, iArrCreate);
        int[] iArrCreate2 = create();
        sqr(iArrCreate, 5, iArrCreate2);
        mul(iArrCreate, iArrCreate2, iArrCreate2);
        int[] iArrCreate3 = create();
        sqr(iArrCreate2, 5, iArrCreate3);
        mul(iArrCreate, iArrCreate3, iArrCreate3);
        sqr(iArrCreate3, 10, iArrCreate);
        mul(iArrCreate2, iArrCreate, iArrCreate);
        sqr(iArrCreate, 25, iArrCreate2);
        mul(iArrCreate, iArrCreate2, iArrCreate2);
        sqr(iArrCreate2, 25, iArrCreate3);
        mul(iArrCreate, iArrCreate3, iArrCreate3);
        sqr(iArrCreate3, 50, iArrCreate);
        mul(iArrCreate2, iArrCreate, iArrCreate);
        sqr(iArrCreate, 125, iArrCreate2);
        mul(iArrCreate, iArrCreate2, iArrCreate2);
        sqr(iArrCreate2, 2, iArrCreate);
        mul(iArrCreate, iArr, iArr3);
    }

    private static void reduce(int[] iArr, int i15) {
        int i16 = iArr[9];
        int i17 = M24 & i16;
        long j15 = ((long) (((i16 >> 24) + i15) * 19)) + ((long) iArr[0]);
        iArr[0] = ((int) j15) & M26;
        long j16 = (j15 >> 26) + ((long) iArr[1]);
        iArr[1] = ((int) j16) & M26;
        long j17 = (j16 >> 26) + ((long) iArr[2]);
        iArr[2] = ((int) j17) & M25;
        long j18 = (j17 >> 25) + ((long) iArr[3]);
        iArr[3] = ((int) j18) & M26;
        long j19 = (j18 >> 26) + ((long) iArr[4]);
        iArr[4] = ((int) j19) & M25;
        long j25 = (j19 >> 25) + ((long) iArr[5]);
        iArr[5] = ((int) j25) & M26;
        long j26 = (j25 >> 26) + ((long) iArr[6]);
        iArr[6] = ((int) j26) & M26;
        long j27 = (j26 >> 26) + ((long) iArr[7]);
        iArr[7] = M25 & ((int) j27);
        long j28 = (j27 >> 25) + ((long) iArr[8]);
        iArr[8] = M26 & ((int) j28);
        iArr[9] = i17 + ((int) (j28 >> 26));
    }

    public static void sqr(int[] iArr, int i15, int[] iArr2) {
        sqr(iArr, iArr2);
        while (true) {
            i15--;
            if (i15 <= 0) {
                return;
            } else {
                sqr(iArr2, iArr2);
            }
        }
    }

    public static boolean sqrtRatioVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreate = create();
        int[] iArrCreate2 = create();
        mul(iArr, iArr2, iArrCreate);
        sqr(iArr2, iArrCreate2);
        mul(iArrCreate, iArrCreate2, iArrCreate);
        sqr(iArrCreate2, iArrCreate2);
        mul(iArrCreate2, iArrCreate, iArrCreate2);
        int[] iArrCreate3 = create();
        int[] iArrCreate4 = create();
        powPm5d8(iArrCreate2, iArrCreate3, iArrCreate4);
        mul(iArrCreate4, iArrCreate, iArrCreate4);
        int[] iArrCreate5 = create();
        sqr(iArrCreate4, iArrCreate5);
        mul(iArrCreate5, iArr2, iArrCreate5);
        sub(iArrCreate5, iArr, iArrCreate3);
        normalize(iArrCreate3);
        if (isZeroVar(iArrCreate3)) {
            copy(iArrCreate4, 0, iArr3, 0);
            return true;
        }
        add(iArrCreate5, iArr, iArrCreate3);
        normalize(iArrCreate3);
        if (!isZeroVar(iArrCreate3)) {
            return false;
        }
        mul(iArrCreate4, ROOT_NEG_ONE, iArr3);
        return true;
    }

    public static void sub(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i15 = 0; i15 < 10; i15++) {
            iArr3[i15] = iArr[i15] - iArr2[i15];
        }
    }

    public static void subOne(int[] iArr) {
        iArr[0] = iArr[0] - 1;
    }

    public static void zero(int[] iArr) {
        for (int i15 = 0; i15 < 10; i15++) {
            iArr[i15] = 0;
        }
    }

    public static void addOne(int[] iArr, int i15) {
        iArr[i15] = iArr[i15] + 1;
    }

    public static void decode(byte[] bArr, int i15, int[] iArr, int i16) {
        decode128(bArr, i15, iArr, i16);
        decode128(bArr, i15 + 16, iArr, i16 + 5);
        int i17 = i16 + 9;
        iArr[i17] = iArr[i17] & M24;
    }

    private static void decode128(int[] iArr, int i15, int[] iArr2, int i16) {
        int i17 = iArr[i15];
        int i18 = iArr[i15 + 1];
        int i19 = iArr[i15 + 2];
        int i25 = iArr[i15 + 3];
        iArr2[i16] = i17 & M26;
        iArr2[i16 + 1] = ((i17 >>> 26) | (i18 << 6)) & M26;
        iArr2[i16 + 2] = ((i18 >>> 20) | (i19 << 12)) & M25;
        iArr2[i16 + 3] = M26 & ((i25 << 19) | (i19 >>> 13));
        iArr2[i16 + 4] = i25 >>> 7;
    }

    public static void encode(int[] iArr, byte[] bArr) {
        encode128(iArr, 0, bArr, 0);
        encode128(iArr, 5, bArr, 16);
    }

    private static void encode128(int[] iArr, int i15, int[] iArr2, int i16) {
        int i17 = iArr[i15];
        int i18 = iArr[i15 + 1];
        int i19 = iArr[i15 + 2];
        int i25 = iArr[i15 + 3];
        int i26 = iArr[i15 + 4];
        iArr2[i16] = (i18 << 26) | i17;
        iArr2[i16 + 1] = (i18 >>> 6) | (i19 << 20);
        iArr2[i16 + 2] = (i19 >>> 12) | (i25 << 13);
        iArr2[i16 + 3] = (i26 << 7) | (i25 >>> 19);
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        int i15 = iArr[0];
        int i16 = iArr2[0];
        int i17 = iArr[1];
        int i18 = iArr2[1];
        int i19 = iArr[2];
        int i25 = iArr2[2];
        int i26 = iArr[3];
        int i27 = iArr2[3];
        int i28 = iArr[4];
        int i29 = iArr2[4];
        int i35 = iArr[5];
        int i36 = iArr2[5];
        int i37 = iArr[6];
        int i38 = iArr2[6];
        int i39 = iArr[7];
        int i45 = iArr2[7];
        int i46 = iArr[8];
        int i47 = iArr2[8];
        int i48 = iArr[9];
        int i49 = iArr2[9];
        long j15 = i15;
        long j16 = i16;
        long j17 = j15 * j16;
        long j18 = i18;
        long j19 = j15 * j18;
        long j25 = i17;
        long j26 = j19 + (j25 * j16);
        long j27 = i25;
        long j28 = (j15 * j27) + (j25 * j18);
        long j29 = i19;
        long j35 = j28 + (j29 * j16);
        long j36 = ((j25 * j27) + (j29 * j18)) << 1;
        long j37 = i27;
        long j38 = j15 * j37;
        long j39 = i26;
        long j45 = j36 + j38 + (j39 * j16);
        long j46 = (j29 * j27) << 1;
        long j47 = i29;
        long j48 = i28;
        long j49 = j46 + (j15 * j47) + (j25 * j37) + (j39 * j18) + (j16 * j48);
        long j55 = ((((j25 * j47) + (j29 * j37)) + (j39 * j27)) + (j48 * j18)) << 1;
        long j56 = (((j29 * j47) + (j48 * j27)) << 1) + (j39 * j37);
        long j57 = (j39 * j47) + (j48 * j37);
        long j58 = (j48 * j47) << 1;
        long j59 = i35;
        long j65 = i36;
        long j66 = j59 * j65;
        long j67 = i38;
        long j68 = j59 * j67;
        long j69 = i37;
        long j75 = j68 + (j69 * j65);
        long j76 = i45;
        long j77 = (j59 * j76) + (j69 * j67);
        long j78 = i39;
        long j79 = i47;
        long j85 = j59 * j79;
        long j86 = i46;
        long j87 = (((j69 * j76) + (j78 * j67)) << 1) + j85 + (j86 * j65);
        long j88 = i49;
        long j89 = (j59 * j88) + (j69 * j79) + (j86 * j67);
        long j95 = i48;
        long j96 = ((j78 * j76) << 1) + j89 + (j65 * j95);
        long j97 = j17 - (((((j69 * j88) + (j78 * j79)) + (j86 * j76)) + (j95 * j67)) * 76);
        long j98 = j26 - (((((j78 * j88) + (j95 * j76)) << 1) + (j86 * j79)) * 38);
        long j99 = j35 - (((j86 * j88) + (j95 * j79)) * 38);
        long j100 = j45 - ((j95 * j88) * 76);
        long j101 = j55 - j66;
        long j102 = j56 - j75;
        long j103 = j57 - (j77 + (j78 * j65));
        long j104 = j58 - j87;
        int i55 = i16 + i36;
        int i56 = i17 + i37;
        long j105 = i15 + i35;
        long j106 = i55;
        long j107 = j105 * j106;
        long j108 = i18 + i38;
        long j109 = j105 * j108;
        long j110 = i56;
        long j111 = j109 + (j110 * j106);
        long j112 = i25 + i45;
        long j113 = i19 + i39;
        long j114 = (j105 * j112) + (j110 * j108) + (j113 * j106);
        long j115 = ((j110 * j112) + (j113 * j108)) << 1;
        long j116 = i27 + i47;
        long j117 = i26 + i46;
        long j118 = j115 + (j105 * j116) + (j117 * j106);
        long j119 = i29 + i49;
        long j120 = i28 + i48;
        long j121 = ((j113 * j112) << 1) + (j105 * j119) + (j110 * j116) + (j117 * j108) + (j120 * j106);
        long j122 = ((((j110 * j119) + (j113 * j116)) + (j117 * j112)) + (j120 * j108)) << 1;
        long j123 = (((j113 * j119) + (j112 * j120)) << 1) + (j117 * j116);
        long j124 = j104 + (j118 - j100);
        int i57 = ((int) j124) & M26;
        long j125 = (j124 >> 26) + ((j121 - j49) - j96);
        int i58 = ((int) j125) & M25;
        long j126 = j97 + ((((j125 >> 25) + j122) - j101) * 38);
        iArr3[0] = ((int) j126) & M26;
        long j127 = (j126 >> 26) + j98 + ((j123 - j102) * 38);
        iArr3[1] = ((int) j127) & M26;
        long j128 = (j127 >> 26) + j99 + ((((j117 * j119) + (j120 * j116)) - j103) * 38);
        iArr3[2] = ((int) j128) & M25;
        long j129 = (j128 >> 25) + j100 + ((((j120 * j119) << 1) - j104) * 38);
        iArr3[3] = ((int) j129) & M26;
        long j130 = (j129 >> 26) + j49 + (j96 * 38);
        iArr3[4] = ((int) j130) & M25;
        long j131 = (j130 >> 25) + j101 + (j107 - j97);
        iArr3[5] = ((int) j131) & M26;
        long j132 = (j131 >> 26) + j102 + (j111 - j98);
        iArr3[6] = ((int) j132) & M26;
        long j133 = (j132 >> 26) + j103 + (j114 - j99);
        iArr3[7] = ((int) j133) & M25;
        long j134 = (j133 >> 25) + ((long) i57);
        iArr3[8] = ((int) j134) & M26;
        iArr3[9] = i58 + ((int) (j134 >> 26));
    }

    public static void sqr(int[] iArr, int[] iArr2) {
        int i15 = iArr[0];
        int i16 = iArr[1];
        int i17 = iArr[2];
        int i18 = iArr[3];
        int i19 = iArr[4];
        int i25 = iArr[5];
        int i26 = iArr[6];
        int i27 = iArr[7];
        int i28 = iArr[8];
        int i29 = iArr[9];
        long j15 = i15;
        long j16 = j15 * j15;
        long j17 = i16 * 2;
        long j18 = j15 * j17;
        long j19 = i17 * 2;
        long j25 = j15 * j19;
        long j26 = i16;
        long j27 = j25 + (j26 * j26);
        long j28 = i18 * 2;
        long j29 = (j17 * j19) + (j15 * j28);
        long j35 = i19 * 2;
        long j36 = (((long) i17) * j19) + (j15 * j35) + (j26 * j28);
        long j37 = (j17 * j35) + (j19 * j28);
        long j38 = j19 * j35;
        long j39 = i18;
        long j45 = j38 + (j39 * j39);
        long j46 = j39 * j35;
        long j47 = i25;
        long j48 = j47 * j47;
        long j49 = i26 * 2;
        long j55 = j47 * j49;
        long j56 = i27 * 2;
        long j57 = j47 * j56;
        long j58 = i26;
        long j59 = j57 + (j58 * j58);
        long j65 = j49 * j56;
        long j66 = i28 * 2;
        long j67 = i29 * 2;
        long j68 = (((long) i27) * j56) + (j47 * j67) + (j58 * j66);
        long j69 = (j49 * j67) + (j56 * j66);
        long j75 = j56 * j67;
        long j76 = i28;
        long j77 = j16 - (j69 * 38);
        long j78 = j18 - ((j75 + (j76 * j76)) * 38);
        long j79 = j27 - ((j76 * j67) * 38);
        long j85 = j29 - ((((long) i29) * j67) * 38);
        long j86 = j37 - j48;
        long j87 = j45 - j55;
        long j88 = j46 - j59;
        long j89 = (((long) i19) * j35) - (j65 + (j47 * j66));
        int i35 = i16 + i26;
        int i36 = i17 + i27;
        int i37 = i18 + i28;
        int i38 = i19 + i29;
        long j95 = i15 + i25;
        long j96 = j95 * j95;
        long j97 = i35 * 2;
        long j98 = j95 * j97;
        long j99 = i36 * 2;
        long j100 = i35;
        long j101 = (j95 * j99) + (j100 * j100);
        long j102 = i37 * 2;
        long j103 = (j97 * j99) + (j95 * j102);
        long j104 = i38 * 2;
        long j105 = (((long) i36) * j99) + (j95 * j104) + (j100 * j102);
        long j106 = (j97 * j104) + (j102 * j99);
        long j107 = i37;
        long j108 = (j99 * j104) + (j107 * j107);
        long j109 = j107 * j104;
        long j110 = ((long) i38) * j104;
        long j111 = j89 + (j103 - j85);
        int i39 = ((int) j111) & M26;
        long j112 = (j111 >> 26) + ((j105 - j36) - j68);
        int i45 = ((int) j112) & M25;
        long j113 = j77 + ((((j112 >> 25) + j106) - j86) * 38);
        iArr2[0] = ((int) j113) & M26;
        long j114 = (j113 >> 26) + j78 + ((j108 - j87) * 38);
        iArr2[1] = ((int) j114) & M26;
        long j115 = (j114 >> 26) + j79 + ((j109 - j88) * 38);
        iArr2[2] = ((int) j115) & M25;
        long j116 = (j115 >> 25) + j85 + ((j110 - j89) * 38);
        iArr2[3] = ((int) j116) & M26;
        long j117 = (j116 >> 26) + j36 + (j68 * 38);
        iArr2[4] = ((int) j117) & M25;
        long j118 = (j117 >> 25) + j86 + (j96 - j77);
        iArr2[5] = ((int) j118) & M26;
        long j119 = (j118 >> 26) + j87 + (j98 - j78);
        iArr2[6] = ((int) j119) & M26;
        long j120 = (j119 >> 26) + j88 + (j101 - j79);
        iArr2[7] = ((int) j120) & M25;
        long j121 = (j120 >> 25) + ((long) i39);
        iArr2[8] = ((int) j121) & M26;
        iArr2[9] = i45 + ((int) (j121 >> 26));
    }

    public static void decode(byte[] bArr, int[] iArr) {
        decode128(bArr, 0, iArr, 0);
        decode128(bArr, 16, iArr, 5);
        iArr[9] = iArr[9] & M24;
    }

    public static void encode(int[] iArr, byte[] bArr, int i15) {
        encode128(iArr, 0, bArr, i15);
        encode128(iArr, 5, bArr, i15 + 16);
    }

    public static void decode(int[] iArr, int i15, int[] iArr2) {
        decode128(iArr, i15, iArr2, 0);
        decode128(iArr, i15 + 4, iArr2, 5);
        iArr2[9] = iArr2[9] & M24;
    }

    public static void encode(int[] iArr, int[] iArr2, int i15) {
        encode128(iArr, 0, iArr2, i15);
        encode128(iArr, 5, iArr2, i15 + 4);
    }
}
