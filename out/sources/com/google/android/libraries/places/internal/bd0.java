package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class bd0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ n50 f31790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ pd0 f31791b;

    bd0(pd0 pd0Var, n50 n50Var) {
        this.f31790a = n50Var;
        Objects.requireNonNull(pd0Var);
        this.f31791b = pd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31791b.v().n(this.f31790a);
    }
}
