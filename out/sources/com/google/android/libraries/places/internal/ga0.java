package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ga0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f32379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ha0 f32380b;

    ga0(ha0 ha0Var, er0 er0Var, int i15) {
        this.f32379a = i15;
        Objects.requireNonNull(ha0Var);
        this.f32380b = ha0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i15 = fr0.f32341a;
            this.f32380b.t().m(this.f32379a);
        } catch (Throwable th4) {
            this.f32380b.f(th4);
        }
    }
}
