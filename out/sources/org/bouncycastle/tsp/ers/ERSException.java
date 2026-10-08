package org.bouncycastle.tsp.ers;

/* JADX INFO: loaded from: classes5.dex */
public class ERSException extends Exception {
    private final Throwable cause;

    public ERSException(String str) {
        this(str, null);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public ERSException(String str, Throwable th4) {
        super(str);
        this.cause = th4;
    }
}
