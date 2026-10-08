package io.sentry.android.core;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f94089a;

    p1() {
        this(Looper.getMainLooper());
    }

    public Thread a() {
        return this.f94089a.getLooper().getThread();
    }

    public void b(Runnable runnable) {
        this.f94089a.post(runnable);
    }

    p1(Looper looper) {
        this.f94089a = new Handler(looper);
    }
}
