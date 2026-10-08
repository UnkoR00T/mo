package org.bouncycastle.crypto.modes;

import java.util.Vector;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.Longs;

/* JADX INFO: loaded from: classes5.dex */
public class OCBBlockCipher implements AEADBlockCipher {
    private static final int BLOCK_SIZE = 16;
    private byte[] Checksum;
    private Vector L;
    private byte[] L_Asterisk;
    private byte[] L_Dollar;
    private byte[] OffsetHASH;
    private byte[] Sum;
    private boolean forEncryption;
    private byte[] hashBlock;
    private long hashBlockCount;
    private int hashBlockPos;
    private BlockCipher hashCipher;
    private byte[] initialAssociatedText;
    private byte[] macBlock;
    private int macSize;
    private byte[] mainBlock;
    private long mainBlockCount;
    private int mainBlockPos;
    private BlockCipher mainCipher;
    private byte[] KtopInput = null;
    private byte[] Stretch = new byte[24];
    private byte[] OffsetMAIN_0 = new byte[16];
    private byte[] OffsetMAIN = new byte[16];

    public OCBBlockCipher(BlockCipher blockCipher, BlockCipher blockCipher2) {
        if (blockCipher == null) {
            throw new IllegalArgumentException("'hashCipher' cannot be null");
        }
        if (blockCipher.getBlockSize() != 16) {
            throw new IllegalArgumentException("'hashCipher' must have a block size of 16");
        }
        if (blockCipher2 == null) {
            throw new IllegalArgumentException("'mainCipher' cannot be null");
        }
        if (blockCipher2.getBlockSize() != 16) {
            throw new IllegalArgumentException("'mainCipher' must have a block size of 16");
        }
        if (!blockCipher.getAlgorithmName().equals(blockCipher2.getAlgorithmName())) {
            throw new IllegalArgumentException("'hashCipher' and 'mainCipher' must be the same algorithm");
        }
        this.hashCipher = blockCipher;
        this.mainCipher = blockCipher2;
    }

