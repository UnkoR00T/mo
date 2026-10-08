package org.conscrypt;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Objects;
import javax.crypto.BadPaddingException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class HpkeImpl implements HpkeSpi {
    private static final OpenSslXwingKeyFactory xwingKeyFactory = new OpenSslXwingKeyFactory();
    private NativeRef.EVP_HPKE_CTX ctx;
    private byte[] encapsulated = null;
    private final HpkeSuite hpkeSuite;

    private static class HpkeMlKemImpl extends HpkeImpl {
        HpkeMlKemImpl(HpkeSuite hpkeSuite) {
            super(hpkeSuite);
        }

        @Override // org.conscrypt.HpkeImpl
        byte[] getPrivateRecipientKeyBytes(PrivateKey privateKey) throws InvalidKeyException {
            if (privateKey instanceof OpenSslMlKemPrivateKey) {
                return ((OpenSslMlKemPrivateKey) privateKey).getSeed();
            }
            throw new InvalidKeyException("Unsupported recipient private key class: " + privateKey.getClass());
        }

        @Override // org.conscrypt.HpkeImpl
        byte[] getRecipientPublicKeyBytes(PublicKey publicKey) throws InvalidKeyException {
            if (publicKey instanceof OpenSslMlKemPublicKey) {
                return ((OpenSslMlKemPublicKey) publicKey).getRaw();
            }
            throw new InvalidKeyException("Unsupported recipient key class: " + publicKey.getClass());
        }
    }

    private static class HpkeX25519Impl extends HpkeImpl {
        @Override // org.conscrypt.HpkeImpl
        byte[] getPrivateRecipientKeyBytes(PrivateKey privateKey) throws InvalidKeyException {
            if (privateKey instanceof OpenSSLX25519PrivateKey) {
                return ((OpenSSLX25519PrivateKey) privateKey).getU();
            }
            throw new InvalidKeyException("Unsupported recipient private key class: " + privateKey.getClass());
        }

        @Override // org.conscrypt.HpkeImpl
        byte[] getRecipientPublicKeyBytes(PublicKey publicKey) throws InvalidKeyException {
            if (publicKey instanceof OpenSSLX25519PublicKey) {
                return ((OpenSSLX25519PublicKey) publicKey).getU();
            }
            throw new InvalidKeyException("Unsupported recipient key class: " + publicKey.getClass());
        }

        private HpkeX25519Impl(HpkeSuite hpkeSuite) {
            super(hpkeSuite);
        }
    }

    private static class HpkeXwingImpl extends HpkeImpl {
        HpkeXwingImpl(HpkeSuite hpkeSuite) {
            super(hpkeSuite);
        }

        @Override // org.conscrypt.HpkeImpl
        byte[] getPrivateRecipientKeyBytes(PrivateKey privateKey) throws InvalidKeyException {
            Key keyEngineTranslateKey = HpkeImpl.xwingKeyFactory.engineTranslateKey(privateKey);
            if (keyEngineTranslateKey instanceof OpenSslXwingPrivateKey) {
                return ((OpenSslXwingPrivateKey) keyEngineTranslateKey).getRaw();
            }
            throw new IllegalStateException("Unexpected private key class");
        }

        @Override // org.conscrypt.HpkeImpl
        byte[] getRecipientPublicKeyBytes(PublicKey publicKey) throws InvalidKeyException {
            Key keyEngineTranslateKey = HpkeImpl.xwingKeyFactory.engineTranslateKey(publicKey);
            if (keyEngineTranslateKey instanceof OpenSslXwingPublicKey) {
                return ((OpenSslXwingPublicKey) keyEngineTranslateKey).getRaw();
            }
            throw new IllegalStateException("Unexpected public key class");
        }
    }

    public static class MlKem1024HkdfSha256Aes128Gcm extends HpkeMlKemImpl {
        public MlKem1024HkdfSha256Aes128Gcm() {
            super(new HpkeSuite(66, 1, 1));
        }
    }

    public static class MlKem1024HkdfSha256Aes256Gcm extends HpkeMlKemImpl {
        public MlKem1024HkdfSha256Aes256Gcm() {
            super(new HpkeSuite(66, 1, 2));
        }
    }

    public static class MlKem1024HkdfSha256ChaCha20Poly1305 extends HpkeMlKemImpl {
        public MlKem1024HkdfSha256ChaCha20Poly1305() {
            super(new HpkeSuite(66, 1, 3));
        }
    }

    public static class MlKem768HkdfSha256Aes128Gcm extends HpkeMlKemImpl {
        public MlKem768HkdfSha256Aes128Gcm() {
            super(new HpkeSuite(65, 1, 1));
        }
    }

    public static class MlKem768HkdfSha256Aes256Gcm extends HpkeMlKemImpl {
        public MlKem768HkdfSha256Aes256Gcm() {
            super(new HpkeSuite(65, 1, 2));
        }
    }

    public static class MlKem768HkdfSha256ChaCha20Poly1305 extends HpkeMlKemImpl {
        public MlKem768HkdfSha256ChaCha20Poly1305() {
            super(new HpkeSuite(65, 1, 3));
        }
    }

    public static class X25519_AES_128 extends HpkeX25519Impl {
        public X25519_AES_128() {
            super(new HpkeSuite(32, 1, 1));
        }
    }

    public static class X25519_AES_256 extends HpkeX25519Impl {
        public X25519_AES_256() {
            super(new HpkeSuite(32, 1, 2));
        }
    }

    public static class X25519_CHACHA20 extends HpkeX25519Impl {
        public X25519_CHACHA20() {
            super(new HpkeSuite(32, 1, 3));
        }
    }

    public static class XwingHkdfSha256Aes128Gcm extends HpkeXwingImpl {
        public XwingHkdfSha256Aes128Gcm() {
            super(new HpkeSuite(HpkeSuite.KEM_XWING, 1, 1));
        }
    }

    public static class XwingHkdfSha256Aes256Gcm extends HpkeXwingImpl {
        public XwingHkdfSha256Aes256Gcm() {
            super(new HpkeSuite(HpkeSuite.KEM_XWING, 1, 2));
        }
    }

    public static class XwingHkdfSha256ChaCha20Poly1305 extends HpkeXwingImpl {
        public XwingHkdfSha256ChaCha20Poly1305() {
            super(new HpkeSuite(HpkeSuite.KEM_XWING, 1, 3));
        }
    }

    public HpkeImpl(HpkeSuite hpkeSuite) {
        this.hpkeSuite = hpkeSuite;
    }

    private void checkArgumentsForBaseModeOnly(Key key, byte[] bArr, byte[] bArr2) {
        if (key != null) {
            throw new UnsupportedOperationException("Asymmetric authentication not supported");
        }
        Objects.requireNonNull(bArr);
        Objects.requireNonNull(bArr2);
        if (bArr.length > 0 || bArr2.length > 0) {
            throw new UnsupportedOperationException("PSK authentication not supported");
        }
    }

    private void checkInitialised() {
        if (this.ctx == null) {
            throw new IllegalStateException("Not initialised");
        }
    }

    private void checkIsRecipient() {
        checkInitialised();
        if (this.encapsulated != null) {
            throw new IllegalStateException("Internal error");
        }
    }

    private void checkIsSender() {
        checkInitialised();
        if (this.encapsulated == null) {
            throw new IllegalStateException("Internal error");
        }
    }

    private void checkNotInitialised() {
        if (this.ctx != null) {
            throw new IllegalStateException("Already initialised");
        }
    }

    @Override // org.conscrypt.HpkeSpi
    public byte[] engineExport(int i15, byte[] bArr) {
        checkInitialised();
        long jMaxExportLength = this.hpkeSuite.getKdf().maxExportLength();
        if (i15 >= 0 && i15 <= jMaxExportLength) {
            return NativeCrypto.EVP_HPKE_CTX_export(this.ctx, bArr, i15);
        }
        throw new IllegalArgumentException("Export length must be between 0 and " + jMaxExportLength + ", but was " + i15);
    }

    @Override // org.conscrypt.HpkeSpi
    public void engineInitRecipient(byte[] bArr, PrivateKey privateKey, byte[] bArr2, PublicKey publicKey, byte[] bArr3, byte[] bArr4) throws InvalidKeyException {
        checkNotInitialised();
        checkArgumentsForBaseModeOnly(publicKey, bArr3, bArr4);
        Preconditions.checkNotNull(bArr, "null encapsulated data");
        if (bArr.length != this.hpkeSuite.getKem().getEncapsulatedLength()) {
            throw new InvalidKeyException("Invalid encapsulated length: " + bArr.length);
        }
        if (privateKey == null) {
            throw new InvalidKeyException("null recipient key");
        }
        this.ctx = (NativeRef.EVP_HPKE_CTX) NativeCrypto.EVP_HPKE_CTX_setup_base_mode_recipient(this.hpkeSuite, getPrivateRecipientKeyBytes(privateKey), bArr, bArr2);
    }

    @Override // org.conscrypt.HpkeSpi
    public void engineInitSender(PublicKey publicKey, byte[] bArr, PrivateKey privateKey, byte[] bArr2, byte[] bArr3) throws InvalidKeyException {
        checkNotInitialised();
        checkArgumentsForBaseModeOnly(privateKey, bArr2, bArr3);
        if (publicKey == null) {
            throw new InvalidKeyException("null recipient key");
        }
        Object[] objArrEVP_HPKE_CTX_setup_base_mode_sender = NativeCrypto.EVP_HPKE_CTX_setup_base_mode_sender(this.hpkeSuite, getRecipientPublicKeyBytes(publicKey), bArr);
        this.ctx = (NativeRef.EVP_HPKE_CTX) objArrEVP_HPKE_CTX_setup_base_mode_sender[0];
        this.encapsulated = (byte[]) objArrEVP_HPKE_CTX_setup_base_mode_sender[1];
    }

    @Override // org.conscrypt.HpkeSpi
    public void engineInitSenderForTesting(PublicKey publicKey, byte[] bArr, PrivateKey privateKey, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws InvalidKeyException {
        checkNotInitialised();
        Objects.requireNonNull(bArr4);
        checkArgumentsForBaseModeOnly(privateKey, bArr2, bArr3);
        if (publicKey == null) {
            throw new InvalidKeyException("null recipient key");
        }
        Object[] objArrEVP_HPKE_CTX_setup_base_mode_sender_with_seed_for_testing = NativeCrypto.EVP_HPKE_CTX_setup_base_mode_sender_with_seed_for_testing(this.hpkeSuite, getRecipientPublicKeyBytes(publicKey), bArr, bArr4);
        this.ctx = (NativeRef.EVP_HPKE_CTX) objArrEVP_HPKE_CTX_setup_base_mode_sender_with_seed_for_testing[0];
        this.encapsulated = (byte[]) objArrEVP_HPKE_CTX_setup_base_mode_sender_with_seed_for_testing[1];
    }

    @Override // org.conscrypt.HpkeSpi
    public byte[] engineOpen(byte[] bArr, byte[] bArr2) throws HpkeDecryptException {
        checkIsRecipient();
        Preconditions.checkNotNull(bArr, "null ciphertext");
        try {
            return NativeCrypto.EVP_HPKE_CTX_open(this.ctx, bArr, bArr2);
        } catch (BadPaddingException e15) {
            throw new HpkeDecryptException(e15.getMessage());
        }
    }

    @Override // org.conscrypt.HpkeSpi
    public byte[] engineSeal(byte[] bArr, byte[] bArr2) {
        checkIsSender();
        Preconditions.checkNotNull(bArr, "null plaintext");
        return NativeCrypto.EVP_HPKE_CTX_seal(this.ctx, bArr, bArr2);
    }

    @Override // org.conscrypt.HpkeSpi
    public byte[] getEncapsulated() {
        checkIsSender();
        return this.encapsulated;
    }

    abstract byte[] getPrivateRecipientKeyBytes(PrivateKey privateKey);

    abstract byte[] getRecipientPublicKeyBytes(PublicKey publicKey);
}
