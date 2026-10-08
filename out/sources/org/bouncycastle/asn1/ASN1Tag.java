package org.bouncycastle.asn1;

/* JADX INFO: loaded from: classes3.dex */
final class ASN1Tag {
    private final int tagClass;
    private final int tagNumber;

    private ASN1Tag(int i15, int i16) {
        this.tagClass = i15;
        this.tagNumber = i16;
    }

    static ASN1Tag create(int i15, int i16) {
        return new ASN1Tag(i15, i16);
    }

    int getTagClass() {
        return this.tagClass;
    }

    int getTagNumber() {
        return this.tagNumber;
    }
}
