package vv;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0002\u0010\u0017¨\u0006\u0018"}, d2 = {"Lvv/m;", "Lvv/j0;", "delegate", "<init>", "(Lvv/j0;)V", "Lvv/e;", "source", "", "byteCount", "Loq/i0;", "O3", "(Lvv/e;J)V", "flush", "()V", "Lvv/l0;", "R", "()Lvv/l0;", "close", "", "toString", "()Ljava/lang/String;", "a", "Lvv/j0;", "()Lvv/j0;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class m implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j0 delegate;

    public m(j0 j0Var) {
        this.delegate = j0Var;
    }

    @Override // vv.j0
    public void O3(e source, long byteCount) {
        this.delegate.O3(source, byteCount);
    }

    @Override // vv.j0
    /* JADX INFO: renamed from: R */
    public l0 getF208339a() {
        return this.delegate.getF208339a();
    }

    @Override // vv.j0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // vv.j0, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
