package org.bouncycastle.oer;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes5.dex */
public class OEROutputStream extends OutputStream {
    private static final int[] bits = {1, 2, 4, 8, 16, 32, 64, 128};
    protected PrintWriter debugOutput = null;
    private final OutputStream out;

    /* JADX INFO: renamed from: org.bouncycastle.oer.OEROutputStream$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType;

        static {
            int[] iArr = new int[OERDefinition.BaseType.values().length];
            $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType = iArr;
            try {
                iArr[OERDefinition.BaseType.Supplier.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.SEQ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.SEQ_OF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.CHOICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.ENUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.INT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.OCTET_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.IA5String.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.UTF8_STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.BIT_STRING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.NULL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.EXTENSION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.ENUM_ITEM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.BOOLEAN.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public OEROutputStream(OutputStream outputStream) {
        this.out = outputStream;
    }

    public static int byteLength(long j15) {
        int i15 = 8;
        while (i15 > 0 && ((-72057594037927936L) & j15) == 0) {
            j15 <<= 8;
            i15--;
        }
        return i15;
    }

    private void encodeLength(long j15) throws IOException {
        if (j15 <= 127) {
            this.out.write((int) j15);
            return;
        }
        byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray(BigInteger.valueOf(j15));
        this.out.write(bArrAsUnsignedByteArray.length | 128);
        this.out.write(bArrAsUnsignedByteArray);
    }

    private void encodeQuantity(long j15) throws IOException {
        byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray(BigInteger.valueOf(j15));
        this.out.write(bArrAsUnsignedByteArray.length);
        this.out.write(bArrAsUnsignedByteArray);
    }

    protected void debugPrint(String str) {
        if (this.debugOutput == null) {
            return;
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int i15 = -1;
        for (int i16 = 0; i16 != stackTrace.length; i16++) {
            StackTraceElement stackTraceElement = stackTrace[i16];
            if (stackTraceElement.getMethodName().equals("debugPrint")) {
                i15 = 0;
            } else if (stackTraceElement.getClassName().contains("OERInput")) {
                i15++;
            }
        }
        while (true) {
            PrintWriter printWriter = this.debugOutput;
            if (i15 <= 0) {
                printWriter.append((CharSequence) str).append((CharSequence) "\n");
                this.debugOutput.flush();
                return;
            } else {
                printWriter.append((CharSequence) "    ");
                i15--;
            }
        }
    }

    @Override // java.io.OutputStream
    public void write(int i15) throws IOException {
        this.out.write(i15);
    }

    public void writePlainType(ASN1Encodable aSN1Encodable, Element element) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OEROutputStream oEROutputStream = new OEROutputStream(byteArrayOutputStream);
        oEROutputStream.write(aSN1Encodable, element);
        oEROutputStream.flush();
        oEROutputStream.close();
        encodeLength(byteArrayOutputStream.size());
        write(byteArrayOutputStream.toByteArray());
    }

    /* JADX WARN: Code duplicated, block: B:209:0x0484  */
    /* JADX WARN: Code duplicated, block: B:213:0x0494  */
    /* JADX WARN: Code duplicated, block: B:216:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:219:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:221:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:227:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:230:0x04de  */
    /* JADX WARN: Code duplicated, block: B:233:0x04ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:234:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:237:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:242:0x0511  */
    /* JADX WARN: Code duplicated, block: B:245:0x051f  */
    /* JADX WARN: Code duplicated, block: B:246:0x0523  */
    /* JADX WARN: Code duplicated, block: B:250:0x0534  */
    /* JADX WARN: Code duplicated, block: B:252:0x053a  */
    /* JADX WARN: Code duplicated, block: B:277:0x04dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x04d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x050a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x0553 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public void write(ASN1Encodable aSN1Encodable, Element element) {
        boolean z15;
        int i15;
        List<Element> children;
        int i16;
        ByteArrayOutputStream byteArrayOutputStream;
        int i17;
        int i18;
        int i19;
        Element elementResult;
        ASN1Encodable objectAt;
        int i25;
        Enumeration objects;
        int size;
        String str;
        byte[] bArrLongToBigEndian;
        if (aSN1Encodable == OEROptional.ABSENT) {
            return;
        }
        if (aSN1Encodable instanceof OEROptional) {
            write(((OEROptional) aSN1Encodable).get(), element);
            return;
        }
        ASN1Primitive aSN1Primitive = aSN1Encodable.toASN1Primitive();
        int i26 = 6;
        switch (AnonymousClass1.$SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[element.getBaseType().ordinal()]) {
            case 1:
                write(aSN1Primitive, element.getElementSupplier().build());
                return;
            case 2:
                ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(aSN1Primitive);
                if (element.isExtensionsInDefinition()) {
                    int i27 = 0;
                    while (true) {
                        if (i27 < element.getChildren().size()) {
                            Element element2 = element.getChildren().get(i27);
                            if (element2.getBaseType() != OERDefinition.BaseType.EXTENSION) {
                                if (element2.getBlock() <= 0 || i27 >= aSN1Sequence.size() || OEROptional.ABSENT.equals(aSN1Sequence.getObjectAt(i27))) {
                                    i27++;
                                } else {
                                    z15 = true;
                                }
                            }
                        }
                        z15 = false;
                    }
                    i15 = z15 ? bits[7] : 0;
                } else {
                    i26 = 7;
                    z15 = false;
                    i15 = 0;
                }
                for (int i28 = 0; i28 < element.getChildren().size(); i28++) {
                    Element element3 = element.getChildren().get(i28);
                    if (element3.getBaseType() != OERDefinition.BaseType.EXTENSION) {
                        if (element3.getBlock() > 0) {
                            if (i26 != 7) {
                                this.out.write(i15);
                            }
                            children = element.getChildren();
                            i16 = 0;
                            while (i16 < children.size()) {
                                elementResult = element.getChildren().get(i16);
                                if (elementResult.getBaseType() != OERDefinition.BaseType.EXTENSION) {
                                    if (elementResult.getBlock() > 0) {
                                        if (z15) {
                                            byteArrayOutputStream = new ByteArrayOutputStream();
                                            i17 = 7;
                                            i19 = 0;
                                            for (i18 = i16; i18 < children.size(); i18++) {
                                                if (i17 < 0) {
                                                    byteArrayOutputStream.write(i19);
                                                    i17 = 7;
                                                    i19 = 0;
                                                }
                                                if (i18 >= aSN1Sequence.size() && !OEROptional.ABSENT.equals(aSN1Sequence.getObjectAt(i18))) {
                                                    i19 |= bits[i17];
                                                }
                                                i17--;
                                            }
                                            if (i17 != 7) {
                                                byteArrayOutputStream.write(i19);
                                            }
                                            encodeLength(byteArrayOutputStream.size() + 1);
                                            if (i17 == 7) {
                                                write(0);
                                            } else {
                                                write(i17 + 1);
                                            }
                                            write(byteArrayOutputStream.toByteArray());
                                            while (i16 < children.size()) {
                                                if (i16 >= aSN1Sequence.size() && !OEROptional.ABSENT.equals(aSN1Sequence.getObjectAt(i16))) {
                                                    writePlainType(aSN1Sequence.getObjectAt(i16), children.get(i16));
                                                }
                                                i16++;
                                            }
                                        }
                                        this.out.flush();
                                        debugPrint(element.appendLabel(""));
                                        return;
                                    }
                                    objectAt = aSN1Sequence.getObjectAt(i16);
                                    if (elementResult.getaSwitch() != null) {
                                        elementResult = elementResult.getaSwitch().result(new SwitchIndexer.Asn1SequenceIndexer(aSN1Sequence));
                                    }
                                    if (elementResult.getDefaultValue() != null || !elementResult.getDefaultValue().equals(objectAt)) {
                                        write(objectAt, elementResult);
                                    }
                                }
                                i16++;
                            }
                            if (z15) {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                i17 = 7;
                                i19 = 0;
                                while (i18 < children.size()) {
                                    if (i17 < 0) {
                                        byteArrayOutputStream.write(i19);
                                        i17 = 7;
                                        i19 = 0;
                                    }
                                    if (i18 >= aSN1Sequence.size()) {
                                    }
                                    i17--;
                                }
                                if (i17 != 7) {
                                    byteArrayOutputStream.write(i19);
                                }
                                encodeLength(byteArrayOutputStream.size() + 1);
                                if (i17 == 7) {
                                    write(0);
                                } else {
                                    write(i17 + 1);
                                }
                                write(byteArrayOutputStream.toByteArray());
                                while (i16 < children.size()) {
                                    if (i16 >= aSN1Sequence.size()) {
                                    }
                                    i16++;
                                }
                            }
                            this.out.flush();
                            debugPrint(element.appendLabel(""));
                            return;
                        }
                        Element elementExpandDeferredDefinition = Element.expandDeferredDefinition(element3, element);
                        if (element.getaSwitch() != null) {
                            elementExpandDeferredDefinition = Element.expandDeferredDefinition(element.getaSwitch().result(new SwitchIndexer.Asn1SequenceIndexer(aSN1Sequence)), element);
                        }
                        if (i26 < 0) {
                            this.out.write(i15);
                            i26 = 7;
                            i15 = 0;
                        }
                        ASN1Encodable objectAt2 = aSN1Sequence.getObjectAt(i28);
                        if (elementExpandDeferredDefinition.isExplicit() && (objectAt2 instanceof OEROptional)) {
                            throw new IllegalStateException("absent sequence element that is required by oer definition");
                        }
                        if (!elementExpandDeferredDefinition.isExplicit()) {
                            ASN1Encodable objectAt3 = aSN1Sequence.getObjectAt(i28);
                            if (elementExpandDeferredDefinition.getDefaultValue() != null) {
                                if (objectAt3 instanceof OEROptional) {
                                    OEROptional oEROptional = (OEROptional) objectAt3;
                                    if (oEROptional.isDefined() && !oEROptional.get().equals(elementExpandDeferredDefinition.getDefaultValue())) {
                                        i25 = bits[i26];
                                        i15 |= i25;
                                    }
                                } else if (!elementExpandDeferredDefinition.getDefaultValue().equals(objectAt3)) {
                                    i25 = bits[i26];
                                    i15 |= i25;
                                }
                            } else if (objectAt2 != OEROptional.ABSENT) {
                                i25 = bits[i26];
                                i15 |= i25;
                            }
                            i26--;
                        }
                    }
                }
                if (i26 != 7) {
                    this.out.write(i15);
                }
                children = element.getChildren();
                i16 = 0;
                while (i16 < children.size()) {
                    elementResult = element.getChildren().get(i16);
                    if (elementResult.getBaseType() != OERDefinition.BaseType.EXTENSION) {
                        if (elementResult.getBlock() > 0) {
                            if (z15) {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                i17 = 7;
                                i19 = 0;
                                while (i18 < children.size()) {
                                    if (i17 < 0) {
                                        byteArrayOutputStream.write(i19);
                                        i17 = 7;
                                        i19 = 0;
                                    }
                                    if (i18 >= aSN1Sequence.size()) {
                                    }
                                    i17--;
                                }
                                if (i17 != 7) {
                                    byteArrayOutputStream.write(i19);
                                }
                                encodeLength(byteArrayOutputStream.size() + 1);
                                if (i17 == 7) {
                                    write(0);
                                } else {
                                    write(i17 + 1);
                                }
                                write(byteArrayOutputStream.toByteArray());
                                while (i16 < children.size()) {
                                    if (i16 >= aSN1Sequence.size()) {
                                    }
                                    i16++;
                                }
                            }
                            this.out.flush();
                            debugPrint(element.appendLabel(""));
                            return;
                        }
                        objectAt = aSN1Sequence.getObjectAt(i16);
                        if (elementResult.getaSwitch() != null) {
                            elementResult = elementResult.getaSwitch().result(new SwitchIndexer.Asn1SequenceIndexer(aSN1Sequence));
                        }
                        if (elementResult.getDefaultValue() != null) {
                            write(objectAt, elementResult);
                        } else {
                            write(objectAt, elementResult);
                        }
                    }
                    i16++;
                }
                if (z15) {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    i17 = 7;
                    i19 = 0;
                    while (i18 < children.size()) {
                        if (i17 < 0) {
                            byteArrayOutputStream.write(i19);
                            i17 = 7;
                            i19 = 0;
                        }
                        if (i18 >= aSN1Sequence.size()) {
                        }
                        i17--;
                    }
                    if (i17 != 7) {
                        byteArrayOutputStream.write(i19);
                    }
                    encodeLength(byteArrayOutputStream.size() + 1);
                    if (i17 == 7) {
                        write(0);
                    } else {
                        write(i17 + 1);
                    }
                    write(byteArrayOutputStream.toByteArray());
                    while (i16 < children.size()) {
                        if (i16 >= aSN1Sequence.size()) {
                        }
                        i16++;
                    }
                }
                this.out.flush();
                debugPrint(element.appendLabel(""));
                return;
            case 3:
                if (aSN1Primitive instanceof ASN1Set) {
                    ASN1Set aSN1Set = (ASN1Set) aSN1Primitive;
                    objects = aSN1Set.getObjects();
                    size = aSN1Set.size();
                } else {
                    if (!(aSN1Primitive instanceof ASN1Sequence)) {
                        throw new IllegalStateException("encodable at for SEQ_OF is not a container");
                    }
                    ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Primitive;
                    objects = aSN1Sequence2.getObjects();
                    size = aSN1Sequence2.size();
                }
                encodeQuantity(size);
                Element elementExpandDeferredDefinition2 = Element.expandDeferredDefinition(element.getFirstChid(), element);
                while (objects.hasMoreElements()) {
                    write((ASN1Encodable) objects.nextElement(), elementExpandDeferredDefinition2);
                }
                this.out.flush();
                debugPrint(element.appendLabel(""));
                return;
            case 4:
                ASN1Primitive aSN1Primitive2 = aSN1Primitive.toASN1Primitive();
                BitBuilder bitBuilder = new BitBuilder();
                if (!(aSN1Primitive2 instanceof ASN1TaggedObject)) {
                    throw new IllegalStateException("only support tagged objects");
                }
                ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Primitive2;
                int tagClass = aSN1TaggedObject.getTagClass();
                bitBuilder.writeBit(tagClass & 128).writeBit(tagClass & 64);
                int tagNo = aSN1TaggedObject.getTagNo();
                ASN1Primitive aSN1Primitive3 = aSN1TaggedObject.getBaseObject().toASN1Primitive();
                if (tagNo <= 63) {
                    bitBuilder.writeBits(tagNo, 6);
                } else {
                    bitBuilder.writeBits(255L, 6);
                    bitBuilder.write7BitBytes(tagNo);
                }
                if (this.debugOutput != null) {
                    int tagClass2 = aSN1TaggedObject.getTagClass();
                    if (tagClass2 == 64) {
                        str = "AS";
                    } else if (tagClass2 == 128) {
                        str = "CS";
                    } else if (tagClass2 == 192) {
                        str = "PR";
                    }
                    debugPrint(element.appendLabel(str));
                }
                bitBuilder.writeAndClear(this.out);
                Element elementExpandDeferredDefinition3 = Element.expandDeferredDefinition(element.getChildren().get(tagNo), element);
                if (elementExpandDeferredDefinition3.getBlock() > 0) {
                    writePlainType(aSN1Primitive3, elementExpandDeferredDefinition3);
                } else {
                    write(aSN1Primitive3, elementExpandDeferredDefinition3);
                }
                this.out.flush();
                return;
            case 5:
                BigInteger value = aSN1Primitive instanceof ASN1Integer ? ASN1Integer.getInstance(aSN1Primitive).getValue() : ASN1Enumerated.getInstance(aSN1Primitive).getValue();
                Iterator<Element> it = element.getChildren().iterator();
                while (it.hasNext()) {
                    if (Element.expandDeferredDefinition(it.next(), element).getEnumValue().equals(value)) {
                        if (value.compareTo(BigInteger.valueOf(127L)) > 0) {
                            byte[] byteArray = value.toByteArray();
                            this.out.write((byteArray.length & GF2Field.MASK) | 128);
                            this.out.write(byteArray);
                        } else {
                            this.out.write(value.intValue() & CertificateBody.profileType);
                        }
                        this.out.flush();
                        debugPrint(element.appendLabel(element.rangeExpression()));
                        return;
                    }
                }
                throw new IllegalArgumentException("enum value " + value + " " + Hex.toHexString(value.toByteArray()) + " no in defined child list");
            case 6:
                ASN1Integer aSN1Integer = ASN1Integer.getInstance(aSN1Primitive);
                int iIntBytesForRange = element.intBytesForRange();
                if (iIntBytesForRange > 0) {
                    byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray(iIntBytesForRange, aSN1Integer.getValue());
                    if (iIntBytesForRange != 1 && iIntBytesForRange != 2 && iIntBytesForRange != 4 && iIntBytesForRange != 8) {
                        throw new IllegalStateException("unknown uint length " + iIntBytesForRange);
                    }
                    this.out.write(bArrAsUnsignedByteArray);
                } else if (iIntBytesForRange < 0) {
                    BigInteger value2 = aSN1Integer.getValue();
                    if (iIntBytesForRange == -8) {
                        bArrLongToBigEndian = Pack.longToBigEndian(BigIntegers.longValueExact(value2));
                    } else if (iIntBytesForRange == -4) {
                        bArrLongToBigEndian = Pack.intToBigEndian(BigIntegers.intValueExact(value2));
                    } else if (iIntBytesForRange == -2) {
                        bArrLongToBigEndian = Pack.shortToBigEndian(BigIntegers.shortValueExact(value2));
                    } else {
                        if (iIntBytesForRange != -1) {
                            throw new IllegalStateException("unknown twos compliment length");
                        }
                        bArrLongToBigEndian = new byte[]{BigIntegers.byteValueExact(value2)};
                    }
                    this.out.write(bArrLongToBigEndian);
                } else {
                    boolean zIsLowerRangeZero = element.isLowerRangeZero();
                    BigInteger value3 = aSN1Integer.getValue();
                    byte[] bArrAsUnsignedByteArray2 = zIsLowerRangeZero ? BigIntegers.asUnsignedByteArray(value3) : value3.toByteArray();
                    encodeLength(bArrAsUnsignedByteArray2.length);
                    this.out.write(bArrAsUnsignedByteArray2);
                }
                debugPrint(element.appendLabel(element.rangeExpression()));
                this.out.flush();
                return;
            case 7:
                byte[] octets = ASN1OctetString.getInstance(aSN1Primitive).getOctets();
                if (!element.isFixedLength()) {
                    encodeLength(octets.length);
                }
                this.out.write(octets);
                debugPrint(element.appendLabel(element.rangeExpression()));
                this.out.flush();
                return;
            case 8:
                byte[] octets2 = ASN1IA5String.getInstance(aSN1Primitive).getOctets();
                if (!element.isFixedLength() || element.getUpperBound().intValue() == octets2.length) {
                    if (!element.isFixedLength()) {
                        encodeLength(octets2.length);
                    }
                    this.out.write(octets2);
                    debugPrint(element.appendLabel(""));
                    this.out.flush();
                    return;
                }
                throw new IOException("IA5String string length does not equal declared fixed length " + octets2.length + " " + element.getUpperBound());
            case 9:
                byte[] uTF8ByteArray = Strings.toUTF8ByteArray(ASN1UTF8String.getInstance(aSN1Primitive).getString());
                encodeLength(uTF8ByteArray.length);
                this.out.write(uTF8ByteArray);
                debugPrint(element.appendLabel(""));
                this.out.flush();
                return;
            case 10:
                ASN1BitString aSN1BitString = ASN1BitString.getInstance(aSN1Primitive);
                byte[] bytes = aSN1BitString.getBytes();
                if (!element.isFixedLength()) {
                    int padBits = aSN1BitString.getPadBits();
                    encodeLength(bytes.length + 1);
                    this.out.write(padBits);
                }
                this.out.write(bytes);
                debugPrint(element.appendLabel(element.rangeExpression()));
                this.out.flush();
                return;
            case 11:
            case 13:
            default:
                return;
            case 12:
                byte[] octets3 = ASN1OctetString.getInstance(aSN1Primitive).getOctets();
                if (!element.isFixedLength()) {
                    encodeLength(octets3.length);
                }
                this.out.write(octets3);
                debugPrint(element.appendLabel(element.rangeExpression()));
                this.out.flush();
                return;
            case 14:
                debugPrint(element.getLabel());
                if (ASN1Boolean.getInstance(aSN1Primitive).isTrue()) {
                    this.out.write(GF2Field.MASK);
                } else {
                    this.out.write(0);
                }
                this.out.flush();
                return;
        }
    }
}
