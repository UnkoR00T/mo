package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ec0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f32189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ pc0 f32190b;

    ec0(pc0 pc0Var, Object obj) {
        this.f32189a = obj;
        Objects.requireNonNull(pc0Var);
        this.f32190b = pc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32190b.l().b(this.f32189a);
    }
}
