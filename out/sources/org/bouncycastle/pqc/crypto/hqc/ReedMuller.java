package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class ReedMuller {

    static class Codeword {
        int[] type32 = new int[4];
        int[] type8 = new int[16];
    }

    ReedMuller() {
    }

    private static int Bit0Mask(int i15) {
        return -(i15 & 1);
    }

    private static void CopyCWD(long[] jArr, Codeword[] codewordArr) {
        int[] iArr = new int[codewordArr.length * 4];
        int i15 = 0;
        for (Codeword codeword : codewordArr) {
            int[] iArr2 = codeword.type32;
            System.arraycopy(iArr2, 0, iArr, i15, iArr2.length);
            i15 += 4;
        }
        Utils.fromByte32ArrayToLongArray(jArr, iArr);
    }

    public static void decode(byte[] bArr, long[] jArr, int i15, int i16) {
        byte[] bArrClone = Arrays.clone(bArr);
        int length = jArr.length / 2;
        Codeword[] codewordArr = new Codeword[length];
        int[] iArr = new int[jArr.length * 2];
        Utils.fromLongArrayToByte32Array(iArr, jArr);
        for (int i17 = 0; i17 < length; i17++) {
            Codeword codeword = new Codeword();
            codewordArr[i17] = codeword;
            System.arraycopy(iArr, i17 * 4, codeword.type32, 0, 4);
        }
        int[] iArr2 = new int[128];
        int[] iArr3 = new int[128];
        for (int i18 = 0; i18 < i15; i18++) {
            expandThenSum(iArr2, codewordArr, i18 * i16, i16);
            hadamardTransform(iArr2, iArr3);
            iArr3[0] = iArr3[0] - (i16 * 64);
            bArrClone[i18] = (byte) findPeaks(iArr3);
        }
        CopyCWD(jArr, codewordArr);
        System.arraycopy(bArrClone, 0, bArr, 0, bArr.length);
    }

    public static void encode(long[] jArr, byte[] bArr, int i15, int i16) {
        byte[] bArrClone = Arrays.clone(bArr);
        int i17 = i15 * i16;
        Codeword[] codewordArr = new Codeword[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            codewordArr[i18] = new Codeword();
        }
        for (int i19 = 0; i19 < i15; i19++) {
            int i25 = i19 * i16;
            encodeSub(codewordArr[i25], bArrClone[i19]);
            for (int i26 = 1; i26 < i16; i26++) {
                codewordArr[i25 + i26] = codewordArr[i25];
            }
        }
        CopyCWD(jArr, codewordArr);
    }

    static void encodeSub(Codeword codeword, int i15) {
        int iBit0Mask = ((((Bit0Mask(i15 >> 7) ^ (Bit0Mask(i15) & (-1431655766))) ^ (Bit0Mask(i15 >> 1) & (-858993460))) ^ (Bit0Mask(i15 >> 2) & (-252645136))) ^ (Bit0Mask(i15 >> 3) & (-16711936))) ^ (Bit0Mask(i15 >> 4) & (-65536));
        codeword.type32[0] = iBit0Mask;
        int i16 = i15 >> 5;
        int iBit0Mask2 = iBit0Mask ^ Bit0Mask(i16);
        codeword.type32[1] = iBit0Mask2;
        int iBit0Mask3 = Bit0Mask(i15 >> 6) ^ iBit0Mask2;
        codeword.type32[3] = iBit0Mask3;
        codeword.type32[2] = iBit0Mask3 ^ Bit0Mask(i16);
    }

    private static void expandThenSum(int[] iArr, Codeword[] codewordArr, int i15, int i16) {
        for (int i17 = 0; i17 < 4; i17++) {
            for (int i18 = 0; i18 < 32; i18++) {
                iArr[(i17 * 32) + i18] = (codewordArr[i15].type32[i17] >> i18) & 1;
            }
        }
        for (int i19 = 1; i19 < i16; i19++) {
            for (int i25 = 0; i25 < 4; i25++) {
                for (int i26 = 0; i26 < 32; i26++) {
                    int i27 = (i25 * 32) + i26;
                    iArr[i27] = iArr[i27] + ((codewordArr[i19 + i15].type32[i25] >> i26) & 1);
                }
            }
        }
    }

    private static int findPeaks(int[] iArr) {
        int i15 = 0;
        int i16 = 0;
        int iMax = 0;
        for (int i17 = 0; i17 < 128; i17++) {
            int i18 = iArr[i17];
            int i19 = i18 > 0 ? -1 : 0;
            int i25 = ((~i19) & (-i18)) | (i19 & i18);
            if (i25 > iMax) {
                i15 = i18;
            }
            if (i25 > iMax) {
                i16 = i17;
            }
            iMax = Math.max(i25, iMax);
        }
        return i16 | ((i15 > 0 ? 1 : 0) * 128);
    }

    private static void hadamardTransform(int[] iArr, int[] iArr2) {
        int[] iArrClone = Arrays.clone(iArr);
        int[] iArrClone2 = Arrays.clone(iArr2);
        int i15 = 0;
        while (i15 < 7) {
            for (int i16 = 0; i16 < 64; i16++) {
                int i17 = i16 * 2;
                int i18 = i17 + 1;
                iArrClone2[i16] = iArrClone[i17] + iArrClone[i18];
                iArrClone2[i16 + 64] = iArrClone[i17] - iArrClone[i18];
            }
            i15++;
            int[] iArr3 = iArrClone;
            iArrClone = iArrClone2;
            iArrClone2 = iArr3;
        }
        System.arraycopy(iArrClone2, 0, iArr, 0, iArr.length);
        System.arraycopy(iArrClone, 0, iArr2, 0, iArr2.length);
    }
}
