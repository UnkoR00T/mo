package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes5.dex */
public interface KeyEncapsulation {
    CipherParameters decrypt(byte[] bArr, int i15, int i16, int i17);

    CipherParameters encrypt(byte[] bArr, int i15, int i16);

    void init(CipherParameters cipherParameters);
}
