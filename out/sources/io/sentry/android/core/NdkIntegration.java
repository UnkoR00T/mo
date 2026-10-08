package io.sentry.android.core;

import io.sentry.b7;
import io.sentry.q7;
import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public final class NdkIntegration implements io.sentry.r1, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f93685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SentryAndroidOptions f93686b;

    public NdkIntegration(Class<?> cls) {
        this.f93685a = cls;
    }

    private void b(SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setEnableNdk(false);
        sentryAndroidOptions.setEnableScopeSync(false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f93686b;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk()) {
            return;
        }
        Class<?> cls = this.f93685a;
        try {
            if (cls != null) {
                cls.getMethod("close", null).invoke(null, null);
                this.f93686b.getLogger().c(b7.DEBUG, "NdkIntegration removed.", new Object[0]);
            }
        } catch (NoSuchMethodException e15) {
            this.f93686b.getLogger().b(b7.ERROR, "Failed to invoke the SentryNdk.close method.", e15);
        } catch (Throwable th4) {
            this.f93686b.getLogger().b(b7.ERROR, "Failed to close SentryNdk.", th4);
        } finally {
            b(this.f93686b);
        }
    }

    @Override // io.sentry.r1
    public final void m(io.sentry.c1 c1Var, q7 q7Var) {
        io.sentry.util.v.c(c1Var, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.v.c(q7Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) q7Var : null, "SentryAndroidOptions is required");
        this.f93686b = sentryAndroidOptions;
        boolean zIsEnableNdk = sentryAndroidOptions.isEnableNdk();
        io.sentry.v0 logger = this.f93686b.getLogger();
        b7 b7Var = b7.DEBUG;
        logger.c(b7Var, "NdkIntegration enabled: %s", Boolean.valueOf(zIsEnableNdk));
        if (!zIsEnableNdk || this.f93685a == null) {
            b(this.f93686b);
            return;
        }
        if (this.f93686b.getCacheDirPath() == null) {
            this.f93686b.getLogger().c(b7.ERROR, "No cache dir path is defined in options.", new Object[0]);
            b(this.f93686b);
            return;
        }
        try {
            this.f93685a.getMethod("init", SentryAndroidOptions.class).invoke(null, this.f93686b);
            this.f93686b.getLogger().c(b7Var, "NdkIntegration installed.", new Object[0]);
            io.sentry.util.p.a("Ndk");
        } catch (NoSuchMethodException e15) {
            b(this.f93686b);
            this.f93686b.getLogger().b(b7.ERROR, "Failed to invoke the SentryNdk.init method.", e15);
        } catch (Throwable th4) {
            b(this.f93686b);
            this.f93686b.getLogger().b(b7.ERROR, "Failed to initialize SentryNdk.", th4);
        }
    }
}
