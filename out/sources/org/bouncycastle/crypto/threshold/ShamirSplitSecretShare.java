package org.bouncycastle.crypto.threshold;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ShamirSplitSecretShare implements SecretShare {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final int f149211r;
    private final byte[] secretShare;

    public ShamirSplitSecretShare(byte[] bArr) {
        this.secretShare = Arrays.clone(bArr);
        this.f149211r = 1;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        return Arrays.clone(this.secretShare);
    }

    public ShamirSplitSecretShare(byte[] bArr, int i15) {
        this.secretShare = Arrays.clone(bArr);
        this.f149211r = i15;
    }
}
