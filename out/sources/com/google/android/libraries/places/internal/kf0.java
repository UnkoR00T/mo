package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class kf0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ lf0 f32736a;

    kf0(lf0 lf0Var) {
        Objects.requireNonNull(lf0Var);
        this.f32736a = lf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cg0 cg0Var = this.f32736a.f32828b;
        cg0Var.M(null);
        cg0Var.O(null);
        cg0Var.N().d(l90.f32815m.e("InternalSubchannel closed transport due to address change"));
    }
}
