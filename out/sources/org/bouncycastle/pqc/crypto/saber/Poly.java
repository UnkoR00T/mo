package org.bouncycastle.pqc.crypto.saber;

import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: loaded from: classes5.dex */
class Poly {
    private static final int KARATSUBA_N = 64;
    private static int SCHB_N = 16;
    private final int N_RES;
    private final int N_SB;
    private final int N_SB_RES;
    private final int SABER_L;
    private final int SABER_N;
    private final SABEREngine engine;
    private final Utils utils;

    public Poly(SABEREngine sABEREngine) {
        this.engine = sABEREngine;
        this.SABER_L = sABEREngine.getSABER_L();
        int saber_n = sABEREngine.getSABER_N();
        this.SABER_N = saber_n;
        this.N_RES = saber_n << 1;
        int i15 = saber_n >> 2;
        this.N_SB = i15;
        this.N_SB_RES = (i15 * 2) - 1;
        this.utils = sABEREngine.getUtils();
    }

    private short OVERFLOWING_MUL(int i15, int i16) {
        return (short) (i15 * i16);
    }

    private void cbd(short[] sArr, byte[] bArr, int i15) {
        int i16 = 4;
        int[] iArr = new int[4];
        char c15 = 2;
        if (this.engine.getSABER_MU() == 6) {
            for (int i17 = 0; i17 < this.SABER_N / 4; i17++) {
                int iLoad_littleendian = (int) load_littleendian(bArr, i15 + (i17 * 3), 3);
                int i18 = 0;
                for (int i19 = 0; i19 < 3; i19++) {
                    i18 += (iLoad_littleendian >> i19) & 2396745;
                }
                iArr[0] = i18 & 7;
                iArr[1] = (i18 >>> 6) & 7;
                iArr[2] = (i18 >>> 12) & 7;
                iArr[3] = (i18 >>> 18) & 7;
                int i25 = i17 * 4;
                sArr[i25] = (short) (iArr[0] - ((i18 >>> 3) & 7));
                sArr[i25 + 1] = (short) (iArr[1] - ((i18 >>> 9) & 7));
                sArr[i25 + 2] = (short) (iArr[2] - ((i18 >>> 15) & 7));
                sArr[i25 + 3] = (short) (iArr[3] - (i18 >>> 21));
            }
            return;
        }
        if (this.engine.getSABER_MU() == 8) {
            for (int i26 = 0; i26 < this.SABER_N / 4; i26++) {
                int i27 = i26 * 4;
                int iLoad_littleendian2 = (int) load_littleendian(bArr, i15 + i27, 4);
                int i28 = 0;
                for (int i29 = 0; i29 < 4; i29++) {
                    i28 += (iLoad_littleendian2 >>> i29) & 286331153;
                }
                iArr[0] = i28 & 15;
                iArr[1] = (i28 >>> 8) & 15;
                iArr[2] = (i28 >>> 16) & 15;
                iArr[3] = (i28 >>> 24) & 15;
                sArr[i27] = (short) (iArr[0] - ((i28 >>> 4) & 15));
                sArr[i27 + 1] = (short) (iArr[1] - ((i28 >>> 12) & 15));
                sArr[i27 + 2] = (short) (iArr[2] - ((i28 >>> 20) & 15));
                sArr[i27 + 3] = (short) (iArr[3] - (i28 >>> 28));
            }
            return;
        }
        char c16 = '\n';
        if (this.engine.getSABER_MU() == 10) {
            int i35 = 0;
            while (i35 < this.SABER_N / i16) {
                long jLoad_littleendian = load_littleendian(bArr, i15 + (i35 * 5), 5);
                long j15 = 0;
                for (int i36 = 0; i36 < 5; i36++) {
                    j15 += (jLoad_littleendian >>> i36) & 35468117025L;
                }
                int[] iArr2 = iArr;
                iArr2[0] = (int) (j15 & 31);
                char c17 = c15;
                iArr2[1] = (int) ((j15 >>> c16) & 31);
                int i37 = i35;
                iArr2[c17] = (int) ((j15 >>> 20) & 31);
                iArr2[3] = (int) ((j15 >>> 30) & 31);
                int i38 = i37 * 4;
                sArr[i38] = (short) (iArr2[0] - ((int) ((j15 >>> 5) & 31)));
                sArr[i38 + 1] = (short) (iArr2[1] - ((int) ((j15 >>> 15) & 31)));
                sArr[i38 + 2] = (short) (iArr2[c17] - ((int) ((j15 >>> 25) & 31)));
                sArr[i38 + 3] = (short) (iArr2[3] - ((int) (j15 >>> 35)));
                i35 = i37 + 1;
                iArr = iArr2;
                c15 = c17;
                i16 = 4;
                c16 = '\n';
            }
        }
    }

