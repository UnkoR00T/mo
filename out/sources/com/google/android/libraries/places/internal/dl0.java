package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class dl0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ uk0 f32057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ jl0 f32058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ il0 f32059c;

    dl0(il0 il0Var, uk0 uk0Var, jl0 jl0Var) {
        this.f32057a = uk0Var;
        this.f32058b = jl0Var;
        Objects.requireNonNull(il0Var);
        this.f32059c = il0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uk0 uk0Var = this.f32057a;
        synchronized (uk0Var.f33944a) {
            if (uk0Var.f33946c) {
                return;
            }
            uk0Var.b();
            il0 il0Var = this.f32059c;
            il0Var.f32574b.j().execute(new cl0(this, this.f32058b));
        }
    }
}
