package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class cd0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f31863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ pd0 f31864b;

    cd0(pd0 pd0Var, int i15) {
        this.f31863a = i15;
        Objects.requireNonNull(pd0Var);
        this.f31864b = pd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31864b.v().m(this.f31863a);
    }
}
