package io.sentry.android.core;

import io.sentry.b7;
import io.sentry.q7;
import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public final class AppLifecycleIntegration implements io.sentry.r1, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.util.a f93677a = new io.sentry.util.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile o1 f93678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SentryAndroidOptions f93679c;

    private void b() {
        io.sentry.g1 g1VarA = this.f93677a.a();
        try {
            o1 o1Var = this.f93678b;
            this.f93678b = null;
            if (g1VarA != null) {
                g1VarA.close();
            }
            if (o1Var != null) {
                s0.y().H(o1Var);
                SentryAndroidOptions sentryAndroidOptions = this.f93679c;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().c(b7.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b();
        s0.y().K();
    }

    @Override // io.sentry.r1
    public void m(io.sentry.c1 c1Var, q7 q7Var) {
        io.sentry.util.v.c(c1Var, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.v.c(q7Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) q7Var : null, "SentryAndroidOptions is required");
        this.f93679c = sentryAndroidOptions;
        io.sentry.v0 logger = sentryAndroidOptions.getLogger();
        b7 b7Var = b7.DEBUG;
        logger.c(b7Var, "enableSessionTracking enabled: %s", Boolean.valueOf(this.f93679c.isEnableAutoSessionTracking()));
        this.f93679c.getLogger().c(b7Var, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.f93679c.isEnableAppLifecycleBreadcrumbs()));
        if (this.f93679c.isEnableAutoSessionTracking() || this.f93679c.isEnableAppLifecycleBreadcrumbs()) {
            io.sentry.g1 g1VarA = this.f93677a.a();
            try {
                if (this.f93678b != null) {
                    if (g1VarA != null) {
                        g1VarA.close();
                    }
                } else {
                    this.f93678b = new o1(c1Var, this.f93679c.getSessionTrackingIntervalMillis(), this.f93679c.isEnableAutoSessionTracking(), this.f93679c.isEnableAppLifecycleBreadcrumbs());
                    s0.y().p(this.f93678b);
                    if (g1VarA != null) {
                        g1VarA.close();
                    }
                    q7Var.getLogger().c(b7Var, "AppLifecycleIntegration installed.", new Object[0]);
                    io.sentry.util.p.a("AppLifecycle");
                }
            } catch (Throwable th4) {
                if (g1VarA == null) {
                    throw th4;
                }
                try {
                    g1VarA.close();
                    throw th4;
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                    throw th4;
                }
            }
        }
    }
}
