package ou;

import ju.a3;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ou.m0, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\b2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0016\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u0015*\u00020\u00142\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lou/m0;", "T", "Lju/a3;", "value", "Ljava/lang/ThreadLocal;", "threadLocal", "<init>", "(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V", "Ltq/i;", "context", "M", "(Ltq/i;)Ljava/lang/Object;", "oldState", "Loq/i0;", "C1", "(Ltq/i;Ljava/lang/Object;)V", "Ltq/i$c;", "key", "D1", "(Ltq/i$c;)Ltq/i;", "Ltq/i$b;", "E", "m", "(Ltq/i$c;)Ltq/i$b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Object;", "b", "Ljava/lang/ThreadLocal;", "c", "Ltq/i$c;", "getKey", "()Ltq/i$c;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ThreadLocal<T> implements a3<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final T value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final java.lang.ThreadLocal<T> threadLocal;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final tq.i.c<?> key;

    public ThreadLocal(T t15, java.lang.ThreadLocal<T> threadLocal) {
        this.value = t15;
        this.threadLocal = threadLocal;
        this.key = new ThreadLocalKey(threadLocal);
    }

    @Override // ju.a3
    public void C1(tq.i context, T oldState) {
        this.threadLocal.set(oldState);
    }

    @Override // tq.i
    public tq.i D1(tq.i.c<?> key) {
        return fr.t.c(getKey(), key) ? tq.j.f191408a : this;
    }

    @Override // ju.a3
    public T M(tq.i context) {
        T t15 = this.threadLocal.get();
        this.threadLocal.set(this.value);
        return t15;
    }

    @Override // tq.i.b
    public tq.i.c<?> getKey() {
        return this.key;
    }

    @Override // tq.i.b, tq.i
    public <E extends tq.i.b> E m(tq.i.c<E> key) {
        if (fr.t.c(getKey(), key)) {
            return this;
        }
        return null;
    }

    @Override // tq.i
    public tq.i n0(tq.i iVar) {
        return a3.a.d(this, iVar);
    }

    @Override // tq.i
    public <R> R s1(R r15, er.p<? super R, ? super tq.i.b, ? extends R> pVar) {
        return (R) a3.a.a(this, r15, pVar);
    }

    public String toString() {
        return "ThreadLocal(value=" + this.value + ", threadLocal = " + this.threadLocal + ')';
    }
}
