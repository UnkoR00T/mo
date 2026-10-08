package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes5.dex */
public interface Digest {
    int doFinal(byte[] bArr, int i15);

    String getAlgorithmName();

    int getDigestSize();

    void reset();

    void update(byte b15);

    void update(byte[] bArr, int i15, int i16);
}
