package org.conscrypt;

import java.io.IOException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;

/* JADX INFO: loaded from: classes5.dex */
public class OpenSslSignatureSlhDsa extends SignatureSpi {
    private ExposedByteArrayOutputStream buffer = new ExposedByteArrayOutputStream();
    private OpenSslSlhDsaPrivateKey privateKey;
    private OpenSslSlhDsaPublicKey publicKey;

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) {
        this.privateKey = (OpenSslSlhDsaPrivateKey) privateKey;
        this.publicKey = null;
        this.buffer.reset();
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) {
        this.publicKey = (OpenSslSlhDsaPublicKey) publicKey;
        this.privateKey = null;
        this.buffer.reset();
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) {
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() throws SignatureException {
        if (this.privateKey == null) {
            throw new SignatureException("No privateKey provided");
        }
        byte[] bArrSLHDSA_SHA2_128S_sign = NativeCrypto.SLHDSA_SHA2_128S_sign(this.buffer.array(), this.buffer.size(), this.privateKey.getRaw());
        this.buffer.reset();
        return bArrSLHDSA_SHA2_128S_sign;
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b15) throws IOException {
        this.buffer.write(b15);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws SignatureException {
        if (this.publicKey == null) {
            throw new SignatureException("No publicKey provided");
        }
        int iSLHDSA_SHA2_128S_verify = NativeCrypto.SLHDSA_SHA2_128S_verify(this.buffer.array(), this.buffer.size(), bArr, this.publicKey.getRaw());
        this.buffer.reset();
        return iSLHDSA_SHA2_128S_verify == 1;
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i15, int i16) throws IOException {
        this.buffer.write(bArr, i15, i16);
    }
}
