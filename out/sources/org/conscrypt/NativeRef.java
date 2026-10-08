package org.conscrypt;

/* JADX INFO: loaded from: classes5.dex */
abstract class NativeRef {
    final long address;

    static final class CMAC_CTX extends NativeRef {
        CMAC_CTX(long j15) {
            super(j15);
        }

        @Override // org.conscrypt.NativeRef
        void doFree(long j15) {
            NativeCrypto.CMAC_CTX_free(j15);
        }
    }

    static final class EC_GROUP extends NativeRef {
        EC_GROUP(long j15) {
            super(j15);
        }

        @Override // org.conscrypt.NativeRef
        void doFree(long j15) {
            NativeCrypto.EC_GROUP_clear_free(j15);
        }
    }

    static final class EC_POINT extends NativeRef {
        EC_POINT(long j15) {
            super(j15);
        }

        @Override // org.conscrypt.NativeRef
        void doFree(long j15) {
            NativeCrypto.EC_POINT_clear_free(j15);
        }
    }

    static final class EVP_CIPHER_CTX extends NativeRef {
        EVP_CIPHER_CTX(long j15) {
            super(j15);
        }

        @Override // org.conscrypt.NativeRef
        void doFree(long j15) {
            NativeCrypto.EVP_CIPHER_CTX_free(j15);
        }
    }

    static final class EVP_HPKE_CTX extends NativeRef {
        EVP_HPKE_CTX(long j15) {
            super(j15);
        }

        @Override // org.conscrypt.NativeRef
        void doFree(long j15) {
            NativeCrypto.EVP_HPKE_CTX_free(j15);
        }
    }

    static final class EVP_MD_CTX extends NativeRef {
        EVP_MD_CTX(long j15) {
            super(j15);
        }

        @Override // org.conscrypt.NativeRef
        void doFree(long j15) {
            NativeCrypto.EVP_MD_CTX_destroy(j15);
        }
    }

    static final class EVP_PKEY extends NativeRef {
        EVP_PKEY(long j15) {
            super(j15);
        }

        @Override // org.conscrypt.NativeRef
        void doFree(long j15) {
            NativeCrypto.EVP_PKEY_free(j15);
        }
    }

    static final class EVP_PKEY_CTX extends NativeRef {
        EVP_PKEY_CTX(long j15) {
            super(j15);
        }

        @Override // org.conscrypt.NativeRef
        void doFree(long j15) {
            NativeCrypto.EVP_PKEY_CTX_free(j15);
        }
    }

    static final class HMAC_CTX extends NativeRef {
        HMAC_CTX(long j15) {
            super(j15);
        }

        @Override // org.conscrypt.NativeRef
        void doFree(long j15) {
            NativeCrypto.HMAC_CTX_free(j15);
        }
    }

    static final class SSL_SESSION extends NativeRef {
        SSL_SESSION(long j15) {
            super(j15);
        }

        @Override // org.conscrypt.NativeRef
        void doFree(long j15) {
            NativeCrypto.SSL_SESSION_free(j15);
        }
    }

    NativeRef(long j15) {
        if (j15 == 0) {
            throw new NullPointerException("address == 0");
        }
        this.address = j15;
    }

    abstract void doFree(long j15);

    public boolean equals(Object obj) {
        return (obj instanceof NativeRef) && ((NativeRef) obj).address == this.address;
    }

    protected void finalize() throws Throwable {
        try {
            long j15 = this.address;
            if (j15 != 0) {
                doFree(j15);
            }
        } finally {
            super.finalize();
        }
    }

    public int hashCode() {
        return Long.hashCode(this.address);
    }

    public boolean isNull() {
        return this.address == 0;
    }
}
