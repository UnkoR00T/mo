package org.bouncycastle.util;

/* JADX INFO: loaded from: classes5.dex */
public class Bytes {
    public static final int BYTES = 1;
    public static final int SIZE = 8;

    public static void xor(int i15, byte[] bArr, int i16, byte[] bArr2, int i17, byte[] bArr3, int i18) {
        for (int i19 = 0; i19 < i15; i19++) {
            bArr3[i18 + i19] = (byte) (bArr[i16 + i19] ^ bArr2[i17 + i19]);
        }
    }

    public static void xorTo(int i15, byte[] bArr, int i16, byte[] bArr2) {
        int i17 = 0;
        while (i17 < i15) {
            bArr2[i17] = (byte) (bArr[i16] ^ bArr2[i17]);
            i17++;
            i16++;
        }
    }

    public static void xor(int i15, byte[] bArr, int i16, byte[] bArr2, byte[] bArr3, int i17) {
        int i18 = 0;
        while (i18 < i15) {
            bArr3[i17] = (byte) (bArr[i16] ^ bArr2[i18]);
            i18++;
            i17++;
            i16++;
        }
    }

    public static void xorTo(int i15, byte[] bArr, int i16, byte[] bArr2, int i17) {
        for (int i18 = 0; i18 < i15; i18++) {
            int i19 = i17 + i18;
            bArr2[i19] = (byte) (bArr2[i19] ^ bArr[i16 + i18]);
        }
    }

    public static void xor(int i15, byte[] bArr, byte[] bArr2, int i16, byte[] bArr3, int i17) {
        int i18 = 0;
        while (i18 < i15) {
            bArr3[i17] = (byte) (bArr2[i16] ^ bArr[i18]);
            i18++;
            i17++;
            i16++;
        }
    }

    public static void xorTo(int i15, byte[] bArr, byte[] bArr2) {
        for (int i16 = 0; i16 < i15; i16++) {
            bArr2[i16] = (byte) (bArr2[i16] ^ bArr[i16]);
        }
    }

    public static void xor(int i15, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        for (int i16 = 0; i16 < i15; i16++) {
            bArr3[i16] = (byte) (bArr[i16] ^ bArr2[i16]);
        }
    }

    public static void xor(int i15, byte[] bArr, byte[] bArr2, byte[] bArr3, int i16) {
        int i17 = 0;
        while (i17 < i15) {
            bArr3[i16] = (byte) (bArr[i17] ^ bArr2[i17]);
            i17++;
            i16++;
        }
    }
}
