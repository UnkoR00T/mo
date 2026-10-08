package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ui0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ hj0 f33939a;

    ui0(hj0 hj0Var) {
        Objects.requireNonNull(hj0Var);
        this.f33939a = hj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hj0 hj0Var = this.f33939a;
        hj0Var.o(null);
        hj0Var.l().c();
        hj0Var.d();
    }
}
