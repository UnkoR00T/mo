package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class CFBBlockCipher extends StreamBlockCipher implements CFBModeCipher {
    private byte[] IV;
    private int blockSize;
    private int byteCount;
    private byte[] cfbOutV;
    private byte[] cfbV;
    private BlockCipher cipher;
    private boolean encrypting;
    private byte[] inBuf;

    public CFBBlockCipher(BlockCipher blockCipher, int i15) {
        super(blockCipher);
        this.cipher = null;
        if (i15 > blockCipher.getBlockSize() * 8 || i15 < 8 || i15 % 8 != 0) {
            throw new IllegalArgumentException("CFB" + i15 + " not supported");
        }
        this.cipher = blockCipher;
        this.blockSize = i15 / 8;
        this.IV = new byte[blockCipher.getBlockSize()];
        this.cfbV = new byte[blockCipher.getBlockSize()];
        this.cfbOutV = new byte[blockCipher.getBlockSize()];
        this.inBuf = new byte[this.blockSize];
    }

    private byte decryptByte(byte b15) {
        if (this.byteCount == 0) {
            this.cipher.processBlock(this.cfbV, 0, this.cfbOutV, 0);
        }
        byte[] bArr = this.inBuf;
        int i15 = this.byteCount;
        bArr[i15] = b15;
        byte[] bArr2 = this.cfbOutV;
        int i16 = i15 + 1;
        this.byteCount = i16;
        byte b16 = (byte) (b15 ^ bArr2[i15]);
        int i17 = this.blockSize;
        if (i16 == i17) {
            this.byteCount = 0;
            byte[] bArr3 = this.cfbV;
            System.arraycopy(bArr3, i17, bArr3, 0, bArr3.length - i17);
            byte[] bArr4 = this.inBuf;
            byte[] bArr5 = this.cfbV;
            int length = bArr5.length;
            int i18 = this.blockSize;
            System.arraycopy(bArr4, 0, bArr5, length - i18, i18);
        }
        return b16;
    }

    private byte encryptByte(byte b15) {
        if (this.byteCount == 0) {
            this.cipher.processBlock(this.cfbV, 0, this.cfbOutV, 0);
        }
        byte[] bArr = this.cfbOutV;
        int i15 = this.byteCount;
        byte b16 = (byte) (b15 ^ bArr[i15]);
        byte[] bArr2 = this.inBuf;
        int i16 = i15 + 1;
        this.byteCount = i16;
        bArr2[i15] = b16;
        int i17 = this.blockSize;
        if (i16 == i17) {
            this.byteCount = 0;
            byte[] bArr3 = this.cfbV;
            System.arraycopy(bArr3, i17, bArr3, 0, bArr3.length - i17);
            byte[] bArr4 = this.inBuf;
            byte[] bArr5 = this.cfbV;
            int length = bArr5.length;
            int i18 = this.blockSize;
            System.arraycopy(bArr4, 0, bArr5, length - i18, i18);
        }
        return b16;
    }

    public static CFBModeCipher newInstance(BlockCipher blockCipher, int i15) {
        return new CFBBlockCipher(blockCipher, i15);
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    protected byte calculateByte(byte b15) {
        return this.encrypting ? encryptByte(b15) : decryptByte(b15);
    }

    public int decryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        processBytes(bArr, i15, this.blockSize, bArr2, i16);
        return this.blockSize;
    }

    public int encryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        processBytes(bArr, i15, this.blockSize, bArr2, i16);
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/CFB" + (this.blockSize * 8);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blockSize;
    }

    public byte[] getCurrentIV() {
        return Arrays.clone(this.cfbV);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        BlockCipher blockCipher;
        this.encrypting = z15;
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
        System.arraycopy(bArr, 0, this.cfbV, 0, bArr.length);
        Arrays.fill(this.inBuf, (byte) 0);
        this.byteCount = 0;
        this.cipher.reset();
    }
}
