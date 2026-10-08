package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class nc0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ oc0 f33051a;

    nc0(oc0 oc0Var) {
        Objects.requireNonNull(oc0Var);
        this.f33051a = oc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33051a.f().d();
    }
}
