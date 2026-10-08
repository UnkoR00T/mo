package io.sentry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f95284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final q7 f95285g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.util.a f95279a = new io.sentry.util.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Timer f95280b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, List<q3>> f95281c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f95286h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f95287i = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<z0> f95282d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<y0> f95283e = new ArrayList();

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Iterator it = p.this.f95282d.iterator();
            while (it.hasNext()) {
                ((z0) it.next()).c();
            }
        }
    }

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - p.this.f95287i <= 10) {
                return;
            }
            p.this.f95287i = jCurrentTimeMillis;
            q3 q3Var = new q3(new i7().l());
            Iterator it = p.this.f95282d.iterator();
            while (it.hasNext()) {
                ((z0) it.next()).d(q3Var);
            }
            Iterator it4 = p.this.f95281c.values().iterator();
            while (it4.hasNext()) {
                ((List) it4.next()).add(q3Var);
            }
        }
    }

    public p(q7 q7Var) {
        boolean z15 = false;
        this.f95285g = (q7) io.sentry.util.v.c(q7Var, "The options object is required.");
        for (x0 x0Var : q7Var.getPerformanceCollectors()) {
            if (x0Var instanceof z0) {
                this.f95282d.add((z0) x0Var);
            }
            if (x0Var instanceof y0) {
                this.f95283e.add((y0) x0Var);
            }
        }
        if (this.f95282d.isEmpty() && this.f95283e.isEmpty()) {
            z15 = true;
        }
        this.f95284f = z15;
    }

    @Override // io.sentry.j
    public void a(j1 j1Var) {
        Iterator<y0> it = this.f95283e.iterator();
        while (it.hasNext()) {
            it.next().a(j1Var);
        }
    }

    @Override // io.sentry.j
    public void b(j1 j1Var) {
        Iterator<y0> it = this.f95283e.iterator();
        while (it.hasNext()) {
            it.next().b(j1Var);
        }
    }

    @Override // io.sentry.j
    public List<q3> c(String str) {
        List<q3> listRemove = this.f95281c.remove(str);
        if (this.f95281c.isEmpty()) {
            close();
        }
        return listRemove;
    }

    @Override // io.sentry.j
    public void close() {
        this.f95285g.getLogger().c(b7.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        this.f95281c.clear();
        Iterator<y0> it = this.f95283e.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        if (this.f95286h.getAndSet(false)) {
            g1 g1VarA = this.f95279a.a();
            try {
                if (this.f95280b != null) {
                    this.f95280b.cancel();
                    this.f95280b = null;
                }
                if (g1VarA != null) {
                    g1VarA.close();
                }
            } catch (Throwable th4) {
                if (g1VarA != null) {
                    try {
                        g1VarA.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        }
    }

    @Override // io.sentry.j
    public List<q3> d(l1 l1Var) {
        this.f95285g.getLogger().c(b7.DEBUG, "stop collecting performance info for transactions %s (%s)", l1Var.getName(), l1Var.w().n().toString());
        Iterator<y0> it = this.f95283e.iterator();
        while (it.hasNext()) {
            it.next().a(l1Var);
        }
        return c(l1Var.i().toString());
    }

    @Override // io.sentry.j
    public void e(final l1 l1Var) {
        if (this.f95284f) {
            this.f95285g.getLogger().c(b7.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        Iterator<y0> it = this.f95283e.iterator();
        while (it.hasNext()) {
            it.next().b(l1Var);
        }
        if (!this.f95281c.containsKey(l1Var.i().toString())) {
            this.f95281c.put(l1Var.i().toString(), new ArrayList());
            try {
                this.f95285g.getExecutorService().c(new Runnable() { // from class: io.sentry.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f95231a.d(l1Var);
                    }
                }, 30000L);
            } catch (RejectedExecutionException e15) {
                this.f95285g.getLogger().b(b7.ERROR, "Failed to call the executor. Performance collector will not be automatically finished. Did you call Sentry.close()?", e15);
            }
        }
        f(l1Var.i().toString());
    }

    @Override // io.sentry.j
    public void f(String str) {
        if (this.f95284f) {
            this.f95285g.getLogger().c(b7.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        if (!this.f95281c.containsKey(str)) {
            this.f95281c.put(str, new ArrayList());
        }
        if (this.f95286h.getAndSet(true)) {
            return;
        }
        g1 g1VarA = this.f95279a.a();
        try {
            if (this.f95280b == null) {
                this.f95280b = new Timer(true);
            }
            this.f95280b.schedule(new a(), 0L);
            this.f95280b.scheduleAtFixedRate(new b(), 100L, 100L);
            if (g1VarA != null) {
                g1VarA.close();
            }
        } catch (Throwable th4) {
            if (g1VarA == null) {
                throw th4;
            }
            try {
                g1VarA.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }
}
