package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ASN1Null extends ASN1Primitive {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1Null.class, 5) { // from class: org.bouncycastle.asn1.ASN1Null.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            ASN1Null.checkContentsLength(dEROctetString.getOctetsLength());
            return ASN1Null.createPrimitive();
        }
    };

    ASN1Null() {
    }

    static void checkContentsLength(int i15) {
        if (i15 != 0) {
            throw new IllegalStateException("malformed NULL encoding encountered");
        }
    }

    static ASN1Null createPrimitive() {
        return DERNull.INSTANCE;
    }

    public static ASN1Null getInstance(Object obj) {
        if (obj instanceof ASN1Null) {
            return (ASN1Null) obj;
        }
        if (obj == null) {
            return null;
        }
        try {
            return (ASN1Null) TYPE.fromByteArray((byte[]) obj);
        } catch (IOException e15) {
            throw new IllegalArgumentException("failed to construct NULL from byte[]: " + e15.getMessage());
        }
    }

    public static ASN1Null getTagged(ASN1TaggedObject aSN1TaggedObject, boolean z15) {
        return (ASN1Null) TYPE.getTagged(aSN1TaggedObject, z15);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        return aSN1Primitive instanceof ASN1Null;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return -1;
    }

    public String toString() {
        return "NULL";
    }

    public static ASN1Null getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z15) {
        return (ASN1Null) TYPE.getContextTagged(aSN1TaggedObject, z15);
    }
}
