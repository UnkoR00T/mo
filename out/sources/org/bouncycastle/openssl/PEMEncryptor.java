package org.bouncycastle.openssl;

/* JADX INFO: loaded from: classes5.dex */
public interface PEMEncryptor {
    byte[] encrypt(byte[] bArr);

    String getAlgorithm();

    byte[] getIV();
}
