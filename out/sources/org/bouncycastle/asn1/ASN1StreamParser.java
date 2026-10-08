package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class ASN1StreamParser {
    private final InputStream _in;
    private final int _limit;
    private final byte[][] tmpBuffers;

    public ASN1StreamParser(InputStream inputStream) {
        this(inputStream, StreamUtil.findLimit(inputStream));
    }

    private void set00Check(boolean z15) {
        InputStream inputStream = this._in;
        if (inputStream instanceof IndefiniteLengthInputStream) {
            ((IndefiniteLengthInputStream) inputStream).setEofOn00(z15);
        }
    }

    ASN1Encodable implParseObject(int i15) throws IOException {
        set00Check(false);
        int tagNumber = ASN1InputStream.readTagNumber(this._in, i15);
        int length = ASN1InputStream.readLength(this._in, this._limit, tagNumber == 3 || tagNumber == 4 || tagNumber == 16 || tagNumber == 17 || tagNumber == 8);
        if (length < 0) {
            if ((i15 & 32) == 0) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            ASN1StreamParser aSN1StreamParser = new ASN1StreamParser(new IndefiniteLengthInputStream(this._in, this._limit), this._limit, this.tmpBuffers);
            int i16 = i15 & 192;
            return i16 != 0 ? new BERTaggedObjectParser(i16, tagNumber, aSN1StreamParser) : aSN1StreamParser.parseImplicitConstructedIL(tagNumber);
        }
        DefiniteLengthInputStream definiteLengthInputStream = new DefiniteLengthInputStream(this._in, length, this._limit);
        if ((i15 & BERTags.FLAGS) == 0) {
            return parseImplicitPrimitive(tagNumber, definiteLengthInputStream);
        }
        ASN1StreamParser aSN1StreamParser2 = new ASN1StreamParser(definiteLengthInputStream, definiteLengthInputStream.getLimit(), this.tmpBuffers);
        int i17 = i15 & 192;
        if (i17 != 0) {
            return new DLTaggedObjectParser(i17, tagNumber, (i15 & 32) != 0, aSN1StreamParser2);
        }
        return aSN1StreamParser2.parseImplicitConstructedDL(tagNumber);
    }

    ASN1Primitive loadTaggedDL(int i15, int i16, boolean z15) {
        return !z15 ? ASN1TaggedObject.createPrimitive(i15, i16, ((DefiniteLengthInputStream) this._in).toByteArray()) : ASN1TaggedObject.createConstructedDL(i15, i16, readVector());
    }

    ASN1Primitive loadTaggedIL(int i15, int i16) {
        return ASN1TaggedObject.createConstructedIL(i15, i16, readVector());
    }

    ASN1Encodable parseImplicitConstructedDL(int i15) throws ASN1Exception {
        if (i15 == 3) {
            return new BERBitStringParser(this);
        }
        if (i15 == 4) {
            return new BEROctetStringParser(this);
        }
        if (i15 == 8) {
            return new DERExternalParser(this);
        }
        if (i15 == 16) {
            return new DLSequenceParser(this);
        }
        if (i15 == 17) {
            return new DLSetParser(this);
        }
        throw new ASN1Exception("unknown DL object encountered: 0x" + Integer.toHexString(i15));
    }

    ASN1Encodable parseImplicitConstructedIL(int i15) throws ASN1Exception {
        if (i15 == 3) {
            return new BERBitStringParser(this);
        }
        if (i15 == 4) {
            return new BEROctetStringParser(this);
        }
        if (i15 == 8) {
            return new DERExternalParser(this);
        }
        if (i15 == 16) {
            return new BERSequenceParser(this);
        }
        if (i15 == 17) {
            return new BERSetParser(this);
        }
        throw new ASN1Exception("unknown BER object encountered: 0x" + Integer.toHexString(i15));
    }

    ASN1Encodable parseImplicitPrimitive(int i15) {
        return parseImplicitPrimitive(i15, (DefiniteLengthInputStream) this._in);
    }

    ASN1Encodable parseObject(int i15) throws IOException {
        if (i15 < 0 || i15 > 30) {
            throw new IllegalArgumentException("invalid universal tag number: " + i15);
        }
        int i16 = this._in.read();
        if (i16 < 0) {
            return null;
        }
        if ((i16 & (-33)) == i15) {
            return implParseObject(i16);
        }
        throw new IOException("unexpected identifier encountered: " + i16);
    }

    ASN1TaggedObjectParser parseTaggedObject() throws IOException {
        int i15 = this._in.read();
        if (i15 < 0) {
            return null;
        }
        if ((i15 & 192) != 0) {
            return (ASN1TaggedObjectParser) implParseObject(i15);
        }
        throw new ASN1Exception("no tagged object found");
    }

    public ASN1Encodable readObject() throws IOException {
        int i15 = this._in.read();
        if (i15 < 0) {
            return null;
        }
        return implParseObject(i15);
    }

    ASN1EncodableVector readVector() throws IOException {
        int i15 = this._in.read();
        if (i15 < 0) {
            return new ASN1EncodableVector(0);
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        do {
            ASN1Encodable aSN1EncodableImplParseObject = implParseObject(i15);
            aSN1EncodableVector.add(aSN1EncodableImplParseObject instanceof InMemoryRepresentable ? ((InMemoryRepresentable) aSN1EncodableImplParseObject).getLoadedObject() : aSN1EncodableImplParseObject.toASN1Primitive());
            i15 = this._in.read();
        } while (i15 >= 0);
        return aSN1EncodableVector;
    }

    public ASN1StreamParser(InputStream inputStream, int i15) {
        this(inputStream, i15, new byte[11][]);
    }

    ASN1Encodable parseImplicitPrimitive(int i15, DefiniteLengthInputStream definiteLengthInputStream) throws ASN1Exception {
        if (i15 == 3) {
            return new DLBitStringParser(definiteLengthInputStream);
        }
        if (i15 == 4) {
            return new DEROctetStringParser(definiteLengthInputStream);
        }
        if (i15 == 8) {
            throw new ASN1Exception("externals must use constructed encoding (see X.690 8.18)");
        }
        if (i15 == 16) {
            throw new ASN1Exception("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
        }
        if (i15 == 17) {
            throw new ASN1Exception("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
        }
        try {
            return ASN1InputStream.createPrimitiveDERObject(i15, definiteLengthInputStream, this.tmpBuffers);
        } catch (IllegalArgumentException e15) {
            throw new ASN1Exception("corrupted stream detected", e15);
        }
    }

    ASN1StreamParser(InputStream inputStream, int i15, byte[][] bArr) {
        this._in = inputStream;
        this._limit = i15;
        this.tmpBuffers = bArr;
    }

    public ASN1StreamParser(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }
}
