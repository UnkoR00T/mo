package io.sentry;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes4.dex */
final class b3 implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b3 f94674a = new b3();

    private b3() {
    }

    public static /* synthetic */ Object d() {
        return null;
    }

    public static /* synthetic */ Object e() {
        return null;
    }

    public static f1 f() {
        return f94674a;
    }

    @Override // io.sentry.f1
    public void a(long j15) {
    }

    @Override // io.sentry.f1
    public void b() {
    }

    @Override // io.sentry.f1
    public Future<?> c(Runnable runnable, long j15) {
        return new FutureTask(new Callable() { // from class: io.sentry.z2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return b3.e();
            }
        });
    }

    @Override // io.sentry.f1
    public boolean isClosed() {
        return false;
    }

    @Override // io.sentry.f1
    public Future<?> submit(Runnable runnable) {
        return new FutureTask(new Callable() { // from class: io.sentry.a3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return b3.d();
            }
        });
    }
}
