package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class cl0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ jl0 f31909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ dl0 f31910b;

    cl0(dl0 dl0Var, jl0 jl0Var) {
        this.f31909a = jl0Var;
        Objects.requireNonNull(dl0Var);
        this.f31910b = dl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31910b.f32059c.f32574b.j0(this.f31909a);
    }
}
