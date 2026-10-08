package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.CertificateList;

/* JADX INFO: loaded from: classes3.dex */
public class CRLAnnContent extends ASN1Object {
    private final ASN1Sequence content;

    private CRLAnnContent(ASN1Sequence aSN1Sequence) {
        this.content = aSN1Sequence;
    }

    public static CRLAnnContent getInstance(Object obj) {
        if (obj instanceof CRLAnnContent) {
            return (CRLAnnContent) obj;
        }
        if (obj != null) {
            return new CRLAnnContent(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CertificateList[] getCertificateLists() {
        int size = this.content.size();
        CertificateList[] certificateListArr = new CertificateList[size];
        for (int i15 = 0; i15 != size; i15++) {
            certificateListArr[i15] = CertificateList.getInstance(this.content.getObjectAt(i15));
        }
        return certificateListArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.content;
    }

    public CRLAnnContent(CertificateList certificateList) {
        this.content = new DERSequence(certificateList);
    }
}
