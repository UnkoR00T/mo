package org.bouncycastle.util.io;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public class LimitedBuffer extends OutputStream {
    private final byte[] buf;
    private int count = 0;

    public LimitedBuffer(int i15) {
        this.buf = new byte[i15];
    }

    public int copyTo(byte[] bArr, int i15) {
        System.arraycopy(this.buf, 0, bArr, i15, this.count);
        return this.count;
    }

    public int limit() {
        return this.buf.length;
    }

    public void reset() {
        this.count = 0;
    }

    public int size() {
        return this.count;
    }

    @Override // java.io.OutputStream
    public void write(int i15) {
        byte[] bArr = this.buf;
        int i16 = this.count;
        this.count = i16 + 1;
        bArr[i16] = (byte) i15;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        System.arraycopy(bArr, 0, this.buf, this.count, bArr.length);
        this.count += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i15, int i16) {
        System.arraycopy(bArr, i15, this.buf, this.count, i16);
        this.count += i16;
    }
}
