package org.conscrypt;

import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
public abstract class OpenSSLEvpCipher extends OpenSSLCipher {
    private boolean calledUpdate;
    private final NativeRef.EVP_CIPHER_CTX cipherCtx;
    private int modeBlockSize;

    protected OpenSSLEvpCipher(OpenSSLCipher.Mode mode, OpenSSLCipher.Padding padding) {
        super(mode, padding);
        this.cipherCtx = new NativeRef.EVP_CIPHER_CTX(NativeCrypto.EVP_CIPHER_CTX_new());
    }

    private void reset() {
        NativeCrypto.EVP_CipherInit_ex(this.cipherCtx, 0L, this.encodedKey, this.f149633iv, isEncrypting());
        this.calledUpdate = false;
    }

    int doFinalInternal(byte[] bArr, int i15, int i16) throws ShortBufferWithoutStackTraceException {
        int iEVP_CipherFinal_ex;
        if (!isEncrypting() && !this.calledUpdate) {
            return 0;
        }
        int length = bArr.length - i15;
        if (length >= i16) {
            iEVP_CipherFinal_ex = NativeCrypto.EVP_CipherFinal_ex(this.cipherCtx, bArr, i15);
        } else {
            byte[] bArr2 = new byte[i16];
            int iEVP_CipherFinal_ex2 = NativeCrypto.EVP_CipherFinal_ex(this.cipherCtx, bArr2, 0);
            if (iEVP_CipherFinal_ex2 > length) {
                throw new ShortBufferWithoutStackTraceException("buffer is too short: " + iEVP_CipherFinal_ex2 + " > " + length);
            }
            if (iEVP_CipherFinal_ex2 > 0) {
                System.arraycopy(bArr2, 0, bArr, i15, iEVP_CipherFinal_ex2);
            }
            iEVP_CipherFinal_ex = iEVP_CipherFinal_ex2;
        }
        reset();
        return (iEVP_CipherFinal_ex + i15) - i15;
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i15, int i16) {
        int iUpdateInternal;
        int outputSizeForFinal = getOutputSizeForFinal(i16);
        byte[] bArr2 = new byte[outputSizeForFinal];
        if (i16 > 0) {
            try {
                iUpdateInternal = updateInternal(bArr, i15, i16, bArr2, 0, outputSizeForFinal);
            } catch (ShortBufferException e15) {
                throw new RuntimeException("our calculated buffer was too small", e15);
            }
        } else {
            iUpdateInternal = 0;
        }
        try {
            int iDoFinalInternal = iUpdateInternal + doFinalInternal(bArr2, iUpdateInternal, outputSizeForFinal - iUpdateInternal);
            if (iDoFinalInternal == outputSizeForFinal) {
                return bArr2;
            }
            return iDoFinalInternal == 0 ? EmptyArray.BYTE : Arrays.copyOfRange(bArr2, 0, iDoFinalInternal);
        } catch (ShortBufferException e16) {
            throw new RuntimeException("our calculated buffer was too small", e16);
        }
    }

