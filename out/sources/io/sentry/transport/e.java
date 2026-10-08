package io.sentry.transport;

import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.b7;
import io.sentry.c4;
import io.sentry.j0;
import io.sentry.o5;
import io.sentry.p5;
import io.sentry.q7;
import io.sentry.v0;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f95743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.cache.g f95744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q7 f95745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a0 f95746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r f95747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o f95748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile Runnable f95749g;

    private static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f95750a;

        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("SentryAsyncConnection-");
            int i15 = this.f95750a;
            this.f95750a = i15 + 1;
            sb5.append(i15);
            Thread thread = new Thread(runnable, sb5.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p5 f95751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final j0 f95752b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.sentry.cache.g f95753c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c0 f95754d = c0.a();

        c(p5 p5Var, j0 j0Var, io.sentry.cache.g gVar) {
            this.f95751a = (p5) io.sentry.util.v.c(p5Var, "Envelope is required.");
            this.f95752b = j0Var;
            this.f95753c = (io.sentry.cache.g) io.sentry.util.v.c(gVar, "EnvelopeCache is required.");
        }

        public static /* synthetic */ void a(c cVar, c0 c0Var, io.sentry.hints.p pVar) {
            e.this.f95745c.getLogger().c(b7.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(c0Var.d()));
            pVar.c(c0Var.d());
        }

        public static /* synthetic */ void b(c cVar, io.sentry.hints.f fVar) {
            if (!fVar.b(cVar.f95751a.b().a())) {
                e.this.f95745c.getLogger().c(b7.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
            } else {
                fVar.d();
                e.this.f95745c.getLogger().c(b7.DEBUG, "Disk flush envelope fired", new Object[0]);
            }
        }

        public static /* synthetic */ void d(c cVar, boolean z15, p5 p5Var, Object obj, Class cls) {
            if (z15) {
                cVar.getClass();
            } else {
                io.sentry.util.t.a(cls, obj, e.this.f95745c.getLogger());
                e.this.f95745c.getClientReportRecorder().b(io.sentry.clientreport.f.NETWORK_ERROR, p5Var);
            }
        }

        public static /* synthetic */ void e(c cVar, boolean z15, Object obj, Class cls) {
            if (z15) {
                cVar.getClass();
            } else {
                io.sentry.util.t.a(cls, obj, e.this.f95745c.getLogger());
                e.this.f95745c.getClientReportRecorder().b(io.sentry.clientreport.f.NETWORK_ERROR, cVar.f95751a);
            }
        }

        private c0 j() {
            c0 c0Var = this.f95754d;
            this.f95751a.b().d(null);
            final boolean zE3 = this.f95753c.e3(this.f95751a, this.f95752b);
            io.sentry.util.m.k(this.f95752b, io.sentry.hints.f.class, new io.sentry.util.m.a() { // from class: io.sentry.transport.g
                @Override // io.sentry.util.m.a
                public final void accept(Object obj) {
                    e.c.b(this.f95758a, (io.sentry.hints.f) obj);
                }
            });
            if (!e.this.f95747e.isConnected()) {
                io.sentry.util.m.l(this.f95752b, io.sentry.hints.k.class, new io.sentry.util.m.a() { // from class: io.sentry.transport.k
                    @Override // io.sentry.util.m.a
                    public final void accept(Object obj) {
                        ((io.sentry.hints.k) obj).d(true);
                    }
                }, new io.sentry.util.m.b() { // from class: io.sentry.transport.l
                    @Override // io.sentry.util.m.b
                    public final void a(Object obj, Class cls) {
                        e.c.e(this.f95764a, zE3, obj, cls);
                    }
                });
                return c0Var;
            }
            final p5 p5VarE = e.this.f95745c.getClientReportRecorder().e(this.f95751a);
            try {
                p5VarE.b().d(io.sentry.m.k(e.this.f95745c.getDateProvider().a().l()));
                c0 c0VarH = e.this.f95748f.h(p5VarE);
                if (c0VarH.d()) {
                    this.f95753c.t0(this.f95751a);
                    return c0VarH;
                }
                String str = "The transport failed to send the envelope with response code " + c0VarH.c();
                e.this.f95745c.getLogger().c(b7.ERROR, str, new Object[0]);
                if (c0VarH.c() >= 400 && c0VarH.c() != 429 && !zE3) {
                    io.sentry.util.m.j(this.f95752b, io.sentry.hints.k.class, new io.sentry.util.m.c() { // from class: io.sentry.transport.h
                        @Override // io.sentry.util.m.c
                        public final void accept(Object obj) {
                            e.this.f95745c.getClientReportRecorder().b(io.sentry.clientreport.f.NETWORK_ERROR, p5VarE);
                        }
                    });
                }
                throw new IllegalStateException(str);
            } catch (IOException e15) {
                io.sentry.util.m.l(this.f95752b, io.sentry.hints.k.class, new io.sentry.util.m.a() { // from class: io.sentry.transport.i
                    @Override // io.sentry.util.m.a
                    public final void accept(Object obj) {
                        ((io.sentry.hints.k) obj).d(true);
                    }
                }, new io.sentry.util.m.b() { // from class: io.sentry.transport.j
                    @Override // io.sentry.util.m.b
                    public final void a(Object obj, Class cls) {
                        e.c.d(this.f95761a, zE3, p5VarE, obj, cls);
                    }
                });
                throw new IllegalStateException("Sending the event failed.", e15);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.f95749g = this;
            final c0 c0VarJ = this.f95754d;
            try {
                c0VarJ = j();
                e.this.f95745c.getLogger().c(b7.DEBUG, "Envelope flushed", new Object[0]);
                io.sentry.util.m.k(this.f95752b, io.sentry.hints.p.class, new io.sentry.util.m.a() { // from class: io.sentry.transport.f
                    @Override // io.sentry.util.m.a
                    public final void accept(Object obj) {
                        e.c.a(this.f95756a, c0VarJ, (io.sentry.hints.p) obj);
                    }
                });
                e.this.f95749g = null;
            } catch (Throwable th4) {
                try {
                    e.this.f95745c.getLogger().a(b7.ERROR, th4, "Envelope submission failed", new Object[0]);
                    throw th4;
                } catch (Throwable th5) {
                    io.sentry.util.m.k(this.f95752b, io.sentry.hints.p.class, new io.sentry.util.m.a() { // from class: io.sentry.transport.f
                        @Override // io.sentry.util.m.a
                        public final void accept(Object obj) {
                            e.c.a(this.f95756a, c0VarJ, (io.sentry.hints.p) obj);
                        }
                    });
                    e.this.f95749g = null;
                    throw th5;
                }
            }
        }
    }

    public e(q7 q7Var, a0 a0Var, r rVar, c4 c4Var) {
        this(E(q7Var.getMaxQueueSize(), q7Var.getEnvelopeDiskCache(), q7Var.getLogger(), q7Var.getDateProvider()), q7Var, a0Var, rVar, new o(q7Var, c4Var, a0Var));
    }

    private static w E(int i15, final io.sentry.cache.g gVar, final v0 v0Var, o5 o5Var) {
        return new w(1, i15, new b(), new RejectedExecutionHandler() { // from class: io.sentry.transport.a
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                e.p(gVar, v0Var, runnable, threadPoolExecutor);
            }
        }, v0Var, o5Var);
    }

    private static void H(j0 j0Var, final boolean z15) {
        io.sentry.util.m.k(j0Var, io.sentry.hints.p.class, new io.sentry.util.m.a() { // from class: io.sentry.transport.c
            @Override // io.sentry.util.m.a
            public final void accept(Object obj) {
                ((io.sentry.hints.p) obj).c(false);
            }
        });
        io.sentry.util.m.k(j0Var, io.sentry.hints.k.class, new io.sentry.util.m.a() { // from class: io.sentry.transport.d
            @Override // io.sentry.util.m.a
            public final void accept(Object obj) {
                ((io.sentry.hints.k) obj).d(z15);
            }
        });
    }

    public static /* synthetic */ void h(e eVar, io.sentry.hints.g gVar) {
        eVar.getClass();
        gVar.b();
        eVar.f95745c.getLogger().c(b7.DEBUG, "Envelope enqueued", new Object[0]);
    }

    public static /* synthetic */ void p(io.sentry.cache.g gVar, v0 v0Var, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (runnable instanceof c) {
            c cVar = (c) runnable;
            if (!io.sentry.util.m.h(cVar.f95752b, io.sentry.hints.e.class)) {
                gVar.e3(cVar.f95751a, cVar.f95752b);
            }
            H(cVar.f95752b, true);
            v0Var.c(b7.WARNING, "Envelope rejected", new Object[0]);
        }
    }

    @Override // io.sentry.transport.q
    public a0 F() {
        return this.f95746d;
    }

    @Override // io.sentry.transport.q
    public void R0(p5 p5Var, j0 j0Var) {
        io.sentry.cache.g gVarE = this.f95744b;
        boolean z15 = false;
        if (io.sentry.util.m.h(j0Var, io.sentry.hints.e.class)) {
            gVarE = s.e();
            this.f95745c.getLogger().c(b7.DEBUG, "Captured Envelope is already cached", new Object[0]);
            z15 = true;
        }
        p5 p5VarY = this.f95746d.y(p5Var, j0Var);
        if (p5VarY == null) {
            if (z15) {
                this.f95744b.t0(p5Var);
                return;
            }
            return;
        }
        if (io.sentry.util.m.h(j0Var, UncaughtExceptionHandlerIntegration.a.class)) {
            p5VarY = this.f95745c.getClientReportRecorder().e(p5VarY);
        }
        Future<?> futureSubmit = this.f95743a.submit(new c(p5VarY, j0Var, gVarE));
        if (futureSubmit == null || !futureSubmit.isCancelled()) {
            io.sentry.util.m.k(j0Var, io.sentry.hints.g.class, new io.sentry.util.m.a() { // from class: io.sentry.transport.b
                @Override // io.sentry.util.m.a
                public final void accept(Object obj) {
                    e.h(this.f95738a, (io.sentry.hints.g) obj);
                }
            });
        } else {
            this.f95745c.getClientReportRecorder().b(io.sentry.clientreport.f.QUEUE_OVERFLOW, p5VarY);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        n(false);
    }

    @Override // io.sentry.transport.q
    public void n(boolean z15) {
        this.f95746d.close();
        this.f95743a.shutdown();
        this.f95745c.getLogger().c(b7.DEBUG, "Shutting down", new Object[0]);
        if (z15) {
            return;
        }
        try {
            long flushTimeoutMillis = this.f95745c.getFlushTimeoutMillis();
            if (this.f95743a.awaitTermination(flushTimeoutMillis, TimeUnit.MILLISECONDS)) {
                return;
            }
            this.f95745c.getLogger().c(b7.WARNING, "Failed to shutdown the async connection async sender  within " + flushTimeoutMillis + " ms. Trying to force it now.", new Object[0]);
            this.f95743a.shutdownNow();
            if (this.f95749g != null) {
                this.f95743a.getRejectedExecutionHandler().rejectedExecution(this.f95749g, this.f95743a);
            }
        } catch (InterruptedException unused) {
            this.f95745c.getLogger().c(b7.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.sentry.transport.q
    public void t(long j15) {
        this.f95743a.p(j15);
    }

    @Override // io.sentry.transport.q
    public boolean w() {
        return (this.f95746d.H() || this.f95743a.h()) ? false : true;
    }

    public e(w wVar, q7 q7Var, a0 a0Var, r rVar, o oVar) {
        this.f95749g = null;
        this.f95743a = (w) io.sentry.util.v.c(wVar, "executor is required");
        this.f95744b = (io.sentry.cache.g) io.sentry.util.v.c(q7Var.getEnvelopeDiskCache(), "envelopeCache is required");
        this.f95745c = (q7) io.sentry.util.v.c(q7Var, "options is required");
        this.f95746d = (a0) io.sentry.util.v.c(a0Var, "rateLimiter is required");
        this.f95747e = (r) io.sentry.util.v.c(rVar, "transportGate is required");
        this.f95748f = (o) io.sentry.util.v.c(oVar, "httpConnection is required");
    }
}
