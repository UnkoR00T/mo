package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class dh0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l90 f32037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ eh0 f32038b;

    dh0(eh0 eh0Var, l90 l90Var) {
        this.f32037a = l90Var;
        Objects.requireNonNull(eh0Var);
        this.f32038b = eh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32038b.b(this.f32037a);
    }
}
