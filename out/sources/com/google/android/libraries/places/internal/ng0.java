package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ng0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ uh0 f33059a;

    ng0(uh0 uh0Var) {
        Objects.requireNonNull(uh0Var);
        this.f33059a = uh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uh0 uh0Var = this.f33059a;
        uh0Var.F().a(2, "Entering SHUTDOWN state");
        uh0Var.k().a(b50.SHUTDOWN);
    }
}
