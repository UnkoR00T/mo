package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ASN1TaggedObject extends ASN1Primitive implements ASN1TaggedObjectParser {
    private static final int DECLARED_EXPLICIT = 1;
    private static final int DECLARED_IMPLICIT = 2;
    private static final int PARSED_EXPLICIT = 3;
    private static final int PARSED_IMPLICIT = 4;
    final int explicitness;
    final ASN1Encodable obj;
    final int tagClass;
    final int tagNo;

    ASN1TaggedObject(int i15, int i16, int i17, ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable == null) {
            throw new NullPointerException("'obj' cannot be null");
        }
        if (i16 == 0 || (i16 & 192) != i16) {
            throw new IllegalArgumentException("invalid tag class: " + i16);
        }
        this.explicitness = aSN1Encodable instanceof ASN1Choice ? 1 : i15;
        this.tagClass = i16;
        this.tagNo = i17;
        this.obj = aSN1Encodable;
    }

    private static ASN1TaggedObject checkInstance(Object obj) {
        if (obj != null) {
            return getInstance(obj);
        }
        throw new NullPointerException("'obj' cannot be null");
    }

    private static ASN1TaggedObject checkedCast(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1TaggedObject) {
            return (ASN1TaggedObject) aSN1Primitive;
        }
        throw new IllegalStateException("unexpected object: " + aSN1Primitive.getClass().getName());
    }

    static ASN1Primitive createConstructedDL(int i15, int i16, ASN1EncodableVector aSN1EncodableVector) {
        return aSN1EncodableVector.size() == 1 ? new DLTaggedObject(3, i15, i16, aSN1EncodableVector.get(0)) : new DLTaggedObject(4, i15, i16, DLFactory.createSequence(aSN1EncodableVector));
    }

    static ASN1Primitive createConstructedIL(int i15, int i16, ASN1EncodableVector aSN1EncodableVector) {
        return aSN1EncodableVector.size() == 1 ? new BERTaggedObject(3, i15, i16, aSN1EncodableVector.get(0)) : new BERTaggedObject(4, i15, i16, BERFactory.createSequence(aSN1EncodableVector));
    }

    static ASN1Primitive createPrimitive(int i15, int i16, byte[] bArr) {
        return new DLTaggedObject(4, i15, i16, new DEROctetString(bArr));
    }

    public static ASN1TaggedObject getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1TaggedObject)) {
            return (ASN1TaggedObject) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1TaggedObject) {
                return (ASN1TaggedObject) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return checkedCast(ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (IOException e15) {
                throw new IllegalArgumentException("failed to construct tagged object from byte[]: " + e15.getMessage());
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    public static ASN1TaggedObject getOptional(ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        if (aSN1Encodable instanceof ASN1TaggedObject) {
            return (ASN1TaggedObject) aSN1Encodable;
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1TaggedObject)) {
            return false;
        }
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Primitive;
        if (this.tagNo != aSN1TaggedObject.tagNo || this.tagClass != aSN1TaggedObject.tagClass) {
            return false;
        }
        if (this.explicitness != aSN1TaggedObject.explicitness && isExplicit() != aSN1TaggedObject.isExplicit()) {
            return false;
        }
        ASN1Primitive aSN1Primitive2 = this.obj.toASN1Primitive();
        ASN1Primitive aSN1Primitive3 = aSN1TaggedObject.obj.toASN1Primitive();
        if (aSN1Primitive2 == aSN1Primitive3) {
            return true;
        }
        if (isExplicit()) {
            return aSN1Primitive2.asn1Equals(aSN1Primitive3);
        }
        try {
            return Arrays.areEqual(getEncoded(), aSN1TaggedObject.getEncoded());
        } catch (IOException unused) {
            return false;
        }
    }

    public ASN1Object getBaseObject() {
        ASN1Encodable aSN1Encodable = this.obj;
        return aSN1Encodable instanceof ASN1Object ? (ASN1Object) aSN1Encodable : aSN1Encodable.toASN1Primitive();
    }

    public ASN1Primitive getBaseUniversal(boolean z15, int i15) {
        ASN1UniversalType aSN1UniversalType = ASN1UniversalTypes.get(i15);
        if (aSN1UniversalType != null) {
            return getBaseUniversal(z15, aSN1UniversalType);
        }
        throw new IllegalArgumentException("unsupported UNIVERSAL tag number: " + i15);
    }

    public ASN1Object getExplicitBaseObject() {
        if (!isExplicit()) {
            throw new IllegalStateException("object implicit - explicit expected.");
        }
        ASN1Encodable aSN1Encodable = this.obj;
        return aSN1Encodable instanceof ASN1Object ? (ASN1Object) aSN1Encodable : aSN1Encodable.toASN1Primitive();
    }

    public ASN1TaggedObject getExplicitBaseTagged() {
        if (isExplicit()) {
            return checkedCast(this.obj.toASN1Primitive());
        }
        throw new IllegalStateException("object implicit - explicit expected.");
    }

    public ASN1TaggedObject getImplicitBaseTagged(int i15, int i16) {
        if (i15 == 0 || (i15 & 192) != i15) {
            throw new IllegalArgumentException("invalid base tag class: " + i15);
        }
        int i17 = this.explicitness;
        if (i17 != 1) {
            return i17 != 2 ? replaceTag(i15, i16) : ASN1Util.checkTag(checkedCast(this.obj.toASN1Primitive()), i15, i16);
        }
        throw new IllegalStateException("object explicit - implicit expected.");
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public final ASN1Primitive getLoadedObject() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public int getTagClass() {
        return this.tagClass;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public int getTagNo() {
        return this.tagNo;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public boolean hasContextTag() {
        return this.tagClass == 128;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public boolean hasTag(int i15, int i16) {
        return this.tagClass == i15 && this.tagNo == i16;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public boolean hasTagClass(int i15) {
        return this.tagClass == i15;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return (((this.tagClass * 7919) ^ this.tagNo) ^ (isExplicit() ? 15 : 240)) ^ this.obj.toASN1Primitive().hashCode();
    }

    public boolean isExplicit() {
        int i15 = this.explicitness;
        return i15 == 1 || i15 == 3;
    }

    boolean isParsed() {
        int i15 = this.explicitness;
        return i15 == 3 || i15 == 4;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1Encodable parseBaseUniversal(boolean z15, int i15) {
        ASN1Primitive baseUniversal = getBaseUniversal(z15, i15);
        if (i15 == 3) {
            return ((ASN1BitString) baseUniversal).parser();
        }
        if (i15 == 4) {
            return ((ASN1OctetString) baseUniversal).parser();
        }
        if (i15 != 16) {
            return i15 != 17 ? baseUniversal : ((ASN1Set) baseUniversal).parser();
        }
        return ((ASN1Sequence) baseUniversal).parser();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1Encodable parseExplicitBaseObject() {
        return getExplicitBaseObject();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1TaggedObjectParser parseExplicitBaseTagged() {
        return getExplicitBaseTagged();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1TaggedObjectParser parseImplicitBaseTagged(int i15, int i16) {
        return getImplicitBaseTagged(i15, i16);
    }

    abstract ASN1Sequence rebuildConstructed(ASN1Primitive aSN1Primitive);

    abstract ASN1TaggedObject replaceTag(int i15, int i16);

    @Override // org.bouncycastle.asn1.ASN1Primitive
    ASN1Primitive toDERObject() {
        return new DERTaggedObject(this.explicitness, this.tagClass, this.tagNo, this.obj);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    ASN1Primitive toDLObject() {
        return new DLTaggedObject(this.explicitness, this.tagClass, this.tagNo, this.obj);
    }

    public String toString() {
        return ASN1Util.getTagText(this.tagClass, this.tagNo) + this.obj;
    }

    protected ASN1TaggedObject(boolean z15, int i15, int i16, ASN1Encodable aSN1Encodable) {
        this(z15 ? 1 : 2, i15, i16, aSN1Encodable);
    }

    private static ASN1TaggedObject checkInstance(ASN1TaggedObject aSN1TaggedObject, boolean z15) {
        if (!z15) {
            throw new IllegalArgumentException("this method not valid for implicitly tagged tagged objects");
        }
        if (aSN1TaggedObject != null) {
            return aSN1TaggedObject;
        }
        throw new NullPointerException("'taggedObject' cannot be null");
    }

    public static ASN1TaggedObject getInstance(Object obj, int i15) {
        return ASN1Util.checkTagClass(checkInstance(obj), i15);
    }

    public static ASN1TaggedObject getOptional(ASN1Encodable aSN1Encodable, int i15) {
        ASN1TaggedObject optional = getOptional(aSN1Encodable);
        if (optional == null || !optional.hasTagClass(i15)) {
            return null;
        }
        return optional;
    }

    ASN1Primitive getBaseUniversal(boolean z15, ASN1UniversalType aSN1UniversalType) {
        if (z15) {
            if (isExplicit()) {
                return aSN1UniversalType.checkedCast(this.obj.toASN1Primitive());
            }
            throw new IllegalStateException("object implicit - explicit expected.");
        }
        if (1 == this.explicitness) {
            throw new IllegalStateException("object explicit - implicit expected.");
        }
        ASN1Primitive aSN1Primitive = this.obj.toASN1Primitive();
        int i15 = this.explicitness;
        if (i15 == 3) {
            return aSN1UniversalType.fromImplicitConstructed(rebuildConstructed(aSN1Primitive));
        }
        if (i15 != 4) {
            return aSN1UniversalType.checkedCast(aSN1Primitive);
        }
        return aSN1Primitive instanceof ASN1Sequence ? aSN1UniversalType.fromImplicitConstructed((ASN1Sequence) aSN1Primitive) : aSN1UniversalType.fromImplicitPrimitive((DEROctetString) aSN1Primitive);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public boolean hasContextTag(int i15) {
        return this.tagClass == 128 && this.tagNo == i15;
    }

    protected ASN1TaggedObject(boolean z15, int i15, ASN1Encodable aSN1Encodable) {
        this(z15, 128, i15, aSN1Encodable);
    }

    public static ASN1TaggedObject getInstance(Object obj, int i15, int i16) {
        return ASN1Util.checkTag(checkInstance(obj), i15, i16);
    }

    public static ASN1TaggedObject getOptional(ASN1Encodable aSN1Encodable, int i15, int i16) {
        ASN1TaggedObject optional = getOptional(aSN1Encodable);
        if (optional == null || !optional.hasTag(i15, i16)) {
            return null;
        }
        return optional;
    }

    public static ASN1TaggedObject getInstance(ASN1TaggedObject aSN1TaggedObject, int i15, int i16, boolean z15) {
        return ASN1Util.getExplicitBaseTagged(checkInstance(aSN1TaggedObject, z15), i15, i16);
    }

    public static ASN1TaggedObject getInstance(ASN1TaggedObject aSN1TaggedObject, int i15, boolean z15) {
        return ASN1Util.getExplicitBaseTagged(checkInstance(aSN1TaggedObject, z15), i15);
    }

    public static ASN1TaggedObject getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z15) {
        return ASN1Util.getExplicitContextBaseTagged(checkInstance(aSN1TaggedObject, z15));
    }
}
