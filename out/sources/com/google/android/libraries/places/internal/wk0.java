package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class wk0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final uk0 f34173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ll0 f34174b;

    wk0(ll0 ll0Var, uk0 uk0Var) {
        Objects.requireNonNull(ll0Var);
        this.f34174b = ll0Var;
        this.f34173a = uk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ll0 ll0Var = this.f34174b;
        jl0 jl0VarI0 = ll0Var.i0(ll0Var.E().f31669e, false, true);
        if (jl0VarI0 == null) {
            return;
        }
        ll0Var.j().execute(new vk0(this, jl0VarI0));
    }
}