    private void karatsuba_simple(int[] iArr, int[] iArr2, int[] iArr3) {
        int i15 = 31;
        int[] iArr4 = new int[31];
        int[] iArr5 = new int[31];
        int[] iArr6 = new int[31];
        int[] iArr7 = new int[63];
        int i16 = 0;
        while (true) {
            if (i16 >= 16) {
                break;
            }
            int i17 = iArr[i16];
            int i18 = iArr[i16 + 16];
            int i19 = iArr[i16 + 32];
            int i25 = iArr[i16 + 48];
            int i26 = 0;
            for (int i27 = 16; i26 < i27; i27 = 16) {
                int i28 = iArr2[i26];
                int i29 = iArr2[i26 + 16];
                int i35 = i16 + i26;
                iArr3[i35] = iArr3[i35] + OVERFLOWING_MUL(i17, i28);
                int i36 = i35 + 32;
                iArr3[i36] = iArr3[i36] + OVERFLOWING_MUL(i18, i29);
                int[] iArr8 = iArr4;
                iArr8[i35] = (int) (((long) iArr4[i35]) + (((long) (i17 + i18)) * ((long) (i28 + i29))));
                int i37 = iArr2[i26 + 32];
                int i38 = iArr2[i26 + 48];
                int i39 = i35 + 64;
                iArr3[i39] = iArr3[i39] + OVERFLOWING_MUL(i37, i19);
                int i45 = i35 + 96;
                iArr3[i45] = iArr3[i45] + OVERFLOWING_MUL(i38, i25);
                iArr6[i35] = iArr6[i35] + OVERFLOWING_MUL(i19 + i25, i37 + i38);
                int i46 = i28 + i37;
                int i47 = i17 + i19;
                iArr7[i35] = iArr7[i35] + OVERFLOWING_MUL(i46, i47);
                int i48 = i29 + i38;
                int i49 = i18 + i25;
                iArr7[i36] = iArr7[i36] + OVERFLOWING_MUL(i48, i49);
                iArr5[i35] = iArr5[i35] + OVERFLOWING_MUL(i46 + i48, i47 + i49);
                i26++;
                iArr4 = iArr8;
            }
            i16++;
            i15 = 31;
        }
        int[] iArr9 = iArr4;
        int i55 = i15;
        int i56 = 0;
        while (i56 < i55) {
            int i57 = i56 + 32;
            iArr5[i56] = (iArr5[i56] - iArr7[i56]) - iArr7[i57];
            iArr9[i56] = (iArr9[i56] - iArr3[i56]) - iArr3[i57];
            iArr6[i56] = (iArr6[i56] - iArr3[i56 + 64]) - iArr3[i56 + 96];
            i56++;
            i55 = 31;
        }
        for (int i58 = 0; i58 < i55; i58++) {
            int i59 = i58 + 16;
            iArr7[i59] = iArr7[i59] + iArr5[i58];
            iArr3[i59] = iArr3[i59] + iArr9[i58];
            int i65 = i58 + 80;
            iArr3[i65] = iArr3[i65] + iArr6[i58];
        }
        for (int i66 = 0; i66 < 63; i66++) {
            iArr7[i66] = (iArr7[i66] - iArr3[i66]) - iArr3[i66 + 64];
        }
        for (int i67 = 0; i67 < 63; i67++) {
            int i68 = i67 + 32;
            iArr3[i68] = iArr3[i68] + iArr7[i67];
        }
    }

    private long load_littleendian(byte[] bArr, int i15, int i16) {
        long j15 = bArr[i15] & 255;
        for (int i17 = 1; i17 < i16; i17++) {
            j15 |= ((long) (bArr[i15 + i17] & 255)) << (i17 * 8);
        }
        return j15;
    }

    private void poly_mul_acc(short[] sArr, short[] sArr2, short[] sArr3) {
        short[] sArr4 = new short[this.SABER_N * 2];
        toom_cook_4way(sArr, sArr2, sArr4);
        int i15 = this.SABER_N;
        while (true) {
            int i16 = this.SABER_N;
            if (i15 >= i16 * 2) {
                return;
            }
            int i17 = i15 - i16;
            sArr3[i17] = (short) (sArr3[i17] + (sArr4[i15 - i16] - sArr4[i15]));
            i15++;
        }
    }

