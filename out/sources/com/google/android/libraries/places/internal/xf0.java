package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class xf0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ag0 f34287a;

    xf0(ag0 ag0Var) {
        Objects.requireNonNull(ag0Var);
        this.f34287a = ag0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ag0 ag0Var = this.f34287a;
        cg0 cg0Var = ag0Var.f31620c;
        cg0Var.q(null);
        if (cg0Var.l() != null) {
            zj.p.x(cg0Var.i() == null, "Unexpected non-null activeTransport");
            ag0Var.f31618a.d(cg0Var.l());
            return;
        }
        vb0 vb0Var = ag0Var.f31618a;
        if (cg0Var.b() == vb0Var) {
            cg0Var.j(vb0Var);
            cg0Var.h(null);
            cg0Var.n(cg0Var.I().f());
            cg0Var.y(b50.READY);
            cg0Var.o().a(cg0Var.p(), ag0.f(cg0Var.I().f(), t80.f33761a), ag0.f(cg0Var.I().f(), p50.f33266e), ag0.e((e90) cg0Var.I().f().a(qe0.f33407a)));
        }
    }
}
