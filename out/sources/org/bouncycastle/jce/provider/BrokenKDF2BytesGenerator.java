package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes5.dex */
public class BrokenKDF2BytesGenerator implements DerivationFunction {
    private Digest digest;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f149260iv;
    private byte[] shared;

    public BrokenKDF2BytesGenerator(Digest digest) {
        this.digest = digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i15, int i16) {
        if (bArr.length - i16 < i15) {
            throw new OutputLengthException("output buffer too small");
        }
        long j15 = ((long) i16) * 8;
        if (j15 > ((long) this.digest.getDigestSize()) * 17179869184L) {
            throw new IllegalArgumentException("Output length too large");
        }
        int digestSize = (int) (j15 / ((long) this.digest.getDigestSize()));
        int digestSize2 = this.digest.getDigestSize();
        byte[] bArr2 = new byte[digestSize2];
        for (int i17 = 1; i17 <= digestSize; i17++) {
            Digest digest = this.digest;
            byte[] bArr3 = this.shared;
            digest.update(bArr3, 0, bArr3.length);
            this.digest.update((byte) (i17 & GF2Field.MASK));
            this.digest.update((byte) ((i17 >> 8) & GF2Field.MASK));
            this.digest.update((byte) ((i17 >> 16) & GF2Field.MASK));
            this.digest.update((byte) ((i17 >> 24) & GF2Field.MASK));
            Digest digest2 = this.digest;
            byte[] bArr4 = this.f149260iv;
            digest2.update(bArr4, 0, bArr4.length);
            this.digest.doFinal(bArr2, 0);
            int i18 = i16 - i15;
            if (i18 > digestSize2) {
                System.arraycopy(bArr2, 0, bArr, i15, digestSize2);
                i15 += digestSize2;
            } else {
                System.arraycopy(bArr2, 0, bArr, i15, i18);
            }
        }
        this.digest.reset();
        return i16;
    }

    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof KDFParameters)) {
            throw new IllegalArgumentException("KDF parameters required for generator");
        }
        KDFParameters kDFParameters = (KDFParameters) derivationParameters;
        this.shared = kDFParameters.getSharedSecret();
        this.f149260iv = kDFParameters.getIV();
    }
}
