package com.google.android.libraries.places.internal;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class za0 implements Runnable, d50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f34478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f34479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f34480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile ScheduledFuture f34481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f34482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ fb0 f34483f;

    za0(fb0 fb0Var, j50 j50Var, boolean z15) {
        Objects.requireNonNull(fb0Var);
        this.f34483f = fb0Var;
        this.f34478a = z15;
        if (j50Var == null) {
            this.f34479b = false;
            this.f34480c = 0L;
        } else {
            this.f34479b = true;
            this.f34480c = j50Var.g(TimeUnit.NANOSECONDS);
        }
    }

    final void a() {
        if (this.f34482e) {
            return;
        }
        if (this.f34479b && !this.f34478a) {
            fb0 fb0Var = this.f34483f;
            if (fb0Var.p() != null) {
                this.f34481d = fb0Var.p().schedule(new hg0(this), this.f34480c, TimeUnit.NANOSECONDS);
            }
        }
        fb0 fb0Var2 = this.f34483f;
        fb0Var2.l().d(this, com.google.common.util.concurrent.u.a());
        if (this.f34482e) {
            b();
        }
    }

    final void b() {
        this.f34482e = true;
        ScheduledFuture scheduledFuture = this.f34481d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    final l90 c() {
        long j15 = this.f34480c;
        long jAbs = Math.abs(j15);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long nanos = jAbs / timeUnit.toNanos(1L);
        long jAbs2 = Math.abs(j15) % timeUnit.toNanos(1L);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(true != this.f34478a ? "CallOptions" : "Context");
        sb5.append(" deadline exceeded after ");
        if (j15 < 0) {
            sb5.append('-');
        }
        sb5.append(nanos);
        Locale locale = Locale.US;
        sb5.append(String.format(locale, ".%09d", Long.valueOf(jAbs2)));
        sb5.append("s. ");
        fb0 fb0Var = this.f34483f;
        Long l15 = (Long) fb0Var.n().i(s40.f33649a);
        sb5.append(String.format(locale, "Name resolution delay %.9f seconds.", Double.valueOf(l15 == null ? 0.0d : l15.longValue() / fb0.f32272p)));
        if (fb0Var.o() != null) {
            ff0 ff0Var = new ff0();
            fb0Var.o().r(ff0Var);
            sb5.append(" ");
            sb5.append(ff0Var);
        }
        return l90.f32810h.e(sb5.toString());
    }

    final /* synthetic */ long d() {
        return this.f34480c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34483f.o().t(c());
    }
}
