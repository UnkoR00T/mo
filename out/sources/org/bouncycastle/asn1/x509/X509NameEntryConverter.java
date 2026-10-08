package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1PrintableString;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes5.dex */
public abstract class X509NameEntryConverter {
    protected boolean canBePrintable(String str) {
        return ASN1PrintableString.isPrintableString(str);
    }

    protected ASN1Primitive convertHexEncoded(String str, int i15) {
        return ASN1Primitive.fromByteArray(Hex.decodeStrict(str, i15, str.length() - i15));
    }

    public abstract ASN1Primitive getConvertedValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str);
}
