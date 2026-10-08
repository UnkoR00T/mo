package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class hl0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ il0 f32494a;

    hl0(il0 il0Var) {
        Objects.requireNonNull(il0Var);
        this.f32494a = il0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ll0 ll0Var = this.f32494a.f32574b;
        if (ll0Var.S()) {
            return;
        }
        ll0Var.N().c();
    }
}
