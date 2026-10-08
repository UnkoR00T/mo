package a0;

import com.google.common.util.concurrent.q;
import i6.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import p105prN.o2;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o2<?, ?> f1065a = new b();

    /* JADX INFO: Add missing generic type declarations: [I, O] */
    class a<I, O> implements a0.a<I, O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o2 f1066a;

        a(o2 o2Var) {
            this.f1066a = o2Var;
        }

        @Override // a0.a
        public q<O> apply(I i15) {
            return f.h(this.f1066a.apply(i15));
        }
    }

    class b implements o2<Object, Object> {
        b() {
        }

        @Override // p105prN.o2
        public Object apply(Object obj) {
            return obj;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    class c<I> implements a0.c<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.c.a f1067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o2 f1068b;

        c(androidx.concurrent.futures.c.a aVar, o2 o2Var) {
            this.f1067a = aVar;
            this.f1068b = o2Var;
        }

        @Override // a0.c
        public void a(I i15) {
            try {
                this.f1067a.c(this.f1068b.apply(i15));
            } catch (Throwable th4) {
                this.f1067a.f(th4);
            }
        }

        @Override // a0.c
        public void b(Throwable th4) {
            this.f1067a.f(th4);
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f1069a;

        d(q qVar) {
            this.f1069a = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1069a.cancel(true);
        }
    }

    private static final class e<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Future<V> f1070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final a0.c<? super V> f1071b;

        e(Future<V> future, a0.c<? super V> cVar) {
            this.f1070a = future;
            this.f1071b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f1071b.a(f.d(this.f1070a));
            } catch (Error e15) {
                e = e15;
                this.f1071b.b(e);
            } catch (RuntimeException e16) {
                e = e16;
                this.f1071b.b(e);
            } catch (ExecutionException e17) {
                Throwable cause = e17.getCause();
                if (cause == null) {
                    this.f1071b.b(e17);
                } else {
                    this.f1071b.b(cause);
                }
            }
        }

        public String toString() {
            return e.class.getSimpleName() + "," + this.f1071b;
        }
    }

    public static /* synthetic */ Object a(q qVar, androidx.concurrent.futures.c.a aVar) {
        l(false, qVar, f1065a, aVar, z.a.a());
        return "nonCancellationPropagating[" + qVar + "]";
    }

    public static <V> void b(q<V> qVar, a0.c<? super V> cVar, Executor executor) {
        i.g(cVar);
        qVar.b(new e(qVar, cVar), executor);
    }

    public static <V> q<List<V>> c(Collection<? extends q<? extends V>> collection) {
        return new h(new ArrayList(collection), true, z.a.a());
    }

    public static <V> V d(Future<V> future) {
        i.j(future.isDone(), "Future was expected to be done, " + future);
        return (V) e(future);
    }

    public static <V> V e(Future<V> future) {
        V v15;
        boolean z15 = false;
        while (true) {
            try {
                v15 = future.get();
                break;
            } catch (InterruptedException unused) {
                z15 = true;
            } catch (Throwable th4) {
                if (z15) {
                    Thread.currentThread().interrupt();
                }
                throw th4;
            }
        }
        if (z15) {
            Thread.currentThread().interrupt();
        }
        return v15;
    }

    public static <V> q<V> f(Throwable th4) {
        return new g.a(th4);
    }

    public static <V> ScheduledFuture<V> g(Throwable th4) {
        return new g.b(th4);
    }

    public static <V> q<V> h(V v15) {
        return v15 == null ? g.e() : new g.c(v15);
    }

    public static <V> q<V> i(final q<V> qVar) {
        i.g(qVar);
        return qVar.isDone() ? qVar : androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0250c() { // from class: a0.e
            @Override // androidx.concurrent.futures.c.InterfaceC0250c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return f.a(qVar, aVar);
            }
        });
    }

    public static <V> void j(q<V> qVar, androidx.concurrent.futures.c.a<V> aVar) {
        k(qVar, f1065a, aVar, z.a.a());
    }

    public static <I, O> void k(q<I> qVar, o2<? super I, ? extends O> o2Var, androidx.concurrent.futures.c.a<O> aVar, Executor executor) {
        l(true, qVar, o2Var, aVar, executor);
    }

    private static <I, O> void l(boolean z15, q<I> qVar, o2<? super I, ? extends O> o2Var, androidx.concurrent.futures.c.a<O> aVar, Executor executor) {
        i.g(qVar);
        i.g(o2Var);
        i.g(aVar);
        i.g(executor);
        b(qVar, new c(aVar, o2Var), executor);
        if (z15) {
            aVar.a(new d(qVar), z.a.a());
        }
    }

    public static <V> q<List<V>> m(Collection<? extends q<? extends V>> collection) {
        return new h(new ArrayList(collection), false, z.a.a());
    }

    public static <I, O> q<O> n(q<I> qVar, o2<? super I, ? extends O> o2Var, Executor executor) {
        i.g(o2Var);
        return o(qVar, new a(o2Var), executor);
    }

    public static <I, O> q<O> o(q<I> qVar, a0.a<? super I, ? extends O> aVar, Executor executor) {
        a0.b bVar = new a0.b(aVar, qVar);
        qVar.b(bVar, executor);
        return bVar;
    }
}
