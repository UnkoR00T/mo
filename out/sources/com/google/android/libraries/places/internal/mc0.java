package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class mc0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l90 f32934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ a80 f32935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ oc0 f32936c;

    mc0(oc0 oc0Var, l90 l90Var, a80 a80Var) {
        this.f32934a = l90Var;
        this.f32935b = a80Var;
        Objects.requireNonNull(oc0Var);
        this.f32936c = oc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32936c.f().c(this.f32934a, this.f32935b);
    }
}
