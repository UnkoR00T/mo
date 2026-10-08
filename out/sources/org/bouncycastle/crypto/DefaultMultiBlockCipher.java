package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes5.dex */
public abstract class DefaultMultiBlockCipher implements MultiBlockCipher {
    protected DefaultMultiBlockCipher() {
    }

    @Override // org.bouncycastle.crypto.MultiBlockCipher
    public int getMultiBlockSize() {
        return getBlockSize();
    }

    @Override // org.bouncycastle.crypto.MultiBlockCipher
    public int processBlocks(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
        int blockSize = getBlockSize();
        int i18 = i16 * blockSize;
        if (bArr == bArr2) {
            bArr = new byte[i18];
            System.arraycopy(bArr2, i15, bArr, 0, i18);
            i15 = 0;
        }
        int iProcessBlock = 0;
        for (int i19 = 0; i19 != i16; i19++) {
            iProcessBlock += processBlock(bArr, i15, bArr2, i17 + iProcessBlock);
            i15 += blockSize;
        }
        return iProcessBlock;
    }
}
