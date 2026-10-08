package io.sentry.backpressure;

import io.sentry.b7;
import io.sentry.c1;
import io.sentry.f1;
import io.sentry.g1;
import io.sentry.q7;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7 f94688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c1 f94689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f94690c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Future<?> f94691d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.sentry.util.a f94692e = new io.sentry.util.a();

    public a(q7 q7Var, c1 c1Var) {
        this.f94688a = q7Var;
        this.f94689b = c1Var;
    }

    private boolean c() {
        return this.f94689b.w();
    }

    private void d(int i15) {
        f1 executorService = this.f94688a.getExecutorService();
        if (executorService.isClosed()) {
            return;
        }
        g1 g1VarA = this.f94692e.a();
        try {
            this.f94691d = executorService.c(this, i15);
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

    @Override // io.sentry.backpressure.b
    public int a() {
        return this.f94690c;
    }

    void b() {
        if (c()) {
            if (this.f94690c > 0) {
                this.f94688a.getLogger().c(b7.DEBUG, "Health check positive, reverting to normal sampling.", new Object[0]);
            }
            this.f94690c = 0;
        } else {
            int i15 = this.f94690c;
            if (i15 < 10) {
                this.f94690c = i15 + 1;
                this.f94688a.getLogger().c(b7.DEBUG, "Health check negative, downsampling with a factor of %d", Integer.valueOf(this.f94690c));
            }
        }
    }

    @Override // io.sentry.backpressure.b
    public void close() {
        Future<?> future = this.f94691d;
        if (future != null) {
            g1 g1VarA = this.f94692e.a();
            try {
                future.cancel(true);
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

    @Override // java.lang.Runnable
    public void run() {
        b();
        d(10000);
    }

    @Override // io.sentry.backpressure.b
    public void start() {
        d(500);
    }
}
