package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class lh0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f32830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ nh0 f32831b;

    lh0(nh0 nh0Var, Runnable runnable) {
        this.f32830a = runnable;
        Objects.requireNonNull(nh0Var);
        this.f32831b = nh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32830a.run();
        nh0 nh0Var = this.f32831b;
        mh0 mh0Var = new mh0(nh0Var);
        u90 u90Var = nh0Var.f33064p.f33184d.f33925n;
        u90Var.c(mh0Var);
        u90Var.a();
    }
}
