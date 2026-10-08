package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class sc0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ gi0 f33676a;

    sc0(xc0 xc0Var, gi0 gi0Var) {
        this.f33676a = gi0Var;
        Objects.requireNonNull(xc0Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33676a.b(false);
    }
}
