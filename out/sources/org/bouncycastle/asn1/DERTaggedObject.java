package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class DERTaggedObject extends ASN1TaggedObject {
    DERTaggedObject(int i15, int i16, int i17, ASN1Encodable aSN1Encodable) {
        super(i15, i16, i17, aSN1Encodable);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    void encode(ASN1OutputStream aSN1OutputStream, boolean z15) throws IOException {
        ASN1Primitive dERObject = this.obj.toASN1Primitive().toDERObject();
        boolean zIsExplicit = isExplicit();
        if (z15) {
            int i15 = this.tagClass;
            if (zIsExplicit || dERObject.encodeConstructed()) {
                i15 |= 32;
            }
            aSN1OutputStream.writeIdentifier(true, i15, this.tagNo);
        }
        if (zIsExplicit) {
            aSN1OutputStream.writeDL(dERObject.encodedLength(true));
        }
        dERObject.encode(aSN1OutputStream.getDERSubStream(), zIsExplicit);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    boolean encodeConstructed() {
        return isExplicit() || this.obj.toASN1Primitive().toDERObject().encodeConstructed();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    int encodedLength(boolean z15) {
        ASN1Primitive dERObject = this.obj.toASN1Primitive().toDERObject();
        boolean zIsExplicit = isExplicit();
        int iEncodedLength = dERObject.encodedLength(zIsExplicit);
        if (zIsExplicit) {
            iEncodedLength += ASN1OutputStream.getLengthOfDL(iEncodedLength);
        }
        return iEncodedLength + (z15 ? ASN1OutputStream.getLengthOfIdentifier(this.tagNo) : 0);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    ASN1Sequence rebuildConstructed(ASN1Primitive aSN1Primitive) {
        return new DERSequence(aSN1Primitive);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    ASN1TaggedObject replaceTag(int i15, int i16) {
        return new DERTaggedObject(this.explicitness, i15, i16, this.obj);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1Primitive
    ASN1Primitive toDERObject() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1Primitive
    ASN1Primitive toDLObject() {
        return this;
    }

    public DERTaggedObject(int i15, int i16, ASN1Encodable aSN1Encodable) {
        super(true, i15, i16, aSN1Encodable);
    }

    public DERTaggedObject(int i15, ASN1Encodable aSN1Encodable) {
        super(true, i15, aSN1Encodable);
    }

    public DERTaggedObject(boolean z15, int i15, int i16, ASN1Encodable aSN1Encodable) {
        super(z15, i15, i16, aSN1Encodable);
    }

    public DERTaggedObject(boolean z15, int i15, ASN1Encodable aSN1Encodable) {
        super(z15, i15, aSN1Encodable);
    }
}
