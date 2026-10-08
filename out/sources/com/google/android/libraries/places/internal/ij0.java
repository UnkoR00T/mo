package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ij0 implements h70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ f70 f32571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ mj0 f32572b;

    ij0(mj0 mj0Var, f70 f70Var) {
        this.f32571a = f70Var;
        Objects.requireNonNull(mj0Var);
        this.f32572b = mj0Var;
    }

    @Override // com.google.android.libraries.places.internal.h70
    public final void a(c50 c50Var) {
        this.f32572b.e(this.f32571a, c50Var);
    }
}
