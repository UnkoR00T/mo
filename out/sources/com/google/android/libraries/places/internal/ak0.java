package com.google.android.libraries.places.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class ak0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f31657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f31658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f31659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zj.u f31660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f31661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f31662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ScheduledFuture f31663g;

    ak0(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, zj.u uVar) {
        this.f31659c = runnable;
        this.f31658b = executor;
        this.f31657a = scheduledExecutorService;
        this.f31660d = uVar;
        uVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final long c() {
        return this.f31660d.d(TimeUnit.NANOSECONDS);
    }

    final void a(long j15, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j15);
        long jC = c() + nanos;
        this.f31662f = true;
        if (jC - this.f31661e < 0 || this.f31663g == null) {
            ScheduledFuture scheduledFuture = this.f31663g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f31663g = this.f31657a.schedule(new zj0(this, null), nanos, TimeUnit.NANOSECONDS);
        }
        this.f31661e = jC;
    }

    final void b(boolean z15) {
        ScheduledFuture scheduledFuture;
        this.f31662f = false;
        if (!z15 || (scheduledFuture = this.f31663g) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f31663g = null;
    }

    final /* synthetic */ ScheduledExecutorService d() {
        return this.f31657a;
    }

    final /* synthetic */ Executor e() {
        return this.f31658b;
    }

    final /* synthetic */ Runnable f() {
        return this.f31659c;
    }

    final /* synthetic */ long g() {
        return this.f31661e;
    }

    final /* synthetic */ boolean h() {
        return this.f31662f;
    }

    final /* synthetic */ void i(boolean z15) {
        this.f31662f = false;
    }

    final /* synthetic */ void j(ScheduledFuture scheduledFuture) {
        this.f31663g = scheduledFuture;
    }
}
