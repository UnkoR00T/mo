package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes3.dex */
public class ASN1InputStream extends FilterInputStream implements BERTags {
    private final boolean lazyEvaluate;
    private final int limit;
    private final byte[][] tmpBuffers;

    public ASN1InputStream(InputStream inputStream) {
        this(inputStream, StreamUtil.findLimit(inputStream));
    }

    static ASN1Primitive createPrimitiveDERObject(int i15, DefiniteLengthInputStream definiteLengthInputStream, byte[][] bArr) throws IOException {
        try {
            switch (i15) {
                case 1:
                    return ASN1Boolean.createPrimitive(getBuffer(definiteLengthInputStream, bArr));
                case 2:
                    return ASN1Integer.createPrimitive(definiteLengthInputStream.toByteArray());
                case 3:
                    return ASN1BitString.createPrimitive(definiteLengthInputStream.toByteArray());
                case 4:
                    return ASN1OctetString.createPrimitive(definiteLengthInputStream.toByteArray());
                case 5:
                    ASN1Null.checkContentsLength(definiteLengthInputStream.getRemaining());
                    return ASN1Null.createPrimitive();
                case 6:
                    ASN1ObjectIdentifier.checkContentsLength(definiteLengthInputStream.getRemaining());
                    return ASN1ObjectIdentifier.createPrimitive(getBuffer(definiteLengthInputStream, bArr), true);
                case 7:
                    return ASN1ObjectDescriptor.createPrimitive(definiteLengthInputStream.toByteArray());
                case 8:
                case 9:
                case 11:
                case 15:
                case 16:
                case 17:
                case 29:
                default:
                    throw new IOException("unknown tag " + i15 + " encountered");
                case 10:
                    return ASN1Enumerated.createPrimitive(getBuffer(definiteLengthInputStream, bArr), true);
                case 12:
                    return ASN1UTF8String.createPrimitive(definiteLengthInputStream.toByteArray());
                case 13:
                    ASN1RelativeOID.checkContentsLength(definiteLengthInputStream.getRemaining());
                    return ASN1RelativeOID.createPrimitive(getBuffer(definiteLengthInputStream, bArr), true);
                case 14:
                case BERTags.DATE /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                    throw new IOException("unsupported tag " + i15 + " encountered");
                case 18:
                    return ASN1NumericString.createPrimitive(definiteLengthInputStream.toByteArray());
                case 19:
                    return ASN1PrintableString.createPrimitive(definiteLengthInputStream.toByteArray());
                case 20:
                    return ASN1T61String.createPrimitive(definiteLengthInputStream.toByteArray());
                case 21:
                    return ASN1VideotexString.createPrimitive(definiteLengthInputStream.toByteArray());
                case 22:
                    return ASN1IA5String.createPrimitive(definiteLengthInputStream.toByteArray());
                case 23:
                    return ASN1UTCTime.createPrimitive(definiteLengthInputStream.toByteArray());
                case 24:
                    return ASN1GeneralizedTime.createPrimitive(definiteLengthInputStream.toByteArray());
                case 25:
                    return ASN1GraphicString.createPrimitive(definiteLengthInputStream.toByteArray());
                case 26:
                    return ASN1VisibleString.createPrimitive(definiteLengthInputStream.toByteArray());
                case 27:
                    return ASN1GeneralString.createPrimitive(definiteLengthInputStream.toByteArray());
                case 28:
                    return ASN1UniversalString.createPrimitive(definiteLengthInputStream.toByteArray());
                case 30:
                    return ASN1BMPString.createPrimitive(getBMPCharBuffer(definiteLengthInputStream));
            }
        } catch (IllegalArgumentException e15) {
            throw new ASN1Exception(e15.getMessage(), e15);
        } catch (IllegalStateException e16) {
            throw new ASN1Exception(e16.getMessage(), e16);
        }
    }

    private static char[] getBMPCharBuffer(DefiniteLengthInputStream definiteLengthInputStream) throws IOException {
        int remaining = definiteLengthInputStream.getRemaining();
        if ((remaining & 1) != 0) {
            throw new IOException("malformed BMPString encoding encountered");
        }
        int i15 = remaining / 2;
        char[] cArr = new char[i15];
        byte[] bArr = new byte[8];
        int i16 = 0;
        int i17 = 0;
        while (remaining >= 8) {
            if (Streams.readFully(definiteLengthInputStream, bArr, 0, 8) != 8) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            cArr[i17] = (char) ((bArr[0] << 8) | (bArr[1] & 255));
            cArr[i17 + 1] = (char) ((bArr[2] << 8) | (bArr[3] & 255));
            cArr[i17 + 2] = (char) ((bArr[4] << 8) | (bArr[5] & 255));
            cArr[i17 + 3] = (char) ((bArr[6] << 8) | (bArr[7] & 255));
            i17 += 4;
            remaining -= 8;
        }
        if (remaining > 0) {
            if (Streams.readFully(definiteLengthInputStream, bArr, 0, remaining) != remaining) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            do {
                int i18 = i16 + 1;
                int i19 = bArr[i16] << 8;
                i16 += 2;
                cArr[i17] = (char) ((bArr[i18] & 255) | i19);
                i17++;
            } while (i16 < remaining);
        }
        if (definiteLengthInputStream.getRemaining() == 0 && i15 == i17) {
            return cArr;
        }
        throw new IllegalStateException();
    }

