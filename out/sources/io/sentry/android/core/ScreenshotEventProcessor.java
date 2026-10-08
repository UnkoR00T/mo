package io.sentry.android.core;

import android.app.Activity;
import android.graphics.Bitmap;
import io.sentry.b7;
import io.sentry.r6;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class ScreenshotEventProcessor implements io.sentry.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SentryAndroidOptions f93703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t0 f93704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.l f93705c = new io.sentry.android.core.internal.util.l(io.sentry.android.core.internal.util.f.b(), 2000, 3);

    public ScreenshotEventProcessor(SentryAndroidOptions sentryAndroidOptions, t0 t0Var) {
        this.f93703a = (SentryAndroidOptions) io.sentry.util.v.c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f93704b = (t0) io.sentry.util.v.c(t0Var, "BuildInfoProvider is required");
        if (sentryAndroidOptions.isAttachScreenshot()) {
            io.sentry.util.p.a("Screenshot");
        }
    }

    @Override // io.sentry.e0
    public r6 m(r6 r6Var, io.sentry.j0 j0Var) {
        final Bitmap bitmapC;
        if (r6Var.z0()) {
            if (!this.f93703a.isAttachScreenshot()) {
                this.f93703a.getLogger().c(b7.DEBUG, "attachScreenshot is disabled.", new Object[0]);
                return r6Var;
            }
            Activity activityB = b1.c().b();
            if (activityB != null && !io.sentry.util.m.i(j0Var)) {
                boolean zA = this.f93705c.a();
                this.f93703a.getBeforeScreenshotCaptureCallback();
                if (!zA && (bitmapC = io.sentry.android.core.internal.util.u.c(activityB, this.f93703a.getThreadChecker(), this.f93703a.getLogger(), this.f93704b)) != null) {
                    j0Var.m(io.sentry.b.a(new Callable() { // from class: io.sentry.android.core.u1
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return io.sentry.android.core.internal.util.u.d(bitmapC, this.f94174a.f93703a.getLogger());
                        }
                    }, "screenshot.png", "image/png", false));
                    j0Var.k("android:activity", activityB);
                }
            }
        }
        return r6Var;
    }

    @Override // io.sentry.e0
    public io.sentry.protocol.c0 p(io.sentry.protocol.c0 c0Var, io.sentry.j0 j0Var) {
        return c0Var;
    }
}
