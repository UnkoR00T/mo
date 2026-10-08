package org.bouncycastle.pkcs;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class PKCSIOException extends IOException {
    private Throwable cause;

    public PKCSIOException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public PKCSIOException(String str, Throwable th4) {
        super(str);
        this.cause = th4;
    }
}
