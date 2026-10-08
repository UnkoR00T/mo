package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class rc0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ gi0 f33505a;

    rc0(xc0 xc0Var, gi0 gi0Var) {
        this.f33505a = gi0Var;
        Objects.requireNonNull(xc0Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33505a.b(true);
    }
}
