package io.sentry.android.core;

import io.sentry.b7;
import io.sentry.q7;
import io.sentry.t4;
import io.sentry.w4;
import java.io.Closeable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
final class SendCachedEnvelopeIntegration implements io.sentry.r1, io.sentry.p0.b, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w4 f93706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.util.r<Boolean> f93707b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private io.sentry.p0 f93709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private io.sentry.c1 f93710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SentryAndroidOptions f93711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private t4 f93712g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f93708c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f93713h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f93714j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final io.sentry.util.a f93715k = new io.sentry.util.a();

    public SendCachedEnvelopeIntegration(w4 w4Var, io.sentry.util.r<Boolean> rVar) {
        this.f93706a = (w4) io.sentry.util.v.c(w4Var, "SendFireAndForgetFactory is required");
        this.f93707b = rVar;
    }

    public static /* synthetic */ void b(SendCachedEnvelopeIntegration sendCachedEnvelopeIntegration, SentryAndroidOptions sentryAndroidOptions, io.sentry.c1 c1Var) {
        sendCachedEnvelopeIntegration.getClass();
        try {
            if (sendCachedEnvelopeIntegration.f93714j.get()) {
                sentryAndroidOptions.getLogger().c(b7.INFO, "SendCachedEnvelopeIntegration, not trying to send after closing.", new Object[0]);
                return;
            }
            if (!sendCachedEnvelopeIntegration.f93713h.getAndSet(true)) {
                io.sentry.p0 connectionStatusProvider = sentryAndroidOptions.getConnectionStatusProvider();
                sendCachedEnvelopeIntegration.f93709d = connectionStatusProvider;
                connectionStatusProvider.w3(sendCachedEnvelopeIntegration);
                sendCachedEnvelopeIntegration.f93712g = sendCachedEnvelopeIntegration.f93706a.c(c1Var, sentryAndroidOptions);
            }
            io.sentry.p0 p0Var = sendCachedEnvelopeIntegration.f93709d;
            if (p0Var != null && p0Var.w1() == io.sentry.p0.a.DISCONNECTED) {
                sentryAndroidOptions.getLogger().c(b7.INFO, "SendCachedEnvelopeIntegration, no connection.", new Object[0]);
                return;
            }
            io.sentry.transport.a0 a0VarF = c1Var.F();
            if (a0VarF != null && a0VarF.E(io.sentry.l.All)) {
                sentryAndroidOptions.getLogger().c(b7.INFO, "SendCachedEnvelopeIntegration, rate limiting active.", new Object[0]);
                return;
            }
            t4 t4Var = sendCachedEnvelopeIntegration.f93712g;
            if (t4Var == null) {
                sentryAndroidOptions.getLogger().c(b7.ERROR, "SendCachedEnvelopeIntegration factory is null.", new Object[0]);
            } else {
                t4Var.a();
            }
        } catch (Throwable th4) {
            sentryAndroidOptions.getLogger().b(b7.ERROR, "Failed trying to send cached events.", th4);
        }
    }

    private void p(final io.sentry.c1 c1Var, final SentryAndroidOptions sentryAndroidOptions) {
        try {
            io.sentry.g1 g1VarA = this.f93715k.a();
            try {
                Future<?> futureSubmit = sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        SendCachedEnvelopeIntegration.b(this.f94188a, sentryAndroidOptions, c1Var);
                    }
                });
                if (this.f93707b.a().booleanValue() && this.f93708c.compareAndSet(false, true)) {
                    sentryAndroidOptions.getLogger().c(b7.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                    try {
                        futureSubmit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                        sentryAndroidOptions.getLogger().c(b7.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                    }
                }
                sentryAndroidOptions.getLogger().c(b7.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
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
        } catch (RejectedExecutionException e15) {
            sentryAndroidOptions.getLogger().b(b7.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e15);
        } catch (Throwable th6) {
            sentryAndroidOptions.getLogger().b(b7.ERROR, "Failed to call the executor. Cached events will not be sent", th6);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f93714j.set(true);
        io.sentry.p0 p0Var = this.f93709d;
        if (p0Var != null) {
            p0Var.M3(this);
        }
    }

    @Override // io.sentry.p0.b
    public void h(io.sentry.p0.a aVar) {
        SentryAndroidOptions sentryAndroidOptions;
        io.sentry.c1 c1Var = this.f93710e;
        if (c1Var == null || (sentryAndroidOptions = this.f93711f) == null || aVar == io.sentry.p0.a.DISCONNECTED) {
            return;
        }
        p(c1Var, sentryAndroidOptions);
    }

    @Override // io.sentry.r1
    public void m(io.sentry.c1 c1Var, q7 q7Var) {
        this.f93710e = (io.sentry.c1) io.sentry.util.v.c(c1Var, "Scopes are required");
        this.f93711f = (SentryAndroidOptions) io.sentry.util.v.c(q7Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) q7Var : null, "SentryAndroidOptions is required");
        if (!this.f93706a.d(q7Var.getCacheDirPath(), q7Var.getLogger())) {
            q7Var.getLogger().c(b7.ERROR, "No cache dir path is defined in options.", new Object[0]);
        } else {
            io.sentry.util.p.a("SendCachedEnvelope");
            p(c1Var, this.f93711f);
        }
    }
}
