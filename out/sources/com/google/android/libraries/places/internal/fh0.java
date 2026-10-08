package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class fh0 extends g40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ oh0 f32298a;

    fh0(oh0 oh0Var) {
        Objects.requireNonNull(oh0Var);
        this.f32298a = oh0Var;
    }

    @Override // com.google.android.libraries.places.internal.g40
    public final l40 b(f80 f80Var, f40 f40Var) {
        uh0 uh0Var = this.f32298a.f33184d;
        fb0 fb0Var = new fb0(f80Var, uh0Var.k0(f40Var), f40Var, uh0Var.R(), uh0Var.B() ? null : uh0Var.q0().zzb(), uh0Var.D(), null);
        fb0Var.f(uh0Var.u0());
        return fb0Var;
    }

    @Override // com.google.android.libraries.places.internal.g40
    public final String h() {
        return this.f32298a.m();
    }
}
