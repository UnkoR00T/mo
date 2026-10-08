package y7;

import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f224859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f224860b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f224864f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f224862d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f224863e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f224861c = new byte[1];

    public h(f fVar, j jVar) {
        this.f224859a = fVar;
        this.f224860b = jVar;
    }

    private void b() {
        if (this.f224862d) {
            return;
        }
        this.f224859a.i(this.f224860b);
        this.f224862d = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f224863e) {
            return;
        }
        this.f224859a.close();
        this.f224863e = true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f224861c) == -1) {
            return -1;
        }
        return this.f224861c[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i15, int i16) {
        zj.p.w(!this.f224863e);
        b();
        int i17 = this.f224859a.read(bArr, i15, i16);
        if (i17 == -1) {
            return -1;
        }
        this.f224864f += (long) i17;
        return i17;
    }
}
