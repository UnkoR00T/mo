package org.bouncycastle.pqc.math.ntru;

import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHPSParameterSet;

/* JADX INFO: loaded from: classes5.dex */
public class HPSPolynomial extends Polynomial {
    public HPSPolynomial(NTRUHPSParameterSet nTRUHPSParameterSet) {
        super(nTRUHPSParameterSet);
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public void lift(Polynomial polynomial) {
        short[] sArr = this.coeffs;
        System.arraycopy(polynomial.coeffs, 0, sArr, 0, sArr.length);
        z3ToZq();
    }

    @Override // org.bouncycastle.pqc.math.ntru.Polynomial
    public void sqFromBytes(byte[] bArr) {
        int length = this.coeffs.length;
        int i15 = 0;
        while (i15 < this.params.packDegree() / 8) {
            short[] sArr = this.coeffs;
            int i16 = i15 * 8;
            int i17 = i15 * 11;
            int i18 = bArr[i17] & 255;
            byte b15 = bArr[i17 + 1];
            sArr[i16] = (short) (i18 | ((((short) (b15 & 255)) & 7) << 8));
            byte b16 = bArr[i17 + 2];
            sArr[i16 + 1] = (short) (((b15 & 255) >>> 3) | ((((short) (b16 & 255)) & 63) << 5));
            int i19 = ((b16 & 255) >>> 6) | ((((short) (bArr[i17 + 3] & 255)) & 255) << 2);
            byte b17 = bArr[i17 + 4];
            sArr[i16 + 2] = (short) (i19 | ((((short) (b17 & 255)) & 1) << 10));
            int i25 = (b17 & 255) >>> 1;
            byte b18 = bArr[i17 + 5];
            sArr[i16 + 3] = (short) (i25 | ((((short) (b18 & 255)) & 15) << 7));
            int i26 = (b18 & 255) >>> 4;
            byte b19 = bArr[i17 + 6];
            sArr[i16 + 4] = (short) (((((short) (b19 & 255)) & 127) << 4) | i26);
            int i27 = ((b19 & 255) >>> 7) | ((((short) (bArr[i17 + 7] & 255)) & 255) << 1);
            byte b25 = bArr[i17 + 8];
            sArr[i16 + 5] = (short) (i27 | ((((short) (b25 & 255)) & 3) << 9));
            byte b26 = bArr[i17 + 9];
            sArr[i16 + 6] = (short) (((b25 & 255) >>> 2) | ((((short) (b26 & 255)) & 31) << 6));
            sArr[i16 + 7] = (short) (((b26 & 255) >>> 5) | ((((short) (bArr[i17 + 10] & 255)) & 255) << 3));
            i15++;
        }
        int iPackDegree = this.params.packDegree() & 7;
        if (iPackDegree == 2) {
            short[] sArr2 = this.coeffs;
            int i28 = i15 * 8;
            int i29 = i15 * 11;
            int i35 = bArr[i29] & 255;
            byte b27 = bArr[i29 + 1];
            sArr2[i28] = (short) (i35 | ((((short) (b27 & 255)) & 7) << 8));
            sArr2[i28 + 1] = (short) (((((short) (bArr[i29 + 2] & 255)) & 63) << 5) | ((b27 & 255) >>> 3));
        } else if (iPackDegree == 4) {
            short[] sArr3 = this.coeffs;
            int i36 = i15 * 8;
            int i37 = i15 * 11;
            int i38 = bArr[i37] & 255;
            byte b28 = bArr[i37 + 1];
            sArr3[i36] = (short) (i38 | ((((short) (b28 & 255)) & 7) << 8));
            byte b29 = bArr[i37 + 2];
            sArr3[i36 + 1] = (short) (((b28 & 255) >>> 3) | ((((short) (b29 & 255)) & 63) << 5));
            int i39 = ((((short) (bArr[i37 + 3] & 255)) & 255) << 2) | ((b29 & 255) >>> 6);
            byte b35 = bArr[i37 + 4];
            sArr3[i36 + 2] = (short) (i39 | ((((short) (b35 & 255)) & 1) << 10));
            sArr3[i36 + 3] = (short) (((((short) (bArr[i37 + 5] & 255)) & 15) << 7) | ((b35 & 255) >>> 1));
        }
        this.coeffs[length - 1] = 0;
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
            int i18 = i16 * 11;
            short s15 = sArr[0];
            bArr[i18] = (byte) (s15 & 255);
            short s16 = sArr[1];
            bArr[i18 + 1] = (byte) ((s15 >>> 8) | ((s16 & 31) << 3));
            int i19 = s16 >>> 5;
            short s17 = sArr[2];
            bArr[i18 + 2] = (byte) (i19 | ((s17 & 3) << 6));
            bArr[i18 + 3] = (byte) ((s17 >>> 2) & GF2Field.MASK);
            int i25 = s17 >>> 10;
            short s18 = sArr[3];
            bArr[i18 + 4] = (byte) (i25 | ((s18 & 127) << 1));
            short s19 = sArr[4];
            bArr[i18 + 5] = (byte) ((s18 >>> 7) | ((s19 & 15) << 4));
            short s25 = sArr[5];
            bArr[i18 + 6] = (byte) ((s19 >>> 4) | ((s25 & 1) << 7));
            bArr[i18 + 7] = (byte) ((s25 >>> 1) & GF2Field.MASK);
            int i26 = s25 >>> 9;
            short s26 = sArr[6];
            bArr[i18 + 8] = (byte) (i26 | ((s26 & 63) << 2));
            short s27 = sArr[7];
            bArr[i18 + 9] = (byte) ((s26 >>> 6) | ((s27 & 7) << 5));
            bArr[i18 + 10] = (byte) (s27 >>> 3);
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
        int iPackDegree = this.params.packDegree() & 7;
        if (iPackDegree == 2) {
            int i29 = i16 * 11;
            short s28 = sArr[0];
            bArr[i29] = (byte) (s28 & 255);
            int i35 = s28 >>> 8;
            short s29 = sArr[1];
            bArr[i29 + 1] = (byte) (i35 | ((s29 & 31) << 3));
            bArr[i29 + 2] = (byte) ((s29 >>> 5) | ((sArr[2] & 3) << 6));
            return bArr;
        }
        if (iPackDegree != 4) {
            return bArr;
        }
        int i36 = i16 * 11;
        short s35 = sArr[0];
        bArr[i36] = (byte) (s35 & 255);
        int i37 = s35 >>> 8;
        short s36 = sArr[1];
        bArr[i36 + 1] = (byte) (i37 | ((s36 & 31) << 3));
        short s37 = sArr[2];
        bArr[i36 + 2] = (byte) ((s36 >>> 5) | ((s37 & 3) << 6));
        bArr[i36 + 3] = (byte) ((s37 >>> 2) & GF2Field.MASK);
        int i38 = s37 >>> 10;
        short s38 = sArr[3];
        bArr[i36 + 4] = (byte) (i38 | ((s38 & 127) << 1));
        bArr[i36 + 5] = (byte) ((s38 >>> 7) | ((sArr[4] & 15) << 4));
        return bArr;
    }
}
