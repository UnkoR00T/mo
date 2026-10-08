package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class dd0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f32008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ pd0 f32009b;

    dd0(pd0 pd0Var, int i15) {
        this.f32008a = i15;
        Objects.requireNonNull(pd0Var);
        this.f32009b = pd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32009b.v().p(this.f32008a);
    }
}
