package io.sentry.android.replay.util;

import fu.r;
import io.sentry.b7;
import io.sentry.f1;
import io.sentry.q7;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a1\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "Lio/sentry/q7;", "options", "Loq/i0;", "c", "(Ljava/util/concurrent/ExecutorService;Lio/sentry/q7;)V", "Lio/sentry/f1;", "", "taskName", "Ljava/lang/Runnable;", "task", "Ljava/util/concurrent/Future;", "d", "(Lio/sentry/f1;Lio/sentry/q7;Ljava/lang/String;Ljava/lang/Runnable;)Ljava/util/concurrent/Future;", "e", "(Ljava/util/concurrent/ExecutorService;Lio/sentry/q7;Ljava/lang/String;Ljava/lang/Runnable;)Ljava/util/concurrent/Future;", "sentry-android-replay_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class g {
    public static final void c(ExecutorService executorService, q7 q7Var) {
        synchronized (executorService) {
            if (!executorService.isShutdown()) {
                executorService.shutdown();
            }
            try {
                if (!executorService.awaitTermination(q7Var.getShutdownTimeoutMillis(), TimeUnit.MILLISECONDS)) {
                    executorService.shutdownNow();
                }
            } catch (InterruptedException unused) {
                executorService.shutdownNow();
                Thread.currentThread().interrupt();
            }
            i0 i0Var = i0.f148189a;
        }
    }

    public static final Future<?> d(f1 f1Var, final q7 q7Var, final String str, final Runnable runnable) {
        try {
            return f1Var.submit(new Runnable() { // from class: io.sentry.android.replay.util.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.f(runnable, q7Var, str);
                }
            });
        } catch (Throwable th4) {
            q7Var.getLogger().b(b7.ERROR, "Failed to submit task " + str + " to executor", th4);
            return null;
        }
    }

    public static final Future<?> e(ExecutorService executorService, final q7 q7Var, final String str, final Runnable runnable) {
        if (r.V(Thread.currentThread().getName(), "SentryReplayIntegration", false, 2, null)) {
            runnable.run();
            return null;
        }
        try {
            return executorService.submit(new Runnable() { // from class: io.sentry.android.replay.util.e
                @Override // java.lang.Runnable
                public final void run() {
                    g.g(runnable, q7Var, str);
                }
            });
        } catch (Throwable th4) {
            q7Var.getLogger().b(b7.ERROR, "Failed to submit task " + str + " to executor", th4);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Runnable runnable, q7 q7Var, String str) {
        try {
            runnable.run();
        } catch (Throwable th4) {
            q7Var.getLogger().b(b7.ERROR, "Failed to execute task " + str, th4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Runnable runnable, q7 q7Var, String str) {
        try {
            runnable.run();
        } catch (Throwable th4) {
            q7Var.getLogger().b(b7.ERROR, "Failed to execute task " + str, th4);
        }
    }
}
