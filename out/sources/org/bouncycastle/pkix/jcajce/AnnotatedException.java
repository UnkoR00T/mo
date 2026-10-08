package org.bouncycastle.pkix.jcajce;

/* JADX INFO: loaded from: classes5.dex */
class AnnotatedException extends Exception {
    private Throwable _underlyingException;

    public AnnotatedException(String str) {
        this(str, null);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this._underlyingException;
    }

    public AnnotatedException(String str, Throwable th4) {
        super(str);
        this._underlyingException = th4;
    }
}
