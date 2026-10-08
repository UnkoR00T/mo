package vv;

import java.io.EOFException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0003¨\u0006\u0010"}, d2 = {"Lvv/d;", "Lvv/j0;", "<init>", "()V", "Lvv/e;", "source", "", "byteCount", "Loq/i0;", "O3", "(Lvv/e;J)V", "flush", "Lvv/l0;", "R", "()Lvv/l0;", "close", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class d implements j0 {
    @Override // vv.j0
    public void O3(e source, long byteCount) throws EOFException {
        source.skip(byteCount);
    }

    @Override // vv.j0
    /* JADX INFO: renamed from: R */
    public l0 getF208339a() {
        return l0.f208410e;
    }

    @Override // vv.j0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // vv.j0, java.io.Flushable
    public void flush() {
    }
}
