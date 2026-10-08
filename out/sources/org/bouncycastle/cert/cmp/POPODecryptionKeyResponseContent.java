package org.bouncycastle.cert.cmp;

import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.cmp.PKIBody;
import org.bouncycastle.asn1.cmp.POPODecKeyRespContent;

/* JADX INFO: loaded from: classes5.dex */
public class POPODecryptionKeyResponseContent {
    private final POPODecKeyRespContent respContent;

    POPODecryptionKeyResponseContent(POPODecKeyRespContent pOPODecKeyRespContent) {
        this.respContent = pOPODecKeyRespContent;
    }

    public static POPODecryptionKeyResponseContent fromPKIBody(PKIBody pKIBody) {
        if (pKIBody.getType() == 6) {
            return new POPODecryptionKeyResponseContent(POPODecKeyRespContent.getInstance(pKIBody.getContent()));
        }
        throw new IllegalArgumentException("content of PKIBody wrong type: " + pKIBody.getType());
    }

    public byte[][] getResponses() {
        ASN1Integer[] aSN1IntegerArray = this.respContent.toASN1IntegerArray();
        byte[][] bArr = new byte[aSN1IntegerArray.length][];
        for (int i15 = 0; i15 != aSN1IntegerArray.length; i15++) {
            bArr[i15] = aSN1IntegerArray[i15].getValue().toByteArray();
        }
        return bArr;
    }

    public POPODecKeyRespContent toASN1Structure() {
        return this.respContent;
    }
}
