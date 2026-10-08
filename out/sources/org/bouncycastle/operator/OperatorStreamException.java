package org.bouncycastle.operator;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class OperatorStreamException extends IOException {
    private Throwable cause;

    public OperatorStreamException(String str, Throwable th4) {
        super(str);
        this.cause = th4;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
