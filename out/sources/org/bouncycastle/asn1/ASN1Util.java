package org.bouncycastle.asn1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ASN1Util {
    static ASN1TaggedObject checkContextTag(ASN1TaggedObject aSN1TaggedObject, int i15) {
        return checkTag(aSN1TaggedObject, 128, i15);
    }

    static ASN1TaggedObject checkContextTagClass(ASN1TaggedObject aSN1TaggedObject) {
        return checkTagClass(aSN1TaggedObject, 128);
    }

    static ASN1TaggedObject checkTag(ASN1TaggedObject aSN1TaggedObject, int i15, int i16) {
        if (aSN1TaggedObject.hasTag(i15, i16)) {
            return aSN1TaggedObject;
        }
        throw new IllegalStateException("Expected " + getTagText(i15, i16) + " tag but found " + getTagText(aSN1TaggedObject));
    }

    static ASN1TaggedObject checkTagClass(ASN1TaggedObject aSN1TaggedObject, int i15) {
        if (aSN1TaggedObject.hasTagClass(i15)) {
            return aSN1TaggedObject;
        }
        throw new IllegalStateException("Expected " + getTagClassText(i15) + " tag but found " + getTagClassText(aSN1TaggedObject));
    }

    public static ASN1Primitive getBaseUniversal(ASN1TaggedObject aSN1TaggedObject, int i15, int i16, boolean z15, int i17) {
        return checkTag(aSN1TaggedObject, i15, i16).getBaseUniversal(z15, i17);
    }

    public static ASN1Primitive getContextBaseUniversal(ASN1TaggedObject aSN1TaggedObject, int i15, boolean z15, int i16) {
        return getBaseUniversal(aSN1TaggedObject, 128, i15, z15, i16);
    }

    public static ASN1Object getExplicitBaseObject(ASN1TaggedObject aSN1TaggedObject, int i15) {
        return checkTagClass(aSN1TaggedObject, i15).getExplicitBaseObject();
    }

    public static ASN1TaggedObject getExplicitBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i15) {
        return checkTagClass(aSN1TaggedObject, i15).getExplicitBaseTagged();
    }

    public static ASN1Object getExplicitContextBaseObject(ASN1TaggedObject aSN1TaggedObject) {
        return getExplicitBaseObject(aSN1TaggedObject, 128);
    }

    public static ASN1TaggedObject getExplicitContextBaseTagged(ASN1TaggedObject aSN1TaggedObject) {
        return getExplicitBaseTagged(aSN1TaggedObject, 128);
    }

    public static ASN1TaggedObject getImplicitBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i15, int i16, int i17, int i18) {
        return checkTag(aSN1TaggedObject, i15, i16).getImplicitBaseTagged(i17, i18);
    }

    public static ASN1TaggedObject getImplicitContextBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i15, int i16, int i17) {
        return getImplicitBaseTagged(aSN1TaggedObject, 128, i15, i16, i17);
    }

    public static Object getInstanceChoiceBaseObject(ASN1TaggedObject aSN1TaggedObject, boolean z15, String str) {
        if (z15) {
            if (aSN1TaggedObject != null) {
                return getExplicitContextBaseObject(aSN1TaggedObject);
            }
            throw new NullPointerException("'taggedObject' cannot be null");
        }
        throw new IllegalArgumentException("Implicit tagging cannot be used with untagged choice type " + str + " (X.680 30.6, 30.8).");
    }

    public static String getTagClassText(int i15) {
        if (i15 == 64) {
            return "APPLICATION";
        }
        if (i15 != 128) {
            return i15 != 192 ? "UNIVERSAL" : "PRIVATE";
        }
        return "CONTEXT";
    }

    public static String getTagText(int i15, int i16) {
        StringBuilder sb5;
        String str;
        if (i15 == 64) {
            sb5 = new StringBuilder();
            str = "[APPLICATION ";
        } else if (i15 == 128) {
            sb5 = new StringBuilder();
            str = "[CONTEXT ";
        } else if (i15 != 192) {
            sb5 = new StringBuilder();
            str = "[UNIVERSAL ";
        } else {
            sb5 = new StringBuilder();
            str = "[PRIVATE ";
        }
        sb5.append(str);
        sb5.append(i16);
        sb5.append("]");
        return sb5.toString();
    }

    public static Object getTaggedChoiceBaseObject(ASN1TaggedObject aSN1TaggedObject, boolean z15, String str) {
        if (z15) {
            if (aSN1TaggedObject != null) {
                return aSN1TaggedObject.getExplicitBaseObject();
            }
            throw new NullPointerException("'taggedObject' cannot be null");
        }
        throw new IllegalArgumentException("Implicit tagging cannot be used with untagged choice type " + str + " (X.680 30.6, 30.8).");
    }

    public static ASN1Encodable parseBaseUniversal(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i15, int i16, boolean z15, int i17) {
        return checkTag(aSN1TaggedObjectParser, i15, i16).parseBaseUniversal(z15, i17);
    }

    public static ASN1Encodable parseContextBaseUniversal(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i15, boolean z15, int i16) {
        return parseBaseUniversal(aSN1TaggedObjectParser, 128, i15, z15, i16);
    }

    public static ASN1Encodable parseExplicitBaseObject(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i15, int i16) {
        return checkTag(aSN1TaggedObjectParser, i15, i16).parseExplicitBaseObject();
    }

    public static ASN1TaggedObjectParser parseExplicitBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i15) {
        return checkTagClass(aSN1TaggedObjectParser, i15).parseExplicitBaseTagged();
    }

    public static ASN1Encodable parseExplicitContextBaseObject(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i15) {
        return parseExplicitBaseObject(aSN1TaggedObjectParser, 128, i15);
    }

    public static ASN1TaggedObjectParser parseExplicitContextBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser) {
        return parseExplicitBaseTagged(aSN1TaggedObjectParser, 128);
    }

    public static ASN1TaggedObjectParser parseImplicitBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i15, int i16, int i17, int i18) {
        return checkTag(aSN1TaggedObjectParser, i15, i16).parseImplicitBaseTagged(i17, i18);
    }

    public static ASN1TaggedObjectParser parseImplicitContextBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i15, int i16, int i17) {
        return parseImplicitBaseTagged(aSN1TaggedObjectParser, 128, i15, i16, i17);
    }

    public static ASN1Primitive tryGetBaseUniversal(ASN1TaggedObject aSN1TaggedObject, int i15, int i16, boolean z15, int i17) {
        if (aSN1TaggedObject.hasTag(i15, i16)) {
            return aSN1TaggedObject.getBaseUniversal(z15, i17);
        }
        return null;
    }

    public static ASN1Primitive tryGetContextBaseUniversal(ASN1TaggedObject aSN1TaggedObject, int i15, boolean z15, int i16) {
        return tryGetBaseUniversal(aSN1TaggedObject, 128, i15, z15, i16);
    }

    public static ASN1Object tryGetExplicitBaseObject(ASN1TaggedObject aSN1TaggedObject, int i15) {
        if (aSN1TaggedObject.hasTagClass(i15)) {
            return aSN1TaggedObject.getExplicitBaseObject();
        }
        return null;
    }

    public static ASN1TaggedObject tryGetExplicitBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i15) {
        if (aSN1TaggedObject.hasTagClass(i15)) {
            return aSN1TaggedObject.getExplicitBaseTagged();
        }
        return null;
    }

    public static ASN1Object tryGetExplicitContextBaseObject(ASN1TaggedObject aSN1TaggedObject) {
        return tryGetExplicitBaseObject(aSN1TaggedObject, 128);
    }

    public static ASN1TaggedObject tryGetExplicitContextBaseTagged(ASN1TaggedObject aSN1TaggedObject) {
        return tryGetExplicitBaseTagged(aSN1TaggedObject, 128);
    }

    public static ASN1TaggedObject tryGetImplicitBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i15, int i16, int i17, int i18) {
        if (aSN1TaggedObject.hasTag(i15, i16)) {
            return aSN1TaggedObject.getImplicitBaseTagged(i17, i18);
        }
        return null;
    }

    public static ASN1TaggedObject tryGetImplicitContextBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i15, int i16, int i17) {
        return tryGetImplicitBaseTagged(aSN1TaggedObject, 128, i15, i16, i17);
    }

    public static ASN1Encodable tryParseBaseUniversal(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i15, int i16, boolean z15, int i17) {
        if (aSN1TaggedObjectParser.hasTag(i15, i16)) {
            return aSN1TaggedObjectParser.parseBaseUniversal(z15, i17);
        }
        return null;
    }

    public static ASN1Encodable tryParseContextBaseUniversal(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i15, boolean z15, int i16) {
        return tryParseBaseUniversal(aSN1TaggedObjectParser, 128, i15, z15, i16);
    }

    public static ASN1Encodable tryParseExplicitBaseObject(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i15, int i16) {
        if (aSN1TaggedObjectParser.hasTag(i15, i16)) {
            return aSN1TaggedObjectParser.parseExplicitBaseObject();
        }
        return null;
    }

    public static ASN1TaggedObjectParser tryParseExplicitBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i15) {
        if (aSN1TaggedObjectParser.hasTagClass(i15)) {
            return aSN1TaggedObjectParser.parseExplicitBaseTagged();
        }
        return null;
    }

    public static ASN1Encodable tryParseExplicitContextBaseObject(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i15) {
        return tryParseExplicitBaseObject(aSN1TaggedObjectParser, 128, i15);
    }

    public static ASN1TaggedObjectParser tryParseExplicitContextBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser) {
        return tryParseExplicitBaseTagged(aSN1TaggedObjectParser, 128);
    }

    public static ASN1TaggedObjectParser tryParseImplicitBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i15, int i16, int i17, int i18) {
        if (aSN1TaggedObjectParser.hasTag(i15, i16)) {
            return aSN1TaggedObjectParser.parseImplicitBaseTagged(i17, i18);
        }
        return null;
    }

    public static ASN1TaggedObjectParser tryParseImplicitContextBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i15, int i16, int i17) {
        return tryParseImplicitBaseTagged(aSN1TaggedObjectParser, 128, i15, i16, i17);
    }

    static ASN1TaggedObjectParser checkContextTag(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i15) {
        return checkTag(aSN1TaggedObjectParser, 128, i15);
    }

    static ASN1TaggedObjectParser checkContextTagClass(ASN1TaggedObjectParser aSN1TaggedObjectParser) {
        return checkTagClass(aSN1TaggedObjectParser, 128);
    }

    static ASN1TaggedObjectParser checkTag(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i15, int i16) {
        if (aSN1TaggedObjectParser.hasTag(i15, i16)) {
            return aSN1TaggedObjectParser;
        }
        throw new IllegalStateException("Expected " + getTagText(i15, i16) + " tag but found " + getTagText(aSN1TaggedObjectParser));
    }

    static ASN1TaggedObjectParser checkTagClass(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i15) {
        if (aSN1TaggedObjectParser.hasTagClass(i15)) {
            return aSN1TaggedObjectParser;
        }
        throw new IllegalStateException("Expected " + getTagClassText(i15) + " tag but found " + getTagClassText(aSN1TaggedObjectParser));
    }

    public static ASN1Object getExplicitBaseObject(ASN1TaggedObject aSN1TaggedObject, int i15, int i16) {
        return checkTag(aSN1TaggedObject, i15, i16).getExplicitBaseObject();
    }

    public static ASN1TaggedObject getExplicitBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i15, int i16) {
        return checkTag(aSN1TaggedObject, i15, i16).getExplicitBaseTagged();
    }

    public static ASN1Object getExplicitContextBaseObject(ASN1TaggedObject aSN1TaggedObject, int i15) {
        return getExplicitBaseObject(aSN1TaggedObject, 128, i15);
    }

    public static ASN1TaggedObject getExplicitContextBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i15) {
        return getExplicitBaseTagged(aSN1TaggedObject, 128, i15);
    }

    static String getTagClassText(ASN1Tag aSN1Tag) {
        return getTagClassText(aSN1Tag.getTagClass());
    }

    static String getTagText(ASN1Tag aSN1Tag) {
        return getTagText(aSN1Tag.getTagClass(), aSN1Tag.getTagNumber());
    }

    public static ASN1TaggedObjectParser parseExplicitBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i15, int i16) {
        return checkTag(aSN1TaggedObjectParser, i15, i16).parseExplicitBaseTagged();
    }

    public static ASN1TaggedObjectParser parseExplicitContextBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i15) {
        return parseExplicitBaseTagged(aSN1TaggedObjectParser, 128, i15);
    }

    public static ASN1Object tryGetExplicitBaseObject(ASN1TaggedObject aSN1TaggedObject, int i15, int i16) {
        if (aSN1TaggedObject.hasTag(i15, i16)) {
            return aSN1TaggedObject.getExplicitBaseObject();
        }
        return null;
    }

    public static ASN1TaggedObject tryGetExplicitBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i15, int i16) {
        if (aSN1TaggedObject.hasTag(i15, i16)) {
            return aSN1TaggedObject.getExplicitBaseTagged();
        }
        return null;
    }

    public static ASN1Object tryGetExplicitContextBaseObject(ASN1TaggedObject aSN1TaggedObject, int i15) {
        return tryGetExplicitBaseObject(aSN1TaggedObject, 128, i15);
    }

    public static ASN1TaggedObject tryGetExplicitContextBaseTagged(ASN1TaggedObject aSN1TaggedObject, int i15) {
        return tryGetExplicitBaseTagged(aSN1TaggedObject, 128, i15);
    }

    public static ASN1TaggedObjectParser tryParseExplicitBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i15, int i16) {
        if (aSN1TaggedObjectParser.hasTag(i15, i16)) {
            return aSN1TaggedObjectParser.parseExplicitBaseTagged();
        }
        return null;
    }

    public static ASN1TaggedObjectParser tryParseExplicitContextBaseTagged(ASN1TaggedObjectParser aSN1TaggedObjectParser, int i15) {
        return tryParseExplicitBaseTagged(aSN1TaggedObjectParser, 128, i15);
    }

    public static String getTagClassText(ASN1TaggedObject aSN1TaggedObject) {
        return getTagClassText(aSN1TaggedObject.getTagClass());
    }

    public static String getTagText(ASN1TaggedObject aSN1TaggedObject) {
        return getTagText(aSN1TaggedObject.getTagClass(), aSN1TaggedObject.getTagNo());
    }

    public static String getTagClassText(ASN1TaggedObjectParser aSN1TaggedObjectParser) {
        return getTagClassText(aSN1TaggedObjectParser.getTagClass());
    }

    public static String getTagText(ASN1TaggedObjectParser aSN1TaggedObjectParser) {
        return getTagText(aSN1TaggedObjectParser.getTagClass(), aSN1TaggedObjectParser.getTagNo());
    }
}
