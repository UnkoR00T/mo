package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class G3413CBCBlockCipher implements BlockCipher {
    private byte[] R;
    private byte[] R_init;
    private int blockSize;
    private BlockCipher cipher;
    private boolean forEncryption;
    private boolean initialized = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f149122m;

    public G3413CBCBlockCipher(BlockCipher blockCipher) {
        this.blockSize = blockCipher.getBlockSize();
        this.cipher = blockCipher;
    }

    private int decrypt(byte[] bArr, int i15, byte[] bArr2, int i16) {
        byte[] bArrMSB = GOST3413CipherUtil.MSB(this.R, this.blockSize);
        byte[] bArrCopyFromInput = GOST3413CipherUtil.copyFromInput(bArr, this.blockSize, i15);
        byte[] bArr3 = new byte[bArrCopyFromInput.length];
        this.cipher.processBlock(bArrCopyFromInput, 0, bArr3, 0);
        byte[] bArrSum = GOST3413CipherUtil.sum(bArr3, bArrMSB);
        System.arraycopy(bArrSum, 0, bArr2, i16, bArrSum.length);
        if (bArr2.length > i16 + bArrSum.length) {
            generateR(bArrCopyFromInput);
        }
        return bArrSum.length;
    }

    private int encrypt(byte[] bArr, int i15, byte[] bArr2, int i16) {
        byte[] bArrSum = GOST3413CipherUtil.sum(GOST3413CipherUtil.copyFromInput(bArr, this.blockSize, i15), GOST3413CipherUtil.MSB(this.R, this.blockSize));
        int length = bArrSum.length;
        byte[] bArr3 = new byte[length];
        this.cipher.processBlock(bArrSum, 0, bArr3, 0);
        System.arraycopy(bArr3, 0, bArr2, i16, length);
        if (bArr2.length > i16 + bArrSum.length) {
            generateR(bArr3);
        }
        return length;
    }

    private void generateR(byte[] bArr) {
        byte[] bArrLSB = GOST3413CipherUtil.LSB(this.R, this.f149122m - this.blockSize);
        System.arraycopy(bArrLSB, 0, this.R, 0, bArrLSB.length);
        System.arraycopy(bArr, 0, this.R, bArrLSB.length, this.f149122m - bArrLSB.length);
    }

    private void initArrays() {
        int i15 = this.f149122m;
        this.R = new byte[i15];
        this.R_init = new byte[i15];
    }

    private void setupDefaultParams() {
        this.f149122m = this.blockSize;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/CBC";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        BlockCipher blockCipher;
        this.forEncryption = z15;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv4 = parametersWithIV.getIV();
            if (iv4.length < this.blockSize) {
                throw new IllegalArgumentException("Parameter m must blockSize <= m");
            }
            this.f149122m = iv4.length;
            initArrays();
            byte[] bArrClone = Arrays.clone(iv4);
            this.R_init = bArrClone;
            System.arraycopy(bArrClone, 0, this.R, 0, bArrClone.length);
            if (parametersWithIV.getParameters() != null) {
                blockCipher = this.cipher;
                cipherParameters = parametersWithIV.getParameters();
                blockCipher.init(z15, cipherParameters);
            }
        } else {
            setupDefaultParams();
            initArrays();
            byte[] bArr = this.R_init;
            System.arraycopy(bArr, 0, this.R, 0, bArr.length);
            if (cipherParameters != null) {
                blockCipher = this.cipher;
                blockCipher.init(z15, cipherParameters);
            }
        }
        this.initialized = true;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        return this.forEncryption ? encrypt(bArr, i15, bArr2, i16) : decrypt(bArr, i15, bArr2, i16);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        if (this.initialized) {
            byte[] bArr = this.R_init;
            System.arraycopy(bArr, 0, this.R, 0, bArr.length);
            this.cipher.reset();
        }
    }
}
