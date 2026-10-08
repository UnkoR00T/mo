package org.bouncycastle.asn1;

/* JADX INFO: loaded from: classes3.dex */
public class DERPrintableString extends ASN1PrintableString {
    public DERPrintableString(String str) {
        this(str, false);
    }

    public DERPrintableString(String str, boolean z15) {
        super(str, z15);
    }

    DERPrintableString(byte[] bArr, boolean z15) {
        super(bArr, z15);
    }
}
