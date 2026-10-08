package vv;

import java.io.IOException;
import java.io.InputStream;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: vv.r, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0012\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lvv/r;", "Lvv/k0;", "Ljava/io/InputStream;", "input", "Lvv/l0;", "timeout", "<init>", "(Ljava/io/InputStream;Lvv/l0;)V", "Lvv/e;", "sink", "", "byteCount", "k3", "(Lvv/e;J)J", "Loq/i0;", "close", "()V", "R", "()Lvv/l0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/io/InputStream;", "b", "Lvv/l0;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
class source implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InputStream input;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l0 timeout;

    public source(InputStream inputStream, l0 l0Var) {
        this.input = inputStream;
        this.timeout = l0Var;
    }

    @Override // vv.k0
    /* JADX INFO: renamed from: R, reason: from getter */
    public l0 getTimeout() {
        return this.timeout;
    }

    @Override // vv.k0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.input.close();
    }

    @Override // vv.k0
    public long k3(e sink, long byteCount) throws IOException {
        if (byteCount == 0) {
            return 0L;
        }
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        try {
            this.timeout.f();
            g0 g0VarT1 = sink.T1(1);
            int i15 = this.input.read(g0VarT1.data, g0VarT1.limit, (int) Math.min(byteCount, 8192 - g0VarT1.limit));
            if (i15 != -1) {
                g0VarT1.limit += i15;
                long j15 = i15;
                sink.i1(sink.getSize() + j15);
                return j15;
            }
            if (g0VarT1.pos != g0VarT1.limit) {
                return -1L;
            }
            sink.head = g0VarT1.b();
            h0.b(g0VarT1);
            return -1L;
        } catch (AssertionError e15) {
            if (wv.t.b(e15)) {
                throw new IOException(e15);
            }
            throw e15;
        }
    }

    public String toString() {
        return "source(" + this.input + ')';
    }
}
