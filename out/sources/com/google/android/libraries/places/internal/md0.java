package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class md0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ a80 f32937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ od0 f32938b;

    md0(od0 od0Var, a80 a80Var) {
        this.f32937a = a80Var;
        Objects.requireNonNull(od0Var);
        this.f32938b = od0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32938b.f().d(this.f32937a);
    }
}
