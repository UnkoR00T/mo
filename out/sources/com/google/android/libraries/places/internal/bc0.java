package com.google.android.libraries.places.internal;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class bc0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f31787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f31788b = "CallOptions";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ pc0 f31789c;

    bc0(pc0 pc0Var, long j15, String str) {
        this.f31787a = j15;
        Objects.requireNonNull(pc0Var);
        this.f31789c = pc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j15 = this.f31787a;
        long jAbs = Math.abs(j15);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long nanos = jAbs / timeUnit.toNanos(1L);
        long jAbs2 = Math.abs(j15) % timeUnit.toNanos(1L);
        StringBuilder sb5 = new StringBuilder();
        if (j15 < 0) {
            sb5.append("ClientCall started after ");
            sb5.append(this.f31788b);
            sb5.append(" deadline was exceeded. Deadline has been exceeded for ");
        } else {
            sb5.append("Deadline ");
            sb5.append(this.f31788b);
            sb5.append(" was exceeded after ");
        }
        sb5.append(nanos);
        sb5.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        sb5.append("s");
        this.f31789c.i(l90.f32810h.e(sb5.toString()), true);
    }
}
