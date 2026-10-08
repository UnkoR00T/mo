package ep;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* JADX INFO: loaded from: classes4.dex */
final class d implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PushbackInputStream f52609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52610b = 0;

    d(InputStream inputStream) {
        this.f52609a = new PushbackInputStream(inputStream, 32767);
    }

    @Override // ep.k
    public void O1(int i15) throws IOException {
        this.f52609a.unread(i15);
        this.f52610b--;
    }

    @Override // ep.k
    public void a2(byte[] bArr) throws IOException {
        this.f52609a.unread(bArr);
        this.f52610b -= bArr.length;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f52609a.close();
    }

    @Override // ep.k
    public long getPosition() {
        return this.f52610b;
    }

    @Override // ep.k
    public byte[] j0(int i15) throws IOException {
        byte[] bArr = new byte[i15];
        int i16 = 0;
        do {
            int i17 = read(bArr, i16, i15 - i16);
            if (i17 < 0) {
                throw new EOFException();
            }
            i16 += i17;
        } while (i16 < i15);
        return bArr;
    }

    @Override // ep.k
    public boolean k0() {
        return peek() == -1;
    }

    @Override // ep.k
    public int peek() throws IOException {
        int i15 = this.f52609a.read();
        if (i15 != -1) {
            this.f52609a.unread(i15);
        }
        return i15;
    }

    @Override // ep.k
    public void q3(byte[] bArr, int i15, int i16) throws IOException {
        this.f52609a.unread(bArr, i15, i16);
        this.f52610b -= i16;
    }

    @Override // ep.k
    public int read() throws IOException {
        int i15 = this.f52609a.read();
        this.f52610b++;
        return i15;
    }

    @Override // ep.k
    public int read(byte[] bArr) throws IOException {
        int i15 = this.f52609a.read(bArr);
        if (i15 <= 0) {
            return -1;
        }
        this.f52610b += i15;
        return i15;
    }

    @Override // ep.k
    public int read(byte[] bArr, int i15, int i16) throws IOException {
        int i17 = this.f52609a.read(bArr, i15, i16);
        if (i17 <= 0) {
            return -1;
        }
        this.f52610b += i17;
        return i17;
    }
}
