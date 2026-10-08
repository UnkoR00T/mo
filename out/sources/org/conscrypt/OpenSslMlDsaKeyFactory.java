package org.conscrypt;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: loaded from: classes5.dex */
public abstract class OpenSslMlDsaKeyFactory extends KeyFactorySpi {
    private final MlDsaAlgorithm defaultAlgorithm;

    public static class MlDsa extends OpenSslMlDsaKeyFactory {
        public MlDsa() {
            super(MlDsaAlgorithm.ML_DSA_65);
        }

        @Override // org.conscrypt.OpenSslMlDsaKeyFactory
        boolean supportsAlgorithm(MlDsaAlgorithm mlDsaAlgorithm) {
            return mlDsaAlgorithm.equals(MlDsaAlgorithm.ML_DSA_44) || mlDsaAlgorithm.equals(MlDsaAlgorithm.ML_DSA_65) || mlDsaAlgorithm.equals(MlDsaAlgorithm.ML_DSA_87);
        }
    }

    public static class MlDsa44 extends OpenSslMlDsaKeyFactory {
        public MlDsa44() {
            super(MlDsaAlgorithm.ML_DSA_44);
        }

        @Override // org.conscrypt.OpenSslMlDsaKeyFactory
        boolean supportsAlgorithm(MlDsaAlgorithm mlDsaAlgorithm) {
            return mlDsaAlgorithm.equals(MlDsaAlgorithm.ML_DSA_44);
        }
    }

    public static class MlDsa65 extends OpenSslMlDsaKeyFactory {
        public MlDsa65() {
            super(MlDsaAlgorithm.ML_DSA_65);
        }

        @Override // org.conscrypt.OpenSslMlDsaKeyFactory
        boolean supportsAlgorithm(MlDsaAlgorithm mlDsaAlgorithm) {
            return mlDsaAlgorithm.equals(MlDsaAlgorithm.ML_DSA_65);
        }
    }

    public static class MlDsa87 extends OpenSslMlDsaKeyFactory {
        public MlDsa87() {
            super(MlDsaAlgorithm.ML_DSA_87);
        }

        @Override // org.conscrypt.OpenSslMlDsaKeyFactory
        boolean supportsAlgorithm(MlDsaAlgorithm mlDsaAlgorithm) {
            return mlDsaAlgorithm.equals(MlDsaAlgorithm.ML_DSA_87);
        }
    }

    static MlDsaAlgorithm getMlDsaAlgorithm(OpenSSLKey openSSLKey) {
        int iEVP_PKEY_type = NativeCrypto.EVP_PKEY_type(openSSLKey.getNativeRef());
        if (iEVP_PKEY_type == 967) {
            return MlDsaAlgorithm.ML_DSA_44;
        }
        if (iEVP_PKEY_type == 968) {
            return MlDsaAlgorithm.ML_DSA_65;
        }
        if (iEVP_PKEY_type == 969) {
            return MlDsaAlgorithm.ML_DSA_87;
        }
        throw new IllegalArgumentException("Unsupported key type");
    }

    static int getPKeyType(MlDsaAlgorithm mlDsaAlgorithm) {
        if (mlDsaAlgorithm == MlDsaAlgorithm.ML_DSA_44) {
            return 967;
        }
        if (mlDsaAlgorithm == MlDsaAlgorithm.ML_DSA_65) {
            return 968;
        }
        if (mlDsaAlgorithm == MlDsaAlgorithm.ML_DSA_87) {
            return 969;
        }
        throw new IllegalArgumentException("Unsupported algorithm: " + mlDsaAlgorithm);
    }

    private OpenSslMlDsaPrivateKey makePrivateKey(OpenSSLKey openSSLKey) throws InvalidKeySpecException {
        MlDsaAlgorithm mlDsaAlgorithm = getMlDsaAlgorithm(openSSLKey);
        if (supportsAlgorithm(mlDsaAlgorithm)) {
            try {
                return new OpenSslMlDsaPrivateKey(openSSLKey, mlDsaAlgorithm);
            } catch (IllegalArgumentException e15) {
                throw new InvalidKeySpecException("Invalid private key", e15);
            }
        }
        throw new InvalidKeySpecException("Unsupported algorithm: " + mlDsaAlgorithm);
    }