    private static byte[] getBuffer(DefiniteLengthInputStream definiteLengthInputStream, byte[][] bArr) throws IOException {
        int remaining = definiteLengthInputStream.getRemaining();
        if (remaining >= bArr.length) {
            return definiteLengthInputStream.toByteArray();
        }
        byte[] bArr2 = bArr[remaining];
        if (bArr2 == null) {
            bArr2 = new byte[remaining];
            bArr[remaining] = bArr2;
        }
        definiteLengthInputStream.readAllIntoByteArray(bArr2);
        return bArr2;
    }

    static int readTagNumber(InputStream inputStream, int i15) throws IOException {
        int i16 = i15 & 31;
        if (i16 != 31) {
            return i16;
        }
        int i17 = inputStream.read();
        if (i17 < 31) {
            if (i17 < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            throw new IOException("corrupted stream - high tag number < 31 found");
        }
        int i18 = i17 & CertificateBody.profileType;
        if (i18 == 0) {
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        while ((i17 & 128) != 0) {
            if ((i18 >>> 24) != 0) {
                throw new IOException("Tag number more than 31 bits");
            }
            int i19 = i18 << 7;
            int i25 = inputStream.read();
            if (i25 < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            i18 = i19 | (i25 & CertificateBody.profileType);
            i17 = i25;
        }
        return i18;
    }

    ASN1BitString buildConstructedBitString(ASN1EncodableVector aSN1EncodableVector) throws ASN1Exception {
        int size = aSN1EncodableVector.size();
        ASN1BitString[] aSN1BitStringArr = new ASN1BitString[size];
        for (int i15 = 0; i15 != size; i15++) {
            ASN1Encodable aSN1Encodable = aSN1EncodableVector.get(i15);
            if (!(aSN1Encodable instanceof ASN1BitString)) {
                throw new ASN1Exception("unknown object encountered in constructed BIT STRING: " + aSN1Encodable.getClass());
            }
            aSN1BitStringArr[i15] = (ASN1BitString) aSN1Encodable;
        }
        return new BERBitString(aSN1BitStringArr);
    }

    ASN1OctetString buildConstructedOctetString(ASN1EncodableVector aSN1EncodableVector) throws ASN1Exception {
        int size = aSN1EncodableVector.size();
        ASN1OctetString[] aSN1OctetStringArr = new ASN1OctetString[size];
        for (int i15 = 0; i15 != size; i15++) {
            ASN1Encodable aSN1Encodable = aSN1EncodableVector.get(i15);
            if (!(aSN1Encodable instanceof ASN1OctetString)) {
                throw new ASN1Exception("unknown object encountered in constructed OCTET STRING: " + aSN1Encodable.getClass());
            }
            aSN1OctetStringArr[i15] = (ASN1OctetString) aSN1Encodable;
        }
        return new BEROctetString(aSN1OctetStringArr);
    }

    protected ASN1Primitive buildObject(int i15, int i16, int i17) throws IOException {
        DefiniteLengthInputStream definiteLengthInputStream = new DefiniteLengthInputStream(this, i17, this.limit);
        if ((i15 & BERTags.FLAGS) == 0) {
            return createPrimitiveDERObject(i16, definiteLengthInputStream, this.tmpBuffers);
        }
        int i18 = i15 & 192;
        if (i18 != 0) {
            return readTaggedObjectDL(i18, i16, (i15 & 32) != 0, definiteLengthInputStream);
        }
        if (i16 == 3) {
            return buildConstructedBitString(readVector(definiteLengthInputStream));
        }
        if (i16 == 4) {
            return buildConstructedOctetString(readVector(definiteLengthInputStream));
        }
        if (i16 == 8) {
            return DLFactory.createSequence(readVector(definiteLengthInputStream)).toASN1External();
        }
        if (i16 == 16) {
            if (definiteLengthInputStream.getRemaining() < 1) {
                return DLFactory.EMPTY_SEQUENCE;
            }
            return this.lazyEvaluate ? new LazyEncodedSequence(definiteLengthInputStream.toByteArray()) : DLFactory.createSequence(readVector(definiteLengthInputStream));
        }
        if (i16 == 17) {
            return DLFactory.createSet(readVector(definiteLengthInputStream));
        }
        throw new IOException("unknown tag " + i16 + " encountered");
    }

    int getLimit() {
        return this.limit;
    }

    protected void readFully(byte[] bArr) throws EOFException {
        if (Streams.readFully(this, bArr, 0, bArr.length) != bArr.length) {
            throw new EOFException("EOF encountered in middle of object");
        }
    }

    protected int readLength() {
        return readLength(this, this.limit, false);
    }

    public ASN1Primitive readObject() {
        int i15 = read();
        if (i15 <= 0) {
            if (i15 != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int tagNumber = readTagNumber(this, i15);
        int length = readLength();
        if (length >= 0) {
            try {
                return buildObject(i15, tagNumber, length);
            } catch (IllegalArgumentException e15) {
                throw new ASN1Exception("corrupted stream detected", e15);
            }
        }
        if ((i15 & 32) == 0) {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        ASN1StreamParser aSN1StreamParser = new ASN1StreamParser(new IndefiniteLengthInputStream(this, this.limit), this.limit, this.tmpBuffers);
        int i16 = i15 & 192;
        if (i16 != 0) {
            return aSN1StreamParser.loadTaggedIL(i16, tagNumber);
        }
        if (tagNumber == 3) {
            return BERBitStringParser.parse(aSN1StreamParser);
        }
        if (tagNumber == 4) {
            return BEROctetStringParser.parse(aSN1StreamParser);
        }
        if (tagNumber == 8) {
            return DERExternalParser.parse(aSN1StreamParser);
        }
        if (tagNumber == 16) {
            return BERSequenceParser.parse(aSN1StreamParser);
        }
        if (tagNumber == 17) {
            return BERSetParser.parse(aSN1StreamParser);
        }
        throw new IOException("unknown BER object encountered");
    }

    ASN1Primitive readTaggedObjectDL(int i15, int i16, boolean z15, DefiniteLengthInputStream definiteLengthInputStream) {
        return !z15 ? ASN1TaggedObject.createPrimitive(i15, i16, definiteLengthInputStream.toByteArray()) : ASN1TaggedObject.createConstructedDL(i15, i16, readVector(definiteLengthInputStream));
    }

    ASN1EncodableVector readVector() {
        ASN1Primitive object = readObject();
        if (object == null) {
            return new ASN1EncodableVector(0);
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        do {
            aSN1EncodableVector.add(object);
            object = readObject();
        } while (object != null);
        return aSN1EncodableVector;
    }

    public ASN1InputStream(InputStream inputStream, int i15) {
        this(inputStream, i15, false);
    }

    static int readLength(InputStream inputStream, int i15, boolean z15) throws IOException {
        int i16 = inputStream.read();
        if ((i16 >>> 7) == 0) {
            return i16;
        }
        if (128 == i16) {
            return -1;
        }
        if (i16 < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (255 == i16) {
            throw new IOException("invalid long form definite-length 0xFF");
        }
        int i17 = i16 & CertificateBody.profileType;
        int i18 = 0;
        int i19 = 0;
        do {
            int i25 = inputStream.read();
            if (i25 < 0) {
                throw new EOFException("EOF found reading length");
            }
            if ((i18 >>> 23) != 0) {
                throw new IOException("long form definite-length more than 31 bits");
            }
            i18 = (i18 << 8) + i25;
            i19++;
        } while (i19 < i17);
        if (i18 < i15 || z15) {
            return i18;
        }
        throw new IOException("corrupted stream - out of bounds length found: " + i18 + " >= " + i15);
    }

    ASN1EncodableVector readVector(DefiniteLengthInputStream definiteLengthInputStream) {
        int remaining = definiteLengthInputStream.getRemaining();
        return remaining < 1 ? new ASN1EncodableVector(0) : new ASN1InputStream(definiteLengthInputStream, remaining, this.lazyEvaluate, this.tmpBuffers).readVector();
    }

    public ASN1InputStream(InputStream inputStream, int i15, boolean z15) {
        this(inputStream, i15, z15, new byte[11][]);
    }

    private ASN1InputStream(InputStream inputStream, int i15, boolean z15, byte[][] bArr) {
        super(inputStream);
        this.limit = i15;
        this.lazyEvaluate = z15;
        this.tmpBuffers = bArr;
    }

    public ASN1InputStream(InputStream inputStream, boolean z15) {
        this(inputStream, StreamUtil.findLimit(inputStream), z15);
    }

    public ASN1InputStream(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public ASN1InputStream(byte[] bArr, boolean z15) {
        this(new ByteArrayInputStream(bArr), bArr.length, z15);
    }
}
