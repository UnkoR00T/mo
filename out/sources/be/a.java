package be;

import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f18628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f18629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map<zd.f, c> f18630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReferenceQueue<p<?>> f18631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p.a f18632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f18633f;

    /* JADX INFO: renamed from: be.a$a, reason: collision with other inner class name */
    class ThreadFactoryC0470a implements ThreadFactory {

        /* JADX INFO: renamed from: be.a$a$a, reason: collision with other inner class name */
        class RunnableC0471a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f18634a;

            RunnableC0471a(Runnable runnable) {
                this.f18634a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f18634a.run();
            }
        }

        ThreadFactoryC0470a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0471a(runnable), "glide-active-resources");
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    static final class c extends WeakReference<p<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final zd.f f18637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f18638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        v<?> f18639c;

        c(zd.f fVar, p<?> pVar, ReferenceQueue<? super p<?>> referenceQueue, boolean z15) {
            super(pVar, referenceQueue);
            this.f18637a = (zd.f) ve.k.d(fVar);
            this.f18639c = (pVar.e() && z15) ? (v) ve.k.d(pVar.b()) : null;
            this.f18638b = pVar.e();
        }

        void a() {
            this.f18639c = null;
            clear();
        }
    }

    a(boolean z15) {
        this(z15, Executors.newSingleThreadExecutor(new ThreadFactoryC0470a()));
    }

    synchronized void a(zd.f fVar, p<?> pVar) {
        c cVarPut = this.f18630c.put(fVar, new c(fVar, pVar, this.f18631d, this.f18628a));
        if (cVarPut != null) {
            cVarPut.a();
        }
    }

    void b() {
        while (!this.f18633f) {
            try {
                c((c) this.f18631d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    void c(c cVar) {
        v<?> vVar;
        synchronized (this) {
            this.f18630c.remove(cVar.f18637a);
            if (cVar.f18638b && (vVar = cVar.f18639c) != null) {
                this.f18632e.a(cVar.f18637a, new p<>(vVar, true, false, cVar.f18637a, this.f18632e));
            }
        }
    }

    synchronized void d(zd.f fVar) {
        c cVarRemove = this.f18630c.remove(fVar);
        if (cVarRemove != null) {
            cVarRemove.a();
        }
    }

    synchronized p<?> e(zd.f fVar) {
        c cVar = this.f18630c.get(fVar);
        if (cVar == null) {
            return null;
        }
        p<?> pVar = cVar.get();
        if (pVar == null) {
            c(cVar);
        }
        return pVar;
    }

    void f(p.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f18632e = aVar;
            }
        }
    }

    a(boolean z15, Executor executor) {
        this.f18630c = new HashMap();
        this.f18631d = new ReferenceQueue<>();
        this.f18628a = z15;
        this.f18629b = executor;
        executor.execute(new b());
    }
}
