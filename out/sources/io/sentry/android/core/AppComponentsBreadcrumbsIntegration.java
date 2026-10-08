package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import io.sentry.b7;
import io.sentry.q7;
import java.io.Closeable;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class AppComponentsBreadcrumbsIntegration implements io.sentry.r1, Closeable, ComponentCallbacks2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final io.sentry.j0 f93672e = new io.sentry.j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f93673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private io.sentry.c1 f93674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SentryAndroidOptions f93675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.l f93676d = new io.sentry.android.core.internal.util.l(io.sentry.android.core.internal.util.f.b(), 60000, 0);

    public AppComponentsBreadcrumbsIntegration(Context context) {
        this.f93673a = (Context) io.sentry.util.v.c(a1.g(context), "Context is required");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(long j15, Configuration configuration) {
        if (this.f93674b != null) {
            io.sentry.protocol.e.b bVarA = io.sentry.android.core.internal.util.m.a(this.f93673a.getResources().getConfiguration().orientation);
            String lowerCase = bVarA != null ? bVarA.name().toLowerCase(Locale.ROOT) : "undefined";
            io.sentry.f fVar = new io.sentry.f(j15);
            fVar.F("navigation");
            fVar.z("device.orientation");
            fVar.A("position", lowerCase);
            fVar.B(b7.INFO);
            io.sentry.j0 j0Var = new io.sentry.j0();
            j0Var.k("android:configuration", configuration);
            this.f93674b.q(fVar, j0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(long j15, int i15) {
        if (this.f93674b != null) {
            io.sentry.f fVar = new io.sentry.f(j15);
            fVar.F("system");
            fVar.z("device.event");
            fVar.D("Low memory");
            fVar.A("action", "LOW_MEMORY");
            fVar.A("level", Integer.valueOf(i15));
            fVar.B(b7.WARNING);
            this.f93674b.q(fVar, f93672e);
        }
    }

    private void u(Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.f93675c;
        if (sentryAndroidOptions != null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(runnable);
            } catch (Throwable th4) {
                this.f93675c.getLogger().a(b7.ERROR, th4, "Failed to submit app components breadcrumb task", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f93673a.unregisterComponentCallbacks(this);
        } catch (Throwable th4) {
            SentryAndroidOptions sentryAndroidOptions = this.f93675c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().a(b7.DEBUG, th4, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.f93675c;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().c(b7.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.r1
    public void m(io.sentry.c1 c1Var, q7 q7Var) {
        this.f93674b = (io.sentry.c1) io.sentry.util.v.c(c1Var, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.v.c(q7Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) q7Var : null, "SentryAndroidOptions is required");
        this.f93675c = sentryAndroidOptions;
        io.sentry.v0 logger = sentryAndroidOptions.getLogger();
        b7 b7Var = b7.DEBUG;
        logger.c(b7Var, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f93675c.isEnableAppComponentBreadcrumbs()));
        if (this.f93675c.isEnableAppComponentBreadcrumbs()) {
            try {
                this.f93673a.registerComponentCallbacks(this);
                q7Var.getLogger().c(b7Var, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                io.sentry.util.p.a("AppComponentsBreadcrumbs");
            } catch (Throwable th4) {
                this.f93675c.setEnableAppComponentBreadcrumbs(false);
                q7Var.getLogger().a(b7.INFO, th4, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(final Configuration configuration) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        u(new Runnable() { // from class: io.sentry.android.core.o0
            @Override // java.lang.Runnable
            public final void run() {
                this.f94070a.p(jCurrentTimeMillis, configuration);
            }
        });
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(final int i15) {
        if (i15 >= 40 && !this.f93676d.a()) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            u(new Runnable() { // from class: io.sentry.android.core.p0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f94086a.r(jCurrentTimeMillis, i15);
                }
            });
        }
    }
}
