package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import io.sentry.b7;
import io.sentry.q7;
import io.sentry.r6;
import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public final class AnrIntegration implements io.sentry.r1, Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static c f93650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final io.sentry.util.a f93651f = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f93652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f93653b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.util.a f93654c = new io.sentry.util.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private q7 f93655d;

    static final class a implements io.sentry.hints.a, io.sentry.hints.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f93656a;

        a(boolean z15) {
            this.f93656a = z15;
        }

        @Override // io.sentry.hints.a
        public Long e() {
            return null;
        }

        @Override // io.sentry.hints.a
        public boolean f() {
            return true;
        }

        @Override // io.sentry.hints.a
        public String h() {
            return this.f93656a ? "anr_background" : "anr_foreground";
        }
    }

    public AnrIntegration(Context context) {
        this.f93652a = a1.g(context);
    }

    public static /* synthetic */ void b(AnrIntegration anrIntegration, io.sentry.c1 c1Var, SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.g1 g1VarA = anrIntegration.f93654c.a();
        try {
            if (!anrIntegration.f93653b) {
                anrIntegration.y(c1Var, sentryAndroidOptions);
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

    private Throwable p(boolean z15, SentryAndroidOptions sentryAndroidOptions, ApplicationNotResponding applicationNotResponding) {
        String str = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
        if (z15) {
            str = "Background " + str;
        }
        ApplicationNotResponding applicationNotResponding2 = new ApplicationNotResponding(str, applicationNotResponding.a());
        io.sentry.protocol.j jVar = new io.sentry.protocol.j();
        jVar.p("ANR");
        return new io.sentry.exception.a(jVar, applicationNotResponding2, applicationNotResponding2.a(), true);
    }

    private void r(final io.sentry.c1 c1Var, final SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.getLogger().c(b7.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            io.sentry.util.p.a("Anr");
            try {
                sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnrIntegration.b(this.f94045a, c1Var, sentryAndroidOptions);
                    }
                });
            } catch (Throwable th4) {
                sentryAndroidOptions.getLogger().b(b7.DEBUG, "Failed to start AnrIntegration on executor thread.", th4);
            }
        }
    }

    private void y(final io.sentry.c1 c1Var, final SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.g1 g1VarA = f93651f.a();
        try {
            if (f93650e == null) {
                io.sentry.v0 logger = sentryAndroidOptions.getLogger();
                b7 b7Var = b7.DEBUG;
                logger.c(b7Var, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                c cVar = new c(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new c.a() { // from class: io.sentry.android.core.l0
                    @Override // io.sentry.android.core.c.a
                    public final void a(ApplicationNotResponding applicationNotResponding) {
                        this.f94051a.u(c1Var, sentryAndroidOptions, applicationNotResponding);
                    }
                }, sentryAndroidOptions.getLogger(), this.f93652a);
                f93650e = cVar;
                cVar.start();
                sentryAndroidOptions.getLogger().c(b7Var, "AnrIntegration installed.", new Object[0]);
            }
            if (g1VarA != null) {
                g1VarA.close();
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        io.sentry.g1 g1VarA = this.f93654c.a();
        try {
            this.f93653b = true;
            if (g1VarA != null) {
                g1VarA.close();
            }
            g1VarA = f93651f.a();
            try {
                c cVar = f93650e;
                if (cVar != null) {
                    cVar.interrupt();
                    f93650e = null;
                    q7 q7Var = this.f93655d;
                    if (q7Var != null) {
                        q7Var.getLogger().c(b7.DEBUG, "AnrIntegration removed.", new Object[0]);
                    }
                }
                if (g1VarA != null) {
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
        } finally {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th6) {
                    th.addSuppressed(th6);
                }
            }
        }
    }

    @Override // io.sentry.r1
    public final void m(io.sentry.c1 c1Var, q7 q7Var) {
        this.f93655d = (q7) io.sentry.util.v.c(q7Var, "SentryOptions is required");
        r(c1Var, (SentryAndroidOptions) q7Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(io.sentry.c1 c1Var, SentryAndroidOptions sentryAndroidOptions, ApplicationNotResponding applicationNotResponding) {
        sentryAndroidOptions.getLogger().c(b7.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
        boolean zEquals = Boolean.TRUE.equals(s0.y().C());
        r6 r6Var = new r6(p(zEquals, sentryAndroidOptions, applicationNotResponding));
        r6Var.C0(b7.ERROR);
        c1Var.R(r6Var, io.sentry.util.m.e(new a(zEquals)));
    }
}
