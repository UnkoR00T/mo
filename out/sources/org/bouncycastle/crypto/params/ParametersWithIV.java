package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes5.dex */
public class ParametersWithIV implements CipherParameters {

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f149189iv;
    private CipherParameters parameters;

    public ParametersWithIV(CipherParameters cipherParameters, byte[] bArr) {
        this(cipherParameters, bArr, 0, bArr.length);
    }

    public byte[] getIV() {
        return this.f149189iv;
    }

    public CipherParameters getParameters() {
        return this.parameters;
    }

    public ParametersWithIV(CipherParameters cipherParameters, byte[] bArr, int i15, int i16) {
        byte[] bArr2 = new byte[i16];
        this.f149189iv = bArr2;
        this.parameters = cipherParameters;
        System.arraycopy(bArr, i15, bArr2, 0, i16);
    }
}
