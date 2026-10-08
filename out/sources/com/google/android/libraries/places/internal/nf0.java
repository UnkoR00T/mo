package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class nf0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ cg0 f33058a;

    nf0(cg0 cg0Var) {
        Objects.requireNonNull(cg0Var);
        this.f33058a = cg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cg0 cg0Var = this.f33058a;
        cg0Var.F().a(2, "Terminated");
        uh0 uh0Var = ((qh0) cg0Var.C()).f33414b.f33690j;
        uh0Var.q().remove(cg0Var);
        uh0Var.G().e(cg0Var);
        uh0Var.l0();
    }
}
