package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class dc0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l90 f32006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ pc0 f32007b;

    dc0(pc0 pc0Var, l90 l90Var) {
        this.f32006a = l90Var;
        Objects.requireNonNull(pc0Var);
        this.f32007b = pc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l90 l90Var = this.f32006a;
        this.f32007b.l().e(l90Var.h(), l90Var.i());
    }
}
