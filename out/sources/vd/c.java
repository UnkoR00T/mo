package vd;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public class c extends Thread {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f206150g = v.f206224b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<n<?>> f206151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BlockingQueue<n<?>> f206152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f206153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q f206154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f206155e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f206156f;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f206157a;

        a(n nVar) {
            this.f206157a = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                c.this.f206152b.put(this.f206157a);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public c(BlockingQueue<n<?>> blockingQueue, BlockingQueue<n<?>> blockingQueue2, b bVar, q qVar) {
        this.f206151a = blockingQueue;
        this.f206152b = blockingQueue2;
        this.f206153c = bVar;
        this.f206154d = qVar;
        this.f206156f = new w(this, blockingQueue2, qVar);
    }

    private void b() {
        c(this.f206151a.take());
    }

    void c(n<?> nVar) {
        nVar.e("cache-queue-take");
        nVar.S(1);
        try {
            if (nVar.K()) {
                nVar.p("cache-discard-canceled");
                return;
            }
            b.a aVar = this.f206153c.get(nVar.t());
            if (aVar == null) {
                nVar.e("cache-miss");
                if (!this.f206156f.c(nVar)) {
                    this.f206152b.put(nVar);
                }
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (aVar.b(jCurrentTimeMillis)) {
                nVar.e("cache-hit-expired");
                nVar.T(aVar);
                if (!this.f206156f.c(nVar)) {
                    this.f206152b.put(nVar);
                }
                return;
            }
            nVar.e("cache-hit");
            p<?> pVarR = nVar.R(new k(aVar.f206142a, aVar.f206148g));
            nVar.e("cache-hit-parsed");
            if (!pVarR.b()) {
                nVar.e("cache-parsing-failed");
                this.f206153c.c(nVar.t(), true);
                nVar.T(null);
                if (!this.f206156f.c(nVar)) {
                    this.f206152b.put(nVar);
                }
                return;
            }
            if (aVar.c(jCurrentTimeMillis)) {
                nVar.e("cache-hit-refresh-needed");
                nVar.T(aVar);
                pVarR.f206220d = true;
                if (this.f206156f.c(nVar)) {
                    this.f206154d.c(nVar, pVarR);
                } else {
                    this.f206154d.a(nVar, pVarR, new a(nVar));
                }
            } else {
                this.f206154d.c(nVar, pVarR);
            }
        } finally {
            nVar.S(2);
        }
    }

    public void d() {
        this.f206155e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (f206150g) {
            v.e("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f206153c.a();
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.f206155e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                v.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
