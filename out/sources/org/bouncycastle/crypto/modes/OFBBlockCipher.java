package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes5.dex */
public class OFBBlockCipher extends StreamBlockCipher {
    private byte[] IV;
    private final int blockSize;
    private int byteCount;
    private final BlockCipher cipher;
    private byte[] ofbOutV;
    private byte[] ofbV;

    public OFBBlockCipher(BlockCipher blockCipher, int i15) {
        super(blockCipher);
        if (i15 > blockCipher.getBlockSize() * 8 || i15 < 8 || i15 % 8 != 0) {
            throw new IllegalArgumentException("0FB" + i15 + " not supported");
        }
        this.cipher = blockCipher;
        this.blockSize = i15 / 8;
        this.IV = new byte[blockCipher.getBlockSize()];
        this.ofbV = new byte[blockCipher.getBlockSize()];
        this.ofbOutV = new byte[blockCipher.getBlockSize()];
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    protected byte calculateByte(byte b15) {
        if (this.byteCount == 0) {
            this.cipher.processBlock(this.ofbV, 0, this.ofbOutV, 0);
        }
        byte[] bArr = this.ofbOutV;
        int i15 = this.byteCount;
        int i16 = i15 + 1;
        this.byteCount = i16;
        byte b16 = (byte) (b15 ^ bArr[i15]);
        int i17 = this.blockSize;
        if (i16 == i17) {
            this.byteCount = 0;
            byte[] bArr2 = this.ofbV;
            System.arraycopy(bArr2, i17, bArr2, 0, bArr2.length - i17);
            byte[] bArr3 = this.ofbOutV;
            byte[] bArr4 = this.ofbV;
            int length = bArr4.length;
            int i18 = this.blockSize;
            System.arraycopy(bArr3, 0, bArr4, length - i18, i18);
        }
        return b16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/OFB" + (this.blockSize * 8);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        BlockCipher blockCipher;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv4 = parametersWithIV.getIV();
            int length = iv4.length;
            byte[] bArr = this.IV;
            if (length < bArr.length) {
                System.arraycopy(iv4, 0, bArr, bArr.length - iv4.length, iv4.length);
                int i15 = 0;
                while (true) {
                    byte[] bArr2 = this.IV;
                    if (i15 >= bArr2.length - iv4.length) {
                        break;
                    }
                    bArr2[i15] = 0;
                    i15++;
                }
            } else {
                System.arraycopy(iv4, 0, bArr, 0, bArr.length);
            }
            reset();
            if (parametersWithIV.getParameters() == null) {
                return;
            }
            blockCipher = this.cipher;
            cipherParameters = parametersWithIV.getParameters();
        } else {
            reset();
            if (cipherParameters == null) {
                return;
            } else {
                blockCipher = this.cipher;
            }
        }
        blockCipher.init(true, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        processBytes(bArr, i15, this.blockSize, bArr2, i16);
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        byte[] bArr = this.IV;
        System.arraycopy(bArr, 0, this.ofbV, 0, bArr.length);
        this.byteCount = 0;
        this.cipher.reset();
    }
}
