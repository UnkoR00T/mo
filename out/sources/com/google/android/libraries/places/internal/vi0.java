package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class vi0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ hj0 f34065a;

    vi0(hj0 hj0Var) {
        Objects.requireNonNull(hj0Var);
        this.f34065a = hj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hj0 hj0Var = this.f34065a;
        hj0Var.m(null);
        if (hj0Var.l().b()) {
            hj0Var.d();
        }
    }
}
