package org.conscrypt;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class OpenSslEdDsaPrivateKey implements PrivateKey, OpenSSLKeyHolder {
    private static final long serialVersionUID = -3136201500221850916L;
    private transient OpenSSLKey key;
    private byte[] privateKeyBytes = null;

    public OpenSslEdDsaPrivateKey(EncodedKeySpec encodedKeySpec) throws InvalidKeySpecException {
        try {
            if (encodedKeySpec.getFormat().equalsIgnoreCase("raw")) {
                this.key = getOpenSslKeyFromRaw(encodedKeySpec.getEncoded());
            } else {
                if (!encodedKeySpec.getFormat().equals("PKCS#8")) {
                    throw new InvalidKeySpecException("Encoding must be in PKCS#8 or raw format");
                }
                this.key = getOpenSslKeyFromPkcS8(encodedKeySpec.getEncoded());
            }
        } catch (OpenSSLX509CertificateFactory.ParsingException e15) {
            throw new InvalidKeySpecException(e15);
        }
    }

    private static OpenSSLKey getOpenSslKeyFromPkcS8(byte[] bArr) {
        return new OpenSSLKey(NativeCrypto.EVP_PKEY_from_private_key_info(bArr, new int[]{949}));
    }

    private static OpenSSLKey getOpenSslKeyFromRaw(byte[] bArr) {
        return new OpenSSLKey(NativeCrypto.EVP_PKEY_from_raw_private_key(949, bArr));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        try {
            this.key = getOpenSslKeyFromRaw(this.privateKeyBytes);
            this.privateKeyBytes = null;
        } catch (OpenSSLX509CertificateFactory.ParsingException e15) {
            throw new IllegalArgumentException("Parsing raw key failed", e15);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this) {
            this.privateKeyBytes = getRaw();
            objectOutputStream.defaultWriteObject();
            this.privateKeyBytes = null;
        }
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        this.key = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OpenSslEdDsaPrivateKey) {
            return MessageDigest.isEqual(getRaw(), ((OpenSslEdDsaPrivateKey) obj).getRaw());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "1.3.101.112";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        OpenSSLKey openSSLKey = this.key;
        if (openSSLKey != null) {
            return NativeCrypto.EVP_marshal_private_key(openSSLKey.getNativeRef());
        }
        throw new IllegalStateException("key is destroyed");
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // org.conscrypt.OpenSSLKeyHolder
    public OpenSSLKey getOpenSSLKey() {
        return this.key;
    }

    byte[] getRaw() {
        OpenSSLKey openSSLKey = this.key;
        if (openSSLKey != null) {
            return NativeCrypto.EVP_PKEY_get_raw_private_key(openSSLKey.getNativeRef());
        }
        throw new IllegalStateException("key is destroyed");
    }

    public int hashCode() {
        return Arrays.hashCode(getRaw());
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.key == null;
    }

    public OpenSslEdDsaPrivateKey(byte[] bArr) {
        try {
            this.key = getOpenSslKeyFromRaw(bArr);
        } catch (OpenSSLX509CertificateFactory.ParsingException e15) {
            throw new IllegalArgumentException(e15);
        }
    }
}
