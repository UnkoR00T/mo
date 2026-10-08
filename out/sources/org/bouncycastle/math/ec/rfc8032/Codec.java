package org.bouncycastle.math.ec.rfc8032;

/* JADX INFO: loaded from: classes5.dex */
abstract class Codec {
    Codec() {
    }

    static int decode16(byte[] bArr, int i15) {
        return ((bArr[i15 + 1] & 255) << 8) | (bArr[i15] & 255);
    }

    static int decode24(byte[] bArr, int i15) {
        return ((bArr[i15 + 2] & 255) << 16) | (bArr[i15] & 255) | ((bArr[i15 + 1] & 255) << 8);
    }

    static int decode32(byte[] bArr, int i15) {
        return (bArr[i15 + 3] << 24) | (bArr[i15] & 255) | ((bArr[i15 + 1] & 255) << 8) | ((bArr[i15 + 2] & 255) << 16);
    }

    static void encode24(int i15, byte[] bArr, int i16) {
        bArr[i16] = (byte) i15;
        bArr[i16 + 1] = (byte) (i15 >>> 8);
        bArr[i16 + 2] = (byte) (i15 >>> 16);
    }

    static void encode32(int i15, byte[] bArr, int i16) {
        bArr[i16] = (byte) i15;
        bArr[i16 + 1] = (byte) (i15 >>> 8);
        bArr[i16 + 2] = (byte) (i15 >>> 16);
        bArr[i16 + 3] = (byte) (i15 >>> 24);
    }

    static void encode56(long j15, byte[] bArr, int i15) {
        encode32((int) j15, bArr, i15);
        encode24((int) (j15 >>> 32), bArr, i15 + 4);
    }

    static void decode32(byte[] bArr, int i15, int[] iArr, int i16, int i17) {
        for (int i18 = 0; i18 < i17; i18++) {
            iArr[i16 + i18] = decode32(bArr, (i18 * 4) + i15);
        }
    }

    static void encode32(int[] iArr, int i15, int i16, byte[] bArr, int i17) {
        for (int i18 = 0; i18 < i16; i18++) {
            encode32(iArr[i15 + i18], bArr, (i18 * 4) + i17);
        }
    }
}
