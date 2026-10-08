package ee;

import CON.k0;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import io.sentry.android.core.c2;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f49522b = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile int f49523c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f49524a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f49525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f49526b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f49527c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ThreadFactory f49528d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private e f49529e = e.f49543d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f49530f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f49531g;

        b(boolean z15) {
            this.f49525a = z15;
        }

        public a a() {
            if (TextUtils.isEmpty(this.f49530f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f49530f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f49526b, this.f49527c, this.f49531g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f49528d, this.f49530f, this.f49529e, this.f49525a));
            if (this.f49531g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new a(threadPoolExecutor);
        }

        public b b(String str) {
            this.f49530f = str;
            return this;
        }

        public b c(int i15) {
            this.f49526b = i15;
            this.f49527c = i15;
            return this;
        }
    }

    private static final class c implements ThreadFactory {

        /* JADX INFO: renamed from: ee.a$c$a, reason: collision with other inner class name */
        class C1171a extends Thread {
            C1171a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C1171a(runnable);
        }
    }

    private static final class d implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadFactory f49533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f49534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final e f49535c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f49536d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final AtomicInteger f49537e = new AtomicInteger();

        /* JADX INFO: renamed from: ee.a$d$a, reason: collision with other inner class name */
        class RunnableC1172a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f49538a;

            RunnableC1172a(Runnable runnable) {
                this.f49538a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f49536d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f49538a.run();
                } catch (Throwable th4) {
                    d.this.f49535c.a(th4);
                }
            }
        }

        d(ThreadFactory threadFactory, String str, e eVar, boolean z15) {
            this.f49533a = threadFactory;
            this.f49534b = str;
            this.f49535c = eVar;
            this.f49536d = z15;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f49533a.newThread(new RunnableC1172a(runnable));
            threadNewThread.setName("glide-" + this.f49534b + "-thread-" + this.f49537e.getAndIncrement());
            return threadNewThread;
        }
    }

    public interface e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f49540a = new C1173a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f49541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f49542c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f49543d;

        /* JADX INFO: renamed from: ee.a$e$a, reason: collision with other inner class name */
        class C1173a implements e {
            C1173a() {
            }

            @Override // ee.a.e
            public void a(Throwable th4) {
            }
        }

        class b implements e {
            b() {
            }

            @Override // ee.a.e
            public void a(Throwable th4) {
                if (th4 == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                c2.f("GlideExecutor", "Request threw uncaught throwable", th4);
            }
        }

        class c implements e {
            c() {
            }

            @Override // ee.a.e
            public void a(Throwable th4) {
                if (th4 != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th4);
                }
            }
        }

        static {
            b bVar = new b();
            f49541b = bVar;
            f49542c = new c();
            f49543d = bVar;
        }

        void a(Throwable th4);
    }

    a(ExecutorService executorService) {
        this.f49524a = executorService;
    }

    public static b C() {
        return new b(false).c(m()).b("source");
    }

    public static a E() {
        return C().a();
    }

    public static a I() {
        return new a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f49522b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), "source-unlimited", e.f49543d, false)));
    }

    static int h() {
        return m() >= 4 ? 2 : 1;
    }

    public static int m() {
        if (f49523c == 0) {
            f49523c = Math.min(4, ee.b.a());
        }
        return f49523c;
    }

    public static b p() {
        return new b(true).c(h()).b("animation");
    }

    public static a r() {
        return p().a();
    }

    public static b u() {
        return new b(true).c(1).b("disk-cache");
    }

    public static a y() {
        return u().a();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j15, TimeUnit timeUnit) {
        return this.f49524a.awaitTermination(j15, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        k0.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f49524a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f49524a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.f49524a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f49524a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f49524a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f49524a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f49524a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f49524a.submit(runnable);
    }

    public String toString() {
        return this.f49524a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j15, TimeUnit timeUnit) {
        return this.f49524a.invokeAll(collection, j15, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j15, TimeUnit timeUnit) {
        return (T) this.f49524a.invokeAny(collection, j15, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t15) {
        return this.f49524a.submit(runnable, t15);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f49524a.submit(callable);
    }
}
