package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes5.dex */
public interface RawAgreement {
    void calculateAgreement(CipherParameters cipherParameters, byte[] bArr, int i15);

    int getAgreementSize();

    void init(CipherParameters cipherParameters);
}
