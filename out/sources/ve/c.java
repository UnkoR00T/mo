package ve;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f206276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f206277b;

    private c(InputStream inputStream, long j15) {
        super(inputStream);
        this.f206276a = j15;
    }

    private int b(int i15) throws IOException {
        if (i15 >= 0) {
            this.f206277b += i15;
            return i15;
        }
        if (this.f206276a - ((long) this.f206277b) <= 0) {
            return i15;
        }
        throw new IOException("Failed to read all expected data, expected: " + this.f206276a + ", but read: " + this.f206277b);
    }

    public static InputStream h(InputStream inputStream, long j15) {
        return new c(inputStream, j15);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f206276a - ((long) this.f206277b), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int i15;
        i15 = super.read();
        b(i15 >= 0 ? 1 : -1);
        return i15;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i15, int i16) {
        return b(super.read(bArr, i15, i16));
    }
}
