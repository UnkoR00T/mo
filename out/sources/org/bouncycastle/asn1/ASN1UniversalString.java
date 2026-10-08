package org.bouncycastle.asn1;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ASN1UniversalString extends ASN1Primitive implements ASN1String {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1UniversalString.class, 28) { // from class: org.bouncycastle.asn1.ASN1UniversalString.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1UniversalString.createPrimitive(dEROctetString.getOctets());
        }
    };
    private static final char[] table = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final byte[] contents;

    ASN1UniversalString(byte[] bArr, boolean z15) {
        this.contents = z15 ? Arrays.clone(bArr) : bArr;
    }

    static ASN1UniversalString createPrimitive(byte[] bArr) {
        return new DERUniversalString(bArr, false);
    }

    private static void encodeHexByte(StringBuilder sb5, int i15) {
        char[] cArr = table;
        sb5.append(cArr[(i15 >>> 4) & 15]);
        sb5.append(cArr[i15 & 15]);
    }

    private static void encodeHexDL(StringBuilder sb5, int i15) {
        int i16;
        if (i15 < 128) {
            encodeHexByte(sb5, i15);
            return;
        }
        byte[] bArr = new byte[5];
        int i17 = 5;
        while (true) {
            i16 = i17 - 1;
            bArr[i16] = (byte) i15;
            i15 >>>= 8;
            if (i15 == 0) {
                break;
            } else {
                i17 = i16;
            }
        }
        int i18 = i17 - 2;
        bArr[i18] = (byte) ((5 - i16) | 128);
        while (true) {
            int i19 = i18 + 1;
            encodeHexByte(sb5, bArr[i18]);
            if (i19 >= 5) {
                return;
            } else {
                i18 = i19;
            }
        }
    }

    public static ASN1UniversalString getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1UniversalString)) {
            return (ASN1UniversalString) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1UniversalString) {
                return (ASN1UniversalString) aSN1Primitive;
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (ASN1UniversalString) TYPE.fromByteArray((byte[]) obj);
        } catch (Exception e15) {
            throw new IllegalArgumentException("encoding error getInstance: " + e15.toString());
        }
    }

    public static ASN1UniversalString getTagged(ASN1TaggedObject aSN1TaggedObject, boolean z15) {
        return (ASN1UniversalString) TYPE.getTagged(aSN1TaggedObject, z15);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1UniversalString) {
            return Arrays.areEqual(this.contents, ((ASN1UniversalString) aSN1Primitive).contents);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void encode(ASN1OutputStream aSN1OutputStream, boolean z15) {
        aSN1OutputStream.writeEncodingDL(z15, 28, this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int encodedLength(boolean z15) {
        return ASN1OutputStream.getLengthOfEncodingDL(z15, this.contents.length);
    }

    public final byte[] getOctets() {
        return Arrays.clone(this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public final String getString() {
        int length = this.contents.length;
        StringBuilder sb5 = new StringBuilder(((ASN1OutputStream.getLengthOfDL(length) + length) * 2) + 3);
        sb5.append("#1C");
        encodeHexDL(sb5, length);
        for (int i15 = 0; i15 < length; i15++) {
            encodeHexByte(sb5, this.contents[i15]);
        }
        return sb5.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return Arrays.hashCode(this.contents);
    }

    public String toString() {
        return getString();
    }

    public static ASN1UniversalString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z15) {
        return (ASN1UniversalString) TYPE.getContextTagged(aSN1TaggedObject, z15);
    }
}
