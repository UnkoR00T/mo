package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.modes.gcm.BasicGCMExponentiator;
import org.bouncycastle.crypto.modes.gcm.GCMExponentiator;
import org.bouncycastle.crypto.modes.gcm.GCMMultiplier;
import org.bouncycastle.crypto.modes.gcm.GCMUtil;
import org.bouncycastle.crypto.modes.gcm.Tables4kGCMMultiplier;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class GCMBlockCipher implements GCMModeCipher {
    private static final int BLOCK_SIZE = 16;
    private byte[] H;
    private byte[] J0;
    private byte[] S;
    private byte[] S_at;
    private byte[] S_atPre;
    private byte[] atBlock;
    private int atBlockPos;
    private long atLength;
    private long atLengthPre;
    private int blocksRemaining;
    private byte[] bufBlock;
    private int bufOff;
    private BlockCipher cipher;
    private byte[] counter;
    private GCMExponentiator exp;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private boolean initialised;
    private byte[] lastKey;
    private byte[] macBlock;
    private int macSize;
    private GCMMultiplier multiplier;
    private byte[] nonce;
    private long totalLength;

    public GCMBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, null);
    }

    private void checkStatus() {
        if (this.initialised) {
            return;
        }
        if (!this.forEncryption) {
            throw new IllegalStateException("GCM cipher needs to be initialised");
        }
        throw new IllegalStateException("GCM cipher cannot be reused for encryption");
    }

    private void decryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        if (bArr2.length - i16 < 16) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (this.totalLength == 0) {
            initCipher();
        }
        byte[] bArr3 = new byte[16];
        getNextCTRBlock(bArr3);
        gHASHBlock(this.S, bArr, i15);
        GCMUtil.xor(bArr3, 0, bArr, i15, bArr2, i16);
        this.totalLength += 16;
    }

    private void encryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        if (bArr2.length - i16 < 16) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (this.totalLength == 0) {
            initCipher();
        }
        byte[] bArr3 = new byte[16];
        getNextCTRBlock(bArr3);
        GCMUtil.xor(bArr3, bArr, i15);
        gHASHBlock(this.S, bArr3);
        System.arraycopy(bArr3, 0, bArr2, i16, 16);
        this.totalLength += 16;
    }

    private void gHASH(byte[] bArr, byte[] bArr2, int i15) {
        for (int i16 = 0; i16 < i15; i16 += 16) {
            gHASHPartial(bArr, bArr2, i16, Math.min(i15 - i16, 16));
        }
    }

    private void gHASHBlock(byte[] bArr, byte[] bArr2) {
        GCMUtil.xor(bArr, bArr2);
        this.multiplier.multiplyH(bArr);
    }

    private void gHASHPartial(byte[] bArr, byte[] bArr2, int i15, int i16) {
        GCMUtil.xor(bArr, bArr2, i15, i16);
        this.multiplier.multiplyH(bArr);
    }

    private void getNextCTRBlock(byte[] bArr) {
        int i15 = this.blocksRemaining;
        if (i15 == 0) {
            throw new IllegalStateException("Attempt to process too many blocks");
        }
        this.blocksRemaining = i15 - 1;
        byte[] bArr2 = this.counter;
        int i16 = (bArr2[15] & 255) + 1;
        bArr2[15] = (byte) i16;
        int i17 = (i16 >>> 8) + (bArr2[14] & 255);
        bArr2[14] = (byte) i17;
        int i18 = (i17 >>> 8) + (bArr2[13] & 255);
        bArr2[13] = (byte) i18;
        bArr2[12] = (byte) ((i18 >>> 8) + (bArr2[12] & 255));
        this.cipher.processBlock(bArr2, 0, bArr, 0);
    }

    private void initCipher() {
        if (this.atLength > 0) {
            System.arraycopy(this.S_at, 0, this.S_atPre, 0, 16);
            this.atLengthPre = this.atLength;
        }
        int i15 = this.atBlockPos;
        if (i15 > 0) {
            gHASHPartial(this.S_atPre, this.atBlock, 0, i15);
            this.atLengthPre += (long) this.atBlockPos;
        }
        if (this.atLengthPre > 0) {
            System.arraycopy(this.S_atPre, 0, this.S, 0, 16);
        }
    }

    public static GCMModeCipher newInstance(BlockCipher blockCipher) {
        return new GCMBlockCipher(blockCipher);
    }

    private void processPartial(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
        byte[] bArr3 = new byte[16];
        getNextCTRBlock(bArr3);
        if (this.forEncryption) {
            GCMUtil.xor(bArr, i15, bArr3, 0, i16);
            gHASHPartial(this.S, bArr, i15, i16);
        } else {
            gHASHPartial(this.S, bArr, i15, i16);
            GCMUtil.xor(bArr, i15, bArr3, 0, i16);
        }
        System.arraycopy(bArr, i15, bArr2, i17, i16);
        this.totalLength += (long) i16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i15) throws InvalidCipherTextException {
        GCMBlockCipher gCMBlockCipher;
        byte[] bArr2;
        int i16;
        checkStatus();
        if (this.totalLength == 0) {
            initCipher();
        }
        int i17 = this.bufOff;
        if (!this.forEncryption) {
            int i18 = this.macSize;
            if (i17 < i18) {
                throw new InvalidCipherTextException("data too short");
            }
            i17 -= i18;
            if (bArr.length - i15 < i17) {
                throw new OutputLengthException("Output buffer too short");
            }
        } else if (bArr.length - i15 < this.macSize + i17) {
            throw new OutputLengthException("Output buffer too short");
        }
        int i19 = i17;
        if (i19 > 0) {
            gCMBlockCipher = this;
            bArr2 = bArr;
            i16 = i15;
            gCMBlockCipher.processPartial(this.bufBlock, 0, i19, bArr2, i16);
        } else {
            gCMBlockCipher = this;
            bArr2 = bArr;
            i16 = i15;
        }
        long j15 = gCMBlockCipher.atLength;
        int i25 = gCMBlockCipher.atBlockPos;
        long j16 = j15 + ((long) i25);
        gCMBlockCipher.atLength = j16;
        if (j16 > gCMBlockCipher.atLengthPre) {
            if (i25 > 0) {
                gHASHPartial(gCMBlockCipher.S_at, gCMBlockCipher.atBlock, 0, i25);
            }
            if (gCMBlockCipher.atLengthPre > 0) {
                GCMUtil.xor(gCMBlockCipher.S_at, gCMBlockCipher.S_atPre);
            }
            long j17 = ((gCMBlockCipher.totalLength * 8) + 127) >>> 7;
            byte[] bArr3 = new byte[16];
            if (gCMBlockCipher.exp == null) {
                BasicGCMExponentiator basicGCMExponentiator = new BasicGCMExponentiator();
                gCMBlockCipher.exp = basicGCMExponentiator;
                basicGCMExponentiator.init(gCMBlockCipher.H);
            }
            gCMBlockCipher.exp.exponentiateX(j17, bArr3);
            GCMUtil.multiply(gCMBlockCipher.S_at, bArr3);
            GCMUtil.xor(gCMBlockCipher.S, gCMBlockCipher.S_at);
        }
        byte[] bArr4 = new byte[16];
        Pack.longToBigEndian(gCMBlockCipher.atLength * 8, bArr4, 0);
        Pack.longToBigEndian(gCMBlockCipher.totalLength * 8, bArr4, 8);
        gHASHBlock(gCMBlockCipher.S, bArr4);
        byte[] bArr5 = new byte[16];
        gCMBlockCipher.cipher.processBlock(gCMBlockCipher.J0, 0, bArr5, 0);
        GCMUtil.xor(bArr5, gCMBlockCipher.S);
        int i26 = gCMBlockCipher.macSize;
        byte[] bArr6 = new byte[i26];
        gCMBlockCipher.macBlock = bArr6;
        System.arraycopy(bArr5, 0, bArr6, 0, i26);
        if (gCMBlockCipher.forEncryption) {
            System.arraycopy(gCMBlockCipher.macBlock, 0, bArr2, gCMBlockCipher.bufOff + i16, gCMBlockCipher.macSize);
            i19 += gCMBlockCipher.macSize;
        } else {
            int i27 = gCMBlockCipher.macSize;
            byte[] bArr7 = new byte[i27];
            System.arraycopy(gCMBlockCipher.bufBlock, i19, bArr7, 0, i27);
            if (!Arrays.constantTimeAreEqual(gCMBlockCipher.macBlock, bArr7)) {
                throw new InvalidCipherTextException("mac check in GCM failed");
            }
        }
        reset(false);
        return i19;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/GCM";
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        byte[] bArr = this.macBlock;
        return bArr == null ? new byte[this.macSize] : Arrays.clone(bArr);
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
        return this.cipher;
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
        return i16 - (i16 % 16);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        byte[] iv4;
        KeyParameter key;
        byte[] bArr;
        this.forEncryption = z15;
        this.macBlock = null;
        this.initialised = true;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            iv4 = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize < 32 || macSize > 128 || macSize % 8 != 0) {
                throw new IllegalArgumentException("Invalid value for MAC size: " + macSize);
            }
            this.macSize = macSize / 8;
            key = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("invalid parameters passed to GCM");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv4 = parametersWithIV.getIV();
            this.initialAssociatedText = null;
            this.macSize = 16;
            key = (KeyParameter) parametersWithIV.getParameters();
        }
        this.bufBlock = new byte[z15 ? 16 : this.macSize + 16];
        if (iv4 == null || iv4.length < 1) {
            throw new IllegalArgumentException("IV must be at least 1 byte");
        }
        if (z15 && (bArr = this.nonce) != null && Arrays.areEqual(bArr, iv4)) {
            if (key == null) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
            byte[] bArr2 = this.lastKey;
            if (bArr2 != null && Arrays.areEqual(bArr2, key.getKey())) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
        }
        this.nonce = iv4;
        if (key != null) {
            this.lastKey = key.getKey();
        }
        if (key != null) {
            this.cipher.init(true, key);
            byte[] bArr3 = new byte[16];
            this.H = bArr3;
            this.cipher.processBlock(bArr3, 0, bArr3, 0);
            this.multiplier.init(this.H);
            this.exp = null;
        } else if (this.H == null) {
            throw new IllegalArgumentException("Key must be specified in initial init");
        }
        byte[] bArr4 = new byte[16];
        this.J0 = bArr4;
        byte[] bArr5 = this.nonce;
        if (bArr5.length == 12) {
            System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
            this.J0[15] = 1;
        } else {
            gHASH(bArr4, bArr5, bArr5.length);
            byte[] bArr6 = new byte[16];
            Pack.longToBigEndian(((long) this.nonce.length) * 8, bArr6, 8);
            gHASHBlock(this.J0, bArr6);
        }
        this.S = new byte[16];
        this.S_at = new byte[16];
        this.S_atPre = new byte[16];
        this.atBlock = new byte[16];
        this.atBlockPos = 0;
        this.atLength = 0L;
        this.atLengthPre = 0L;
        this.counter = Arrays.clone(this.J0);
        this.blocksRemaining = -2;
        this.bufOff = 0;
        this.totalLength = 0L;
        byte[] bArr7 = this.initialAssociatedText;
        if (bArr7 != null) {
            processAADBytes(bArr7, 0, bArr7.length);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b15) {
        checkStatus();
        byte[] bArr = this.atBlock;
        int i15 = this.atBlockPos;
        bArr[i15] = b15;
        int i16 = i15 + 1;
        this.atBlockPos = i16;
        if (i16 == 16) {
            gHASHBlock(this.S_at, bArr);
            this.atBlockPos = 0;
            this.atLength += 16;
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i15, int i16) {
        checkStatus();
        int i17 = this.atBlockPos;
        if (i17 > 0) {
            int i18 = 16 - i17;
            if (i16 < i18) {
                System.arraycopy(bArr, i15, this.atBlock, i17, i16);
                this.atBlockPos += i16;
                return;
            } else {
                System.arraycopy(bArr, i15, this.atBlock, i17, i18);
                gHASHBlock(this.S_at, this.atBlock);
                this.atLength += 16;
                i15 += i18;
                i16 -= i18;
            }
        }
        int i19 = i16 + i15;
        int i25 = i19 - 16;
        while (i15 <= i25) {
            gHASHBlock(this.S_at, bArr, i15);
            this.atLength += 16;
            i15 += 16;
        }
        int i26 = i19 - i15;
        this.atBlockPos = i26;
        System.arraycopy(bArr, i15, this.atBlock, 0, i26);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b15, byte[] bArr, int i15) {
        checkStatus();
        byte[] bArr2 = this.bufBlock;
        int i16 = this.bufOff;
        bArr2[i16] = b15;
        int i17 = i16 + 1;
        this.bufOff = i17;
        if (i17 != bArr2.length) {
            return 0;
        }
        if (this.forEncryption) {
            encryptBlock(bArr2, 0, bArr, i15);
            this.bufOff = 0;
        } else {
            decryptBlock(bArr2, 0, bArr, i15);
            byte[] bArr3 = this.bufBlock;
            System.arraycopy(bArr3, 16, bArr3, 0, this.macSize);
            this.bufOff = this.macSize;
        }
        return 16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
        int i18;
        checkStatus();
        if (bArr.length - i15 < i16) {
            throw new DataLengthException("Input buffer too short");
        }
        if (bArr == bArr2 && Arrays.segmentsOverlap(i15, i16, i17, getUpdateOutputSize(i16))) {
            bArr = new byte[i16];
            System.arraycopy(bArr2, i15, bArr, 0, i16);
            i15 = 0;
        }
        int i19 = 16;
        if (this.forEncryption) {
            int i25 = this.bufOff;
            if (i25 > 0) {
                int i26 = 16 - i25;
                if (i16 < i26) {
                    System.arraycopy(bArr, i15, this.bufBlock, i25, i16);
                } else {
                    System.arraycopy(bArr, i15, this.bufBlock, i25, i26);
                    encryptBlock(this.bufBlock, 0, bArr2, i17);
                    i15 += i26;
                    i16 -= i26;
                }
            } else {
                i19 = 0;
            }
            int i27 = i16 + i15;
            int i28 = i27 - 16;
            while (i15 <= i28) {
                encryptBlock(bArr, i15, bArr2, i17 + i19);
                i15 += 16;
                i19 += 16;
            }
            int i29 = i27 - i15;
            this.bufOff = i29;
            System.arraycopy(bArr, i15, this.bufBlock, 0, i29);
            return i19;
        }
        byte[] bArr3 = this.bufBlock;
        int length = bArr3.length;
        int i35 = this.bufOff;
        int i36 = length - i35;
        if (i16 >= i36) {
            if (i35 >= 16) {
                decryptBlock(bArr3, 0, bArr2, i17);
                byte[] bArr4 = this.bufBlock;
                int i37 = this.bufOff - 16;
                this.bufOff = i37;
                System.arraycopy(bArr4, 16, bArr4, 0, i37);
                if (i16 < i36 + 16) {
                    System.arraycopy(bArr, i15, this.bufBlock, this.bufOff, i16);
                    this.bufOff += i16;
                    return 16;
                }
                i18 = 16;
            } else {
                i18 = 0;
            }
            byte[] bArr5 = this.bufBlock;
            int length2 = (i16 + i15) - bArr5.length;
            int i38 = this.bufOff;
            int i39 = 16 - i38;
            System.arraycopy(bArr, i15, bArr5, i38, i39);
            decryptBlock(this.bufBlock, 0, bArr2, i17 + i18);
            int i45 = i15 + i39;
            int i46 = i18 + 16;
            while (i45 <= length2) {
                decryptBlock(bArr, i45, bArr2, i17 + i46);
                i45 += 16;
                i46 += 16;
            }
            byte[] bArr6 = this.bufBlock;
            int length3 = (bArr6.length + length2) - i45;
            this.bufOff = length3;
            System.arraycopy(bArr, i45, bArr6, 0, length3);
            return i46;
        }
        System.arraycopy(bArr, i15, bArr3, i35, i16);
        this.bufOff += i16;
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true);
    }

    public GCMBlockCipher(BlockCipher blockCipher, GCMMultiplier gCMMultiplier) {
        if (blockCipher.getBlockSize() != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
        gCMMultiplier = gCMMultiplier == null ? new Tables4kGCMMultiplier() : gCMMultiplier;
        this.cipher = blockCipher;
        this.multiplier = gCMMultiplier;
    }

    private void gHASHBlock(byte[] bArr, byte[] bArr2, int i15) {
        GCMUtil.xor(bArr, bArr2, i15);
        this.multiplier.multiplyH(bArr);
    }

    public static GCMModeCipher newInstance(BlockCipher blockCipher, GCMMultiplier gCMMultiplier) {
        return new GCMBlockCipher(blockCipher, gCMMultiplier);
    }

    private void reset(boolean z15) {
        this.cipher.reset();
        this.S = new byte[16];
        this.S_at = new byte[16];
        this.S_atPre = new byte[16];
        this.atBlock = new byte[16];
        this.atBlockPos = 0;
        this.atLength = 0L;
        this.atLengthPre = 0L;
        this.counter = Arrays.clone(this.J0);
        this.blocksRemaining = -2;
        this.bufOff = 0;
        this.totalLength = 0L;
        byte[] bArr = this.bufBlock;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
        if (z15) {
            this.macBlock = null;
        }
        if (this.forEncryption) {
            this.initialised = false;
            return;
        }
        byte[] bArr2 = this.initialAssociatedText;
        if (bArr2 != null) {
            processAADBytes(bArr2, 0, bArr2.length);
        }
    }
}
