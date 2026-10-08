package org.bouncycastle.cms;

/* JADX INFO: loaded from: classes5.dex */
public class CMSAttributeTableGenerationException extends CMSRuntimeException {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Exception f148915e;

    public CMSAttributeTableGenerationException(String str) {
        super(str);
    }

    @Override // org.bouncycastle.cms.CMSRuntimeException, java.lang.Throwable
    public Throwable getCause() {
        return this.f148915e;
    }

    @Override // org.bouncycastle.cms.CMSRuntimeException
    public Exception getUnderlyingException() {
        return this.f148915e;
    }

    public CMSAttributeTableGenerationException(String str, Exception exc) {
        super(str);
        this.f148915e = exc;
    }
}
