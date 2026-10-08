package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes5.dex */
class FalconSign {
    FalconSign() {
    }

    int do_sign_dyn(SamplerCtx samplerCtx, short[] sArr, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, short[] sArr2, int i15, double[] dArr, int i16) {
        int i17 = 1 << i15;
        int i18 = i16 + i17;
        int i19 = i18 + i17;
        int i25 = i19 + i17;
        smallints_to_fpr(dArr, i18, bArr, i15);
        smallints_to_fpr(dArr, i16, bArr2, i15);
        smallints_to_fpr(dArr, i25, bArr3, i15);
        smallints_to_fpr(dArr, i19, bArr4, i15);
        FalconFFT.FFT(dArr, i18, i15);
        FalconFFT.FFT(dArr, i16, i15);
        FalconFFT.FFT(dArr, i25, i15);
        FalconFFT.FFT(dArr, i19, i15);
        FalconFFT.poly_neg(dArr, i18, i15);
        FalconFFT.poly_neg(dArr, i25, i15);
        int i26 = i25 + i17;
        int i27 = i26 + i17;
        System.arraycopy(dArr, i18, dArr, i26, i17);
        FalconFFT.poly_mulselfadj_fft(dArr, i26, i15);
        System.arraycopy(dArr, i16, dArr, i27, i17);
        FalconFFT.poly_muladj_fft(dArr, i27, dArr, i19, i15);
        FalconFFT.poly_mulselfadj_fft(dArr, i16, i15);
        FalconFFT.poly_add(dArr, i16, dArr, i26, i15);
        System.arraycopy(dArr, i18, dArr, i26, i17);
        FalconFFT.poly_muladj_fft(dArr, i18, dArr, i25, i15);
        FalconFFT.poly_add(dArr, i18, dArr, i27, i15);
        FalconFFT.poly_mulselfadj_fft(dArr, i19, i15);
        System.arraycopy(dArr, i25, dArr, i27, i17);
        FalconFFT.poly_mulselfadj_fft(dArr, i27, i15);
        FalconFFT.poly_add(dArr, i19, dArr, i27, i15);
        int i28 = i27 + i17;
        for (int i29 = 0; i29 < i17; i29++) {
            dArr[i27 + i29] = sArr2[i29];
        }
        FalconFFT.FFT(dArr, i27, i15);
        System.arraycopy(dArr, i27, dArr, i28, i17);
        FalconFFT.poly_mul_fft(dArr, i28, dArr, i26, i15);
        FalconFFT.poly_mulconst(dArr, i28, -8.137358613394092E-5d, i15);
        FalconFFT.poly_mul_fft(dArr, i27, dArr, i25, i15);
        FalconFFT.poly_mulconst(dArr, i27, 8.137358613394092E-5d, i15);
        int i35 = i17 * 2;
        System.arraycopy(dArr, i27, dArr, i25, i35);
        ffSampling_fft_dyntree(samplerCtx, dArr, i25, dArr, i26, dArr, i16, dArr, i18, dArr, i19, i15, i15, dArr, i27);
        System.arraycopy(dArr, i25, dArr, i26, i35);
        smallints_to_fpr(dArr, i18, bArr, i15);
        smallints_to_fpr(dArr, i16, bArr2, i15);
        smallints_to_fpr(dArr, i25, bArr3, i15);
        smallints_to_fpr(dArr, i19, bArr4, i15);
        FalconFFT.FFT(dArr, i18, i15);
        FalconFFT.FFT(dArr, i16, i15);
        FalconFFT.FFT(dArr, i25, i15);
        FalconFFT.FFT(dArr, i19, i15);
        FalconFFT.poly_neg(dArr, i18, i15);
        FalconFFT.poly_neg(dArr, i25, i15);
        int i36 = i28 + i17;
        System.arraycopy(dArr, i26, dArr, i28, i17);
        System.arraycopy(dArr, i27, dArr, i36, i17);
        FalconFFT.poly_mul_fft(dArr, i28, dArr, i16, i15);
        FalconFFT.poly_mul_fft(dArr, i36, dArr, i19, i15);
        FalconFFT.poly_add(dArr, i28, dArr, i36, i15);
        System.arraycopy(dArr, i26, dArr, i36, i17);
        FalconFFT.poly_mul_fft(dArr, i36, dArr, i18, i15);
        System.arraycopy(dArr, i28, dArr, i26, i17);
        FalconFFT.poly_mul_fft(dArr, i27, dArr, i25, i15);
        FalconFFT.poly_add(dArr, i27, dArr, i36, i15);
        FalconFFT.iFFT(dArr, i26, i15);
        FalconFFT.iFFT(dArr, i27, i15);
        int i37 = 0;
        int i38 = 0;
        for (int i39 = 0; i39 < i17; i39++) {
            int iFpr_rint = (sArr2[i39] & HPKE.aead_EXPORT_ONLY) - ((int) FPREngine.fpr_rint(dArr[i26 + i39]));
            i37 += iFpr_rint * iFpr_rint;
            i38 |= i37;
        }
        int i45 = i37 | (-(i38 >>> 31));
        short[] sArr3 = new short[i17];
        for (int i46 = 0; i46 < i17; i46++) {
            sArr3[i46] = (short) (-FPREngine.fpr_rint(dArr[i27 + i46]));
        }
        if (FalconCommon.is_short_half(i45, sArr3, i15) == 0) {
            return 0;
        }
        System.arraycopy(sArr3, 0, sArr, 0, i17);
        return 1;
    }

