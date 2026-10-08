package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Properties;

/* JADX INFO: loaded from: classes5.dex */
class CustomPKCS1Encoding implements AsymmetricBlockCipher {
    private static final int HEADER_LENGTH = 10;
    private byte[] blockBuffer;
    private AsymmetricBlockCipher engine;
    private boolean forEncryption;
    private boolean forPrivateKey;
    private SecureRandom random;
    private boolean useStrictLength = useStrict();

    CustomPKCS1Encoding(AsymmetricBlockCipher asymmetricBlockCipher) {
        this.engine = asymmetricBlockCipher;
    }

    private static int checkPkcs1Encoding1(byte[] bArr) {
        int i15 = 0;
        int i16 = -((bArr[0] & 255) ^ 1);
        int i17 = 0;
        for (int i18 = 1; i18 < bArr.length; i18++) {
            int i19 = bArr[i18] & 255;
            int i25 = (i19 - 1) >> 31;
            int i26 = ((i19 ^ GF2Field.MASK) - 1) >> 31;
            i15 ^= ((~i17) & i18) & i25;
            i17 |= i25;
            i16 |= ~(i26 | i17);
        }
        return ((bArr.length - 1) - i15) | (((i15 - 9) | i16) >> 31);
    }

    private static int checkPkcs1Encoding2(byte[] bArr) {
        int i15 = 0;
        int i16 = -((bArr[0] & 255) ^ 2);
        int i17 = 0;
        for (int i18 = 1; i18 < bArr.length; i18++) {
            int i19 = ((bArr[i18] & 255) - 1) >> 31;
            i15 ^= ((~i17) & i18) & i19;
            i17 |= i19;
        }
        return ((bArr.length - 1) - i15) | ((i16 | (i15 - 9)) >> 31);
    }

    private byte[] decodeBlock(byte[] bArr, int i15, int i16) {
        int outputBlockSize = this.engine.getOutputBlockSize();
        byte[] bArrProcessBlock = this.engine.processBlock(bArr, i15, i16);
        boolean z15 = this.useStrictLength & (bArrProcessBlock.length != outputBlockSize);
        byte[] bArr2 = bArrProcessBlock.length < outputBlockSize ? this.blockBuffer : bArrProcessBlock;
        int iCheckPkcs1Encoding2 = this.forPrivateKey ? checkPkcs1Encoding2(bArr2) : checkPkcs1Encoding1(bArr2);
        if (z15 || (iCheckPkcs1Encoding2 < 0)) {
            Arrays.fill(bArrProcessBlock, (byte) 0);
            byte[] bArr3 = this.blockBuffer;
            Arrays.fill(bArr3, 0, Math.max(0, bArr3.length - bArrProcessBlock.length), (byte) 0);
            return null;
        }
        try {
            byte[] bArr4 = new byte[iCheckPkcs1Encoding2];
            System.arraycopy(bArr2, bArr2.length - iCheckPkcs1Encoding2, bArr4, 0, iCheckPkcs1Encoding2);
            return bArr4;
        } finally {
            Arrays.fill(bArrProcessBlock, (byte) 0);
            byte[] bArr5 = this.blockBuffer;
            Arrays.fill(bArr5, 0, Math.max(0, bArr5.length - bArrProcessBlock.length), (byte) 0);
        }
    }

    private byte[] encodeBlock(byte[] bArr, int i15, int i16) {
        if (i16 > getInputBlockSize()) {
            throw new IllegalArgumentException("input data too large");
        }
        int inputBlockSize = this.engine.getInputBlockSize();
        byte[] bArr2 = new byte[inputBlockSize];
        if (this.forPrivateKey) {
            bArr2[0] = 1;
            for (int i17 = 1; i17 != (inputBlockSize - i16) - 1; i17++) {
                bArr2[i17] = -1;
            }
        } else {
            this.random.nextBytes(bArr2);
            bArr2[0] = 2;
            for (int i18 = 1; i18 != (inputBlockSize - i16) - 1; i18++) {
                while (bArr2[i18] == 0) {
                    bArr2[i18] = (byte) this.random.nextInt();
                }
            }
        }
        int i19 = inputBlockSize - i16;
        bArr2[i19 - 1] = 0;
        System.arraycopy(bArr, i15, bArr2, i19, i16);
        return this.engine.processBlock(bArr2, 0, inputBlockSize);
    }

    private boolean useStrict() {
        if (Properties.isOverrideSetTo(PKCS1Encoding.NOT_STRICT_LENGTH_ENABLED_PROPERTY, true)) {
            return false;
        }
        return !Properties.isOverrideSetTo(PKCS1Encoding.STRICT_LENGTH_ENABLED_PROPERTY, false);
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        int inputBlockSize = this.engine.getInputBlockSize();
        return this.forEncryption ? inputBlockSize - 10 : inputBlockSize;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        int outputBlockSize = this.engine.getOutputBlockSize();
        return this.forEncryption ? outputBlockSize : outputBlockSize - 10;
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        AsymmetricKeyParameter asymmetricKeyParameter;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.random = parametersWithRandom.getRandom();
            asymmetricKeyParameter = (AsymmetricKeyParameter) parametersWithRandom.getParameters();
        } else {
            asymmetricKeyParameter = (AsymmetricKeyParameter) cipherParameters;
            if (!asymmetricKeyParameter.isPrivate() && z15) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
        }
        this.engine.init(z15, cipherParameters);
        this.forPrivateKey = asymmetricKeyParameter.isPrivate();
        this.forEncryption = z15;
        this.blockBuffer = new byte[this.engine.getOutputBlockSize()];
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i15, int i16) {
        return this.forEncryption ? encodeBlock(bArr, i15, i16) : decodeBlock(bArr, i15, i16);
    }
}
