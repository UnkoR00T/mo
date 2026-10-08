package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.ParametersWithSBox;

/* JADX INFO: loaded from: classes5.dex */
public class GCFBBlockCipher extends StreamBlockCipher {
    private static final byte[] C = {105, 0, 114, 34, 100, -55, 4, 35, -115, 58, -37, -106, 70, -23, 42, -60, 24, -2, -84, -108, 0, -19, 7, 18, -64, -122, -36, -62, -17, 76, -87, 43};
    private final CFBBlockCipher cfbEngine;
    private long counter;
    private boolean forEncryption;
    private ParametersWithIV initParams;
    private KeyParameter key;

    public GCFBBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.counter = 0L;
        this.cfbEngine = new CFBBlockCipher(blockCipher, blockCipher.getBlockSize() * 8);
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    protected byte calculateByte(byte b15) {
        long j15 = this.counter;
        if (j15 > 0 && (j15 & 1023) == 0) {
            BlockCipher underlyingCipher = this.cfbEngine.getUnderlyingCipher();
            underlyingCipher.init(false, this.key);
            byte[] bArr = new byte[32];
            int blockSize = underlyingCipher.getBlockSize();
            for (int i15 = 0; i15 < 32; i15 += blockSize) {
                underlyingCipher.processBlock(C, i15, bArr, i15);
            }
            KeyParameter keyParameter = new KeyParameter(bArr);
            this.key = keyParameter;
            underlyingCipher.init(true, keyParameter);
            byte[] currentIV = this.cfbEngine.getCurrentIV();
            underlyingCipher.processBlock(currentIV, 0, currentIV, 0);
            this.cfbEngine.init(this.forEncryption, new ParametersWithIV(this.key, currentIV));
        }
        this.counter++;
        return this.cfbEngine.calculateByte(b15);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        String algorithmName = this.cfbEngine.getAlgorithmName();
        return algorithmName.substring(0, algorithmName.indexOf(47)) + "/G" + algorithmName.substring(algorithmName.indexOf(47) + 1);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.cfbEngine.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        byte[] bArr;
        ParametersWithIV parametersWithIV;
        ParametersWithIV parametersWithIV2;
        this.counter = 0L;
        this.cfbEngine.init(z15, cipherParameters);
        this.forEncryption = z15;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV3 = (ParametersWithIV) cipherParameters;
            CipherParameters parameters = parametersWithIV3.getParameters();
            byte[] iv4 = parametersWithIV3.getIV();
            cipherParameters = parameters;
            bArr = iv4;
        } else {
            bArr = null;
        }
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        if (cipherParameters instanceof ParametersWithSBox) {
            cipherParameters = ((ParametersWithSBox) cipherParameters).getParameters();
        }
        KeyParameter keyParameter = (KeyParameter) cipherParameters;
        this.key = keyParameter;
        if (keyParameter == null && (parametersWithIV2 = this.initParams) != null) {
            this.key = (KeyParameter) parametersWithIV2.getParameters();
        }
        this.initParams = new ParametersWithIV(this.key, (bArr != null || (parametersWithIV = this.initParams) == null) ? this.cfbEngine.getCurrentIV() : parametersWithIV.getIV());
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        processBytes(bArr, i15, this.cfbEngine.getBlockSize(), bArr2, i16);
        return this.cfbEngine.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        this.counter = 0L;
        ParametersWithIV parametersWithIV = this.initParams;
        if (parametersWithIV == null) {
            this.cfbEngine.reset();
        } else {
            this.key = (KeyParameter) parametersWithIV.getParameters();
            this.cfbEngine.init(this.forEncryption, this.initParams);
        }
    }
}
