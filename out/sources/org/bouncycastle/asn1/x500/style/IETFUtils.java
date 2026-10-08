package org.bouncycastle.asn1.x500.style;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.ASN1UniversalString;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.asn1.x500.AttributeTypeAndValue;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500NameBuilder;
import org.bouncycastle.asn1.x500.X500NameStyle;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes3.dex */
public class IETFUtils {
    private static void addMultiValuedRDN(X500NameStyle x500NameStyle, X500NameBuilder x500NameBuilder, X500NameTokenizer x500NameTokenizer) {
        String strNextToken = x500NameTokenizer.nextToken();
        if (strNextToken == null) {
            throw new IllegalArgumentException("badly formatted directory string");
        }
        if (!x500NameTokenizer.hasMoreTokens()) {
            addRDN(x500NameStyle, x500NameBuilder, strNextToken);
            return;
        }
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        do {
            collectAttributeTypeAndValue(x500NameStyle, vector, vector2, strNextToken);
            strNextToken = x500NameTokenizer.nextToken();
        } while (strNextToken != null);
        x500NameBuilder.addMultiValuedRDN(toOIDArray(vector), toValueArray(vector2));
    }

    private static void addRDN(X500NameStyle x500NameStyle, X500NameBuilder x500NameBuilder, String str) {
        X500NameTokenizer x500NameTokenizer = new X500NameTokenizer(str, '=');
        x500NameBuilder.addRDN(x500NameStyle.attrNameToOID(nextToken(x500NameTokenizer, true).trim()), unescape(nextToken(x500NameTokenizer, false)));
    }

    private static void addRDNs(X500NameStyle x500NameStyle, X500NameBuilder x500NameBuilder, X500NameTokenizer x500NameTokenizer) {
        while (true) {
            String strNextToken = x500NameTokenizer.nextToken();
            if (strNextToken == null) {
                return;
            }
            if (strNextToken.indexOf(43) >= 0) {
                addMultiValuedRDN(x500NameStyle, x500NameBuilder, new X500NameTokenizer(strNextToken, '+'));
            } else {
                addRDN(x500NameStyle, x500NameBuilder, strNextToken);
            }
        }
    }

    public static void appendRDN(StringBuffer stringBuffer, RDN rdn, Hashtable hashtable) {
        if (!rdn.isMultiValued()) {
            if (rdn.getFirst() != null) {
                appendTypeAndValue(stringBuffer, rdn.getFirst(), hashtable);
                return;
            }
            return;
        }
        AttributeTypeAndValue[] typesAndValues = rdn.getTypesAndValues();
        boolean z15 = true;
        for (int i15 = 0; i15 != typesAndValues.length; i15++) {
            if (z15) {
                z15 = false;
            } else {
                stringBuffer.append('+');
            }
            appendTypeAndValue(stringBuffer, typesAndValues[i15], hashtable);
        }
    }

    public static void appendTypeAndValue(StringBuffer stringBuffer, AttributeTypeAndValue attributeTypeAndValue, Hashtable hashtable) {
        String id5 = (String) hashtable.get(attributeTypeAndValue.getType());
        if (id5 == null) {
            id5 = attributeTypeAndValue.getType().getId();
        }
        stringBuffer.append(id5);
        stringBuffer.append('=');
        stringBuffer.append(valueToString(attributeTypeAndValue.getValue()));
    }

    private static boolean atvAreEqual(AttributeTypeAndValue attributeTypeAndValue, AttributeTypeAndValue attributeTypeAndValue2) {
        if (attributeTypeAndValue == attributeTypeAndValue2) {
            return true;
        }
        return attributeTypeAndValue != null && attributeTypeAndValue2 != null && attributeTypeAndValue.getType().equals((ASN1Primitive) attributeTypeAndValue2.getType()) && canonicalString(attributeTypeAndValue.getValue()).equals(canonicalString(attributeTypeAndValue2.getValue()));
    }

    public static String canonicalString(ASN1Encodable aSN1Encodable) {
        return canonicalize(valueToString(aSN1Encodable));
    }

    public static String canonicalize(String str) {
        int i15 = 0;
        if (str.length() > 0 && str.charAt(0) == '#') {
            ASN1Encodable aSN1EncodableDecodeObject = decodeObject(str);
            if (aSN1EncodableDecodeObject instanceof ASN1String) {
                str = ((ASN1String) aSN1EncodableDecodeObject).getString();
            }
        }
        String lowerCase = Strings.toLowerCase(str);
        int length = lowerCase.length();
        if (length < 2) {
            return lowerCase;
        }
        int i16 = length - 1;
        while (i15 < i16 && lowerCase.charAt(i15) == '\\' && lowerCase.charAt(i15 + 1) == ' ') {
            i15 += 2;
        }
        int i17 = i15 + 1;
        int i18 = i16;
        while (i18 > i17 && lowerCase.charAt(i18 - 1) == '\\' && lowerCase.charAt(i18) == ' ') {
            i18 -= 2;
        }
        if (i15 > 0 || i18 < i16) {
            lowerCase = lowerCase.substring(i15, i18 + 1);
        }
        return stripInternalSpaces(lowerCase);
    }

