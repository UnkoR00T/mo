package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ASN1BMPString extends ASN1Primitive implements ASN1String {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1BMPString.class, 30) { // from class: org.bouncycastle.asn1.ASN1BMPString.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1BMPString.createPrimitive(dEROctetString.getOctets());
        }
    };
    final char[] string;

    ASN1BMPString(String str) {
        if (str == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.string = str.toCharArray();
    }

    static ASN1BMPString createPrimitive(byte[] bArr) {
        return new DERBMPString(bArr);
    }

    public static ASN1BMPString getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1BMPString)) {
            return (ASN1BMPString) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1BMPString) {
                return (ASN1BMPString) aSN1Primitive;
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (ASN1BMPString) TYPE.fromByteArray((byte[]) obj);
        } catch (Exception e15) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e15.toString());
        }
    }

    public static ASN1BMPString getTagged(ASN1TaggedObject aSN1TaggedObject, boolean z15) {
        return (ASN1BMPString) TYPE.getTagged(aSN1TaggedObject, z15);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1BMPString) {
            return Arrays.areEqual(this.string, ((ASN1BMPString) aSN1Primitive).string);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void encode(ASN1OutputStream aSN1OutputStream, boolean z15) throws IOException {
        int length = this.string.length;
        aSN1OutputStream.writeIdentifier(z15, 30);
        aSN1OutputStream.writeDL(length * 2);
        byte[] bArr = new byte[8];
        int i15 = length & (-4);
        int i16 = 0;
        while (i16 < i15) {
            char[] cArr = this.string;
            char c15 = cArr[i16];
            char c16 = cArr[i16 + 1];
            char c17 = cArr[i16 + 2];
            char c18 = cArr[i16 + 3];
            i16 += 4;
            bArr[0] = (byte) (c15 >> '\b');
            bArr[1] = (byte) c15;
            bArr[2] = (byte) (c16 >> '\b');
            bArr[3] = (byte) c16;
            bArr[4] = (byte) (c17 >> '\b');
            bArr[5] = (byte) c17;
            bArr[6] = (byte) (c18 >> '\b');
            bArr[7] = (byte) c18;
            aSN1OutputStream.write(bArr, 0, 8);
        }
        if (i16 < length) {
            int i17 = 0;
            do {
                char c19 = this.string[i16];
                i16++;
                int i18 = i17 + 1;
                bArr[i17] = (byte) (c19 >> '\b');
                i17 += 2;
                bArr[i18] = (byte) c19;
            } while (i16 < length);
            aSN1OutputStream.write(bArr, 0, i17);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int encodedLength(boolean z15) {
        return ASN1OutputStream.getLengthOfEncodingDL(z15, this.string.length * 2);
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public final String getString() {
        return new String(this.string);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return Arrays.hashCode(this.string);
    }

    public String toString() {
        return getString();
    }

    ASN1BMPString(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        int length = bArr.length;
        if ((length & 1) != 0) {
            throw new IllegalArgumentException("malformed BMPString encoding encountered");
        }
        int i15 = length / 2;
        char[] cArr = new char[i15];
        for (int i16 = 0; i16 != i15; i16++) {
            int i17 = i16 * 2;
            cArr[i16] = (char) ((bArr[i17 + 1] & 255) | (bArr[i17] << 8));
        }
        this.string = cArr;
    }

    static ASN1BMPString createPrimitive(char[] cArr) {
        return new DERBMPString(cArr);
    }

    public static ASN1BMPString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z15) {
        return (ASN1BMPString) TYPE.getContextTagged(aSN1TaggedObject, z15);
    }

    ASN1BMPString(char[] cArr) {
        if (cArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.string = cArr;
    }
}
