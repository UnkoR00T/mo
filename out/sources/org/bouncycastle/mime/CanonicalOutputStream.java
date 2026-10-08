package org.bouncycastle.mime;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.mime.smime.SMimeParserContext;

/* JADX INFO: loaded from: classes5.dex */
public class CanonicalOutputStream extends FilterOutputStream {
    protected static byte[] newline = {13, 10};
    private final boolean is7Bit;
    protected int lastb;

    public CanonicalOutputStream(SMimeParserContext sMimeParserContext, Headers headers, OutputStream outputStream) {
        super(outputStream);
        this.lastb = -1;
        if (headers.getContentType() != null) {
            this.is7Bit = (headers.getContentType() == null || headers.getContentType().equals("binary")) ? false : true;
        } else {
            this.is7Bit = sMimeParserContext.getDefaultContentTransferEncoding().equals("7bit");
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i15) throws IOException {
        if (!this.is7Bit) {
            ((FilterOutputStream) this).out.write(i15);
        } else if (i15 == 13) {
            ((FilterOutputStream) this).out.write(newline);
        } else if (i15 != 10) {
            ((FilterOutputStream) this).out.write(i15);
        } else if (this.lastb != 13) {
            ((FilterOutputStream) this).out.write(newline);
        }
        this.lastb = i15;
    }

    public void writeln() throws IOException {
        ((FilterOutputStream) this).out.write(newline);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i15, int i16) throws IOException {
        for (int i17 = i15; i17 != i15 + i16; i17++) {
            write(bArr[i17]);
        }
    }
}
