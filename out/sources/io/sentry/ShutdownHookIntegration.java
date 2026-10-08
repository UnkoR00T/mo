package io.sentry;

import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public final class ShutdownHookIntegration implements r1, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runtime f93607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Thread f93608b;

    public ShutdownHookIntegration(Runtime runtime) {
        this.f93607a = (Runtime) io.sentry.util.v.c(runtime, "Runtime is required");
    }

    public static /* synthetic */ void b(ShutdownHookIntegration shutdownHookIntegration, q7 q7Var) {
        shutdownHookIntegration.f93607a.addShutdownHook(shutdownHookIntegration.f93608b);
        q7Var.getLogger().c(b7.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
        io.sentry.util.p.a("ShutdownHook");
    }

    private void r(Runnable runnable) {
        try {
            runnable.run();
        } catch (IllegalStateException e15) {
            String message = e15.getMessage();
            if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                throw e15;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f93608b != null) {
            r(new Runnable() { // from class: io.sentry.j8
                @Override // java.lang.Runnable
                public final void run() {
                    ShutdownHookIntegration shutdownHookIntegration = this.f95139a;
                    shutdownHookIntegration.f93607a.removeShutdownHook(shutdownHookIntegration.f93608b);
                }
            });
        }
    }

    @Override // io.sentry.r1
    public void m(final c1 c1Var, final q7 q7Var) {
        io.sentry.util.v.c(c1Var, "Scopes are required");
        io.sentry.util.v.c(q7Var, "SentryOptions is required");
        if (!q7Var.isEnableShutdownHook()) {
            q7Var.getLogger().c(b7.INFO, "enableShutdownHook is disabled.", new Object[0]);
        } else {
            this.f93608b = new Thread(new Runnable() { // from class: io.sentry.k8
                @Override // java.lang.Runnable
                public final void run() {
                    c1Var.t(q7Var.getFlushTimeoutMillis());
                }
            }, "sentry-shutdownhook");
            r(new Runnable() { // from class: io.sentry.l8
                @Override // java.lang.Runnable
                public final void run() {
                    ShutdownHookIntegration.b(this.f95157a, q7Var);
                }
            });
        }
    }

    public ShutdownHookIntegration() {
        this(Runtime.getRuntime());
    }
}
