package io.sentry.logger;

import io.sentry.b7;
import io.sentry.d7;
import io.sentry.e1;
import io.sentry.f1;
import io.sentry.f7;
import io.sentry.g1;
import io.sentry.q7;
import io.sentry.transport.b0;
import io.sentry.v6;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements io.sentry.logger.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final io.sentry.util.a f95161h = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7 f95162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e1 f95163b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f1 f95165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Future<?> f95166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f95167f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b0 f95168g = new b0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue<d7> f95164c = new ConcurrentLinkedQueue();

    private class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.d();
        }
    }

    public e(q7 q7Var, e1 e1Var) {
        this.f95162a = q7Var;
        this.f95163b = e1Var;
        this.f95165d = new v6(q7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        f();
        g1 g1VarA = f95161h.a();
        try {
            if (this.f95164c.isEmpty()) {
                this.f95167f = false;
            } else {
                g(true, false);
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

    private void e() {
        ArrayList arrayList = new ArrayList(100);
        do {
            d7 d7VarPoll = this.f95164c.poll();
            if (d7VarPoll != null) {
                arrayList.add(d7VarPoll);
            }
            if (this.f95164c.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 100);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f95163b.f(new f7(arrayList));
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            this.f95168g.a();
        }
    }

    private void f() {
        do {
            e();
        } while (this.f95164c.size() >= 100);
    }

    private void g(boolean z15, boolean z16) {
        if (!this.f95167f || z15) {
            g1 g1VarA = f95161h.a();
            try {
                Future<?> future = this.f95166e;
                if (z15 || future == null || future.isDone() || future.isCancelled()) {
                    this.f95167f = true;
                    this.f95166e = this.f95165d.c(new b(), z16 ? 0 : 5000);
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

    @Override // io.sentry.logger.b
    public void a(d7 d7Var) {
        this.f95168g.c();
        this.f95164c.offer(d7Var);
        g(false, false);
    }

    @Override // io.sentry.logger.b
    public void n(boolean z15) {
        if (z15) {
            g(true, true);
            this.f95165d.submit(new Runnable() { // from class: io.sentry.logger.d
                @Override // java.lang.Runnable
                public final void run() {
                    e eVar = this.f95160a;
                    eVar.f95165d.a(eVar.f95162a.getShutdownTimeoutMillis());
                }
            });
        } else {
            this.f95165d.a(this.f95162a.getShutdownTimeoutMillis());
            while (!this.f95164c.isEmpty()) {
                e();
            }
        }
    }

    @Override // io.sentry.logger.b
    public void t(long j15) {
        g(true, true);
        try {
            this.f95168g.d(j15, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e15) {
            this.f95162a.getLogger().b(b7.ERROR, "Failed to flush log events", e15);
            Thread.currentThread().interrupt();
        }
    }
}
