package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class kc0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ a80 f32732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ oc0 f32733b;

    kc0(oc0 oc0Var, a80 a80Var) {
        this.f32732a = a80Var;
        Objects.requireNonNull(oc0Var);
        this.f32733b = oc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32733b.f().a(this.f32732a);
    }
}
