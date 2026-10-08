package org.conscrypt;

import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;

/* JADX INFO: loaded from: classes5.dex */
public class OpenSslMlKemKeyPairGenerator extends KeyPairGenerator {

    public static class MlKem extends MlKem768 {
        public MlKem() {
            super("ML-KEM");
        }
    }

    public static final class MlKem1024 extends OpenSslMlKemKeyPairGenerator {
        public MlKem1024() {
            super("ML-KEM-1024");
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public KeyPair generateKeyPair() {
            byte[] bArr = new byte[64];
            NativeCrypto.RAND_bytes(bArr);
            byte[] bArrMLKEM1024_public_key_from_seed = NativeCrypto.MLKEM1024_public_key_from_seed(bArr);
            MlKemAlgorithm mlKemAlgorithm = MlKemAlgorithm.ML_KEM_1024;
            return new KeyPair(new OpenSslMlKemPublicKey(bArrMLKEM1024_public_key_from_seed, mlKemAlgorithm), new OpenSslMlKemPrivateKey(bArr, mlKemAlgorithm));
        }
    }

    public static class MlKem768 extends OpenSslMlKemKeyPairGenerator {
        public MlKem768() {
            super("ML-KEM-768");
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public KeyPair generateKeyPair() {
            byte[] bArr = new byte[64];
            NativeCrypto.RAND_bytes(bArr);
            byte[] bArrMLKEM768_public_key_from_seed = NativeCrypto.MLKEM768_public_key_from_seed(bArr);
            MlKemAlgorithm mlKemAlgorithm = MlKemAlgorithm.ML_KEM_768;
            return new KeyPair(new OpenSslMlKemPublicKey(bArrMLKEM768_public_key_from_seed, mlKemAlgorithm), new OpenSslMlKemPrivateKey(bArr, mlKemAlgorithm));
        }

        MlKem768(String str) {
            super(str);
        }
    }

    @Override // java.security.KeyPairGenerator
    public void initialize(int i15) {
        if (i15 != -1) {
            throw new InvalidParameterException("ML-DSA only supports -1 for bits");
        }
    }

    private OpenSslMlKemKeyPairGenerator(String str) {
        super(str);
    }
}
