package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ca0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l90 f31854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ hb0 f31855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ a80 f31856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ da0 f31857d;

    ca0(da0 da0Var, l90 l90Var, hb0 hb0Var, a80 a80Var) {
        this.f31854a = l90Var;
        this.f31855b = hb0Var;
        this.f31856c = a80Var;
        Objects.requireNonNull(da0Var);
        this.f31857d = da0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31857d.C(this.f31854a, this.f31855b, this.f31856c);
    }
}
