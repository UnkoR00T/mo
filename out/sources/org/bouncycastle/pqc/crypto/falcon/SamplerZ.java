package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes5.dex */
class SamplerZ {
    SamplerZ() {
    }

    private static int BerExp(FalconRNG falconRNG, double d15, double d16) {
        int iPrng_get_u8;
        int i15 = (int) (1.4426950408889634d * d15);
        long jFpr_expm_p63 = ((FPREngine.fpr_expm_p63(d15 - (((double) i15) * 0.6931471805599453d), d16) << 1) - 1) >>> (i15 ^ ((i15 ^ 63) & (-((63 - i15) >>> 31))));
        int i16 = 64;
        do {
            i16 -= 8;
            iPrng_get_u8 = (falconRNG.prng_get_u8() & 255) - (((int) (jFpr_expm_p63 >>> i16)) & GF2Field.MASK);
            if (iPrng_get_u8 != 0) {
                break;
            }
        } while (i16 > 0);
        return iPrng_get_u8 >>> 31;
    }

    static int gaussian0_sampler(FalconRNG falconRNG) {
        int[] iArr = {10745844, 3068844, 3741698, 5559083, 1580863, 8248194, 2260429, 13669192, 2736639, 708981, 4421575, 10046180, 169348, 7122675, 4136815, 30538, 13063405, 7650655, 4132, 14505003, 7826148, 417, 16768101, 11363290, 31, 8444042, 8086568, 1, 12844466, 265321, 0, 1232676, 13644283, 0, 38047, 9111839, 0, 870, 6138264, 0, 14, 12545723, 0, 0, 3104126, 0, 0, 28824, 0, 0, 198, 0, 0, 1};
        long jPrng_get_u64 = falconRNG.prng_get_u64();
        int i15 = ((int) jPrng_get_u64) & 16777215;
        int i16 = 16777215 & ((int) (jPrng_get_u64 >>> 24));
        int iPrng_get_u8 = ((falconRNG.prng_get_u8() & 255) << 16) | ((int) (jPrng_get_u64 >>> 48));
        int i17 = 0;
        for (int i18 = 0; i18 < 54; i18 += 3) {
            i17 += ((iPrng_get_u8 - iArr[i18]) - (((i16 - iArr[i18 + 1]) - ((i15 - iArr[i18 + 2]) >>> 31)) >>> 31)) >>> 31;
        }
        return i17;
    }

    static int sample(SamplerCtx samplerCtx, double d15, double d16) {
        return sampler(samplerCtx, d15, d16);
    }

    private static int sampler(SamplerCtx samplerCtx, double d15, double d16) {
        int iGaussian0_sampler;
        int i15;
        double d17;
        int iFpr_floor = (int) FPREngine.fpr_floor(d15);
        double d18 = d15 - ((double) iFpr_floor);
        double d19 = d16 * d16 * 0.5d;
        double d25 = d16 * samplerCtx.sigma_min;
        do {
            iGaussian0_sampler = gaussian0_sampler(samplerCtx.f149457p);
            int iPrng_get_u8 = samplerCtx.f149457p.prng_get_u8() & 1;
            i15 = iPrng_get_u8 + (((iPrng_get_u8 << 1) - 1) * iGaussian0_sampler);
            d17 = ((double) i15) - d18;
        } while (BerExp(samplerCtx.f149457p, ((d17 * d17) * d19) - (((double) (iGaussian0_sampler * iGaussian0_sampler)) * 0.15086504887537272d), d25) == 0);
        return iFpr_floor + i15;
    }
}
