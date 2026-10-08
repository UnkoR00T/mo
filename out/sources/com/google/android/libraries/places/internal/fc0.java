package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class fc0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f32288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ pc0 f32289b;

    fc0(pc0 pc0Var, int i15) {
        this.f32288a = i15;
        Objects.requireNonNull(pc0Var);
        this.f32289b = pc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32289b.l().c(this.f32288a);
    }
}
