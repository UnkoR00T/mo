package org.conscrypt;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
public abstract class OpenSSLAeadCipher extends OpenSSLCipher {
    static final int DEFAULT_TAG_SIZE_BITS = 128;
    private static final boolean ENABLE_BYTEBUFFER_OPTIMIZATIONS = true;
    private ExposedByteArrayOutputStream aadBuf;
    private ExposedByteArrayOutputStream buf;
    int bufCount;
    long evpAead;
    private boolean mustInitialize;
    private byte[] previousIv;
    private byte[] previousKey;
    int tagLengthInBytes;

    protected OpenSSLAeadCipher(OpenSSLCipher.Mode mode) {
        super(mode, OpenSSLCipher.Padding.NOPADDING);
        this.buf = null;
        this.aadBuf = null;
    }

    private boolean arraysAreEqual(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        int i15 = 0;
        for (int i16 = 0; i16 < bArr.length; i16++) {
            i15 |= bArr[i16] ^ bArr2[i16];
        }
        if (i15 == 0) {
            return ENABLE_BYTEBUFFER_OPTIMIZATIONS;
        }
        return false;
    }

    private void checkInitialization() {
        if (this.mustInitialize) {
            throw new IllegalStateException("Cannot re-use same key and IV for multiple encryptions");
        }
    }

    private byte[] getAad() {
        ExposedByteArrayOutputStream exposedByteArrayOutputStream = this.aadBuf;
        if (exposedByteArrayOutputStream == null) {
            return EmptyArray.BYTE;
        }
        return exposedByteArrayOutputStream.array().length == this.aadBuf.size() ? this.aadBuf.array() : this.aadBuf.toByteArray();
    }

    private void reset() {
        this.aadBuf = null;
        ExposedByteArrayOutputStream exposedByteArrayOutputStream = this.buf;
        if (exposedByteArrayOutputStream == null) {
            this.bufCount = 0;
            return;
        }
        int length = exposedByteArrayOutputStream.array().length;
        if (length <= 1024 || this.bufCount >= length / 8) {
            this.buf.reset();
        } else {
            this.buf = null;
        }
        this.bufCount = 0;
    }

    private void throwAEADBadTagExceptionIfAvailable(String str, Throwable th4) throws BadPaddingException {
        BadPaddingException badPaddingException;
        try {
            BadPaddingException badPaddingException2 = null;
            try {
                try {
                    badPaddingException = (BadPaddingException) Class.forName("javax.crypto.AEADBadTagException").getConstructor(String.class).newInstance(str);
                    try {
                        badPaddingException.initCause(th4);
                    } catch (IllegalAccessException | InstantiationException unused) {
                        badPaddingException2 = badPaddingException;
                        badPaddingException = badPaddingException2;
                    }
                } catch (InvocationTargetException e15) {
                    throw ((BadPaddingException) new BadPaddingException().initCause(e15.getTargetException()));
                }
            } catch (IllegalAccessException | InstantiationException unused2) {
            }
            if (badPaddingException != null) {
                throw badPaddingException;
            }
        } catch (Exception unused3) {
        }
    }

    boolean allowsNonceReuse() {
        return false;
    }

    void appendToBuf(byte[] bArr, int i15, int i16) throws IOException {
        ArrayUtils.checkOffsetAndCount(bArr.length, i15, i16);
        if (this.buf == null) {
            this.buf = new ExposedByteArrayOutputStream(i16);
        }
        this.buf.write(bArr, i15, i16);
        this.bufCount += i16;
    }

    @Override // org.conscrypt.OpenSSLCipher
    void checkSupportedPadding(OpenSSLCipher.Padding padding) throws NoSuchPaddingException {
        if (padding != OpenSSLCipher.Padding.NOPADDING) {
            throw new NoSuchPaddingException("Must be NoPadding for AEAD ciphers");
        }
    }

    void checkSupportedTagLength(int i15) throws InvalidAlgorithmParameterException {
        if (i15 % 8 == 0) {
            return;
        }
        throw new InvalidAlgorithmParameterException("Tag length must be a multiple of 8; was " + i15);
    }

