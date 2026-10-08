package org.bouncycastle.cert.crmf;

import java.util.ArrayList;
import org.bouncycastle.asn1.cmp.CMPCertificate;
import org.bouncycastle.asn1.cmp.CertRepMessage;
import org.bouncycastle.asn1.cmp.CertResponse;
import org.bouncycastle.asn1.cmp.PKIBody;
import org.bouncycastle.cert.X509CertificateHolder;

/* JADX INFO: loaded from: classes5.dex */
public class CertificateRepMessage {
    private final CMPCertificate[] caCerts;
    private final CertResponse[] resps;

    public CertificateRepMessage(CertRepMessage certRepMessage) {
        this.resps = certRepMessage.getResponse();
        this.caCerts = certRepMessage.getCaPubs();
    }

    public static CertificateRepMessage fromPKIBody(PKIBody pKIBody) {
        if (isCertificateRepMessage(pKIBody.getType())) {
            return new CertificateRepMessage(CertRepMessage.getInstance(pKIBody.getContent()));
        }
        throw new IllegalArgumentException("content of PKIBody wrong type: " + pKIBody.getType());
    }

    public static boolean isCertificateRepMessage(int i15) {
        return i15 == 1 || i15 == 3 || i15 == 8 || i15 == 14;
    }

    public CMPCertificate[] getCMPCertificates() {
        CMPCertificate[] cMPCertificateArr = this.caCerts;
        int length = cMPCertificateArr.length;
        CMPCertificate[] cMPCertificateArr2 = new CMPCertificate[length];
        System.arraycopy(cMPCertificateArr, 0, cMPCertificateArr2, 0, length);
        return cMPCertificateArr2;
    }

    public CertificateResponse[] getResponses() {
        int length = this.resps.length;
        CertificateResponse[] certificateResponseArr = new CertificateResponse[length];
        for (int i15 = 0; i15 != length; i15++) {
            certificateResponseArr[i15] = new CertificateResponse(this.resps[i15]);
        }
        return certificateResponseArr;
    }

    public X509CertificateHolder[] getX509Certificates() {
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        while (true) {
            CMPCertificate[] cMPCertificateArr = this.caCerts;
            if (i15 == cMPCertificateArr.length) {
                return (X509CertificateHolder[]) arrayList.toArray(new X509CertificateHolder[0]);
            }
            if (cMPCertificateArr[i15].isX509v3PKCert()) {
                arrayList.add(new X509CertificateHolder(this.caCerts[i15].getX509v3PKCert()));
            }
            i15++;
        }
    }

    public boolean isOnlyX509PKCertificates() {
        boolean zIsX509v3PKCert = true;
        int i15 = 0;
        while (true) {
            CMPCertificate[] cMPCertificateArr = this.caCerts;
            if (i15 == cMPCertificateArr.length) {
                return zIsX509v3PKCert;
            }
            zIsX509v3PKCert &= cMPCertificateArr[i15].isX509v3PKCert();
            i15++;
        }
    }

    public CertRepMessage toASN1Structure() {
        return new CertRepMessage(this.caCerts, this.resps);
    }
}
