package org.bouncycastle.crypto.threshold;

import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes5.dex */
abstract class Polynomial {
    Polynomial() {
    }

    public static Polynomial newInstance(ShamirSecretSplitter.Algorithm algorithm, ShamirSecretSplitter.Mode mode) {
        return mode == ShamirSecretSplitter.Mode.Native ? new PolynomialNative(algorithm) : new PolynomialTable(algorithm);
    }

    protected abstract byte gfDiv(int i15, int i16);

    protected abstract byte gfMul(int i15, int i16);

    protected byte gfPow(int i15, byte b15) {
        byte bGfMul = 1;
        for (int i16 = 0; i16 < 8; i16++) {
            if (((1 << i16) & b15) != 0) {
                bGfMul = gfMul(bGfMul & 255, i15 & GF2Field.MASK);
            }
            int i17 = i15 & GF2Field.MASK;
            i15 = gfMul(i17, i17);
        }
        return bGfMul;
    }

    public byte[] gfVecMul(byte[] bArr, byte[][] bArr2) {
        byte[] bArr3 = new byte[bArr2[0].length];
        for (int i15 = 0; i15 < bArr2[0].length; i15++) {
            int iGfMul = 0;
            for (int i16 = 0; i16 < bArr.length; i16++) {
                iGfMul ^= gfMul(bArr[i16] & 255, bArr2[i16][i15] & 255);
            }
            bArr3[i15] = (byte) iGfMul;
        }
        return bArr3;
    }
}
