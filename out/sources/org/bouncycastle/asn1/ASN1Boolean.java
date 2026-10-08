package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class ASN1Boolean extends ASN1Primitive {
    private static final byte FALSE_VALUE = 0;
    private final byte value;
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1Boolean.class, 1) { // from class: org.bouncycastle.asn1.ASN1Boolean.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1Boolean.createPrimitive(dEROctetString.getOctets());
        }
    };
    public static final ASN1Boolean FALSE = new ASN1Boolean((byte) 0);
    private static final byte TRUE_VALUE = -1;
    public static final ASN1Boolean TRUE = new ASN1Boolean(TRUE_VALUE);

    private ASN1Boolean(byte b15) {
        this.value = b15;
    }

    static ASN1Boolean createPrimitive(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
        }
        byte b15 = bArr[0];
        if (b15 != -1) {
            return b15 != 0 ? new ASN1Boolean(b15) : FALSE;
        }
        return TRUE;
    }

    public static ASN1Boolean getInstance(int i15) {
        return i15 != 0 ? TRUE : FALSE;
    }

    public static ASN1Boolean getTagged(ASN1TaggedObject aSN1TaggedObject, boolean z15) {
        return (ASN1Boolean) TYPE.getTagged(aSN1TaggedObject, z15);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        return (aSN1Primitive instanceof ASN1Boolean) && isTrue() == ((ASN1Boolean) aSN1Primitive).isTrue();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    void encode(ASN1OutputStream aSN1OutputStream, boolean z15) throws IOException {
        aSN1OutputStream.writeEncodingDL(z15, 1, this.value);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    int encodedLength(boolean z15) {
        return ASN1OutputStream.getLengthOfEncodingDL(z15, 1);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return isTrue() ? 1 : 0;
    }

    public boolean isTrue() {
        return this.value != 0;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    ASN1Primitive toDERObject() {
        return isTrue() ? TRUE : FALSE;
    }

    public String toString() {
        return isTrue() ? "TRUE" : "FALSE";
    }

    public static ASN1Boolean getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1Boolean)) {
            return (ASN1Boolean) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (ASN1Boolean) TYPE.fromByteArray((byte[]) obj);
        } catch (IOException e15) {
            throw new IllegalArgumentException("failed to construct boolean from byte[]: " + e15.getMessage());
        }
    }

    public static ASN1Boolean getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z15) {
        return (ASN1Boolean) TYPE.getContextTagged(aSN1TaggedObject, z15);
    }

    public static ASN1Boolean getInstance(boolean z15) {
        return z15 ? TRUE : FALSE;
    }
}
