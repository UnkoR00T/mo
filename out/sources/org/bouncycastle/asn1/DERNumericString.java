package org.bouncycastle.asn1;

/* JADX INFO: loaded from: classes3.dex */
public class DERNumericString extends ASN1NumericString {
    public DERNumericString(String str) {
        this(str, false);
    }

    public DERNumericString(String str, boolean z15) {
        super(str, z15);
    }

    DERNumericString(byte[] bArr, boolean z15) {
        super(bArr, z15);
    }
}
