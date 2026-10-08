package io.sentry.android.ndk;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.k1;
import io.sentry.ndk.NativeModuleListLoader;
import io.sentry.q7;
import io.sentry.util.v;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements k1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final io.sentry.util.a f94230c = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7 f94231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NativeModuleListLoader f94232b;

    public a(SentryAndroidOptions sentryAndroidOptions, NativeModuleListLoader nativeModuleListLoader) {
        this.f94231a = (q7) v.c(sentryAndroidOptions, "The SentryAndroidOptions is required.");
        this.f94232b = (NativeModuleListLoader) v.c(nativeModuleListLoader, "The NativeModuleListLoader is required.");
    }
}
