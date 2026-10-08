package vv;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0002\u001a\u00020\u00018\u0007@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u0004¨\u0006\u001e"}, d2 = {"Lvv/o;", "Lvv/l0;", "delegate", "<init>", "(Lvv/l0;)V", "j", "(Lvv/l0;)Lvv/o;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "g", "(JLjava/util/concurrent/TimeUnit;)Lvv/l0;", "", "e", "()Z", "c", "()J", "deadlineNanoTime", "d", "(J)Lvv/l0;", "b", "()Lvv/l0;", "a", "Loq/i0;", "f", "()V", "Lvv/l0;", "i", "setDelegate", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class o extends l0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private l0 delegate;

    public o(l0 l0Var) {
        this.delegate = l0Var;
    }

    @Override // vv.l0
    public l0 a() {
        return this.delegate.a();
    }

    @Override // vv.l0
    public l0 b() {
        return this.delegate.b();
    }

    @Override // vv.l0
    public long c() {
        return this.delegate.c();
    }

    @Override // vv.l0
    public l0 d(long deadlineNanoTime) {
        return this.delegate.d(deadlineNanoTime);
    }

    @Override // vv.l0
    /* JADX INFO: renamed from: e */
    public boolean getHasDeadline() {
        return this.delegate.getHasDeadline();
    }

    @Override // vv.l0
    public void f() throws InterruptedIOException {
        this.delegate.f();
    }

    @Override // vv.l0
    public l0 g(long timeout, TimeUnit unit) {
        return this.delegate.g(timeout, unit);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final l0 getDelegate() {
        return this.delegate;
    }

    public final o j(l0 delegate) {
        this.delegate = delegate;
        return this;
    }
}
