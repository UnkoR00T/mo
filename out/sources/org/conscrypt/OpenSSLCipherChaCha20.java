package org.conscrypt;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
public class OpenSSLCipherChaCha20 extends OpenSSLCipher {
    private static final int BLOCK_SIZE_BYTES = 64;
    private static final int NONCE_SIZE_BYTES = 12;
    private int currentBlockConsumedBytes = 0;
    private int blockCounter = 0;

    private void reset() {
        this.blockCounter = 0;
        this.currentBlockConsumedBytes = 0;
    }

    @Override // org.conscrypt.OpenSSLCipher
    void checkSupportedKeySize(int i15) throws InvalidKeyException {
        if (i15 == 32) {
            return;
        }
        throw new InvalidKeyException("Unsupported key size: " + i15 + " bytes (must be 32)");
    }

    @Override // org.conscrypt.OpenSSLCipher
    void checkSupportedMode(OpenSSLCipher.Mode mode) throws NoSuchAlgorithmException {
        if (mode != OpenSSLCipher.Mode.NONE) {
            throw new NoSuchAlgorithmException("Mode must be NONE");
        }
    }

    @Override // org.conscrypt.OpenSSLCipher
    void checkSupportedPadding(OpenSSLCipher.Padding padding) throws NoSuchPaddingException {
        if (padding != OpenSSLCipher.Padding.NOPADDING) {
            throw new NoSuchPaddingException("Must be NoPadding");
        }
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
        reset();
        if (iUpdateInternal == outputSizeForFinal) {
            return bArr2;
        }
        return iUpdateInternal == 0 ? EmptyArray.BYTE : Arrays.copyOfRange(bArr2, 0, iUpdateInternal);
    }

    @Override // org.conscrypt.OpenSSLCipher
    void engineInitInternal(byte[] bArr, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            IvParameterSpec ivParameterSpec = (IvParameterSpec) algorithmParameterSpec;
            if (ivParameterSpec.getIV().length != 12) {
                throw new InvalidAlgorithmParameterException("IV must be 12 bytes long");
            }
            this.f149633iv = ivParameterSpec.getIV();
            return;
        }
        if (!isEncrypting()) {
            throw new InvalidAlgorithmParameterException("IV must be specified when decrypting");
        }
        byte[] bArr2 = new byte[12];
        this.f149633iv = bArr2;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr2);
        } else {
            NativeCrypto.RAND_bytes(bArr2);
        }
    }

    @Override // org.conscrypt.OpenSSLCipher
    String getBaseCipherName() {
        return "ChaCha20";
    }

    @Override // org.conscrypt.OpenSSLCipher
    int getCipherBlockSize() {
        return 0;
    }

    @Override // org.conscrypt.OpenSSLCipher
    int getOutputSizeForFinal(int i15) {
        return i15;
    }

    @Override // org.conscrypt.OpenSSLCipher
    int getOutputSizeForUpdate(int i15) {
        return i15;
    }

    @Override // org.conscrypt.OpenSSLCipher
    int updateInternal(byte[] bArr, int i15, int i16, byte[] bArr2, int i17, int i18) throws ShortBufferWithoutStackTraceException {
        int i19;
        int i25;
        int i26;
        if (i16 > bArr2.length - i17) {
            throw new ShortBufferWithoutStackTraceException("Insufficient output space");
        }
        int i27 = this.currentBlockConsumedBytes;
        if (i27 > 0) {
            int iMin = Math.min(64 - i27, i16);
            byte[] bArr3 = new byte[64];
            byte[] bArr4 = new byte[64];
            System.arraycopy(bArr, i15, bArr3, this.currentBlockConsumedBytes, iMin);
            NativeCrypto.chacha20_encrypt_decrypt(bArr3, 0, bArr4, 0, 64, this.encodedKey, this.f149633iv, this.blockCounter);
            System.arraycopy(bArr4, this.currentBlockConsumedBytes, bArr2, i17, iMin);
            int i28 = this.currentBlockConsumedBytes + iMin;
            this.currentBlockConsumedBytes = i28;
            if (i28 < 64) {
                return iMin;
            }
            this.currentBlockConsumedBytes = 0;
            this.blockCounter++;
            i19 = i16 - iMin;
            i26 = i17 + iMin;
            i25 = i15 + iMin;
        } else {
            i19 = i16;
            i25 = i15;
            i26 = i17;
        }
        NativeCrypto.chacha20_encrypt_decrypt(bArr, i25, bArr2, i26, i19, this.encodedKey, this.f149633iv, this.blockCounter);
        this.currentBlockConsumedBytes = i19 % 64;
        this.blockCounter += i19 / 64;
        return i16;
    }

    @Override // javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
        if (bArr2 != null) {
            int iUpdateInternal = i16 > 0 ? updateInternal(bArr, i15, i16, bArr2, i17, getOutputSizeForFinal(i16)) : 0;
            reset();
            return iUpdateInternal;
        }
        throw new NullPointerException("output == null");
    }
}
