package org.bouncycastle.util.encoders;

/* JADX INFO: loaded from: classes5.dex */
public class HexTranslator implements Translator {
    private static final byte[] hexTable = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    @Override // org.bouncycastle.util.encoders.Translator
    public int decode(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
        int i18 = i16 / 2;
        for (int i19 = 0; i19 < i18; i19++) {
            int i25 = (i19 * 2) + i15;
            byte b15 = bArr[i25];
            byte b16 = bArr[i25 + 1];
            if (b15 < 97) {
                bArr2[i17] = (byte) ((b15 - 48) << 4);
            } else {
                bArr2[i17] = (byte) ((b15 - 87) << 4);
            }
            if (b16 < 97) {
                bArr2[i17] = (byte) (bArr2[i17] + ((byte) (b16 - 48)));
            } else {
                bArr2[i17] = (byte) (bArr2[i17] + ((byte) (b16 - 87)));
            }
            i17++;
        }
        return i18;
    }

    @Override // org.bouncycastle.util.encoders.Translator
    public int encode(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
        int i18 = 0;
        int i19 = 0;
        while (i18 < i16) {
            int i25 = i17 + i19;
            byte[] bArr3 = hexTable;
            bArr2[i25] = bArr3[(bArr[i15] >> 4) & 15];
            bArr2[i25 + 1] = bArr3[bArr[i15] & 15];
            i15++;
            i18++;
            i19 += 2;
        }
        return i16 * 2;
    }

    @Override // org.bouncycastle.util.encoders.Translator
    public int getDecodedBlockSize() {
        return 1;
    }

    @Override // org.bouncycastle.util.encoders.Translator
    public int getEncodedBlockSize() {
        return 2;
    }
}
