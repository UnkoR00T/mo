package org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.math.raw.Interleave;

/* JADX INFO: loaded from: classes5.dex */
final class GF12 extends GF {
    GF12() {
    }

    private int gf_mul_ext_par(short s15, short s16, short s17, short s18) {
        int i15 = (s16 & 1) * s15;
        int i16 = (s18 & 1) * s17;
        for (int i17 = 1; i17 < 12; i17++) {
            int i18 = 1 << i17;
            i15 ^= (s16 & i18) * s15;
            i16 ^= (i18 & s18) * s17;
        }
        return i15 ^ i16;
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected short gf_frac(short s15, short s16) {
        return gf_mul(gf_inv(s15), s16);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected short gf_inv(short s15) {
        short sGf_mul = gf_mul(gf_sq(s15), s15);
        short sGf_mul2 = gf_mul(gf_sq(gf_sq(sGf_mul)), sGf_mul);
        return gf_sq(gf_mul(gf_sq(gf_mul(gf_sq(gf_sq(gf_mul(gf_sq(gf_sq(gf_sq(gf_sq(sGf_mul2)))), sGf_mul2))), sGf_mul)), s15));
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected short gf_mul(short s15, short s16) {
        int i15 = (s16 & 1) * s15;
        for (int i16 = 1; i16 < 12; i16++) {
            i15 ^= ((1 << i16) & s16) * s15;
        }
        return gf_reduce(i15);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected int gf_mul_ext(short s15, short s16) {
        int i15 = (s16 & 1) * s15;
        for (int i16 = 1; i16 < 12; i16++) {
            i15 ^= ((1 << i16) & s16) * s15;
        }
        return i15;
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected void gf_mul_poly(int i15, int[] iArr, short[] sArr, short[] sArr2, short[] sArr3, int[] iArr2) {
        iArr2[0] = gf_mul_ext(sArr2[0], sArr3[0]);
        for (int i16 = 1; i16 < i15; i16++) {
            int i17 = i16 + i16;
            iArr2[i17 - 1] = 0;
            short s15 = sArr2[i16];
            short s16 = sArr3[i16];
            for (int i18 = 0; i18 < i16; i18++) {
                int i19 = i16 + i18;
                iArr2[i19] = iArr2[i19] ^ gf_mul_ext_par(s15, sArr3[i18], sArr2[i18], s16);
            }
            iArr2[i17] = gf_mul_ext(s15, s16);
        }
        for (int i25 = (i15 - 1) * 2; i25 >= i15; i25--) {
            int i26 = iArr2[i25];
            for (int i27 = 0; i27 < iArr.length - 1; i27++) {
                int i28 = (i25 - i15) + iArr[i27];
                iArr2[i28] = iArr2[i28] ^ i26;
            }
            int i29 = i25 - i15;
            iArr2[i29] = (i26 << 1) ^ iArr2[i29];
        }
        for (int i35 = 0; i35 < i15; i35++) {
            sArr[i35] = gf_reduce(iArr2[i35]);
        }
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected short gf_reduce(int i15) {
        return (short) ((i15 >>> 21) ^ ((((i15 & 4095) ^ (i15 >>> 12)) ^ ((2093056 & i15) >>> 9)) ^ ((14680064 & i15) >>> 18)));
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected short gf_sq(short s15) {
        return gf_reduce(Interleave.expand16to32(s15));
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected int gf_sq_ext(short s15) {
        return Interleave.expand16to32(s15);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected void gf_sqr_poly(int i15, int[] iArr, short[] sArr, short[] sArr2, int[] iArr2) {
        iArr2[0] = gf_sq_ext(sArr2[0]);
        for (int i16 = 1; i16 < i15; i16++) {
            int i17 = i16 + i16;
            iArr2[i17 - 1] = 0;
            iArr2[i17] = gf_sq_ext(sArr2[i16]);
        }
        for (int i18 = (i15 - 1) * 2; i18 >= i15; i18--) {
            int i19 = iArr2[i18];
            for (int i25 = 0; i25 < iArr.length - 1; i25++) {
                int i26 = (i18 - i15) + iArr[i25];
                iArr2[i26] = iArr2[i26] ^ i19;
            }
            int i27 = i18 - i15;
            iArr2[i27] = (i19 << 1) ^ iArr2[i27];
        }
        for (int i28 = 0; i28 < i15; i28++) {
            sArr[i28] = gf_reduce(iArr2[i28]);
        }
    }
}
