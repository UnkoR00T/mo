package org.bouncycastle.math.ec.rfc8032;

import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

/* JADX INFO: loaded from: classes5.dex */
abstract class Scalar25519 {
    private static final int L0 = -50998291;
    private static final int L1 = 19280294;
    private static final int L2 = 127719000;
    private static final int L3 = -6428113;
    private static final int L4 = 5343;
    private static final long M08L = 255;
    private static final long M28L = 268435455;
    private static final long M32L = 4294967295L;
    private static final int SCALAR_BYTES = 32;
    static final int SIZE = 8;
    private static final int TARGET_LENGTH = 254;
    private static final int[] L = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456};
    private static final int[] LSq = {-1424848535, -487721339, 580428573, 1745064566, -770181698, 1036971123, 461123738, -1582065343, 1268693629, -889041821, -731974758, 43769659, 0, 0, 0, 16777216};

    Scalar25519() {
    }

    static boolean checkVar(byte[] bArr, int[] iArr) {
        decode(bArr, iArr);
        return !Nat256.gte(iArr, L);
    }

    static void decode(byte[] bArr, int[] iArr) {
        Codec.decode32(bArr, 0, iArr, 0, 8);
    }

    static void getOrderWnafVar(int i15, byte[] bArr) {
        Wnaf.getSignedVar(L, i15, bArr);
    }

    static void multiply128Var(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        Nat256.mul128(iArr, iArr2, iArr4);
        if (iArr2[3] < 0) {
            Nat256.addTo(L, 0, iArr4, 4, 0);
            Nat256.subFrom(iArr, 0, iArr4, 4, 0);
        }
        byte[] bArr = new byte[48];
        Codec.encode32(iArr4, 0, 12, bArr, 0);
        decode(reduce384(bArr), iArr3);
    }

    static byte[] reduce384(byte[] bArr) {
        long jDecode32 = ((long) Codec.decode32(bArr, 0)) & 4294967295L;
        long jDecode24 = ((long) (Codec.decode24(bArr, 4) << 4)) & 4294967295L;
        long jDecode33 = ((long) Codec.decode32(bArr, 7)) & 4294967295L;
        long jDecode25 = ((long) (Codec.decode24(bArr, 11) << 4)) & 4294967295L;
        long jDecode34 = ((long) Codec.decode32(bArr, 14)) & 4294967295L;
        long jDecode26 = ((long) (Codec.decode24(bArr, 18) << 4)) & 4294967295L;
        long jDecode35 = ((long) Codec.decode32(bArr, 21)) & 4294967295L;
        long jDecode27 = ((long) (Codec.decode24(bArr, 25) << 4)) & 4294967295L;
        long jDecode36 = ((long) Codec.decode32(bArr, 28)) & 4294967295L;
        long jDecode28 = Codec.decode24(bArr, 32) << 4;
        long j15 = jDecode28 & 4294967295L;
        long jDecode37 = Codec.decode32(bArr, 35);
        long j16 = jDecode37 & 4294967295L;
        long jDecode29 = Codec.decode24(bArr, 39) << 4;
        long j17 = jDecode29 & 4294967295L;
        long jDecode38 = Codec.decode32(bArr, 42);
        long jDecode16 = (((long) (Codec.decode16(bArr, 46) << 4)) & 4294967295L) + ((jDecode38 & 4294967295L) >> 28);
        long j18 = jDecode36 - (jDecode16 * 5343);
        long j19 = (jDecode38 & M28L) + (j17 >> 28);
        long j25 = (jDecode34 - (jDecode16 * (-50998291))) - (j19 * 19280294);
        long j26 = (jDecode26 - (jDecode16 * 19280294)) - (j19 * 127719000);
        long j27 = (jDecode35 - (jDecode16 * 127719000)) - (j19 * (-6428113));
        long j28 = (jDecode27 - (jDecode16 * (-6428113))) - (j19 * 5343);
        long j29 = (jDecode29 & M28L) + (j16 >> 28);
        long j35 = jDecode33 - (j29 * (-50998291));
        long j36 = (jDecode25 - (j19 * (-50998291))) - (j29 * 19280294);
        long j37 = j25 - (j29 * 127719000);
        long j38 = j26 - (j29 * (-6428113));
        long j39 = j27 - (j29 * 5343);
        long j45 = (jDecode37 & M28L) + (j15 >> 28);
        long j46 = jDecode28 & M28L;
        long j47 = jDecode24 - (j45 * (-50998291));
        long j48 = j35 - (j45 * 19280294);
        long j49 = j36 - (j45 * 127719000);
        long j55 = j37 - (j45 * (-6428113));
        long j56 = j38 - (j45 * 5343);
        long j57 = j18 + (j28 >> 28);
        long j58 = j28 & M28L;
        long j59 = j46 + (j57 >> 28);
        long j65 = j57 & M28L;
        long j66 = j65 >>> 27;
        long j67 = j59 + j66;
        long j68 = jDecode32 - (j67 * (-50998291));
        long j69 = j48 - (j67 * 127719000);
        long j75 = j49 - (j67 * (-6428113));
        long j76 = j55 - (j67 * 5343);
        long j77 = (j47 - (j67 * 19280294)) + (j68 >> 28);
        long j78 = j68 & M28L;
        long j79 = j69 + (j77 >> 28);
        long j85 = j77 & M28L;
        long j86 = j75 + (j79 >> 28);
        long j87 = j79 & M28L;
        long j88 = j76 + (j86 >> 28);
        long j89 = j86 & M28L;
        long j95 = j56 + (j88 >> 28);
        long j96 = j88 & M28L;
        long j97 = j39 + (j95 >> 28);
        long j98 = j95 & M28L;
        long j99 = j58 + (j97 >> 28);
        long j100 = j97 & M28L;
        long j101 = j65 + (j99 >> 28);
        long j102 = j99 & M28L;
        long j103 = j101 >> 28;
        long j104 = j101 & M28L;
        long j105 = j103 - j66;
        long j106 = j78 + (j105 & (-50998291));
        long j107 = j85 + (j105 & 19280294) + (j106 >> 28);
        long j108 = j106 & M28L;
        long j109 = j87 + (j105 & 127719000) + (j107 >> 28);
        long j110 = j107 & M28L;
        long j111 = j89 + (j105 & (-6428113)) + (j109 >> 28);
        long j112 = j109 & M28L;
        long j113 = j96 + (j105 & 5343) + (j111 >> 28);
        long j114 = j111 & M28L;
        long j115 = j98 + (j113 >> 28);
        long j116 = j113 & M28L;
        long j117 = j100 + (j115 >> 28);
        long j118 = j115 & M28L;
        long j119 = j102 + (j117 >> 28);
        long j120 = j117 & M28L;
        long j121 = j104 + (j119 >> 28);
        long j122 = M28L & j119;
        byte[] bArr2 = new byte[64];
        Codec.encode56(j108 | (j110 << 28), bArr2, 0);
        Codec.encode56(j112 | (j114 << 28), bArr2, 7);
        Codec.encode56((j118 << 28) | j116, bArr2, 14);
        Codec.encode56((j122 << 28) | j120, bArr2, 21);
        Codec.encode32((int) j121, bArr2, 28);
        return bArr2;
    }

    static byte[] reduce512(byte[] bArr) {
        long jDecode32 = ((long) Codec.decode32(bArr, 0)) & 4294967295L;
        long jDecode24 = ((long) (Codec.decode24(bArr, 4) << 4)) & 4294967295L;
        long jDecode33 = ((long) Codec.decode32(bArr, 7)) & 4294967295L;
        long jDecode25 = ((long) (Codec.decode24(bArr, 11) << 4)) & 4294967295L;
        long jDecode34 = ((long) Codec.decode32(bArr, 14)) & 4294967295L;
        long jDecode26 = ((long) (Codec.decode24(bArr, 18) << 4)) & 4294967295L;
        long jDecode35 = ((long) Codec.decode32(bArr, 21)) & 4294967295L;
        long jDecode27 = ((long) (Codec.decode24(bArr, 25) << 4)) & 4294967295L;
        long jDecode36 = ((long) Codec.decode32(bArr, 28)) & 4294967295L;
        long jDecode28 = ((long) (Codec.decode24(bArr, 32) << 4)) & 4294967295L;
        long jDecode37 = ((long) Codec.decode32(bArr, 35)) & 4294967295L;
        long jDecode29 = ((long) (Codec.decode24(bArr, 39) << 4)) & 4294967295L;
        long jDecode38 = ((long) Codec.decode32(bArr, 42)) & 4294967295L;
        long jDecode210 = ((long) (Codec.decode24(bArr, 46) << 4)) & 4294967295L;
        long jDecode39 = Codec.decode32(bArr, 49);
        long j15 = jDecode39 & 4294967295L;
        long jDecode211 = ((long) (Codec.decode24(bArr, 53) << 4)) & 4294967295L;
        long jDecode310 = Codec.decode32(bArr, 56);
        long jDecode212 = ((long) (Codec.decode24(bArr, 60) << 4)) & 4294967295L;
        long j16 = ((long) bArr[63]) & M08L;
        long j17 = jDecode212 + ((jDecode310 & 4294967295L) >> 28);
        long j18 = jDecode310 & M28L;
        long j19 = (jDecode38 - (j16 * (-6428113))) - (j17 * 5343);
        long j25 = (jDecode36 - (j17 * (-50998291))) - (j18 * 19280294);
        long j26 = ((jDecode28 - (j16 * (-50998291))) - (j17 * 19280294)) - (j18 * 127719000);
        long j27 = ((jDecode37 - (j16 * 19280294)) - (j17 * 127719000)) - (j18 * (-6428113));
        long j28 = ((jDecode29 - (j16 * 127719000)) - (j17 * (-6428113))) - (j18 * 5343);
        long j29 = jDecode211 + (j15 >> 28);
        long j35 = jDecode39 & M28L;
        long j36 = j27 - (j29 * 5343);
        long j37 = (j26 - (j29 * (-6428113))) - (j35 * 5343);
        long j38 = (jDecode210 - (j16 * 5343)) + (j19 >> 28);
        long j39 = ((jDecode35 - (j29 * (-50998291))) - (j35 * 19280294)) - (j38 * 127719000);
        long j45 = (((jDecode27 - (j18 * (-50998291))) - (j29 * 19280294)) - (j35 * 127719000)) - (j38 * (-6428113));
        long j46 = ((j25 - (j29 * 127719000)) - (j35 * (-6428113))) - (j38 * 5343);
        long j47 = (j19 & M28L) + (j28 >> 28);
        long j48 = (jDecode34 - (j38 * (-50998291))) - (j47 * 19280294);
        long j49 = ((jDecode26 - (j35 * (-50998291))) - (j38 * 19280294)) - (j47 * 127719000);
        long j55 = j45 - (j47 * 5343);
        long j56 = (j28 & M28L) + (j36 >> 28);
        long j57 = jDecode33 - (j56 * (-50998291));
        long j58 = (jDecode25 - (j47 * (-50998291))) - (j56 * 19280294);
        long j59 = j48 - (j56 * 127719000);
        long j65 = j49 - (j56 * (-6428113));
        long j66 = (j39 - (j47 * (-6428113))) - (j56 * 5343);
        long j67 = (j36 & M28L) + (j37 >> 28);
        long j68 = j37 & M28L;
        long j69 = jDecode24 - (j67 * (-50998291));
        long j75 = j57 - (j67 * 19280294);
        long j76 = j58 - (j67 * 127719000);
        long j77 = j59 - (j67 * (-6428113));
        long j78 = j65 - (j67 * 5343);
        long j79 = j46 + (j55 >> 28);
        long j85 = j55 & M28L;
        long j86 = j68 + (j79 >> 28);
        long j87 = j79 & M28L;
        long j88 = j87 >>> 27;
        long j89 = j86 + j88;
        long j95 = jDecode32 - (j89 * (-50998291));
        long j96 = j75 - (j89 * 127719000);
        long j97 = j76 - (j89 * (-6428113));
        long j98 = j77 - (j89 * 5343);
        long j99 = (j69 - (j89 * 19280294)) + (j95 >> 28);
        long j100 = j95 & M28L;
        long j101 = j96 + (j99 >> 28);
        long j102 = j99 & M28L;
        long j103 = j97 + (j101 >> 28);
        long j104 = j101 & M28L;
        long j105 = j98 + (j103 >> 28);
        long j106 = j103 & M28L;
        long j107 = j78 + (j105 >> 28);
        long j108 = j105 & M28L;
        long j109 = j66 + (j107 >> 28);
        long j110 = j107 & M28L;
        long j111 = j85 + (j109 >> 28);
        long j112 = j109 & M28L;
        long j113 = j87 + (j111 >> 28);
        long j114 = j111 & M28L;
        long j115 = j113 >> 28;
        long j116 = j113 & M28L;
        long j117 = j115 - j88;
        long j118 = j100 + (j117 & (-50998291));
        long j119 = j102 + (j117 & 19280294) + (j118 >> 28);
        long j120 = j118 & M28L;
        long j121 = j104 + (j117 & 127719000) + (j119 >> 28);
        long j122 = j119 & M28L;
        long j123 = j106 + (j117 & (-6428113)) + (j121 >> 28);
        long j124 = j121 & M28L;
        long j125 = j108 + (j117 & 5343) + (j123 >> 28);
        long j126 = j123 & M28L;
        long j127 = j110 + (j125 >> 28);
        long j128 = j125 & M28L;
        long j129 = j112 + (j127 >> 28);
        long j130 = j127 & M28L;
        long j131 = j114 + (j129 >> 28);
        long j132 = j129 & M28L;
        long j133 = j116 + (j131 >> 28);
        long j134 = j131 & M28L;
        byte[] bArr2 = new byte[32];
        Codec.encode56(j120 | (j122 << 28), bArr2, 0);
        Codec.encode56(j124 | (j126 << 28), bArr2, 7);
        Codec.encode56((j130 << 28) | j128, bArr2, 14);
        Codec.encode56((j134 << 28) | j132, bArr2, 21);
        Codec.encode32((int) j133, bArr2, 28);
        return bArr2;
    }

    static boolean reduceBasisVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        System.arraycopy(LSq, 0, iArr4, 0, 16);
        int[] iArr5 = new int[16];
        Nat256.square(iArr, iArr5);
        iArr5[0] = iArr5[0] + 1;
        int[] iArr6 = new int[16];
        int[] iArr7 = L;
        Nat256.mul(iArr7, iArr, iArr6);
        int[] iArr8 = new int[16];
        int[] iArr9 = new int[4];
        System.arraycopy(iArr7, 0, iArr9, 0, 4);
        int[] iArr10 = new int[4];
        System.arraycopy(iArr, 0, iArr10, 0, 4);
        int[] iArr11 = new int[4];
        iArr11[0] = 1;
        int i15 = 1016;
        int[] iArr12 = iArr11;
        int[] iArr13 = new int[4];
        int[] iArr14 = iArr9;
        int[] iArr15 = iArr10;
        int i16 = 15;
        int bitLengthPositive = ScalarUtil.getBitLengthPositive(15, iArr5);
        int[] iArr16 = iArr4;
        int[] iArr17 = iArr5;
        while (bitLengthPositive > TARGET_LENGTH) {
            i15--;
            if (i15 < 0) {
                return false;
            }
            int bitLength = ScalarUtil.getBitLength(i16, iArr6) - bitLengthPositive;
            int i17 = bitLength & (~(bitLength >> 31));
            if (iArr6[i16] < 0) {
                ScalarUtil.addShifted_NP(i16, i17, iArr16, iArr17, iArr6, iArr8);
                ScalarUtil.addShifted_UV(3, i17, iArr14, iArr13, iArr15, iArr12);
            } else {
                ScalarUtil.subShifted_NP(i16, i17, iArr16, iArr17, iArr6, iArr8);
                ScalarUtil.subShifted_UV(3, i17, iArr14, iArr13, iArr15, iArr12);
            }
            int[] iArr18 = iArr15;
            int[] iArr19 = iArr12;
            if (ScalarUtil.lessThan(i16, iArr16, iArr17)) {
                int i18 = bitLengthPositive >>> 5;
                int bitLengthPositive2 = ScalarUtil.getBitLengthPositive(i18, iArr16);
                int[] iArr20 = iArr17;
                iArr17 = iArr16;
                iArr16 = iArr20;
                i16 = i18;
                bitLengthPositive = bitLengthPositive2;
                iArr15 = iArr14;
                iArr12 = iArr13;
                iArr13 = iArr19;
                iArr14 = iArr18;
            } else {
                iArr12 = iArr19;
                iArr15 = iArr18;
            }
        }
        System.arraycopy(iArr15, 0, iArr2, 0, 4);
        System.arraycopy(iArr12, 0, iArr3, 0, 4);
        return true;
    }

    static void toSignedDigits(int i15, int[] iArr) {
        Nat.caddTo(8, (~iArr[0]) & 1, L, iArr);
        Nat.shiftDownBit(8, iArr, 1);
    }
}