    @Override // org.conscrypt.OpenSSLCipher
    void engineInitInternal(byte[] bArr, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        byte[] iv4 = algorithmParameterSpec instanceof IvParameterSpec ? ((IvParameterSpec) algorithmParameterSpec).getIV() : null;
        long jEVP_get_cipherbyname = NativeCrypto.EVP_get_cipherbyname(getCipherName(bArr.length, this.mode));
        if (jEVP_get_cipherbyname == 0) {
            throw new InvalidAlgorithmParameterException("Cannot find name for key length = " + (bArr.length * 8) + " and mode = " + this.mode);
        }
        boolean zIsEncrypting = isEncrypting();
        int iEVP_CIPHER_iv_length = NativeCrypto.EVP_CIPHER_iv_length(jEVP_get_cipherbyname);
        if (iv4 != null || iEVP_CIPHER_iv_length == 0) {
            if (iEVP_CIPHER_iv_length == 0 && iv4 != null) {
                throw new InvalidAlgorithmParameterException("IV not used in " + this.mode + " mode");
            }
            if (iv4 != null && iv4.length != iEVP_CIPHER_iv_length) {
                throw new InvalidAlgorithmParameterException("expected IV length of " + iEVP_CIPHER_iv_length + " but was " + iv4.length);
            }
        } else {
            if (!zIsEncrypting) {
                throw new InvalidAlgorithmParameterException("IV must be specified in " + this.mode + " mode");
            }
            iv4 = new byte[iEVP_CIPHER_iv_length];
            if (secureRandom != null) {
                secureRandom.nextBytes(iv4);
            } else {
                NativeCrypto.RAND_bytes(iv4);
            }
        }
        this.f149633iv = iv4;
        if (supportsVariableSizeKey()) {
            NativeCrypto.EVP_CipherInit_ex(this.cipherCtx, jEVP_get_cipherbyname, null, null, zIsEncrypting);
            NativeCrypto.EVP_CIPHER_CTX_set_key_length(this.cipherCtx, bArr.length);
            NativeCrypto.EVP_CipherInit_ex(this.cipherCtx, 0L, bArr, iv4, isEncrypting());
        } else {
            NativeCrypto.EVP_CipherInit_ex(this.cipherCtx, jEVP_get_cipherbyname, bArr, iv4, zIsEncrypting);
        }
        NativeCrypto.EVP_CIPHER_CTX_set_padding(this.cipherCtx, getPadding() == OpenSSLCipher.Padding.PKCS5PADDING);
        this.modeBlockSize = NativeCrypto.EVP_CIPHER_CTX_block_size(this.cipherCtx);
        this.calledUpdate = false;
    }

    abstract String getCipherName(int i15, OpenSSLCipher.Mode mode);

    @Override // org.conscrypt.OpenSSLCipher
    int getOutputSizeForFinal(int i15) {
        if (this.modeBlockSize == 1) {
            return i15;
        }
        int i16 = NativeCrypto.get_EVP_CIPHER_CTX_buf_len(this.cipherCtx);
        if (getPadding() == OpenSSLCipher.Padding.NOPADDING) {
            return i16 + i15;
        }
        int i17 = i15 + i16 + (NativeCrypto.get_EVP_CIPHER_CTX_final_used(this.cipherCtx) ? this.modeBlockSize : 0);
        int i18 = i17 + ((i17 % this.modeBlockSize != 0 || isEncrypting()) ? this.modeBlockSize : 0);
        return i18 - (i18 % this.modeBlockSize);
    }

    @Override // org.conscrypt.OpenSSLCipher
    int getOutputSizeForUpdate(int i15) {
        return getOutputSizeForFinal(i15);
    }

    @Override // org.conscrypt.OpenSSLCipher
    int updateInternal(byte[] bArr, int i15, int i16, byte[] bArr2, int i17, int i18) throws ShortBufferWithoutStackTraceException {
        int length = bArr2.length - i17;
        if (length >= i18) {
            int iEVP_CipherUpdate = i17 + NativeCrypto.EVP_CipherUpdate(this.cipherCtx, bArr2, i17, bArr, i15, i16);
            this.calledUpdate = true;
            return iEVP_CipherUpdate - i17;
        }
        throw new ShortBufferWithoutStackTraceException("output buffer too small during update: " + length + " < " + i18);
    }

    @Override // javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) throws ShortBufferWithoutStackTraceException {
        byte[] bArr3;
        int iUpdateInternal;
        if (bArr2 != null) {
            int outputSizeForFinal = getOutputSizeForFinal(i16);
            if (i16 > 0) {
                bArr3 = bArr2;
                iUpdateInternal = updateInternal(bArr, i15, i16, bArr3, i17, outputSizeForFinal);
                i17 += iUpdateInternal;
                outputSizeForFinal -= iUpdateInternal;
            } else {
                bArr3 = bArr2;
                iUpdateInternal = 0;
            }
            return iUpdateInternal + doFinalInternal(bArr3, i17, outputSizeForFinal);
        }
        throw new NullPointerException("output == null");
    }
}
