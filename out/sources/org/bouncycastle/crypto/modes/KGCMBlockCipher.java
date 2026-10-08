package org.bouncycastle.crypto.modes;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier;
import org.bouncycastle.crypto.modes.kgcm.Tables16kKGCMMultiplier_512;
import org.bouncycastle.crypto.modes.kgcm.Tables4kKGCMMultiplier_128;
import org.bouncycastle.crypto.modes.kgcm.Tables8kKGCMMultiplier_256;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class KGCMBlockCipher implements AEADBlockCipher {
    private static final int MIN_MAC_BITS = 64;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f149129b;
    private final int blockSize;
    private BufferedBlockCipher ctrEngine;
    private BlockCipher engine;
    private boolean forEncryption;
    private byte[] initialAssociatedText;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f149130iv;
    private byte[] macBlock;
    private KGCMMultiplier multiplier;
    private ExposedByteArrayOutputStream associatedText = new ExposedByteArrayOutputStream();
    private ExposedByteArrayOutputStream data = new ExposedByteArrayOutputStream();
    private int macSize = -1;

    private static class ExposedByteArrayOutputStream extends ByteArrayOutputStream {
        public byte[] getBuffer() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public KGCMBlockCipher(BlockCipher blockCipher) {
        this.engine = blockCipher;
        this.ctrEngine = new BufferedBlockCipher(new KCTRBlockCipher(blockCipher));
        int blockSize = this.engine.getBlockSize();
        this.blockSize = blockSize;
        this.initialAssociatedText = new byte[blockSize];
        this.f149130iv = new byte[blockSize];
        this.multiplier = createDefaultMultiplier(blockSize);
        this.f149129b = new long[blockSize >>> 3];
        this.macBlock = null;
    }

    private void calculateMac(byte[] bArr, int i15, int i16, int i17) {
        int i18 = i15 + i16;
        while (i15 < i18) {
            xorWithInput(this.f149129b, bArr, i15);
            this.multiplier.multiplyH(this.f149129b);
            i15 += this.blockSize;
        }
        long j15 = (((long) i17) & BodyPartID.bodyIdMax) << 3;
        long j16 = (BodyPartID.bodyIdMax & ((long) i16)) << 3;
        long[] jArr = this.f149129b;
        jArr[0] = j15 ^ jArr[0];
        int i19 = this.blockSize >>> 4;
        jArr[i19] = jArr[i19] ^ j16;
        byte[] bArrLongToLittleEndian = Pack.longToLittleEndian(jArr);
        this.macBlock = bArrLongToLittleEndian;
        this.engine.processBlock(bArrLongToLittleEndian, 0, bArrLongToLittleEndian, 0);
    }

    private static KGCMMultiplier createDefaultMultiplier(int i15) {
        if (i15 == 16) {
            return new Tables4kKGCMMultiplier_128();
        }
        if (i15 == 32) {
            return new Tables8kKGCMMultiplier_256();
        }
        if (i15 == 64) {
            return new Tables16kKGCMMultiplier_512();
        }
        throw new IllegalArgumentException("Only 128, 256, and 512 -bit block sizes supported");
    }

    private void processAAD(byte[] bArr, int i15, int i16) {
        int i17 = i16 + i15;
        while (i15 < i17) {
            xorWithInput(this.f149129b, bArr, i15);
            this.multiplier.multiplyH(this.f149129b);
            i15 += this.blockSize;
        }
    }

    private static void xorWithInput(long[] jArr, byte[] bArr, int i15) {
        for (int i16 = 0; i16 < jArr.length; i16++) {
            jArr[i16] = jArr[i16] ^ Pack.littleEndianToLong(bArr, i15);
            i15 += 8;
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i15) throws InvalidCipherTextException, IOException {
        int i16;
        int iDoFinal;
        int size = this.data.size();
        if (!this.forEncryption && size < this.macSize) {
            throw new InvalidCipherTextException("data too short");
        }
        byte[] bArr2 = new byte[this.blockSize];
        this.engine.processBlock(bArr2, 0, bArr2, 0);
        long[] jArr = new long[this.blockSize >>> 3];
        Pack.littleEndianToLong(bArr2, 0, jArr);
        this.multiplier.init(jArr);
        Arrays.fill(bArr2, (byte) 0);
        Arrays.fill(jArr, 0L);
        int size2 = this.associatedText.size();
        if (size2 > 0) {
            processAAD(this.associatedText.getBuffer(), 0, size2);
        }
        if (!this.forEncryption) {
            i16 = size;
            int i17 = i16 - this.macSize;
            if (bArr.length - i15 < i17) {
                throw new OutputLengthException("Output buffer too short");
            }
            calculateMac(this.data.getBuffer(), 0, i17, size2);
            int iProcessBytes = this.ctrEngine.processBytes(this.data.getBuffer(), 0, i17, bArr, i15);
            iDoFinal = iProcessBytes + this.ctrEngine.doFinal(bArr, i15 + iProcessBytes);
        } else {
            if ((bArr.length - i15) - this.macSize < size) {
                throw new OutputLengthException("Output buffer too short");
            }
            int iProcessBytes2 = this.ctrEngine.processBytes(this.data.getBuffer(), 0, size, bArr, i15);
            i16 = size;
            iDoFinal = iProcessBytes2 + this.ctrEngine.doFinal(bArr, i15 + iProcessBytes2);
            calculateMac(bArr, i15, i16, size2);
        }
        byte[] bArr3 = this.macBlock;
        if (bArr3 == null) {
            throw new IllegalStateException("mac is not calculated");
        }
        if (this.forEncryption) {
            System.arraycopy(bArr3, 0, bArr, i15 + iDoFinal, this.macSize);
            reset();
            return iDoFinal + this.macSize;
        }
        byte[] bArr4 = new byte[this.macSize];
        byte[] buffer = this.data.getBuffer();
        int i18 = this.macSize;
        System.arraycopy(buffer, i16 - i18, bArr4, 0, i18);
        int i19 = this.macSize;
        byte[] bArr5 = new byte[i19];
        System.arraycopy(this.macBlock, 0, bArr5, 0, i19);
        if (!Arrays.constantTimeAreEqual(bArr4, bArr5)) {
            throw new InvalidCipherTextException("mac verification failed");
        }
        reset();
        return iDoFinal;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.engine.getAlgorithmName() + "/KGCM";
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
        return this.engine;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i15) {
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z15, CipherParameters cipherParameters) throws IOException {
        KeyParameter key;
        this.forEncryption = z15;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            byte[] nonce = aEADParameters.getNonce();
            byte[] bArr = this.f149130iv;
            int length = bArr.length - nonce.length;
            Arrays.fill(bArr, (byte) 0);
            System.arraycopy(nonce, 0, this.f149130iv, length, nonce.length);
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize < 64 || macSize > (this.blockSize << 3) || (macSize & 7) != 0) {
                throw new IllegalArgumentException("Invalid value for MAC size: " + macSize);
            }
            this.macSize = macSize >>> 3;
            key = aEADParameters.getKey();
            byte[] bArr2 = this.initialAssociatedText;
            if (bArr2 != null) {
                processAADBytes(bArr2, 0, bArr2.length);
            }
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("Invalid parameter passed");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv4 = parametersWithIV.getIV();
            byte[] bArr3 = this.f149130iv;
            int length2 = bArr3.length - iv4.length;
            Arrays.fill(bArr3, (byte) 0);
            System.arraycopy(iv4, 0, this.f149130iv, length2, iv4.length);
            this.initialAssociatedText = null;
            this.macSize = this.blockSize;
            key = (KeyParameter) parametersWithIV.getParameters();
        }
        this.macBlock = new byte[this.blockSize];
        this.ctrEngine.init(true, new ParametersWithIV(key, this.f149130iv));
        this.engine.init(true, key);
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

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() throws IOException {
        Arrays.fill(this.f149129b, 0L);
        this.engine.reset();
        this.data.reset();
        this.associatedText.reset();
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }
}
