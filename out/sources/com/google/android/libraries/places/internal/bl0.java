package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class bl0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ a80 f31806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ il0 f31807b;

    bl0(il0 il0Var, a80 a80Var) {
        this.f31806a = a80Var;
        Objects.requireNonNull(il0Var);
        this.f31807b = il0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31807b.f32574b.N().d(this.f31806a);
    }
}
