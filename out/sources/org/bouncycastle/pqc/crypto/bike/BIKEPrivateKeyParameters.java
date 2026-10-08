package org.bouncycastle.pqc.crypto.bike;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class BIKEPrivateKeyParameters extends BIKEKeyParameters {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private byte[] f149434h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private byte[] f149435h1;
    private byte[] sigma;

    public BIKEPrivateKeyParameters(BIKEParameters bIKEParameters, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(true, bIKEParameters);
        this.f149434h0 = Arrays.clone(bArr);
        this.f149435h1 = Arrays.clone(bArr2);
        this.sigma = Arrays.clone(bArr3);
    }

    public byte[] getEncoded() {
        return Arrays.concatenate(this.f149434h0, this.f149435h1, this.sigma);
    }

    byte[] getH0() {
        return this.f149434h0;
    }

    byte[] getH1() {
        return this.f149435h1;
    }

    byte[] getSigma() {
        return this.sigma;
    }
}
