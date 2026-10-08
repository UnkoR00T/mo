package org.bouncycastle.crypto.params;

/* JADX INFO: loaded from: classes5.dex */
public class IESWithCipherParameters extends IESParameters {
    private int cipherKeySize;

    public IESWithCipherParameters(byte[] bArr, byte[] bArr2, int i15, int i16) {
        super(bArr, bArr2, i15);
        this.cipherKeySize = i16;
    }

    public int getCipherKeySize() {
        return this.cipherKeySize;
    }
}
