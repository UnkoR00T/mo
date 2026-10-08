package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BERGenerator extends ASN1Generator {
    private boolean _isExplicit;
    private int _tagNo;
    private boolean _tagged;

    protected BERGenerator(OutputStream outputStream) {
        super(outputStream);
        this._tagged = false;
    }

    private void writeHdr(int i15) throws IOException {
        this._out.write(i15);
        this._out.write(128);
    }

    @Override // org.bouncycastle.asn1.ASN1Generator
    public OutputStream getRawOutputStream() {
        return this._out;
    }

    protected void writeBEREnd() throws IOException {
        this._out.write(0);
        this._out.write(0);
        if (this._tagged && this._isExplicit) {
            this._out.write(0);
            this._out.write(0);
        }
    }

    protected void writeBERHeader(int i15) throws IOException {
        if (!this._tagged) {
            writeHdr(i15);
            return;
        }
        int i16 = this._tagNo;
        int i17 = i16 | 128;
        if (this._isExplicit) {
            writeHdr(i16 | 160);
        } else {
            if ((i15 & 32) == 0) {
                writeHdr(i17);
                return;
            }
            i15 = i16 | 160;
        }
        writeHdr(i15);
    }

    protected BERGenerator(OutputStream outputStream, int i15, boolean z15) {
        super(outputStream);
        this._tagged = true;
        this._isExplicit = z15;
        this._tagNo = i15;
    }
}