    private OpenSslMlDsaPrivateKey makePrivateKeyFromSeed(byte[] bArr, MlDsaAlgorithm mlDsaAlgorithm) throws InvalidKeySpecException {
        if (!supportsAlgorithm(mlDsaAlgorithm)) {
            throw new InvalidKeySpecException("Unsupported algorithm: " + mlDsaAlgorithm);
        }
        if (bArr.length != 32) {
            throw new InvalidKeySpecException("Invalid raw private key");
        }
        try {
            return new OpenSslMlDsaPrivateKey(bArr, mlDsaAlgorithm);
        } catch (IllegalArgumentException e15) {
            throw new InvalidKeySpecException("Invalid raw private key", e15);
        }
    }

    private OpenSslMlDsaPublicKey makePublicKey(OpenSSLKey openSSLKey) throws InvalidKeySpecException {
        MlDsaAlgorithm mlDsaAlgorithm = getMlDsaAlgorithm(openSSLKey);
        if (supportsAlgorithm(mlDsaAlgorithm)) {
            try {
                return new OpenSslMlDsaPublicKey(openSSLKey, mlDsaAlgorithm);
            } catch (IllegalArgumentException e15) {
                throw new InvalidKeySpecException("Invalid public key", e15);
            }
        }
        throw new InvalidKeySpecException("Unsupported algorithm: " + mlDsaAlgorithm);
    }

    private OpenSslMlDsaPublicKey makePublicKeyFromRaw(byte[] bArr, MlDsaAlgorithm mlDsaAlgorithm) throws InvalidKeySpecException {
        if (!supportsAlgorithm(mlDsaAlgorithm)) {
            throw new InvalidKeySpecException("Unsupported algorithm: " + mlDsaAlgorithm);
        }
        if (bArr.length != mlDsaAlgorithm.publicKeySize()) {
            throw new InvalidKeySpecException("Invalid raw public key");
        }
        try {
            return new OpenSslMlDsaPublicKey(bArr, mlDsaAlgorithm);
        } catch (IllegalArgumentException e15) {
            throw new InvalidKeySpecException("Invalid raw public key", e15);
        }
    }

