package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes3.dex */
public class ASN1OutputStream {

    /* JADX INFO: renamed from: os, reason: collision with root package name */
    private OutputStream f148840os;

    ASN1OutputStream(OutputStream outputStream) {
        this.f148840os = outputStream;
    }

    public static ASN1OutputStream create(OutputStream outputStream) {
        return new ASN1OutputStream(outputStream);
    }

    static int getLengthOfDL(int i15) {
        if (i15 < 128) {
            return 1;
        }
        int i16 = 2;
        while (true) {
            i15 >>>= 8;
            if (i15 == 0) {
                return i16;
            }
            i16++;
        }
    }

    static int getLengthOfEncodingDL(boolean z15, int i15) {
        return (z15 ? 1 : 0) + getLengthOfDL(i15) + i15;
    }

    static int getLengthOfIdentifier(int i15) {
        if (i15 < 31) {
            return 1;
        }
        int i16 = 2;
        while (true) {
            i15 >>>= 7;
            if (i15 == 0) {
                return i16;
            }
            i16++;
        }
    }

    public void close() throws IOException {
        this.f148840os.close();
    }

    public void flush() throws IOException {
        this.f148840os.flush();
    }

    void flushInternal() {
    }

    DEROutputStream getDERSubStream() {
        return new DEROutputStream(this.f148840os);
    }

    DLOutputStream getDLSubStream() {
        return new DLOutputStream(this.f148840os);
    }

    final void write(int i15) throws IOException {
        this.f148840os.write(i15);
    }

    final void writeDL(int i15) throws IOException {
        if (i15 < 128) {
            write(i15);
            return;
        }
        int i16 = 5;
        byte[] bArr = new byte[5];
        while (true) {
            int i17 = i16 - 1;
            bArr[i17] = (byte) i15;
            i15 >>>= 8;
            if (i15 == 0) {
                int i18 = i16 - 2;
                bArr[i18] = (byte) ((5 - i17) | 128);
                write(bArr, i18, 6 - i17);
                return;
            }
            i16 = i17;
        }
    }

    void writeElements(ASN1Encodable[] aSN1EncodableArr) {
        for (ASN1Encodable aSN1Encodable : aSN1EncodableArr) {
            aSN1Encodable.toASN1Primitive().encode(this, true);
        }
    }

    final void writeEncodingDL(boolean z15, int i15, byte b15) throws IOException {
        writeIdentifier(z15, i15);
        writeDL(1);
        write(b15);
    }

    final void writeEncodingIL(boolean z15, int i15, ASN1Encodable[] aSN1EncodableArr) throws IOException {
        writeIdentifier(z15, i15);
        write(128);
        writeElements(aSN1EncodableArr);
        write(0);
        write(0);
    }

    final void writeIdentifier(boolean z15, int i15) throws IOException {
        if (z15) {
            write(i15);
        }
    }

    public final void writeObject(ASN1Encodable aSN1Encodable) throws IOException {
        if (aSN1Encodable == null) {
            throw new IOException("null object detected");
        }
        writePrimitive(aSN1Encodable.toASN1Primitive(), true);
        flushInternal();
    }

    void writePrimitive(ASN1Primitive aSN1Primitive, boolean z15) {
        aSN1Primitive.encode(this, z15);
    }

    void writePrimitives(ASN1Primitive[] aSN1PrimitiveArr) {
        for (ASN1Primitive aSN1Primitive : aSN1PrimitiveArr) {
            aSN1Primitive.encode(this, true);
        }
    }

    public static ASN1OutputStream create(OutputStream outputStream, String str) {
        if (str.equals(ASN1Encoding.DER)) {
            return new DEROutputStream(outputStream);
        }
        return str.equals(ASN1Encoding.DL) ? new DLOutputStream(outputStream) : new ASN1OutputStream(outputStream);
    }

    final void write(byte[] bArr, int i15, int i16) throws IOException {
        this.f148840os.write(bArr, i15, i16);
    }

    final void writeEncodingDL(boolean z15, int i15, byte b15, byte[] bArr, int i16, int i17) throws IOException {
        writeIdentifier(z15, i15);
        writeDL(i17 + 1);
        write(b15);
        write(bArr, i16, i17);
    }

    final void writeIdentifier(boolean z15, int i15, int i16) throws IOException {
        if (z15) {
            if (i16 < 31) {
                write(i15 | i16);
                return;
            }
            byte[] bArr = new byte[6];
            int i17 = 5;
            bArr[5] = (byte) (i16 & CertificateBody.profileType);
            while (i16 > 127) {
                i16 >>>= 7;
                i17--;
                bArr[i17] = (byte) ((i16 & CertificateBody.profileType) | 128);
            }
            int i18 = i17 - 1;
            bArr[i18] = (byte) (31 | i15);
            write(bArr, i18, 6 - i18);
        }
    }

    public final void writeObject(ASN1Primitive aSN1Primitive) throws IOException {
        if (aSN1Primitive == null) {
            throw new IOException("null object detected");
        }
        writePrimitive(aSN1Primitive, true);
        flushInternal();
    }

    final void writeEncodingDL(boolean z15, int i15, int i16, byte[] bArr) throws IOException {
        writeIdentifier(z15, i15, i16);
        writeDL(bArr.length);
        write(bArr, 0, bArr.length);
    }

    final void writeEncodingDL(boolean z15, int i15, byte[] bArr) {
        writeIdentifier(z15, i15);
        writeDL(bArr.length);
        write(bArr, 0, bArr.length);
    }

    final void writeEncodingDL(boolean z15, int i15, byte[] bArr, int i16, int i17) throws IOException {
        writeIdentifier(z15, i15);
        writeDL(i17);
        write(bArr, i16, i17);
    }

    final void writeEncodingDL(boolean z15, int i15, byte[] bArr, int i16, int i17, byte b15) throws IOException {
        writeIdentifier(z15, i15);
        writeDL(i17 + 1);
        write(bArr, i16, i17);
        write(b15);
    }
}
