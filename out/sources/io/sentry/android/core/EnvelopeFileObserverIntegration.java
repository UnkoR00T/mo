package io.sentry.android.core;

import io.sentry.b7;
import io.sentry.p3;
import io.sentry.q7;
import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class EnvelopeFileObserverIntegration implements io.sentry.r1, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i1 f93681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private io.sentry.v0 f93682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f93683c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final io.sentry.util.a f93684d = new io.sentry.util.a();

    private static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
        private OutboxEnvelopeFileObserverIntegration() {
        }

        @Override // io.sentry.android.core.EnvelopeFileObserverIntegration
        protected String p(q7 q7Var) {
            return q7Var.getOutboxPath();
        }
    }

    public static /* synthetic */ void b(EnvelopeFileObserverIntegration envelopeFileObserverIntegration, io.sentry.c1 c1Var, q7 q7Var, String str) {
        io.sentry.g1 g1VarA = envelopeFileObserverIntegration.f93684d.a();
        try {
            if (!envelopeFileObserverIntegration.f93683c) {
                envelopeFileObserverIntegration.r(c1Var, q7Var, str);
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

    public static EnvelopeFileObserverIntegration h() {
        return new OutboxEnvelopeFileObserverIntegration();
    }

    private void r(io.sentry.c1 c1Var, q7 q7Var, String str) {
        i1 i1Var = new i1(str, new p3(c1Var, q7Var.getEnvelopeReader(), q7Var.getSerializer(), q7Var.getLogger(), q7Var.getFlushTimeoutMillis(), q7Var.getMaxQueueSize()), q7Var.getLogger(), q7Var.getFlushTimeoutMillis());
        this.f93681a = i1Var;
        try {
            i1Var.startWatching();
            q7Var.getLogger().c(b7.DEBUG, "EnvelopeFileObserverIntegration installed.", new Object[0]);
            io.sentry.util.p.a("EnvelopeFileObserver");
        } catch (Throwable th4) {
            q7Var.getLogger().b(b7.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th4);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        io.sentry.g1 g1VarA = this.f93684d.a();
        try {
            this.f93683c = true;
            if (g1VarA != null) {
                g1VarA.close();
            }
            i1 i1Var = this.f93681a;
            if (i1Var != null) {
                i1Var.stopWatching();
                io.sentry.v0 v0Var = this.f93682b;
                if (v0Var != null) {
                    v0Var.c(b7.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
                }
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

    @Override // io.sentry.r1
    public final void m(final io.sentry.c1 c1Var, final q7 q7Var) {
        io.sentry.util.v.c(c1Var, "Scopes are required");
        io.sentry.util.v.c(q7Var, "SentryOptions is required");
        this.f93682b = q7Var.getLogger();
        final String strP = p(q7Var);
        if (strP == null) {
            this.f93682b.c(b7.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        this.f93682b.c(b7.DEBUG, "Registering EnvelopeFileObserverIntegration for path: %s", strP);
        try {
            q7Var.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.j1
                @Override // java.lang.Runnable
                public final void run() {
                    EnvelopeFileObserverIntegration.b(this.f94038a, c1Var, q7Var, strP);
                }
            });
        } catch (Throwable th4) {
            this.f93682b.b(b7.DEBUG, "Failed to start EnvelopeFileObserverIntegration on executor thread.", th4);
        }
    }

    abstract String p(q7 q7Var);
}
