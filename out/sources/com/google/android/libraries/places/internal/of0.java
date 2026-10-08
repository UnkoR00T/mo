package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class of0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ vb0 f33177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f33178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ cg0 f33179c;

    of0(cg0 cg0Var, vb0 vb0Var, boolean z15) {
        this.f33177a = vb0Var;
        this.f33178b = z15;
        Objects.requireNonNull(cg0Var);
        this.f33179c = cg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33179c.Q().a(this.f33177a, this.f33178b);
    }
}
