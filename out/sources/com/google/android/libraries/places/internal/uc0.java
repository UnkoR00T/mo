package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class uc0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l90 f33875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ xc0 f33876b;

    uc0(xc0 xc0Var, l90 l90Var) {
        this.f33875a = l90Var;
        Objects.requireNonNull(xc0Var);
        this.f33876b = xc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33876b.n().a(this.f33875a, hm0.SUBCHANNEL_SHUTDOWN);
    }
}
