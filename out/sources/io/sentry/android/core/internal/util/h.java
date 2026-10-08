package io.sentry.android.core.internal.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import io.sentry.protocol.b0;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements io.sentry.util.thread.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h f93990a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile long f93991b = Process.myTid();

    private h() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.g
            @Override // java.lang.Runnable
            public final void run() {
                h.f93991b = Process.myTid();
            }
        });
    }

    public static h e() {
        return f93990a;
    }

    @Override // io.sentry.util.thread.a
    public boolean a() {
        return h(Thread.currentThread());
    }

    @Override // io.sentry.util.thread.a
    public String b() {
        return a() ? "main" : Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.a
    public long c() {
        return Process.myTid();
    }

    public boolean f(long j15) {
        return Looper.getMainLooper().getThread().getId() == j15;
    }

    public boolean g(b0 b0Var) {
        Long l15 = b0Var.l();
        return l15 != null && f(l15.longValue());
    }

    public boolean h(Thread thread) {
        return f(thread.getId());
    }
}
