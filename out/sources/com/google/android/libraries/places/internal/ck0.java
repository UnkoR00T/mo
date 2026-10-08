package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ck0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ dk0 f31908a;

    ck0(dk0 dk0Var) {
        Objects.requireNonNull(dk0Var);
        this.f31908a = dk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ll0 ll0Var = this.f31908a.f32055g;
        ll0Var.T(true);
        xk0 xk0VarK = ll0Var.K();
        xk0 xk0VarK2 = ll0Var.K();
        ll0Var.N().b(ll0Var.K().a(), xk0VarK2.b(), xk0VarK.c());
    }
}
