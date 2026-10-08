package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class ma0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f32929c = Logger.getLogger(ma0.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicLong f32931b;

    public ma0(String str, long j15) {
        AtomicLong atomicLong = new AtomicLong();
        this.f32931b = atomicLong;
        zj.p.e(true, "value must be positive");
        this.f32930a = "keepalive time nanos";
        atomicLong.set(Long.MAX_VALUE);
    }

    public final la0 a() {
        return new la0(this, this.f32931b.get(), null);
    }

    final /* synthetic */ String c() {
        return this.f32930a;
    }

    final /* synthetic */ AtomicLong d() {
        return this.f32931b;
    }
}
