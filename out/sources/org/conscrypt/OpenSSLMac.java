package org.conscrypt;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.MacSpi;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes5.dex */
public abstract class OpenSSLMac extends MacSpi {
    protected boolean initialized;
    private final byte[] singleByte;
    private final int size;

    public static final class AesCmac extends OpenSSLMac {
        private NativeRef.CMAC_CTX ctx;

        public AesCmac() {
            super(16);
        }

        @Override // org.conscrypt.OpenSSLMac
        protected byte[] doFinal() {
            return NativeCrypto.CMAC_Final(this.ctx);
        }

        @Override // javax.crypto.MacSpi
        protected void engineUpdate(byte[] bArr, int i15, int i16) {
            NativeCrypto.CMAC_Update(this.ctx, bArr, i15, i16);
        }

        @Override // org.conscrypt.OpenSSLMac
        protected void initContext(byte[] bArr) {
            NativeRef.CMAC_CTX cmac_ctx = new NativeRef.CMAC_CTX(NativeCrypto.CMAC_CTX_new());
            NativeCrypto.CMAC_Init(cmac_ctx, bArr);
            this.ctx = cmac_ctx;
        }

        @Override // org.conscrypt.OpenSSLMac
        protected void resetContext() {
            NativeCrypto.CMAC_Reset(this.ctx);
        }

        @Override // org.conscrypt.OpenSSLMac
        protected void updateDirect(long j15, int i15) {
            NativeCrypto.CMAC_UpdateDirect(this.ctx, j15, i15);
        }
    }

    public static class Hmac extends OpenSSLMac {
        private NativeRef.HMAC_CTX ctx;
        private final long evpMd;

        public Hmac(long j15, int i15) {
            super(i15);
            this.evpMd = j15;
        }

        @Override // org.conscrypt.OpenSSLMac
        protected byte[] doFinal() {
            return NativeCrypto.HMAC_Final(this.ctx);
        }

        @Override // javax.crypto.MacSpi
        protected void engineUpdate(byte[] bArr, int i15, int i16) {
            NativeCrypto.HMAC_Update(this.ctx, bArr, i15, i16);
        }

        @Override // org.conscrypt.OpenSSLMac
        protected void initContext(byte[] bArr) {
            NativeRef.HMAC_CTX hmac_ctx = new NativeRef.HMAC_CTX(NativeCrypto.HMAC_CTX_new());
            NativeCrypto.HMAC_Init_ex(hmac_ctx, bArr, this.evpMd);
            this.ctx = hmac_ctx;
        }

        @Override // org.conscrypt.OpenSSLMac
        protected void resetContext() {
            NativeCrypto.HMAC_Reset(this.ctx);
        }

        @Override // org.conscrypt.OpenSSLMac
        protected void updateDirect(long j15, int i15) {
            NativeCrypto.HMAC_UpdateDirect(this.ctx, j15, i15);
        }
    }

    public static final class HmacMD5 extends Hmac {
        public HmacMD5() {
            super(EvpMdRef.MD5.EVP_MD, EvpMdRef.MD5.SIZE_BYTES);
        }
    }

    public static final class HmacSHA1 extends Hmac {
        public HmacSHA1() {
            super(EvpMdRef.SHA1.EVP_MD, EvpMdRef.SHA1.SIZE_BYTES);
        }
    }

    public static final class HmacSHA224 extends Hmac {
        public HmacSHA224() {
            super(EvpMdRef.SHA224.EVP_MD, EvpMdRef.SHA224.SIZE_BYTES);
        }
    }

    public static final class HmacSHA256 extends Hmac {
        public HmacSHA256() {
            super(EvpMdRef.SHA256.EVP_MD, EvpMdRef.SHA256.SIZE_BYTES);
        }
    }

    public static final class HmacSHA384 extends Hmac {
        public HmacSHA384() {
            super(EvpMdRef.SHA384.EVP_MD, EvpMdRef.SHA384.SIZE_BYTES);
        }
    }

    public static final class HmacSHA512 extends Hmac {
        public HmacSHA512() {
            super(EvpMdRef.SHA512.EVP_MD, EvpMdRef.SHA512.SIZE_BYTES);
        }
    }

    protected abstract byte[] doFinal();

    @Override // javax.crypto.MacSpi
    protected byte[] engineDoFinal() {
        byte[] bArrDoFinal = doFinal();
        resetContext();
        return bArrDoFinal;
    }

    @Override // javax.crypto.MacSpi
    protected int engineGetMacLength() {
        return this.size;
    }

    @Override // javax.crypto.MacSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (!(key instanceof SecretKey)) {
            throw new InvalidKeyException("key must be a SecretKey");
        }
        if (algorithmParameterSpec != null) {
            throw new InvalidAlgorithmParameterException("unknown parameter type");
        }
        byte[] encoded = key.getEncoded();
        if (encoded == null) {
            throw new InvalidKeyException("key cannot be encoded");
        }
        try {
            initContext(encoded);
            this.initialized = true;
        } catch (RuntimeException e15) {
            throw new InvalidKeyException("invalid key", e15);
        }
    }

    @Override // javax.crypto.MacSpi
    protected void engineReset() {
        if (this.initialized) {
            resetContext();
        }
    }

    @Override // javax.crypto.MacSpi
    protected void engineUpdate(byte b15) {
        byte[] bArr = this.singleByte;
        bArr[0] = b15;
        engineUpdate(bArr, 0, 1);
    }

    protected abstract void initContext(byte[] bArr);

    protected abstract void resetContext();

    protected abstract void updateDirect(long j15, int i15);

    private OpenSSLMac(int i15) {
        this.singleByte = new byte[1];
        this.initialized = false;
        this.size = i15;
    }

    @Override // javax.crypto.MacSpi
    protected void engineUpdate(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            if (!byteBuffer.isDirect()) {
                super.engineUpdate(byteBuffer);
                return;
            }
            long directBufferAddress = NativeCrypto.getDirectBufferAddress(byteBuffer);
            if (directBufferAddress == 0) {
                super.engineUpdate(byteBuffer);
                return;
            }
            int iPosition = byteBuffer.position();
            if (iPosition >= 0) {
                long j15 = directBufferAddress + ((long) iPosition);
                int iRemaining = byteBuffer.remaining();
                if (iRemaining >= 0) {
                    updateDirect(j15, iRemaining);
                    byteBuffer.position(iPosition + iRemaining);
                    return;
                }
                throw new IllegalStateException("Negative remaining amount");
            }
            throw new IllegalStateException("Negative position");
        }
    }
}
