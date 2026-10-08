package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class gl0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ km0 f32396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ il0 f32397b;

    gl0(il0 il0Var, km0 km0Var) {
        this.f32396a = km0Var;
        Objects.requireNonNull(il0Var);
        this.f32397b = il0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32397b.f32574b.N().a(this.f32396a);
    }
}
