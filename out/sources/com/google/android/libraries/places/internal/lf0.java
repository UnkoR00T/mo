package com.google.android.libraries.places.internal;

import java.net.SocketAddress;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class lf0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f32827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ cg0 f32828b;

    lf0(cg0 cg0Var, List list) {
        this.f32827a = list;
        Objects.requireNonNull(cg0Var);
        this.f32828b = cg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hi0 hi0VarI;
        cg0 cg0Var = this.f32828b;
        wf0 wf0VarI = cg0Var.I();
        List list = this.f32827a;
        SocketAddress socketAddressE = cg0Var.I().e();
        wf0VarI.g(list);
        cg0Var.J(list);
        b50 b50VarC = cg0Var.k().c();
        b50 b50Var = b50.READY;
        if ((b50VarC != b50Var && cg0Var.k().c() != b50.CONNECTING) || cg0Var.I().h(socketAddressE)) {
            hi0VarI = null;
        } else if (cg0Var.k().c() == b50Var) {
            hi0VarI = cg0Var.i();
            cg0Var.j(null);
            cg0Var.I().d();
            cg0Var.y(b50.IDLE);
        } else {
            cg0Var.b().d(l90.f32815m.e("InternalSubchannel closed pending transport due to address change"));
            cg0Var.h(null);
            cg0Var.I().d();
            cg0Var.w();
            hi0VarI = null;
        }
        if (hi0VarI != null) {
            if (cg0Var.L() != null) {
                cg0Var.N().d(l90.f32815m.e("InternalSubchannel closed transport early due to address change"));
                cg0Var.L().a();
                cg0Var.M(null);
                cg0Var.O(null);
            }
            cg0Var.O(hi0VarI);
            cg0Var.M(cg0Var.H().e(new kf0(this), 5L, TimeUnit.SECONDS, cg0Var.D()));
        }
    }
}
