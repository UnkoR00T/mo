package org.bouncycastle.eac;

/* JADX INFO: loaded from: classes5.dex */
public class EACException extends Exception {
    private Throwable cause;

    public EACException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public EACException(String str, Throwable th4) {
        super(str);
        this.cause = th4;
    }
}
