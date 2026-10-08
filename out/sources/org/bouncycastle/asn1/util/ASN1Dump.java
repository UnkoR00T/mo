package org.bouncycastle.asn1.util;

import org.bouncycastle.asn1.ASN1BMPString;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1External;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1GraphicString;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1NumericString;
import org.bouncycastle.asn1.ASN1ObjectDescriptor;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1PrintableString;
import org.bouncycastle.asn1.ASN1RelativeOID;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1T61String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UTCTime;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.ASN1Util;
import org.bouncycastle.asn1.ASN1VideotexString;
import org.bouncycastle.asn1.ASN1VisibleString;
import org.bouncycastle.asn1.BEROctetString;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERSet;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DLBitString;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes3.dex */
public class ASN1Dump {
    private static final int SAMPLE_SIZE = 32;
    private static final String TAB = "    ";

    static void _dumpAsString(String str, boolean z15, ASN1Primitive aSN1Primitive, StringBuilder sb5) {
        String str2;
        String str3;
        String str4;
        String str5;
        String strLineSeparator = Strings.lineSeparator();
        sb5.append(str);
        if (aSN1Primitive instanceof ASN1Null) {
            sb5.append("NULL");
            sb5.append(strLineSeparator);
            return;
        }
        int i15 = 0;
        if (aSN1Primitive instanceof ASN1Sequence) {
            if (aSN1Primitive instanceof BERSequence) {
                str5 = "BER Sequence";
            } else {
                str5 = aSN1Primitive instanceof DERSequence ? "DER Sequence" : "Sequence";
            }
            sb5.append(str5);
            sb5.append(strLineSeparator);
            ASN1Sequence aSN1Sequence = (ASN1Sequence) aSN1Primitive;
            String str6 = str + TAB;
            int size = aSN1Sequence.size();
            while (i15 < size) {
                _dumpAsString(str6, z15, aSN1Sequence.getObjectAt(i15).toASN1Primitive(), sb5);
                i15++;
            }
            return;
        }
        if (aSN1Primitive instanceof ASN1Set) {
            if (aSN1Primitive instanceof BERSet) {
                str4 = "BER Set";
            } else {
                str4 = aSN1Primitive instanceof DERSet ? "DER Set" : "Set";
            }
            sb5.append(str4);
            sb5.append(strLineSeparator);
            ASN1Set aSN1Set = (ASN1Set) aSN1Primitive;
            String str7 = str + TAB;
            int size2 = aSN1Set.size();
            while (i15 < size2) {
                _dumpAsString(str7, z15, aSN1Set.getObjectAt(i15).toASN1Primitive(), sb5);
                i15++;
            }
            return;
        }
        if (aSN1Primitive instanceof ASN1TaggedObject) {
            if (aSN1Primitive instanceof BERTaggedObject) {
                str3 = "BER Tagged ";
            } else {
                str3 = aSN1Primitive instanceof DERTaggedObject ? "DER Tagged " : "Tagged ";
            }
            sb5.append(str3);
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Primitive;
            sb5.append(ASN1Util.getTagText(aSN1TaggedObject));
            if (!aSN1TaggedObject.isExplicit()) {
                sb5.append(" IMPLICIT");
            }
            sb5.append(strLineSeparator);
            _dumpAsString(str + TAB, z15, aSN1TaggedObject.getBaseObject().toASN1Primitive(), sb5);
            return;
        }
        if (aSN1Primitive instanceof ASN1ObjectIdentifier) {
            sb5.append("ObjectIdentifier(" + ((ASN1ObjectIdentifier) aSN1Primitive).getId() + ")" + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1RelativeOID) {
            sb5.append("RelativeOID(" + ((ASN1RelativeOID) aSN1Primitive).getId() + ")" + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1Boolean) {
            sb5.append("Boolean(" + ((ASN1Boolean) aSN1Primitive).isTrue() + ")" + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1Integer) {
            sb5.append("Integer(" + ((ASN1Integer) aSN1Primitive).getValue() + ")" + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1OctetString) {
            ASN1OctetString aSN1OctetString = (ASN1OctetString) aSN1Primitive;
            sb5.append(aSN1Primitive instanceof BEROctetString ? "BER Constructed Octet String[" : "DER Octet String[");
            sb5.append(aSN1OctetString.getOctetsLength() + "]" + strLineSeparator);
            if (z15) {
                dumpBinaryDataAsString(sb5, str, aSN1OctetString.getOctets());
                return;
            }
            return;
        }
        if (aSN1Primitive instanceof ASN1BitString) {
            ASN1BitString aSN1BitString = (ASN1BitString) aSN1Primitive;
            if (aSN1BitString instanceof DERBitString) {
                str2 = "DER Bit String[";
            } else {
                str2 = aSN1BitString instanceof DLBitString ? "DL Bit String[" : "BER Bit String[";
            }
            sb5.append(str2);
            sb5.append(aSN1BitString.getBytesLength() + ", " + aSN1BitString.getPadBits() + "]" + strLineSeparator);
            if (z15) {
                dumpBinaryDataAsString(sb5, str, aSN1BitString.getBytes());
                return;
            }
            return;
        }
        if (aSN1Primitive instanceof ASN1IA5String) {
            sb5.append("IA5String(" + ((ASN1IA5String) aSN1Primitive).getString() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1UTF8String) {
            sb5.append("UTF8String(" + ((ASN1UTF8String) aSN1Primitive).getString() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1NumericString) {
            sb5.append("NumericString(" + ((ASN1NumericString) aSN1Primitive).getString() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1PrintableString) {
            sb5.append("PrintableString(" + ((ASN1PrintableString) aSN1Primitive).getString() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1VisibleString) {
            sb5.append("VisibleString(" + ((ASN1VisibleString) aSN1Primitive).getString() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1BMPString) {
            sb5.append("BMPString(" + ((ASN1BMPString) aSN1Primitive).getString() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1T61String) {
            sb5.append("T61String(" + ((ASN1T61String) aSN1Primitive).getString() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1GraphicString) {
            sb5.append("GraphicString(" + ((ASN1GraphicString) aSN1Primitive).getString() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1VideotexString) {
            sb5.append("VideotexString(" + ((ASN1VideotexString) aSN1Primitive).getString() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1UTCTime) {
            sb5.append("UTCTime(" + ((ASN1UTCTime) aSN1Primitive).getTime() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1GeneralizedTime) {
            sb5.append("GeneralizedTime(" + ((ASN1GeneralizedTime) aSN1Primitive).getTime() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1Enumerated) {
            sb5.append("DER Enumerated(" + ((ASN1Enumerated) aSN1Primitive).getValue() + ")" + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1ObjectDescriptor) {
            sb5.append("ObjectDescriptor(" + ((ASN1ObjectDescriptor) aSN1Primitive).getBaseGraphicString().getString() + ") " + strLineSeparator);
            return;
        }
        if (!(aSN1Primitive instanceof ASN1External)) {
            sb5.append(aSN1Primitive.toString() + strLineSeparator);
            return;
        }
        ASN1External aSN1External = (ASN1External) aSN1Primitive;
        sb5.append("External " + strLineSeparator);
        String str8 = str + TAB;
        if (aSN1External.getDirectReference() != null) {
            sb5.append(str8 + "Direct Reference: " + aSN1External.getDirectReference().getId() + strLineSeparator);
        }
        if (aSN1External.getIndirectReference() != null) {
            sb5.append(str8 + "Indirect Reference: " + aSN1External.getIndirectReference().toString() + strLineSeparator);
        }
        if (aSN1External.getDataValueDescriptor() != null) {
            _dumpAsString(str8, z15, aSN1External.getDataValueDescriptor(), sb5);
        }
        sb5.append(str8 + "Encoding: " + aSN1External.getEncoding() + strLineSeparator);
        _dumpAsString(str8, z15, aSN1External.getExternalContent(), sb5);
    }

    private static void appendAscString(StringBuilder sb5, byte[] bArr, int i15, int i16) {
        for (int i17 = i15; i17 != i15 + i16; i17++) {
            byte b15 = bArr[i17];
            if (b15 >= 32 && b15 <= 126) {
                sb5.append((char) b15);
            }
        }
    }

    public static String dumpAsString(Object obj) {
        return dumpAsString(obj, false);
    }

    private static void dumpBinaryDataAsString(StringBuilder sb5, String str, byte[] bArr) {
        if (bArr.length < 1) {
            return;
        }
        String strLineSeparator = Strings.lineSeparator();
        String str2 = str + TAB;
        for (int i15 = 0; i15 < bArr.length; i15 += 32) {
            int iMin = Math.min(bArr.length - i15, 32);
            sb5.append(str2);
            sb5.append(Hex.toHexString(bArr, i15, iMin));
            for (int i16 = iMin; i16 < 32; i16++) {
                sb5.append("  ");
            }
            sb5.append(TAB);
            appendAscString(sb5, bArr, i15, iMin);
            sb5.append(strLineSeparator);
        }
    }

    public static String dumpAsString(Object obj, boolean z15) {
        ASN1Primitive aSN1Primitive;
        if (obj instanceof ASN1Primitive) {
            aSN1Primitive = (ASN1Primitive) obj;
        } else {
            if (!(obj instanceof ASN1Encodable)) {
                return "unknown object type " + obj.toString();
            }
            aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
        }
        StringBuilder sb5 = new StringBuilder();
        _dumpAsString("", z15, aSN1Primitive, sb5);
        return sb5.toString();
    }
}
