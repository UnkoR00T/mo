package org.bouncycastle.operator;

/* JADX INFO: loaded from: classes5.dex */
public class RuntimeOperatorException extends RuntimeException {
    private Throwable cause;

    public RuntimeOperatorException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public RuntimeOperatorException(String str, Throwable th4) {
        super(str);
        this.cause = th4;
    }
}
