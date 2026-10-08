package com.google.android.libraries.places.internal;

import java.util.LinkedHashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class kh0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ nh0 f32737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ oh0 f32738b;

    kh0(oh0 oh0Var, nh0 nh0Var) {
        this.f32737a = nh0Var;
        Objects.requireNonNull(oh0Var);
        this.f32738b = oh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oh0 oh0Var = this.f32738b;
        if (oh0Var.l().get() != uh0.f33906i0) {
            this.f32737a.r();
            return;
        }
        uh0 uh0Var = oh0Var.f33184d;
        if (uh0Var.r() == null) {
            uh0Var.s(new LinkedHashSet());
            uh0Var.X.a(uh0Var.t(), true);
        }
        uh0Var.r().add(this.f32737a);
    }
}
