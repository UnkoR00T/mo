package org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.math.raw.Interleave;

/* JADX INFO: loaded from: classes5.dex */
final class GF13 extends GF {
    GF13() {
    }

    private int gf_mul_ext_par(short s15, short s16, short s17, short s18) {
        int i15 = (s16 & 1) * s15;
        int i16 = (s18 & 1) * s17;
        for (int i17 = 1; i17 < 13; i17++) {
            int i18 = 1 << i17;
            i15 ^= (s16 & i18) * s15;
            i16 ^= (i18 & s18) * s17;
        }
        return i15 ^ i16;
    }

    private short gf_sq2(short s15) {
        return gf_reduce(Interleave.expand16to32(gf_reduce(Interleave.expand16to32(s15))));
    }

    private short gf_sq2mul(short s15, short s16) {
        long j15 = s15;
        long j16 = s16;
        long j17 = (j16 << 18) * (64 & j15);
        long j18 = j15 ^ (j15 << 21);
        long j19 = ((j16 << 15) * (j18 & 8589934624L)) ^ (((((j17 ^ ((268435457 & j18) * j16)) ^ ((j16 << 3) * (536870914 & j18))) ^ ((j16 << 6) * (1073741828 & j18))) ^ ((j16 << 9) * (2147483656L & j18))) ^ ((j16 << 12) * (4294967312L & j18)));
        long j25 = 2305834213120671744L & j19;
        long j26 = j19 ^ ((j25 >>> 26) ^ (((j25 >>> 18) ^ (j25 >>> 20)) ^ (j25 >>> 24)));
        long j27 = 8796025913344L & j26;
        return gf_reduce(((int) (j26 ^ ((j27 >>> 26) ^ (((j27 >>> 18) ^ (j27 >>> 20)) ^ (j27 >>> 24))))) & 67108863);
    }

    private short gf_sqmul(short s15, short s16) {
        long j15 = s15;
        long j16 = s16;
        long j17 = (j16 << 6) * (64 & j15);
        long j18 = j15 ^ (j15 << 7);
        long j19 = ((j16 << 5) * (j18 & 524320)) ^ (((((j17 ^ ((16385 & j18) * j16)) ^ ((j16 << 1) * (32770 & j18))) ^ ((j16 << 2) * (65540 & j18))) ^ ((j16 << 3) * (131080 & j18))) ^ ((j16 << 4) * (262160 & j18)));
        long j25 = 137371844608L & j19;
        return gf_reduce(((int) (j19 ^ ((j25 >>> 26) ^ (((j25 >>> 18) ^ (j25 >>> 20)) ^ (j25 >>> 24))))) & 67108863);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected short gf_frac(short s15, short s16) {
        short sGf_sqmul = gf_sqmul(s15, s15);
        short sGf_sq2mul = gf_sq2mul(sGf_sqmul, sGf_sqmul);
        return gf_sqmul(gf_sq2mul(gf_sq2(gf_sq2mul(gf_sq2(sGf_sq2mul), sGf_sq2mul)), sGf_sq2mul), s16);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected short gf_inv(short s15) {
        return gf_frac(s15, (short) 1);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected short gf_mul(short s15, short s16) {
        int i15 = (s16 & 1) * s15;
        for (int i16 = 1; i16 < 13; i16++) {
            i15 ^= ((1 << i16) & s16) * s15;
        }
        return gf_reduce(i15);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected int gf_mul_ext(short s15, short s16) {
        int i15 = (s16 & 1) * s15;
        for (int i16 = 1; i16 < 13; i16++) {
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
            for (int i27 : iArr) {
                int i28 = (i25 - i15) + i27;
                iArr2[i28] = iArr2[i28] ^ i26;
            }
        }
        for (int i29 = 0; i29 < i15; i29++) {
            sArr[i29] = gf_reduce(iArr2[i29]);
        }
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    protected short gf_reduce(int i15) {
        int i16 = i15 & 8191;
        int i17 = i15 >>> 13;
        int i18 = ((i17 << 4) ^ (i17 << 3)) ^ (i17 << 1);
        int i19 = i18 >>> 13;
        return (short) ((((i17 ^ i16) ^ i19) ^ (i18 & 8191)) ^ (((i19 << 4) ^ (i19 << 3)) ^ (i19 << 1)));
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
            for (int i25 : iArr) {
                int i26 = (i18 - i15) + i25;
                iArr2[i26] = iArr2[i26] ^ i19;
            }
        }
        for (int i27 = 0; i27 < i15; i27++) {
            sArr[i27] = gf_reduce(iArr2[i27]);
        }
    }
}
