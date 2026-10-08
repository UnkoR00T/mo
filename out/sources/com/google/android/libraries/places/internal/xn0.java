package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class xn0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ao0 f34301a;

    xn0(ao0 ao0Var) {
        Objects.requireNonNull(ao0Var);
        this.f34301a = ao0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ao0 ao0Var = this.f34301a;
        synchronized (ao0Var.p()) {
            ao0Var.E(Integer.MAX_VALUE);
            zj.p.x(ao0Var.F().isEmpty(), "Pending streams detected during transport start. RPCs should not be started before transport is ready.");
        }
        ao0 ao0Var2 = this.f34301a;
        ao0Var2.r().execute(ao0Var2.u());
    }
}
