package org.bouncycastle.cert;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class CertIOException extends IOException {
    private Throwable cause;

    public CertIOException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public CertIOException(String str, Throwable th4) {
        super(str);
        this.cause = th4;
    }
}
