package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ih0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ oh0 f32570a;

    ih0(oh0 oh0Var) {
        Objects.requireNonNull(oh0Var);
        this.f32570a = oh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32570a.f33184d.Z();
    }
}
