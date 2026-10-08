package org.conscrypt;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;

/* JADX INFO: loaded from: classes5.dex */
public abstract class OpenSslSignatureMlDsa extends SignatureSpi {
    private static OpenSslMlDsaKeyFactory keyFactory = new OpenSslMlDsaKeyFactory.MlDsa();
    private ExposedByteArrayOutputStream buffer = new ExposedByteArrayOutputStream();
    private NativeRef.EVP_MD_CTX ctx;
    private OpenSSLKey key;

    public static class MlDsa extends OpenSslSignatureMlDsa {
        @Override // org.conscrypt.OpenSslSignatureMlDsa
        boolean supportsAlgorithm(MlDsaAlgorithm mlDsaAlgorithm) {
            return mlDsaAlgorithm.equals(MlDsaAlgorithm.ML_DSA_44) || mlDsaAlgorithm.equals(MlDsaAlgorithm.ML_DSA_65) || mlDsaAlgorithm.equals(MlDsaAlgorithm.ML_DSA_87);
        }
    }

    public static class MlDsa44 extends OpenSslSignatureMlDsa {
        @Override // org.conscrypt.OpenSslSignatureMlDsa
        boolean supportsAlgorithm(MlDsaAlgorithm mlDsaAlgorithm) {
            return mlDsaAlgorithm.equals(MlDsaAlgorithm.ML_DSA_44);
        }
    }

    public static class MlDsa65 extends OpenSslSignatureMlDsa {
        @Override // org.conscrypt.OpenSslSignatureMlDsa
        boolean supportsAlgorithm(MlDsaAlgorithm mlDsaAlgorithm) {
            return mlDsaAlgorithm.equals(MlDsaAlgorithm.ML_DSA_65);
        }
    }

    public static class MlDsa87 extends OpenSslSignatureMlDsa {
        @Override // org.conscrypt.OpenSslSignatureMlDsa
        boolean supportsAlgorithm(MlDsaAlgorithm mlDsaAlgorithm) {
            return mlDsaAlgorithm.equals(MlDsaAlgorithm.ML_DSA_87);
        }
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        OpenSSLKey openSSLKey = ((OpenSslMlDsaPrivateKey) keyFactory.engineTranslateKey(privateKey)).getOpenSSLKey();
        this.key = openSSLKey;
        MlDsaAlgorithm mlDsaAlgorithm = OpenSslMlDsaKeyFactory.getMlDsaAlgorithm(openSSLKey);
        if (!supportsAlgorithm(mlDsaAlgorithm)) {
            throw new InvalidKeyException("Key version mismatch: " + mlDsaAlgorithm);
        }
        NativeRef.EVP_MD_CTX evp_md_ctx = new NativeRef.EVP_MD_CTX(NativeCrypto.EVP_MD_CTX_create());
        NativeCrypto.EVP_DigestSignInit(evp_md_ctx, 0L, this.key.getNativeRef());
        this.ctx = evp_md_ctx;
        this.buffer.reset();
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        OpenSSLKey openSSLKey = ((OpenSslMlDsaPublicKey) keyFactory.engineTranslateKey(publicKey)).getOpenSSLKey();
        this.key = openSSLKey;
        MlDsaAlgorithm mlDsaAlgorithm = OpenSslMlDsaKeyFactory.getMlDsaAlgorithm(openSSLKey);
        if (!supportsAlgorithm(mlDsaAlgorithm)) {
            throw new InvalidKeyException("Key version mismatch: " + mlDsaAlgorithm);
        }
        NativeRef.EVP_MD_CTX evp_md_ctx = new NativeRef.EVP_MD_CTX(NativeCrypto.EVP_MD_CTX_create());
        NativeCrypto.EVP_DigestVerifyInit(evp_md_ctx, 0L, this.key.getNativeRef());
        this.ctx = evp_md_ctx;
        this.buffer.reset();
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) {
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() throws SignatureException {
        NativeRef.EVP_MD_CTX evp_md_ctx = this.ctx;
        if (this.key == null) {
            throw new SignatureException("No key provided");
        }
        byte[] bArrEVP_DigestSign = NativeCrypto.EVP_DigestSign(evp_md_ctx, this.buffer.array(), 0, this.buffer.size());
        this.buffer.reset();
        return bArrEVP_DigestSign;
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b15) throws IOException {
        this.buffer.write(b15);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws SignatureException {
        NativeRef.EVP_MD_CTX evp_md_ctx = this.ctx;
        if (this.key == null) {
            throw new SignatureException("No key provided");
        }
        boolean zEVP_DigestVerify = NativeCrypto.EVP_DigestVerify(evp_md_ctx, bArr, 0, bArr.length, this.buffer.array(), 0, this.buffer.size());
        this.buffer.reset();
        return zEVP_DigestVerify;
    }

    abstract boolean supportsAlgorithm(MlDsaAlgorithm mlDsaAlgorithm);

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i15, int i16) throws IOException {
        this.buffer.write(bArr, i15, i16);
    }
}
