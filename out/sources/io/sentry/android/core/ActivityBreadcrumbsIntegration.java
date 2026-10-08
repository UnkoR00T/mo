package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.b7;
import io.sentry.q7;
import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public final class ActivityBreadcrumbsIntegration implements io.sentry.r1, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f93626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private io.sentry.c1 f93627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f93628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.util.a f93629d = new io.sentry.util.a();

    public ActivityBreadcrumbsIntegration(Application application) {
        this.f93626a = (Application) io.sentry.util.v.c(application, "Application is required");
    }

    private void b(Activity activity, String str) {
        if (this.f93627b == null) {
            return;
        }
        io.sentry.f fVar = new io.sentry.f();
        fVar.F("navigation");
        fVar.A("state", str);
        fVar.A("screen", h(activity));
        fVar.z("ui.lifecycle");
        fVar.B(b7.INFO);
        io.sentry.j0 j0Var = new io.sentry.j0();
        j0Var.k("android:activity", activity);
        this.f93627b.q(fVar, j0Var);
    }

    private String h(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f93628c) {
            this.f93626a.unregisterActivityLifecycleCallbacks(this);
            io.sentry.c1 c1Var = this.f93627b;
            if (c1Var != null) {
                c1Var.s().getLogger().c(b7.DEBUG, "ActivityBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.r1
    public void m(io.sentry.c1 c1Var, q7 q7Var) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.v.c(q7Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) q7Var : null, "SentryAndroidOptions is required");
        this.f93627b = (io.sentry.c1) io.sentry.util.v.c(c1Var, "Scopes are required");
        this.f93628c = sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs();
        io.sentry.v0 logger = q7Var.getLogger();
        b7 b7Var = b7.DEBUG;
        logger.c(b7Var, "ActivityBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f93628c));
        if (this.f93628c) {
            this.f93626a.registerActivityLifecycleCallbacks(this);
            q7Var.getLogger().c(b7Var, "ActivityBreadcrumbIntegration installed.", new Object[0]);
            io.sentry.util.p.a("ActivityBreadcrumbs");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        io.sentry.g1 g1VarA = this.f93629d.a();
        try {
            b(activity, "created");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        io.sentry.g1 g1VarA = this.f93629d.a();
        try {
            b(activity, "destroyed");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        io.sentry.g1 g1VarA = this.f93629d.a();
        try {
            b(activity, "paused");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        io.sentry.g1 g1VarA = this.f93629d.a();
        try {
            b(activity, "resumed");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        io.sentry.g1 g1VarA = this.f93629d.a();
        try {
            b(activity, "saveInstanceState");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        io.sentry.g1 g1VarA = this.f93629d.a();
        try {
            b(activity, "started");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        io.sentry.g1 g1VarA = this.f93629d.a();
        try {
            b(activity, "stopped");
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
