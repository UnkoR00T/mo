package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class DLTaggedObject extends ASN1TaggedObject {
    DLTaggedObject(int i15, int i16, int i17, ASN1Encodable aSN1Encodable) {
        super(i15, i16, i17, aSN1Encodable);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    void encode(ASN1OutputStream aSN1OutputStream, boolean z15) throws IOException {
        ASN1Primitive dLObject = this.obj.toASN1Primitive().toDLObject();
        boolean zIsExplicit = isExplicit();
        if (z15) {
            int i15 = this.tagClass;
            if (zIsExplicit || dLObject.encodeConstructed()) {
                i15 |= 32;
            }
            aSN1OutputStream.writeIdentifier(true, i15, this.tagNo);
        }
        if (zIsExplicit) {
            aSN1OutputStream.writeDL(dLObject.encodedLength(true));
        }
        dLObject.encode(aSN1OutputStream.getDLSubStream(), zIsExplicit);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    boolean encodeConstructed() {
        return isExplicit() || this.obj.toASN1Primitive().toDLObject().encodeConstructed();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    int encodedLength(boolean z15) {
        ASN1Primitive dLObject = this.obj.toASN1Primitive().toDLObject();
        boolean zIsExplicit = isExplicit();
        int iEncodedLength = dLObject.encodedLength(zIsExplicit);
        if (zIsExplicit) {
            iEncodedLength += ASN1OutputStream.getLengthOfDL(iEncodedLength);
        }
        return iEncodedLength + (z15 ? ASN1OutputStream.getLengthOfIdentifier(this.tagNo) : 0);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    ASN1Sequence rebuildConstructed(ASN1Primitive aSN1Primitive) {
        return new DLSequence(aSN1Primitive);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    ASN1TaggedObject replaceTag(int i15, int i16) {
        return new DLTaggedObject(this.explicitness, i15, i16, this.obj);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1Primitive
    ASN1Primitive toDLObject() {
        return this;
    }

    public DLTaggedObject(int i15, int i16, ASN1Encodable aSN1Encodable) {
        super(true, i15, i16, aSN1Encodable);
    }

    public DLTaggedObject(int i15, ASN1Encodable aSN1Encodable) {
        super(true, i15, aSN1Encodable);
    }

    public DLTaggedObject(boolean z15, int i15, int i16, ASN1Encodable aSN1Encodable) {
        super(z15, i15, i16, aSN1Encodable);
    }

    public DLTaggedObject(boolean z15, int i15, ASN1Encodable aSN1Encodable) {
        super(z15, i15, aSN1Encodable);
    }
}
