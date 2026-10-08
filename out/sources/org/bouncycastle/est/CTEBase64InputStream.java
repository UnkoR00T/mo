package org.bouncycastle.est;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.util.encoders.Base64;

/* JADX INFO: loaded from: classes5.dex */
class CTEBase64InputStream extends InputStream {
    protected final byte[] data;
    protected final OutputStream dataOutputStream;
    protected boolean end;
    protected final Long max;
    protected final byte[] rawBuf;
    protected long read;

    /* JADX INFO: renamed from: rp, reason: collision with root package name */
    protected int f149212rp;
    protected final InputStream src;

    /* JADX INFO: renamed from: wp, reason: collision with root package name */
    protected int f149213wp;

    public CTEBase64InputStream(InputStream inputStream) {
        this(inputStream, null);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.src.close();
    }

    protected int pullFromSrc() throws IOException {
        int i15;
        int i16 = 0;
        do {
            Long l15 = this.max;
            if (l15 != null && this.read > l15.longValue()) {
                return -1;
            }
            i15 = this.src.read();
            if (i15 >= 33 || i15 == 13 || i15 == 10) {
                byte[] bArr = this.rawBuf;
                if (i16 >= bArr.length) {
                    throw new IOException("Content Transfer Encoding, base64 line length > 1024");
                }
                bArr[i16] = (byte) i15;
                this.read++;
                i16++;
            } else if (i15 >= 0) {
                this.read++;
            }
            if (i15 <= -1 || i16 >= this.rawBuf.length) {
                break;
            }
        } while (i15 != 10);
        if (i16 > 0) {
            try {
                Base64.decode(this.rawBuf, 0, i16, this.dataOutputStream);
            } catch (Exception e15) {
                throw new IOException("Decode Base64 Content-Transfer-Encoding: " + e15);
            }
        } else if (i15 == -1) {
            return -1;
        }
        return this.f149213wp;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f149212rp == this.f149213wp) {
            this.f149212rp = 0;
            this.f149213wp = 0;
            int iPullFromSrc = pullFromSrc();
            if (iPullFromSrc == -1) {
                return iPullFromSrc;
            }
        }
        byte[] bArr = this.data;
        int i15 = this.f149212rp;
        this.f149212rp = i15 + 1;
        return bArr[i15] & 255;
    }

    public CTEBase64InputStream(InputStream inputStream, Long l15) {
        this.rawBuf = new byte[1024];
        this.data = new byte[768];
        this.src = inputStream;
        this.dataOutputStream = new OutputStream() { // from class: org.bouncycastle.est.CTEBase64InputStream.1
            @Override // java.io.OutputStream
            public void write(int i15) {
                CTEBase64InputStream cTEBase64InputStream = CTEBase64InputStream.this;
                byte[] bArr = cTEBase64InputStream.data;
                int i16 = cTEBase64InputStream.f149213wp;
                cTEBase64InputStream.f149213wp = i16 + 1;
                bArr[i16] = (byte) i15;
            }
        };
        this.max = l15;
    }
}
