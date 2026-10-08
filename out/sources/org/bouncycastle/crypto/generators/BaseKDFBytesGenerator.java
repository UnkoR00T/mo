package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.DigestDerivationFunction;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.ISO18033KDFParameters;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class BaseKDFBytesGenerator implements DigestDerivationFunction {
    private int counterStart;
    private Digest digest;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f149072iv;
    private byte[] shared;

    protected BaseKDFBytesGenerator(int i15, Digest digest) {
        this.counterStart = i15;
        this.digest = digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i15, int i16) {
        int i17 = i16;
        int i18 = i15;
        if (bArr.length - i17 < i18) {
            throw new OutputLengthException("output buffer too small");
        }
        long j15 = i17;
        int digestSize = this.digest.getDigestSize();
        if (j15 > 8589934591L) {
            throw new IllegalArgumentException("Output length too large");
        }
        long j16 = digestSize;
        int i19 = (int) (((j15 + j16) - 1) / j16);
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        byte[] bArr3 = new byte[4];
        Pack.intToBigEndian(this.counterStart, bArr3, 0);
        int i25 = this.counterStart & (-256);
        for (int i26 = 0; i26 < i19; i26++) {
            Digest digest = this.digest;
            byte[] bArr4 = this.shared;
            digest.update(bArr4, 0, bArr4.length);
            this.digest.update(bArr3, 0, 4);
            byte[] bArr5 = this.f149072iv;
            if (bArr5 != null) {
                this.digest.update(bArr5, 0, bArr5.length);
            }
            this.digest.doFinal(bArr2, 0);
            if (i17 > digestSize) {
                System.arraycopy(bArr2, 0, bArr, i18, digestSize);
                i18 += digestSize;
                i17 -= digestSize;
            } else {
                System.arraycopy(bArr2, 0, bArr, i18, i17);
            }
            byte b15 = (byte) (bArr3[3] + 1);
            bArr3[3] = b15;
            if (b15 == 0) {
                i25 += 256;
                Pack.intToBigEndian(i25, bArr3, 0);
            }
        }
        this.digest.reset();
        return (int) j15;
    }

    @Override // org.bouncycastle.crypto.DigestDerivationFunction
    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (derivationParameters instanceof KDFParameters) {
            KDFParameters kDFParameters = (KDFParameters) derivationParameters;
            this.shared = kDFParameters.getSharedSecret();
            this.f149072iv = kDFParameters.getIV();
        } else {
            if (!(derivationParameters instanceof ISO18033KDFParameters)) {
                throw new IllegalArgumentException("KDF parameters required for generator");
            }
            this.shared = ((ISO18033KDFParameters) derivationParameters).getSeed();
            this.f149072iv = null;
        }
    }
}
