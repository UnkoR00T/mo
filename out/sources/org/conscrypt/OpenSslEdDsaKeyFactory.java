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
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
public final class OpenSslEdDsaKeyFactory extends KeyFactorySpi {
    @Override // java.security.KeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec == null) {
            throw new InvalidKeySpecException("keySpec == null");
        }
        if (keySpec instanceof EncodedKeySpec) {
            return new OpenSslEdDsaPrivateKey((EncodedKeySpec) keySpec);
        }
        throw new InvalidKeySpecException("Must use PKCS8EncodedKeySpec or Raw EncodedKeySpec; was " + keySpec.getClass().getName());
    }

    @Override // java.security.KeyFactorySpi
    protected PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec == null) {
            throw new InvalidKeySpecException("keySpec == null");
        }
        if (keySpec instanceof EncodedKeySpec) {
            return new OpenSslEdDsaPublicKey((EncodedKeySpec) keySpec);
        }
        throw new InvalidKeySpecException("Must use X509EncodedKeySpec or Raw EncodedKeySpec; was " + keySpec.getClass().getName());
    }

    @Override // java.security.KeyFactorySpi
    protected <T extends KeySpec> T engineGetKeySpec(Key key, Class<T> cls) throws InvalidKeySpecException {
        if (key == null) {
            throw new InvalidKeySpecException("key == null");
        }
        if (cls == null) {
            throw new InvalidKeySpecException("keySpec == null");
        }
        if (!key.getAlgorithm().equals("EdDSA") && !key.getAlgorithm().equals(EdDSAParameterSpec.Ed25519) && !key.getAlgorithm().equals("1.3.101.112")) {
            throw new InvalidKeySpecException("Key must be an EdDSA or Ed25519 key");
        }
        if (key.getEncoded() == null) {
            throw new InvalidKeySpecException("Key is destroyed");
        }
        try {
            Key keyEngineTranslateKey = engineTranslateKey(key);
            if (keyEngineTranslateKey instanceof OpenSslEdDsaPublicKey) {
                OpenSslEdDsaPublicKey openSslEdDsaPublicKey = (OpenSslEdDsaPublicKey) keyEngineTranslateKey;
                if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                    return new X509EncodedKeySpec(keyEngineTranslateKey.getEncoded());
                }
                if (EncodedKeySpec.class.isAssignableFrom(cls)) {
                    return (T) KeySpecUtil.makeRawKeySpec(openSslEdDsaPublicKey.getRaw(), cls);
                }
            } else if (keyEngineTranslateKey instanceof OpenSslEdDsaPrivateKey) {
                OpenSslEdDsaPrivateKey openSslEdDsaPrivateKey = (OpenSslEdDsaPrivateKey) keyEngineTranslateKey;
                if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                    return new PKCS8EncodedKeySpec(keyEngineTranslateKey.getEncoded());
                }
                if (EncodedKeySpec.class.isAssignableFrom(cls)) {
                    return (T) KeySpecUtil.makeRawKeySpec(openSslEdDsaPrivateKey.getRaw(), cls);
                }
            }
            throw new InvalidKeySpecException("Unsupported key type and key spec combination; key=" + keyEngineTranslateKey.getClass().getName() + ", keySpec=" + cls.getName());
        } catch (InvalidKeyException e15) {
            throw new InvalidKeySpecException("Unsupported key class: " + key.getClass(), e15);
        }
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key == null) {
            throw new InvalidKeyException("key == null");
        }
        if ((key instanceof OpenSslEdDsaPublicKey) || (key instanceof OpenSslEdDsaPrivateKey)) {
            return key;
        }
        if ((key instanceof PrivateKey) && key.getFormat().equals("PKCS#8")) {
            byte[] encoded = key.getEncoded();
            if (encoded == null) {
                throw new InvalidKeyException("Key does not support encoding");
            }
            try {
                return engineGeneratePrivate(new PKCS8EncodedKeySpec(encoded));
            } catch (InvalidKeySpecException e15) {
                throw new InvalidKeyException(e15);
            }
        }
        if (!(key instanceof PublicKey) || !key.getFormat().equals("X.509")) {
            throw new InvalidKeyException("Key must be XEC public or private key; was " + key.getClass().getName());
        }
        byte[] encoded2 = key.getEncoded();
        if (encoded2 == null) {
            throw new InvalidKeyException("Key does not support encoding");
        }
        try {
            return engineGeneratePublic(new X509EncodedKeySpec(encoded2));
        } catch (InvalidKeySpecException e16) {
            throw new InvalidKeyException(e16);
        }
    }
}
