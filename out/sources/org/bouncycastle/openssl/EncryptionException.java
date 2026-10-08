package org.bouncycastle.openssl;

/* JADX INFO: loaded from: classes5.dex */
public class EncryptionException extends PEMException {
    private Throwable cause;

    public EncryptionException(String str) {
        super(str);
    }

    @Override // org.bouncycastle.openssl.PEMException, java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public EncryptionException(String str, Throwable th4) {
        super(str);
        this.cause = th4;
    }
}
