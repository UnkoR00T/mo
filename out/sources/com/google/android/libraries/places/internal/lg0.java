package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class lg0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ uh0 f32829a;

    lg0(uh0 uh0Var) {
        Objects.requireNonNull(uh0Var);
        this.f32829a = uh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32829a.g0(true);
    }
}
