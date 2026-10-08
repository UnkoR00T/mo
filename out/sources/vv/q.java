package vv;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lvv/q;", "Lvv/k0;", "Lvv/g;", "source", "Ljava/util/zip/Inflater;", "inflater", "<init>", "(Lvv/g;Ljava/util/zip/Inflater;)V", "(Lvv/k0;Ljava/util/zip/Inflater;)V", "Loq/i0;", "m", "()V", "Lvv/e;", "sink", "", "byteCount", "k3", "(Lvv/e;J)J", "b", "", "h", "()Z", "Lvv/l0;", "R", "()Lvv/l0;", "close", "a", "Lvv/g;", "Ljava/util/zip/Inflater;", "", "c", "I", "bufferBytesHeldByInflater", "d", "Z", "closed", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g source;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Inflater inflater;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int bufferBytesHeldByInflater;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    public q(g gVar, Inflater inflater) {
        this.source = gVar;
        this.inflater = inflater;
    }

    private final void m() {
        int i15 = this.bufferBytesHeldByInflater;
        if (i15 == 0) {
            return;
        }
        int remaining = i15 - this.inflater.getRemaining();
        this.bufferBytesHeldByInflater -= remaining;
        this.source.skip(remaining);
    }

    @Override // vv.k0
    /* JADX INFO: renamed from: R */
    public l0 getTimeout() {
        return this.source.getTimeout();
    }

    public final long b(e sink, long byteCount) throws IOException {
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (byteCount == 0) {
            return 0L;
        }
        try {
            g0 g0VarT1 = sink.T1(1);
            int iMin = (int) Math.min(byteCount, 8192 - g0VarT1.limit);
            h();
            int iInflate = this.inflater.inflate(g0VarT1.data, g0VarT1.limit, iMin);
            m();
            if (iInflate > 0) {
                g0VarT1.limit += iInflate;
                long j15 = iInflate;
                sink.i1(sink.getSize() + j15);
                return j15;
            }
            if (g0VarT1.pos == g0VarT1.limit) {
                sink.head = g0VarT1.b();
                h0.b(g0VarT1);
            }
            return 0L;
        } catch (DataFormatException e15) {
            throw new IOException(e15);
        }
    }

    @Override // vv.k0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.inflater.end();
        this.closed = true;
        this.source.close();
    }

    public final boolean h() {
        if (!this.inflater.needsInput()) {
            return false;
        }
        if (this.source.K2()) {
            return true;
        }
        g0 g0Var = this.source.getBufferField().head;
        int i15 = g0Var.limit;
        int i16 = g0Var.pos;
        int i17 = i15 - i16;
        this.bufferBytesHeldByInflater = i17;
        this.inflater.setInput(g0Var.data, i16, i17);
        return false;
    }

    @Override // vv.k0
    public long k3(e sink, long byteCount) {
        do {
            long jB = b(sink, byteCount);
            if (jB > 0) {
                return jB;
            }
            if (this.inflater.finished() || this.inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.source.K2());
        throw new EOFException("source exhausted prematurely");
    }

    public q(k0 k0Var, Inflater inflater) {
        this(v.c(k0Var), inflater);
    }
}
