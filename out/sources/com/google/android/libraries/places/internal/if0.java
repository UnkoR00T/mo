package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class if0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ cg0 f32569a;

    if0(cg0 cg0Var) {
        Objects.requireNonNull(cg0Var);
        this.f32569a = cg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cg0 cg0Var = this.f32569a;
        cg0Var.K(null);
        cg0Var.F().a(2, "CONNECTING after backoff");
        cg0Var.y(b50.CONNECTING);
        cg0Var.w();
    }
}
