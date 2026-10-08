package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class mf0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l90 f32941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ cg0 f32942b;

    mf0(cg0 cg0Var, l90 l90Var) {
        this.f32941a = l90Var;
        Objects.requireNonNull(cg0Var);
        this.f32942b = cg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cg0 cg0Var = this.f32942b;
        b50 b50VarC = cg0Var.k().c();
        b50 b50Var = b50.SHUTDOWN;
        if (b50VarC == b50Var) {
            return;
        }
        l90 l90Var = this.f32941a;
        cg0Var.m(l90Var);
        hi0 hi0VarI = cg0Var.i();
        cg0Var.j(null);
        cg0Var.h(null);
        cg0Var.y(b50Var);
        cg0Var.I().d();
        if (cg0Var.P().isEmpty()) {
            cg0Var.z();
        }
        cg0Var.B();
        if (cg0Var.L() != null) {
            cg0Var.L().a();
            cg0Var.N().d(l90Var);
            cg0Var.M(null);
            cg0Var.O(null);
        }
        if (hi0VarI != null) {
            hi0VarI.d(l90Var);
        }
        vb0 vb0VarB = cg0Var.b();
        if (vb0VarB != null) {
            vb0VarB.d(l90Var);
        }
    }
}
