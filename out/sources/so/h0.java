package so;

import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
class h0 extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i0 f182652a;

    h0(i0 i0Var) {
        this.f182652a = i0Var;
    }

    @Override // so.i0
    public short E() {
        return this.f182652a.E();
    }

    @Override // so.i0
    public int N() {
        return this.f182652a.N();
    }

    @Override // so.i0
    public long b() {
        return this.f182652a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // so.i0
    public InputStream h() {
        return this.f182652a.h();
    }

    @Override // so.i0
    public long m() {
        return this.f182652a.m();
    }

    @Override // so.i0
    public int read() {
        return this.f182652a.read();
    }

    @Override // so.i0
    public void seek(long j15) {
        this.f182652a.seek(j15);
    }

    @Override // so.i0
    public long y() {
        return this.f182652a.y();
    }

    @Override // so.i0
    public int read(byte[] bArr, int i15, int i16) {
        return this.f182652a.read(bArr, i15, i16);
    }
}
