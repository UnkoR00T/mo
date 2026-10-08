package org.bouncycastle.pqc.crypto.falcon;

/* JADX INFO: loaded from: classes5.dex */
class FalconFFT {
    FalconFFT() {
    }

    static void FFT(double[] dArr, int i15, int i16) {
        int i17 = (1 << i16) >> 1;
        int i18 = 2;
        int i19 = 1;
        int i25 = i17;
        while (i19 < i16) {
            int i26 = i25 >> 1;
            int i27 = i18 >> 1;
            int i28 = 0;
            int i29 = 0;
            while (i28 < i27) {
                int i35 = i29 + i26 + i15;
                int i36 = (i18 + i28) << 1;
                double[] dArr2 = FPREngine.fpr_gm_tab;
                double d15 = dArr2[i36];
                double d16 = dArr2[i36 + 1];
                int i37 = i15 + i29;
                int i38 = i37 + i17;
                int i39 = i37 + i26;
                int i45 = i39 + i17;
                while (i37 < i35) {
                    double d17 = dArr[i37];
                    double d18 = dArr[i38];
                    double d19 = dArr[i39];
                    double d25 = dArr[i45];
                    double d26 = (d19 * d15) - (d25 * d16);
                    double d27 = (d19 * d16) + (d25 * d15);
                    dArr[i37] = d17 + d26;
                    dArr[i38] = d18 + d27;
                    dArr[i39] = d17 - d26;
                    dArr[i45] = d18 - d27;
                    i37++;
                    i38++;
                    i39++;
                    i45++;
                }
                i28++;
                i29 += i25;
            }
            i19++;
            i18 <<= 1;
            i25 = i26;
        }
    }

    static void iFFT(double[] dArr, int i15, int i16) {
        int i17;
        int i18 = 1 << i16;
        int i19 = i18 >> 1;
        int i25 = i16;
        int i26 = 1;
        int i27 = i18;
        while (true) {
            i17 = 0;
            if (i25 <= 1) {
                break;
            }
            i27 >>= 1;
            int i28 = i26 << 1;
            int i29 = 0;
            while (i17 < i19) {
                int i35 = i17 + i26 + i15;
                int i36 = (i27 + i29) << 1;
                double[] dArr2 = FPREngine.fpr_gm_tab;
                double d15 = dArr2[i36];
                double d16 = -dArr2[i36 + 1];
                int i37 = i15 + i17;
                int i38 = i37 + i19;
                int i39 = i37 + i26;
                int i45 = i39 + i19;
                while (i37 < i35) {
                    double d17 = dArr[i37];
                    double d18 = dArr[i38];
                    double d19 = dArr[i39];
                    double d25 = dArr[i45];
                    dArr[i37] = d17 + d19;
                    dArr[i38] = d18 + d25;
                    double d26 = d17 - d19;
                    double d27 = d18 - d25;
                    dArr[i39] = (d26 * d15) - (d27 * d16);
                    dArr[i45] = (d26 * d16) + (d27 * d15);
                    i37++;
                    i38++;
                    i39++;
                    i45++;
                }
                i29++;
                i17 += i28;
            }
            i25--;
            i26 = i28;
        }
        if (i16 > 0) {
            double d28 = FPREngine.fpr_p2_tab[i16];
            while (i17 < i18) {
                int i46 = i15 + i17;
                dArr[i46] = dArr[i46] * d28;
                i17++;
            }
        }
    }

    static void poly_LDL_fft(double[] dArr, int i15, double[] dArr2, int i16, double[] dArr3, int i17, int i18) {
        int i19 = (1 << i18) >> 1;
        int i25 = i19;
        int i26 = 0;
        int i27 = i16 + i19;
        int i28 = i16;
        while (i26 < i19) {
            double d15 = dArr[i15 + i26];
            double d16 = dArr[i15 + i25];
            double d17 = dArr2[i28];
            double d18 = dArr2[i27];
            double d19 = 1.0d / ((d15 * d15) + (d16 * d16));
            double d25 = d15 * d19;
            double d26 = d19 * (-d16);
            double d27 = (d17 * d25) - (d18 * d26);
            double d28 = (d26 * d17) + (d25 * d18);
            double d29 = (d27 * d17) + (d28 * d18);
            double d35 = ((-d18) * d27) + (d17 * d28);
            int i29 = i17 + i26;
            dArr3[i29] = dArr3[i29] - d29;
            int i35 = i17 + i25;
            dArr3[i35] = dArr3[i35] - d35;
            dArr2[i28] = d27;
            dArr2[i27] = -d28;
            i26++;
            i25++;
            i28++;
            i27++;
        }
    }

