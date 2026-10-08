package org.bouncycastle.crypto.encodings;

import java.math.BigInteger;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes5.dex */
public class ISO9796d1Encoding implements AsymmetricBlockCipher {
    private int bitSize;
    private AsymmetricBlockCipher engine;
    private boolean forEncryption;
    private BigInteger modulus;
    private int padBits = 0;
    private static final BigInteger SIXTEEN = BigInteger.valueOf(16);
    private static final BigInteger SIX = BigInteger.valueOf(6);
    private static byte[] shadows = {14, 3, 5, 8, 9, 4, 2, 15, 0, 13, 11, 6, 7, 10, 12, 1};
    private static byte[] inverse = {8, 15, 6, 1, 5, 2, 11, 12, 3, 4, 13, 10, 14, 9, 0, 7};

    public ISO9796d1Encoding(AsymmetricBlockCipher asymmetricBlockCipher) {
        this.engine = asymmetricBlockCipher;
    }

    private static byte[] convertOutputDecryptOnly(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] != 0) {
            return byteArray;
        }
        int length = byteArray.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 1, bArr, 0, length);
        return bArr;
    }

    private byte[] decodeBlock(byte[] bArr, int i15, int i16) throws InvalidCipherTextException {
        byte[] bArrProcessBlock = this.engine.processBlock(bArr, i15, i16);
        int i17 = (this.bitSize + 13) / 16;
        BigInteger bigInteger = new BigInteger(1, bArrProcessBlock);
        BigInteger bigInteger2 = SIXTEEN;
        BigInteger bigIntegerMod = bigInteger.mod(bigInteger2);
        BigInteger bigInteger3 = SIX;
        if (!bigIntegerMod.equals(bigInteger3)) {
            if (!this.modulus.subtract(bigInteger).mod(bigInteger2).equals(bigInteger3)) {
                throw new InvalidCipherTextException("resulting integer iS or (modulus - iS) is not congruent to 6 mod 16");
            }
            bigInteger = this.modulus.subtract(bigInteger);
        }
        byte[] bArrConvertOutputDecryptOnly = convertOutputDecryptOnly(bigInteger);
        if ((bArrConvertOutputDecryptOnly[bArrConvertOutputDecryptOnly.length - 1] & 15) != 6) {
            throw new InvalidCipherTextException("invalid forcing byte in block");
        }
        bArrConvertOutputDecryptOnly[bArrConvertOutputDecryptOnly.length - 1] = (byte) (((bArrConvertOutputDecryptOnly[bArrConvertOutputDecryptOnly.length - 1] & 255) >>> 4) | (inverse[(bArrConvertOutputDecryptOnly[bArrConvertOutputDecryptOnly.length - 2] & 255) >> 4] << 4));
        byte[] bArr2 = shadows;
        byte b15 = bArrConvertOutputDecryptOnly[1];
        byte b16 = (byte) (bArr2[b15 & 15] | (bArr2[(b15 & 255) >>> 4] << 4));
        bArrConvertOutputDecryptOnly[0] = b16;
        int i18 = 1;
        int i19 = 0;
        boolean z15 = false;
        for (int length = bArrConvertOutputDecryptOnly.length - 1; length >= bArrConvertOutputDecryptOnly.length - (i17 * 2); length -= 2) {
            byte[] bArr3 = shadows;
            byte b17 = bArrConvertOutputDecryptOnly[length];
            int i25 = bArr3[b17 & 15] | (bArr3[(b17 & 255) >>> 4] << 4);
            int i26 = length - 1;
            byte b18 = bArrConvertOutputDecryptOnly[i26];
            if (((b18 ^ i25) & GF2Field.MASK) != 0) {
                if (z15) {
                    throw new InvalidCipherTextException("invalid tsums in block");
                }
                i18 = (b18 ^ i25) & GF2Field.MASK;
                z15 = true;
                i19 = i26;
            }
        }
        bArrConvertOutputDecryptOnly[i19] = 0;
        int length2 = (bArrConvertOutputDecryptOnly.length - i19) / 2;
        byte[] bArr4 = new byte[length2];
        for (int i27 = 0; i27 < length2; i27++) {
            bArr4[i27] = bArrConvertOutputDecryptOnly[(i27 * 2) + i19 + 1];
        }
        this.padBits = i18 - 1;
        return bArr4;
    }

    private byte[] encodeBlock(byte[] bArr, int i15, int i16) {
        int i17 = this.bitSize;
        int i18 = (i17 + 7) / 8;
        byte[] bArr2 = new byte[i18];
        int i19 = 1;
        int i25 = this.padBits + 1;
        int i26 = (i17 + 13) / 16;
        int i27 = 0;
        while (i27 < i26) {
            if (i27 > i26 - i16) {
                int i28 = i26 - i27;
                System.arraycopy(bArr, (i15 + i16) - i28, bArr2, i18 - i26, i28);
            } else {
                System.arraycopy(bArr, i15, bArr2, i18 - (i27 + i16), i16);
            }
            i27 += i16;
        }
        for (int i29 = i18 - (i26 * 2); i29 != i18; i29 += 2) {
            byte b15 = bArr2[(i18 - i26) + (i29 / 2)];
            byte[] bArr3 = shadows;
            bArr2[i29] = (byte) (bArr3[b15 & 15] | (bArr3[(b15 & 255) >>> 4] << 4));
            bArr2[i29 + 1] = b15;
        }
        int i35 = i18 - (i16 * 2);
        bArr2[i35] = (byte) (bArr2[i35] ^ i25);
        int i36 = i18 - 1;
        bArr2[i36] = (byte) ((bArr2[i36] << 4) | 6);
        int i37 = 8 - ((this.bitSize - 1) % 8);
        if (i37 != 8) {
            byte b16 = (byte) (bArr2[0] & (GF2Field.MASK >>> i37));
            bArr2[0] = b16;
            bArr2[0] = (byte) ((128 >>> i37) | b16);
            i19 = 0;
        } else {
            bArr2[0] = 0;
            bArr2[1] = (byte) (bArr2[1] | 128);
        }
        return this.engine.processBlock(bArr2, i19, i18 - i19);
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        int inputBlockSize = this.engine.getInputBlockSize();
        return this.forEncryption ? (inputBlockSize + 1) / 2 : inputBlockSize;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        int outputBlockSize = this.engine.getOutputBlockSize();
        return this.forEncryption ? outputBlockSize : (outputBlockSize + 1) / 2;
    }

    public int getPadBits() {
        return this.padBits;
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        RSAKeyParameters rSAKeyParameters = cipherParameters instanceof ParametersWithRandom ? (RSAKeyParameters) ((ParametersWithRandom) cipherParameters).getParameters() : (RSAKeyParameters) cipherParameters;
        this.engine.init(z15, cipherParameters);
        BigInteger modulus = rSAKeyParameters.getModulus();
        this.modulus = modulus;
        this.bitSize = modulus.bitLength();
        this.forEncryption = z15;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i15, int i16) {
        return this.forEncryption ? encodeBlock(bArr, i15, i16) : decodeBlock(bArr, i15, i16);
    }

    public void setPadBits(int i15) {
        if (i15 > 7) {
            throw new IllegalArgumentException("padBits > 7");
        }
        this.padBits = i15;
    }
}
