package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class jf0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ cg0 f32657a;

    jf0(cg0 cg0Var) {
        Objects.requireNonNull(cg0Var);
        this.f32657a = cg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cg0 cg0Var = this.f32657a;
        if (cg0Var.k().c() == b50.IDLE) {
            cg0Var.F().a(2, "CONNECTING as requested");
            cg0Var.y(b50.CONNECTING);
            cg0Var.w();
        }
    }
}
