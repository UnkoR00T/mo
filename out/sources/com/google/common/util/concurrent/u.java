package com.google.common.util.concurrent;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class u {

    class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Executor f35967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.a f35968b;

        a(Executor executor, com.google.common.util.concurrent.a aVar) {
            this.f35967a = executor;
            this.f35968b = aVar;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                this.f35967a.execute(runnable);
            } catch (RejectedExecutionException e15) {
                this.f35968b.D(e15);
            }
        }
    }

    private static class b extends com.google.common.util.concurrent.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ExecutorService f35969a;

        b(ExecutorService executorService) {
            this.f35969a = (ExecutorService) zj.p.q(executorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j15, TimeUnit timeUnit) {
            return this.f35969a.awaitTermination(j15, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f35969a.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.f35969a.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.f35969a.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.f35969a.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return this.f35969a.shutdownNow();
        }

        public final String toString() {
            return super.toString() + "[" + this.f35969a + "]";
        }
    }

    private static final class c extends b implements t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ScheduledExecutorService f35970b;

        private static final class a<V> extends i.a<V> implements r<V> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final ScheduledFuture<?> f35971b;

            public a(q<V> qVar, ScheduledFuture<?> scheduledFuture) {
                super(qVar);
                this.f35971b = scheduledFuture;
            }

            @Override // com.google.common.util.concurrent.h, java.util.concurrent.Future
            public boolean cancel(boolean z15) {
                boolean zCancel = super.cancel(z15);
                if (zCancel) {
                    this.f35971b.cancel(z15);
                }
                return zCancel;
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit timeUnit) {
                return this.f35971b.getDelay(timeUnit);
            }

            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public int compareTo(Delayed delayed) {
                return this.f35971b.compareTo(delayed);
            }
        }

        private static final class b extends com.google.common.util.concurrent.a.j<Void> implements Runnable {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final Runnable f35972h;

            public b(Runnable runnable) {
                this.f35972h = (Runnable) zj.p.q(runnable);
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f35972h.run();
                } catch (Throwable th4) {
                    D(th4);
                    throw th4;
                }
            }

            @Override // com.google.common.util.concurrent.a
            protected String z() {
                return "task=[" + this.f35972h + "]";
            }
        }

        c(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.f35970b = (ScheduledExecutorService) zj.p.q(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public r<?> schedule(Runnable runnable, long j15, TimeUnit timeUnit) {
            a0 a0VarJ = a0.J(runnable, null);
            return new a(a0VarJ, this.f35970b.schedule(a0VarJ, j15, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public <V> r<V> schedule(Callable<V> callable, long j15, TimeUnit timeUnit) {
            a0 a0VarK = a0.K(callable);
            return new a(a0VarK, this.f35970b.schedule(a0VarK, j15, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public r<?> scheduleAtFixedRate(Runnable runnable, long j15, long j16, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.f35970b.scheduleAtFixedRate(bVar, j15, j16, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public r<?> scheduleWithFixedDelay(Runnable runnable, long j15, long j16, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.f35970b.scheduleWithFixedDelay(bVar, j15, j16, timeUnit));
        }
    }

    public static Executor a() {
        return e.INSTANCE;
    }

    public static t b(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof t ? (t) scheduledExecutorService : new c(scheduledExecutorService);
    }

    public static Executor c(Executor executor) {
        return new y(executor);
    }

    static Executor d(Executor executor, com.google.common.util.concurrent.a<?> aVar) {
        zj.p.q(executor);
        zj.p.q(aVar);
        return executor == a() ? executor : new a(executor, aVar);
    }
}