    private void toom_cook_4way(short[] sArr, short[] sArr2, short[] sArr3) {
        int i15 = this.N_SB;
        int[] iArr = new int[i15];
        int[] iArr2 = new int[i15];
        int[] iArr3 = new int[i15];
        int[] iArr4 = new int[i15];
        int[] iArr5 = new int[i15];
        int[] iArr6 = new int[i15];
        int[] iArr7 = new int[i15];
        int[] iArr8 = new int[i15];
        int[] iArr9 = new int[i15];
        int[] iArr10 = new int[i15];
        int[] iArr11 = new int[i15];
        int[] iArr12 = new int[i15];
        int[] iArr13 = new int[i15];
        int[] iArr14 = new int[i15];
        int i16 = this.N_SB_RES;
        int[] iArr15 = new int[i16];
        int[] iArr16 = new int[i16];
        int[] iArr17 = new int[i16];
        int[] iArr18 = new int[i16];
        int[] iArr19 = new int[i16];
        int[] iArr20 = new int[i16];
        int[] iArr21 = new int[i16];
        int i17 = 0;
        while (true) {
            int i18 = this.N_SB;
            if (i17 >= i18) {
                break;
            }
            short s15 = sArr[i17];
            short s16 = sArr[i17 + i18];
            short s17 = sArr[i17 + (i18 * 2)];
            short s18 = sArr[(i18 * 3) + i17];
            short s19 = (short) (s15 + s17);
            short s25 = (short) (s16 + s18);
            iArr3[i17] = (short) (s19 + s25);
            iArr4[i17] = (short) (s19 - s25);
            short s26 = (short) (((s15 << 2) + s17) << 1);
            short s27 = (short) ((s16 << 2) + s18);
            iArr5[i17] = (short) (s26 + s27);
            iArr6[i17] = (short) (s26 - s27);
            iArr2[i17] = (short) ((s18 << 3) + (s17 << 2) + (s16 << 1) + s15);
            iArr7[i17] = s15;
            iArr[i17] = s18;
            i17++;
        }
        int i19 = 0;
        while (true) {
            int i25 = this.N_SB;
            if (i19 >= i25) {
                break;
            }
            short s28 = sArr2[i19];
            short s29 = sArr2[i19 + i25];
            short s35 = sArr2[i19 + (i25 * 2)];
            short s36 = sArr2[(i25 * 3) + i19];
            int i26 = s28 + s35;
            int i27 = s29 + s36;
            iArr10[i19] = i26 + i27;
            iArr11[i19] = i26 - i27;
            int i28 = ((s28 << 2) + s35) << 1;
            int i29 = (s29 << 2) + s36;
            iArr12[i19] = i28 + i29;
            iArr13[i19] = i28 - i29;
            iArr9[i19] = (s36 << 3) + (s35 << 2) + (s29 << 1) + s28;
            iArr14[i19] = s28;
            iArr8[i19] = s36;
            i19++;
        }
        karatsuba_simple(iArr, iArr8, iArr15);
        karatsuba_simple(iArr2, iArr9, iArr16);
        karatsuba_simple(iArr3, iArr10, iArr17);
        karatsuba_simple(iArr4, iArr11, iArr18);
        karatsuba_simple(iArr5, iArr12, iArr19);
        karatsuba_simple(iArr6, iArr13, iArr20);
        karatsuba_simple(iArr7, iArr14, iArr21);
        for (int i35 = 0; i35 < this.N_SB_RES; i35++) {
            int i36 = iArr15[i35];
            int i37 = iArr16[i35];
            int i38 = iArr17[i35];
            int i39 = iArr18[i35];
            int i45 = iArr19[i35];
            int i46 = iArr20[i35];
            int i47 = iArr21[i35];
            int i48 = i46 - i45;
            int i49 = ((i39 & 65535) - (i38 & 65535)) >>> 1;
            int i55 = i38 + i49;
            int i56 = ((i37 + i45) - (i55 << 6)) - i55;
            int i57 = (i55 - i47) - i36;
            int i58 = i56 + (i57 * 45);
            int i59 = (((((((i45 - i36) - (i47 << 6)) << 1) + i48) & 65535) - (i57 << 3)) * 43691) >> 3;
            int i65 = i48 + i58;
            int i66 = (((i58 & 65535) + ((i49 & 65535) << 4)) * 36409) >> 1;
            int i67 = -(i49 + i66);
            int i68 = ((((i66 & 65535) * 30) - (i65 & 65535)) * 61167) >> 2;
            int i69 = i57 - i59;
            int i75 = i66 - i68;
            sArr3[i35] = (short) (sArr3[i35] + (i47 & 65535));
            int i76 = i35 + 64;
            sArr3[i76] = (short) (sArr3[i76] + (i68 & 65535));
            int i77 = i35 + 128;
            sArr3[i77] = (short) (sArr3[i77] + (i59 & 65535));
            int i78 = i35 + 192;
            sArr3[i78] = (short) (sArr3[i78] + (i67 & 65535));
            int i79 = i35 + 256;
            sArr3[i79] = (short) (sArr3[i79] + (i69 & 65535));
            int i85 = i35 + 320;
            sArr3[i85] = (short) (sArr3[i85] + (i75 & 65535));
            int i86 = i35 + MLKEMEngine.KyberPolyBytes;
            sArr3[i86] = (short) (sArr3[i86] + (i36 & 65535));
        }
    }

