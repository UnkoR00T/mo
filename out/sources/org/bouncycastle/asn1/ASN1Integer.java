package org.bouncycastle.asn1;

import java.math.BigInteger;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
public class ASN1Integer extends ASN1Primitive {
    static final int SIGN_EXT_SIGNED = -1;
    static final int SIGN_EXT_UNSIGNED = 255;
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1Integer.class, 2) { // from class: org.bouncycastle.asn1.ASN1Integer.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1Integer.createPrimitive(dEROctetString.getOctets());
        }
    };
    private final byte[] bytes;
    private final int start;

    public ASN1Integer(long j15) {
        this.bytes = BigInteger.valueOf(j15).toByteArray();
        this.start = 0;
    }

    static ASN1Integer createPrimitive(byte[] bArr) {
        return new ASN1Integer(bArr, false);
    }

    public static ASN1Integer getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1Integer)) {
            return (ASN1Integer) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (ASN1Integer) TYPE.fromByteArray((byte[]) obj);
        } catch (Exception e15) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e15.toString());
        }
    }

    public static ASN1Integer getTagged(ASN1TaggedObject aSN1TaggedObject, boolean z15) {
        return (ASN1Integer) TYPE.getTagged(aSN1TaggedObject, z15);
    }

    static int intValue(byte[] bArr, int i15, int i16) {
        int length = bArr.length;
        int iMax = Math.max(i15, length - 4);
        int i17 = i16 & bArr[iMax];
        while (true) {
            iMax++;
            if (iMax >= length) {
                return i17;
            }
            i17 = (i17 << 8) | (bArr[iMax] & 255);
        }
    }

    static boolean isMalformed(byte[] bArr) {
        int length = bArr.length;
        if (length != 0) {
            return (length == 1 || bArr[0] != (bArr[1] >> 7) || Properties.isOverrideSet("org.bouncycastle.asn1.allow_unsafe_integer")) ? false : true;
        }
        return true;
    }

    static long longValue(byte[] bArr, int i15, int i16) {
        int length = bArr.length;
        int iMax = Math.max(i15, length - 8);
        long j15 = i16 & bArr[iMax];
        while (true) {
            iMax++;
            if (iMax >= length) {
                return j15;
            }
            j15 = (j15 << 8) | ((long) (bArr[iMax] & 255));
        }
    }

    static int signBytesToSkip(byte[] bArr) {
        int length = bArr.length - 1;
        int i15 = 0;
        while (i15 < length) {
            int i16 = i15 + 1;
            if (bArr[i15] != (bArr[i16] >> 7)) {
                break;
            }
            i15 = i16;
        }
        return i15;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1Integer) {
            return Arrays.areEqual(this.bytes, ((ASN1Integer) aSN1Primitive).bytes);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    void encode(ASN1OutputStream aSN1OutputStream, boolean z15) {
        aSN1OutputStream.writeEncodingDL(z15, 2, this.bytes);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    int encodedLength(boolean z15) {
        return ASN1OutputStream.getLengthOfEncodingDL(z15, this.bytes.length);
    }

    public BigInteger getPositiveValue() {
        return new BigInteger(1, this.bytes);
    }

    public BigInteger getValue() {
        return new BigInteger(this.bytes);
    }

    public boolean hasValue(int i15) {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i16 = this.start;
        return length - i16 <= 4 && intValue(bArr, i16, -1) == i15;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.bytes);
    }

    public int intPositiveValueExact() {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i15 = this.start;
        int i16 = length - i15;
        if (i16 > 4 || (i16 == 4 && (bArr[i15] & 128) != 0)) {
            throw new ArithmeticException("ASN.1 Integer out of positive int range");
        }
        return intValue(bArr, i15, 255);
    }

    public int intValueExact() {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i15 = this.start;
        if (length - i15 <= 4) {
            return intValue(bArr, i15, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }

    public long longValueExact() {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i15 = this.start;
        if (length - i15 <= 8) {
            return longValue(bArr, i15, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of long range");
    }

    public String toString() {
        return getValue().toString();
    }

    public ASN1Integer(BigInteger bigInteger) {
        this.bytes = bigInteger.toByteArray();
        this.start = 0;
    }

    public static ASN1Integer getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z15) {
        return (ASN1Integer) TYPE.getContextTagged(aSN1TaggedObject, z15);
    }

    public boolean hasValue(long j15) {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i15 = this.start;
        return length - i15 <= 8 && longValue(bArr, i15, -1) == j15;
    }

    public ASN1Integer(byte[] bArr) {
        this(bArr, true);
    }

    public boolean hasValue(BigInteger bigInteger) {
        return bigInteger != null && intValue(this.bytes, this.start, -1) == bigInteger.intValue() && getValue().equals(bigInteger);
    }

    ASN1Integer(byte[] bArr, boolean z15) {
        if (isMalformed(bArr)) {
            throw new IllegalArgumentException("malformed integer");
        }
        this.bytes = z15 ? Arrays.clone(bArr) : bArr;
        this.start = signBytesToSkip(bArr);
    }
}
