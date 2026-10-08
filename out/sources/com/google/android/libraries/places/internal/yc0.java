package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class yc0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f34389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ pd0 f34390b;

    yc0(pd0 pd0Var, int i15) {
        this.f34389a = i15;
        Objects.requireNonNull(pd0Var);
        this.f34390b = pd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34390b.v().a(this.f34389a);
    }
}
