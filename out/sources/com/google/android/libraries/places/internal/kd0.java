package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class kd0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ km0 f32734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ od0 f32735b;

    kd0(od0 od0Var, km0 km0Var) {
        this.f32734a = km0Var;
        Objects.requireNonNull(od0Var);
        this.f32735b = od0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32735b.f().a(this.f32734a);
    }
}
