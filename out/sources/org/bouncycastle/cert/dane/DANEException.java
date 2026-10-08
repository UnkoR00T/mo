package org.bouncycastle.cert.dane;

/* JADX INFO: loaded from: classes5.dex */
public class DANEException extends Exception {
    private Throwable cause;

    public DANEException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public DANEException(String str, Throwable th4) {
        super(str);
        this.cause = th4;
    }
}
