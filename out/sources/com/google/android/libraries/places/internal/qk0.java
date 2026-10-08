package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class qk0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l90 f33417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ hb0 f33418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ a80 f33419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ll0 f33420d;

    qk0(ll0 ll0Var, l90 l90Var, hb0 hb0Var, a80 a80Var) {
        this.f33417a = l90Var;
        this.f33418b = hb0Var;
        this.f33419c = a80Var;
        Objects.requireNonNull(ll0Var);
        this.f33420d = ll0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ll0 ll0Var = this.f33420d;
        ll0Var.T(true);
        ll0Var.N().b(this.f33417a, this.f33418b, this.f33419c);
    }
}
