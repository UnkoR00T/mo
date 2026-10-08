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
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class OpenSslSlhDsaKeyFactory extends KeyFactorySpi {
    static final byte[] x509Preamble = {48, 48, 48, 11, 6, 9, 96, -122, 72, 1, 101, 3, 4, 3, 20, 3, 33, 0};
    static final byte[] pkcs8Preamble = {48, 82, 2, 1, 0, 48, 11, 6, 9, 96, -122, 72, 1, 101, 3, 4, 3, 20, 4, 64};

    private OpenSslSlhDsaPrivateKey makePrivateKeyFromRaw(byte[] bArr) throws InvalidKeySpecException {
        if (bArr.length == 64) {
            try {
                return new OpenSslSlhDsaPrivateKey(bArr);
            } catch (IllegalArgumentException e15) {
                throw new InvalidKeySpecException("Invalid raw private key", e15);
            }
        }
        throw new InvalidKeySpecException("Invalid raw private key length: " + bArr.length + " != 64");
    }

    private OpenSslSlhDsaPublicKey makePublicKeyFromRaw(byte[] bArr) throws InvalidKeySpecException {
        if (bArr.length == 32) {
            try {
                return new OpenSslSlhDsaPublicKey(bArr);
            } catch (IllegalArgumentException e15) {
                throw new InvalidKeySpecException("Invalid raw public key", e15);
            }
        }
        throw new InvalidKeySpecException("Invalid raw public key length: " + bArr.length + " != 32");
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
        if ("raw".equalsIgnoreCase(encodedKeySpec.getFormat())) {
            return makePrivateKeyFromRaw(encodedKeySpec.getEncoded());
        }
        if (!encodedKeySpec.getFormat().equals("PKCS#8")) {
            throw new InvalidKeySpecException("Encoding must be in PKCS#8 format");
        }
        byte[] encoded = encodedKeySpec.getEncoded();
        byte[] bArr = pkcs8Preamble;
        if (ArrayUtils.startsWith(encoded, bArr)) {
            return makePrivateKeyFromRaw(Arrays.copyOfRange(encoded, bArr.length, encoded.length));
        }
        throw new InvalidKeySpecException("Only PKCS#8 format for SLH-DSA-SHA2-128S is supported");
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
        if ("raw".equalsIgnoreCase(encodedKeySpec.getFormat())) {
            return makePublicKeyFromRaw(encodedKeySpec.getEncoded());
        }
        if (!encodedKeySpec.getFormat().equals("X.509")) {
            throw new InvalidKeySpecException("Encoding must be in X.509 format");
        }
        byte[] encoded = encodedKeySpec.getEncoded();
        byte[] bArr = x509Preamble;
        if (ArrayUtils.startsWith(encoded, bArr)) {
            return makePublicKeyFromRaw(Arrays.copyOfRange(encoded, bArr.length, encoded.length));
        }
        throw new InvalidKeySpecException("Only X.509 format for SLH-DSA-SHA2-128S is supported");
    }

    @Override // java.security.KeyFactorySpi
    protected <T extends KeySpec> T engineGetKeySpec(Key key, Class<T> cls) throws InvalidKeySpecException {
        if (key == null) {
            throw new InvalidKeySpecException("key == null");
        }
        if (cls == null) {
            throw new InvalidKeySpecException("keySpec == null");
        }
        if (key instanceof OpenSslSlhDsaPublicKey) {
            OpenSslSlhDsaPublicKey openSslSlhDsaPublicKey = (OpenSslSlhDsaPublicKey) key;
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
            if (EncodedKeySpec.class.isAssignableFrom(cls)) {
                return (T) KeySpecUtil.makeRawKeySpec(openSslSlhDsaPublicKey.getRaw(), cls);
            }
        } else if (key instanceof OpenSslSlhDsaPrivateKey) {
            OpenSslSlhDsaPrivateKey openSslSlhDsaPrivateKey = (OpenSslSlhDsaPrivateKey) key;
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
            if (EncodedKeySpec.class.isAssignableFrom(cls)) {
                return (T) KeySpecUtil.makeRawKeySpec(openSslSlhDsaPrivateKey.getRaw(), cls);
            }
        }
        throw new InvalidKeySpecException("Unsupported key type and key spec combination; key=" + key.getClass().getName() + ", keySpec=" + cls.getName());
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key == null) {
            throw new InvalidKeyException("key == null");
        }
        if ((key instanceof OpenSslSlhDsaPublicKey) || (key instanceof OpenSslSlhDsaPrivateKey)) {
            return key;
        }
        if ((key instanceof PrivateKey) && key.getFormat().equals("PKCS#8")) {
            try {
                return engineGeneratePrivate(new PKCS8EncodedKeySpec(key.getEncoded()));
            } catch (InvalidKeySpecException e15) {
                throw new InvalidKeyException(e15);
            }
        }
        if (!(key instanceof PublicKey) || !key.getFormat().equals("X.509")) {
            throw new InvalidKeyException("Unable to translate key into SLH-DSA key");
        }
        try {
            return engineGeneratePublic(new X509EncodedKeySpec(key.getEncoded()));
        } catch (InvalidKeySpecException e16) {
            throw new InvalidKeyException(e16);
        }
    }
}
