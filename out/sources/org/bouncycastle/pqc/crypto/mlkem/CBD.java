package org.bouncycastle.pqc.crypto.mlkem;

/* JADX INFO: loaded from: classes5.dex */
final class CBD {
    CBD() {
    }

    private static long convertByteTo24BitUnsignedInt(byte[] bArr, int i15) {
        return (((long) (bArr[i15 + 2] & 255)) << 16) | ((long) (bArr[i15] & 255)) | (((long) (bArr[i15 + 1] & 255)) << 8);
    }

    private static long convertByteTo32BitUnsignedInt(byte[] bArr, int i15) {
        return (((long) (bArr[i15 + 3] & 255)) << 24) | ((long) (bArr[i15] & 255)) | (((long) (bArr[i15 + 1] & 255)) << 8) | (((long) (bArr[i15 + 2] & 255)) << 16);
    }

    public static void mlkemCBD(Poly poly, byte[] bArr, int i15) {
        if (i15 != 3) {
            for (int i16 = 0; i16 < 32; i16++) {
                long jConvertByteTo32BitUnsignedInt = convertByteTo32BitUnsignedInt(bArr, i16 * 4);
                long j15 = (jConvertByteTo32BitUnsignedInt & 1431655765) + ((jConvertByteTo32BitUnsignedInt >> 1) & 1431655765);
                for (int i17 = 0; i17 < 8; i17++) {
                    int i18 = i17 * 4;
                    poly.setCoeffIndex((i16 * 8) + i17, (short) (((short) ((j15 >> i18) & 3)) - ((short) (3 & (j15 >> (i18 + i15))))));
                }
            }
            return;
        }
        for (int i19 = 0; i19 < 64; i19++) {
            long jConvertByteTo24BitUnsignedInt = convertByteTo24BitUnsignedInt(bArr, i19 * 3);
            long j16 = (jConvertByteTo24BitUnsignedInt & 2396745) + ((jConvertByteTo24BitUnsignedInt >> 1) & 2396745) + ((jConvertByteTo24BitUnsignedInt >> 2) & 2396745);
            for (int i25 = 0; i25 < 4; i25++) {
                int i26 = i25 * 6;
                poly.setCoeffIndex((i19 * 4) + i25, (short) (((short) ((j16 >> i26) & 7)) - ((short) (7 & (j16 >> (i26 + 3))))));
            }
        }
    }
}
