package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ad0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ x40 f31588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ pd0 f31589b;

    ad0(pd0 pd0Var, x40 x40Var) {
        this.f31588a = x40Var;
        Objects.requireNonNull(pd0Var);
        this.f31589b = pd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31589b.v().b(this.f31588a);
    }
}
