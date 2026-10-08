package org.bouncycastle.pqc.crypto.snova;

import org.bouncycastle.util.GF16;

/* JADX INFO: loaded from: classes5.dex */
class GF16Utils {
    private static final int GF16_MASK = 585;

    GF16Utils() {
    }

    static int ctGF16IsNotZero(byte b15) {
        int i15 = b15 & 255;
        return ((i15 >>> 3) | (i15 >>> 1) | i15 | (i15 >>> 2)) & 1;
    }

    static void decodeMergeInHalf(byte[] bArr, byte[] bArr2, int i15) {
        int i16 = (i15 + 1) >>> 1;
        for (int i17 = 0; i17 < i16; i17++) {
            bArr2[i17] = (byte) (bArr[i17] & 15);
            bArr2[i17 + i16] = (byte) ((bArr[i17] >>> 4) & 15);
        }
    }

    static void encodeMergeInHalf(byte[] bArr, int i15, byte[] bArr2) {
        int i16 = (i15 + 1) >>> 1;
        int i17 = 0;
        while (i17 < i15 / 2) {
            bArr2[i17] = (byte) (bArr[i17] | (bArr[i16] << 4));
            i17++;
            i16++;
        }
        if ((i15 & 1) == 1) {
            bArr2[i17] = bArr[i17];
        }
    }

    static int gf16FromNibble(int i15) {
        int i16 = i15 | (i15 << 4);
        return ((i16 << 2) & 520) | (i16 & 65);
    }

    private static int gf16Reduce(int i15) {
        int i16 = 1227133513 & i15;
        int i17 = i15 >>> 12;
        int i18 = (i17 ^ (i17 << 3)) ^ i16;
        int i19 = i18 >>> 12;
        int i25 = i18 ^ (i19 ^ (i19 << 3));
        int i26 = i25 >>> 12;
        return (i25 ^ (i26 ^ (i26 << 3))) & GF16_MASK;
    }

    static byte gf16ToNibble(int i15) {
        int iGf16Reduce = gf16Reduce(i15);
        int i16 = iGf16Reduce | (iGf16Reduce >>> 4);
        return (byte) (((i16 >>> 2) & 10) | (i16 & 5));
    }

    static void gf16mMul(byte[] bArr, byte[] bArr2, byte[] bArr3, int i15) {
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < i15) {
            int i19 = 0;
            while (i19 < i15) {
                bArr3[i18] = GF16.innerProduct(bArr, i17, bArr2, i19, i15);
                i19++;
                i18++;
            }
            i16++;
            i17 += i15;
        }
    }

    static void gf16mMulMul(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i15) {
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < i15) {
            for (int i19 = 0; i19 < i15; i19++) {
                bArr4[i19] = GF16.innerProduct(bArr, i17, bArr2, i19, i15);
            }
            int i25 = 0;
            while (i25 < i15) {
                bArr5[i18] = GF16.innerProduct(bArr4, 0, bArr3, i25, i15);
                i25++;
                i18++;
            }
            i16++;
            i17 += i15;
        }
    }

    static void gf16mMulMulTo(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i15) {
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < i15) {
            for (int i19 = 0; i19 < i15; i19++) {
                bArr4[i19] = GF16.innerProduct(bArr, i17, bArr2, i19, i15);
            }
            int i25 = 0;
            while (i25 < i15) {
                bArr5[i18] = (byte) (bArr5[i18] ^ GF16.innerProduct(bArr4, 0, bArr3, i25, i15));
                i25++;
                i18++;
            }
            i16++;
            i17 += i15;
        }
    }

    static void gf16mMulTo(byte[] bArr, byte[] bArr2, int i15, byte[] bArr3, int i16, int i17) {
        int i18 = 0;
        int i19 = 0;
        while (i18 < i17) {
            int i25 = 0;
            while (i25 < i17) {
                bArr3[i16] = (byte) (bArr3[i16] ^ GF16.innerProduct(bArr, i19, bArr2, i15 + i25, i17));
                i25++;
                i16++;
            }
            i18++;
            i19 += i17;
        }
    }

    static void gf16mMulToTo(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i15) {
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < i15) {
            int i19 = 0;
            while (i19 < i15) {
                bArr4[i18] = (byte) (bArr4[i18] ^ GF16.innerProduct(bArr, i17, bArr2, i19, i15));
                bArr5[i18] = (byte) (bArr5[i18] ^ GF16.innerProduct(bArr2, i17, bArr3, i19, i15));
                i19++;
                i18++;
            }
            i16++;
            i17 += i15;
        }
    }

    static void gf16mTranMulMul(byte[] bArr, int i15, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, int i16) {
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < i16) {
            for (int i25 = 0; i25 < i16; i25++) {
                int i26 = i15 + i25;
                int i27 = 0;
                byte bMul = 0;
                int i28 = i17;
                while (i27 < i16) {
                    bMul = (byte) (bMul ^ GF16.mul(bArr[i26], bArr4[i28]));
                    i27++;
                    i26 += i16;
                    i28 += i16;
                }
                bArr6[i25] = bMul;
            }
            int i29 = 0;
            int i35 = 0;
            while (i29 < i16) {
                byte bMul2 = 0;
                for (int i36 = 0; i36 < i16; i36++) {
                    bMul2 = (byte) (bMul2 ^ GF16.mul(bArr2[i35 + i36], bArr6[i36]));
                }
                bArr7[i17 + i35] = bMul2;
                i29++;
                i35 += i16;
            }
            for (int i37 = 0; i37 < i16; i37++) {
                bArr6[i37] = GF16.innerProduct(bArr5, i18, bArr, i15 + i37, i16);
            }
            int i38 = 0;
            while (i38 < i16) {
                bArr8[i19] = GF16.innerProduct(bArr6, 0, bArr3, i38, i16);
                i38++;
                i19++;
            }
            i17++;
            i18 += i16;
        }
    }

    static void gf16mMulTo(byte[] bArr, byte[] bArr2, byte[] bArr3, int i15) {
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < i15) {
            int i19 = 0;
            while (i19 < i15) {
                bArr3[i18] = (byte) (bArr3[i18] ^ GF16.innerProduct(bArr, i17, bArr2, i19, i15));
                i19++;
                i18++;
            }
            i16++;
            i17 += i15;
        }
    }

    static void gf16mMulTo(byte[] bArr, byte[] bArr2, byte[] bArr3, int i15, int i16) {
        int i17 = 0;
        int i18 = 0;
        while (i17 < i16) {
            int i19 = 0;
            while (i19 < i16) {
                bArr3[i15] = (byte) (bArr3[i15] ^ GF16.innerProduct(bArr, i18, bArr2, i19, i16));
                i19++;
                i15++;
            }
            i17++;
            i18 += i16;
        }
    }

    static void gf16mMulTo(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i15, int i16) {
        int i17 = 0;
        int i18 = 0;
        while (i17 < i16) {
            int i19 = 0;
            while (i19 < i16) {
                bArr5[i15] = (byte) (bArr5[i15] ^ (GF16.innerProduct(bArr, i18, bArr2, i19, i16) ^ GF16.innerProduct(bArr3, i18, bArr4, i19, i16)));
                i19++;
                i15++;
            }
            i17++;
            i18 += i16;
        }
    }
}
