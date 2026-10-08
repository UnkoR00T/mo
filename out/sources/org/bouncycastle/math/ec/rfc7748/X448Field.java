package org.bouncycastle.math.ec.rfc7748;

import org.bouncycastle.math.raw.Mod;

/* JADX INFO: loaded from: classes5.dex */
public abstract class X448Field {
    private static final int M28 = 268435455;
    private static final int[] P32 = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};
    public static final int SIZE = 16;
    private static final long U32 = 4294967295L;

    protected X448Field() {
    }

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i15 = 0; i15 < 16; i15++) {
            iArr3[i15] = iArr[i15] + iArr2[i15];
        }
    }

    public static void addOne(int[] iArr) {
        iArr[0] = iArr[0] + 1;
    }

    public static int areEqual(int[] iArr, int[] iArr2) {
        int i15 = 0;
        for (int i16 = 0; i16 < 16; i16++) {
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
        int i35 = iArr[10];
        int i36 = iArr[11];
        int i37 = iArr[12];
        int i38 = iArr[13];
        int i39 = iArr[14];
        int i45 = iArr[15];
        int i46 = i16 + (i15 >>> 28);
        int i47 = i15 & M28;
        int i48 = i25 + (i19 >>> 28);
        int i49 = i19 & M28;
        int i55 = i29 + (i28 >>> 28);
        int i56 = i28 & M28;
        int i57 = i38 + (i37 >>> 28);
        int i58 = i37 & M28;
        int i59 = i17 + (i46 >>> 28);
        int i65 = i46 & M28;
        int i66 = i26 + (i48 >>> 28);
        int i67 = i48 & M28;
        int i68 = i35 + (i55 >>> 28);
        int i69 = i55 & M28;
        int i75 = i39 + (i57 >>> 28);
        int i76 = i57 & M28;
        int i77 = i18 + (i59 >>> 28);
        int i78 = i59 & M28;
        int i79 = i27 + (i66 >>> 28);
        int i85 = i66 & M28;
        int i86 = i36 + (i68 >>> 28);
        int i87 = i68 & M28;
        int i88 = i45 + (i75 >>> 28);
        int i89 = i75 & M28;
        int i95 = i88 >>> 28;
        int i96 = i88 & M28;
        int i97 = i47 + i95;
        int i98 = i49 + (i77 >>> 28);
        int i99 = i77 & M28;
        int i100 = i56 + i95 + (i79 >>> 28);
        int i101 = i79 & M28;
        int i102 = i58 + (i86 >>> 28);
        int i103 = i86 & M28;
        int i104 = i65 + (i97 >>> 28);
        int i105 = i97 & M28;
        int i106 = i67 + (i98 >>> 28);
        int i107 = i98 & M28;
        int i108 = i69 + (i100 >>> 28);
        int i109 = i100 & M28;
        int i110 = i76 + (i102 >>> 28);
        int i111 = i102 & M28;
        iArr[0] = i105;
        iArr[1] = i104;
        iArr[2] = i78;
        iArr[3] = i99;
        iArr[4] = i107;
        iArr[5] = i106;
        iArr[6] = i85;
        iArr[7] = i101;
        iArr[8] = i109;
        iArr[9] = i108;
        iArr[10] = i87;
        iArr[11] = i103;
        iArr[12] = i111;
        iArr[13] = i110;
        iArr[14] = i89;
        iArr[15] = i96;
    }

    public static void cmov(int i15, int[] iArr, int i16, int[] iArr2, int i17) {
        for (int i18 = 0; i18 < 16; i18++) {
            int i19 = i17 + i18;
            int i25 = iArr2[i19];
            iArr2[i19] = i25 ^ ((iArr[i16 + i18] ^ i25) & i15);
        }
    }

    public static void cnegate(int i15, int[] iArr) {
        int[] iArrCreate = create();
        sub(iArrCreate, iArr, iArrCreate);
        cmov(-i15, iArrCreate, 0, iArr, 0);
    }

    public static void copy(int[] iArr, int i15, int[] iArr2, int i16) {
        for (int i17 = 0; i17 < 16; i17++) {
            iArr2[i16 + i17] = iArr[i15 + i17];
        }
    }

    public static int[] create() {
        return new int[16];
    }

    public static int[] createTable(int i15) {
        return new int[i15 * 16];
    }

    public static void cswap(int i15, int[] iArr, int[] iArr2) {
        int i16 = 0 - i15;
        for (int i17 = 0; i17 < 16; i17++) {
            int i18 = iArr[i17];
            int i19 = iArr2[i17];
            int i25 = (i18 ^ i19) & i16;
            iArr[i17] = i18 ^ i25;
            iArr2[i17] = i19 ^ i25;
        }
    }

    public static void decode(byte[] bArr, int i15, int[] iArr) {
        decode56(bArr, i15, iArr, 0);
        decode56(bArr, i15 + 7, iArr, 2);
        decode56(bArr, i15 + 14, iArr, 4);
        decode56(bArr, i15 + 21, iArr, 6);
        decode56(bArr, i15 + 28, iArr, 8);
        decode56(bArr, i15 + 35, iArr, 10);
        decode56(bArr, i15 + 42, iArr, 12);
        decode56(bArr, i15 + 49, iArr, 14);
    }

    private static void decode224(int[] iArr, int i15, int[] iArr2, int i16) {
        int i17 = iArr[i15];
        int i18 = iArr[i15 + 1];
        int i19 = iArr[i15 + 2];
        int i25 = iArr[i15 + 3];
        int i26 = iArr[i15 + 4];
        int i27 = iArr[i15 + 5];
        int i28 = iArr[i15 + 6];
        iArr2[i16] = i17 & M28;
        iArr2[i16 + 1] = ((i17 >>> 28) | (i18 << 4)) & M28;
        iArr2[i16 + 2] = ((i18 >>> 24) | (i19 << 8)) & M28;
        iArr2[i16 + 3] = ((i19 >>> 20) | (i25 << 12)) & M28;
        iArr2[i16 + 4] = ((i25 >>> 16) | (i26 << 16)) & M28;
        iArr2[i16 + 5] = ((i26 >>> 12) | (i27 << 20)) & M28;
        iArr2[i16 + 6] = M28 & ((i27 >>> 8) | (i28 << 24));
        iArr2[i16 + 7] = i28 >>> 4;
    }

    private static int decode24(byte[] bArr, int i15) {
        return ((bArr[i15 + 2] & 255) << 16) | (bArr[i15] & 255) | ((bArr[i15 + 1] & 255) << 8);
    }

    private static int decode32(byte[] bArr, int i15) {
        return (bArr[i15 + 3] << 24) | (bArr[i15] & 255) | ((bArr[i15 + 1] & 255) << 8) | ((bArr[i15 + 2] & 255) << 16);
    }

    private static void decode56(byte[] bArr, int i15, int[] iArr, int i16) {
        int iDecode32 = decode32(bArr, i15);
        int iDecode24 = decode24(bArr, i15 + 4);
        iArr[i16] = M28 & iDecode32;
        iArr[i16 + 1] = (iDecode24 << 4) | (iDecode32 >>> 28);
    }

    public static void encode(int[] iArr, int i15, byte[] bArr, int i16) {
        encode56(iArr, i15, bArr, i16);
        encode56(iArr, i15 + 2, bArr, i16 + 7);
        encode56(iArr, i15 + 4, bArr, i16 + 14);
        encode56(iArr, i15 + 6, bArr, i16 + 21);
        encode56(iArr, i15 + 8, bArr, i16 + 28);
        encode56(iArr, i15 + 10, bArr, i16 + 35);
        encode56(iArr, i15 + 12, bArr, i16 + 42);
        encode56(iArr, i15 + 14, bArr, i16 + 49);
    }

    private static void encode224(int[] iArr, int i15, int[] iArr2, int i16) {
        int i17 = iArr[i15];
        int i18 = iArr[i15 + 1];
        int i19 = iArr[i15 + 2];
        int i25 = iArr[i15 + 3];
        int i26 = iArr[i15 + 4];
        int i27 = iArr[i15 + 5];
        int i28 = iArr[i15 + 6];
        int i29 = iArr[i15 + 7];
        iArr2[i16] = (i18 << 28) | i17;
        iArr2[i16 + 1] = (i18 >>> 4) | (i19 << 24);
        iArr2[i16 + 2] = (i19 >>> 8) | (i25 << 20);
        iArr2[i16 + 3] = (i25 >>> 12) | (i26 << 16);
        iArr2[i16 + 4] = (i26 >>> 16) | (i27 << 12);
        iArr2[i16 + 5] = (i27 >>> 20) | (i28 << 8);
        iArr2[i16 + 6] = (i29 << 4) | (i28 >>> 24);
    }

    private static void encode24(int i15, byte[] bArr, int i16) {
        bArr[i16] = (byte) i15;
        bArr[i16 + 1] = (byte) (i15 >>> 8);
        bArr[i16 + 2] = (byte) (i15 >>> 16);
    }

    private static void encode32(int i15, byte[] bArr, int i16) {
        bArr[i16] = (byte) i15;
        bArr[i16 + 1] = (byte) (i15 >>> 8);
        bArr[i16 + 2] = (byte) (i15 >>> 16);
        bArr[i16 + 3] = (byte) (i15 >>> 24);
    }

    private static void encode56(int[] iArr, int i15, byte[] bArr, int i16) {
        int i17 = iArr[i15];
        int i18 = iArr[i15 + 1];
        encode32((i18 << 28) | i17, bArr, i16);
        encode24(i18 >>> 4, bArr, i16 + 4);
    }

    public static void inv(int[] iArr, int[] iArr2) {
        int[] iArrCreate = create();
        int[] iArr3 = new int[14];
        copy(iArr, 0, iArrCreate, 0);
        normalize(iArrCreate);
        encode(iArrCreate, iArr3, 0);
        Mod.modOddInverse(P32, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    public static void invVar(int[] iArr, int[] iArr2) {
        int[] iArrCreate = create();
        int[] iArr3 = new int[14];
        copy(iArr, 0, iArrCreate, 0);
        normalize(iArrCreate);
        encode(iArrCreate, iArr3, 0);
        Mod.modOddInverseVar(P32, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    public static int isOne(int[] iArr) {
        int i15 = iArr[0] ^ 1;
        for (int i16 = 1; i16 < 16; i16++) {
            i15 |= iArr[i16];
        }
        return (((i15 >>> 1) | (i15 & 1)) - 1) >> 31;
    }

    public static boolean isOneVar(int[] iArr) {
        return isOne(iArr) != 0;
    }

    public static int isZero(int[] iArr) {
        int i15 = 0;
        for (int i16 = 0; i16 < 16; i16++) {
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
        int i36 = iArr[10];
        int i37 = iArr[11];
        int i38 = iArr[12];
        int i39 = iArr[13];
        int i45 = iArr[14];
        int i46 = iArr[15];
        long j15 = i15;
        long j16 = ((long) i17) * j15;
        int i47 = ((int) j16) & M28;
        long j17 = j16 >>> 28;
        long j18 = ((long) i26) * j15;
        int i48 = ((int) j18) & M28;
        long j19 = j18 >>> 28;
        long j25 = ((long) i35) * j15;
        int i49 = ((int) j25) & M28;
        long j26 = j25 >>> 28;
        long j27 = ((long) i39) * j15;
        int i55 = ((int) j27) & M28;
        long j28 = j27 >>> 28;
        long j29 = j17 + (((long) i18) * j15);
        iArr2[2] = ((int) j29) & M28;
        long j35 = j29 >>> 28;
        long j36 = j19 + (((long) i27) * j15);
        iArr2[6] = ((int) j36) & M28;
        long j37 = j36 >>> 28;
        long j38 = j26 + (((long) i36) * j15);
        iArr2[10] = ((int) j38) & M28;
        long j39 = j28 + (((long) i45) * j15);
        iArr2[14] = ((int) j39) & M28;
        long j45 = j39 >>> 28;
        long j46 = j35 + (((long) i19) * j15);
        iArr2[3] = ((int) j46) & M28;
        long j47 = j37 + (((long) i28) * j15);
        iArr2[7] = ((int) j47) & M28;
        long j48 = (j38 >>> 28) + (((long) i37) * j15);
        iArr2[11] = ((int) j48) & M28;
        long j49 = j45 + (((long) i46) * j15);
        iArr2[15] = ((int) j49) & M28;
        long j55 = j49 >>> 28;
        long j56 = (j46 >>> 28) + (((long) i25) * j15);
        iArr2[4] = ((int) j56) & M28;
        long j57 = (j47 >>> 28) + j55 + (((long) i29) * j15);
        iArr2[8] = ((int) j57) & M28;
        long j58 = (j48 >>> 28) + (((long) i38) * j15);
        iArr2[12] = ((int) j58) & M28;
        long j59 = j55 + (((long) i16) * j15);
        iArr2[0] = ((int) j59) & M28;
        iArr2[1] = i47 + ((int) (j59 >>> 28));
        iArr2[5] = i48 + ((int) (j56 >>> 28));
        iArr2[9] = i49 + ((int) (j57 >>> 28));
        iArr2[13] = i55 + ((int) (j58 >>> 28));
    }

    public static void negate(int[] iArr, int[] iArr2) {
        sub(create(), iArr, iArr2);
    }

    public static void normalize(int[] iArr) {
        reduce(iArr, 1);
        reduce(iArr, -1);
    }

    public static void one(int[] iArr) {
        iArr[0] = 1;
        for (int i15 = 1; i15 < 16; i15++) {
            iArr[i15] = 0;
        }
    }

    private static void powPm3d4(int[] iArr, int[] iArr2) {
        int[] iArrCreate = create();
        sqr(iArr, iArrCreate);
        mul(iArr, iArrCreate, iArrCreate);
        int[] iArrCreate2 = create();
        sqr(iArrCreate, iArrCreate2);
        mul(iArr, iArrCreate2, iArrCreate2);
        int[] iArrCreate3 = create();
        sqr(iArrCreate2, 3, iArrCreate3);
        mul(iArrCreate2, iArrCreate3, iArrCreate3);
        int[] iArrCreate4 = create();
        sqr(iArrCreate3, 3, iArrCreate4);
        mul(iArrCreate2, iArrCreate4, iArrCreate4);
        int[] iArrCreate5 = create();
        sqr(iArrCreate4, 9, iArrCreate5);
        mul(iArrCreate4, iArrCreate5, iArrCreate5);
        int[] iArrCreate6 = create();
        sqr(iArrCreate5, iArrCreate6);
        mul(iArr, iArrCreate6, iArrCreate6);
        int[] iArrCreate7 = create();
        sqr(iArrCreate6, 18, iArrCreate7);
        mul(iArrCreate5, iArrCreate7, iArrCreate7);
        int[] iArrCreate8 = create();
        sqr(iArrCreate7, 37, iArrCreate8);
        mul(iArrCreate7, iArrCreate8, iArrCreate8);
        int[] iArrCreate9 = create();
        sqr(iArrCreate8, 37, iArrCreate9);
        mul(iArrCreate7, iArrCreate9, iArrCreate9);
        int[] iArrCreate10 = create();
        sqr(iArrCreate9, 111, iArrCreate10);
        mul(iArrCreate9, iArrCreate10, iArrCreate10);
        int[] iArrCreate11 = create();
        sqr(iArrCreate10, iArrCreate11);
        mul(iArr, iArrCreate11, iArrCreate11);
        int[] iArrCreate12 = create();
        sqr(iArrCreate11, 223, iArrCreate12);
        mul(iArrCreate12, iArrCreate10, iArr2);
    }

    private static void reduce(int[] iArr, int i15) {
        int i16;
        int i17 = iArr[15];
        int i18 = i17 & M28;
        long j15 = (i17 >>> 28) + i15;
        int i19 = 0;
        long j16 = j15;
        while (true) {
            if (i19 >= 8) {
                break;
            }
            long j17 = j16 + (4294967295L & ((long) iArr[i19]));
            iArr[i19] = ((int) j17) & M28;
            j16 = j17 >> 28;
            i19++;
        }
        long j18 = j16 + j15;
        for (i16 = 8; i16 < 15; i16++) {
            long j19 = j18 + (((long) iArr[i16]) & 4294967295L);
            iArr[i16] = ((int) j19) & M28;
            j18 = j19 >> 28;
        }
        iArr[15] = i18 + ((int) j18);
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
        sqr(iArr, iArrCreate);
        mul(iArrCreate, iArr2, iArrCreate);
        sqr(iArrCreate, iArrCreate2);
        mul(iArrCreate, iArr, iArrCreate);
        mul(iArrCreate2, iArr, iArrCreate2);
        mul(iArrCreate2, iArr2, iArrCreate2);
        int[] iArrCreate3 = create();
        powPm3d4(iArrCreate2, iArrCreate3);
        mul(iArrCreate3, iArrCreate, iArrCreate3);
        int[] iArrCreate4 = create();
        sqr(iArrCreate3, iArrCreate4);
        mul(iArrCreate4, iArr2, iArrCreate4);
        sub(iArr, iArrCreate4, iArrCreate4);
        normalize(iArrCreate4);
        if (!isZeroVar(iArrCreate4)) {
            return false;
        }
        copy(iArrCreate3, 0, iArr3, 0);
        return true;
    }

    public static void sub(int[] iArr, int[] iArr2, int[] iArr3) {
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
        int i35 = iArr[10];
        int i36 = iArr[11];
        int i37 = iArr[12];
        int i38 = iArr[13];
        int i39 = iArr[14];
        int i45 = iArr[15];
        int i46 = iArr2[0];
        int i47 = iArr2[1];
        int i48 = iArr2[2];
        int i49 = iArr2[3];
        int i55 = iArr2[4];
        int i56 = iArr2[5];
        int i57 = iArr2[6];
        int i58 = iArr2[7];
        int i59 = iArr2[8];
        int i65 = iArr2[9];
        int i66 = iArr2[10];
        int i67 = iArr2[11];
        int i68 = iArr2[12];
        int i69 = iArr2[13];
        int i75 = iArr2[14];
        int i76 = (i16 + 536870910) - i47;
        int i77 = (i25 + 536870910) - i56;
        int i78 = (i29 + 536870910) - i65;
        int i79 = (i38 + 536870910) - i69;
        int i85 = (i45 + 536870910) - iArr2[15];
        int i86 = ((i17 + 536870910) - i48) + (i76 >>> 28);
        int i87 = i76 & M28;
        int i88 = ((i26 + 536870910) - i57) + (i77 >>> 28);
        int i89 = i77 & M28;
        int i95 = ((i35 + 536870910) - i66) + (i78 >>> 28);
        int i96 = i78 & M28;
        int i97 = ((i39 + 536870910) - i75) + (i79 >>> 28);
        int i98 = i79 & M28;
        int i99 = ((i18 + 536870910) - i49) + (i86 >>> 28);
        int i100 = i86 & M28;
        int i101 = ((i27 + 536870910) - i58) + (i88 >>> 28);
        int i102 = i88 & M28;
        int i103 = ((i36 + 536870910) - i67) + (i95 >>> 28);
        int i104 = i95 & M28;
        int i105 = i85 + (i97 >>> 28);
        int i106 = i97 & M28;
        int i107 = i105 >>> 28;
        int i108 = i105 & M28;
        int i109 = ((i15 + 536870910) - i46) + i107;
        int i110 = ((i19 + 536870910) - i55) + (i99 >>> 28);
        int i111 = i99 & M28;
        int i112 = ((i28 + 536870908) - i59) + i107 + (i101 >>> 28);
        int i113 = i101 & M28;
        int i114 = ((i37 + 536870910) - i68) + (i103 >>> 28);
        int i115 = i103 & M28;
        int i116 = i87 + (i109 >>> 28);
        int i117 = i109 & M28;
        int i118 = i89 + (i110 >>> 28);
        int i119 = i110 & M28;
        int i120 = i96 + (i112 >>> 28);
        int i121 = i112 & M28;
        int i122 = i98 + (i114 >>> 28);
        int i123 = i114 & M28;
        iArr3[0] = i117;
        iArr3[1] = i116;
        iArr3[2] = i100;
        iArr3[3] = i111;
        iArr3[4] = i119;
        iArr3[5] = i118;
        iArr3[6] = i102;
        iArr3[7] = i113;
        iArr3[8] = i121;
        iArr3[9] = i120;
        iArr3[10] = i104;
        iArr3[11] = i115;
        iArr3[12] = i123;
        iArr3[13] = i122;
        iArr3[14] = i106;
        iArr3[15] = i108;
    }

    public static void subOne(int[] iArr) {
        int[] iArrCreate = create();
        iArrCreate[0] = 1;
        sub(iArr, iArrCreate, iArr);
    }

    public static void zero(int[] iArr) {
        for (int i15 = 0; i15 < 16; i15++) {
            iArr[i15] = 0;
        }
    }

    public static void addOne(int[] iArr, int i15) {
        iArr[i15] = iArr[i15] + 1;
    }

    public static void decode(byte[] bArr, int i15, int[] iArr, int i16) {
        decode56(bArr, i15, iArr, i16);
        decode56(bArr, i15 + 7, iArr, i16 + 2);
        decode56(bArr, i15 + 14, iArr, i16 + 4);
        decode56(bArr, i15 + 21, iArr, i16 + 6);
        decode56(bArr, i15 + 28, iArr, i16 + 8);
        decode56(bArr, i15 + 35, iArr, i16 + 10);
        decode56(bArr, i15 + 42, iArr, i16 + 12);
        decode56(bArr, i15 + 49, iArr, i16 + 14);
    }

    public static void encode(int[] iArr, byte[] bArr) {
        encode56(iArr, 0, bArr, 0);
        encode56(iArr, 2, bArr, 7);
        encode56(iArr, 4, bArr, 14);
        encode56(iArr, 6, bArr, 21);
        encode56(iArr, 8, bArr, 28);
        encode56(iArr, 10, bArr, 35);
        encode56(iArr, 12, bArr, 42);
        encode56(iArr, 14, bArr, 49);
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
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
        int i35 = iArr[10];
        int i36 = iArr[11];
        int i37 = iArr[12];
        int i38 = iArr[13];
        int i39 = iArr[14];
        int i45 = iArr[15];
        int i46 = iArr2[0];
        int i47 = iArr2[1];
        int i48 = iArr2[2];
        int i49 = iArr2[3];
        int i55 = iArr2[4];
        int i56 = iArr2[5];
        int i57 = iArr2[6];
        int i58 = iArr2[7];
        int i59 = iArr2[8];
        int i65 = iArr2[9];
        int i66 = iArr2[10];
        int i67 = iArr2[11];
        int i68 = iArr2[12];
        int i69 = iArr2[13];
        int i75 = iArr2[14];
        int i76 = iArr2[15];
        int i77 = i15 + i28;
        int i78 = i16 + i29;
        int i79 = i17 + i35;
        int i85 = i18 + i36;
        int i86 = i19 + i37;
        int i87 = i25 + i38;
        int i88 = i26 + i39;
        int i89 = i27 + i45;
        int i95 = i46 + i59;
        int i96 = i47 + i65;
        int i97 = i48 + i66;
        int i98 = i49 + i67;
        int i99 = i55 + i68;
        int i100 = i56 + i69;
        int i101 = i57 + i75;
        int i102 = i58 + i76;
        long j15 = i15;
        long j16 = i46;
        long j17 = j15 * j16;
        long j18 = i27;
        long j19 = i47;
        long j25 = j18 * j19;
        long j26 = i26;
        long j27 = i48;
        long j28 = j25 + (j26 * j27);
        long j29 = i25;
        long j35 = i49;
        long j36 = i19;
        long j37 = i55;
        long j38 = i18;
        long j39 = i56;
        long j45 = i17;
        long j46 = i57;
        long j47 = j28 + (j29 * j35) + (j36 * j37) + (j38 * j39) + (j45 * j46);
        long j48 = i16;
        long j49 = i58;
        long j55 = j47 + (j48 * j49);
        long j56 = i28;
        long j57 = i59;
        long j58 = j56 * j57;
        long j59 = i45;
        long j65 = i65;
        long j66 = j59 * j65;
        long j67 = i39;
        long j68 = i66;
        long j69 = j66 + (j67 * j68);
        long j75 = i38;
        long j76 = i67;
        long j77 = j69 + (j75 * j76);
        long j78 = i37;
        long j79 = i68;
        long j85 = j77 + (j78 * j79);
        long j86 = i36;
        long j87 = i69;
        long j88 = j85 + (j86 * j87);
        long j89 = i35;
        long j95 = i75;
        long j96 = j88 + (j89 * j95);
        long j97 = i29;
        long j98 = i76;
        long j99 = j96 + (j97 * j98);
        long j100 = i77;
        long j101 = i95;
        long j102 = j100 * j101;
        long j103 = i89;
        long j104 = i96;
        long j105 = j103 * j104;
        long j106 = i88;
        long j107 = i97;
        long j108 = j105 + (j106 * j107);
        long j109 = i87;
        long j110 = i98;
        long j111 = j108 + (j109 * j110);
        long j112 = i86;
        long j113 = i99;
        long j114 = j111 + (j112 * j113);
        long j115 = i85;
        long j116 = i100;
        long j117 = j114 + (j115 * j116);
        long j118 = i79;
        long j119 = i101;
        long j120 = j117 + (j118 * j119);
        long j121 = i78;
        long j122 = i102;
        long j123 = j120 + (j121 * j122);
        long j124 = ((j17 + j58) + j123) - j55;
        int i103 = ((int) j124) & M28;
        long j125 = ((j99 + j102) - j17) + j123;
        int i104 = ((int) j125) & M28;
        long j126 = j125 >>> 28;
        long j127 = (j48 * j16) + (j15 * j19);
        long j128 = (j59 * j68) + (j67 * j76) + (j75 * j79) + (j78 * j87) + (j86 * j95) + (j89 * j98);
        long j129 = (j121 * j101) + (j100 * j104);
        long j130 = (j103 * j107) + (j106 * j110) + (j109 * j113) + (j112 * j116) + (j115 * j119) + (j118 * j122);
        long j131 = (j124 >>> 28) + (((j127 + ((j97 * j57) + (j56 * j65))) + j130) - ((((((j18 * j27) + (j26 * j35)) + (j29 * j37)) + (j36 * j39)) + (j38 * j46)) + (j45 * j49)));
        int i105 = ((int) j131) & M28;
        long j132 = j131 >>> 28;
        long j133 = j126 + ((j128 + j129) - j127) + j130;
        int i106 = ((int) j133) & M28;
        long j134 = j133 >>> 28;
        long j135 = (j45 * j16) + (j48 * j19) + (j15 * j27);
        long j136 = (j59 * j76) + (j67 * j79) + (j75 * j87) + (j78 * j95) + (j86 * j98);
        long j137 = (j118 * j101) + (j121 * j104) + (j100 * j107);
        long j138 = (j103 * j110) + (j106 * j113) + (j109 * j116) + (j112 * j119) + (j115 * j122);
        long j139 = j132 + (((j135 + (((j89 * j57) + (j97 * j65)) + (j56 * j68))) + j138) - (((((j18 * j35) + (j26 * j37)) + (j29 * j39)) + (j36 * j46)) + (j38 * j49)));
        int i107 = ((int) j139) & M28;
        long j140 = j139 >>> 28;
        long j141 = j134 + ((j136 + j137) - j135) + j138;
        int i108 = ((int) j141) & M28;
        long j142 = j141 >>> 28;
        long j143 = (j38 * j16) + (j45 * j19) + (j48 * j27) + (j15 * j35);
        long j144 = (j59 * j79) + (j67 * j87) + (j75 * j95) + (j78 * j98);
        long j145 = (j115 * j101) + (j118 * j104) + (j121 * j107) + (j100 * j110);
        long j146 = (j103 * j113) + (j106 * j116) + (j109 * j119) + (j112 * j122);
        long j147 = j140 + (((j143 + ((((j86 * j57) + (j89 * j65)) + (j97 * j68)) + (j56 * j76))) + j146) - ((((j18 * j37) + (j26 * j39)) + (j29 * j46)) + (j36 * j49)));
        int i109 = ((int) j147) & M28;
        long j148 = j147 >>> 28;
        long j149 = j142 + ((j144 + j145) - j143) + j146;
        int i110 = ((int) j149) & M28;
        long j150 = j149 >>> 28;
        long j151 = (j36 * j16) + (j38 * j19) + (j45 * j27) + (j48 * j35) + (j15 * j37);
        long j152 = (j59 * j87) + (j67 * j95) + (j75 * j98);
        long j153 = (j112 * j101) + (j115 * j104) + (j118 * j107) + (j121 * j110) + (j100 * j113);
        long j154 = (j103 * j116) + (j106 * j119) + (j109 * j122);
        long j155 = j148 + (((j151 + (((((j78 * j57) + (j86 * j65)) + (j89 * j68)) + (j97 * j76)) + (j56 * j79))) + j154) - (((j18 * j39) + (j26 * j46)) + (j29 * j49)));
        int i111 = ((int) j155) & M28;
        long j156 = j155 >>> 28;
        long j157 = j150 + ((j152 + j153) - j151) + j154;
        int i112 = ((int) j157) & M28;
        long j158 = j157 >>> 28;
        long j159 = (j29 * j16) + (j36 * j19) + (j38 * j27) + (j45 * j35) + (j48 * j37) + (j15 * j39);
        long j160 = (j59 * j95) + (j67 * j98);
        long j161 = (j109 * j101) + (j112 * j104) + (j115 * j107) + (j118 * j110) + (j121 * j113) + (j100 * j116);
        long j162 = (j103 * j119) + (j106 * j122);
        long j163 = j156 + (((j159 + ((((((j75 * j57) + (j78 * j65)) + (j86 * j68)) + (j89 * j76)) + (j97 * j79)) + (j56 * j87))) + j162) - ((j18 * j46) + (j26 * j49)));
        int i113 = ((int) j163) & M28;
        long j164 = j163 >>> 28;
        long j165 = j158 + ((j160 + j161) - j159) + j162;
        int i114 = ((int) j165) & M28;
        long j166 = j165 >>> 28;
        long j167 = (j26 * j16) + (j29 * j19) + (j36 * j27) + (j38 * j35) + (j45 * j37) + (j48 * j39) + (j15 * j46);
        long j168 = j59 * j98;
        long j169 = (j106 * j101) + (j109 * j104) + (j112 * j107) + (j115 * j110) + (j118 * j113) + (j121 * j116) + (j100 * j119);
        long j170 = j103 * j122;
        long j171 = j164 + (((j167 + (((((((j67 * j57) + (j75 * j65)) + (j78 * j68)) + (j86 * j76)) + (j89 * j79)) + (j97 * j87)) + (j56 * j95))) + j170) - (j18 * j49));
        int i115 = ((int) j171) & M28;
        long j172 = j171 >>> 28;
        long j173 = j166 + ((j168 + j169) - j167) + j170;
        int i116 = ((int) j173) & M28;
        long j174 = (j16 * j18) + (j26 * j19) + (j29 * j27) + (j36 * j35) + (j38 * j37) + (j45 * j39) + (j48 * j46) + (j15 * j49);
        long j175 = j172 + j174 + (j59 * j57) + (j67 * j65) + (j75 * j68) + (j78 * j76) + (j86 * j79) + (j89 * j87) + (j97 * j95) + (j56 * j98);
        int i117 = ((int) j175) & M28;
        long j176 = (j173 >>> 28) + (((((((((j103 * j101) + (j106 * j104)) + (j109 * j107)) + (j112 * j110)) + (j115 * j113)) + (j118 * j116)) + (j121 * j119)) + (j100 * j122)) - j174);
        int i118 = ((int) j176) & M28;
        long j177 = j176 >>> 28;
        long j178 = (j175 >>> 28) + j177 + ((long) i104);
        int i119 = ((int) j178) & M28;
        long j179 = j177 + ((long) i103);
        iArr3[0] = ((int) j179) & M28;
        iArr3[1] = i105 + ((int) (j179 >>> 28));
        iArr3[2] = i107;
        iArr3[3] = i109;
        iArr3[4] = i111;
        iArr3[5] = i113;
        iArr3[6] = i115;
        iArr3[7] = i117;
        iArr3[8] = i119;
        iArr3[9] = i106 + ((int) (j178 >>> 28));
        iArr3[10] = i108;
        iArr3[11] = i110;
        iArr3[12] = i112;
        iArr3[13] = i114;
        iArr3[14] = i116;
        iArr3[15] = i118;
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
        int i35 = iArr[10];
        int i36 = iArr[11];
        int i37 = iArr[12];
        int i38 = iArr[13];
        int i39 = iArr[14];
        int i45 = iArr[15];
        int i46 = i15 * 2;
        int i47 = i16 * 2;
        int i48 = i19 * 2;
        int i49 = i25 * 2;
        int i55 = i26 * 2;
        int i56 = i28 * 2;
        int i57 = i35 * 2;
        int i58 = i36 * 2;
        int i59 = i37 * 2;
        int i65 = i15 + i28;
        int i66 = i16 + i29;
        int i67 = i17 + i35;
        int i68 = i18 + i36;
        int i69 = i19 + i37;
        int i75 = i25 + i38;
        int i76 = i26 + i39;
        int i77 = i65 * 2;
        int i78 = i66 * 2;
        int i79 = i67 * 2;
        int i85 = i68 * 2;
        long j15 = i15;
        long j16 = j15 * j15;
        long j17 = i27;
        long j18 = i47;
        long j19 = j17 * j18;
        long j25 = i26;
        long j26 = i17 * 2;
        long j27 = j19 + (j25 * j26);
        long j28 = i25;
        long j29 = i18 * 2;
        long j35 = j27 + (j28 * j29);
        long j36 = i19;
        long j37 = i28;
        long j38 = j37 * j37;
        long j39 = i45;
        long j45 = i29 * 2;
        long j46 = i39;
        long j47 = i57;
        long j48 = i38;
        long j49 = i58;
        long j55 = (j39 * j45) + (j46 * j47) + (j48 * j49);
        long j56 = i37;
        long j57 = j55 + (j56 * j56);
        long j58 = i65;
        long j59 = j58 * j58;
        long j65 = i27 + i45;
        long j66 = ((long) i78) & 4294967295L;
        long j67 = j65 * j66;
        long j68 = i76;
        long j69 = ((long) i79) & 4294967295L;
        long j75 = j67 + (j68 * j69);
        long j76 = i75;
        long j77 = ((long) i85) & 4294967295L;
        long j78 = j75 + (j76 * j77);
        long j79 = i69;
        long j85 = j78 + (j79 * j79);
        long j86 = ((j16 + j38) + j85) - (j35 + (j36 * j36));
        int i86 = ((int) j86) & M28;
        long j87 = j86 >>> 28;
        long j88 = ((j57 + j59) - j16) + j85;
        int i87 = ((int) j88) & M28;
        long j89 = j88 >>> 28;
        long j95 = i16;
        long j96 = i46;
        long j97 = j95 * j96;
        long j98 = i48;
        long j99 = (j17 * j26) + (j25 * j29) + (j28 * j98);
        long j100 = i29;
        long j101 = i56;
        long j102 = j100 * j101;
        long j103 = i59;
        long j104 = (j39 * j47) + (j46 * j49) + (j48 * j103);
        long j105 = i66;
        long j106 = ((long) i77) & 4294967295L;
        long j107 = j105 * j106;
        long j108 = (j65 * j69) + (j68 * j77);
        long j109 = ((long) (i69 * 2)) & 4294967295L;
        long j110 = j108 + (j76 * j109);
        long j111 = j87 + (((j97 + j102) + j110) - j99);
        int i88 = ((int) j111) & M28;
        long j112 = j111 >>> 28;
        long j113 = j89 + ((j104 + j107) - j97) + j110;
        int i89 = ((int) j113) & M28;
        long j114 = j113 >>> 28;
        long j115 = i17;
        long j116 = (j115 * j96) + (j95 * j95);
        long j117 = (j17 * j29) + (j25 * j98) + (j28 * j28);
        long j118 = i35;
        long j119 = (j118 * j101) + (j100 * j100);
        long j120 = (j39 * j49) + (j46 * j103) + (j48 * j48);
        long j121 = i67;
        long j122 = (j121 * j106) + (j105 * j105);
        long j123 = (j65 * j77) + (j68 * j109) + (j76 * j76);
        long j124 = j112 + (((j116 + j119) + j123) - j117);
        int i95 = ((int) j124) & M28;
        long j125 = j124 >>> 28;
        long j126 = j114 + ((j120 + j122) - j116) + j123;
        int i96 = ((int) j126) & M28;
        long j127 = j126 >>> 28;
        long j128 = i18;
        long j129 = (j128 * j96) + (j115 * j18);
        long j130 = j17 * j98;
        long j131 = i49;
        long j132 = j130 + (j25 * j131);
        long j133 = i36;
        long j134 = (j133 * j101) + (j118 * j45);
        long j135 = j39 * j103;
        long j136 = i38 * 2;
        long j137 = j135 + (j46 * j136);
        long j138 = i68;
        long j139 = (j138 * j106) + (j121 * j66);
        long j140 = j109 * j65;
        long j141 = ((long) (i75 * 2)) & 4294967295L;
        long j142 = j140 + (j68 * j141);
        long j143 = j125 + (((j129 + j134) + j142) - j132);
        int i97 = ((int) j143) & M28;
        long j144 = j143 >>> 28;
        long j145 = j127 + ((j137 + j139) - j129) + j142;
        int i98 = ((int) j145) & M28;
        long j146 = j145 >>> 28;
        long j147 = (j36 * j96) + (j128 * j18) + (j115 * j115);
        long j148 = (j136 * j39) + (j46 * j46);
        long j149 = (j79 * j106) + (j138 * j66) + (j121 * j121);
        long j150 = (j65 * j141) + (j68 * j68);
        long j151 = j144 + (((j147 + (((j56 * j101) + (j133 * j45)) + (j118 * j118))) + j150) - ((j17 * j131) + (j25 * j25)));
        int i99 = ((int) j151) & M28;
        long j152 = j151 >>> 28;
        long j153 = j146 + ((j148 + j149) - j147) + j150;
        int i100 = ((int) j153) & M28;
        long j154 = j153 >>> 28;
        long j155 = (j28 * j96) + (j36 * j18) + (j128 * j26);
        long j156 = (j48 * j101) + (j56 * j45) + (j133 * j47);
        long j157 = (j76 * j106) + (j79 * j66) + (j138 * j69);
        long j158 = (((long) (i76 * 2)) & 4294967295L) * j65;
        long j159 = j152 + (((j155 + j156) + j158) - (((long) i55) * j17));
        int i101 = ((int) j159) & M28;
        long j160 = j159 >>> 28;
        long j161 = j154 + (((((long) (i39 * 2)) * j39) + j157) - j155) + j158;
        int i102 = ((int) j161) & M28;
        long j162 = j161 >>> 28;
        long j163 = (j25 * j96) + (j28 * j18) + (j36 * j26) + (j128 * j128);
        long j164 = (j68 * j106) + (j76 * j66) + (j79 * j69) + (j138 * j138);
        long j165 = j65 * j65;
        long j166 = j160 + (((j163 + ((((j46 * j101) + (j48 * j45)) + (j56 * j47)) + (j133 * j133))) + j165) - (j17 * j17));
        int i103 = ((int) j166) & M28;
        long j167 = j166 >>> 28;
        long j168 = j162 + (((j39 * j39) + j164) - j163) + j165;
        int i104 = ((int) j168) & M28;
        long j169 = (j17 * j96) + (j25 * j18) + (j28 * j26) + (j29 * j36);
        long j170 = j167 + j169 + (j39 * j101) + (j46 * j45) + (j48 * j47) + (j56 * j49);
        int i105 = ((int) j170) & M28;
        long j171 = (j168 >>> 28) + (((((j65 * j106) + (j68 * j66)) + (j76 * j69)) + (j79 * j77)) - j169);
        int i106 = ((int) j171) & M28;
        long j172 = j171 >>> 28;
        long j173 = (j170 >>> 28) + j172 + ((long) i87);
        int i107 = ((int) j173) & M28;
        long j174 = j172 + ((long) i86);
        iArr2[0] = ((int) j174) & M28;
        iArr2[1] = i88 + ((int) (j174 >>> 28));
        iArr2[2] = i95;
        iArr2[3] = i97;
        iArr2[4] = i99;
        iArr2[5] = i101;
        iArr2[6] = i103;
        iArr2[7] = i105;
        iArr2[8] = i107;
        iArr2[9] = i89 + ((int) (j173 >>> 28));
        iArr2[10] = i96;
        iArr2[11] = i98;
        iArr2[12] = i100;
        iArr2[13] = i102;
        iArr2[14] = i104;
        iArr2[15] = i106;
    }

    public static void decode(byte[] bArr, int[] iArr) {
        decode56(bArr, 0, iArr, 0);
        decode56(bArr, 7, iArr, 2);
        decode56(bArr, 14, iArr, 4);
        decode56(bArr, 21, iArr, 6);
        decode56(bArr, 28, iArr, 8);
        decode56(bArr, 35, iArr, 10);
        decode56(bArr, 42, iArr, 12);
        decode56(bArr, 49, iArr, 14);
    }

    public static void encode(int[] iArr, byte[] bArr, int i15) {
        encode56(iArr, 0, bArr, i15);
        encode56(iArr, 2, bArr, i15 + 7);
        encode56(iArr, 4, bArr, i15 + 14);
        encode56(iArr, 6, bArr, i15 + 21);
        encode56(iArr, 8, bArr, i15 + 28);
        encode56(iArr, 10, bArr, i15 + 35);
        encode56(iArr, 12, bArr, i15 + 42);
        encode56(iArr, 14, bArr, i15 + 49);
    }

    public static void decode(int[] iArr, int i15, int[] iArr2) {
        decode224(iArr, i15, iArr2, 0);
        decode224(iArr, i15 + 7, iArr2, 8);
    }

    public static void encode(int[] iArr, int[] iArr2, int i15) {
        encode224(iArr, 0, iArr2, i15);
        encode224(iArr, 8, iArr2, i15 + 7);
    }
}
