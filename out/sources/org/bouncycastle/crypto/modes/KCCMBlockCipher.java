package org.bouncycastle.crypto.modes;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class KCCMBlockCipher implements AEADBlockCipher {
    private static final int BITS_IN_BYTE = 8;
    private static final int BYTES_IN_INT = 4;
    private static final int MAX_MAC_BIT_LENGTH = 512;
    private static final int MIN_MAC_BIT_LENGTH = 64;
    private byte[] G1;
    private int Nb_;
    private ExposedByteArrayOutputStream associatedText;
    private byte[] buffer;
    private byte[] counter;
    private ExposedByteArrayOutputStream data;
    private BlockCipher engine;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private byte[] mac;
    private byte[] macBlock;
    private int macSize;
    private byte[] nonce;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private byte[] f149127s;

    private static class ExposedByteArrayOutputStream extends ByteArrayOutputStream {
        public byte[] getBuffer() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public KCCMBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, 4);
    }

    private void CalculateMac(byte[] bArr, int i15, int i16) {
        while (i16 > 0) {
            for (int i17 = 0; i17 < this.engine.getBlockSize(); i17++) {
                byte[] bArr2 = this.macBlock;
                bArr2[i17] = (byte) (bArr2[i17] ^ bArr[i15 + i17]);
            }
            BlockCipher blockCipher = this.engine;
            byte[] bArr3 = this.macBlock;
            blockCipher.processBlock(bArr3, 0, bArr3, 0);
            i16 -= this.engine.getBlockSize();
            i15 += this.engine.getBlockSize();
        }
    }

    private void ProcessBlock(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
        int i18 = 0;
        while (true) {
            byte[] bArr3 = this.counter;
            if (i18 >= bArr3.length) {
                break;
            }
            byte[] bArr4 = this.f149127s;
            bArr4[i18] = (byte) (bArr4[i18] + bArr3[i18]);
            i18++;
        }
        this.engine.processBlock(this.f149127s, 0, this.buffer, 0);
        for (int i19 = 0; i19 < this.engine.getBlockSize(); i19++) {
            bArr2[i17 + i19] = (byte) (this.buffer[i19] ^ bArr[i15 + i19]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048 A[LOOP:0: B:24:0x0041->B:26:0x0048, LOOP_END] */
    private byte getFlag(boolean z15, int i15) {
        String str;
        String binaryString;
        StringBuilder sb5 = new StringBuilder();
        if (z15) {
            sb5.append("1");
        } else {
            sb5.append(d.f37012h1);
        }
        if (i15 == 8) {
            str = "010";
        } else if (i15 == 16) {
            str = "011";
        } else if (i15 == 32) {
            str = "100";
        } else {
            if (i15 != 48) {
                if (i15 == 64) {
                    str = "110";
                }
                binaryString = Integer.toBinaryString(this.Nb_ - 1);
                while (binaryString.length() < 4) {
                    binaryString = new StringBuilder(binaryString).insert(0, d.f37012h1).toString();
                }
                sb5.append(binaryString);
                return (byte) Integer.parseInt(sb5.toString(), 2);
            }
            str = "101";
        }
        sb5.append(str);
        binaryString = Integer.toBinaryString(this.Nb_ - 1);
        while (binaryString.length() < 4) {
            binaryString = new StringBuilder(binaryString).insert(0, d.f37012h1).toString();
        }
        sb5.append(binaryString);
        return (byte) Integer.parseInt(sb5.toString(), 2);
    }

    private void intToBytes(int i15, byte[] bArr, int i16) {
        bArr[i16 + 3] = (byte) (i15 >> 24);
        bArr[i16 + 2] = (byte) (i15 >> 16);
        bArr[i16 + 1] = (byte) (i15 >> 8);
        bArr[i16] = (byte) i15;
    }

    private void processAAD(byte[] bArr, int i15, int i16, int i17) {
        if (i16 - i15 < this.engine.getBlockSize()) {
            throw new IllegalArgumentException("authText buffer too short");
        }
        if (i16 % this.engine.getBlockSize() != 0) {
            throw new IllegalArgumentException("padding not supported");
        }
        byte[] bArr2 = this.nonce;
        System.arraycopy(bArr2, 0, this.G1, 0, (bArr2.length - this.Nb_) - 1);
        intToBytes(i17, this.buffer, 0);
        System.arraycopy(this.buffer, 0, this.G1, (this.nonce.length - this.Nb_) - 1, 4);
        byte[] bArr3 = this.G1;
        bArr3[bArr3.length - 1] = getFlag(true, this.macSize);
        this.engine.processBlock(this.G1, 0, this.macBlock, 0);
        intToBytes(i16, this.buffer, 0);
        if (i16 <= this.engine.getBlockSize() - this.Nb_) {
            for (int i18 = 0; i18 < i16; i18++) {
                byte[] bArr4 = this.buffer;
                int i19 = this.Nb_ + i18;
                bArr4[i19] = (byte) (bArr4[i19] ^ bArr[i15 + i18]);
            }
            for (int i25 = 0; i25 < this.engine.getBlockSize(); i25++) {
                byte[] bArr5 = this.macBlock;
                bArr5[i25] = (byte) (bArr5[i25] ^ this.buffer[i25]);
            }
            BlockCipher blockCipher = this.engine;
            byte[] bArr6 = this.macBlock;
            blockCipher.processBlock(bArr6, 0, bArr6, 0);
            return;
        }
        for (int i26 = 0; i26 < this.engine.getBlockSize(); i26++) {
            byte[] bArr7 = this.macBlock;
            bArr7[i26] = (byte) (bArr7[i26] ^ this.buffer[i26]);
        }
        BlockCipher blockCipher2 = this.engine;
        byte[] bArr8 = this.macBlock;
        blockCipher2.processBlock(bArr8, 0, bArr8, 0);
        while (i16 != 0) {
            for (int i27 = 0; i27 < this.engine.getBlockSize(); i27++) {
                byte[] bArr9 = this.macBlock;
                bArr9[i27] = (byte) (bArr9[i27] ^ bArr[i27 + i15]);
            }
            BlockCipher blockCipher3 = this.engine;
            byte[] bArr10 = this.macBlock;
            blockCipher3.processBlock(bArr10, 0, bArr10, 0);
            i15 += this.engine.getBlockSize();
            i16 -= this.engine.getBlockSize();
        }
    }

    private void setNb(int i15) {
        if (i15 != 4 && i15 != 6 && i15 != 8) {
            throw new IllegalArgumentException("Nb = 4 is recommended by DSTU7624 but can be changed to only 6 or 8 in this implementation");
        }
        this.Nb_ = i15;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i15) throws InvalidCipherTextException, IOException {
        int iProcessPacket = processPacket(this.data.getBuffer(), 0, this.data.size(), bArr, i15);
        reset();
        return iProcessPacket;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.engine.getAlgorithmName() + "/KCCM";
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return Arrays.clone(this.mac);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i15) {
        return i15 + this.macSize;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i15) {
        return i15;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z15, CipherParameters cipherParameters) throws IOException {
        CipherParameters parameters;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            if (aEADParameters.getMacSize() > 512 || aEADParameters.getMacSize() < 64 || aEADParameters.getMacSize() % 8 != 0) {
                throw new IllegalArgumentException("Invalid mac size specified");
            }
            this.nonce = aEADParameters.getNonce();
            this.macSize = aEADParameters.getMacSize() / 8;
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            parameters = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("Invalid parameters specified");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.nonce = parametersWithIV.getIV();
            this.macSize = this.engine.getBlockSize();
            this.initialAssociatedText = null;
            parameters = parametersWithIV.getParameters();
        }
        this.mac = new byte[this.macSize];
        this.forEncryption = z15;
        this.engine.init(true, parameters);
        this.counter[0] = 1;
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
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
            throw new DataLengthException("input buffer too short");
        }
        this.data.write(bArr, i15, i16);
        return 0;
    }

    public int processPacket(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) throws InvalidCipherTextException, IOException {
        int i18;
        if (bArr.length - i15 < i16) {
            throw new DataLengthException("input buffer too short");
        }
        if (bArr2.length - i17 < i16) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.associatedText.size() > 0) {
            if (this.forEncryption) {
                processAAD(this.associatedText.getBuffer(), 0, this.associatedText.size(), this.data.size());
            } else {
                processAAD(this.associatedText.getBuffer(), 0, this.associatedText.size(), this.data.size() - this.macSize);
            }
        }
        if (!this.forEncryption) {
            if ((i16 - this.macSize) % this.engine.getBlockSize() != 0) {
                throw new DataLengthException("partial blocks not supported");
            }
            this.engine.processBlock(this.nonce, 0, this.f149127s, 0);
            int blockSize = i16 / this.engine.getBlockSize();
            int blockSize2 = i15;
            int blockSize3 = i17;
            for (int i19 = 0; i19 < blockSize; i19++) {
                ProcessBlock(bArr, blockSize2, i16, bArr2, blockSize3);
                blockSize2 += this.engine.getBlockSize();
                blockSize3 += this.engine.getBlockSize();
            }
            if (i16 > blockSize2) {
                int i25 = 0;
                while (true) {
                    byte[] bArr3 = this.counter;
                    if (i25 >= bArr3.length) {
                        break;
                    }
                    byte[] bArr4 = this.f149127s;
                    bArr4[i25] = (byte) (bArr4[i25] + bArr3[i25]);
                    i25++;
                }
                this.engine.processBlock(this.f149127s, 0, this.buffer, 0);
                int i26 = 0;
                while (true) {
                    i18 = this.macSize;
                    if (i26 >= i18) {
                        break;
                    }
                    bArr2[blockSize3 + i26] = (byte) (this.buffer[i26] ^ bArr[blockSize2 + i26]);
                    i26++;
                }
                blockSize3 += i18;
            }
            int i27 = 0;
            while (true) {
                byte[] bArr5 = this.counter;
                if (i27 >= bArr5.length) {
                    break;
                }
                byte[] bArr6 = this.f149127s;
                bArr6[i27] = (byte) (bArr6[i27] + bArr5[i27]);
                i27++;
            }
            this.engine.processBlock(this.f149127s, 0, this.buffer, 0);
            int i28 = this.macSize;
            System.arraycopy(bArr2, blockSize3 - i28, this.buffer, 0, i28);
            CalculateMac(bArr2, 0, blockSize3 - this.macSize);
            System.arraycopy(this.macBlock, 0, this.mac, 0, this.macSize);
            int i29 = this.macSize;
            byte[] bArr7 = new byte[i29];
            System.arraycopy(this.buffer, 0, bArr7, 0, i29);
            if (!Arrays.constantTimeAreEqual(this.mac, bArr7)) {
                throw new InvalidCipherTextException("mac check failed");
            }
            reset();
            return i16 - this.macSize;
        }
        if (i16 % this.engine.getBlockSize() != 0) {
            throw new DataLengthException("partial blocks not supported");
        }
        CalculateMac(bArr, i15, i16);
        this.engine.processBlock(this.nonce, 0, this.f149127s, 0);
        int blockSize4 = i15;
        int blockSize5 = i16;
        int blockSize6 = i17;
        while (blockSize5 > 0) {
            ProcessBlock(bArr, blockSize4, i16, bArr2, blockSize6);
            blockSize5 -= this.engine.getBlockSize();
            blockSize4 += this.engine.getBlockSize();
            blockSize6 += this.engine.getBlockSize();
        }
        int i35 = 0;
        while (true) {
            byte[] bArr8 = this.counter;
            if (i35 >= bArr8.length) {
                break;
            }
            byte[] bArr9 = this.f149127s;
            bArr9[i35] = (byte) (bArr9[i35] + bArr8[i35]);
            i35++;
        }
        this.engine.processBlock(this.f149127s, 0, this.buffer, 0);
        int i36 = 0;
        while (true) {
            int i37 = this.macSize;
            if (i36 >= i37) {
                System.arraycopy(this.macBlock, 0, this.mac, 0, i37);
                reset();
                return this.macSize + i16;
            }
            bArr2[blockSize6 + i36] = (byte) (this.buffer[i36] ^ this.macBlock[i36]);
            i36++;
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() throws IOException {
        Arrays.fill(this.G1, (byte) 0);
        Arrays.fill(this.buffer, (byte) 0);
        Arrays.fill(this.counter, (byte) 0);
        Arrays.fill(this.macBlock, (byte) 0);
        this.counter[0] = 1;
        this.data.reset();
        this.associatedText.reset();
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    public KCCMBlockCipher(BlockCipher blockCipher, int i15) {
        this.associatedText = new ExposedByteArrayOutputStream();
        this.data = new ExposedByteArrayOutputStream();
        this.Nb_ = 4;
        this.engine = blockCipher;
        this.macSize = blockCipher.getBlockSize();
        this.nonce = new byte[blockCipher.getBlockSize()];
        this.initialAssociatedText = new byte[blockCipher.getBlockSize()];
        this.mac = new byte[blockCipher.getBlockSize()];
        this.macBlock = new byte[blockCipher.getBlockSize()];
        this.G1 = new byte[blockCipher.getBlockSize()];
        this.buffer = new byte[blockCipher.getBlockSize()];
        this.f149127s = new byte[blockCipher.getBlockSize()];
        this.counter = new byte[blockCipher.getBlockSize()];
        setNb(i15);
    }
}
