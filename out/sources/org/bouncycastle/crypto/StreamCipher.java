package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes5.dex */
public interface StreamCipher {
    String getAlgorithmName();

    void init(boolean z15, CipherParameters cipherParameters);

    int processBytes(byte[] bArr, int i15, int i16, byte[] bArr2, int i17);

    void reset();

    byte returnByte(byte b15);
}
