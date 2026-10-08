package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes5.dex */
public interface Wrapper {
    String getAlgorithmName();

    void init(boolean z15, CipherParameters cipherParameters);

    byte[] unwrap(byte[] bArr, int i15, int i16);

    byte[] wrap(byte[] bArr, int i15, int i16);
}
