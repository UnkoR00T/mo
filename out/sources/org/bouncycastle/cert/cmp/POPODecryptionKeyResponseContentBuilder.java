package org.bouncycastle.cert.cmp;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cmp.POPODecKeyRespContent;

/* JADX INFO: loaded from: classes5.dex */
public class POPODecryptionKeyResponseContentBuilder {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ASN1EncodableVector f148912v = new ASN1EncodableVector();

    public POPODecryptionKeyResponseContentBuilder addChallengeResponse(byte[] bArr) {
        this.f148912v.add(new ASN1Integer(new BigInteger(bArr)));
        return this;
    }

    public POPODecryptionKeyResponseContent build() {
        return new POPODecryptionKeyResponseContent(POPODecKeyRespContent.getInstance(new DERSequence(this.f148912v)));
    }
}