    static void poly_add(double[] dArr, int i15, double[] dArr2, int i16, int i17) {
        int i18 = 1 << i17;
        for (int i19 = 0; i19 < i18; i19++) {
            int i25 = i15 + i19;
            dArr[i25] = dArr[i25] + dArr2[i16 + i19];
        }
    }

    static void poly_add_muladj_fft(double[] dArr, double[] dArr2, double[] dArr3, double[] dArr4, double[] dArr5, int i15) {
        int i16 = (1 << i15) >> 1;
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = i17 + i16;
            double d15 = dArr2[i17];
            double d16 = dArr2[i18];
            double d17 = dArr3[i17];
            double d18 = dArr3[i18];
            double d19 = dArr4[i17];
            double d25 = dArr4[i18];
            double d26 = dArr5[i17];
            double d27 = dArr5[i18];
            double d28 = (d15 * d19) + (d16 * d25);
            double d29 = (d16 * d19) - (d15 * d25);
            dArr[i17] = d28 + (d17 * d26) + (d18 * d27);
            dArr[i18] = d29 + ((d18 * d26) - (d17 * d27));
        }
    }

    static void poly_adj_fft(double[] dArr, int i15, int i16) {
        int i17 = 1 << i16;
        for (int i18 = i17 >> 1; i18 < i17; i18++) {
            int i19 = i15 + i18;
            dArr[i19] = -dArr[i19];
        }
    }

    static void poly_div_autoadj_fft(double[] dArr, int i15, double[] dArr2, int i16, int i17) {
        int i18 = (1 << i17) >> 1;
        for (int i19 = 0; i19 < i18; i19++) {
            double d15 = 1.0d / dArr2[i16 + i19];
            int i25 = i15 + i19;
            dArr[i25] = dArr[i25] * d15;
            int i26 = i25 + i18;
            dArr[i26] = dArr[i26] * d15;
        }
    }

    static void poly_invnorm2_fft(double[] dArr, int i15, double[] dArr2, int i16, double[] dArr3, int i17, int i18) {
        int i19 = (1 << i18) >> 1;
        for (int i25 = 0; i25 < i19; i25++) {
            int i26 = i16 + i25;
            double d15 = dArr2[i26];
            double d16 = dArr2[i26 + i19];
            int i27 = i17 + i25;
            double d17 = dArr3[i27];
            double d18 = dArr3[i27 + i19];
            dArr[i15 + i25] = 1.0d / ((((d15 * d15) + (d16 * d16)) + (d17 * d17)) + (d18 * d18));
        }
    }

    static void poly_merge_fft(double[] dArr, int i15, double[] dArr2, int i16, double[] dArr3, int i17, int i18) {
        int i19 = 1 << i18;
        int i25 = i19 >> 1;
        int i26 = i19 >> 2;
        dArr[i15] = dArr2[i16];
        dArr[i15 + i25] = dArr3[i17];
        for (int i27 = 0; i27 < i26; i27++) {
            int i28 = i17 + i27;
            double d15 = dArr3[i28];
            double d16 = dArr3[i28 + i26];
            int i29 = (i27 + i25) << 1;
            double[] dArr4 = FPREngine.fpr_gm_tab;
            double d17 = dArr4[i29];
            double d18 = dArr4[i29 + 1];
            double d19 = (d15 * d17) - (d16 * d18);
            double d25 = (d15 * d18) + (d16 * d17);
            int i35 = i16 + i27;
            double d26 = dArr2[i35];
            double d27 = dArr2[i35 + i26];
            int i36 = i15 + (i27 << 1);
            dArr[i36] = d26 + d19;
            int i37 = i36 + 1;
            dArr[i36 + i25] = d27 + d25;
            dArr[i37] = d26 - d19;
            dArr[i37 + i25] = d27 - d25;
        }
    }

    static void poly_mul_autoadj_fft(double[] dArr, int i15, double[] dArr2, int i16, int i17) {
        int i18 = (1 << i17) >> 1;
        for (int i19 = 0; i19 < i18; i19++) {
            int i25 = i15 + i19;
            int i26 = i16 + i19;
            dArr[i25] = dArr[i25] * dArr2[i26];
            int i27 = i25 + i18;
            dArr[i27] = dArr[i27] * dArr2[i26];
        }
    }

    static void poly_mul_fft(double[] dArr, int i15, double[] dArr2, int i16, int i17) {
        int i18 = (1 << i17) >> 1;
        int i19 = i15 + i18;
        int i25 = 0;
        int i26 = i15;
        int i27 = i16;
        while (i25 < i18) {
            double d15 = dArr[i26];
            double d16 = dArr[i19];
            double d17 = dArr2[i27];
            double d18 = dArr2[i27 + i18];
            dArr[i26] = (d15 * d17) - (d16 * d18);
            dArr[i19] = (d15 * d18) + (d16 * d17);
            i25++;
            i26++;
            i27++;
            i19++;
        }
    }

    static void poly_muladj_fft(double[] dArr, int i15, double[] dArr2, int i16, int i17) {
        int i18 = (1 << i17) >> 1;
        int i19 = 0;
        int i25 = i15;
        while (i19 < i18) {
            double d15 = dArr[i25];
            int i26 = i25 + i18;
            double d16 = dArr[i26];
            int i27 = i16 + i19;
            double d17 = dArr2[i27];
            double d18 = dArr2[i27 + i18];
            dArr[i25] = (d15 * d17) + (d16 * d18);
            dArr[i26] = (d16 * d17) - (d15 * d18);
            i19++;
            i25++;
        }
    }

    static void poly_mulconst(double[] dArr, int i15, double d15, int i16) {
        int i17 = 1 << i16;
        for (int i18 = 0; i18 < i17; i18++) {
            int i19 = i15 + i18;
            dArr[i19] = dArr[i19] * d15;
        }
    }

    static void poly_mulselfadj_fft(double[] dArr, int i15, int i16) {
        int i17 = (1 << i16) >> 1;
        for (int i18 = 0; i18 < i17; i18++) {
            int i19 = i15 + i18;
            double d15 = dArr[i19];
            int i25 = i19 + i17;
            double d16 = dArr[i25];
            dArr[i19] = (d15 * d15) + (d16 * d16);
            dArr[i25] = 0.0d;
        }
    }

    static void poly_neg(double[] dArr, int i15, int i16) {
        int i17 = 1 << i16;
        for (int i18 = 0; i18 < i17; i18++) {
            int i19 = i15 + i18;
            dArr[i19] = -dArr[i19];
        }
    }

    static void poly_split_fft(double[] dArr, int i15, double[] dArr2, int i16, double[] dArr3, int i17, int i18) {
        int i19 = 1 << i18;
        int i25 = i19 >> 1;
        int i26 = i19 >> 2;
        dArr[i15] = dArr3[i17];
        dArr2[i16] = dArr3[i17 + i25];
        for (int i27 = 0; i27 < i26; i27++) {
            int i28 = i17 + (i27 << 1);
            double d15 = dArr3[i28];
            int i29 = i28 + 1;
            double d16 = dArr3[i28 + i25];
            double d17 = dArr3[i29];
            double d18 = dArr3[i29 + i25];
            int i35 = i15 + i27;
            dArr[i35] = (d15 + d17) * 0.5d;
            dArr[i35 + i26] = (d16 + d18) * 0.5d;
            double d19 = d15 - d17;
            double d25 = d16 - d18;
            int i36 = (i27 + i25) << 1;
            double[] dArr4 = FPREngine.fpr_gm_tab;
            double d26 = dArr4[i36];
            double d27 = -dArr4[i36 + 1];
            int i37 = i16 + i27;
            dArr2[i37] = ((d19 * d26) - (d25 * d27)) * 0.5d;
            dArr2[i37 + i26] = ((d19 * d27) + (d25 * d26)) * 0.5d;
        }
    }

    static void poly_sub(double[] dArr, int i15, double[] dArr2, int i16, int i17) {
        int i18 = 1 << i17;
        for (int i19 = 0; i19 < i18; i19++) {
            int i25 = i15 + i19;
            dArr[i25] = dArr[i25] - dArr2[i16 + i19];
        }
    }
}
