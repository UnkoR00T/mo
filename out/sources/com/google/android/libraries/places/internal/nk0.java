package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class nk0 implements rk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f33067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ll0 f33068b;

    nk0(ll0 ll0Var, Object obj) {
        this.f33067a = obj;
        Objects.requireNonNull(ll0Var);
        this.f33068b = ll0Var;
    }

    @Override // com.google.android.libraries.places.internal.rk0
    public final void a(jl0 jl0Var) {
        jl0Var.f32664a.d(this.f33068b.i().e(this.f33067a));
        jl0Var.f32664a.I();
    }
}
