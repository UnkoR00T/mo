package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class og0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ uh0 f33180a;

    og0(uh0 uh0Var) {
        Objects.requireNonNull(uh0Var);
        this.f33180a = uh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uh0 uh0Var = this.f33180a;
        if (uh0Var.x()) {
            return;
        }
        uh0Var.y(true);
        uh0Var.d0();
    }
}
