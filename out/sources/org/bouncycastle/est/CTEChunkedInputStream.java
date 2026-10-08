package org.bouncycastle.est;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes5.dex */
public class CTEChunkedInputStream extends InputStream {
    int chunkLen = 0;
    private InputStream src;

    public CTEChunkedInputStream(InputStream inputStream) {
        this.src = inputStream;
    }

    private String readEOL() throws IOException {
        int i15;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        do {
            i15 = this.src.read();
            if (i15 == -1) {
                if (byteArrayOutputStream.size() != 0) {
                    break;
                }
                return null;
            }
            byteArrayOutputStream.write(i15 & GF2Field.MASK);
        } while (i15 != 10);
        return byteArrayOutputStream.toString().trim();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        String eol;
        int i15 = this.chunkLen;
        if (i15 == Integer.MIN_VALUE) {
            return -1;
        }
        if (i15 == 0) {
            do {
                eol = readEOL();
                if (eol == null) {
                    break;
                }
            } while (eol.length() == 0);
            if (eol == null) {
                return -1;
            }
            int i16 = Integer.parseInt(eol.trim(), 16);
            this.chunkLen = i16;
            if (i16 == 0) {
                readEOL();
                this.chunkLen = PKIFailureInfo.systemUnavail;
                return -1;
            }
        }
        int i17 = this.src.read();
        this.chunkLen--;
        return i17;
    }
}
