package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class mn0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ la0 f32969a;

    mn0(nn0 nn0Var, la0 la0Var) {
        this.f32969a = la0Var;
        Objects.requireNonNull(nn0Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32969a.a();
    }
}
