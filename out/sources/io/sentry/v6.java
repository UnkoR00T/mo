package io.sentry;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class v6 implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f95854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.util.a f95855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f95856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q7 f95857d;

    private static final class b<T> implements Future<T> {
        private b() {
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z15) {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get() {
            throw new CancellationException();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get(long j15, TimeUnit timeUnit) {
            throw new CancellationException();
        }
    }

    private static final class c implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f95858a;

        private c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("SentryExecutorServiceThreadFactory-");
            int i15 = this.f95858a;
            this.f95858a = i15 + 1;
            sb5.append(i15);
            Thread thread = new Thread(runnable, sb5.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    v6(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, q7 q7Var) {
        this.f95855b = new io.sentry.util.a();
        this.f95856c = new Runnable() { // from class: io.sentry.t6
            @Override // java.lang.Runnable
            public final void run() {
                v6.e();
            }
        };
        this.f95854a = scheduledThreadPoolExecutor;
        this.f95857d = q7Var;
    }

    public static /* synthetic */ void d(v6 v6Var) {
        v6Var.getClass();
        for (int i15 = 0; i15 < 40; i15++) {
            try {
                v6Var.f95854a.schedule(v6Var.f95856c, 365L, TimeUnit.DAYS).cancel(true);
            } catch (RejectedExecutionException unused) {
                return;
            }
        }
        v6Var.f95854a.purge();
    }

    public static /* synthetic */ void e() {
    }

    @Override // io.sentry.f1
    public void a(long j15) {
        g1 g1VarA = this.f95855b.a();
        try {
            if (!this.f95854a.isShutdown()) {
                this.f95854a.shutdown();
                try {
                    if (!this.f95854a.awaitTermination(j15, TimeUnit.MILLISECONDS)) {
                        this.f95854a.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    this.f95854a.shutdownNow();
                    Thread.currentThread().interrupt();
                }
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

    @Override // io.sentry.f1
    public void b() {
        this.f95854a.submit(new Runnable() { // from class: io.sentry.u6
            @Override // java.lang.Runnable
            public final void run() {
                v6.d(this.f95792a);
            }
        });
    }

    @Override // io.sentry.f1
    public Future<?> c(Runnable runnable, long j15) {
        if (this.f95854a.getQueue().size() < 271) {
            return this.f95854a.schedule(runnable, j15, TimeUnit.MILLISECONDS);
        }
        q7 q7Var = this.f95857d;
        if (q7Var != null) {
            q7Var.getLogger().c(b7.WARNING, "Task " + runnable + " rejected from " + this.f95854a, new Object[0]);
        }
        return new b();
    }

    @Override // io.sentry.f1
    public boolean isClosed() {
        g1 g1VarA = this.f95855b.a();
        try {
            boolean zIsShutdown = this.f95854a.isShutdown();
            if (g1VarA != null) {
                g1VarA.close();
            }
            return zIsShutdown;
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

    @Override // io.sentry.f1
    public Future<?> submit(Runnable runnable) {
        if (this.f95854a.getQueue().size() < 271) {
            return this.f95854a.submit(runnable);
        }
        q7 q7Var = this.f95857d;
        if (q7Var != null) {
            q7Var.getLogger().c(b7.WARNING, "Task " + runnable + " rejected from " + this.f95854a, new Object[0]);
        }
        return new b();
    }

    public v6(q7 q7Var) {
        this(new ScheduledThreadPoolExecutor(1, new c()), q7Var);
    }

    public v6() {
        this(new ScheduledThreadPoolExecutor(1, new c()), null);
    }
}
