package org.bouncycastle.crypto.modes;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.macs.CBCBlockCipherMac;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class CCMBlockCipher implements CCMModeCipher {
    private int blockSize;
    private BlockCipher cipher;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private CipherParameters keyParam;
    private byte[] macBlock;
    private int macSize;
    private byte[] nonce;
    private ExposedByteArrayOutputStream associatedText = new ExposedByteArrayOutputStream();
    private ExposedByteArrayOutputStream data = new ExposedByteArrayOutputStream();

    private static class ExposedByteArrayOutputStream extends ByteArrayOutputStream {
        public byte[] getBuffer() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public CCMBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.macBlock = new byte[blockSize];
        if (blockSize != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
    }

    private int calculateMac(byte[] bArr, int i15, int i16, byte[] bArr2) {
        CBCBlockCipherMac cBCBlockCipherMac = new CBCBlockCipherMac(this.cipher, this.macSize * 8);
        cBCBlockCipherMac.init(this.keyParam);
        byte[] bArr3 = new byte[16];
        if (hasAssociatedText()) {
            bArr3[0] = (byte) (bArr3[0] | 64);
        }
        int i17 = 2;
        byte macSize = (byte) (bArr3[0] | ((((cBCBlockCipherMac.getMacSize() - 2) / 2) & 7) << 3));
        bArr3[0] = macSize;
        byte[] bArr4 = this.nonce;
        bArr3[0] = (byte) (macSize | ((14 - bArr4.length) & 7));
        System.arraycopy(bArr4, 0, bArr3, 1, bArr4.length);
        int i18 = i16;
        int i19 = 1;
        while (i18 > 0) {
            bArr3[16 - i19] = (byte) (i18 & GF2Field.MASK);
            i18 >>>= 8;
            i19++;
        }
        cBCBlockCipherMac.update(bArr3, 0, 16);
        if (hasAssociatedText()) {
            int associatedTextLength = getAssociatedTextLength();
            if (associatedTextLength < 65280) {
                cBCBlockCipherMac.update((byte) (associatedTextLength >> 8));
                cBCBlockCipherMac.update((byte) associatedTextLength);
            } else {
                cBCBlockCipherMac.update((byte) -1);
                cBCBlockCipherMac.update((byte) -2);
                cBCBlockCipherMac.update((byte) (associatedTextLength >> 24));
                cBCBlockCipherMac.update((byte) (associatedTextLength >> 16));
                cBCBlockCipherMac.update((byte) (associatedTextLength >> 8));
                cBCBlockCipherMac.update((byte) associatedTextLength);
                i17 = 6;
            }
            byte[] bArr5 = this.initialAssociatedText;
            if (bArr5 != null) {
                cBCBlockCipherMac.update(bArr5, 0, bArr5.length);
            }
            if (this.associatedText.size() > 0) {
                cBCBlockCipherMac.update(this.associatedText.getBuffer(), 0, this.associatedText.size());
            }
            int i25 = (i17 + associatedTextLength) % 16;
            if (i25 != 0) {
                while (i25 != 16) {
                    cBCBlockCipherMac.update((byte) 0);
                    i25++;
                }
            }
        }
        cBCBlockCipherMac.update(bArr, i15, i16);
        return cBCBlockCipherMac.doFinal(bArr2, 0);
    }

    private int getAssociatedTextLength() {
        int size = this.associatedText.size();
        byte[] bArr = this.initialAssociatedText;
        return size + (bArr == null ? 0 : bArr.length);
    }

    private int getMacSize(boolean z15, int i15) {
        if (!z15 || (i15 >= 32 && i15 <= 128 && (i15 & 15) == 0)) {
            return i15 >>> 3;
        }
        throw new IllegalArgumentException("tag length in octets must be one of {4,6,8,10,12,14,16}");
    }

    private boolean hasAssociatedText() {
        return getAssociatedTextLength() > 0;
    }

    public static CCMModeCipher newInstance(BlockCipher blockCipher) {
        return new CCMBlockCipher(blockCipher);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i15) throws InvalidCipherTextException {
        int iProcessPacket = processPacket(this.data.getBuffer(), 0, this.data.size(), bArr, i15);
        reset();
        return iProcessPacket;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/CCM";
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
        int size = i15 + this.data.size();
        if (this.forEncryption) {
            return size + this.macSize;
        }
        int i16 = this.macSize;
        if (size < i16) {
            return 0;
        }
        return size - i16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i15) {
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        CipherParameters parameters;
        this.forEncryption = z15;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            this.nonce = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            this.macSize = getMacSize(z15, aEADParameters.getMacSize());
            parameters = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("invalid parameters passed to CCM: " + cipherParameters.getClass().getName());
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.nonce = parametersWithIV.getIV();
            this.initialAssociatedText = null;
            this.macSize = getMacSize(z15, 64);
            parameters = parametersWithIV.getParameters();
        }
        if (parameters != null) {
            this.keyParam = parameters;
        }
        byte[] bArr = this.nonce;
        if (bArr == null || bArr.length < 7 || bArr.length > 13) {
            throw new IllegalArgumentException("nonce must have length from 7 to 13 octets");
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b15) throws IOException {
        this.associatedText.write(b15);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i15, int i16) throws IOException {
        this.associatedText.write(bArr, i15, i16);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b15, byte[] bArr, int i15) throws IOException {
        this.data.write(b15);
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) throws IOException {
        if (bArr.length < i15 + i16) {
            throw new DataLengthException("Input buffer too short");
        }
        this.data.write(bArr, i15, i16);
        return 0;
    }

    public int processPacket(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) throws InvalidCipherTextException {
        int i18;
        if (this.keyParam == null) {
            throw new IllegalStateException("CCM cipher unitialized.");
        }
        byte[] bArr3 = this.nonce;
        int length = bArr3.length;
        int i19 = 15 - length;
        if (i19 < 4) {
            if (i16 - (!this.forEncryption ? 16 : 0) >= (1 << (i19 * 8))) {
                throw new IllegalStateException("CCM packet too large for choice of q");
            }
        }
        byte[] bArr4 = new byte[this.blockSize];
        bArr4[0] = (byte) ((14 - length) & 7);
        System.arraycopy(bArr3, 0, bArr4, 1, bArr3.length);
        CTRModeCipher cTRModeCipherNewInstance = SICBlockCipher.newInstance(this.cipher);
        cTRModeCipherNewInstance.init(this.forEncryption, new ParametersWithIV(this.keyParam, bArr4));
        if (!this.forEncryption) {
            int i25 = this.macSize;
            if (i16 < i25) {
                throw new InvalidCipherTextException("data too short");
            }
            int i26 = i16 - i25;
            if (bArr2.length < i26 + i17) {
                throw new OutputLengthException("Output buffer too short.");
            }
            int i27 = i15 + i26;
            System.arraycopy(bArr, i27, this.macBlock, 0, i25);
            byte[] bArr5 = this.macBlock;
            cTRModeCipherNewInstance.processBlock(bArr5, 0, bArr5, 0);
            int i28 = this.macSize;
            while (true) {
                byte[] bArr6 = this.macBlock;
                if (i28 == bArr6.length) {
                    break;
                }
                bArr6[i28] = 0;
                i28++;
            }
            int i29 = i15;
            int i35 = i17;
            while (true) {
                i18 = this.blockSize;
                if (i29 >= i27 - i18) {
                    break;
                }
                cTRModeCipherNewInstance.processBlock(bArr, i29, bArr2, i35);
                int i36 = this.blockSize;
                i35 += i36;
                i29 += i36;
            }
            byte[] bArr7 = new byte[i18];
            int i37 = i26 - (i29 - i15);
            System.arraycopy(bArr, i29, bArr7, 0, i37);
            cTRModeCipherNewInstance.processBlock(bArr7, 0, bArr7, 0);
            System.arraycopy(bArr7, 0, bArr2, i35, i37);
            byte[] bArr8 = new byte[this.blockSize];
            calculateMac(bArr2, i17, i26, bArr8);
            if (Arrays.constantTimeAreEqual(this.macBlock, bArr8)) {
                return i26;
            }
            throw new InvalidCipherTextException("mac check in CCM failed");
        }
        int i38 = this.macSize + i16;
        if (bArr2.length < i38 + i17) {
            throw new OutputLengthException("Output buffer too short.");
        }
        calculateMac(bArr, i15, i16, this.macBlock);
        byte[] bArr9 = new byte[this.blockSize];
        cTRModeCipherNewInstance.processBlock(this.macBlock, 0, bArr9, 0);
        int i39 = i15;
        int i45 = i17;
        while (true) {
            int i46 = i15 + i16;
            int i47 = this.blockSize;
            if (i39 >= i46 - i47) {
                byte[] bArr10 = new byte[i47];
                int i48 = i46 - i39;
                System.arraycopy(bArr, i39, bArr10, 0, i48);
                cTRModeCipherNewInstance.processBlock(bArr10, 0, bArr10, 0);
                System.arraycopy(bArr10, 0, bArr2, i45, i48);
                System.arraycopy(bArr9, 0, bArr2, i17 + i16, this.macSize);
                return i38;
            }
            cTRModeCipherNewInstance.processBlock(bArr, i39, bArr2, i45);
            int i49 = this.blockSize;
            i45 += i49;
            i39 += i49;
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        this.cipher.reset();
        this.associatedText.reset();
        this.data.reset();
    }

    public byte[] processPacket(byte[] bArr, int i15, int i16) throws InvalidCipherTextException {
        int i17;
        if (this.forEncryption) {
            i17 = this.macSize + i16;
        } else {
            int i18 = this.macSize;
            if (i16 < i18) {
                throw new InvalidCipherTextException("data too short");
            }
            i17 = i16 - i18;
        }
        byte[] bArr2 = new byte[i17];
        processPacket(bArr, i15, i16, bArr2, 0);
        return bArr2;
    }
}
