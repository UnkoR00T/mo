package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class BERSet extends ASN1Set {
    public BERSet() {
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    void encode(ASN1OutputStream aSN1OutputStream, boolean z15) throws IOException {
        aSN1OutputStream.writeEncodingIL(z15, 49, this.elements);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    int encodedLength(boolean z15) {
        int iEncodedLength = z15 ? 4 : 3;
        int length = this.elements.length;
        for (int i15 = 0; i15 < length; i15++) {
            iEncodedLength += this.elements[i15].toASN1Primitive().encodedLength(true);
        }
        return iEncodedLength;
    }

    public BERSet(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
    }

    public BERSet(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector, false);
    }

    BERSet(boolean z15, ASN1Encodable[] aSN1EncodableArr) {
        super(z15, aSN1EncodableArr);
    }

    public BERSet(ASN1Encodable[] aSN1EncodableArr) {
        super(aSN1EncodableArr, false);
    }
}