    protected static byte[] OCB_double(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) ((135 >>> ((1 - shiftLeft(bArr, bArr2)) << 3)) ^ bArr2[15]);
        return bArr2;
    }

    protected static void OCB_extend(byte[] bArr, int i15) {
        bArr[i15] = -128;
        while (true) {
            i15++;
            if (i15 >= 16) {
                return;
            } else {
                bArr[i15] = 0;
            }
        }
    }

    protected static int OCB_ntz(long j15) {
        return Longs.numberOfTrailingZeros(j15);
    }

    protected static int shiftLeft(byte[] bArr, byte[] bArr2) {
        int i15 = 16;
        int i16 = 0;
        while (true) {
            i15--;
            if (i15 < 0) {
                return i16;
            }
            int i17 = bArr[i15] & 255;
            bArr2[i15] = (byte) (i16 | (i17 << 1));
            i16 = (i17 >>> 7) & 1;
        }
    }

    protected static void xor(byte[] bArr, byte[] bArr2) {
        Bytes.xorTo(16, bArr2, bArr);
    }

    protected void clear(byte[] bArr) {
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i15) throws InvalidCipherTextException {
        byte[] bArr2;
        if (this.forEncryption) {
            bArr2 = null;
        } else {
            int i16 = this.mainBlockPos;
            int i17 = this.macSize;
            if (i16 < i17) {
                throw new InvalidCipherTextException("data too short");
            }
            int i18 = i16 - i17;
            this.mainBlockPos = i18;
            bArr2 = new byte[i17];
            System.arraycopy(this.mainBlock, i18, bArr2, 0, i17);
        }
        int i19 = this.hashBlockPos;
        if (i19 > 0) {
            OCB_extend(this.hashBlock, i19);
            updateHASH(this.L_Asterisk);
        }
        int i25 = this.mainBlockPos;
        if (i25 > 0) {
            if (this.forEncryption) {
                OCB_extend(this.mainBlock, i25);
                xor(this.Checksum, this.mainBlock);
            }
            xor(this.OffsetMAIN, this.L_Asterisk);
            byte[] bArr3 = new byte[16];
            this.hashCipher.processBlock(this.OffsetMAIN, 0, bArr3, 0);
            xor(this.mainBlock, bArr3);
            int length = bArr.length;
            int i26 = this.mainBlockPos;
            if (length < i15 + i26) {
                throw new OutputLengthException("Output buffer too short");
            }
            System.arraycopy(this.mainBlock, 0, bArr, i15, i26);
            if (!this.forEncryption) {
                OCB_extend(this.mainBlock, this.mainBlockPos);
                xor(this.Checksum, this.mainBlock);
            }
        }
        xor(this.Checksum, this.OffsetMAIN);
        xor(this.Checksum, this.L_Dollar);
        BlockCipher blockCipher = this.hashCipher;
        byte[] bArr4 = this.Checksum;
        blockCipher.processBlock(bArr4, 0, bArr4, 0);
        xor(this.Checksum, this.Sum);
        int i27 = this.macSize;
        byte[] bArr5 = new byte[i27];
        this.macBlock = bArr5;
        System.arraycopy(this.Checksum, 0, bArr5, 0, i27);
        int i28 = this.mainBlockPos;
        if (this.forEncryption) {
            int length2 = bArr.length;
            int i29 = i15 + i28;
            int i35 = this.macSize;
            if (length2 < i29 + i35) {
                throw new OutputLengthException("Output buffer too short");
            }
            System.arraycopy(this.macBlock, 0, bArr, i29, i35);
            i28 += this.macSize;
        } else if (!Arrays.constantTimeAreEqual(this.macBlock, bArr2)) {
            throw new InvalidCipherTextException("mac check in OCB failed");
        }
        reset(false);
        return i28;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.mainCipher.getAlgorithmName() + "/OCB";
    }

    protected byte[] getLSub(int i15) {
        while (i15 >= this.L.size()) {
            Vector vector = this.L;
            vector.addElement(OCB_double((byte[]) vector.lastElement()));
        }
        return (byte[]) this.L.elementAt(i15);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        byte[] bArr = this.macBlock;
        return bArr == null ? new byte[this.macSize] : Arrays.clone(bArr);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i15) {
        int i16 = i15 + this.mainBlockPos;
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
        return this.mainCipher;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i15) {
        int i16 = i15 + this.mainBlockPos;
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
        boolean z16 = this.forEncryption;
        this.forEncryption = z15;
        this.macBlock = null;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            iv4 = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize < 64 || macSize > 128 || macSize % 8 != 0) {
                throw new IllegalArgumentException("Invalid value for MAC size: " + macSize);
            }
            this.macSize = macSize / 8;
            key = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("invalid parameters passed to OCB");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv4 = parametersWithIV.getIV();
            this.initialAssociatedText = null;
            this.macSize = 16;
            key = (KeyParameter) parametersWithIV.getParameters();
        }
        this.hashBlock = new byte[16];
        this.mainBlock = new byte[z15 ? 16 : this.macSize + 16];
        if (iv4 == null) {
            iv4 = new byte[0];
        }
        if (iv4.length > 15) {
            throw new IllegalArgumentException("IV must be no more than 15 bytes");
        }
        if (key != null) {
            this.hashCipher.init(true, key);
            this.mainCipher.init(z15, key);
            this.KtopInput = null;
        } else if (z16 != z15) {
            throw new IllegalArgumentException("cannot change encrypting state without providing key.");
        }
        byte[] bArr = new byte[16];
        this.L_Asterisk = bArr;
        this.hashCipher.processBlock(bArr, 0, bArr, 0);
        this.L_Dollar = OCB_double(this.L_Asterisk);
        Vector vector = new Vector();
        this.L = vector;
        vector.addElement(OCB_double(this.L_Dollar));
        int iProcessNonce = processNonce(iv4);
        int i15 = iProcessNonce % 8;
        int i16 = iProcessNonce / 8;
        if (i15 == 0) {
            System.arraycopy(this.Stretch, i16, this.OffsetMAIN_0, 0, 16);
        } else {
            for (int i17 = 0; i17 < 16; i17++) {
                byte[] bArr2 = this.Stretch;
                int i18 = bArr2[i16] & 255;
                i16++;
                this.OffsetMAIN_0[i17] = (byte) (((bArr2[i16] & 255) >>> (8 - i15)) | (i18 << i15));
            }
        }
        this.hashBlockPos = 0;
        this.mainBlockPos = 0;
        this.hashBlockCount = 0L;
        this.mainBlockCount = 0L;
        this.OffsetHASH = new byte[16];
        this.Sum = new byte[16];
        System.arraycopy(this.OffsetMAIN_0, 0, this.OffsetMAIN, 0, 16);
        this.Checksum = new byte[16];
        byte[] bArr3 = this.initialAssociatedText;
        if (bArr3 != null) {
            processAADBytes(bArr3, 0, bArr3.length);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b15) {
        byte[] bArr = this.hashBlock;
        int i15 = this.hashBlockPos;
        bArr[i15] = b15;
        int i16 = i15 + 1;
        this.hashBlockPos = i16;
        if (i16 == bArr.length) {
            processHashBlock();
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i15, int i16) {
        for (int i17 = 0; i17 < i16; i17++) {
            byte[] bArr2 = this.hashBlock;
            int i18 = this.hashBlockPos;
            bArr2[i18] = bArr[i15 + i17];
            int i19 = i18 + 1;
            this.hashBlockPos = i19;
            if (i19 == bArr2.length) {
                processHashBlock();
            }
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b15, byte[] bArr, int i15) {
        byte[] bArr2 = this.mainBlock;
        int i16 = this.mainBlockPos;
        bArr2[i16] = b15;
        int i17 = i16 + 1;
        this.mainBlockPos = i17;
        if (i17 != bArr2.length) {
            return 0;
        }
        processMainBlock(bArr, i15);
        return 16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
        if (bArr.length < i15 + i16) {
            throw new DataLengthException("Input buffer too short");
        }
        if (bArr == bArr2 && Arrays.segmentsOverlap(i15, i16, i17, getUpdateOutputSize(i16))) {
            bArr = new byte[i16];
            System.arraycopy(bArr2, i15, bArr, 0, i16);
            i15 = 0;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < i16; i19++) {
            byte[] bArr3 = this.mainBlock;
            int i25 = this.mainBlockPos;
            bArr3[i25] = bArr[i15 + i19];
            int i26 = i25 + 1;
            this.mainBlockPos = i26;
            if (i26 == bArr3.length) {
                processMainBlock(bArr2, i17 + i18);
                i18 += 16;
            }
        }
        return i18;
    }

    protected void processHashBlock() {
        long j15 = this.hashBlockCount + 1;
        this.hashBlockCount = j15;
        updateHASH(getLSub(OCB_ntz(j15)));
        this.hashBlockPos = 0;
    }

    protected void processMainBlock(byte[] bArr, int i15) {
        if (bArr.length < i15 + 16) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (this.forEncryption) {
            xor(this.Checksum, this.mainBlock);
            this.mainBlockPos = 0;
        }
        byte[] bArr2 = this.OffsetMAIN;
        long j15 = this.mainBlockCount + 1;
        this.mainBlockCount = j15;
        xor(bArr2, getLSub(OCB_ntz(j15)));
        xor(this.mainBlock, this.OffsetMAIN);
        BlockCipher blockCipher = this.mainCipher;
        byte[] bArr3 = this.mainBlock;
        blockCipher.processBlock(bArr3, 0, bArr3, 0);
        xor(this.mainBlock, this.OffsetMAIN);
        System.arraycopy(this.mainBlock, 0, bArr, i15, 16);
        if (this.forEncryption) {
            return;
        }
        xor(this.Checksum, this.mainBlock);
        byte[] bArr4 = this.mainBlock;
        System.arraycopy(bArr4, 16, bArr4, 0, this.macSize);
        this.mainBlockPos = this.macSize;
    }

    protected int processNonce(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i15 = 0;
        System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
        bArr2[0] = (byte) (this.macSize << 4);
        int length = 15 - bArr.length;
        bArr2[length] = (byte) (bArr2[length] | 1);
        byte b15 = bArr2[15];
        int i16 = b15 & 63;
        bArr2[15] = (byte) (b15 & 192);
        byte[] bArr3 = this.KtopInput;
        if (bArr3 == null || !Arrays.areEqual(bArr2, bArr3)) {
            byte[] bArr4 = new byte[16];
            this.KtopInput = bArr2;
            this.hashCipher.processBlock(bArr2, 0, bArr4, 0);
            System.arraycopy(bArr4, 0, this.Stretch, 0, 16);
            while (i15 < 8) {
                byte[] bArr5 = this.Stretch;
                int i17 = i15 + 16;
                byte b16 = bArr4[i15];
                i15++;
                bArr5[i17] = (byte) (b16 ^ bArr4[i15]);
            }
        }
        return i16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true);
    }

    protected void updateHASH(byte[] bArr) {
        xor(this.OffsetHASH, bArr);
        xor(this.hashBlock, this.OffsetHASH);
        BlockCipher blockCipher = this.hashCipher;
        byte[] bArr2 = this.hashBlock;
        blockCipher.processBlock(bArr2, 0, bArr2, 0);
        xor(this.Sum, this.hashBlock);
    }

    protected void reset(boolean z15) {
        this.hashCipher.reset();
        this.mainCipher.reset();
        clear(this.hashBlock);
        clear(this.mainBlock);
        this.hashBlockPos = 0;
        this.mainBlockPos = 0;
        this.hashBlockCount = 0L;
        this.mainBlockCount = 0L;
        clear(this.OffsetHASH);
        clear(this.Sum);
        System.arraycopy(this.OffsetMAIN_0, 0, this.OffsetMAIN, 0, 16);
        clear(this.Checksum);
        if (z15) {
            this.macBlock = null;
        }
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }
}
