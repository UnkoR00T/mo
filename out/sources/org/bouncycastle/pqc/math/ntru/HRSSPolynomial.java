package org.bouncycastle.pqc.math.ntru;

import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHRSSParameterSet;

/* JADX INFO: loaded from: classes5.dex */
public class HRSSPolynomial extends Polynomial {
    public HRSSPolynomial(NTRUHRSSParameterSet nTRUHRSSParameterSet) {
        super(nTRUHRSSParameterSet);
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public void lift(Polynomial polynomial) {
        int length = this.coeffs.length;
        Polynomial polynomialCreatePolynomial = this.params.createPolynomial();
        short s15 = (short) (3 - (length % 3));
        short[] sArr = polynomialCreatePolynomial.coeffs;
        short[] sArr2 = polynomial.coeffs;
        int i15 = 0;
        int i16 = 2 - s15;
        int i17 = sArr2[0] * i16;
        short s16 = sArr2[1];
        short s17 = sArr2[2];
        sArr[0] = (short) (i17 + (s17 * s15));
        sArr[1] = (short) (s16 * i16);
        sArr[2] = (short) (s17 * i16);
        short s18 = 0;
        for (int i18 = 3; i18 < length; i18++) {
            short[] sArr3 = polynomialCreatePolynomial.coeffs;
            short s19 = sArr3[0];
            short[] sArr4 = polynomial.coeffs;
            sArr3[0] = (short) (s19 + (sArr4[i18] * ((s15 * 2) + s18)));
            int i19 = s18 + s15;
            sArr3[1] = (short) (sArr3[1] + (sArr4[i18] * i19));
            sArr3[2] = (short) (sArr3[2] + (sArr4[i18] * s18));
            s18 = (short) (i19 % 3);
        }
        short[] sArr5 = polynomialCreatePolynomial.coeffs;
        short s25 = sArr5[1];
        short[] sArr6 = polynomial.coeffs;
        short s26 = sArr6[0];
        int i25 = s15 + s18;
        sArr5[1] = (short) (s25 + (s26 * i25));
        short s27 = (short) (sArr5[2] + (s26 * s18));
        sArr5[2] = s27;
        sArr5[2] = (short) (s27 + (sArr6[1] * i25));
        for (int i26 = 3; i26 < length; i26++) {
            short[] sArr7 = polynomialCreatePolynomial.coeffs;
            short s28 = sArr7[i26 - 3];
            short[] sArr8 = polynomial.coeffs;
            sArr7[i26] = (short) (s28 + ((sArr8[i26] + sArr8[i26 - 1] + sArr8[i26 - 2]) * 2));
        }
        polynomialCreatePolynomial.mod3PhiN();
        polynomialCreatePolynomial.z3ToZq();
        this.coeffs[0] = (short) (-polynomialCreatePolynomial.coeffs[0]);
        while (i15 < length - 1) {
            short[] sArr9 = this.coeffs;
            int i27 = i15 + 1;
            short[] sArr10 = polynomialCreatePolynomial.coeffs;
            sArr9[i27] = (short) (sArr10[i15] - sArr10[i27]);
            i15 = i27;
        }
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public void sqFromBytes(byte[] bArr) {
        int i15 = 0;
        while (i15 < this.params.packDegree() / 8) {
            short[] sArr = this.coeffs;
            int i16 = i15 * 8;
            int i17 = i15 * 13;
            int i18 = bArr[i17] & 255;
            byte b15 = bArr[i17 + 1];
            sArr[i16] = (short) (i18 | ((((short) (b15 & 255)) & 31) << 8));
            int i19 = ((b15 & 255) >>> 5) | (((short) (bArr[i17 + 2] & 255)) << 3);
            byte b16 = bArr[i17 + 3];
            sArr[i16 + 1] = (short) (i19 | ((((short) (b16 & 255)) & 3) << 11));
            int i25 = (b16 & 255) >>> 2;
            byte b17 = bArr[i17 + 4];
            sArr[i16 + 2] = (short) (i25 | ((((short) (b17 & 255)) & 127) << 6));
            int i26 = ((b17 & 255) >>> 7) | (((short) (bArr[i17 + 5] & 255)) << 1);
            byte b18 = bArr[i17 + 6];
            sArr[i16 + 3] = (short) (i26 | ((((short) (b18 & 255)) & 15) << 9));
            int i27 = (((short) (bArr[i17 + 7] & 255)) << 4) | ((b18 & 255) >>> 4);
            byte b19 = bArr[i17 + 8];
            sArr[i16 + 4] = (short) (i27 | ((((short) (b19 & 255)) & 1) << 12));
            int i28 = (b19 & 255) >>> 1;
            byte b25 = bArr[i17 + 9];
            sArr[i16 + 5] = (short) (i28 | ((((short) (b25 & 255)) & 63) << 7));
            int i29 = (((short) (bArr[i17 + 10] & 255)) << 2) | ((b25 & 255) >>> 6);
            byte b26 = bArr[i17 + 11];
            sArr[i16 + 6] = (short) (i29 | ((((short) (b26 & 255)) & 7) << 10));
            sArr[i16 + 7] = (short) (((b26 & 255) >>> 3) | (((short) (bArr[i17 + 12] & 255)) << 5));
            i15++;
        }
        int iPackDegree = this.params.packDegree() & 7;
        if (iPackDegree == 2) {
            short[] sArr2 = this.coeffs;
            int i35 = i15 * 8;
            int i36 = i15 * 13;
            int i37 = bArr[i36] & 255;
            byte b27 = bArr[i36 + 1];
            sArr2[i35] = (short) (i37 | ((((short) (b27 & 255)) & 31) << 8));
            sArr2[i35 + 1] = (short) (((((short) (bArr[i36 + 3] & 255)) & 3) << 11) | ((b27 & 255) >>> 5) | (((short) (bArr[i36 + 2] & 255)) << 3));
        } else if (iPackDegree == 4) {
            short[] sArr3 = this.coeffs;
            int i38 = i15 * 8;
            int i39 = i15 * 13;
            int i45 = bArr[i39] & 255;
            byte b28 = bArr[i39 + 1];
            sArr3[i38] = (short) (i45 | ((((short) (b28 & 255)) & 31) << 8));
            int i46 = ((b28 & 255) >>> 5) | (((short) (bArr[i39 + 2] & 255)) << 3);
            byte b29 = bArr[i39 + 3];
            sArr3[i38 + 1] = (short) (i46 | ((((short) (b29 & 255)) & 3) << 11));
            byte b35 = bArr[i39 + 4];
            sArr3[i38 + 2] = (short) (((b29 & 255) >>> 2) | ((((short) (b35 & 255)) & 127) << 6));
            sArr3[i38 + 3] = (short) (((((short) (bArr[i39 + 6] & 255)) & 15) << 9) | ((b35 & 255) >>> 7) | (((short) (bArr[i39 + 5] & 255)) << 1));
        }
        this.coeffs[this.params.n() - 1] = 0;
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public byte[] sqToBytes(int i15) {
        byte[] bArr = new byte[i15];
        short[] sArr = new short[8];
        int i16 = 0;
        while (i16 < this.params.packDegree() / 8) {
            for (int i17 = 0; i17 < 8; i17++) {
                sArr[i17] = (short) Polynomial.modQ(this.coeffs[(i16 * 8) + i17] & HPKE.aead_EXPORT_ONLY, this.params.q());
            }
            int i18 = i16 * 13;
            short s15 = sArr[0];
            bArr[i18] = (byte) (s15 & 255);
            short s16 = sArr[1];
            bArr[i18 + 1] = (byte) ((s15 >>> 8) | ((s16 & 7) << 5));
            bArr[i18 + 2] = (byte) ((s16 >>> 3) & GF2Field.MASK);
            int i19 = s16 >>> 11;
            short s17 = sArr[2];
            bArr[i18 + 3] = (byte) (i19 | ((s17 & 63) << 2));
            short s18 = sArr[3];
            bArr[i18 + 4] = (byte) ((s17 >>> 6) | ((s18 & 1) << 7));
            bArr[i18 + 5] = (byte) ((s18 >>> 1) & GF2Field.MASK);
            int i25 = s18 >>> 9;
            short s19 = sArr[4];
            bArr[i18 + 6] = (byte) (i25 | ((s19 & 15) << 4));
            bArr[i18 + 7] = (byte) ((s19 >>> 4) & GF2Field.MASK);
            short s25 = sArr[5];
            bArr[i18 + 8] = (byte) ((s19 >>> 12) | ((s25 & 127) << 1));
            int i26 = s25 >>> 7;
            short s26 = sArr[6];
            bArr[i18 + 9] = (byte) (i26 | ((s26 & 3) << 6));
            bArr[i18 + 10] = (byte) ((s26 >>> 2) & GF2Field.MASK);
            short s27 = sArr[7];
            bArr[i18 + 11] = (byte) ((s26 >>> 10) | ((s27 & 31) << 3));
            bArr[i18 + 12] = (byte) (s27 >>> 5);
            i16++;
        }
        int i27 = 0;
        while (true) {
            int i28 = i16 * 8;
            if (i27 >= this.params.packDegree() - i28) {
                break;
            }
            sArr[i27] = (short) Polynomial.modQ(this.coeffs[i28 + i27] & HPKE.aead_EXPORT_ONLY, this.params.q());
            i27++;
        }
        while (i27 < 8) {
            sArr[i27] = 0;
            i27++;
        }
        int iPackDegree = this.params.packDegree() - ((this.params.packDegree() / 8) * 8);
        if (iPackDegree != 2) {
            if (iPackDegree != 4) {
                return bArr;
            }
            int i29 = i16 * 13;
            short s28 = sArr[0];
            bArr[i29] = (byte) (s28 & 255);
            short s29 = sArr[1];
            bArr[i29 + 1] = (byte) ((s28 >>> 8) | ((s29 & 7) << 5));
            bArr[i29 + 2] = (byte) ((s29 >>> 3) & GF2Field.MASK);
            int i35 = s29 >>> 11;
            short s35 = sArr[2];
            bArr[i29 + 3] = (byte) (i35 | ((s35 & 63) << 2));
            int i36 = s35 >>> 6;
            short s36 = sArr[3];
            bArr[i29 + 4] = (byte) (i36 | ((s36 & 1) << 7));
            bArr[i29 + 5] = (byte) ((s36 >>> 1) & GF2Field.MASK);
            bArr[i29 + 6] = (byte) ((s36 >>> 9) | ((sArr[4] & 15) << 4));
        }
        int i37 = i16 * 13;
        short s37 = sArr[0];
        bArr[i37] = (byte) (s37 & 255);
        int i38 = s37 >>> 8;
        short s38 = sArr[1];
        bArr[i37 + 1] = (byte) (i38 | ((s38 & 7) << 5));
        bArr[i37 + 2] = (byte) ((s38 >>> 3) & GF2Field.MASK);
        bArr[i37 + 3] = (byte) ((s38 >>> 11) | ((sArr[2] & 63) << 2));
        return bArr;
    }
}