    int doFinalInternal(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws BadPaddingException {
        checkInitialization();
        byte[] aad = getAad();
        try {
            int iEVP_AEAD_CTX_seal_buf = isEncrypting() ? NativeCrypto.EVP_AEAD_CTX_seal_buf(this.evpAead, this.encodedKey, this.tagLengthInBytes, byteBuffer2, this.f149633iv, byteBuffer, aad) : NativeCrypto.EVP_AEAD_CTX_open_buf(this.evpAead, this.encodedKey, this.tagLengthInBytes, byteBuffer2, this.f149633iv, byteBuffer, aad);
            if (isEncrypting()) {
                this.mustInitialize = ENABLE_BYTEBUFFER_OPTIMIZATIONS;
            }
            return iEVP_AEAD_CTX_seal_buf;
        } catch (BadPaddingException e15) {
            throwAEADBadTagExceptionIfAvailable(e15.getMessage(), e15.getCause());
            throw e15;
        }
    }

    @Override // javax.crypto.CipherSpi
    protected int engineDoFinal(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws BadPaddingException, ShortBufferWithoutStackTraceException {
        if (byteBuffer == null || byteBuffer2 == null) {
            throw new NullPointerException("Null ByteBuffer Error");
        }
        if (getOutputSizeForFinal(byteBuffer.remaining()) > byteBuffer2.remaining()) {
            throw new ShortBufferWithoutStackTraceException("Insufficient Bytes for Output Buffer");
        }
        if (byteBuffer2.isReadOnly()) {
            throw new IllegalArgumentException("Cannot write to Read Only ByteBuffer");
        }
        if (this.bufCount != 0) {
            return super.engineDoFinal(byteBuffer, byteBuffer2);
        }
        if (!byteBuffer.isDirect()) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
            byteBufferAllocateDirect.mark();
            byteBufferAllocateDirect.put(byteBuffer);
            byteBufferAllocateDirect.reset();
            byteBuffer = byteBufferAllocateDirect;
        }
        if (byteBuffer2.isDirect()) {
            int iDoFinalInternal = doFinalInternal(byteBuffer, byteBuffer2);
            byteBuffer2.position(byteBuffer2.position() + iDoFinalInternal);
            byteBuffer.position(byteBuffer.limit());
            return iDoFinalInternal;
        }
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(getOutputSizeForFinal(byteBuffer.remaining()));
        int iDoFinalInternal2 = doFinalInternal(byteBuffer, byteBufferAllocateDirect2);
        byteBuffer2.put(byteBufferAllocateDirect2);
        byteBuffer.position(byteBuffer.limit());
        return iDoFinalInternal2;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0005  */
    @Override // org.conscrypt.OpenSSLCipher
    void engineInitInternal(byte[] bArr, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        byte[] iv4;
        int tLen = 128;
        if (algorithmParameterSpec != null) {
            GCMParameters gCMParametersFromGCMParameterSpec = Platform.fromGCMParameterSpec(algorithmParameterSpec);
            if (gCMParametersFromGCMParameterSpec != null) {
                iv4 = gCMParametersFromGCMParameterSpec.getIV();
                tLen = gCMParametersFromGCMParameterSpec.getTLen();
            } else if (algorithmParameterSpec instanceof IvParameterSpec) {
                iv4 = ((IvParameterSpec) algorithmParameterSpec).getIV();
            } else {
                iv4 = null;
            }
        } else {
            iv4 = null;
        }
        checkSupportedTagLength(tLen);
        this.tagLengthInBytes = tLen / 8;
        boolean zIsEncrypting = isEncrypting();
        long evp_aead = getEVP_AEAD(bArr.length);
        this.evpAead = evp_aead;
        int iEVP_AEAD_nonce_length = NativeCrypto.EVP_AEAD_nonce_length(evp_aead);
        if (iv4 != null || iEVP_AEAD_nonce_length == 0) {
            if (iEVP_AEAD_nonce_length == 0 && iv4 != null) {
                throw new InvalidAlgorithmParameterException("IV not used in " + this.mode + " mode");
            }
            if (iv4 != null && iv4.length != iEVP_AEAD_nonce_length) {
                throw new InvalidAlgorithmParameterException("Expected IV length of " + iEVP_AEAD_nonce_length + " but was " + iv4.length);
            }
        } else {
            if (!zIsEncrypting) {
                throw new InvalidAlgorithmParameterException("IV must be specified in " + this.mode + " mode");
            }
            iv4 = new byte[iEVP_AEAD_nonce_length];
            if (secureRandom != null) {
                secureRandom.nextBytes(iv4);
            } else {
                NativeCrypto.RAND_bytes(iv4);
            }
        }
        if (isEncrypting() && iv4 != null && !allowsNonceReuse()) {
            byte[] bArr2 = this.previousKey;
            if (bArr2 != null && this.previousIv != null && arraysAreEqual(bArr2, bArr) && arraysAreEqual(this.previousIv, iv4)) {
                this.mustInitialize = ENABLE_BYTEBUFFER_OPTIMIZATIONS;
                throw new InvalidAlgorithmParameterException("When using AEAD key and IV must not be re-used");
            }
            this.previousKey = bArr;
            this.previousIv = iv4;
        }
        this.mustInitialize = false;
        this.f149633iv = iv4;
        this.aadBuf = null;
        ExposedByteArrayOutputStream exposedByteArrayOutputStream = this.buf;
        if (exposedByteArrayOutputStream != null) {
            exposedByteArrayOutputStream.reset();
        }
        this.bufCount = 0;
    }

    @Override // javax.crypto.CipherSpi
    protected void engineUpdateAAD(byte[] bArr, int i15, int i16) throws IOException {
        checkInitialization();
        if (this.aadBuf == null) {
            this.aadBuf = new ExposedByteArrayOutputStream(i16);
        }
        this.aadBuf.write(bArr, i15, i16);
    }

    abstract long getEVP_AEAD(int i15);

    @Override // org.conscrypt.OpenSSLCipher
    int getOutputSizeForUpdate(int i15) {
        return 0;
    }

    @Override // org.conscrypt.OpenSSLCipher
    int updateInternal(byte[] bArr, int i15, int i16, byte[] bArr2, int i17, int i18) throws IOException {
        checkInitialization();
        appendToBuf(bArr, i15, i16);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    protected void engineUpdateAAD(ByteBuffer byteBuffer) throws IOException {
        checkInitialization();
        int iRemaining = byteBuffer.remaining();
        if (this.aadBuf == null) {
            ExposedByteArrayOutputStream exposedByteArrayOutputStream = new ExposedByteArrayOutputStream(iRemaining);
            this.aadBuf = exposedByteArrayOutputStream;
            byteBuffer.get(exposedByteArrayOutputStream.array(), 0, iRemaining);
            this.aadBuf.setCountManually(iRemaining);
            return;
        }
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr);
        this.aadBuf.write(bArr, 0, iRemaining);
    }

    int doFinalInternal(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) throws BadPaddingException, IOException {
        int i18;
        int i19;
        int iEVP_AEAD_CTX_open;
        checkInitialization();
        if (this.bufCount > 0) {
            if (i16 > 0) {
                appendToBuf(bArr, i15, i16);
            }
            bArr = this.buf.array();
            i16 = this.bufCount;
            i19 = 0;
        } else {
            if (i16 == 0 && bArr == null) {
                bArr = EmptyArray.BYTE;
            } else if (bArr == bArr2 && (((i18 = i15 + i16) > i17 && i15 <= i17) || (i15 >= i17 && i17 + i16 + this.tagLengthInBytes > i15))) {
                bArr = Arrays.copyOfRange(bArr, i15, i18);
                i15 = 0;
            }
            i19 = i15;
        }
        byte[] bArr3 = bArr;
        int i25 = i16;
        byte[] aad = getAad();
        try {
            if (isEncrypting()) {
                iEVP_AEAD_CTX_open = NativeCrypto.EVP_AEAD_CTX_seal(this.evpAead, this.encodedKey, this.tagLengthInBytes, bArr2, i17, this.f149633iv, bArr3, i19, i25, aad);
            } else {
                iEVP_AEAD_CTX_open = NativeCrypto.EVP_AEAD_CTX_open(this.evpAead, this.encodedKey, this.tagLengthInBytes, bArr2, i17, this.f149633iv, bArr3, i19, i25, aad);
            }
            if (isEncrypting()) {
                this.mustInitialize = ENABLE_BYTEBUFFER_OPTIMIZATIONS;
            }
            reset();
            return iEVP_AEAD_CTX_open;
        } catch (BadPaddingException e15) {
            throwAEADBadTagExceptionIfAvailable(e15.getMessage(), e15.getCause());
            throw e15;
        }
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i15, int i16) throws BadPaddingException, IOException {
        int outputSizeForFinal = getOutputSizeForFinal(i16);
        byte[] bArr2 = new byte[outputSizeForFinal];
        try {
            int iDoFinalInternal = doFinalInternal(bArr, i15, i16, bArr2, 0);
            if (iDoFinalInternal == outputSizeForFinal) {
                return bArr2;
            }
            if (iDoFinalInternal == 0) {
                return EmptyArray.BYTE;
            }
            return Arrays.copyOf(bArr2, iDoFinalInternal);
        } catch (ShortBufferException e15) {
            throw new RuntimeException("our calculated buffer was too small", e15);
        }
    }

    @Override // javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) throws ShortBufferWithoutStackTraceException {
        if (bArr2 != null) {
            if (getOutputSizeForFinal(i16) <= bArr2.length - i17) {
                return doFinalInternal(bArr, i15, i16, bArr2, i17);
            }
            throw new ShortBufferWithoutStackTraceException("Insufficient output space");
        }
        throw new NullPointerException("output == null");
    }
}
