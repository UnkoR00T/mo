package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DERGenerator extends ASN1Generator {
    private boolean _isExplicit;
    private int _tagNo;
    private boolean _tagged;

    protected DERGenerator(OutputStream outputStream) {
        super(outputStream);
        this._tagged = false;
    }

    private void writeLength(OutputStream outputStream, int i15) throws IOException {
        if (i15 <= 127) {
            outputStream.write((byte) i15);
            return;
        }
        int i16 = i15;
        int i17 = 1;
        while (true) {
            i16 >>>= 8;
            if (i16 == 0) {
                break;
            } else {
                i17++;
            }
        }
        outputStream.write((byte) (i17 | 128));
        for (int i18 = (i17 - 1) * 8; i18 >= 0; i18 -= 8) {
            outputStream.write((byte) (i15 >> i18));
        }
    }

    void writeDEREncoded(int i15, byte[] bArr) throws IOException {
        if (!this._tagged) {
            writeDEREncoded(this._out, i15, bArr);
            return;
        }
        int i16 = this._tagNo;
        int i17 = i16 | 128;
        if (this._isExplicit) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            writeDEREncoded(byteArrayOutputStream, i15, bArr);
            writeDEREncoded(this._out, i16 | 160, byteArrayOutputStream.toByteArray());
            return;
        }
        if ((i15 & 32) != 0) {
            writeDEREncoded(this._out, i16 | 160, bArr);
        } else {
            writeDEREncoded(this._out, i17, bArr);
        }
    }

    public DERGenerator(OutputStream outputStream, int i15, boolean z15) {
        super(outputStream);
        this._tagged = true;
        this._isExplicit = z15;
        this._tagNo = i15;
    }

    void writeDEREncoded(OutputStream outputStream, int i15, byte[] bArr) throws IOException {
        outputStream.write(i15);
        writeLength(outputStream, bArr.length);
        outputStream.write(bArr);
    }
}
