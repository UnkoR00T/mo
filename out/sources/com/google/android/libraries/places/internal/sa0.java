package com.google.android.libraries.places.internal;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
final class sa0 implements nl0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f33667e = Logger.getLogger(sa0.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f33668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u90 f33669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private t90 f33670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private de0 f33671d;

    sa0(ce0 ce0Var, ScheduledExecutorService scheduledExecutorService, u90 u90Var) {
        this.f33668a = scheduledExecutorService;
        this.f33669b = u90Var;
    }

    @Override // com.google.android.libraries.places.internal.nl0
    public final void a(Runnable runnable) {
        u90 u90Var = this.f33669b;
        u90Var.d();
        if (this.f33671d == null) {
            this.f33671d = new de0();
        }
        t90 t90Var = this.f33670c;
        if (t90Var == null || !t90Var.b()) {
            long jA = this.f33671d.a();
            this.f33670c = u90Var.e(runnable, jA, TimeUnit.NANOSECONDS, this.f33668a);
            f33667e.logp(Level.FINE, "io.grpc.internal.BackoffPolicyRetryScheduler", "schedule", "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jA));
        }
    }

    final /* synthetic */ void b() {
        t90 t90Var = this.f33670c;
        if (t90Var != null && t90Var.b()) {
            this.f33670c.a();
        }
        this.f33671d = null;
    }

    @Override // com.google.android.libraries.places.internal.nl0
    public final void zzb() {
        u90 u90Var = this.f33669b;
        u90Var.d();
        u90Var.c(new Runnable() { // from class: com.google.android.libraries.places.internal.ra0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f33503a.b();
            }
        });
        u90Var.a();
    }
}
