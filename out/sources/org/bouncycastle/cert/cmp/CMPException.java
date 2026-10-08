package org.bouncycastle.cert.cmp;

/* JADX INFO: loaded from: classes5.dex */
public class CMPException extends Exception {
    private Throwable cause;

    public CMPException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public CMPException(String str, Throwable th4) {
        super(str);
        this.cause = th4;
    }
}
