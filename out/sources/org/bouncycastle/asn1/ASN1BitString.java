package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ASN1BitString extends ASN1Primitive implements ASN1String, ASN1BitStringParser {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1BitString.class, 3) { // from class: org.bouncycastle.asn1.ASN1BitString.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        ASN1Primitive fromImplicitConstructed(ASN1Sequence aSN1Sequence) {
            return aSN1Sequence.toASN1BitString();
        }

        @Override // org.bouncycastle.asn1.ASN1UniversalType
        ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1BitString.createPrimitive(dEROctetString.getOctets());
        }
    };
    private static final char[] table = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final byte[] contents;

    ASN1BitString(byte b15, int i15) {
        if (i15 > 7 || i15 < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.contents = new byte[]{(byte) i15, b15};
    }

    static ASN1BitString createPrimitive(byte[] bArr) {
        int length = bArr.length;
        if (length < 1) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        int i15 = bArr[0] & 255;
        if (i15 > 0) {
            if (i15 > 7 || length < 2) {
                throw new IllegalArgumentException("invalid pad bits detected");
            }
            byte b15 = bArr[length - 1];
            if (b15 != ((byte) ((GF2Field.MASK << i15) & b15))) {
                return new DLBitString(bArr, false);
            }
        }
        return new DERBitString(bArr, false);
    }

    public static ASN1BitString getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1BitString)) {
            return (ASN1BitString) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1BitString) {
                return (ASN1BitString) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (ASN1BitString) TYPE.fromByteArray((byte[]) obj);
            } catch (IOException e15) {
                throw new IllegalArgumentException("failed to construct BIT STRING from byte[]: " + e15.getMessage());
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public static ASN1BitString getTagged(ASN1TaggedObject aSN1TaggedObject, boolean z15) {
        return (ASN1BitString) TYPE.getTagged(aSN1TaggedObject, z15);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1BitString)) {
            return false;
        }
        byte[] bArr = this.contents;
        byte[] bArr2 = ((ASN1BitString) aSN1Primitive).contents;
        int length = bArr.length;
        if (bArr2.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i15 = length - 1;
        for (int i16 = 0; i16 < i15; i16++) {
            if (bArr[i16] != bArr2[i16]) {
                return false;
            }
        }
        int i17 = bArr[0] & 255;
        byte b15 = bArr[i15];
        int i18 = GF2Field.MASK << i17;
        return ((byte) (b15 & i18)) == ((byte) (bArr2[i15] & i18));
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public InputStream getBitStream() {
        byte[] bArr = this.contents;
        return new ByteArrayInputStream(bArr, 1, bArr.length - 1);
    }

    public byte[] getBytes() {
        byte[] bArr = this.contents;
        if (bArr.length == 1) {
            return ASN1OctetString.EMPTY_OCTETS;
        }
        int i15 = bArr[0] & 255;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 1, bArr.length);
        int length = bArrCopyOfRange.length - 1;
        bArrCopyOfRange[length] = (byte) (((byte) (GF2Field.MASK << i15)) & bArrCopyOfRange[length]);
        return bArrCopyOfRange;
    }

    public int getBytesLength() {
        return this.contents.length - 1;
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() {
        return toASN1Primitive();
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public InputStream getOctetStream() throws IOException {
        int i15 = this.contents[0] & 255;
        if (i15 == 0) {
            return getBitStream();
        }
        throw new IOException("expected octet-aligned bitstring, but found padBits: " + i15);
    }

    public byte[] getOctets() {
        byte[] bArr = this.contents;
        if (bArr[0] == 0) {
            return Arrays.copyOfRange(bArr, 1, bArr.length);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public int getPadBits() {
        return this.contents[0] & 255;
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public String getString() {
        try {
            byte[] encoded = getEncoded();
            StringBuilder sb5 = new StringBuilder((encoded.length * 2) + 1);
            sb5.append('#');
            for (int i15 = 0; i15 != encoded.length; i15++) {
                byte b15 = encoded[i15];
                char[] cArr = table;
                sb5.append(cArr[(b15 >>> 4) & 15]);
                sb5.append(cArr[b15 & 15]);
            }
            return sb5.toString();
        } catch (IOException e15) {
            throw new ASN1ParsingException("Internal error encoding BitString: " + e15.getMessage(), e15);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        byte[] bArr = this.contents;
        if (bArr.length < 2) {
            return 1;
        }
        int i15 = bArr[0] & 255;
        int length = bArr.length - 1;
        return (Arrays.hashCode(bArr, 0, length) * 257) ^ ((byte) ((GF2Field.MASK << i15) & bArr[length]));
    }

    public int intValue() {
        int iMin = Math.min(5, this.contents.length - 1);
        int i15 = 0;
        for (int i16 = 1; i16 < iMin; i16++) {
            i15 |= (255 & this.contents[i16]) << ((i16 - 1) * 8);
        }
        if (1 > iMin || iMin >= 5) {
            return i15;
        }
        byte[] bArr = this.contents;
        return ((((byte) (bArr[iMin] & (GF2Field.MASK << (bArr[0] & 255)))) & 255) << ((iMin - 1) * 8)) | i15;
    }

    public boolean isOctetAligned() {
        return getPadBits() == 0;
    }

    public ASN1BitStringParser parser() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    ASN1Primitive toDERObject() {
        return new DERBitString(this.contents, false);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    ASN1Primitive toDLObject() {
        return new DLBitString(this.contents, false);
    }

    public String toString() {
        return getString();
    }

    ASN1BitString(byte[] bArr, int i15) {
        if (bArr == null) {
            throw new NullPointerException("'data' cannot be null");
        }
        if (bArr.length == 0 && i15 != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i15 > 7 || i15 < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.contents = Arrays.prepend(bArr, (byte) i15);
    }

    protected static byte[] getBytes(int i15) {
        if (i15 == 0) {
            return new byte[0];
        }
        int i16 = 4;
        for (int i17 = 3; i17 >= 1 && ((GF2Field.MASK << (i17 * 8)) & i15) == 0; i17--) {
            i16--;
        }
        byte[] bArr = new byte[i16];
        for (int i18 = 0; i18 < i16; i18++) {
            bArr[i18] = (byte) ((i15 >> (i18 * 8)) & GF2Field.MASK);
        }
        return bArr;
    }

    public static ASN1BitString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z15) {
        return (ASN1BitString) TYPE.getContextTagged(aSN1TaggedObject, z15);
    }

    protected static int getPadBits(int i15) {
        int i16;
        int i17 = 3;
        while (true) {
            if (i17 < 0) {
                i16 = 0;
                break;
            }
            if (i17 != 0) {
                int i18 = i15 >> (i17 * 8);
                if (i18 != 0) {
                    i16 = i18 & GF2Field.MASK;
                    break;
                }
                i17--;
            } else {
                if (i15 != 0) {
                    i16 = i15 & GF2Field.MASK;
                    break;
                }
                i17--;
            }
        }
        if (i16 == 0) {
            return 0;
        }
        int i19 = 1;
        while (true) {
            i16 <<= 1;
            if ((i16 & GF2Field.MASK) == 0) {
                return 8 - i19;
            }
            i19++;
        }
    }

    ASN1BitString(byte[] bArr, boolean z15) {
        if (z15) {
            if (bArr == null) {
                throw new NullPointerException("'contents' cannot be null");
            }
            if (bArr.length < 1) {
                throw new IllegalArgumentException("'contents' cannot be empty");
            }
            int i15 = bArr[0] & 255;
            if (i15 > 0) {
                if (bArr.length < 2) {
                    throw new IllegalArgumentException("zero length data with non-zero pad bits");
                }
                if (i15 > 7) {
                    throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
                }
            }
        }
        this.contents = bArr;
    }
}
