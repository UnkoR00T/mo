package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes5.dex */
public interface MultiBlockCipher extends BlockCipher {
    int getMultiBlockSize();

    int processBlocks(byte[] bArr, int i15, int i16, byte[] bArr2, int i17);
}
