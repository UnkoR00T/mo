package org.bouncycastle.pqc.math.ntru;

import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHRSSParameterSet;

/* JADX INFO: loaded from: classes5.dex */
public class HRSS1373Polynomial extends HRSSPolynomial {
    private static final int K = 86;
    private static final int L = 1376;
    private static final int M = 344;

    public HRSS1373Polynomial(NTRUHRSSParameterSet nTRUHRSSParameterSet) {
        super(nTRUHRSSParameterSet);
    }

    @Override // org.bouncycastle.pqc.math.ntru.HRSSPolynomial, org.bouncycastle.pqc.math.ntru.Polynomial
    public void sqFromBytes(byte[] bArr) {
        int i15 = 0;
        while (i15 < this.params.packDegree() / 4) {
            short[] sArr = this.coeffs;
            int i16 = i15 * 4;
            int i17 = i15 * 7;
            int i18 = bArr[i17] & 255;
            byte b15 = bArr[i17 + 1];
            sArr[i16] = (short) (i18 | ((((short) (b15 & 255)) & 63) << 8));
            int i19 = ((b15 & 255) >>> 6) | (((short) (bArr[i17 + 2] & 255)) << 2);
            byte b16 = bArr[i17 + 3];
            sArr[i16 + 1] = (short) (i19 | (((short) (b16 & 15)) << 10));
            int i25 = ((b16 & 255) >>> 4) | ((((short) (bArr[i17 + 4] & 255)) & 255) << 4);
            byte b17 = bArr[i17 + 5];
            sArr[i16 + 2] = (short) (i25 | (((short) (b17 & 3)) << 12));
            sArr[i16 + 3] = (short) (((b17 & 255) >>> 2) | (((short) (bArr[i17 + 6] & 255)) << 6));
            i15++;
        }
        if (this.params.packDegree() % 4 == 2) {
            short[] sArr2 = this.coeffs;
            int i26 = i15 * 4;
            int i27 = i15 * 7;
            byte b18 = bArr[i27];
            byte b19 = bArr[i27 + 1];
            sArr2[i26] = (short) (b18 | ((b19 & 63) << 8));
            sArr2[i26 + 1] = (short) (((bArr[i27 + 3] & 15) << 10) | (bArr[i27 + 2] << 2) | (b19 >>> 6));
        }
        this.coeffs[this.params.n() - 1] = 0;
    }

    @Override // org.bouncycastle.pqc.math.ntru.HRSSPolynomial, org.bouncycastle.pqc.math.ntru.Polynomial
    public byte[] sqToBytes(int i15) {
        byte[] bArr = new byte[i15];
        short[] sArr = new short[4];
        int i16 = 0;
        while (i16 < this.params.packDegree() / 4) {
            for (int i17 = 0; i17 < 4; i17++) {
                sArr[i17] = (short) Polynomial.modQ(this.coeffs[(i16 * 4) + i17] & HPKE.aead_EXPORT_ONLY, this.params.q());
            }
            int i18 = i16 * 7;
            short s15 = sArr[0];
            bArr[i18] = (byte) (s15 & 255);
            short s16 = sArr[1];
            bArr[i18 + 1] = (byte) ((s15 >>> 8) | ((s16 & 3) << 6));
            bArr[i18 + 2] = (byte) ((s16 >>> 2) & GF2Field.MASK);
            short s17 = sArr[2];
            bArr[i18 + 3] = (byte) ((s16 >>> 10) | ((s17 & 15) << 4));
            bArr[i18 + 4] = (byte) ((s17 >>> 4) & GF2Field.MASK);
            short s18 = sArr[3];
            bArr[i18 + 5] = (byte) ((s17 >>> 12) | ((s18 & 63) << 2));
            bArr[i18 + 6] = (byte) (s18 >>> 6);
            i16++;
        }
        if (this.params.packDegree() % 4 == 2) {
            sArr[0] = (short) Polynomial.modQ(this.coeffs[this.params.packDegree() - 2] & HPKE.aead_EXPORT_ONLY, this.params.q());
            short sModQ = (short) Polynomial.modQ(this.coeffs[this.params.packDegree() - 1] & HPKE.aead_EXPORT_ONLY, this.params.q());
            sArr[1] = sModQ;
            int i19 = i16 * 7;
            short s19 = sArr[0];
            bArr[i19] = (byte) (s19 & 255);
            bArr[i19 + 1] = (byte) ((s19 >>> 8) | ((sModQ & 3) << 6));
            bArr[i19 + 2] = (byte) ((sModQ >>> 2) & GF2Field.MASK);
            bArr[i19 + 3] = (byte) (sModQ >>> 10);
        }
        return bArr;
    }
}
