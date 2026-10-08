package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class lc0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f32824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ oc0 f32825b;

    lc0(oc0 oc0Var, Object obj) {
        this.f32824a = obj;
        Objects.requireNonNull(oc0Var);
        this.f32825b = oc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32825b.f().b(this.f32824a);
    }
}
