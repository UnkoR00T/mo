package org.bouncycastle.cms;

/* JADX INFO: loaded from: classes5.dex */
public class CMSRuntimeException extends RuntimeException {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Exception f148917e;

    public CMSRuntimeException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f148917e;
    }

    public Exception getUnderlyingException() {
        return this.f148917e;
    }

    public CMSRuntimeException(String str, Exception exc) {
        super(str);
        this.f148917e = exc;
    }
}
