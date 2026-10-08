package org.bouncycastle.cmc;

/* JADX INFO: loaded from: classes5.dex */
public class CMCException extends Exception {
    private final Throwable cause;

    public CMCException(String str) {
        this(str, null);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public CMCException(String str, Throwable th4) {
        super(str);
        this.cause = th4;
    }
}
