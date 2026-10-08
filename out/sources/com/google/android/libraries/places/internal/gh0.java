package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class gh0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ oh0 f32392a;

    gh0(oh0 oh0Var) {
        Objects.requireNonNull(oh0Var);
        this.f32392a = oh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oh0 oh0Var = this.f32392a;
        uh0 uh0Var = oh0Var.f33184d;
        if (uh0Var.r() == null) {
            if (oh0Var.l().get() == uh0.f33906i0) {
                oh0Var.l().set(null);
            }
            uh0Var.v().a(uh0.f33903f0);
        }
    }
}
