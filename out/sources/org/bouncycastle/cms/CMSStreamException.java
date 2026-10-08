package org.bouncycastle.cms;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class CMSStreamException extends IOException {
    private final Throwable underlying;

    CMSStreamException(String str) {
        super(str);
        this.underlying = null;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.underlying;
    }

    CMSStreamException(String str, Throwable th4) {
        super(str);
        this.underlying = th4;
    }
}
