package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class nd0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l90 f33052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ hb0 f33053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ a80 f33054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ od0 f33055d;

    nd0(od0 od0Var, l90 l90Var, hb0 hb0Var, a80 a80Var) {
        this.f33052a = l90Var;
        this.f33053b = hb0Var;
        this.f33054c = a80Var;
        Objects.requireNonNull(od0Var);
        this.f33055d = od0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33055d.f().b(this.f33052a, this.f33053b, this.f33054c);
    }
}
