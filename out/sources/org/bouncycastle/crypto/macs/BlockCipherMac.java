package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;

/* JADX INFO: loaded from: classes5.dex */
public class BlockCipherMac implements Mac {
    private byte[] buf;
    private int bufOff;
    private BlockCipher cipher;
    private byte[] mac;
    private int macSize;

    public BlockCipherMac(BlockCipher blockCipher) {
        this(blockCipher, (blockCipher.getBlockSize() * 8) / 2);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i15) {
        int blockSize = this.cipher.getBlockSize();
        while (true) {
            int i16 = this.bufOff;
            if (i16 >= blockSize) {
                this.cipher.processBlock(this.buf, 0, this.mac, 0);
                System.arraycopy(this.mac, 0, bArr, i15, this.macSize);
                reset();
                return this.macSize;
            }
            this.buf[i16] = 0;
            this.bufOff = i16 + 1;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.macSize;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        reset();
        this.cipher.init(true, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.Mac
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

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b15) {
        int i15 = this.bufOff;
        byte[] bArr = this.buf;
        if (i15 == bArr.length) {
            this.cipher.processBlock(bArr, 0, this.mac, 0);
            this.bufOff = 0;
        }
        byte[] bArr2 = this.buf;
        int i16 = this.bufOff;
        this.bufOff = i16 + 1;
        bArr2[i16] = b15;
    }

    public BlockCipherMac(BlockCipher blockCipher, int i15) {
        if (i15 % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        this.cipher = new CBCBlockCipher(blockCipher);
        this.macSize = i15 / 8;
        this.mac = new byte[blockCipher.getBlockSize()];
        this.buf = new byte[blockCipher.getBlockSize()];
        this.bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i15, int i16) {
        if (i16 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = this.cipher.getBlockSize();
        int i17 = this.bufOff;
        int i18 = blockSize - i17;
        if (i16 > i18) {
            System.arraycopy(bArr, i15, this.buf, i17, i18);
            this.cipher.processBlock(this.buf, 0, this.mac, 0);
            this.bufOff = 0;
            i16 -= i18;
            i15 += i18;
            while (i16 > blockSize) {
                this.cipher.processBlock(bArr, i15, this.mac, 0);
                i16 -= blockSize;
                i15 += blockSize;
            }
        }
        System.arraycopy(bArr, i15, this.buf, this.bufOff, i16);
        this.bufOff += i16;
    }
}
