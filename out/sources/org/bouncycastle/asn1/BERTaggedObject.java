package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class BERTaggedObject extends ASN1TaggedObject {
    BERTaggedObject(int i15, int i16, int i17, ASN1Encodable aSN1Encodable) {
        super(i15, i16, i17, aSN1Encodable);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    void encode(ASN1OutputStream aSN1OutputStream, boolean z15) throws IOException {
        ASN1Primitive aSN1Primitive = this.obj.toASN1Primitive();
        boolean zIsExplicit = isExplicit();
        if (z15) {
            int i15 = this.tagClass;
            if (zIsExplicit || aSN1Primitive.encodeConstructed()) {
                i15 |= 32;
            }
            aSN1OutputStream.writeIdentifier(true, i15, this.tagNo);
        }
        if (!zIsExplicit) {
            aSN1Primitive.encode(aSN1OutputStream, false);
            return;
        }
        aSN1OutputStream.write(128);
        aSN1Primitive.encode(aSN1OutputStream, true);
        aSN1OutputStream.write(0);
        aSN1OutputStream.write(0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    boolean encodeConstructed() {
        return isExplicit() || this.obj.toASN1Primitive().encodeConstructed();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    int encodedLength(boolean z15) {
        ASN1Primitive aSN1Primitive = this.obj.toASN1Primitive();
        boolean zIsExplicit = isExplicit();
        int iEncodedLength = aSN1Primitive.encodedLength(zIsExplicit);
        if (zIsExplicit) {
            iEncodedLength += 3;
        }
        return iEncodedLength + (z15 ? ASN1OutputStream.getLengthOfIdentifier(this.tagNo) : 0);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    ASN1Sequence rebuildConstructed(ASN1Primitive aSN1Primitive) {
        return new BERSequence(aSN1Primitive);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    ASN1TaggedObject replaceTag(int i15, int i16) {
        return new BERTaggedObject(this.explicitness, i15, i16, this.obj);
    }

    public BERTaggedObject(int i15, int i16, ASN1Encodable aSN1Encodable) {
        super(true, i15, i16, aSN1Encodable);
    }

    public BERTaggedObject(int i15, ASN1Encodable aSN1Encodable) {
        super(true, i15, aSN1Encodable);
    }

    public BERTaggedObject(boolean z15, int i15, int i16, ASN1Encodable aSN1Encodable) {
        super(z15, i15, i16, aSN1Encodable);
    }

    public BERTaggedObject(boolean z15, int i15, ASN1Encodable aSN1Encodable) {
        super(z15, i15, aSN1Encodable);
    }
}
