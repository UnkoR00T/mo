package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes5.dex */
public class BufferedBlockCipher {
    protected byte[] buf;
    protected int bufOff;
    protected BlockCipher cipher;
    protected boolean forEncryption;
    protected MultiBlockCipher mbCipher;
    protected boolean partialBlockOkay;
    protected boolean pgpCFB;

    BufferedBlockCipher() {
    }

    private int processBuffer(byte[] bArr, int i15) {
        this.bufOff = 0;
        MultiBlockCipher multiBlockCipher = this.mbCipher;
        if (multiBlockCipher == null) {
            return this.cipher.processBlock(this.buf, 0, bArr, i15);
        }
        byte[] bArr2 = this.buf;
        return multiBlockCipher.processBlocks(bArr2, 0, bArr2.length / multiBlockCipher.getBlockSize(), bArr, i15);
    }

    public int doFinal(byte[] bArr, int i15) {
        byte[] bArr2;
        int i16;
        int iProcessBlocks;
        int blockSize;
        try {
            int i17 = this.bufOff;
            if (i15 + i17 > bArr.length) {
                throw new OutputLengthException("output buffer too short for doFinal()");
            }
            int i18 = 0;
            if (i17 != 0) {
                MultiBlockCipher multiBlockCipher = this.mbCipher;
                if (multiBlockCipher != null) {
                    int blockSize2 = i17 / multiBlockCipher.getBlockSize();
                    bArr2 = bArr;
                    i16 = i15;
                    iProcessBlocks = this.mbCipher.processBlocks(this.buf, 0, blockSize2, bArr2, i16);
                    blockSize = blockSize2 * this.mbCipher.getBlockSize();
                } else {
                    bArr2 = bArr;
                    i16 = i15;
                    iProcessBlocks = 0;
                    blockSize = 0;
                }
                if (this.bufOff != blockSize) {
                    if (!this.partialBlockOkay) {
                        throw new DataLengthException("data not block size aligned");
                    }
                    BlockCipher blockCipher = this.cipher;
                    byte[] bArr3 = this.buf;
                    blockCipher.processBlock(bArr3, blockSize, bArr3, blockSize);
                    System.arraycopy(this.buf, blockSize, bArr2, i16 + iProcessBlocks, this.bufOff - blockSize);
                    iProcessBlocks += this.bufOff - blockSize;
                    this.bufOff = 0;
                }
                i18 = iProcessBlocks;
            }
            reset();
            return i18;
        } catch (Throwable th4) {
            reset();
            throw th4;
        }
    }

    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    public int getOutputSize(int i15) {
        int blockSize;
        if (this.pgpCFB && this.forEncryption) {
            i15 += this.bufOff;
            blockSize = this.cipher.getBlockSize() + 2;
        } else {
            blockSize = this.bufOff;
        }
        return i15 + blockSize;
    }

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    public int getUpdateOutputSize(int i15) {
        int length;
        int i16 = i15 + this.bufOff;
        if (this.pgpCFB && this.forEncryption) {
            length = (i16 % this.buf.length) - (this.cipher.getBlockSize() + 2);
        } else {
            int length2 = this.buf.length;
            length = i16 % length2;
        }
        return i16 - length;
    }

    public void init(boolean z15, CipherParameters cipherParameters) {
        this.forEncryption = z15;
        reset();
        this.cipher.init(z15, cipherParameters);
    }

    public int processByte(byte b15, byte[] bArr, int i15) {
        byte[] bArr2 = this.buf;
        int i16 = this.bufOff;
        int i17 = i16 + 1;
        this.bufOff = i17;
        bArr2[i16] = b15;
        if (i17 == bArr2.length) {
            return processBuffer(bArr, i15);
        }
        return 0;
    }

    public int processBytes(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
        byte[] bArr3;
        int i18;
        int i19;
        int i25;
        if (i16 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = getBlockSize();
        int updateOutputSize = getUpdateOutputSize(i16);
        if (updateOutputSize > 0 && updateOutputSize + i17 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        byte[] bArr4 = this.buf;
        int length = bArr4.length;
        int i26 = this.bufOff;
        int i27 = length - i26;
        int iProcessBuffer = 0;
        if (i16 > i27) {
            if (i26 != 0) {
                System.arraycopy(bArr, i15, bArr4, i26, i27);
                i25 = i15 + i27;
                i19 = i16 - i27;
            } else {
                i25 = i15;
                i19 = i16;
            }
            if (bArr == bArr2) {
                byte[] bArr5 = new byte[i19];
                System.arraycopy(bArr2, i25, bArr5, 0, i19);
                bArr3 = bArr5;
                i18 = 0;
            } else {
                i18 = i25;
                bArr3 = bArr;
            }
            iProcessBuffer = this.bufOff != 0 ? processBuffer(bArr2, i17) : 0;
            MultiBlockCipher multiBlockCipher = this.mbCipher;
            if (multiBlockCipher != null) {
                int multiBlockSize = (this.mbCipher.getMultiBlockSize() / blockSize) * (i19 / multiBlockCipher.getMultiBlockSize());
                if (multiBlockSize > 0) {
                    iProcessBuffer += this.mbCipher.processBlocks(bArr3, i18, multiBlockSize, bArr2, i17 + iProcessBuffer);
                    int i28 = multiBlockSize * blockSize;
                    i19 -= i28;
                    i18 += i28;
                }
            } else {
                while (i19 > this.buf.length) {
                    iProcessBuffer += this.cipher.processBlock(bArr3, i18, bArr2, i17 + iProcessBuffer);
                    i19 -= blockSize;
                    i18 += blockSize;
                }
            }
        } else {
            bArr3 = bArr;
            i18 = i15;
            i19 = i16;
        }
        System.arraycopy(bArr3, i18, this.buf, this.bufOff, i19);
        int i29 = this.bufOff + i19;
        this.bufOff = i29;
        return i29 == this.buf.length ? iProcessBuffer + processBuffer(bArr2, i17 + iProcessBuffer) : iProcessBuffer;
    }

    public void reset() {
        int i15 = 0;
        while (true) {
            byte[] bArr = this.buf;
            if (i15 >= bArr.length) {
                this.bufOff = 0;
                this.cipher.reset();
                return;
            } else {
                bArr[i15] = 0;
                i15++;
            }
        }
    }

    public BufferedBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        if (blockCipher instanceof MultiBlockCipher) {
            MultiBlockCipher multiBlockCipher = (MultiBlockCipher) blockCipher;
            this.mbCipher = multiBlockCipher;
            this.buf = new byte[multiBlockCipher.getMultiBlockSize()];
        } else {
            this.mbCipher = null;
            this.buf = new byte[blockCipher.getBlockSize()];
        }
        boolean z15 = false;
        this.bufOff = 0;
        String algorithmName = blockCipher.getAlgorithmName();
        int iIndexOf = algorithmName.indexOf(47) + 1;
        boolean z16 = iIndexOf > 0 && algorithmName.startsWith("PGP", iIndexOf);
        this.pgpCFB = z16;
        if (z16 || (blockCipher instanceof StreamCipher)) {
            this.partialBlockOkay = true;
            return;
        }
        if (iIndexOf > 0 && algorithmName.startsWith("OpenPGP", iIndexOf)) {
            z15 = true;
        }
        this.partialBlockOkay = z15;
    }
}
