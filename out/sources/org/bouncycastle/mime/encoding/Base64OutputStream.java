package org.bouncycastle.mime.encoding;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.util.encoders.Base64Encoder;

/* JADX INFO: loaded from: classes5.dex */
public class Base64OutputStream extends FilterOutputStream {
    private static final Base64Encoder ENCODER = new Base64Encoder();
    private static final int INBUF_SIZE = 54;
    private static final int OUTBUF_SIZE = 74;
    private final byte[] inBuf;
    private int inPos;
    private final byte[] outBuf;

    public Base64OutputStream(OutputStream outputStream) {
        super(outputStream);
        this.inBuf = new byte[54];
        byte[] bArr = new byte[74];
        this.outBuf = bArr;
        this.inPos = 0;
        bArr[72] = 13;
        bArr[73] = 10;
    }

    private void encodeBlock(byte[] bArr, int i15) throws IOException {
        ENCODER.encode(bArr, i15, 54, this.outBuf, 0);
        ((FilterOutputStream) this).out.write(this.outBuf, 0, 74);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i15 = this.inPos;
        if (i15 > 0) {
            int iEncode = ENCODER.encode(this.inBuf, 0, i15, this.outBuf, 0);
            this.inPos = 0;
            byte[] bArr = this.outBuf;
            bArr[iEncode] = 13;
            bArr[iEncode + 1] = 10;
            ((FilterOutputStream) this).out.write(bArr, 0, iEncode + 2);
        }
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i15) throws IOException {
        byte[] bArr = this.inBuf;
        int i16 = this.inPos;
        int i17 = i16 + 1;
        this.inPos = i17;
        bArr[i16] = (byte) i15;
        if (i17 == 54) {
            encodeBlock(bArr, 0);
            this.inPos = 0;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i15, int i16) throws IOException {
        int i17 = this.inPos;
        int i18 = 54 - i17;
        if (i16 < i18) {
            System.arraycopy(bArr, i15, this.inBuf, i17, i16);
            this.inPos += i16;
            return;
        }
        if (i17 > 0) {
            System.arraycopy(bArr, i15, this.inBuf, i17, i18);
            encodeBlock(this.inBuf, 0);
        } else {
            i18 = 0;
        }
        while (true) {
            int i19 = i16 - i18;
            if (i19 < 54) {
                System.arraycopy(bArr, i15 + i18, this.inBuf, 0, i19);
                this.inPos = i19;
                return;
            } else {
                encodeBlock(bArr, i15 + i18);
                i18 += 54;
            }
        }
    }
}
