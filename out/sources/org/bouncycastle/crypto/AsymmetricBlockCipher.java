package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes5.dex */
public interface AsymmetricBlockCipher {
    int getInputBlockSize();

    int getOutputBlockSize();

    void init(boolean z15, CipherParameters cipherParameters);

    byte[] processBlock(byte[] bArr, int i15, int i16);
}
