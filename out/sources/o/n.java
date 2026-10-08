package o;

import android.os.Process;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class n implements Executor, ScheduledExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ThreadFactory f140080c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f140081a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ScheduledThreadPoolExecutor f140082b = m();

    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f140083a = new AtomicInteger(0);

        a() {
        }

        public static /* synthetic */ void a(Runnable runnable) {
            Process.setThreadPriority(-3);
            runnable.run();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable runnable) {
            Thread thread = new Thread(new Runnable() { // from class: o.m
                @Override // java.lang.Runnable
                public final void run() {
                    n.a.a(runnable);
                }
            });
            thread.setPriority(7);
            thread.setName(String.format(Locale.US, "CameraX-core_camera_%d", Integer.valueOf(this.f140083a.getAndIncrement())));
            return thread;
        }
    }

    private static ScheduledThreadPoolExecutor m() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, f140080c);
        scheduledThreadPoolExecutor.setKeepAliveTime(0L, TimeUnit.MILLISECONDS);
        scheduledThreadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: o.l
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                e1.o("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
            }
        });
        return scheduledThreadPoolExecutor;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j15, TimeUnit timeUnit) {
        boolean zAwaitTermination;
        synchronized (this.f140081a) {
            zAwaitTermination = this.f140082b.awaitTermination(j15, timeUnit);
        }
        return zAwaitTermination;
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        CON.k0.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        i6.i.g(runnable);
        synchronized (this.f140081a) {
            this.f140082b.execute(runnable);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        List<Future<T>> listInvokeAll;
        synchronized (this.f140081a) {
            listInvokeAll = this.f140082b.invokeAll(collection);
        }
        return listInvokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        T t15;
        synchronized (this.f140081a) {
            t15 = (T) this.f140082b.invokeAny(collection);
        }
        return t15;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        boolean zIsShutdown;
        synchronized (this.f140081a) {
            zIsShutdown = this.f140082b.isShutdown();
        }
        return zIsShutdown;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        boolean zIsTerminated;
        synchronized (this.f140081a) {
            zIsTerminated = this.f140082b.isTerminated();
        }
        return zIsTerminated;
    }

    void p() {
        synchronized (this.f140081a) {
            try {
                if (!this.f140082b.isShutdown()) {
                    this.f140082b.shutdown();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    void r(v.l0 l0Var) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        i6.i.g(l0Var);
        synchronized (this.f140081a) {
            try {
                if (this.f140082b.isShutdown()) {
                    this.f140082b = m();
                }
                scheduledThreadPoolExecutor = this.f140082b;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        scheduledThreadPoolExecutor.setCorePoolSize(Math.max(1, l0Var.c().size()));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j15, TimeUnit timeUnit) {
        ScheduledFuture<?> scheduledFutureSchedule;
        synchronized (this.f140081a) {
            scheduledFutureSchedule = this.f140082b.schedule(runnable, j15, timeUnit);
        }
        return scheduledFutureSchedule;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j15, long j16, TimeUnit timeUnit) {
        ScheduledFuture<?> scheduledFutureScheduleAtFixedRate;
        synchronized (this.f140081a) {
            scheduledFutureScheduleAtFixedRate = this.f140082b.scheduleAtFixedRate(runnable, j15, j16, timeUnit);
        }
        return scheduledFutureScheduleAtFixedRate;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j15, long j16, TimeUnit timeUnit) {
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        synchronized (this.f140081a) {
            scheduledFutureScheduleWithFixedDelay = this.f140082b.scheduleWithFixedDelay(runnable, j15, j16, timeUnit);
        }
        return scheduledFutureScheduleWithFixedDelay;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        synchronized (this.f140081a) {
            this.f140082b.shutdown();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        List<Runnable> listShutdownNow;
        synchronized (this.f140081a) {
            listShutdownNow = this.f140082b.shutdownNow();
        }
        return listShutdownNow;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        Future<T> futureSubmit;
        synchronized (this.f140081a) {
            futureSubmit = this.f140082b.submit(callable);
        }
        return futureSubmit;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j15, TimeUnit timeUnit) {
        List<Future<T>> listInvokeAll;
        synchronized (this.f140081a) {
            listInvokeAll = this.f140082b.invokeAll(collection, j15, timeUnit);
        }
        return listInvokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j15, TimeUnit timeUnit) {
        T t15;
        synchronized (this.f140081a) {
            t15 = (T) this.f140082b.invokeAny(collection, j15, timeUnit);
        }
        return t15;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j15, TimeUnit timeUnit) {
        ScheduledFuture<V> scheduledFutureSchedule;
        synchronized (this.f140081a) {
            scheduledFutureSchedule = this.f140082b.schedule(callable, j15, timeUnit);
        }
        return scheduledFutureSchedule;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t15) {
        Future<T> futureSubmit;
        synchronized (this.f140081a) {
            futureSubmit = this.f140082b.submit(runnable, t15);
        }
        return futureSubmit;
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        Future<?> futureSubmit;
        synchronized (this.f140081a) {
            futureSubmit = this.f140082b.submit(runnable);
        }
        return futureSubmit;
    }
}
