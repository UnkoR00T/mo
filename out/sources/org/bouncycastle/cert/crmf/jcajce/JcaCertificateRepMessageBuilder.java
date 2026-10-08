package org.bouncycastle.cert.crmf.jcajce;

import java.security.cert.X509Certificate;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.crmf.CertificateRepMessageBuilder;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;

/* JADX INFO: loaded from: classes5.dex */
public class JcaCertificateRepMessageBuilder extends CertificateRepMessageBuilder {
    public JcaCertificateRepMessageBuilder(X509Certificate... x509CertificateArr) {
        super(convert(x509CertificateArr));
    }

    private static X509CertificateHolder[] convert(X509Certificate... x509CertificateArr) {
        int length = x509CertificateArr.length;
        X509CertificateHolder[] x509CertificateHolderArr = new X509CertificateHolder[length];
        for (int i15 = 0; i15 != length; i15++) {
            x509CertificateHolderArr[i15] = new JcaX509CertificateHolder(x509CertificateArr[i15]);
        }
        return x509CertificateHolderArr;
    }
}
