package org.bouncycastle.mime.encoding;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public class QuotedPrintableInputStream extends FilterInputStream {
    public QuotedPrintableInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i15;
        int i16;
        int i17 = ((FilterInputStream) this).in.read();
        if (i17 == -1) {
            return -1;
        }
        while (i17 == 61) {
            int i18 = ((FilterInputStream) this).in.read();
            if (i18 == -1) {
                throw new IllegalStateException("Quoted '=' at end of stream");
            }
            if (i18 == 13) {
                i17 = ((FilterInputStream) this).in.read();
                if (i17 == 10) {
                }
            } else if (i18 != 10) {
                if (i18 >= 48 && i18 <= 57) {
                    i15 = i18 - 48;
                } else {
                    if (i18 < 65 || i18 > 70) {
                        throw new IllegalStateException("Expecting '0123456789ABCDEF after quote that was not immediately followed by LF or CRLF");
                    }
                    i15 = i18 - 55;
                }
                int i19 = i15 << 4;
                int i25 = ((FilterInputStream) this).in.read();
                if (i25 >= 48 && i25 <= 57) {
                    i16 = i25 - 48;
                } else {
                    if (i25 < 65 || i25 > 70) {
                        throw new IllegalStateException("Expecting second '0123456789ABCDEF after quote that was not immediately followed by LF or CRLF");
                    }
                    i16 = i25 - 55;
                }
                return i19 | i16;
            }
            i17 = ((FilterInputStream) this).in.read();
        }
        return i17;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i15, int i16) throws IOException {
        int i17 = 0;
        while (i17 != i16) {
            int i18 = read();
            if (i18 < 0) {
                break;
            }
            bArr[i17 + i15] = (byte) i18;
            i17++;
        }
        if (i17 == 0) {
            return -1;
        }
        return i17;
    }
}
