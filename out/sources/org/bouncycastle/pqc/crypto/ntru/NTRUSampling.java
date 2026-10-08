package org.bouncycastle.pqc.crypto.ntru;

import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.math.ntru.HPSPolynomial;
import org.bouncycastle.pqc.math.ntru.HRSSPolynomial;
import org.bouncycastle.pqc.math.ntru.Polynomial;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHPSParameterSet;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHRSSParameterSet;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class NTRUSampling {
    private final NTRUParameterSet params;

    public NTRUSampling(NTRUParameterSet nTRUParameterSet) {
        this.params = nTRUParameterSet;
    }

    private static int mod3(int i15) {
        return i15 % 3;
    }

    public PolynomialPair sampleFg(byte[] bArr) {
        NTRUParameterSet nTRUParameterSet = this.params;
        if (nTRUParameterSet instanceof NTRUHRSSParameterSet) {
            return new PolynomialPair(sampleIidPlus(Arrays.copyOfRange(bArr, 0, nTRUParameterSet.sampleIidBytes())), sampleIidPlus(Arrays.copyOfRange(bArr, this.params.sampleIidBytes(), bArr.length)));
        }
        if (nTRUParameterSet instanceof NTRUHPSParameterSet) {
            return new PolynomialPair((HPSPolynomial) sampleIid(Arrays.copyOfRange(bArr, 0, nTRUParameterSet.sampleIidBytes())), sampleFixedType(Arrays.copyOfRange(bArr, this.params.sampleIidBytes(), bArr.length)));
        }
        throw new IllegalArgumentException("Invalid polynomial type");
    }

    public HPSPolynomial sampleFixedType(byte[] bArr) {
        int i15;
        int i16;
        int iN = this.params.n();
        int iWeight = ((NTRUHPSParameterSet) this.params).weight();
        HPSPolynomial hPSPolynomial = new HPSPolynomial((NTRUHPSParameterSet) this.params);
        int i17 = iN - 1;
        int[] iArr = new int[i17];
        int i18 = 0;
        while (true) {
            i15 = i17 / 4;
            if (i18 >= i15) {
                break;
            }
            int i19 = i18 * 4;
            int i25 = i18 * 15;
            iArr[i19] = ((bArr[i25] & 255) << 2) + ((bArr[i25 + 1] & 255) << 10) + ((bArr[i25 + 2] & 255) << 18) + ((bArr[i25 + 3] & 255) << 26);
            iArr[i19 + 1] = ((bArr[(i18 * 3) + 15] & 192) >> 4) + ((bArr[i25 + 4] & 255) << 4) + ((bArr[i25 + 5] & 255) << 12) + ((bArr[i25 + 6] & 255) << 20) + ((bArr[i25 + 7] & 255) << 28);
            int i26 = ((bArr[(i18 * 7) + 15] & 240) >> 2) + ((bArr[i25 + 8] & 255) << 6) + ((bArr[i25 + 9] & 255) << 14) + ((bArr[i25 + 10] & 255) << 22);
            byte b15 = bArr[i25 + 11];
            iArr[i19 + 2] = i26 + ((b15 & 255) << 30);
            iArr[i19 + 3] = (b15 & 252) + ((bArr[i25 + 12] & 255) << 8) + ((bArr[i25 + 13] & 255) << 16) + ((bArr[i25 + 14] & 255) << 24);
            i18++;
        }
        int i27 = i15 * 4;
        if (i17 > i27) {
            int i28 = i15 * 15;
            iArr[i27] = ((bArr[i28] & 255) << 2) + ((bArr[i28 + 1] & 255) << 10) + ((bArr[i28 + 2] & 255) << 18) + ((bArr[i28 + 3] & 255) << 26);
            iArr[i27 + 1] = ((bArr[(i15 * 3) + 15] & 192) >> 4) + ((bArr[i28 + 4] & 255) << 4) + ((bArr[i28 + 5] & 255) << 12) + ((bArr[i28 + 6] & 255) << 20) + ((bArr[i28 + 7] & 255) << 28);
        }
        int i29 = 0;
        while (true) {
            i16 = iWeight / 2;
            if (i29 >= i16) {
                break;
            }
            iArr[i29] = iArr[i29] | 1;
            i29++;
        }
        while (i16 < iWeight) {
            iArr[i16] = iArr[i16] | 2;
            i16++;
        }
        java.util.Arrays.sort(iArr);
        for (int i35 = 0; i35 < i17; i35++) {
            hPSPolynomial.coeffs[i35] = (short) (iArr[i35] & 3);
        }
        hPSPolynomial.coeffs[i17] = 0;
        return hPSPolynomial;
    }

    public Polynomial sampleIid(byte[] bArr) {
        Polynomial polynomialCreatePolynomial = this.params.createPolynomial();
        for (int i15 = 0; i15 < this.params.n() - 1; i15++) {
            polynomialCreatePolynomial.coeffs[i15] = (short) mod3(bArr[i15] & 255);
        }
        polynomialCreatePolynomial.coeffs[this.params.n() - 1] = 0;
        return polynomialCreatePolynomial;
    }

    public HRSSPolynomial sampleIidPlus(byte[] bArr) {
        int i15;
        int iN = this.params.n();
        HRSSPolynomial hRSSPolynomial = (HRSSPolynomial) sampleIid(bArr);
        int i16 = 0;
        while (true) {
            i15 = iN - 1;
            if (i16 >= i15) {
                break;
            }
            short[] sArr = hRSSPolynomial.coeffs;
            short s15 = sArr[i16];
            sArr[i16] = (short) (s15 | (-(s15 >>> 1)));
            i16++;
        }
        int i17 = 0;
        short s16 = 0;
        while (i17 < i15) {
            short[] sArr2 = hRSSPolynomial.coeffs;
            int i18 = i17 + 1;
            s16 = (short) (s16 + ((short) (sArr2[i18] * sArr2[i17])));
            i17 = i18;
        }
        short s17 = (short) ((-((s16 & HPKE.aead_EXPORT_ONLY) >>> 15)) | 1);
        for (int i19 = 0; i19 < i15; i19 += 2) {
            short[] sArr3 = hRSSPolynomial.coeffs;
            sArr3[i19] = (short) (sArr3[i19] * s17);
        }
        for (int i25 = 0; i25 < i15; i25++) {
            short[] sArr4 = hRSSPolynomial.coeffs;
            short s18 = sArr4[i25];
            sArr4[i25] = (short) ((((s18 & HPKE.aead_EXPORT_ONLY) >>> 15) ^ (s18 & HPKE.aead_EXPORT_ONLY)) & 3);
        }
        return hRSSPolynomial;
    }

    public PolynomialPair sampleRm(byte[] bArr) {
        NTRUParameterSet nTRUParameterSet = this.params;
        if (nTRUParameterSet instanceof NTRUHRSSParameterSet) {
            return new PolynomialPair((HRSSPolynomial) sampleIid(Arrays.copyOfRange(bArr, 0, nTRUParameterSet.sampleIidBytes())), (HRSSPolynomial) sampleIid(Arrays.copyOfRange(bArr, this.params.sampleIidBytes(), bArr.length)));
        }
        if (nTRUParameterSet instanceof NTRUHPSParameterSet) {
            return new PolynomialPair((HPSPolynomial) sampleIid(Arrays.copyOfRange(bArr, 0, nTRUParameterSet.sampleIidBytes())), sampleFixedType(Arrays.copyOfRange(bArr, this.params.sampleIidBytes(), bArr.length)));
        }
        throw new IllegalArgumentException("Invalid polynomial type");
    }
}
