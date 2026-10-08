package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class pk0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ll0 f33336a;

    pk0(ll0 ll0Var) {
        Objects.requireNonNull(ll0Var);
        this.f33336a = ll0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ll0 ll0Var = this.f33336a;
        if (ll0Var.S()) {
            return;
        }
        ll0Var.N().c();
    }
}
