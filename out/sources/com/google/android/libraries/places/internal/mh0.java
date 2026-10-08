package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class mh0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ nh0 f32945a;

    mh0(nh0 nh0Var) {
        Objects.requireNonNull(nh0Var);
        this.f32945a = nh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nh0 nh0Var = this.f32945a;
        uh0 uh0Var = nh0Var.f33064p.f33184d;
        if (uh0Var.r() != null) {
            uh0Var.r().remove(nh0Var);
            if (uh0Var.r().isEmpty()) {
                uh0Var.X.a(uh0Var.t(), false);
                uh0Var.s(null);
                if (uh0Var.w().get()) {
                    uh0Var.v().a(uh0.f33903f0);
                }
            }
        }
    }
}
