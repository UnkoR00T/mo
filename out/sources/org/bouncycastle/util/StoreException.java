package org.bouncycastle.util;

/* JADX INFO: loaded from: classes5.dex */
public class StoreException extends RuntimeException {
    private Throwable _e;

    public StoreException(String str, Throwable th4) {
        super(str);
        this._e = th4;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this._e;
    }
}
