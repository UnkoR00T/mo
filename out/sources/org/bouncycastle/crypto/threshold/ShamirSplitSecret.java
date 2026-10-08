package org.bouncycastle.crypto.threshold;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes5.dex */
public class ShamirSplitSecret implements SplitSecret {
    private final Polynomial poly;
    private final ShamirSplitSecretShare[] secretShares;

    ShamirSplitSecret(Polynomial polynomial, ShamirSplitSecretShare[] shamirSplitSecretShareArr) {
        this.secretShares = shamirSplitSecretShareArr;
        this.poly = polynomial;
    }

    public ShamirSplitSecret divide(int i15) {
        int i16 = 0;
        while (true) {
            ShamirSplitSecretShare[] shamirSplitSecretShareArr = this.secretShares;
            if (i16 >= shamirSplitSecretShareArr.length) {
                return this;
            }
            byte[] encoded = shamirSplitSecretShareArr[i16].getEncoded();
            for (int i17 = 0; i17 < encoded.length; i17++) {
                encoded[i17] = this.poly.gfDiv(encoded[i17] & 255, i15);
            }
            int i18 = i16 + 1;
            this.secretShares[i16] = new ShamirSplitSecretShare(encoded, i18);
            i16 = i18;
        }
    }

    @Override // org.bouncycastle.crypto.threshold.SplitSecret
    public byte[] getSecret() {
        ShamirSplitSecretShare[] shamirSplitSecretShareArr = this.secretShares;
        int length = shamirSplitSecretShareArr.length;
        byte[] bArr = new byte[length];
        int i15 = length - 1;
        byte[] bArr2 = new byte[i15];
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, length, shamirSplitSecretShareArr[0].getEncoded().length);
        for (int i16 = 0; i16 < length; i16++) {
            bArr3[i16] = this.secretShares[i16].getEncoded();
            byte b15 = 0;
            for (int i17 = 0; i17 < length; i17++) {
                if (i17 != i16) {
                    Polynomial polynomial = this.poly;
                    ShamirSplitSecretShare[] shamirSplitSecretShareArr2 = this.secretShares;
                    int i18 = shamirSplitSecretShareArr2[i17].f149211r;
                    bArr2[b15] = polynomial.gfDiv(i18, shamirSplitSecretShareArr2[i16].f149211r ^ i18);
                    b15 = (byte) (b15 + 1);
                }
            }
            byte bGfMul = 1;
            for (int i19 = 0; i19 != i15; i19++) {
                bGfMul = this.poly.gfMul(bGfMul & 255, bArr2[i19] & 255);
            }
            bArr[i16] = bGfMul;
        }
        return this.poly.gfVecMul(bArr, bArr3);
    }

    public ShamirSplitSecret multiple(int i15) {
        int i16 = 0;
        while (true) {
            ShamirSplitSecretShare[] shamirSplitSecretShareArr = this.secretShares;
            if (i16 >= shamirSplitSecretShareArr.length) {
                return this;
            }
            byte[] encoded = shamirSplitSecretShareArr[i16].getEncoded();
            for (int i17 = 0; i17 < encoded.length; i17++) {
                encoded[i17] = this.poly.gfMul(encoded[i17] & 255, i15);
            }
            int i18 = i16 + 1;
            this.secretShares[i16] = new ShamirSplitSecretShare(encoded, i18);
            i16 = i18;
        }
    }

    public ShamirSplitSecret(ShamirSecretSplitter.Algorithm algorithm, ShamirSecretSplitter.Mode mode, ShamirSplitSecretShare[] shamirSplitSecretShareArr) {
        this.secretShares = shamirSplitSecretShareArr;
        this.poly = Polynomial.newInstance(algorithm, mode);
    }

    @Override // org.bouncycastle.crypto.threshold.SplitSecret
    public ShamirSplitSecretShare[] getSecretShares() {
        return this.secretShares;
    }
}
