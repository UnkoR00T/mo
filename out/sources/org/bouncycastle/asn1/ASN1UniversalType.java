package org.bouncycastle.asn1;

/* JADX INFO: loaded from: classes3.dex */
abstract class ASN1UniversalType extends ASN1Type {
    final ASN1Tag tag;

    ASN1UniversalType(Class cls, int i15) {
        super(cls);
        this.tag = ASN1Tag.create(0, i15);
    }

    final ASN1Primitive checkedCast(ASN1Primitive aSN1Primitive) {
        if (this.javaClass.isInstance(aSN1Primitive)) {
            return aSN1Primitive;
        }
        throw new IllegalStateException("unexpected object: " + aSN1Primitive.getClass().getName());
    }

    final ASN1Primitive fromByteArray(byte[] bArr) {
        return checkedCast(ASN1Primitive.fromByteArray(bArr));
    }

    ASN1Primitive fromImplicitConstructed(ASN1Sequence aSN1Sequence) {
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }

    ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
        throw new IllegalStateException("unexpected implicit primitive encoding");
    }

    final ASN1Primitive getContextTagged(ASN1TaggedObject aSN1TaggedObject, boolean z15) {
        return checkedCast(ASN1Util.checkContextTagClass(aSN1TaggedObject).getBaseUniversal(z15, this));
    }

    final ASN1Tag getTag() {
        return this.tag;
    }

    final ASN1Primitive getTagged(ASN1TaggedObject aSN1TaggedObject, boolean z15) {
        return checkedCast(aSN1TaggedObject.getBaseUniversal(z15, this));
    }
}
