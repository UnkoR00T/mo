package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes5.dex */
class MacCFBBlockCipher {
    private byte[] IV;
    private int blockSize;
    private byte[] cfbOutV;
    private byte[] cfbV;
    private BlockCipher cipher;

    public MacCFBBlockCipher(BlockCipher blockCipher, int i15) {
        this.cipher = blockCipher;
        this.blockSize = i15 / 8;
        this.IV = new byte[blockCipher.getBlockSize()];
        this.cfbV = new byte[blockCipher.getBlockSize()];
        this.cfbOutV = new byte[blockCipher.getBlockSize()];
    }

    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/CFB" + (this.blockSize * 8);
    }

    public int getBlockSize() {
        return this.blockSize;
    }

    void getMacBlock(byte[] bArr) {
        this.cipher.processBlock(this.cfbV, 0, bArr, 0);
    }

    public void init(CipherParameters cipherParameters) {
        BlockCipher blockCipher;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv4 = parametersWithIV.getIV();
            int length = iv4.length;
            byte[] bArr = this.IV;
            if (length < bArr.length) {
                System.arraycopy(iv4, 0, bArr, bArr.length - iv4.length, iv4.length);
            } else {
                System.arraycopy(iv4, 0, bArr, 0, bArr.length);
            }
            reset();
            blockCipher = this.cipher;
            cipherParameters = parametersWithIV.getParameters();
        } else {
            reset();
            blockCipher = this.cipher;
        }
        blockCipher.init(true, cipherParameters);
    }

    public int processBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int i17 = this.blockSize;
        if (i15 + i17 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i17 + i16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        this.cipher.processBlock(this.cfbV, 0, this.cfbOutV, 0);
        int i18 = 0;
        while (true) {
            int i19 = this.blockSize;
            if (i18 >= i19) {
                byte[] bArr3 = this.cfbV;
                System.arraycopy(bArr3, i19, bArr3, 0, bArr3.length - i19);
                byte[] bArr4 = this.cfbV;
                int length = bArr4.length;
                int i25 = this.blockSize;
                System.arraycopy(bArr2, i16, bArr4, length - i25, i25);
                return this.blockSize;
            }
            bArr2[i16 + i18] = (byte) (this.cfbOutV[i18] ^ bArr[i15 + i18]);
            i18++;
        }
    }

    public void reset() {
        byte[] bArr = this.IV;
        System.arraycopy(bArr, 0, this.cfbV, 0, bArr.length);
        this.cipher.reset();
    }
}