    void ffSampling_fft_dyntree(SamplerCtx samplerCtx, double[] dArr, int i15, double[] dArr2, int i16, double[] dArr3, int i17, double[] dArr4, int i18, double[] dArr5, int i19, int i25, int i26, double[] dArr6, int i27) {
        if (i26 == 0) {
            double dSqrt = Math.sqrt(dArr3[i17]) * FPREngine.fpr_inv_sigma[i25];
            dArr[i15] = SamplerZ.sample(samplerCtx, dArr[i15], dSqrt);
            dArr2[i16] = SamplerZ.sample(samplerCtx, dArr2[i16], dSqrt);
            return;
        }
        int i28 = 1 << i26;
        int i29 = i28 >> 1;
        FalconFFT.poly_LDL_fft(dArr3, i17, dArr4, i18, dArr5, i19, i26);
        int i35 = i27 + i29;
        FalconFFT.poly_split_fft(dArr6, i27, dArr6, i35, dArr3, i17, i26);
        System.arraycopy(dArr6, i27, dArr3, i17, i28);
        FalconFFT.poly_split_fft(dArr6, i27, dArr6, i35, dArr5, i19, i26);
        System.arraycopy(dArr6, i27, dArr5, i19, i28);
        System.arraycopy(dArr4, i18, dArr6, i27, i28);
        System.arraycopy(dArr3, i17, dArr4, i18, i29);
        int i36 = i18 + i29;
        System.arraycopy(dArr5, i19, dArr4, i36, i29);
        int i37 = i27 + i28;
        int i38 = i37 + i29;
        FalconFFT.poly_split_fft(dArr6, i37, dArr6, i38, dArr2, i16, i26);
        int i39 = i26 - 1;
        ffSampling_fft_dyntree(samplerCtx, dArr6, i37, dArr6, i38, dArr5, i19, dArr5, i19 + i29, dArr4, i36, i25, i39, dArr6, i37 + i28);
        int i45 = i27 + (i28 << 1);
        FalconFFT.poly_merge_fft(dArr6, i45, dArr6, i37, dArr6, i38, i26);
        System.arraycopy(dArr2, i16, dArr6, i37, i28);
        FalconFFT.poly_sub(dArr6, i37, dArr6, i45, i26);
        System.arraycopy(dArr6, i45, dArr2, i16, i28);
        FalconFFT.poly_mul_fft(dArr6, i27, dArr6, i37, i26);
        FalconFFT.poly_add(dArr, i15, dArr6, i27, i26);
        FalconFFT.poly_split_fft(dArr6, i27, dArr6, i35, dArr, i15, i26);
        ffSampling_fft_dyntree(samplerCtx, dArr6, i27, dArr6, i35, dArr3, i17, dArr3, i17 + i29, dArr4, i18, i25, i39, dArr6, i37);
        FalconFFT.poly_merge_fft(dArr, i15, dArr6, i27, dArr6, i35, i26);
    }

    void sign_dyn(short[] sArr, SHAKEDigest sHAKEDigest, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, short[] sArr2, int i15, double[] dArr) {
        SamplerCtx samplerCtx;
        do {
            samplerCtx = new SamplerCtx();
            samplerCtx.sigma_min = FPREngine.fpr_sigma_min[i15];
            samplerCtx.f149457p.prng_init(sHAKEDigest);
        } while (do_sign_dyn(samplerCtx, sArr, bArr, bArr2, bArr3, bArr4, sArr2, i15, dArr, 0) == 0);
    }

    void smallints_to_fpr(double[] dArr, int i15, byte[] bArr, int i16) {
        int i17 = 1 << i16;
        for (int i18 = 0; i18 < i17; i18++) {
            dArr[i15 + i18] = bArr[i18];
        }
    }
}
