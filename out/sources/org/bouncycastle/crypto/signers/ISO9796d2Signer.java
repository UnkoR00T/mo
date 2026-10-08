package org.bouncycastle.crypto.signers;

import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.SignerWithRecovery;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ISO9796d2Signer implements SignerWithRecovery {
    public static final int TRAILER_IMPLICIT = 188;
    public static final int TRAILER_RIPEMD128 = 13004;
    public static final int TRAILER_RIPEMD160 = 12748;
    public static final int TRAILER_SHA1 = 13260;
    public static final int TRAILER_SHA256 = 13516;
    public static final int TRAILER_SHA384 = 14028;
    public static final int TRAILER_SHA512 = 13772;
    public static final int TRAILER_WHIRLPOOL = 14284;
    private byte[] block;
    private AsymmetricBlockCipher cipher;
    private Digest digest;
    private boolean fullMessage;
    private int keyBits;
    private byte[] mBuf;
    private int messageLength;
    private byte[] preBlock;
    private byte[] preSig;
    private byte[] recoveredMessage;
    private int trailer;

    public ISO9796d2Signer(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest) {
        this(asymmetricBlockCipher, digest, false);
    }

    private void clearBlock(byte[] bArr) {
        for (int i15 = 0; i15 != bArr.length; i15++) {
            bArr[i15] = 0;
        }
    }

    private boolean isSameAs(byte[] bArr, byte[] bArr2) {
        boolean z15;
        int i15 = this.messageLength;
        byte[] bArr3 = this.mBuf;
        if (i15 > bArr3.length) {
            z15 = bArr3.length <= bArr2.length;
            for (int i16 = 0; i16 != this.mBuf.length; i16++) {
                if (bArr[i16] != bArr2[i16]) {
                    z15 = false;
                }
            }
            return z15;
        }
        z15 = i15 == bArr2.length;
        for (int i17 = 0; i17 != bArr2.length; i17++) {
            if (bArr[i17] != bArr2[i17]) {
                z15 = false;
            }
        }
        return z15;
    }

    private boolean returnFalse(byte[] bArr) {
        this.messageLength = 0;
        clearBlock(this.mBuf);
        clearBlock(bArr);
        return false;
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        int length;
        int i15;
        int i16;
        int i17;
        int digestSize = this.digest.getDigestSize();
        if (this.trailer == 188) {
            byte[] bArr = this.block;
            length = (bArr.length - digestSize) - 1;
            this.digest.doFinal(bArr, length);
            byte[] bArr2 = this.block;
            bArr2[bArr2.length - 1] = PSSSigner.TRAILER_IMPLICIT;
            i15 = 8;
        } else {
            byte[] bArr3 = this.block;
            length = (bArr3.length - digestSize) - 2;
            this.digest.doFinal(bArr3, length);
            byte[] bArr4 = this.block;
            int length2 = bArr4.length - 2;
            int i18 = this.trailer;
            bArr4[length2] = (byte) (i18 >>> 8);
            bArr4[bArr4.length - 1] = (byte) i18;
            i15 = 16;
        }
        int i19 = this.messageLength;
        int i25 = ((((digestSize + i19) * 8) + i15) + 4) - this.keyBits;
        if (i25 > 0) {
            int i26 = i19 - ((i25 + 7) / 8);
            i16 = length - i26;
            System.arraycopy(this.mBuf, 0, this.block, i16, i26);
            this.recoveredMessage = new byte[i26];
            i17 = 96;
        } else {
            i16 = length - i19;
            System.arraycopy(this.mBuf, 0, this.block, i16, i19);
            this.recoveredMessage = new byte[this.messageLength];
            i17 = 64;
        }
        int i27 = i16 - 1;
        if (i27 > 0) {
            for (int i28 = i27; i28 != 0; i28--) {
                this.block[i28] = -69;
            }
            byte[] bArr5 = this.block;
            bArr5[i27] = (byte) (bArr5[i27] ^ 1);
            bArr5[0] = 11;
            bArr5[0] = (byte) (11 | i17);
        } else {
            byte[] bArr6 = this.block;
            bArr6[0] = 10;
            bArr6[0] = (byte) (10 | i17);
        }
        AsymmetricBlockCipher asymmetricBlockCipher = this.cipher;
        byte[] bArr7 = this.block;
        byte[] bArrProcessBlock = asymmetricBlockCipher.processBlock(bArr7, 0, bArr7.length);
        this.fullMessage = (i17 & 32) == 0;
        byte[] bArr8 = this.mBuf;
        byte[] bArr9 = this.recoveredMessage;
        System.arraycopy(bArr8, 0, bArr9, 0, bArr9.length);
        this.messageLength = 0;
        clearBlock(this.mBuf);
        clearBlock(this.block);
        return bArrProcessBlock;
    }

    @Override // org.bouncycastle.crypto.SignerWithRecovery
    public byte[] getRecoveredMessage() {
        return this.recoveredMessage;
    }

    @Override // org.bouncycastle.crypto.SignerWithRecovery
    public boolean hasFullMessage() {
        return this.fullMessage;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z15, CipherParameters cipherParameters) {
        RSAKeyParameters rSAKeyParameters = (RSAKeyParameters) cipherParameters;
        this.cipher.init(z15, rSAKeyParameters);
        int iBitLength = rSAKeyParameters.getModulus().bitLength();
        this.keyBits = iBitLength;
        byte[] bArr = new byte[(iBitLength + 7) / 8];
        this.block = bArr;
        int i15 = this.trailer;
        int length = bArr.length;
        if (i15 == 188) {
            this.mBuf = new byte[(length - this.digest.getDigestSize()) - 2];
        } else {
            this.mBuf = new byte[(length - this.digest.getDigestSize()) - 3];
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.digest.reset();
        this.messageLength = 0;
        clearBlock(this.mBuf);
        byte[] bArr = this.recoveredMessage;
        if (bArr != null) {
            clearBlock(bArr);
        }
        this.recoveredMessage = null;
        this.fullMessage = false;
        if (this.preSig != null) {
            this.preSig = null;
            clearBlock(this.preBlock);
            this.preBlock = null;
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b15) {
        this.digest.update(b15);
        int i15 = this.messageLength;
        byte[] bArr = this.mBuf;
        if (i15 < bArr.length) {
            bArr[i15] = b15;
        }
        this.messageLength = i15 + 1;
    }

    @Override // org.bouncycastle.crypto.SignerWithRecovery
    public void updateWithRecoveredMessage(byte[] bArr) throws InvalidCipherTextException {
        int i15;
        byte[] bArrProcessBlock = this.cipher.processBlock(bArr, 0, bArr.length);
        if (((bArrProcessBlock[0] & 192) ^ 64) != 0) {
            throw new InvalidCipherTextException("malformed signature");
        }
        if (((bArrProcessBlock[bArrProcessBlock.length - 1] & 15) ^ 12) != 0) {
            throw new InvalidCipherTextException("malformed signature");
        }
        if (((bArrProcessBlock[bArrProcessBlock.length - 1] & 255) ^ 188) == 0) {
            i15 = 1;
        } else {
            i15 = 2;
            int i16 = ((bArrProcessBlock[bArrProcessBlock.length - 2] & 255) << 8) | (bArrProcessBlock[bArrProcessBlock.length - 1] & 255);
            Integer trailer = ISOTrailers.getTrailer(this.digest);
            if (trailer == null) {
                throw new IllegalArgumentException("unrecognised hash in signature");
            }
            int iIntValue = trailer.intValue();
            if (i16 != iIntValue && (iIntValue != 15052 || i16 != 16588)) {
                throw new IllegalStateException("signer initialised with wrong digest for trailer " + i16);
            }
        }
        int i17 = 0;
        while (i17 != bArrProcessBlock.length && ((bArrProcessBlock[i17] & 15) ^ 10) != 0) {
            i17++;
        }
        int i18 = i17 + 1;
        int length = ((bArrProcessBlock.length - i15) - this.digest.getDigestSize()) - i18;
        if (length <= 0) {
            throw new InvalidCipherTextException("malformed block");
        }
        if ((bArrProcessBlock[0] & 32) == 0) {
            this.fullMessage = true;
            byte[] bArr2 = new byte[length];
            this.recoveredMessage = bArr2;
            System.arraycopy(bArrProcessBlock, i18, bArr2, 0, bArr2.length);
        } else {
            this.fullMessage = false;
            byte[] bArr3 = new byte[length];
            this.recoveredMessage = bArr3;
            System.arraycopy(bArrProcessBlock, i18, bArr3, 0, bArr3.length);
        }
        this.preSig = bArr;
        this.preBlock = bArrProcessBlock;
        Digest digest = this.digest;
        byte[] bArr4 = this.recoveredMessage;
        digest.update(bArr4, 0, bArr4.length);
        byte[] bArr5 = this.recoveredMessage;
        this.messageLength = bArr5.length;
        System.arraycopy(bArr5, 0, this.mBuf, 0, bArr5.length);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        byte[] bArrProcessBlock;
        int i15;
        byte[] bArr2 = this.preSig;
        if (bArr2 == null) {
            try {
                bArrProcessBlock = this.cipher.processBlock(bArr, 0, bArr.length);
            } catch (Exception unused) {
                return false;
            }
        } else {
            if (!Arrays.areEqual(bArr2, bArr)) {
                throw new IllegalStateException("updateWithRecoveredMessage called on different signature");
            }
            bArrProcessBlock = this.preBlock;
            this.preSig = null;
            this.preBlock = null;
        }
        if (((bArrProcessBlock[0] & 192) ^ 64) == 0 && ((bArrProcessBlock[bArrProcessBlock.length - 1] & 15) ^ 12) == 0) {
            if (((bArrProcessBlock[bArrProcessBlock.length - 1] & 255) ^ 188) == 0) {
                i15 = 1;
            } else {
                i15 = 2;
                int i16 = ((bArrProcessBlock[bArrProcessBlock.length - 2] & 255) << 8) | (bArrProcessBlock[bArrProcessBlock.length - 1] & 255);
                Integer trailer = ISOTrailers.getTrailer(this.digest);
                if (trailer == null) {
                    throw new IllegalArgumentException("unrecognised hash in signature");
                }
                int iIntValue = trailer.intValue();
                if (i16 != iIntValue && (iIntValue != 15052 || i16 != 16588)) {
                    throw new IllegalStateException("signer initialised with wrong digest for trailer " + i16);
                }
            }
            int i17 = 0;
            while (i17 != bArrProcessBlock.length && ((bArrProcessBlock[i17] & 15) ^ 10) != 0) {
                i17++;
            }
            int i18 = i17 + 1;
            int digestSize = this.digest.getDigestSize();
            byte[] bArr3 = new byte[digestSize];
            int length = (bArrProcessBlock.length - i15) - digestSize;
            int i19 = length - i18;
            if (i19 <= 0) {
                return returnFalse(bArrProcessBlock);
            }
            if ((bArrProcessBlock[0] & 32) == 0) {
                this.fullMessage = true;
                if (this.messageLength > i19) {
                    return returnFalse(bArrProcessBlock);
                }
                this.digest.reset();
                this.digest.update(bArrProcessBlock, i18, i19);
                this.digest.doFinal(bArr3, 0);
                boolean z15 = true;
                for (int i25 = 0; i25 != digestSize; i25++) {
                    int i26 = length + i25;
                    byte b15 = (byte) (bArrProcessBlock[i26] ^ bArr3[i25]);
                    bArrProcessBlock[i26] = b15;
                    if (b15 != 0) {
                        z15 = false;
                    }
                }
                if (!z15) {
                    return returnFalse(bArrProcessBlock);
                }
                byte[] bArr4 = new byte[i19];
                this.recoveredMessage = bArr4;
                System.arraycopy(bArrProcessBlock, i18, bArr4, 0, bArr4.length);
            } else {
                this.fullMessage = false;
                this.digest.doFinal(bArr3, 0);
                boolean z16 = true;
                for (int i27 = 0; i27 != digestSize; i27++) {
                    int i28 = length + i27;
                    byte b16 = (byte) (bArrProcessBlock[i28] ^ bArr3[i27]);
                    bArrProcessBlock[i28] = b16;
                    if (b16 != 0) {
                        z16 = false;
                    }
                }
                if (!z16) {
                    return returnFalse(bArrProcessBlock);
                }
                byte[] bArr5 = new byte[i19];
                this.recoveredMessage = bArr5;
                System.arraycopy(bArrProcessBlock, i18, bArr5, 0, bArr5.length);
            }
            if (this.messageLength != 0 && !isSameAs(this.mBuf, this.recoveredMessage)) {
                return returnFalse(bArrProcessBlock);
            }
            clearBlock(this.mBuf);
            clearBlock(bArrProcessBlock);
            this.messageLength = 0;
            return true;
        }
        return returnFalse(bArrProcessBlock);
    }

    public ISO9796d2Signer(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, boolean z15) {
        int iIntValue;
        this.cipher = asymmetricBlockCipher;
        this.digest = digest;
        if (z15) {
            iIntValue = 188;
        } else {
            Integer trailer = ISOTrailers.getTrailer(digest);
            if (trailer == null) {
                throw new IllegalArgumentException("no valid trailer for digest: " + digest.getAlgorithmName());
            }
            iIntValue = trailer.intValue();
        }
        this.trailer = iIntValue;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i15, int i16) {
        while (i16 > 0 && this.messageLength < this.mBuf.length) {
            update(bArr[i15]);
            i15++;
            i16--;
        }
        this.digest.update(bArr, i15, i16);
        this.messageLength += i16;
    }
}
