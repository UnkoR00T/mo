package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class bh0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ch0 f31797a;

    bh0(ch0 ch0Var) {
        Objects.requireNonNull(ch0Var);
        this.f31797a = ch0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31797a.f31900b.i0();
    }
}
