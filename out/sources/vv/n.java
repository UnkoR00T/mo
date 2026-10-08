package vv;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lvv/n;", "Lvv/k0;", "delegate", "<init>", "(Lvv/k0;)V", "Lvv/e;", "sink", "", "byteCount", "k3", "(Lvv/e;J)J", "Lvv/l0;", "R", "()Lvv/l0;", "Loq/i0;", "close", "()V", "", "toString", "()Ljava/lang/String;", "a", "Lvv/k0;", "b", "()Lvv/k0;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class n implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k0 delegate;

    public n(k0 k0Var) {
        this.delegate = k0Var;
    }

    @Override // vv.k0
    /* JADX INFO: renamed from: R */
    public l0 getF208341a() {
        return this.delegate.getF208341a();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final k0 getDelegate() {
        return this.delegate;
    }

    @Override // vv.k0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // vv.k0
    public long k3(e sink, long byteCount) {
        return this.delegate.k3(sink, byteCount);
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
