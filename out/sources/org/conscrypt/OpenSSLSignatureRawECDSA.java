package org.conscrypt;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;

/* JADX INFO: loaded from: classes5.dex */
public class OpenSSLSignatureRawECDSA extends SignatureSpi {
    private ExposedByteArrayOutputStream buffer = new ExposedByteArrayOutputStream();
    private OpenSSLKey key;

    private static OpenSSLKey verifyKey(OpenSSLKey openSSLKey) throws InvalidKeyException {
        if (NativeCrypto.EVP_PKEY_type(openSSLKey.getNativeRef()) == 408) {
            return openSSLKey;
        }
        throw new InvalidKeyException("Non-EC key used to initialize EC signature.");
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) {
        this.key = verifyKey(OpenSSLKey.fromPrivateKey(privateKey));
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) {
        this.key = verifyKey(OpenSSLKey.fromPublicKey(publicKey));
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) {
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() throws SignatureException {
        OpenSSLKey openSSLKey = this.key;
        if (openSSLKey == null) {
            throw new SignatureException("No key provided");
        }
        int iECDSA_size = NativeCrypto.ECDSA_size(openSSLKey.getNativeRef());
        byte[] bArr = new byte[iECDSA_size];
        try {
            try {
                int iECDSA_sign = NativeCrypto.ECDSA_sign(this.buffer.array(), this.buffer.size(), bArr, this.key.getNativeRef());
                if (iECDSA_sign < 0) {
                    throw new SignatureException("Could not compute signature.");
                }
                if (iECDSA_sign != iECDSA_size) {
                    byte[] bArr2 = new byte[iECDSA_sign];
                    System.arraycopy(bArr, 0, bArr2, 0, iECDSA_sign);
                    bArr = bArr2;
                }
                this.buffer.reset();
                return bArr;
            } catch (Exception e15) {
                throw new SignatureException(e15);
            }
        } catch (Throwable th4) {
            this.buffer.reset();
            throw th4;
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b15) throws IOException {
        this.buffer.write(b15);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws SignatureException {
        try {
            if (this.key == null) {
                throw new SignatureException("No key provided");
            }
            try {
                int iECDSA_verify = NativeCrypto.ECDSA_verify(this.buffer.array(), this.buffer.size(), bArr, this.key.getNativeRef());
                if (iECDSA_verify == -1) {
                    throw new SignatureException("Could not verify signature.");
                }
                boolean z15 = iECDSA_verify == 1;
                this.buffer.reset();
                return z15;
            } catch (Exception e15) {
                throw new SignatureException(e15);
            }
        } catch (Throwable th4) {
            this.buffer.reset();
            throw th4;
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i15, int i16) throws IOException {
        this.buffer.write(bArr, i15, i16);
    }
}
