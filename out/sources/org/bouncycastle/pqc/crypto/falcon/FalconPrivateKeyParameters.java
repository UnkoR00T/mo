package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class FalconPrivateKeyParameters extends FalconKeyParameters {
    private final byte[] F;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f149449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f149450g;

    /* JADX INFO: renamed from: pk, reason: collision with root package name */
    private final byte[] f149451pk;

    public FalconPrivateKeyParameters(FalconParameters falconParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(true, falconParameters);
        this.f149449f = Arrays.clone(bArr);
        this.f149450g = Arrays.clone(bArr2);
        this.F = Arrays.clone(bArr3);
        this.f149451pk = Arrays.clone(bArr4);
    }

    public byte[] getEncoded() {
        return Arrays.concatenate(this.f149449f, this.f149450g, this.F);
    }

    public byte[] getG() {
        return Arrays.clone(this.f149450g);
    }

    public byte[] getPublicKey() {
        return Arrays.clone(this.f149451pk);
    }

    public byte[] getSpolyF() {
        return Arrays.clone(this.F);
    }

    public byte[] getSpolyf() {
        return Arrays.clone(this.f149449f);
    }
}
