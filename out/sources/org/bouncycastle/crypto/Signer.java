package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes5.dex */
public interface Signer {
    byte[] generateSignature();

    void init(boolean z15, CipherParameters cipherParameters);

    void reset();

    void update(byte b15);

    void update(byte[] bArr, int i15, int i16);

    boolean verifySignature(byte[] bArr);
}
