package com.google.android.libraries.places.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class l80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d90 f32796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u90 f32797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s80 f32798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f32799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i40 f32800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f32801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i80 f32802h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final y80 f32803i;

    /* synthetic */ l80(k80 k80Var, byte[] bArr) {
        this.f32795a = ((Integer) zj.p.r(k80Var.k(), "defaultPort not set")).intValue();
        this.f32796b = (d90) zj.p.r(k80Var.l(), "proxyDetector not set");
        this.f32797c = (u90) zj.p.r(k80Var.m(), "syncContext not set");
        this.f32798d = (s80) zj.p.r(k80Var.n(), "serviceConfigParser not set");
        this.f32799e = k80Var.o();
        this.f32800f = k80Var.p();
        this.f32801g = k80Var.q();
        this.f32802h = k80Var.r();
        this.f32803i = k80Var.s();
    }

    public static k80 g() {
        return new k80();
    }

    public final int a() {
        return this.f32795a;
    }

    public final d90 b() {
        return this.f32796b;
    }

    public final u90 c() {
        return this.f32797c;
    }

    public final ScheduledExecutorService d() {
        ScheduledExecutorService scheduledExecutorService = this.f32799e;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService;
        }
        throw new IllegalStateException("ScheduledExecutorService not set in Builder");
    }

    public final s80 e() {
        return this.f32798d;
    }

    public final Executor f() {
        return this.f32801g;
    }

    public final String toString() {
        return zj.j.c(this).b("defaultPort", this.f32795a).d("proxyDetector", this.f32796b).d("syncContext", this.f32797c).d("serviceConfigParser", this.f32798d).d("customArgs", null).d("scheduledExecutorService", this.f32799e).d("channelLogger", this.f32800f).d("executor", this.f32801g).d("overrideAuthority", null).d("metricRecorder", this.f32802h).d("nameResolverRegistry", this.f32803i).toString();
    }
}
