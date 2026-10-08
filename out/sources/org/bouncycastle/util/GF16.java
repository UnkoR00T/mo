package org.bouncycastle.util;

/* JADX INFO: loaded from: classes5.dex */
public class GF16 {
    private static final byte[] F_STAR = {1, 2, 4, 8, 3, 6, 12, 11, 5, 10, 7, 14, 15, 13, 9};
    private static final byte[] MT4B = new byte[256];
    private static final byte[] INV4B = new byte[16];

    static {
        for (int i15 = 0; i15 < 15; i15++) {
            for (int i16 = 0; i16 < 15; i16++) {
                byte[] bArr = MT4B;
                byte[] bArr2 = F_STAR;
                bArr[(bArr2[i15] << 4) ^ bArr2[i16]] = bArr2[(i15 + i16) % 15];
            }
        }
        byte[] bArr3 = F_STAR;
        byte bMt = 1;
        byte b15 = bArr3[1];
        byte b16 = bArr3[14];
        INV4B[1] = 1;
        byte bMt2 = 1;
        for (int i17 = 0; i17 < 14; i17++) {
            bMt = mt(bMt, b15);
            bMt2 = mt(bMt2, b16);
            INV4B[bMt] = bMt2;
        }
    }

    public static void decode(byte[] bArr, int i15, byte[] bArr2, int i16, int i17) {
        int i18 = i17 >> 1;
        int i19 = 0;
        while (i19 < i18) {
            int i25 = i16 + 1;
            bArr2[i16] = (byte) (bArr[i15] & 15);
            i16 += 2;
            bArr2[i25] = (byte) ((bArr[i15] >>> 4) & 15);
            i19++;
            i15++;
        }
        if ((i17 & 1) == 1) {
            bArr2[i16] = (byte) (bArr[i15] & 15);
        }
    }

    public static void encode(byte[] bArr, byte[] bArr2, int i15) {
        int i16 = i15 >> 1;
        int i17 = 0;
        int i18 = 0;
        while (i17 < i16) {
            int i19 = i18 + 1;
            int i25 = bArr[i18] & 15;
            i18 += 2;
            bArr2[i17] = (byte) (((bArr[i19] & 15) << 4) | i25);
            i17++;
        }
        if ((i15 & 1) == 1) {
            bArr2[i17] = (byte) (bArr[i18] & 15);
        }
    }

    public static byte innerProduct(byte[] bArr, int i15, byte[] bArr2, int i16, int i17) {
        int i18 = 0;
        byte bMul = 0;
        while (i18 < i17) {
            bMul = (byte) (mul(bArr[i15], bArr2[i16]) ^ bMul);
            i18++;
            i16 += i17;
            i15++;
        }
        return bMul;
    }

    public static byte inv(byte b15) {
        return INV4B[b15 & 15];
    }

    static byte mt(int i15, int i16) {
        return MT4B[(i15 << 4) ^ i16];
    }

    public static byte mul(byte b15, byte b16) {
        return MT4B[(b15 << 4) | b16];
    }

    public static void decode(byte[] bArr, byte[] bArr2, int i15) {
        int i16 = i15 >> 1;
        int i17 = 0;
        int i18 = 0;
        while (i17 < i16) {
            int i19 = i18 + 1;
            bArr2[i18] = (byte) (bArr[i17] & 15);
            i18 += 2;
            bArr2[i19] = (byte) ((bArr[i17] >>> 4) & 15);
            i17++;
        }
        if ((i15 & 1) == 1) {
            bArr2[i18] = (byte) (bArr[i17] & 15);
        }
    }

    public static void encode(byte[] bArr, byte[] bArr2, int i15, int i16) {
        int i17 = i16 >> 1;
        int i18 = 0;
        int i19 = 0;
        while (i18 < i17) {
            int i25 = i19 + 1;
            int i26 = bArr[i19] & 15;
            i19 += 2;
            bArr2[i15] = (byte) (((bArr[i25] & 15) << 4) | i26);
            i18++;
            i15++;
        }
        if ((i16 & 1) == 1) {
            bArr2[i15] = (byte) (bArr[i19] & 15);
        }
    }

    public static int mul(int i15, int i16) {
        return MT4B[(i15 << 4) | i16];
    }
}