    public void GenMatrix(short[][][] sArr, byte[] bArr) {
        int saber_polyvecbytes = this.SABER_L * this.engine.getSABER_POLYVECBYTES();
        byte[] bArr2 = new byte[saber_polyvecbytes];
        SABEREngine sABEREngine = this.engine;
        sABEREngine.symmetric.prf(bArr2, bArr, sABEREngine.getSABER_SEEDBYTES(), saber_polyvecbytes);
        for (int i15 = 0; i15 < this.SABER_L; i15++) {
            this.utils.BS2POLVECq(bArr2, this.engine.getSABER_POLYVECBYTES() * i15, sArr[i15]);
        }
    }

    public void GenSecret(short[][] sArr, byte[] bArr) {
        int saber_polycoinbytes = this.SABER_L * this.engine.getSABER_POLYCOINBYTES();
        byte[] bArr2 = new byte[saber_polycoinbytes];
        SABEREngine sABEREngine = this.engine;
        sABEREngine.symmetric.prf(bArr2, bArr, sABEREngine.getSABER_NOISE_SEEDBYTES(), saber_polycoinbytes);
        for (int i15 = 0; i15 < this.SABER_L; i15++) {
            SABEREngine sABEREngine2 = this.engine;
            if (sABEREngine2.usingEffectiveMasking) {
                for (int i16 = 0; i16 < this.SABER_N / 4; i16++) {
                    int i17 = i16 * 4;
                    sArr[i15][i17] = (short) (((bArr2[(this.engine.getSABER_POLYCOINBYTES() * i15) + i16] & 3) ^ 2) - 2);
                    sArr[i15][i17 + 1] = (short) ((((bArr2[(this.engine.getSABER_POLYCOINBYTES() * i15) + i16] >>> 2) & 3) ^ 2) - 2);
                    sArr[i15][i17 + 2] = (short) ((((bArr2[(this.engine.getSABER_POLYCOINBYTES() * i15) + i16] >>> 4) & 3) ^ 2) - 2);
                    sArr[i15][i17 + 3] = (short) ((((bArr2[(this.engine.getSABER_POLYCOINBYTES() * i15) + i16] >>> 6) & 3) ^ 2) - 2);
                }
            } else {
                cbd(sArr[i15], bArr2, sABEREngine2.getSABER_POLYCOINBYTES() * i15);
            }
        }
    }

    public void InnerProd(short[][] sArr, short[][] sArr2, short[] sArr3) {
        for (int i15 = 0; i15 < this.SABER_L; i15++) {
            poly_mul_acc(sArr[i15], sArr2[i15], sArr3);
        }
    }

    public void MatrixVectorMul(short[][][] sArr, short[][] sArr2, short[][] sArr3, int i15) {
        for (int i16 = 0; i16 < this.SABER_L; i16++) {
            for (int i17 = 0; i17 < this.SABER_L; i17++) {
                if (i15 == 1) {
                    poly_mul_acc(sArr[i17][i16], sArr2[i17], sArr3[i16]);
                } else {
                    poly_mul_acc(sArr[i16][i17], sArr2[i17], sArr3[i16]);
                }
            }
        }
    }
}
