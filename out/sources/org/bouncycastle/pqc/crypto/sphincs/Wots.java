package org.bouncycastle.pqc.crypto.sphincs;

/* JADX INFO: loaded from: classes5.dex */
class Wots {
    static final int WOTS_L = 67;
    static final int WOTS_L1 = 64;
    static final int WOTS_LOGW = 4;
    static final int WOTS_LOG_L = 7;
    static final int WOTS_SIGBYTES = 2144;
    static final int WOTS_W = 16;

    Wots() {
    }

    private static void clear(byte[] bArr, int i15, int i16) {
        for (int i17 = 0; i17 != i16; i17++) {
            bArr[i17 + i15] = 0;
        }
    }

    static void expand_seed(byte[] bArr, int i15, byte[] bArr2, int i16) {
        clear(bArr, i15, WOTS_SIGBYTES);
        Seed.prg(bArr, i15, 2144L, bArr2, i16);
    }

    static void gen_chain(HashFunctions hashFunctions, byte[] bArr, int i15, byte[] bArr2, int i16, byte[] bArr3, int i17, int i18) {
        for (int i19 = 0; i19 < 32; i19++) {
            bArr[i19 + i15] = bArr2[i19 + i16];
        }
        for (int i25 = 0; i25 < i18 && i25 < 16; i25++) {
            hashFunctions.hash_n_n_mask(bArr, i15, bArr, i15, bArr3, i17 + (i25 * 32));
        }
    }

    void wots_pkgen(HashFunctions hashFunctions, byte[] bArr, int i15, byte[] bArr2, int i16, byte[] bArr3, int i17) {
        expand_seed(bArr, i15, bArr2, i16);
        for (int i18 = 0; i18 < 67; i18++) {
            int i19 = i15 + (i18 * 32);
            gen_chain(hashFunctions, bArr, i19, bArr, i19, bArr3, i17, 15);
        }
    }

    void wots_sign(HashFunctions hashFunctions, byte[] bArr, int i15, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int[] iArr = new int[67];
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i17 < 64) {
            byte b15 = bArr2[i17 / 2];
            iArr[i17] = b15 & 15;
            int i19 = (b15 & 255) >>> 4;
            iArr[i17 + 1] = i19;
            i18 = i18 + (15 - iArr[i17]) + (15 - i19);
            i17 += 2;
        }
        while (i17 < 67) {
            iArr[i17] = i18 & 15;
            i18 >>>= 4;
            i17++;
        }
        byte[] bArr5 = bArr;
        expand_seed(bArr5, i15, bArr3, 0);
        while (i16 < 67) {
            int i25 = i15 + (i16 * 32);
            gen_chain(hashFunctions, bArr5, i25, bArr, i25, bArr4, 0, iArr[i16]);
            i16++;
            bArr5 = bArr;
        }
    }

    void wots_verify(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2, int i15, byte[] bArr3, byte[] bArr4) {
        int[] iArr = new int[67];
        int i16 = 0;
        int i17 = 0;
        while (i16 < 64) {
            byte b15 = bArr3[i16 / 2];
            iArr[i16] = b15 & 15;
            int i18 = (b15 & 255) >>> 4;
            iArr[i16 + 1] = i18;
            i17 = i17 + (15 - iArr[i16]) + (15 - i18);
            i16 += 2;
        }
        while (i16 < 67) {
            iArr[i16] = i17 & 15;
            i17 >>>= 4;
            i16++;
        }
        for (int i19 = 0; i19 < 67; i19++) {
            int i25 = i19 * 32;
            int i26 = iArr[i19];
            gen_chain(hashFunctions, bArr, i25, bArr2, i15 + i25, bArr4, i26 * 32, 15 - i26);
        }
    }
}
