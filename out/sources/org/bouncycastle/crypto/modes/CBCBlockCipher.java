package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DefaultMultiBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class CBCBlockCipher extends DefaultMultiBlockCipher implements CBCModeCipher {
    private byte[] IV;
    private int blockSize;
    private byte[] cbcNextV;
    private byte[] cbcV;
    private BlockCipher cipher;
    private boolean encrypting;

    public CBCBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.IV = new byte[blockSize];
        this.cbcV = new byte[blockSize];
        this.cbcNextV = new byte[blockSize];
    }

    private int decryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int i17 = this.blockSize;
        if (i15 + i17 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        System.arraycopy(bArr, i15, this.cbcNextV, 0, i17);
        int iProcessBlock = this.cipher.processBlock(bArr, i15, bArr2, i16);
        for (int i18 = 0; i18 < this.blockSize; i18++) {
            int i19 = i16 + i18;
            bArr2[i19] = (byte) (bArr2[i19] ^ this.cbcV[i18]);
        }
        byte[] bArr3 = this.cbcV;
        this.cbcV = this.cbcNextV;
        this.cbcNextV = bArr3;
        return iProcessBlock;
    }

    private int encryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        if (this.blockSize + i15 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        for (int i17 = 0; i17 < this.blockSize; i17++) {
            byte[] bArr3 = this.cbcV;
            bArr3[i17] = (byte) (bArr3[i17] ^ bArr[i15 + i17]);
        }
        int iProcessBlock = this.cipher.processBlock(this.cbcV, 0, bArr2, i16);
        byte[] bArr4 = this.cbcV;
        System.arraycopy(bArr2, i16, bArr4, 0, bArr4.length);
        return iProcessBlock;
    }

    public static CBCModeCipher newInstance(BlockCipher blockCipher) {
        return new CBCBlockCipher(blockCipher);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/CBC";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.modes.CBCModeCipher
    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        boolean z16 = this.encrypting;
        this.encrypting = z15;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv4 = parametersWithIV.getIV();
            if (iv4.length != this.blockSize) {
                throw new IllegalArgumentException("initialisation vector must be the same length as block size");
            }
            System.arraycopy(iv4, 0, this.IV, 0, iv4.length);
            cipherParameters = parametersWithIV.getParameters();
        } else {
            Arrays.fill(this.IV, (byte) 0);
        }
        reset();
        if (cipherParameters != null) {
            this.cipher.init(z15, cipherParameters);
        } else if (z16 != z15) {
            throw new IllegalArgumentException("cannot change encrypting state without providing key.");
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        return this.encrypting ? encryptBlock(bArr, i15, bArr2, i16) : decryptBlock(bArr, i15, bArr2, i16);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        byte[] bArr = this.IV;
        System.arraycopy(bArr, 0, this.cbcV, 0, bArr.length);
        Arrays.fill(this.cbcNextV, (byte) 0);
        this.cipher.reset();
    }
}
