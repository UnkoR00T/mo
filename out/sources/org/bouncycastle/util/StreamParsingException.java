package org.bouncycastle.util;

/* JADX INFO: loaded from: classes5.dex */
public class StreamParsingException extends Exception {
    Throwable _e;

    public StreamParsingException(String str, Throwable th4) {
        super(str);
        this._e = th4;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this._e;
    }
}
