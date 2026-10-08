package org.bouncycastle.oer;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes5.dex */
public class OERInputStream extends FilterInputStream {
    private static final int[] bits = {1, 2, 4, 8, 16, 32, 64, 128};
    private static final int[] bitsR = {128, 64, 32, 16, 8, 4, 2, 1};
    protected PrintWriter debugOutput;
    protected PrintWriter debugStream;
    private int maxByteAllocation;

    /* JADX INFO: renamed from: org.bouncycastle.oer.OERInputStream$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType;

        static {
            int[] iArr = new int[OERDefinition.BaseType.values().length];
            $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType = iArr;
            try {
                iArr[OERDefinition.BaseType.OPAQUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.Switch.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.Supplier.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.SEQ_OF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.SEQ.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.CHOICE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.ENUM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.INT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.OCTET_STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.IA5String.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.UTF8_STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.BIT_STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.NULL.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.EXTENSION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[OERDefinition.BaseType.BOOLEAN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static class Choice extends OERInputStream {
        final int preamble;
        final int tag;
        final int tagClass;

        public Choice(InputStream inputStream) throws IOException {
            int i15;
            super(inputStream);
            int i16 = read();
            this.preamble = i16;
            if (i16 < 0) {
                throw new EOFException("expecting preamble byte of choice");
            }
            this.tagClass = i16 & 192;
            int i17 = i16 & 63;
            if (i17 >= 63) {
                i17 = 0;
                do {
                    i15 = inputStream.read();
                    if (i15 < 0) {
                        throw new EOFException("expecting further tag bytes");
                    }
                    i17 = (i17 << 7) | (i15 & CertificateBody.profileType);
                } while ((i15 & 128) != 0);
            }
            this.tag = i17;
        }

        public int getTag() {
            return this.tag;
        }

        public int getTagClass() {
            return this.tagClass;
        }

        public boolean isApplicationTagClass() {
            return this.tagClass == 64;
        }

        public boolean isContextSpecific() {
            return this.tagClass == 128;
        }

        public boolean isPrivateTagClass() {
            return this.tagClass == 192;
        }

        public boolean isUniversalTagClass() {
            return this.tagClass == 0;
        }

        public String toString() {
            String str;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("CHOICE(");
            int i15 = this.tagClass;
            if (i15 == 0) {
                str = "Universal ";
            } else if (i15 == 64) {
                str = "Application ";
            } else {
                if (i15 != 128) {
                    if (i15 == 192) {
                        str = "Private ";
                    }
                    sb5.append("Tag = " + this.tag);
                    sb5.append(")");
                    return sb5.toString();
                }
                str = "ContextSpecific ";
            }
            sb5.append(str);
            sb5.append("Tag = " + this.tag);
            sb5.append(")");
            return sb5.toString();
        }
    }

    private static final class LengthInfo {
        private final BigInteger length;
        private final boolean shortForm;

        public LengthInfo(BigInteger bigInteger, boolean z15) {
            this.length = bigInteger;
            this.shortForm = z15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int intLength() {
            return BigIntegers.intValueExact(this.length);
        }
    }

    public static class Sequence extends OERInputStream {
        private final boolean extensionFlagSet;
        private final int preamble;
        private final boolean[] valuePresent;

        public Sequence(InputStream inputStream, Element element) throws IOException {
            int i15;
            super(inputStream);
            if (!element.hasPopulatedExtension() && element.getOptionals() <= 0 && !element.hasDefaultChildren()) {
                this.preamble = 0;
                this.extensionFlagSet = false;
                this.valuePresent = null;
                return;
            }
            int i16 = ((FilterInputStream) this).in.read();
            this.preamble = i16;
            if (i16 < 0) {
                throw new EOFException("expecting preamble byte of sequence");
            }
            this.extensionFlagSet = element.hasPopulatedExtension() && (i16 & 128) == 128;
            this.valuePresent = new boolean[element.getChildren().size()];
            int i17 = element.hasPopulatedExtension() ? 6 : 7;
            int i18 = 0;
            for (Element element2 : element.getChildren()) {
                if (element2.getBaseType() != OERDefinition.BaseType.EXTENSION) {
                    if (element2.getBlock() != 0) {
                        return;
                    }
                    if (element2.isExplicit()) {
                        i15 = i18 + 1;
                        this.valuePresent[i18] = true;
                    } else {
                        if (i17 < 0) {
                            i16 = inputStream.read();
                            if (i16 < 0) {
                                throw new EOFException("expecting mask byte sequence");
                            }
                            i17 = 7;
                        }
                        i15 = i18 + 1;
                        this.valuePresent[i18] = (OERInputStream.bits[i17] & i16) > 0;
                        i17--;
                    }
                    i18 = i15;
                }
            }
        }

        public boolean hasExtension() {
            return this.extensionFlagSet;
        }

        public boolean hasOptional(int i15) {
            return this.valuePresent[i15];
        }

        public String toString() {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("SEQ(");
            sb5.append(hasExtension() ? "Ext " : "");
            if (this.valuePresent != null) {
                int i15 = 0;
                while (true) {
                    boolean[] zArr = this.valuePresent;
                    if (i15 >= zArr.length) {
                        break;
                    }
                    sb5.append(zArr[i15] ? "1" : d.f37012h1);
                    i15++;
                }
            } else {
                sb5.append("*");
            }
            sb5.append(")");
            return sb5.toString();
        }
    }

    public OERInputStream(InputStream inputStream) {
        super(inputStream);
        this.debugOutput = null;
        this.maxByteAllocation = PKIFailureInfo.badCertTemplate;
        this.debugStream = null;
    }

    private ASN1Encodable absent(Element element) {
        debugPrint(element + "Absent");
        return OEROptional.ABSENT;
    }

    private byte[] allocateArray(int i15) {
        if (i15 <= this.maxByteAllocation) {
            return new byte[i15];
        }
        throw new IllegalArgumentException("required byte array size " + i15 + " was greater than " + this.maxByteAllocation);
    }

    private int countOptionalChildTypes(Element element) {
        Iterator<Element> it = element.getChildren().iterator();
        int i15 = 0;
        while (it.hasNext()) {
            i15 += !it.next().isExplicit() ? 1 : 0;
        }
        return i15;
    }

    public static ASN1Encodable parse(byte[] bArr, Element element) {
        return new OERInputStream(new ByteArrayInputStream(bArr)).parse(element);
    }

    public Choice choice() {
        return new Choice(this);
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

    public BigInteger enumeration() throws IOException {
        int i15 = read();
        if (i15 == -1) {
            throw new EOFException("expecting prefix of enumeration");
        }
        if ((i15 & 128) != 128) {
            return BigInteger.valueOf(i15);
        }
        int i16 = i15 & CertificateBody.profileType;
        if (i16 == 0) {
            return BigInteger.ZERO;
        }
        byte[] bArr = new byte[i16];
        if (Streams.readFully(this, bArr) == i16) {
            return new BigInteger(1, bArr);
        }
        throw new EOFException("unable to fully read integer component of enumeration");
    }

    public BigInteger int16() {
        return parseInt(false, 2);
    }

    public BigInteger int32() {
        return parseInt(false, 4);
    }

    public BigInteger int64() {
        return parseInt(false, 8);
    }

    public BigInteger int8() {
        return parseInt(false, 1);
    }

    public BigInteger parseInt(boolean z15, int i15) {
        byte[] bArr = new byte[i15];
        if (Streams.readFully(this, bArr) == i15) {
            return z15 ? new BigInteger(1, bArr) : new BigInteger(bArr);
        }
        throw new IllegalStateException("integer not fully read");
    }

    protected ASN1Encodable parseOpenType(Element element) throws Throwable {
        byte[] bArrAllocateArray = allocateArray(readLength().intLength());
        if (Streams.readFully(((FilterInputStream) this).in, bArrAllocateArray) != bArrAllocateArray.length) {
            throw new IOException("did not fully read open type as raw bytes");
        }
        OERInputStream oERInputStream = null;
        try {
            OERInputStream oERInputStream2 = new OERInputStream(new ByteArrayInputStream(bArrAllocateArray));
            try {
                ASN1Object aSN1Object = oERInputStream2.parse(element);
                oERInputStream2.close();
                return aSN1Object;
            } catch (Throwable th4) {
                th = th4;
                oERInputStream = oERInputStream2;
                if (oERInputStream != null) {
                    oERInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public LengthInfo readLength() throws IOException {
        int i15 = read();
        if (i15 == -1) {
            throw new EOFException("expecting length");
        }
        if ((i15 & 128) == 0) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Len (Short form): ");
            int i16 = i15 & CertificateBody.profileType;
            sb5.append(i16);
            debugPrint(sb5.toString());
            return new LengthInfo(BigInteger.valueOf(i16), true);
        }
        int i17 = i15 & CertificateBody.profileType;
        byte[] bArr = new byte[i17];
        if (Streams.readFully(this, bArr) != i17) {
            throw new EOFException("did not read all bytes of length definition");
        }
        debugPrint("Len (Long Form): " + i17 + " actual len: " + Hex.toHexString(bArr));
        return new LengthInfo(BigIntegers.fromUnsignedByteArray(bArr), false);
    }

    public BigInteger uint16() {
        return parseInt(true, 2);
    }

    public BigInteger uint32() {
        return parseInt(true, 4);
    }

    public BigInteger uint64() {
        return parseInt(false, 8);
    }

    public BigInteger uint8() {
        return parseInt(true, 1);
    }

    public OERInputStream(InputStream inputStream, int i15) {
        super(inputStream);
        this.debugOutput = null;
        this.debugStream = null;
        this.maxByteAllocation = i15;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02a8 A[PHI: r2
      0x02a8: PHI (r2v19 byte[]) = (r2v18 byte[]), (r2v20 byte[]) binds: [B:99:0x02a6, B:95:0x028c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:148:0x0433  */
    /* JADX WARN: Code duplicated, block: B:163:0x046c  */
    /* JADX WARN: Code duplicated, block: B:165:0x0481  */
    /* JADX WARN: Code duplicated, block: B:171:0x0494  */
    /* JADX WARN: Code duplicated, block: B:172:0x049b  */
    /* JADX WARN: Code duplicated, block: B:174:0x049e  */
    /* JADX WARN: Code duplicated, block: B:176:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:179:0x04b7 A[LOOP:4: B:177:0x04b3->B:179:0x04b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:180:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:185:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:187:0x04da  */
    /* JADX WARN: Code duplicated, block: B:191:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:223:0x04e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x04dd A[SYNTHETIC] */
    public ASN1Object parse(Element element) throws Throwable {
        byte[] bArrAllocateArray;
        int length;
        Element element2;
        ASN1Encodable openType;
        int iIntLength;
        Element elementResult;
        ASN1Encodable defaultValue;
        byte[] bArrAllocateArray2;
        BigInteger bigInteger;
        int i15 = 8;
        switch (AnonymousClass1.$SwitchMap$org$bouncycastle$oer$OERDefinition$BaseType[element.getBaseType().ordinal()]) {
            case 1:
                return parse(new Element(element.resolveSupplier().build(), element));
            case 2:
                throw new IllegalStateException("A switch element should only be found within a sequence.");
            case 3:
                return parse(new Element(element.getElementSupplier().build(), element));
            case 4:
                byte[] bArrAllocateArray3 = allocateArray(readLength().intLength());
                if (Streams.readFully(this, bArrAllocateArray3) != bArrAllocateArray3.length) {
                    throw new IOException("could not read all of count of seq-of values");
                }
                int iIntValue = BigIntegers.fromUnsignedByteArray(bArrAllocateArray3).intValue();
                debugPrint(element + "(len = " + iIntValue + ")");
                ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                if (element.getChildren().get(0).getaSwitch() != null) {
                    throw new IllegalStateException("element def for item in SEQ OF has a switch, switches only supported in sequences");
                }
                for (int i16 = 0; i16 < iIntValue; i16++) {
                    aSN1EncodableVector.add(parse(Element.expandDeferredDefinition(element.getChildren().get(0), element)));
                }
                return new DERSequence(aSN1EncodableVector);
            case 5:
                Sequence sequence = new Sequence(((FilterInputStream) this).in, element);
                debugPrint(element + sequence.toString());
                ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
                List<Element> children = element.getChildren();
                int i17 = 0;
                while (i17 < children.size()) {
                    Element element3 = children.get(i17);
                    if (element3.getBaseType() != OERDefinition.BaseType.EXTENSION) {
                        if (element3.getBlock() > 0) {
                            if (sequence.extensionFlagSet) {
                                bArrAllocateArray = allocateArray(readLength().intLength());
                                if (Streams.readFully(((FilterInputStream) this).in, bArrAllocateArray) == bArrAllocateArray.length) {
                                    throw new IOException("did not fully read presence list.");
                                }
                                length = (bArrAllocateArray.length * 8) - bArrAllocateArray[0];
                                while (true) {
                                    if (i17 >= children.size() || i15 < length) {
                                        if (i17 < children.size()) {
                                            element2 = children.get(i17);
                                        } else {
                                            element2 = null;
                                        }
                                        if (element2 == null) {
                                            if (i15 >= length && (bArrAllocateArray[i15 / 8] & bitsR[i15 % 8]) != 0) {
                                                openType = parseOpenType(element2);
                                            } else {
                                                if (element2.isExplicit()) {
                                                    throw new IOException("extension is marked as explicit but is not defined in presence list");
                                                }
                                                openType = OEROptional.ABSENT;
                                            }
                                            aSN1EncodableVector2.add(openType);
                                        } else if ((bArrAllocateArray[i15 / 8] & bitsR[i15 % 8]) != 0) {
                                            iIntLength = readLength().intLength();
                                            while (true) {
                                                iIntLength--;
                                                if (iIntLength >= 0) {
                                                    ((FilterInputStream) this).in.read();
                                                }
                                            }
                                        }
                                        i15++;
                                        i17++;
                                    }
                                }
                            }
                            return new DERSequence(aSN1EncodableVector2);
                        }
                        Element elementExpandDeferredDefinition = Element.expandDeferredDefinition(element3, element);
                        if (elementExpandDeferredDefinition.getaSwitch() != null) {
                            elementResult = elementExpandDeferredDefinition.getaSwitch().result(new SwitchIndexer.Asn1EncodableVectorIndexer(aSN1EncodableVector2));
                            if (elementResult.getParent() != element) {
                                elementResult = new Element(elementResult, element);
                            }
                        } else {
                            elementResult = elementExpandDeferredDefinition;
                        }
                        if (sequence.valuePresent == null) {
                            defaultValue = parse(elementResult);
                        } else if (!sequence.valuePresent[i17]) {
                            defaultValue = elementResult.getDefaultValue() != null ? elementExpandDeferredDefinition.getDefaultValue() : absent(elementExpandDeferredDefinition);
                        } else if (elementResult.isExplicit()) {
                            defaultValue = parse(elementResult);
                        } else {
                            defaultValue = OEROptional.getInstance(parse(elementResult));
                        }
                        aSN1EncodableVector2.add(defaultValue);
                    }
                    i17++;
                }
                if (sequence.extensionFlagSet) {
                    bArrAllocateArray = allocateArray(readLength().intLength());
                    if (Streams.readFully(((FilterInputStream) this).in, bArrAllocateArray) == bArrAllocateArray.length) {
                        throw new IOException("did not fully read presence list.");
                    }
                    length = (bArrAllocateArray.length * 8) - bArrAllocateArray[0];
                    while (true) {
                        if (i17 >= children.size()) {
                        }
                        if (i17 < children.size()) {
                            element2 = children.get(i17);
                        } else {
                            element2 = null;
                        }
                        if (element2 == null) {
                            if (i15 >= length) {
                                if (element2.isExplicit()) {
                                    throw new IOException("extension is marked as explicit but is not defined in presence list");
                                }
                                openType = OEROptional.ABSENT;
                            } else {
                                if (element2.isExplicit()) {
                                    throw new IOException("extension is marked as explicit but is not defined in presence list");
                                }
                                openType = OEROptional.ABSENT;
                            }
                            aSN1EncodableVector2.add(openType);
                        } else if ((bArrAllocateArray[i15 / 8] & bitsR[i15 % 8]) != 0) {
                            iIntLength = readLength().intLength();
                            while (true) {
                                iIntLength--;
                                if (iIntLength >= 0) {
                                    ((FilterInputStream) this).in.read();
                                }
                            }
                        }
                        i15++;
                        i17++;
                    }
                }
                return new DERSequence(aSN1EncodableVector2);
            case 6:
                Choice choice = choice();
                debugPrint(choice.toString() + " " + choice.tag);
                if (!choice.isContextSpecific()) {
                    if (choice.isApplicationTagClass()) {
                        throw new IllegalStateException("Unimplemented tag type");
                    }
                    if (choice.isPrivateTagClass()) {
                        throw new IllegalStateException("Unimplemented tag type");
                    }
                    if (choice.isUniversalTagClass()) {
                        throw new IllegalStateException("Unimplemented tag type");
                    }
                    throw new IllegalStateException("Unimplemented tag type");
                }
                Element elementExpandDeferredDefinition2 = Element.expandDeferredDefinition(element.getChildren().get(choice.getTag()), element);
                if (elementExpandDeferredDefinition2.getBlock() > 0) {
                    debugPrint("Chosen (Ext): " + elementExpandDeferredDefinition2);
                    return new DERTaggedObject(choice.tag, parseOpenType(elementExpandDeferredDefinition2));
                }
                debugPrint("Chosen: " + elementExpandDeferredDefinition2);
                return new DERTaggedObject(choice.tag, parse(elementExpandDeferredDefinition2));
            case 7:
                BigInteger bigIntegerEnumeration = enumeration();
                debugPrint(element + "ENUM(" + bigIntegerEnumeration + ") = " + element.getChildren().get(bigIntegerEnumeration.intValue()).getLabel());
                return new ASN1Enumerated(bigIntegerEnumeration);
            case 8:
                int iIntBytesForRange = element.intBytesForRange();
                if (iIntBytesForRange != 0) {
                    bArrAllocateArray2 = allocateArray(Math.abs(iIntBytesForRange));
                    Streams.readFully(this, bArrAllocateArray2);
                    bigInteger = iIntBytesForRange < 0 ? new BigInteger(bArrAllocateArray2) : BigIntegers.fromUnsignedByteArray(bArrAllocateArray2);
                } else if (element.isLowerRangeZero()) {
                    bArrAllocateArray2 = allocateArray(readLength().intLength());
                    Streams.readFully(this, bArrAllocateArray2);
                    if (bArrAllocateArray2.length == 0) {
                        bigInteger = BigInteger.ZERO;
                    } else {
                        bigInteger = new BigInteger(1, bArrAllocateArray2);
                    }
                } else {
                    bArrAllocateArray2 = allocateArray(readLength().intLength());
                    Streams.readFully(this, bArrAllocateArray2);
                    if (bArrAllocateArray2.length == 0) {
                        bigInteger = BigInteger.ZERO;
                    } else {
                        bigInteger = new BigInteger(bArrAllocateArray2);
                    }
                }
                if (this.debugOutput != null) {
                    debugPrint(element + "INTEGER byteLen= " + bArrAllocateArray2.length + " hex= " + bigInteger.toString(16) + ")");
                }
                return new ASN1Integer(bigInteger);
            case 9:
                int iIntLength2 = (element.getUpperBound() == null || !element.getUpperBound().equals(element.getLowerBound())) ? readLength().intLength() : element.getUpperBound().intValue();
                byte[] bArrAllocateArray4 = allocateArray(iIntLength2);
                if (Streams.readFully(this, bArrAllocateArray4) != iIntLength2) {
                    throw new IOException("did not read all of " + element.getLabel());
                }
                if (this.debugOutput != null) {
                    int iMin = Math.min(bArrAllocateArray4.length, 32);
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(element);
                    sb5.append("OCTET STRING (");
                    sb5.append(bArrAllocateArray4.length);
                    sb5.append(") = ");
                    sb5.append(Hex.toHexString(bArrAllocateArray4, 0, iMin));
                    sb5.append(" ");
                    sb5.append(bArrAllocateArray4.length > 32 ? "..." : "");
                    debugPrint(sb5.toString());
                }
                return new DEROctetString(bArrAllocateArray4);
            case 10:
                byte[] bArrAllocateArray5 = allocateArray(element.isFixedLength() ? element.getUpperBound().intValue() : readLength().intLength());
                if (Streams.readFully(this, bArrAllocateArray5) != bArrAllocateArray5.length) {
                    throw new IOException("could not read all of IA5 string");
                }
                String strFromByteArray = Strings.fromByteArray(bArrAllocateArray5);
                if (this.debugOutput != null) {
                    debugPrint(element.appendLabel("IA5 String (" + bArrAllocateArray5.length + ") = " + strFromByteArray));
                }
                return new DERIA5String(strFromByteArray);
            case 11:
                byte[] bArrAllocateArray6 = allocateArray(readLength().intLength());
                if (Streams.readFully(this, bArrAllocateArray6) != bArrAllocateArray6.length) {
                    throw new IOException("could not read all of utf 8 string");
                }
                String strFromUTF8ByteArray = Strings.fromUTF8ByteArray(bArrAllocateArray6);
                if (this.debugOutput != null) {
                    debugPrint(element + "UTF8 String (" + bArrAllocateArray6.length + ") = " + strFromUTF8ByteArray);
                }
                return new DERUTF8String(strFromUTF8ByteArray);
            case 12:
                byte[] bArrAllocateArray7 = element.isFixedLength() ? new byte[element.getLowerBound().intValue() / 8] : allocateArray((BigInteger.ZERO.compareTo(element.getUpperBound()) > 0 ? element.getUpperBound().intValue() : readLength().intLength()) / 8);
                Streams.readFully(this, bArrAllocateArray7);
                if (this.debugOutput != null) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("BIT STRING(" + (bArrAllocateArray7.length * 8) + ") = ");
                    for (int i18 = 0; i18 != bArrAllocateArray7.length; i18++) {
                        byte b15 = bArrAllocateArray7[i18];
                        for (int i19 = 0; i19 < 8; i19++) {
                            stringBuffer.append((b15 & 128) > 0 ? "1" : d.f37012h1);
                            b15 = (byte) (b15 << 1);
                        }
                    }
                    debugPrint(element + stringBuffer.toString());
                }
                return new DERBitString(bArrAllocateArray7);
            case 13:
                debugPrint(element + "NULL");
                return DERNull.INSTANCE;
            case 14:
                LengthInfo length2 = readLength();
                byte[] bArr = new byte[length2.intLength()];
                if (Streams.readFully(this, bArr) != length2.intLength()) {
                    throw new IOException("could not read all of count of open value in choice (...) ");
                }
                debugPrint("ext " + length2.intLength() + " " + Hex.toHexString(bArr));
                return new DEROctetString(bArr);
            case 15:
                return read() == 0 ? ASN1Boolean.FALSE : ASN1Boolean.TRUE;
            default:
                throw new IllegalStateException("Unhandled type " + element.getBaseType());
        }
    }
}
