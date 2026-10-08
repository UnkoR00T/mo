package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes5.dex */
public interface AEADCipher {
    int doFinal(byte[] bArr, int i15);

    String getAlgorithmName();

    byte[] getMac();

    int getOutputSize(int i15);

    int getUpdateOutputSize(int i15);

    void init(boolean z15, CipherParameters cipherParameters);

    void processAADByte(byte b15);

    void processAADBytes(byte[] bArr, int i15, int i16);

    int processByte(byte b15, byte[] bArr, int i15);

    int processBytes(byte[] bArr, int i15, int i16, byte[] bArr2, int i17);

    void reset();
}