    private static void collectAttributeTypeAndValue(X500NameStyle x500NameStyle, Vector vector, Vector vector2, String str) {
        X500NameTokenizer x500NameTokenizer = new X500NameTokenizer(str, '=');
        String strNextToken = nextToken(x500NameTokenizer, true);
        String strNextToken2 = nextToken(x500NameTokenizer, false);
        ASN1ObjectIdentifier aSN1ObjectIdentifierAttrNameToOID = x500NameStyle.attrNameToOID(strNextToken.trim());
        String strUnescape = unescape(strNextToken2);
        vector.addElement(aSN1ObjectIdentifierAttrNameToOID);
        vector2.addElement(strUnescape);
    }

    private static int convertHex(char c15) {
        if ('0' > c15 || c15 > '9') {
            return ('a' > c15 || c15 > 'f') ? c15 - '7' : c15 - 'W';
        }
        return c15 - '0';
    }

    public static ASN1ObjectIdentifier decodeAttrName(String str, Hashtable hashtable) {
        if (str.regionMatches(true, 0, "OID.", 0, 4)) {
            return new ASN1ObjectIdentifier(str.substring(4));
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifierTryFromID = ASN1ObjectIdentifier.tryFromID(str);
        if (aSN1ObjectIdentifierTryFromID != null) {
            return aSN1ObjectIdentifierTryFromID;
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) hashtable.get(Strings.toLowerCase(str));
        if (aSN1ObjectIdentifier != null) {
            return aSN1ObjectIdentifier;
        }
        throw new IllegalArgumentException("Unknown object id - " + str + " - passed to distinguished name");
    }

    private static ASN1Primitive decodeObject(String str) {
        try {
            return ASN1Primitive.fromByteArray(Hex.decodeStrict(str, 1, str.length() - 1));
        } catch (IOException e15) {
            throw new IllegalStateException("unknown encoding in name: " + e15);
        }
    }

    public static String[] findAttrNamesForOID(ASN1ObjectIdentifier aSN1ObjectIdentifier, Hashtable hashtable) {
        Enumeration enumerationElements = hashtable.elements();
        int i15 = 0;
        int i16 = 0;
        while (enumerationElements.hasMoreElements()) {
            if (aSN1ObjectIdentifier.equals(enumerationElements.nextElement())) {
                i16++;
            }
        }
        String[] strArr = new String[i16];
        Enumeration enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            String str = (String) enumerationKeys.nextElement();
            if (aSN1ObjectIdentifier.equals(hashtable.get(str))) {
                strArr[i15] = str;
                i15++;
            }
        }
        return strArr;
    }

    private static boolean isHexDigit(char c15) {
        if ('0' <= c15 && c15 <= '9') {
            return true;
        }
        if ('a' > c15 || c15 > 'f') {
            return 'A' <= c15 && c15 <= 'F';
        }
        return true;
    }

    private static String nextToken(X500NameTokenizer x500NameTokenizer, boolean z15) {
        String strNextToken = x500NameTokenizer.nextToken();
        if (strNextToken == null || x500NameTokenizer.hasMoreTokens() != z15) {
            throw new IllegalArgumentException("badly formatted directory string");
        }
        return strNextToken;
    }

    public static boolean rDNAreEqual(RDN rdn, RDN rdn2) {
        if (rdn.size() != rdn2.size()) {
            return false;
        }
        AttributeTypeAndValue[] typesAndValues = rdn.getTypesAndValues();
        AttributeTypeAndValue[] typesAndValues2 = rdn2.getTypesAndValues();
        if (typesAndValues.length != typesAndValues2.length) {
            return false;
        }
        for (int i15 = 0; i15 != typesAndValues.length; i15++) {
            if (!atvAreEqual(typesAndValues[i15], typesAndValues2[i15])) {
                return false;
            }
        }
        return true;
    }

    public static RDN[] rDNsFromString(String str, X500NameStyle x500NameStyle) {
        X500NameTokenizer x500NameTokenizer = new X500NameTokenizer(str);
        X500NameBuilder x500NameBuilder = new X500NameBuilder(x500NameStyle);
        addRDNs(x500NameStyle, x500NameBuilder, x500NameTokenizer);
        return x500NameBuilder.build().getRDNs();
    }

    public static String stripInternalSpaces(String str) {
        if (str.indexOf("  ") < 0) {
            return str;
        }
        StringBuilder sb5 = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb5.append(cCharAt);
        for (int i15 = 1; i15 < str.length(); i15++) {
            char cCharAt2 = str.charAt(i15);
            if (cCharAt != ' ' || cCharAt2 != ' ') {
                sb5.append(cCharAt2);
                cCharAt = cCharAt2;
            }
        }
        return sb5.toString();
    }

    private static ASN1ObjectIdentifier[] toOIDArray(Vector vector) {
        int size = vector.size();
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new ASN1ObjectIdentifier[size];
        for (int i15 = 0; i15 != size; i15++) {
            aSN1ObjectIdentifierArr[i15] = (ASN1ObjectIdentifier) vector.elementAt(i15);
        }
        return aSN1ObjectIdentifierArr;
    }

