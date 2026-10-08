package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class fd0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ pd0 f32291a;

    fd0(pd0 pd0Var) {
        Objects.requireNonNull(pd0Var);
        this.f32291a = pd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32291a.l();
    }
}
