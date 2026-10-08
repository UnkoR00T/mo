package vv;

import java.io.IOException;
import java.io.OutputStream;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: vv.a0, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lvv/a0;", "Lvv/j0;", "Ljava/io/OutputStream;", "out", "Lvv/l0;", "timeout", "<init>", "(Ljava/io/OutputStream;Lvv/l0;)V", "Lvv/e;", "source", "", "byteCount", "Loq/i0;", "O3", "(Lvv/e;J)V", "flush", "()V", "close", "R", "()Lvv/l0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/io/OutputStream;", "b", "Lvv/l0;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class sink implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final OutputStream out;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l0 timeout;

    public sink(OutputStream outputStream, l0 l0Var) {
        this.out = outputStream;
        this.timeout = l0Var;
    }

    @Override // vv.j0
    public void O3(e source, long byteCount) throws IOException {
        b.b(source.getSize(), 0L, byteCount);
        while (byteCount > 0) {
            this.timeout.f();
            g0 g0Var = source.head;
            int iMin = (int) Math.min(byteCount, g0Var.limit - g0Var.pos);
            this.out.write(g0Var.data, g0Var.pos, iMin);
            g0Var.pos += iMin;
            long j15 = iMin;
            byteCount -= j15;
            source.i1(source.getSize() - j15);
            if (g0Var.pos == g0Var.limit) {
                source.head = g0Var.b();
                h0.b(g0Var);
            }
        }
    }

    @Override // vv.j0
    /* JADX INFO: renamed from: R, reason: from getter */
    public l0 getTimeout() {
        return this.timeout;
    }

    @Override // vv.j0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.out.close();
    }

    @Override // vv.j0, java.io.Flushable
    public void flush() throws IOException {
        this.out.flush();
    }

    public String toString() {
        return "sink(" + this.out + ')';
    }
}
