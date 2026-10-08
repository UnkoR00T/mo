package org.conscrypt;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class OpenSSLAeadCipherAES extends OpenSSLAeadCipher {
    private static final int AES_BLOCK_SIZE = 16;

    public static class GCM extends OpenSSLAeadCipherAES {

        public static class AES_128 extends GCM {
            @Override // org.conscrypt.OpenSSLAeadCipherAES, org.conscrypt.OpenSSLCipher
            void checkSupportedKeySize(int i15) throws InvalidKeyException {
                if (i15 == 16) {
                    return;
                }
                throw new InvalidKeyException("Unsupported key size: " + i15 + " bytes (must be 16)");
            }
        }

        public static class AES_256 extends GCM {
            @Override // org.conscrypt.OpenSSLAeadCipherAES, org.conscrypt.OpenSSLCipher
            void checkSupportedKeySize(int i15) throws InvalidKeyException {
                if (i15 == 32) {
                    return;
                }
                throw new InvalidKeyException("Unsupported key size: " + i15 + " bytes (must be 32)");
            }
        }

        public GCM() {
            super(OpenSSLCipher.Mode.GCM);
        }

        @Override // org.conscrypt.OpenSSLCipher
        void checkSupportedMode(OpenSSLCipher.Mode mode) throws NoSuchAlgorithmException {
            if (mode != OpenSSLCipher.Mode.GCM) {
                throw new NoSuchAlgorithmException("Mode must be GCM");
            }
        }

        @Override // org.conscrypt.OpenSSLAeadCipher
        long getEVP_AEAD(int i15) {
            if (i15 == 16) {
                return NativeCrypto.EVP_aead_aes_128_gcm();
            }
            if (i15 == 32) {
                return NativeCrypto.EVP_aead_aes_256_gcm();
            }
            throw new RuntimeException("Unexpected key length: " + i15);
        }
    }

    public static class GCM_SIV extends OpenSSLAeadCipherAES {

        public static class AES_128 extends GCM_SIV {
            @Override // org.conscrypt.OpenSSLAeadCipherAES, org.conscrypt.OpenSSLCipher
            void checkSupportedKeySize(int i15) throws InvalidKeyException {
                if (i15 == 16) {
                    return;
                }
                throw new InvalidKeyException("Unsupported key size: " + i15 + " bytes (must be 16)");
            }
        }

        public static class AES_256 extends GCM_SIV {
            @Override // org.conscrypt.OpenSSLAeadCipherAES, org.conscrypt.OpenSSLCipher
            void checkSupportedKeySize(int i15) throws InvalidKeyException {
                if (i15 == 32) {
                    return;
                }
                throw new InvalidKeyException("Unsupported key size: " + i15 + " bytes (must be 32)");
            }
        }

        public GCM_SIV() {
            super(OpenSSLCipher.Mode.GCM_SIV);
        }

        @Override // org.conscrypt.OpenSSLAeadCipher
        boolean allowsNonceReuse() {
            return true;
        }

        @Override // org.conscrypt.OpenSSLCipher
        void checkSupportedMode(OpenSSLCipher.Mode mode) throws NoSuchAlgorithmException {
            if (mode != OpenSSLCipher.Mode.GCM_SIV) {
                throw new NoSuchAlgorithmException("Mode must be GCM-SIV");
            }
        }

        @Override // org.conscrypt.OpenSSLAeadCipher
        void checkSupportedTagLength(int i15) throws InvalidAlgorithmParameterException {
            if (i15 != 128) {
                throw new InvalidAlgorithmParameterException("Tag length must be 128 bits");
            }
        }

        @Override // org.conscrypt.OpenSSLAeadCipher
        long getEVP_AEAD(int i15) {
            if (i15 == 16) {
                return NativeCrypto.EVP_aead_aes_128_gcm_siv();
            }
            if (i15 == 32) {
                return NativeCrypto.EVP_aead_aes_256_gcm_siv();
            }
            throw new RuntimeException("Unexpected key length: " + i15);
        }
    }

    OpenSSLAeadCipherAES(OpenSSLCipher.Mode mode) {
        super(mode);
    }

    @Override // org.conscrypt.OpenSSLCipher
    void checkSupportedKeySize(int i15) throws InvalidKeyException {
        if (i15 == 16 || i15 == 32) {
            return;
        }
        throw new InvalidKeyException("Unsupported key size: " + i15 + " bytes (must be 16 or 32)");
    }

    @Override // org.conscrypt.OpenSSLCipher, javax.crypto.CipherSpi
    protected AlgorithmParameters engineGetParameters() {
        byte[] bArr = this.f149633iv;
        if (bArr == null) {
            return null;
        }
        AlgorithmParameterSpec gCMParameterSpec = Platform.toGCMParameterSpec(this.tagLengthInBytes * 8, bArr);
        if (gCMParameterSpec == null) {
            return super.engineGetParameters();
        }
        try {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("GCM");
            algorithmParameters.init(gCMParameterSpec);
            return algorithmParameters;
        } catch (NoSuchAlgorithmException e15) {
            throw ((Error) new AssertionError("GCM not supported").initCause(e15));
        } catch (InvalidParameterSpecException unused) {
            return null;
        }
    }

    @Override // org.conscrypt.OpenSSLCipher
    String getBaseCipherName() {
        return "AES";
    }

    @Override // org.conscrypt.OpenSSLCipher
    int getCipherBlockSize() {
        return 16;
    }

    @Override // org.conscrypt.OpenSSLCipher
    int getOutputSizeForFinal(int i15) {
        return isEncrypting() ? this.bufCount + i15 + this.tagLengthInBytes : Math.max(0, (this.bufCount + i15) - this.tagLengthInBytes);
    }

    @Override // org.conscrypt.OpenSSLCipher
    protected AlgorithmParameterSpec getParameterSpec(AlgorithmParameters algorithmParameters) {
        if (algorithmParameters == null) {
            return null;
        }
        AlgorithmParameterSpec algorithmParameterSpecFromGCMParameters = Platform.fromGCMParameters(algorithmParameters);
        return algorithmParameterSpecFromGCMParameters != null ? algorithmParameterSpecFromGCMParameters : super.getParameterSpec(algorithmParameters);
    }
}
