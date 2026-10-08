package org.bouncycastle.asn1;

/* JADX INFO: loaded from: classes3.dex */
public interface ASN1TaggedObjectParser extends ASN1Encodable, InMemoryRepresentable {
    int getTagClass();

    int getTagNo();

    boolean hasContextTag();

    boolean hasContextTag(int i15);

    boolean hasTag(int i15, int i16);

    boolean hasTagClass(int i15);

    ASN1Encodable parseBaseUniversal(boolean z15, int i15);

    ASN1Encodable parseExplicitBaseObject();

    ASN1TaggedObjectParser parseExplicitBaseTagged();

    ASN1TaggedObjectParser parseImplicitBaseTagged(int i15, int i16);
}
