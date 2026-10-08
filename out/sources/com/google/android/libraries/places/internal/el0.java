package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class el0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ il0 f32216a;

    el0(il0 il0Var) {
        Objects.requireNonNull(il0Var);
        this.f32216a = il0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ll0 ll0Var = this.f32216a.f32574b;
        ll0Var.T(true);
        xk0 xk0VarK = ll0Var.K();
        xk0 xk0VarK2 = ll0Var.K();
        ll0Var.N().b(ll0Var.K().a(), xk0VarK2.b(), xk0VarK.c());
    }
}
