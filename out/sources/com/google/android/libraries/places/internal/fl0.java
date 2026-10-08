package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class fl0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ jl0 f32311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ il0 f32312b;

    fl0(il0 il0Var, jl0 jl0Var) {
        this.f32311a = jl0Var;
        Objects.requireNonNull(il0Var);
        this.f32312b = il0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32312b.f32574b.j0(this.f32311a);
    }
}
