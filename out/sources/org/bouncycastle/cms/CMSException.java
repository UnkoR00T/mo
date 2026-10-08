package org.bouncycastle.cms;

/* JADX INFO: loaded from: classes5.dex */
public class CMSException extends Exception {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Exception f148916e;

    public CMSException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f148916e;
    }

    public Exception getUnderlyingException() {
        return this.f148916e;
    }

    public CMSException(String str, Exception exc) {
        super(str);
        this.f148916e = exc;
    }
}
