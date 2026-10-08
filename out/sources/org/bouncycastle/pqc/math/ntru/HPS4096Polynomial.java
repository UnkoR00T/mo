package org.bouncycastle.pqc.math.ntru;

import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHPSParameterSet;

/* JADX INFO: loaded from: classes5.dex */
public class HPS4096Polynomial extends HPSPolynomial {
    public HPS4096Polynomial(NTRUHPSParameterSet nTRUHPSParameterSet) {
        super(nTRUHPSParameterSet);
    }

    @Override // org.bouncycastle.pqc.math.ntru.HPSPolynomial, org.bouncycastle.pqc.math.ntru.Polynomial
    public void sqFromBytes(byte[] bArr) {
        for (int i15 = 0; i15 < this.params.packDegree() / 2; i15++) {
            short[] sArr = this.coeffs;
            int i16 = i15 * 2;
            int i17 = i15 * 3;
            int i18 = bArr[i17] & 255;
            byte b15 = bArr[i17 + 1];
            sArr[i16] = (short) (i18 | ((((short) (b15 & 255)) & 15) << 8));
            sArr[i16 + 1] = (short) (((((short) (bArr[i17 + 2] & 255)) & 255) << 4) | ((b15 & 255) >>> 4));
        }
        this.coeffs[this.params.n() - 1] = 0;
    }

    @Override // org.bouncycastle.pqc.math.ntru.HPSPolynomial, org.bouncycastle.pqc.math.ntru.Polynomial
    public byte[] sqToBytes(int i15) {
        byte[] bArr = new byte[i15];
        int iQ = this.params.q();
        for (int i16 = 0; i16 < this.params.packDegree() / 2; i16++) {
            int i17 = i16 * 3;
            int i18 = i16 * 2;
            bArr[i17] = (byte) (Polynomial.modQ(this.coeffs[i18] & HPKE.aead_EXPORT_ONLY, iQ) & GF2Field.MASK);
            int iModQ = Polynomial.modQ(this.coeffs[i18] & HPKE.aead_EXPORT_ONLY, iQ) >>> 8;
            int i19 = i18 + 1;
            bArr[i17 + 1] = (byte) (iModQ | ((Polynomial.modQ(this.coeffs[i19] & HPKE.aead_EXPORT_ONLY, iQ) & 15) << 4));
            bArr[i17 + 2] = (byte) (Polynomial.modQ(this.coeffs[i19] & HPKE.aead_EXPORT_ONLY, iQ) >>> 4);
        }
        return bArr;
    }
}
