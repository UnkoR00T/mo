package org.bouncycastle.cert.cmp;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cmp.CMPCertificate;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.CMSTypedData;

/* JADX INFO: loaded from: classes5.dex */
public class CMSProcessableCMPCertificate implements CMSTypedData {
    private final CMPCertificate cmpCert;

    public CMSProcessableCMPCertificate(CMPCertificate cMPCertificate) {
        this.cmpCert = cMPCertificate;
    }

    @Override // org.bouncycastle.cms.CMSProcessable
    public Object getContent() {
        return this.cmpCert;
    }

    @Override // org.bouncycastle.cms.CMSTypedData
    public ASN1ObjectIdentifier getContentType() {
        return PKCSObjectIdentifiers.data;
    }

    @Override // org.bouncycastle.cms.CMSProcessable
    public void write(OutputStream outputStream) throws IOException {
        outputStream.write(this.cmpCert.getEncoded());
    }

    public CMSProcessableCMPCertificate(X509CertificateHolder x509CertificateHolder) {
        this(new CMPCertificate(x509CertificateHolder.toASN1Structure()));
    }
}