    @Override // java.security.KeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec == null) {
            throw new InvalidKeySpecException("keySpec == null");
        }
        if (!(keySpec instanceof EncodedKeySpec)) {
            throw new InvalidKeySpecException("Currently only EncodedKeySpec is supported; was " + keySpec.getClass().getName());
        }
        EncodedKeySpec encodedKeySpec = (EncodedKeySpec) keySpec;
        if (encodedKeySpec.getFormat().equalsIgnoreCase("raw")) {
            return makePrivateKeyFromSeed(encodedKeySpec.getEncoded(), this.defaultAlgorithm);
        }
        if (!encodedKeySpec.getFormat().equals("PKCS#8")) {
            throw new InvalidKeySpecException("Encoding must be in PKCS#8 format");
        }
        try {
            return makePrivateKey(new OpenSSLKey(NativeCrypto.EVP_PKEY_from_private_key_info(encodedKeySpec.getEncoded(), new int[]{967, 968, 969})));
        } catch (OpenSSLX509CertificateFactory.ParsingException e15) {
            throw new InvalidKeySpecException("Unable to parse key. Only ML-DSA-44, ML-DSA-65 and ML-DSA-87 are currently supported. Please use ML-DSA 'seed format' as specified and recommended in RFC 9881.", e15);
        }
    }

    @Override // java.security.KeyFactorySpi
    protected PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec == null) {
            throw new InvalidKeySpecException("keySpec == null");
        }
        if (!(keySpec instanceof EncodedKeySpec)) {
            throw new InvalidKeySpecException("Currently only EncodedKeySpec is supported; was " + keySpec.getClass().getName());
        }
        EncodedKeySpec encodedKeySpec = (EncodedKeySpec) keySpec;
        if (encodedKeySpec.getFormat().equalsIgnoreCase("raw")) {
            return makePublicKeyFromRaw(encodedKeySpec.getEncoded(), this.defaultAlgorithm);
        }
        if (!encodedKeySpec.getFormat().equals("X.509")) {
            throw new InvalidKeySpecException("Encoding must be in X.509 format");
        }
        try {
            return makePublicKey(new OpenSSLKey(NativeCrypto.EVP_PKEY_from_subject_public_key_info(encodedKeySpec.getEncoded(), new int[]{967, 968, 969})));
        } catch (OpenSSLX509CertificateFactory.ParsingException e15) {
            throw new InvalidKeySpecException("Unable to parse key. Only ML-DSA-44, ML-DSA-65 and ML-DSA-87 are currently supported.", e15);
        }
    }

    @Override // java.security.KeyFactorySpi
    protected <T extends KeySpec> T engineGetKeySpec(Key key, Class<T> cls) throws InvalidKeySpecException {
        if (key == null) {
            throw new InvalidKeySpecException("key == null");
        }
        if (cls == null) {
            throw new InvalidKeySpecException("keySpec == null");
        }
        if (!key.getAlgorithm().equals("ML-DSA")) {
            throw new InvalidKeySpecException("Key must be an ML-DSA key");
        }
        if (key instanceof OpenSslMlDsaPublicKey) {
            OpenSslMlDsaPublicKey openSslMlDsaPublicKey = (OpenSslMlDsaPublicKey) key;
            if (!supportsAlgorithm(openSslMlDsaPublicKey.getMlDsaAlgorithm())) {
                throw new InvalidKeySpecException("Key algorithm mismatch");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
            if (EncodedKeySpec.class.isAssignableFrom(cls)) {
                return (T) KeySpecUtil.makeRawKeySpec(openSslMlDsaPublicKey.getRaw(), cls);
            }
        } else if (key instanceof OpenSslMlDsaPrivateKey) {
            OpenSslMlDsaPrivateKey openSslMlDsaPrivateKey = (OpenSslMlDsaPrivateKey) key;
            if (!supportsAlgorithm(openSslMlDsaPrivateKey.getMlDsaAlgorithm())) {
                throw new InvalidKeySpecException("Key algorithm mismatch");
            }
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
            if (EncodedKeySpec.class.isAssignableFrom(cls)) {
                return (T) KeySpecUtil.makeRawKeySpec(openSslMlDsaPrivateKey.getSeed(), cls);
            }
        }
        throw new InvalidKeySpecException("Unsupported key type and key spec combination; key=" + key.getClass().getName() + ", keySpec=" + cls.getName());
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof OpenSslMlDsaPublicKey) {
            OpenSslMlDsaPublicKey openSslMlDsaPublicKey = (OpenSslMlDsaPublicKey) key;
            if (supportsAlgorithm(openSslMlDsaPublicKey.getMlDsaAlgorithm())) {
                return openSslMlDsaPublicKey;
            }
            throw new InvalidKeyException("Key algorithm mismatch");
        }
        if (key instanceof OpenSslMlDsaPrivateKey) {
            if (supportsAlgorithm(((OpenSslMlDsaPrivateKey) key).getMlDsaAlgorithm())) {
                return key;
            }
            throw new InvalidKeyException("Key algorithm mismatch");
        }
        if ((key instanceof PrivateKey) && key.getFormat().equals("PKCS#8")) {
            try {
                return engineGeneratePrivate(new PKCS8EncodedKeySpec(key.getEncoded()));
            } catch (InvalidKeySpecException e15) {
                throw new InvalidKeyException(e15);
            }
        }
        if (!(key instanceof PublicKey) || !key.getFormat().equals("X.509")) {
            throw new InvalidKeyException("Unable to translate key into ML-DSA key");
        }
        try {
            return engineGeneratePublic(new X509EncodedKeySpec(key.getEncoded()));
        } catch (InvalidKeySpecException e16) {
            throw new InvalidKeyException(e16);
        }
    }

    abstract boolean supportsAlgorithm(MlDsaAlgorithm mlDsaAlgorithm);

    private OpenSslMlDsaKeyFactory(MlDsaAlgorithm mlDsaAlgorithm) {
        this.defaultAlgorithm = mlDsaAlgorithm;
    }
}
