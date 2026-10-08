package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class DLBitString extends ASN1BitString {
    public DLBitString(byte b15, int i15) {
        super(b15, i15);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    void encode(ASN1OutputStream aSN1OutputStream, boolean z15) {
        aSN1OutputStream.writeEncodingDL(z15, 3, this.contents);
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
    ASN1Primitive toDLObject() {
        return this;
    }

    public DLBitString(int i15) {
        super(ASN1BitString.getBytes(i15), ASN1BitString.getPadBits(i15));
    }

    static void encode(ASN1OutputStream aSN1OutputStream, boolean z15, byte b15, byte[] bArr, int i15, int i16) throws IOException {
        aSN1OutputStream.writeEncodingDL(z15, 3, b15, bArr, i15, i16);
    }

    static int encodedLength(boolean z15, int i15) {
        return ASN1OutputStream.getLengthOfEncodingDL(z15, i15);
    }

    public DLBitString(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER), 0);
    }

    static void encode(ASN1OutputStream aSN1OutputStream, boolean z15, byte[] bArr, int i15, int i16) throws IOException {
        aSN1OutputStream.writeEncodingDL(z15, 3, bArr, i15, i16);
    }

    public DLBitString(byte[] bArr) {
        this(bArr, 0);
    }

    public DLBitString(byte[] bArr, int i15) {
        super(bArr, i15);
    }

    DLBitString(byte[] bArr, boolean z15) {
        super(bArr, z15);
    }
}
