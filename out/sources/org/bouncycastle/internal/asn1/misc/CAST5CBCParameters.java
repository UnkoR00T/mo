package org.bouncycastle.internal.asn1.misc;

import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class CAST5CBCParameters extends ASN1Object {

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    ASN1OctetString f149216iv;
    ASN1Integer keyLength;

    private CAST5CBCParameters(ASN1Sequence aSN1Sequence) {
        this.f149216iv = (ASN1OctetString) aSN1Sequence.getObjectAt(0);
        this.keyLength = (ASN1Integer) aSN1Sequence.getObjectAt(1);
    }

    public static CAST5CBCParameters getInstance(Object obj) {
        if (obj instanceof CAST5CBCParameters) {
            return (CAST5CBCParameters) obj;
        }
        if (obj != null) {
            return new CAST5CBCParameters(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getIV() {
        return Arrays.clone(this.f149216iv.getOctets());
    }

    public int getKeyLength() {
        return this.keyLength.intValueExact();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.f149216iv, this.keyLength);
    }

    public CAST5CBCParameters(byte[] bArr, int i15) {
        this.f149216iv = new DEROctetString(Arrays.clone(bArr));
        this.keyLength = new ASN1Integer(i15);
    }
}
