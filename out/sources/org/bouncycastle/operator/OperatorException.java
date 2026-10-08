package org.bouncycastle.operator;

/* JADX INFO: loaded from: classes5.dex */
public class OperatorException extends Exception {
    private Throwable cause;

    public OperatorException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public OperatorException(String str, Throwable th4) {
        super(str);
        this.cause = th4;
    }
}
