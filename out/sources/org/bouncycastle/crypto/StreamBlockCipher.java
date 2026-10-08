package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes5.dex */
public abstract class StreamBlockCipher extends DefaultMultiBlockCipher implements StreamCipher {
    private final BlockCipher cipher;

    protected StreamBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
    }

    protected abstract byte calculateByte(byte b15);

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
        int i18 = i15 + i16;
        if (i18 > bArr.length) {
            throw new DataLengthException("input buffer too small");
        }
        if (i17 + i16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        while (i15 < i18) {
            bArr2[i17] = calculateByte(bArr[i15]);
            i17++;
            i15++;
        }
        return i16;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public final byte returnByte(byte b15) {
        return calculateByte(b15);
    }
}
