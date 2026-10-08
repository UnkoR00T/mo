package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ic0 extends yb0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final j40 f32561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final l90 f32562c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ic0(pc0 pc0Var, j40 j40Var, l90 l90Var) {
        super(pc0Var.k());
        Objects.requireNonNull(pc0Var);
        this.f32561b = j40Var;
        this.f32562c = l90Var;
    }

    @Override // com.google.android.libraries.places.internal.yb0
    public final void a() {
        this.f32561b.c(this.f32562c, new a80());
    }
}