    private static String[] toValueArray(Vector vector) {
        int size = vector.size();
        String[] strArr = new String[size];
        for (int i15 = 0; i15 != size; i15++) {
            strArr[i15] = (String) vector.elementAt(i15);
        }
        return strArr;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    private static String unescape(String str) {
        int i15;
        if (str.length() == 0) {
            return str;
        }
        if (str.indexOf(92) < 0 && str.indexOf(34) < 0) {
            return str.trim();
        }
        StringBuilder sb5 = new StringBuilder(str.length());
        if (str.charAt(0) == '\\' && str.charAt(1) == '#') {
            sb5.append("\\#");
            i15 = 2;
        } else {
            i15 = 0;
        }
        boolean z15 = false;
        int length = 0;
        boolean z16 = false;
        boolean z17 = false;
        char c15 = 0;
        while (i15 != str.length()) {
            char cCharAt = str.charAt(i15);
            if (cCharAt != ' ') {
                z17 = true;
            }
            if (cCharAt == '\"') {
                if (z15) {
                    sb5.append(cCharAt);
                    z15 = false;
                } else {
                    z16 = !z16;
                }
            } else if (cCharAt == '\\' && !z15 && !z16) {
                length = sb5.length();
                z15 = true;
            } else if (cCharAt != ' ' || z15 || z17) {
                if (!z15 || !isHexDigit(cCharAt)) {
                    sb5.append(cCharAt);
                    z15 = false;
                } else if (c15 != 0) {
                    sb5.append((char) ((convertHex(c15) * 16) + convertHex(cCharAt)));
                    z15 = false;
                    c15 = 0;
                } else {
                    c15 = cCharAt;
                }
            }
            i15++;
        }
        if (sb5.length() > 0) {
            while (sb5.charAt(sb5.length() - 1) == ' ' && length != sb5.length() - 1) {
                sb5.setLength(sb5.length() - 1);
            }
        }
        return sb5.toString();
    }

    public static ASN1Encodable valueFromHexString(String str, int i15) {
        int length = (str.length() - i15) / 2;
        byte[] bArr = new byte[length];
        for (int i16 = 0; i16 != length; i16++) {
            int i17 = (i16 * 2) + i15;
            char cCharAt = str.charAt(i17);
            char cCharAt2 = str.charAt(i17 + 1);
            bArr[i16] = (byte) (convertHex(cCharAt2) | (convertHex(cCharAt) << 4));
        }
        return ASN1Primitive.fromByteArray(bArr);
    }

    public static String valueToString(ASN1Encodable aSN1Encodable) {
        StringBuilder sb5 = new StringBuilder();
        int i15 = 0;
        if (!(aSN1Encodable instanceof ASN1String) || (aSN1Encodable instanceof ASN1UniversalString)) {
            try {
                sb5.append('#');
                sb5.append(Hex.toHexString(aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER)));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        } else {
            String string = ((ASN1String) aSN1Encodable).getString();
            if (string.length() > 0 && string.charAt(0) == '#') {
                sb5.append('\\');
            }
            sb5.append(string);
        }
        int length = sb5.length();
        int i16 = (sb5.length() >= 2 && sb5.charAt(0) == '\\' && sb5.charAt(1) == '#') ? 2 : 0;
        while (i16 != length) {
            char cCharAt = sb5.charAt(i16);
            if (cCharAt != '\"' && cCharAt != '\\' && cCharAt != '+' && cCharAt != ',') {
                switch (cCharAt) {
                    case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        i16++;
                        break;
                }
            }
            sb5.insert(i16, "\\");
            i16 += 2;
            length++;
        }
        if (sb5.length() > 0) {
            while (sb5.length() > i15 && sb5.charAt(i15) == ' ') {
                sb5.insert(i15, "\\");
                i15 += 2;
            }
        }
        for (int length2 = sb5.length() - 1; length2 >= i15 && sb5.charAt(length2) == ' '; length2--) {
            sb5.insert(length2, '\\');
        }
        return sb5.toString();
    }

    public static void appendRDN(StringBuilder sb5, RDN rdn, Hashtable hashtable) {
        if (!rdn.isMultiValued()) {
            if (rdn.getFirst() != null) {
                appendTypeAndValue(sb5, rdn.getFirst(), hashtable);
                return;
            }
            return;
        }
        AttributeTypeAndValue[] typesAndValues = rdn.getTypesAndValues();
        boolean z15 = true;
        for (int i15 = 0; i15 != typesAndValues.length; i15++) {
            if (z15) {
                z15 = false;
            } else {
                sb5.append('+');
            }
            appendTypeAndValue(sb5, typesAndValues[i15], hashtable);
        }
    }

    public static void appendTypeAndValue(StringBuilder sb5, AttributeTypeAndValue attributeTypeAndValue, Hashtable hashtable) {
        String id5 = (String) hashtable.get(attributeTypeAndValue.getType());
        if (id5 == null) {
            id5 = attributeTypeAndValue.getType().getId();
        }
        sb5.append(id5);
        sb5.append('=');
        sb5.append(valueToString(attributeTypeAndValue.getValue()));
    }
}
