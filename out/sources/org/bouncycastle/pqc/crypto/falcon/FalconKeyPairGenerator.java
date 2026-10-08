package org.bouncycastle.pqc.crypto.falcon;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes5.dex */
public class FalconKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private FalconNIST nist;
    private FalconKeyGenerationParameters params;
    private int pk_size;
    private int sk_size;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        byte[][] bArrCrypto_sign_keypair = this.nist.crypto_sign_keypair(new byte[this.pk_size], new byte[this.sk_size]);
        FalconParameters parameters = this.params.getParameters();
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new FalconPublicKeyParameters(parameters, bArrCrypto_sign_keypair[0]), (AsymmetricKeyParameter) new FalconPrivateKeyParameters(parameters, bArrCrypto_sign_keypair[1], bArrCrypto_sign_keypair[2], bArrCrypto_sign_keypair[3], bArrCrypto_sign_keypair[0]));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        int i15;
        this.params = (FalconKeyGenerationParameters) keyGenerationParameters;
        SecureRandom random = keyGenerationParameters.getRandom();
        FalconKeyGenerationParameters falconKeyGenerationParameters = (FalconKeyGenerationParameters) keyGenerationParameters;
        int logN = falconKeyGenerationParameters.getParameters().getLogN();
        this.nist = new FalconNIST(logN, falconKeyGenerationParameters.getParameters().getNonceLength(), random);
        int i16 = 1 << logN;
        if (i16 == 1024) {
            i15 = 5;
        } else if (i16 == 256 || i16 == 512) {
            i15 = 6;
        } else {
            i15 = (i16 == 64 || i16 == 128) ? 7 : 8;
        }
        this.pk_size = ((i16 * 14) / 8) + 1;
        this.sk_size = (((i15 * 2) * i16) / 8) + 1 + i16;
    }
}
