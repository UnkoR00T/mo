package org.bouncycastle.pqc.crypto.sphincs;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes5.dex */
class Horst {
    static final int HORST_K = 32;
    static final int HORST_LOGT = 16;
    static final int HORST_SIGBYTES = 13312;
    static final int HORST_SKBYTES = 32;
    static final int HORST_T = 65536;
    static final int N_MASKS = 32;

    Horst() {
    }

    static void expand_seed(byte[] bArr, byte[] bArr2) {
        Seed.prg(bArr, 0, 2097152L, bArr2, 0);
    }

    static int horst_sign(HashFunctions hashFunctions, byte[] bArr, int i15, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        byte[] bArr6 = new byte[PKIFailureInfo.badSenderNonce];
        byte[] bArr7 = new byte[4194272];
        expand_seed(bArr6, bArr3);
        for (int i16 = 0; i16 < 65536; i16++) {
            hashFunctions.hash_n_n(bArr7, (65535 + i16) * 32, bArr6, i16 * 32);
        }
        for (int i17 = 0; i17 < 16; i17++) {
            long j15 = (1 << (16 - i17)) - 1;
            int i18 = 1 << (15 - i17);
            long j16 = i18 - 1;
            int i19 = 0;
            while (i19 < i18) {
                hashFunctions.hash_2n_n_mask(bArr7, (int) ((((long) i19) + j16) * 32), bArr7, (int) ((((long) (i19 * 2)) + j15) * 32), bArr4, i17 * 64);
                i19++;
                j16 = j16;
            }
        }
        int i25 = 2016;
        int i26 = i15;
        while (i25 < 4064) {
            bArr[i26] = bArr7[i25];
            i25++;
            i26++;
        }
        for (int i27 = 0; i27 < 32; i27++) {
            int i28 = i27 * 2;
            int i29 = (bArr5[i28] & 255) + ((bArr5[i28 + 1] & 255) << 8);
            int i35 = 0;
            while (i35 < 32) {
                bArr[i26] = bArr6[(i29 * 32) + i35];
                i35++;
                i26++;
            }
            int i36 = i29 + 65535;
            for (int i37 = 0; i37 < 10; i37++) {
                int i38 = (i36 & 1) != 0 ? i36 + 1 : i36 - 1;
                int i39 = 0;
                while (i39 < 32) {
                    bArr[i26] = bArr7[(i38 * 32) + i39];
                    i39++;
                    i26++;
                }
                i36 = (i38 - 1) / 2;
            }
        }
        for (int i45 = 0; i45 < 32; i45++) {
            bArr2[i45] = bArr7[i45];
        }
        return HORST_SIGBYTES;
    }

    static int horst_verify(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2, int i15, byte[] bArr3, byte[] bArr4) {
        byte[] bArr5 = bArr2;
        byte[] bArr6 = new byte[1024];
        int i16 = i15 + 2048;
        int i17 = 0;
        while (i17 < 32) {
            int i18 = i17 * 2;
            int i19 = (bArr4[i18] & 255) + ((bArr4[i18 + 1] & 255) << 8);
            if ((i19 & 1) == 0) {
                hashFunctions.hash_n_n(bArr6, 0, bArr5, i16);
                for (int i25 = 0; i25 < 32; i25++) {
                    bArr6[i25 + 32] = bArr5[i16 + 32 + i25];
                }
            } else {
                hashFunctions.hash_n_n(bArr6, 32, bArr5, i16);
                for (int i26 = 0; i26 < 32; i26++) {
                    bArr6[i26] = bArr5[i16 + 32 + i26];
                }
            }
            int i27 = i16 + 64;
            int i28 = 1;
            while (i28 < 10) {
                int i29 = i19 >>> 1;
                if ((i29 & 1) == 0) {
                    hashFunctions.hash_2n_n_mask(bArr6, 0, bArr6, 0, bArr3, (i28 - 1) * 64);
                    for (int i35 = 0; i35 < 32; i35++) {
                        bArr6[i35 + 32] = bArr5[i27 + i35];
                    }
                } else {
                    hashFunctions.hash_2n_n_mask(bArr6, 32, bArr6, 0, bArr3, (i28 - 1) * 64);
                    for (int i36 = 0; i36 < 32; i36++) {
                        bArr6[i36] = bArr5[i27 + i36];
                    }
                }
                i27 += 32;
                i28++;
                i19 = i29;
            }
            int i37 = i19 >>> 1;
            hashFunctions.hash_2n_n_mask(bArr6, 0, bArr6, 0, bArr3, 576);
            for (int i38 = 0; i38 < 32; i38++) {
                if (bArr5[(i37 * 32) + i15 + i38] != bArr6[i38]) {
                    for (int i39 = 0; i39 < 32; i39++) {
                        bArr[i39] = 0;
                    }
                    return -1;
                }
            }
            i17++;
            i16 = i27;
        }
        int i45 = 0;
        while (i45 < 32) {
            hashFunctions.hash_2n_n_mask(bArr6, i45 * 32, bArr5, i15 + (i45 * 64), bArr3, 640);
            i45++;
            bArr5 = bArr2;
        }
        for (int i46 = 0; i46 < 16; i46++) {
            hashFunctions.hash_2n_n_mask(bArr6, i46 * 32, bArr6, i46 * 64, bArr3, 704);
        }
        for (int i47 = 0; i47 < 8; i47++) {
            hashFunctions.hash_2n_n_mask(bArr6, i47 * 32, bArr6, i47 * 64, bArr3, 768);
        }
        for (int i48 = 0; i48 < 4; i48++) {
            hashFunctions.hash_2n_n_mask(bArr6, i48 * 32, bArr6, i48 * 64, bArr3, 832);
        }
        for (int i49 = 0; i49 < 2; i49++) {
            hashFunctions.hash_2n_n_mask(bArr6, i49 * 32, bArr6, i49 * 64, bArr3, 896);
        }
        hashFunctions.hash_2n_n_mask(bArr, 0, bArr6, 0, bArr3, 960);
        return 0;
    }
}
