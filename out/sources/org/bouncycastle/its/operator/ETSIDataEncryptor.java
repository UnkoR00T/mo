package org.bouncycastle.its.operator;

/* JADX INFO: loaded from: classes5.dex */
public interface ETSIDataEncryptor {
    byte[] encrypt(byte[] bArr);

    byte[] getKey();

    byte[] getNonce();
}
