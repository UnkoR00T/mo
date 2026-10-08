package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes5.dex */
public class BufferedAsymmetricBlockCipher {
    protected byte[] buf;
    protected int bufOff;
    private final AsymmetricBlockCipher cipher;

    public BufferedAsymmetricBlockCipher(AsymmetricBlockCipher asymmetricBlockCipher) {
        this.cipher = asymmetricBlockCipher;
    }

    public byte[] doFinal() {
        byte[] bArrProcessBlock = this.cipher.processBlock(this.buf, 0, this.bufOff);
        reset();
        return bArrProcessBlock;
    }

    public int getBufferPosition() {
        return this.bufOff;
    }

    public int getInputBlockSize() {
        return this.cipher.getInputBlockSize();
    }

    public int getOutputBlockSize() {
        return this.cipher.getOutputBlockSize();
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    public void init(boolean z15, CipherParameters cipherParameters) {
        reset();
        this.cipher.init(z15, cipherParameters);
        this.buf = new byte[this.cipher.getInputBlockSize() + (z15 ? 1 : 0)];
        this.bufOff = 0;
    }

    public void processByte(byte b15) {
        int i15 = this.bufOff;
        byte[] bArr = this.buf;
        if (i15 >= bArr.length) {
            throw new DataLengthException("attempt to process message too long for cipher");
        }
        this.bufOff = i15 + 1;
        bArr[i15] = b15;
    }

    public void processBytes(byte[] bArr, int i15, int i16) {
        if (i16 == 0) {
            return;
        }
        if (i16 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int i17 = this.bufOff;
        int i18 = i17 + i16;
        byte[] bArr2 = this.buf;
        if (i18 > bArr2.length) {
            throw new DataLengthException("attempt to process message too long for cipher");
        }
        System.arraycopy(bArr, i15, bArr2, i17, i16);
        this.bufOff += i16;
    }

    public void reset() {
        if (this.buf != null) {
            int i15 = 0;
            while (true) {
                byte[] bArr = this.buf;
                if (i15 >= bArr.length) {
                    break;
                }
                bArr[i15] = 0;
                i15++;
            }
        }
        this.bufOff = 0;
    }
}
