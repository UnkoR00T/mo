package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ld0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ od0 f32826a;

    ld0(od0 od0Var) {
        Objects.requireNonNull(od0Var);
        this.f32826a = od0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32826a.f().c();
    }
}
