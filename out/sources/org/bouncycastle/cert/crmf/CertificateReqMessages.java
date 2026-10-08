package org.bouncycastle.cert.crmf;

import org.bouncycastle.asn1.cmp.PKIBody;
import org.bouncycastle.asn1.crmf.CertReqMessages;
import org.bouncycastle.asn1.crmf.CertReqMsg;

/* JADX INFO: loaded from: classes5.dex */
public class CertificateReqMessages {
    private final CertReqMsg[] reqs;

    public CertificateReqMessages(CertReqMessages certReqMessages) {
        this.reqs = certReqMessages.toCertReqMsgArray();
    }

    public static CertificateReqMessages fromPKIBody(PKIBody pKIBody) {
        if (isCertificateRequestMessages(pKIBody.getType())) {
            return new CertificateReqMessages(CertReqMessages.getInstance(pKIBody.getContent()));
        }
        throw new IllegalArgumentException("content of PKIBody wrong type: " + pKIBody.getType());
    }

    public static boolean isCertificateRequestMessages(int i15) {
        return i15 == 0 || i15 == 2 || i15 == 7 || i15 == 9 || i15 == 13;
    }

    public CertificateRequestMessage[] getRequests() {
        int length = this.reqs.length;
        CertificateRequestMessage[] certificateRequestMessageArr = new CertificateRequestMessage[length];
        for (int i15 = 0; i15 != length; i15++) {
            certificateRequestMessageArr[i15] = new CertificateRequestMessage(this.reqs[i15]);
        }
        return certificateRequestMessageArr;
    }

    public CertReqMessages toASN1Structure() {
        return new CertReqMessages(this.reqs);
    }
}
