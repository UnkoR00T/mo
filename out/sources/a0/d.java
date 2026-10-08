package a0;

import com.google.common.util.concurrent.q;
import i6.i;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p105prN.o2;

/* JADX INFO: loaded from: classes.dex */
public class d<V> implements q<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q<V> f1061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    androidx.concurrent.futures.c.a<V> f1062b;

    class a implements androidx.concurrent.futures.c.InterfaceC0250c<V> {
        a() {
        }

        @Override // androidx.concurrent.futures.c.InterfaceC0250c
        public Object a(androidx.concurrent.futures.c.a<V> aVar) {
            i.j(d.this.f1062b == null, "The result can only set once!");
            d.this.f1062b = aVar;
            return "FutureChain[" + d.this + "]";
        }
    }

    d(q<V> qVar) {
        this.f1061a = (q) i.g(qVar);
    }

    public static <V> d<V> a(q<V> qVar) {
        return qVar instanceof d ? (d) qVar : new d<>(qVar);
    }

    @Override // com.google.common.util.concurrent.q
    public void b(Runnable runnable, Executor executor) {
        this.f1061a.b(runnable, executor);
    }

    boolean c(V v15) {
        androidx.concurrent.futures.c.a<V> aVar = this.f1062b;
        if (aVar != null) {
            return aVar.c(v15);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z15) {
        return this.f1061a.cancel(z15);
    }

    boolean d(Throwable th4) {
        androidx.concurrent.futures.c.a<V> aVar = this.f1062b;
        if (aVar != null) {
            return aVar.f(th4);
        }
        return false;
    }

    public final <T> d<T> e(o2<? super V, T> o2Var, Executor executor) {
        return (d) f.n(this, o2Var, executor);
    }

    public final <T> d<T> f(a0.a<? super V, T> aVar, Executor executor) {
        return (d) f.o(this, aVar, executor);
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.f1061a.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f1061a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f1061a.isDone();
    }

    @Override // java.util.concurrent.Future
    public V get(long j15, TimeUnit timeUnit) {
        return this.f1061a.get(j15, timeUnit);
    }

    d() {
        this.f1061a = androidx.concurrent.futures.c.a(new a());
    }
}
