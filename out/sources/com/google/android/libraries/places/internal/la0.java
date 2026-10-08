package com.google.android.libraries.places.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class la0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f32822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ma0 f32823b;

    /* synthetic */ la0(ma0 ma0Var, long j15, byte[] bArr) {
        Objects.requireNonNull(ma0Var);
        this.f32823b = ma0Var;
        this.f32822a = j15;
    }

    public final void a() {
        ma0 ma0Var = this.f32823b;
        AtomicLong atomicLongD = ma0Var.d();
        long j15 = this.f32822a;
        long jMax = Math.max(j15 + j15, j15);
        if (atomicLongD.compareAndSet(j15, jMax)) {
            String strC = ma0Var.c();
            ma0.f32929c.logp(Level.WARNING, "io.grpc.internal.AtomicBackoff$State", "backoff", "Increased {0} to {1}", new Object[]{strC, Long.valueOf(jMax)});
        }
    }
}
