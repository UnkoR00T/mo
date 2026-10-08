package org.bouncycastle.util.io;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class BufferingOutputStream extends OutputStream {
    private final byte[] buf;
    private int bufOff;
    private final OutputStream other;

    public BufferingOutputStream(OutputStream outputStream) {
        this.other = outputStream;
        this.buf = new byte[PKIFailureInfo.certConfirmed];
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        flush();
        this.other.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.other.write(this.buf, 0, this.bufOff);
        this.bufOff = 0;
        Arrays.fill(this.buf, (byte) 0);
    }

    @Override // java.io.OutputStream
    public void write(int i15) throws IOException {
        byte[] bArr = this.buf;
        int i16 = this.bufOff;
        int i17 = i16 + 1;
        this.bufOff = i17;
        bArr[i16] = (byte) i15;
        if (i17 == bArr.length) {
            flush();
        }
    }

    public BufferingOutputStream(OutputStream outputStream, int i15) {
        this.other = outputStream;
        this.buf = new byte[i15];
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i15, int i16) throws IOException {
        byte[] bArr2;
        byte[] bArr3 = this.buf;
        int length = bArr3.length;
        int i17 = this.bufOff;
        if (i16 < length - i17) {
            System.arraycopy(bArr, i15, bArr3, i17, i16);
        } else {
            int length2 = bArr3.length - i17;
            System.arraycopy(bArr, i15, bArr3, i17, length2);
            this.bufOff += length2;
            flush();
            int length3 = i15 + length2;
            i16 -= length2;
            while (true) {
                bArr2 = this.buf;
                if (i16 < bArr2.length) {
                    break;
                }
                this.other.write(bArr, length3, bArr2.length);
                byte[] bArr4 = this.buf;
                length3 += bArr4.length;
                i16 -= bArr4.length;
            }
            if (i16 <= 0) {
                return;
            } else {
                System.arraycopy(bArr, length3, bArr2, this.bufOff, i16);
            }
        }
        this.bufOff += i16;
    }
}
