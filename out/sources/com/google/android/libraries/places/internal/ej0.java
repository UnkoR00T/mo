package com.google.android.libraries.places.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
final class ej0 extends g70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hj0 f32212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f32213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ hj0 f32214c;

    ej0(hj0 hj0Var, hj0 hj0Var2) {
        Objects.requireNonNull(hj0Var);
        this.f32214c = hj0Var;
        this.f32213b = new AtomicBoolean(false);
        this.f32212a = (hj0) zj.p.r(hj0Var2, "pickFirstLeafLoadBalancer");
    }

    @Override // com.google.android.libraries.places.internal.g70
    public final b70 a(c70 c70Var) {
        if (this.f32213b.compareAndSet(false, true)) {
            hj0 hj0Var = this.f32214c;
            final hj0 hj0Var2 = this.f32212a;
            u90 u90VarD = hj0Var.j().d();
            Objects.requireNonNull(hj0Var2);
            u90VarD.c(new Runnable() { // from class: com.google.android.libraries.places.internal.dj0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    hj0Var2.d();
                }
            });
            u90VarD.a();
        }
        return b70.d();
    }
}
