package pm;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final o f160834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f160835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f160836c;

    public k() {
        this.f160835b = new AtomicInteger(0);
        this.f160836c = new AtomicBoolean(false);
        this.f160834a = new o();
    }

    public <T> vh.l<T> a(final Executor executor, final Callable<T> callable, final vh.a aVar) {
        jg.s.o(this.f160835b.get() > 0);
        if (aVar.a()) {
            return vh.o.d();
        }
        final vh.b bVar = new vh.b();
        final vh.m mVar = new vh.m(bVar.b());
        this.f160834a.a(new Executor() { // from class: pm.z
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e15) {
                    if (aVar.a()) {
                        bVar.a();
                    } else {
                        mVar.b(e15);
                    }
                    throw e15;
                }
            }
        }, new Runnable() { // from class: pm.a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f160811a.g(aVar, bVar, callable, mVar);
            }
        });
        return mVar.a();
    }

    public abstract void b();

    public void c() {
        this.f160835b.incrementAndGet();
    }

    protected abstract void d();

    public void e(Executor executor) {
        f(executor);
    }

    public vh.l<Void> f(Executor executor) {
        jg.s.o(this.f160835b.get() > 0);
        final vh.m mVar = new vh.m();
        this.f160834a.a(executor, new Runnable() { // from class: pm.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f160891a.h(mVar);
            }
        });
        return mVar.a();
    }

    final /* synthetic */ void g(vh.a aVar, vh.b bVar, Callable callable, vh.m mVar) {
        try {
            if (aVar.a()) {
                bVar.a();
                return;
            }
            try {
                if (!this.f160836c.get()) {
                    b();
                    this.f160836c.set(true);
                }
                if (aVar.a()) {
                    bVar.a();
                    return;
                }
                Object objCall = callable.call();
                if (aVar.a()) {
                    bVar.a();
                } else {
                    mVar.c(objCall);
                }
            } catch (RuntimeException e15) {
                throw new lm.a("Internal error has occurred when executing ML Kit tasks", 13, e15);
            }
        } catch (Exception e16) {
            if (aVar.a()) {
                bVar.a();
            } else {
                mVar.b(e16);
            }
        }
    }

    final /* synthetic */ void h(vh.m mVar) {
        int iDecrementAndGet = this.f160835b.decrementAndGet();
        jg.s.o(iDecrementAndGet >= 0);
        if (iDecrementAndGet == 0) {
            d();
            this.f160836c.set(false);
        }
        bh.b0.a();
        mVar.c(null);
    }

    protected k(o oVar) {
        this.f160835b = new AtomicInteger(0);
        this.f160836c = new AtomicBoolean(false);
        this.f160834a = oVar;
    }
}
