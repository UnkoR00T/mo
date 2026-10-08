package org.bouncycastle.crypto.macs;

import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.ISO7816d4Padding;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class CMac implements Mac {
    private byte[] Lu;
    private byte[] Lu2;
    private byte[] ZEROES;
    private byte[] buf;
    private int bufOff;
    private BlockCipher cipher;
    private byte[] mac;
    private int macSize;
    private byte[] poly;

    public CMac(BlockCipher blockCipher) {
        this(blockCipher, blockCipher.getBlockSize() * 8);
    }

    private byte[] doubleLu(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i15 = (-shiftLeft(bArr, bArr2)) & GF2Field.MASK;
        int length = bArr.length - 3;
        byte b15 = bArr2[length];
        byte[] bArr3 = this.poly;
        bArr2[length] = (byte) (b15 ^ (bArr3[1] & i15));
        int length2 = bArr.length - 2;
        bArr2[length2] = (byte) ((bArr3[2] & i15) ^ bArr2[length2]);
        int length3 = bArr.length - 1;
        bArr2[length3] = (byte) ((i15 & bArr3[3]) ^ bArr2[length3]);
        return bArr2;
    }

    private static byte[] lookupPoly(int i15) {
        int i16 = i15 * 8;
        int i17 = 135;
        switch (i16) {
            case 64:
            case 320:
                i17 = 27;
                break;
            case 128:
            case 192:
                break;
            case 160:
                i17 = 45;
                break;
            case BERTags.FLAGS /* 224 */:
                i17 = 777;
                break;
            case 256:
                i17 = 1061;
                break;
            case MLKEMEngine.KyberPolyBytes /* 384 */:
                i17 = 4109;
                break;
            case 448:
                i17 = 2129;
                break;
            case 512:
                i17 = 293;
                break;
            case 768:
                i17 = 655377;
                break;
            case 1024:
                i17 = 524355;
                break;
            case 2048:
                i17 = 548865;
                break;
            default:
                throw new IllegalArgumentException("Unknown block size for CMAC: " + i16);
        }
        return Pack.intToBigEndian(i17);
    }

    private static int shiftLeft(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i15 = 0;
        while (true) {
            length--;
            if (length < 0) {
                return i15;
            }
            int i16 = bArr[length] & 255;
            bArr2[length] = (byte) (i15 | (i16 << 1));
            i15 = (i16 >>> 7) & 1;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i15) {
        byte[] bArr2;
        if (this.bufOff == this.cipher.getBlockSize()) {
            bArr2 = this.Lu;
        } else {
            new ISO7816d4Padding().addPadding(this.buf, this.bufOff);
            bArr2 = this.Lu2;
        }
        int i16 = 0;
        while (true) {
            byte[] bArr3 = this.mac;
            if (i16 >= bArr3.length) {
                this.cipher.processBlock(this.buf, 0, bArr3, 0);
                System.arraycopy(this.mac, 0, bArr, i15, this.macSize);
                reset();
                return this.macSize;
            }
            byte[] bArr4 = this.buf;
            bArr4[i16] = (byte) (bArr4[i16] ^ bArr2[i16]);
            i16++;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.macSize;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        validate(cipherParameters);
        this.cipher.init(true, cipherParameters);
        byte[] bArr = this.ZEROES;
        byte[] bArr2 = new byte[bArr.length];
        this.cipher.processBlock(bArr, 0, bArr2, 0);
        byte[] bArrDoubleLu = doubleLu(bArr2);
        this.Lu = bArrDoubleLu;
        this.Lu2 = doubleLu(bArrDoubleLu);
        reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        int i15 = 0;
        while (true) {
            byte[] bArr = this.buf;
            if (i15 >= bArr.length) {
                this.bufOff = 0;
                this.cipher.reset();
                return;
            } else {
                bArr[i15] = 0;
                i15++;
            }
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b15) {
        int i15 = this.bufOff;
        byte[] bArr = this.buf;
        if (i15 == bArr.length) {
            this.cipher.processBlock(bArr, 0, this.mac, 0);
            this.bufOff = 0;
        }
        byte[] bArr2 = this.buf;
        int i16 = this.bufOff;
        this.bufOff = i16 + 1;
        bArr2[i16] = b15;
    }

    void validate(CipherParameters cipherParameters) {
        if (cipherParameters != null && !(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("CMac mode only permits key to be set.");
        }
    }

    public CMac(BlockCipher blockCipher, int i15) {
        if (i15 % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        if (i15 > blockCipher.getBlockSize() * 8) {
            throw new IllegalArgumentException("MAC size must be less or equal to " + (blockCipher.getBlockSize() * 8));
        }
        this.cipher = CBCBlockCipher.newInstance(blockCipher);
        this.macSize = i15 / 8;
        this.poly = lookupPoly(blockCipher.getBlockSize());
        this.mac = new byte[blockCipher.getBlockSize()];
        this.buf = new byte[blockCipher.getBlockSize()];
        this.ZEROES = new byte[blockCipher.getBlockSize()];
        this.bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i15, int i16) {
        if (i16 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = this.cipher.getBlockSize();
        int i17 = this.bufOff;
        int i18 = blockSize - i17;
        if (i16 > i18) {
            System.arraycopy(bArr, i15, this.buf, i17, i18);
            this.cipher.processBlock(this.buf, 0, this.mac, 0);
            this.bufOff = 0;
            i16 -= i18;
            i15 += i18;
            while (i16 > blockSize) {
                this.cipher.processBlock(bArr, i15, this.mac, 0);
                i16 -= blockSize;
                i15 += blockSize;
            }
        }
        System.arraycopy(bArr, i15, this.buf, this.bufOff, i16);
        this.bufOff += i16;
    }
}
