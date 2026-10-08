package com.google.android.libraries.places.internal;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class de0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Random f32010a = new Random();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f32011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f32012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f32013d;

    public de0() {
        long nanos = TimeUnit.SECONDS.toNanos(1L);
        this.f32011b = nanos;
        this.f32012c = TimeUnit.MINUTES.toNanos(2L);
        this.f32013d = nanos;
    }

    public final long a() {
        long j15 = this.f32013d;
        double d15 = j15;
        this.f32013d = Math.min((long) (1.6d * d15), this.f32012c);
        double d16 = 0.2d * d15;
        double d17 = d15 * (-0.2d);
        zj.p.d(d16 >= d17);
        return j15 + ((long) ((this.f32010a.nextDouble() * (d16 - d17)) + d17));
    }
}
