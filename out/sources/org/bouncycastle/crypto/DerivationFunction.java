package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes5.dex */
public interface DerivationFunction {
    int generateBytes(byte[] bArr, int i15, int i16);

    void init(DerivationParameters derivationParameters);
}
