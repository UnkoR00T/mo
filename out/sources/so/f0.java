package so;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes4.dex */
class f0 extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RandomAccessFile f182626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f182627b;

    f0(File file, String str) {
        this.f182626a = null;
        this.f182627b = null;
        this.f182626a = new a(file, str, 16384);
        this.f182627b = file;
    }

    @Override // so.i0
    public short E() {
        return this.f182626a.readShort();
    }

    @Override // so.i0
    public int N() {
        return this.f182626a.readUnsignedShort();
    }

    @Override // so.i0
    public long b() {
        return this.f182626a.getFilePointer();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        RandomAccessFile randomAccessFile = this.f182626a;
        if (randomAccessFile != null) {
            randomAccessFile.close();
            this.f182626a = null;
        }
    }

    @Override // so.i0
    public InputStream h() {
        File file = this.f182627b;
        return io.sentry.instrumentation.file.h.b.a(new FileInputStream(file), file);
    }

    @Override // so.i0
    public long m() {
        return this.f182627b.length();
    }

    @Override // so.i0
    public int read() {
        return this.f182626a.read();
    }

    @Override // so.i0
    public void seek(long j15) throws IOException {
        this.f182626a.seek(j15);
    }

    @Override // so.i0
    public long y() {
        return this.f182626a.readLong();
    }

    @Override // so.i0
    public int read(byte[] bArr, int i15, int i16) {
        return this.f182626a.read(bArr, i15, i16);
    }
}
