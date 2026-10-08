package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes5.dex */
public interface BlockCipher {
    String getAlgorithmName();

    int getBlockSize();

    void init(boolean z15, CipherParameters cipherParameters);

    int processBlock(byte[] bArr, int i15, byte[] bArr2, int i16);

    void reset();
}
