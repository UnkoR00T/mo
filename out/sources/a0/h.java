package a0;

import com.google.common.util.concurrent.q;
import i6.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
class h<V> implements q<List<V>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    List<? extends q<? extends V>> f1075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    List<V> f1076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f1077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicInteger f1078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q<List<V>> f1079e = androidx.concurrent.futures.c.a(new a());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    androidx.concurrent.futures.c.a<List<V>> f1080f;

    class a implements androidx.concurrent.futures.c.InterfaceC0250c<List<V>> {
        a() {
        }

        @Override // androidx.concurrent.futures.c.InterfaceC0250c
        public Object a(androidx.concurrent.futures.c.a<List<V>> aVar) {
            i.j(h.this.f1080f == null, "The result can only set once!");
            h.this.f1080f = aVar;
            return "ListFuture[" + this + "]";
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.f1076b = null;
            hVar.f1075a = null;
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f1084b;

        c(int i15, q qVar) {
            this.f1083a = i15;
            this.f1084b = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.f(this.f1083a, this.f1084b);
        }
    }

    h(List<? extends q<? extends V>> list, boolean z15, Executor executor) {
        this.f1075a = (List) i.g(list);
        this.f1076b = new ArrayList(list.size());
        this.f1077c = z15;
        this.f1078d = new AtomicInteger(list.size());
        e(executor);
    }

    private void a() throws InterruptedException {
        List<? extends q<? extends V>> list = this.f1075a;
        if (list == null || isDone()) {
            return;
        }
        for (q<? extends V> qVar : list) {
            while (!qVar.isDone()) {
                try {
                    qVar.get();
                } catch (Error e15) {
                    throw e15;
                } catch (InterruptedException e16) {
                    throw e16;
                } catch (Throwable unused) {
                    if (this.f1077c) {
                        return;
                    }
                }
            }
        }
    }

    private void e(Executor executor) {
        b(new b(), z.a.a());
        if (this.f1075a.isEmpty()) {
            this.f1080f.c(new ArrayList(this.f1076b));
            return;
        }
        for (int i15 = 0; i15 < this.f1075a.size(); i15++) {
            this.f1076b.add(null);
        }
        List<? extends q<? extends V>> list = this.f1075a;
        for (int i16 = 0; i16 < list.size(); i16++) {
            q<? extends V> qVar = list.get(i16);
            qVar.b(new c(i16, qVar), executor);
        }
    }

    @Override // com.google.common.util.concurrent.q
    public void b(Runnable runnable, Executor executor) {
        this.f1079e.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public List<V> get() throws InterruptedException {
        a();
        return this.f1079e.get();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z15) {
        List<? extends q<? extends V>> list = this.f1075a;
        if (list != null) {
            Iterator<? extends q<? extends V>> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(z15);
            }
        }
        return this.f1079e.cancel(z15);
    }

    @Override // java.util.concurrent.Future
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public List<V> get(long j15, TimeUnit timeUnit) {
        return this.f1079e.get(j15, timeUnit);
    }

    void f(int i15, Future<? extends V> future) {
        androidx.concurrent.futures.c.a<List<V>> aVar;
        ArrayList arrayList;
        List<V> list = this.f1076b;
        if (isDone() || list == null) {
            i.j(this.f1077c, "Future was done before all dependencies completed");
            return;
        }
        try {
            try {
                try {
                    try {
                        try {
                            i.j(future.isDone(), "Tried to set value from future which is not done");
                            list.set(i15, (V) f.e(future));
                            int iDecrementAndGet = this.f1078d.decrementAndGet();
                            i.j(iDecrementAndGet >= 0, "Less than 0 remaining futures");
                            if (iDecrementAndGet == 0) {
                                List<V> list2 = this.f1076b;
                                if (list2 != null) {
                                    this.f1080f.c(new ArrayList(list2));
                                } else {
                                    i.i(isDone());
                                }
                            }
                        } catch (ExecutionException e15) {
                            if (this.f1077c) {
                                this.f1080f.f(e15.getCause());
                            }
                            int iDecrementAndGet2 = this.f1078d.decrementAndGet();
                            i.j(iDecrementAndGet2 >= 0, "Less than 0 remaining futures");
                            if (iDecrementAndGet2 == 0) {
                                List<V> list3 = this.f1076b;
                                if (list3 != null) {
                                    aVar = this.f1080f;
                                    arrayList = new ArrayList(list3);
                                    aVar.c(arrayList);
                                    return;
                                }
                                i.i(isDone());
                            }
                        }
                    } catch (CancellationException unused) {
                        if (this.f1077c) {
                            cancel(false);
                        }
                        int iDecrementAndGet3 = this.f1078d.decrementAndGet();
                        i.j(iDecrementAndGet3 >= 0, "Less than 0 remaining futures");
                        if (iDecrementAndGet3 == 0) {
                            List<V> list4 = this.f1076b;
                            if (list4 != null) {
                                aVar = this.f1080f;
                                arrayList = new ArrayList(list4);
                                aVar.c(arrayList);
                                return;
                            }
                            i.i(isDone());
                        }
                    }
                } catch (Error e16) {
                    this.f1080f.f(e16);
                    int iDecrementAndGet4 = this.f1078d.decrementAndGet();
                    i.j(iDecrementAndGet4 >= 0, "Less than 0 remaining futures");
                    if (iDecrementAndGet4 == 0) {
                        List<V> list5 = this.f1076b;
                        if (list5 != null) {
                            aVar = this.f1080f;
                            arrayList = new ArrayList(list5);
                            aVar.c(arrayList);
                            return;
                        }
                        i.i(isDone());
                    }
                }
            } catch (RuntimeException e17) {
                if (this.f1077c) {
                    this.f1080f.f(e17);
                }
                int iDecrementAndGet5 = this.f1078d.decrementAndGet();
                i.j(iDecrementAndGet5 >= 0, "Less than 0 remaining futures");
                if (iDecrementAndGet5 == 0) {
                    List<V> list6 = this.f1076b;
                    if (list6 != null) {
                        aVar = this.f1080f;
                        arrayList = new ArrayList(list6);
                        aVar.c(arrayList);
                        return;
                    }
                    i.i(isDone());
                }
            }
        } catch (Throwable th4) {
            int iDecrementAndGet6 = this.f1078d.decrementAndGet();
            i.j(iDecrementAndGet6 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet6 == 0) {
                List<V> list7 = this.f1076b;
                if (list7 != null) {
                    this.f1080f.c(new ArrayList(list7));
                } else {
                    i.i(isDone());
                }
            }
            throw th4;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f1079e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f1079e.isDone();
    }
}
