package org.bouncycastle.crypto.modes;

import android.R;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes5.dex */
public class GOFBBlockCipher extends StreamBlockCipher {
    static final int C1 = 16843012;
    static final int C2 = 16843009;
    private byte[] IV;
    int N3;
    int N4;
    private final int blockSize;
    private int byteCount;
    private final BlockCipher cipher;
    boolean firstStep;
    private byte[] ofbOutV;
    private byte[] ofbV;

    public GOFBBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.firstStep = true;
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        if (blockSize != 8) {
            throw new IllegalArgumentException("GCTR only for 64 bit block ciphers");
        }
        this.IV = new byte[blockCipher.getBlockSize()];
        this.ofbV = new byte[blockCipher.getBlockSize()];
        this.ofbOutV = new byte[blockCipher.getBlockSize()];
    }

    private int bytesToint(byte[] bArr, int i15) {
        return ((bArr[i15 + 3] << 24) & (-16777216)) + ((bArr[i15 + 2] << 16) & 16711680) + ((bArr[i15 + 1] << 8) & 65280) + (bArr[i15] & 255);
    }

    private void intTobytes(int i15, byte[] bArr, int i16) {
        bArr[i16 + 3] = (byte) (i15 >>> 24);
        bArr[i16 + 2] = (byte) (i15 >>> 16);
        bArr[i16 + 1] = (byte) (i15 >>> 8);
        bArr[i16] = (byte) i15;
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    protected byte calculateByte(byte b15) {
        if (this.byteCount == 0) {
            if (this.firstStep) {
                this.firstStep = false;
                this.cipher.processBlock(this.ofbV, 0, this.ofbOutV, 0);
                this.N3 = bytesToint(this.ofbOutV, 0);
                this.N4 = bytesToint(this.ofbOutV, 4);
            }
            int i15 = this.N3 + 16843009;
            this.N3 = i15;
            int i16 = this.N4;
            int i17 = i16 + 16843012;
            this.N4 = i17;
            if (i17 < 16843012 && i17 > 0) {
                this.N4 = i16 + R.attr.format;
            }
            intTobytes(i15, this.ofbV, 0);
            intTobytes(this.N4, this.ofbV, 4);
            this.cipher.processBlock(this.ofbV, 0, this.ofbOutV, 0);
        }
        byte[] bArr = this.ofbOutV;
        int i18 = this.byteCount;
        int i19 = i18 + 1;
        this.byteCount = i19;
        byte b16 = (byte) (b15 ^ bArr[i18]);
        int i25 = this.blockSize;
        if (i19 == i25) {
            this.byteCount = 0;
            byte[] bArr2 = this.ofbV;
            System.arraycopy(bArr2, i25, bArr2, 0, bArr2.length - i25);
            byte[] bArr3 = this.ofbOutV;
            byte[] bArr4 = this.ofbV;
            int length = bArr4.length;
            int i26 = this.blockSize;
            System.arraycopy(bArr3, 0, bArr4, length - i26, i26);
        }
        return b16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/GCTR";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        BlockCipher blockCipher;
        this.firstStep = true;
        this.N3 = 0;
        this.N4 = 0;
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
        this.firstStep = true;
        this.N3 = 0;
        this.N4 = 0;
        byte[] bArr = this.IV;
        System.arraycopy(bArr, 0, this.ofbV, 0, bArr.length);
        this.byteCount = 0;
        this.cipher.reset();
    }
}
