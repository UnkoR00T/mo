package com.google.android.libraries.places.internal;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class u90 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f33864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Queue f33865b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference f33866c = new AtomicReference();

    public u90(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f33864a = (Thread.UncaughtExceptionHandler) zj.p.r(uncaughtExceptionHandler, "uncaughtExceptionHandler");
    }

    public final void a() {
        while (androidx.camera.view.i.a(this.f33866c, null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable runnable = (Runnable) this.f33865b.poll();
                    if (runnable == null) {
                        break;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th4) {
                        this.f33864a.uncaughtException(Thread.currentThread(), th4);
                    }
                } catch (Throwable th5) {
                    this.f33866c.set(null);
                    throw th5;
                }
            }
            this.f33866c.set(null);
            if (this.f33865b.isEmpty()) {
                return;
            }
        }
    }

    public final void c(Runnable runnable) {
        this.f33865b.add((Runnable) zj.p.r(runnable, "runnable is null"));
    }

    public final void d() {
        zj.p.x(Thread.currentThread() == this.f33866c.get(), "Not called from the SynchronizationContext");
    }

    public final t90 e(Runnable runnable, long j15, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        s90 s90Var = new s90(runnable);
        return new t90(s90Var, scheduledExecutorService.schedule(new r90(this, s90Var, runnable), j15, timeUnit), null);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(runnable);
        a();
    }
}
