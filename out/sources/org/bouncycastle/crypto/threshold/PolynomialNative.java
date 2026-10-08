package org.bouncycastle.crypto.threshold;

import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes5.dex */
class PolynomialNative extends Polynomial {
    private final int IRREDUCIBLE;

    /* JADX INFO: renamed from: org.bouncycastle.crypto.threshold.PolynomialNative$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$threshold$ShamirSecretSplitter$Algorithm;

        static {
            int[] iArr = new int[ShamirSecretSplitter.Algorithm.values().length];
            $SwitchMap$org$bouncycastle$crypto$threshold$ShamirSecretSplitter$Algorithm = iArr;
            try {
                iArr[ShamirSecretSplitter.Algorithm.AES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$threshold$ShamirSecretSplitter$Algorithm[ShamirSecretSplitter.Algorithm.RSA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public PolynomialNative(ShamirSecretSplitter.Algorithm algorithm) {
        int i15;
        int i16 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$threshold$ShamirSecretSplitter$Algorithm[algorithm.ordinal()];
        if (i16 == 1) {
            i15 = 283;
        } else {
            if (i16 != 2) {
                throw new IllegalArgumentException("The algorithm is not correct");
            }
            i15 = 285;
        }
        this.IRREDUCIBLE = i15;
    }

    @Override // org.bouncycastle.crypto.threshold.Polynomial
    protected byte gfDiv(int i15, int i16) {
        return gfMul(i15, gfPow((byte) i16, (byte) -2) & 255);
    }

    @Override // org.bouncycastle.crypto.threshold.Polynomial
    protected byte gfMul(int i15, int i16) {
        int i17 = 0;
        while (i16 > 0) {
            if ((i16 & 1) != 0) {
                i17 ^= i15;
            }
            i15 <<= 1;
            if ((i15 & 256) != 0) {
                i15 ^= this.IRREDUCIBLE;
            }
            i16 >>= 1;
        }
        while (i17 >= 256) {
            if ((i17 & 256) != 0) {
                i17 ^= this.IRREDUCIBLE;
            }
            i17 <<= 1;
        }
        return (byte) (i17 & GF2Field.MASK);
    }
}
