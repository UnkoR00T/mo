package gl;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
final class b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f73521a = 0;

    b() {
    }

    long b() {
        return this.f73521a;
    }

    @Override // java.io.OutputStream
    public void write(int i15) {
        this.f73521a++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f73521a += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i15, int i16) {
        int i17;
        if (i15 >= 0 && i15 <= bArr.length && i16 >= 0 && (i17 = i15 + i16) <= bArr.length && i17 >= 0) {
            this.f73521a += (long) i16;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
