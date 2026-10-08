package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ed0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ j50 f32192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ pd0 f32193b;

    ed0(pd0 pd0Var, j50 j50Var) {
        this.f32192a = j50Var;
        Objects.requireNonNull(pd0Var);
        this.f32193b = pd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32193b.v().s(this.f32192a);
    }
}
