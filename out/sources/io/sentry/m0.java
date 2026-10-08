package io.sentry;

import java.net.InetAddress;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class m0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile m0 f95176i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f95178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile String f95179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile long f95180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f95181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Callable<InetAddress> f95182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ExecutorService f95183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f95174g = TimeUnit.HOURS.toMillis(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f95175h = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final io.sentry.util.a f95177j = new io.sentry.util.a();

    private static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f95184a;

        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("SentryHostnameCache-");
            int i15 = this.f95184a;
            this.f95184a = i15 + 1;
            sb5.append(i15);
            Thread thread = new Thread(runnable, sb5.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    private m0() {
        this(f95174g);
    }

    public static /* synthetic */ Void b(m0 m0Var) {
        m0Var.getClass();
        try {
            m0Var.f95179b = m0Var.f95182e.call().getCanonicalHostName();
            m0Var.f95180c = System.currentTimeMillis() + m0Var.f95178a;
            return null;
        } finally {
            m0Var.f95181d.set(false);
        }
    }

    public static m0 e() {
        if (f95176i == null) {
            g1 g1VarA = f95177j.a();
            try {
                if (f95176i == null) {
                    f95176i = new m0();
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
        return f95176i;
    }

    private void f() {
        this.f95180c = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(1L);
    }

    private void g() {
        try {
            this.f95183f.submit(new Callable() { // from class: io.sentry.l0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return m0.b(this.f95146a);
                }
            }).get(f95175h, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            f();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            f();
        }
    }

    void c() {
        this.f95183f.shutdown();
    }

    public String d() {
        if (this.f95180c < System.currentTimeMillis() && this.f95181d.compareAndSet(false, true)) {
            g();
        }
        return this.f95179b;
    }

    m0(long j15) {
        this(j15, new Callable() { // from class: io.sentry.k0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return InetAddress.getLocalHost();
            }
        });
    }

    m0(long j15, Callable<InetAddress> callable) {
        this.f95181d = new AtomicBoolean(false);
        this.f95183f = Executors.newSingleThreadExecutor(new b());
        this.f95178a = j15;
        this.f95182e = (Callable) io.sentry.util.v.c(callable, "getLocalhost is required");
        g();
    }
}
