package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class yf0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ qd0 f34391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ l90 f34392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ag0 f34393c;

    yf0(ag0 ag0Var, qd0 qd0Var, l90 l90Var) {
        this.f34391a = qd0Var;
        this.f34392b = l90Var;
        Objects.requireNonNull(ag0Var);
        this.f34393c = ag0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ag0 ag0Var = this.f34393c;
        cg0 cg0Var = ag0Var.f31620c;
        if (cg0Var.k().c() == b50.SHUTDOWN) {
            return;
        }
        vb0 vb0Var = ag0Var.f31618a;
        if (cg0Var.i() == vb0Var) {
            cg0Var.j(null);
            cg0Var.I().d();
            cg0Var.y(b50.IDLE);
            String strF = ag0.f(cg0Var.I().f(), t80.f33761a);
            String strF2 = ag0.f(cg0Var.I().f(), p50.f33266e);
            qd0 qd0Var = this.f34391a;
            wf0 wf0VarI = cg0Var.I();
            cg0Var.o().c(cg0Var.p(), strF, strF2, qd0Var.zza(), ag0.e((e90) wf0VarI.f().a(qe0.f33407a)));
            return;
        }
        if (cg0Var.b() == vb0Var) {
            cg0Var.o().b(cg0Var.p(), ag0.f(cg0Var.I().f(), t80.f33761a), ag0.f(cg0Var.I().f(), p50.f33266e));
            zj.p.B(cg0Var.k().c() == b50.CONNECTING, "Expected state is CONNECTING, actual state is %s", cg0Var.k().c());
            cg0Var.I().c();
            if (cg0Var.I().a()) {
                cg0Var.w();
                return;
            }
            cg0Var.h(null);
            cg0Var.I().d();
            cg0Var.x(this.f34392b);
        }
    }
}
