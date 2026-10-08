package org.bouncycastle.x509;

import java.security.cert.CertificateEncodingException;

/* JADX INFO: loaded from: classes5.dex */
class ExtCertificateEncodingException extends CertificateEncodingException {
    Throwable cause;

    ExtCertificateEncodingException(String str, Throwable th4) {
        super(str);
        this.cause = th4;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
