package org.bouncycastle.mime;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class MimeIOException extends IOException {
    private Throwable cause;

    public MimeIOException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public MimeIOException(String str, Throwable th4) {
        super(str);
        this.cause = th4;
    }
}
