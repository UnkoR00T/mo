package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class id0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l90 f32563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ pd0 f32564b;

    id0(pd0 pd0Var, l90 l90Var) {
        this.f32563a = l90Var;
        Objects.requireNonNull(pd0Var);
        this.f32564b = pd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32564b.v().t(this.f32563a);
    }
}
