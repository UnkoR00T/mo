package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class EAXBlockCipher implements AEADBlockCipher {
    private static final byte cTAG = 2;
    private static final byte hTAG = 1;
    private static final byte nTAG = 0;
    private byte[] associatedTextMac;
    private int blockSize;
    private byte[] bufBlock;
    private int bufOff;
    private CTRModeCipher cipher;
    private boolean cipherInitialized;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private Mac mac;
    private byte[] macBlock;
    private int macSize;
    private byte[] nonceMac;

    public EAXBlockCipher(BlockCipher blockCipher) {
        this.blockSize = blockCipher.getBlockSize();
        CMac cMac = new CMac(blockCipher);
        this.mac = cMac;
        this.macBlock = new byte[this.blockSize];
        this.associatedTextMac = new byte[cMac.getMacSize()];
        this.nonceMac = new byte[this.mac.getMacSize()];
        this.cipher = SICBlockCipher.newInstance(blockCipher);
    }

    private void calculateMac() {
        byte[] bArr = new byte[this.blockSize];
        int i15 = 0;
        this.mac.doFinal(bArr, 0);
        while (true) {
            byte[] bArr2 = this.macBlock;
            if (i15 >= bArr2.length) {
                return;
            }
            bArr2[i15] = (byte) ((this.nonceMac[i15] ^ this.associatedTextMac[i15]) ^ bArr[i15]);
            i15++;
        }
    }

    private void initCipher() {
        if (this.cipherInitialized) {
            return;
        }
        this.cipherInitialized = true;
        this.mac.doFinal(this.associatedTextMac, 0);
        int i15 = this.blockSize;
        byte[] bArr = new byte[i15];
        bArr[i15 - 1] = 2;
        this.mac.update(bArr, 0, i15);
    }

    private int process(byte b15, byte[] bArr, int i15) {
        int iProcessBlock;
        byte[] bArr2 = this.bufBlock;
        int i16 = this.bufOff;
        int i17 = i16 + 1;
        this.bufOff = i17;
        bArr2[i16] = b15;
        if (i17 != bArr2.length) {
            return 0;
        }
        int length = bArr.length;
        int i18 = this.blockSize;
        if (length < i15 + i18) {
            throw new OutputLengthException("Output buffer is too short");
        }
        if (this.forEncryption) {
            iProcessBlock = this.cipher.processBlock(bArr2, 0, bArr, i15);
            this.mac.update(bArr, i15, this.blockSize);
        } else {
            this.mac.update(bArr2, 0, i18);
            iProcessBlock = this.cipher.processBlock(this.bufBlock, 0, bArr, i15);
        }
        this.bufOff = 0;
        if (!this.forEncryption) {
            byte[] bArr3 = this.bufBlock;
            System.arraycopy(bArr3, this.blockSize, bArr3, 0, this.macSize);
            this.bufOff = this.macSize;
        }
        return iProcessBlock;
    }

    private boolean verifyMac(byte[] bArr, int i15) {
        int i16 = 0;
        for (int i17 = 0; i17 < this.macSize; i17++) {
            i16 |= this.macBlock[i17] ^ bArr[i15 + i17];
        }
        return i16 == 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i15) throws InvalidCipherTextException {
        initCipher();
        int i16 = this.bufOff;
        byte[] bArr2 = this.bufBlock;
        byte[] bArr3 = new byte[bArr2.length];
        this.bufOff = 0;
        if (this.forEncryption) {
            int i17 = i15 + i16;
            if (bArr.length < this.macSize + i17) {
                throw new OutputLengthException("Output buffer too short");
            }
            this.cipher.processBlock(bArr2, 0, bArr3, 0);
            System.arraycopy(bArr3, 0, bArr, i15, i16);
            this.mac.update(bArr3, 0, i16);
            calculateMac();
            System.arraycopy(this.macBlock, 0, bArr, i17, this.macSize);
            reset(false);
            return i16 + this.macSize;
        }
        int i18 = this.macSize;
        if (i16 < i18) {
            throw new InvalidCipherTextException("data too short");
        }
        if (bArr.length < (i15 + i16) - i18) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (i16 > i18) {
            this.mac.update(bArr2, 0, i16 - i18);
            this.cipher.processBlock(this.bufBlock, 0, bArr3, 0);
            System.arraycopy(bArr3, 0, bArr, i15, i16 - this.macSize);
        }
        calculateMac();
        if (!verifyMac(this.bufBlock, i16 - this.macSize)) {
            throw new InvalidCipherTextException("mac check in EAX failed");
        }
        reset(false);
        return i16 - this.macSize;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.cipher.getUnderlyingCipher().getAlgorithmName() + "/EAX";
    }

    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        int i15 = this.macSize;
        byte[] bArr = new byte[i15];
        System.arraycopy(this.macBlock, 0, bArr, 0, i15);
        return bArr;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i15) {
        int i16 = i15 + this.bufOff;
        if (this.forEncryption) {
            return i16 + this.macSize;
        }
        int i17 = this.macSize;
        if (i16 < i17) {
            return 0;
        }
        return i16 - i17;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.cipher.getUnderlyingCipher();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i15) {
        int i16 = i15 + this.bufOff;
        if (!this.forEncryption) {
            int i17 = this.macSize;
            if (i16 < i17) {
                return 0;
            }
            i16 -= i17;
        }
        return i16 - (i16 % this.blockSize);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        byte[] iv4;
        CipherParameters parameters;
        this.forEncryption = z15;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            iv4 = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            this.macSize = aEADParameters.getMacSize() / 8;
            parameters = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("invalid parameters passed to EAX");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv4 = parametersWithIV.getIV();
            this.initialAssociatedText = null;
            this.macSize = this.mac.getMacSize() / 2;
            parameters = parametersWithIV.getParameters();
        }
        this.bufBlock = new byte[z15 ? this.blockSize : this.blockSize + this.macSize];
        byte[] bArr = new byte[this.blockSize];
        this.mac.init(parameters);
        int i15 = this.blockSize;
        bArr[i15 - 1] = 0;
        this.mac.update(bArr, 0, i15);
        this.mac.update(iv4, 0, iv4.length);
        this.mac.doFinal(this.nonceMac, 0);
        this.cipher.init(true, new ParametersWithIV(parameters, this.nonceMac));
        reset();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b15) {
        if (this.cipherInitialized) {
            throw new IllegalStateException("AAD data cannot be added after encryption/decryption processing has begun.");
        }
        this.mac.update(b15);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i15, int i16) {
        if (this.cipherInitialized) {
            throw new IllegalStateException("AAD data cannot be added after encryption/decryption processing has begun.");
        }
        this.mac.update(bArr, i15, i16);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b15, byte[] bArr, int i15) {
        initCipher();
        return process(b15, bArr, i15);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
        initCipher();
        if (bArr.length < i15 + i16) {
            throw new DataLengthException("Input buffer too short");
        }
        if (bArr == bArr2 && Arrays.segmentsOverlap(i15, i16, i17, getUpdateOutputSize(i16))) {
            bArr = new byte[i16];
            System.arraycopy(bArr2, i15, bArr, 0, i16);
            i15 = 0;
        }
        int iProcess = 0;
        for (int i18 = 0; i18 != i16; i18++) {
            iProcess += process(bArr[i15 + i18], bArr2, i17 + iProcess);
        }
        return iProcess;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true);
    }

    private void reset(boolean z15) {
        this.cipher.reset();
        this.mac.reset();
        this.bufOff = 0;
        Arrays.fill(this.bufBlock, (byte) 0);
        if (z15) {
            Arrays.fill(this.macBlock, (byte) 0);
        }
        int i15 = this.blockSize;
        byte[] bArr = new byte[i15];
        bArr[i15 - 1] = 1;
        this.mac.update(bArr, 0, i15);
        this.cipherInitialized = false;
        byte[] bArr2 = this.initialAssociatedText;
        if (bArr2 != null) {
            processAADBytes(bArr2, 0, bArr2.length);
        }
    }
}
