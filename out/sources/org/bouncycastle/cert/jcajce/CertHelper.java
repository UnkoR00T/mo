package org.bouncycastle.cert.jcajce;

import java.security.cert.CertificateFactory;

/* JADX INFO: loaded from: classes5.dex */
abstract class CertHelper {
    CertHelper() {
    }

    protected abstract CertificateFactory createCertificateFactory(String str);

    public CertificateFactory getCertificateFactory(String str) {
        return createCertificateFactory(str);
    }
}
