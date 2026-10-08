package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ol0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ql0 f33192a;

    ol0(ql0 ql0Var) {
        Objects.requireNonNull(ql0Var);
        this.f33192a = ql0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33192a.d();
    }
}
