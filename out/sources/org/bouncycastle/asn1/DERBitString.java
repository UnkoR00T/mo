package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
public class DERBitString extends ASN1BitString {
    public DERBitString(byte b15, int i15) {
        super(b15, i15);
    }

    public static DERBitString convert(ASN1BitString aSN1BitString) {
        return (DERBitString) aSN1BitString.toDERObject();
    }

    static DERBitString fromOctetString(ASN1OctetString aSN1OctetString) {
        return new DERBitString(aSN1OctetString.getOctets(), true);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    void encode(ASN1OutputStream aSN1OutputStream, boolean z15) throws IOException {
        byte[] bArr = this.contents;
        int i15 = bArr[0] & 255;
        int length = bArr.length - 1;
        byte b15 = bArr[length];
        byte b16 = (byte) ((GF2Field.MASK << i15) & b15);
        if (b15 == b16) {
            aSN1OutputStream.writeEncodingDL(z15, 3, bArr);
        } else {
            aSN1OutputStream.writeEncodingDL(z15, 3, bArr, 0, length, b16);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    int encodedLength(boolean z15) {
        return ASN1OutputStream.getLengthOfEncodingDL(z15, this.contents.length);
    }

    @Override // org.bouncycastle.asn1.ASN1BitString, org.bouncycastle.asn1.ASN1Primitive
    ASN1Primitive toDERObject() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1BitString, org.bouncycastle.asn1.ASN1Primitive
    ASN1Primitive toDLObject() {
        return this;
    }

    public DERBitString(int i15) {
        super(ASN1BitString.getBytes(i15), ASN1BitString.getPadBits(i15));
    }

    public DERBitString(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER), 0);
    }

    public DERBitString(byte[] bArr) {
        this(bArr, 0);
    }

    public DERBitString(byte[] bArr, int i15) {
        super(bArr, i15);
    }

    DERBitString(byte[] bArr, boolean z15) {
        super(bArr, z15);
    }
}
