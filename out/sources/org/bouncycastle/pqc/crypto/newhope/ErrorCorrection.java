package org.bouncycastle.pqc.crypto.newhope;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class ErrorCorrection {
    ErrorCorrection() {
    }

    static short LDDecode(int i15, int i16, int i17, int i18) {
        return (short) (((((g(i15) + g(i16)) + g(i17)) + g(i18)) - 98312) >>> 31);
    }

    static int abs(int i15) {
        int i16 = i15 >> 31;
        return (i15 ^ i16) - i16;
    }

    static int f(int[] iArr, int i15, int i16, int i17) {
        int i18 = (i17 * 2730) >> 25;
        int i19 = i18 - ((12288 - (i17 - (i18 * 12289))) >> 31);
        iArr[i15] = (i19 >> 1) + (i19 & 1);
        int i25 = i19 - 1;
        iArr[i16] = (i25 >> 1) + (i25 & 1);
        return abs(i17 - (iArr[i15] * 24578));
    }

    static int g(int i15) {
        int i16 = (i15 * 2730) >> 27;
        int i17 = i16 - ((49155 - (i15 - (49156 * i16))) >> 31);
        return abs((((i17 >> 1) + (i17 & 1)) * 98312) - i15);
    }

    static void helpRec(short[] sArr, short[] sArr2, byte[] bArr, byte b15) {
        short s15 = 8;
        byte[] bArr2 = new byte[8];
        bArr2[0] = b15;
        byte[] bArr3 = new byte[32];
        ChaCha20.process(bArr, bArr2, bArr3, 0, 32);
        int[] iArr = new int[8];
        int i15 = 0;
        while (i15 < 256) {
            int i16 = ((bArr3[i15 >>> 3] >>> (i15 & 7)) & 1) * 4;
            int i17 = i15 + 256;
            int i18 = i15 + 512;
            int i19 = i15 + 768;
            int iF = (24577 - (((f(iArr, 0, 4, (sArr2[i15] * s15) + i16) + f(iArr, 1, 5, (sArr2[i17] * s15) + i16)) + f(iArr, 2, 6, (sArr2[i18] * s15) + i16)) + f(iArr, 3, 7, (sArr2[i19] * s15) + i16))) >> 31;
            int i25 = ~iF;
            int[] iArr2 = {(i25 & iArr[0]) ^ (iArr[4] & iF), (i25 & iArr[1]) ^ (iArr[5] & iF), (i25 & iArr[2]) ^ (iArr[6] & iF), (iArr[7] & iF) ^ (i25 & iArr[3])};
            int i26 = iArr2[0];
            int i27 = iArr2[3];
            sArr[i15] = (short) ((i26 - i27) & 3);
            sArr[i17] = (short) ((iArr2[1] - i27) & 3);
            sArr[i18] = (short) ((iArr2[2] - i27) & 3);
            sArr[i19] = (short) (((-iF) + (i27 * 2)) & 3);
            i15++;
            s15 = 8;
        }
    }

    static void rec(byte[] bArr, short[] sArr, short[] sArr2) {
        Arrays.fill(bArr, (byte) 0);
        for (int i15 = 0; i15 < 256; i15++) {
            int i16 = (sArr[i15] * 8) + 196624;
            int i17 = sArr2[i15] * 2;
            int i18 = i15 + 768;
            short s15 = sArr2[i18];
            int i19 = i16 - ((i17 + s15) * 12289);
            int i25 = i15 + 256;
            int i26 = ((sArr[i25] * 8) + 196624) - (((sArr2[i25] * 2) + s15) * 12289);
            int i27 = i15 + 512;
            int[] iArr = {i19, i26, ((sArr[i27] * 8) + 196624) - (((sArr2[i27] * 2) + s15) * 12289), ((sArr[i18] * 8) + 196624) - (s15 * 12289)};
            int i28 = i15 >>> 3;
            bArr[i28] = (byte) ((LDDecode(iArr[0], iArr[1], iArr[2], iArr[3]) << (i15 & 7)) | bArr[i28]);
        }
    }
}
