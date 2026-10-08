package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class tc0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ gi0 f33781a;

    tc0(xc0 xc0Var, gi0 gi0Var) {
        this.f33781a = gi0Var;
        Objects.requireNonNull(xc0Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33781a.d();
    }
}
