package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class gc0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ pc0 f32382a;

    gc0(pc0 pc0Var) {
        Objects.requireNonNull(pc0Var);
        this.f32382a = pc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32382a.l().d();
    }
}
