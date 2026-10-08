package ve;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends InputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Queue<d> f206278c = l.f(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InputStream f206279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IOException f206280b;

    d() {
    }

    public static d h(InputStream inputStream) {
        d dVarPoll;
        Queue<d> queue = f206278c;
        synchronized (queue) {
            dVarPoll = queue.poll();
        }
        if (dVarPoll == null) {
            dVarPoll = new d();
        }
        dVarPoll.p(inputStream);
        return dVarPoll;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f206279a.available();
    }

    public IOException b() {
        return this.f206280b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f206279a.close();
    }

    public void m() {
        this.f206280b = null;
        this.f206279a = null;
        Queue<d> queue = f206278c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public void mark(int i15) {
        this.f206279a.mark(i15);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f206279a.markSupported();
    }

    void p(InputStream inputStream) {
        this.f206279a = inputStream;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f206279a.read();
        } catch (IOException e15) {
            this.f206280b = e15;
            throw e15;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f206279a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j15) throws IOException {
        try {
            return this.f206279a.skip(j15);
        } catch (IOException e15) {
            this.f206280b = e15;
            throw e15;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f206279a.read(bArr);
        } catch (IOException e15) {
            this.f206280b = e15;
            throw e15;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i15, int i16) throws IOException {
        try {
            return this.f206279a.read(bArr, i15, i16);
        } catch (IOException e15) {
            this.f206280b = e15;
            throw e15;
        }
    }
}
