package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import io.sentry.b7;
import io.sentry.q7;
import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public final class UserInteractionIntegration implements io.sentry.r1, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f93740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private io.sentry.c1 f93741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SentryAndroidOptions f93742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f93743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f93744e;

    public UserInteractionIntegration(Application application, io.sentry.util.s sVar) {
        this.f93740a = (Application) io.sentry.util.v.c(application, "Application is required");
        this.f93743d = sVar.b("androidx.core.view.GestureDetectorCompat", this.f93742c);
        this.f93744e = sVar.b("androidx.lifecycle.Lifecycle", this.f93742c);
    }

    private void b(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f93742c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(b7.INFO, "Window was null in startTracking", new Object[0]);
                return;
            }
            return;
        }
        if (this.f93741b == null || this.f93742c == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            callback = new io.sentry.android.core.internal.gestures.b();
        }
        if (callback instanceof io.sentry.android.core.internal.gestures.h) {
            return;
        }
        window.setCallback(new io.sentry.android.core.internal.gestures.h(callback, activity, new io.sentry.android.core.internal.gestures.g(activity, this.f93741b, this.f93742c), this.f93742c));
    }

    private void h(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f93742c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(b7.INFO, "Window was null in stopTracking", new Object[0]);
                return;
            }
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof io.sentry.android.core.internal.gestures.h) {
            io.sentry.android.core.internal.gestures.h hVar = (io.sentry.android.core.internal.gestures.h) callback;
            hVar.c();
            if (hVar.a() instanceof io.sentry.android.core.internal.gestures.b) {
                window.setCallback(null);
            } else {
                window.setCallback(hVar.a());
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f93740a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f93742c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(b7.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.r1
    public void m(io.sentry.c1 c1Var, q7 q7Var) {
        this.f93742c = (SentryAndroidOptions) io.sentry.util.v.c(q7Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) q7Var : null, "SentryAndroidOptions is required");
        this.f93741b = (io.sentry.c1) io.sentry.util.v.c(c1Var, "Scopes are required");
        boolean z15 = this.f93742c.isEnableUserInteractionBreadcrumbs() || this.f93742c.isEnableUserInteractionTracing();
        io.sentry.v0 logger = this.f93742c.getLogger();
        b7 b7Var = b7.DEBUG;
        logger.c(b7Var, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z15));
        if (z15) {
            if (!this.f93743d) {
                q7Var.getLogger().c(b7.INFO, "androidx.core is not available, UserInteractionIntegration won't be installed", new Object[0]);
                return;
            }
            this.f93740a.registerActivityLifecycleCallbacks(this);
            this.f93742c.getLogger().c(b7Var, "UserInteractionIntegration installed.", new Object[0]);
            io.sentry.util.p.a("UserInteraction");
            if (this.f93744e) {
                Activity activityB = b1.c().b();
                if ((activityB instanceof androidx.p016lifecycle.q) && ((androidx.p016lifecycle.q) activityB).getLifecycleRegistry().getState() == androidx.lifecycle.j.b.RESUMED) {
                    b(activityB);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        h(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
