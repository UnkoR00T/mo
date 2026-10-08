package ep;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dp.g f52635a;

    j(dp.g gVar) {
        this.f52635a = gVar;
    }

    @Override // ep.k
    public void O1(int i15) {
        this.f52635a.b3(1);
    }

    @Override // ep.k
    public void a2(byte[] bArr) {
        this.f52635a.b3(bArr.length);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f52635a.close();
    }

    @Override // ep.k
    public long getPosition() {
        return this.f52635a.getPosition();
    }

    @Override // ep.k
    public byte[] j0(int i15) {
        return this.f52635a.j0(i15);
    }

    @Override // ep.k
    public boolean k0() {
        return this.f52635a.k0();
    }

    @Override // ep.k
    public int peek() {
        return this.f52635a.peek();
    }

    @Override // ep.k
    public void q3(byte[] bArr, int i15, int i16) {
        this.f52635a.b3(i16);
    }

    @Override // ep.k
    public int read() {
        return this.f52635a.read();
    }

    @Override // ep.k
    public int read(byte[] bArr) {
        return this.f52635a.read(bArr);
    }

    @Override // ep.k
    public int read(byte[] bArr, int i15, int i16) {
        return this.f52635a.read(bArr, i15, i16);
    }
}
