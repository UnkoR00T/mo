package z;

import CON.k0;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.common.util.concurrent.q;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class c extends AbstractExecutorService implements ScheduledExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ThreadLocal<ScheduledExecutorService> f230973b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f230974a;

    class a extends ThreadLocal<ScheduledExecutorService> {
        a() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return z.a.d();
            }
            if (Looper.myLooper() != null) {
                return new c(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    class b implements Callable<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f230975a;

        b(Runnable runnable) {
            this.f230975a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            this.f230975a.run();
            return null;
        }
    }

    /* JADX INFO: renamed from: z.c$c, reason: collision with other inner class name */
    private static class RunnableScheduledFutureC6215c<V> implements RunnableScheduledFuture<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReference<androidx.concurrent.futures.c.a<V>> f230977a = new AtomicReference<>(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f230978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Callable<V> f230979c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final q<V> f230980d;

        /* JADX INFO: renamed from: z.c$c$a */
        class a implements androidx.concurrent.futures.c.InterfaceC0250c<V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Handler f230981a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Callable f230982b;

            /* JADX INFO: renamed from: z.c$c$a$a, reason: collision with other inner class name */
            class RunnableC6216a implements Runnable {
                RunnableC6216a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (RunnableScheduledFutureC6215c.this.f230977a.getAndSet(null) != null) {
                        a aVar = a.this;
                        aVar.f230981a.removeCallbacks(RunnableScheduledFutureC6215c.this);
                    }
                }
            }

            a(Handler handler, Callable callable) {
                this.f230981a = handler;
                this.f230982b = callable;
            }

            @Override // androidx.concurrent.futures.c.InterfaceC0250c
            public Object a(androidx.concurrent.futures.c.a<V> aVar) {
                aVar.a(new RunnableC6216a(), z.a.a());
                RunnableScheduledFutureC6215c.this.f230977a.set(aVar);
                return "HandlerScheduledFuture-" + this.f230982b.toString();
            }
        }

        RunnableScheduledFutureC6215c(Handler handler, long j15, Callable<V> callable) {
            this.f230978b = j15;
            this.f230979c = callable;
            this.f230980d = androidx.concurrent.futures.c.a(new a(handler, callable));
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z15) {
            return this.f230980d.cancel(z15);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public V get() {
            return this.f230980d.get();
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f230978b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f230980d.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f230980d.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            androidx.concurrent.futures.c.a andSet = this.f230977a.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.c(this.f230979c.call());
                } catch (Exception e15) {
                    andSet.f(e15);
                }
            }
        }

        @Override // java.util.concurrent.Future
        public V get(long j15, TimeUnit timeUnit) {
            return this.f230980d.get(j15, timeUnit);
        }
    }

    c(Handler handler) {
        this.f230974a = handler;
    }

    private RejectedExecutionException h() {
        return new RejectedExecutionException(this.f230974a + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j15, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        k0.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (!this.f230974a.post(runnable)) {
            throw h();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j15, TimeUnit timeUnit) {
        return schedule(new b(runnable), j15, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j15, long j16, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j15, long j16, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j15, TimeUnit timeUnit) {
        long jUptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j15, timeUnit);
        RunnableScheduledFutureC6215c runnableScheduledFutureC6215c = new RunnableScheduledFutureC6215c(this.f230974a, jUptimeMillis, callable);
        return this.f230974a.postAtTime(runnableScheduledFutureC6215c, jUptimeMillis) ? runnableScheduledFutureC6215c : a0.f.g(h());
    }
}
