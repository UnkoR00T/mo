package org.bouncycastle.cert.path;

import org.bouncycastle.cert.X509CertificateHolder;

/* JADX INFO: loaded from: classes5.dex */
public class CertPath {
    private final X509CertificateHolder[] certificates;

    public CertPath(X509CertificateHolder[] x509CertificateHolderArr) {
        this.certificates = copyArray(x509CertificateHolderArr);
    }

    private X509CertificateHolder[] copyArray(X509CertificateHolder[] x509CertificateHolderArr) {
        int length = x509CertificateHolderArr.length;
        X509CertificateHolder[] x509CertificateHolderArr2 = new X509CertificateHolder[length];
        System.arraycopy(x509CertificateHolderArr, 0, x509CertificateHolderArr2, 0, length);
        return x509CertificateHolderArr2;
    }

    public CertPathValidationResult evaluate(CertPathValidation[] certPathValidationArr) {
        CertPathValidationContext certPathValidationContext = new CertPathValidationContext(CertPathUtils.getCriticalExtensionsOIDs(this.certificates));
        CertPathValidationResultBuilder certPathValidationResultBuilder = new CertPathValidationResultBuilder(certPathValidationContext);
        for (int i15 = 0; i15 != certPathValidationArr.length; i15++) {
            int length = this.certificates.length - 1;
            while (length >= 0) {
                try {
                    certPathValidationContext.setIsEndEntity(length == 0);
                    certPathValidationArr[i15].validate(certPathValidationContext, this.certificates[length]);
                } catch (CertPathValidationException e15) {
                    certPathValidationResultBuilder.addException(length, i15, e15);
                }
                length--;
            }
        }
        return certPathValidationResultBuilder.build();
    }

    public X509CertificateHolder[] getCertificates() {
        return copyArray(this.certificates);
    }

    public int length() {
        return this.certificates.length;
    }

    public CertPathValidationResult validate(CertPathValidation[] certPathValidationArr) {
        CertPathValidationContext certPathValidationContext = new CertPathValidationContext(CertPathUtils.getCriticalExtensionsOIDs(this.certificates));
        for (int i15 = 0; i15 != certPathValidationArr.length; i15++) {
            int length = this.certificates.length - 1;
            while (length >= 0) {
                try {
                    certPathValidationContext.setIsEndEntity(length == 0);
                    certPathValidationArr[i15].validate(certPathValidationContext, this.certificates[length]);
                    length--;
                } catch (CertPathValidationException e15) {
                    return new CertPathValidationResult(certPathValidationContext, length, i15, e15);
                }
            }
        }
        return new CertPathValidationResult(certPathValidationContext);
    }
}
