package com.google.android.libraries.places.internal;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class t90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s90 f33765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledFuture f33766b;

    /* synthetic */ t90(s90 s90Var, ScheduledFuture scheduledFuture, byte[] bArr) {
        this.f33765a = (s90) zj.p.r(s90Var, "runnable");
        this.f33766b = (ScheduledFuture) zj.p.r(scheduledFuture, "future");
    }

    public final void a() {
        this.f33765a.f33656b = true;
        this.f33766b.cancel(false);
    }

    public final boolean b() {
        s90 s90Var = this.f33765a;
        return (s90Var.f33657c || s90Var.f33656b) ? false : true;
    }
}
