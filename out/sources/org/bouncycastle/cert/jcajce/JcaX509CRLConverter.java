package org.bouncycastle.cert.jcajce;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.cert.CRLException;
import java.security.cert.CertificateException;
import java.security.cert.X509CRL;
import org.bouncycastle.cert.X509CRLHolder;

/* JADX INFO: loaded from: classes5.dex */
public class JcaX509CRLConverter {
    private CertHelper helper;

    private static class ExCRLException extends CRLException {
        private Throwable cause;

        public ExCRLException(String str, Throwable th4) {
            super(str);
            this.cause = th4;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    public JcaX509CRLConverter() {
        this.helper = new DefaultCertHelper();
        this.helper = new DefaultCertHelper();
    }

    public X509CRL getCRL(X509CRLHolder x509CRLHolder) throws ExCRLException {
        try {
            return (X509CRL) this.helper.getCertificateFactory("X.509").generateCRL(new ByteArrayInputStream(x509CRLHolder.getEncoded()));
        } catch (IOException e15) {
            throw new ExCRLException("exception parsing certificate: " + e15.getMessage(), e15);
        } catch (NoSuchProviderException e16) {
            throw new ExCRLException("cannot find required provider:" + e16.getMessage(), e16);
        } catch (CertificateException e17) {
            throw new ExCRLException("cannot create factory: " + e17.getMessage(), e17);
        }
    }

    public JcaX509CRLConverter setProvider(String str) {
        this.helper = new NamedCertHelper(str);
        return this;
    }

    public JcaX509CRLConverter setProvider(Provider provider) {
        this.helper = new ProviderCertHelper(provider);
        return this;
    }
}
