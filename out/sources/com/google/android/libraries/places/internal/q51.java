package com.google.android.libraries.places.internal;

import p7.CreationExtras;

/* JADX INFO: loaded from: classes4.dex */
public final class q51 implements androidx.lifecycle.w0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f51 f33388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v51 f33389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a71 f33390d;

    public q51(f51 f51Var, v51 v51Var, a71 a71Var) {
        this.f33388b = f51Var;
        this.f33389c = v51Var;
        this.f33390d = a71Var;
    }

    @Override // androidx.lifecycle.w0.c
    public final androidx.p016lifecycle.t0 a(Class cls, CreationExtras creationExtras) {
        return b(cls);
    }

    @Override // androidx.lifecycle.w0.c
    public final androidx.p016lifecycle.t0 b(Class cls) {
        zj.p.e(cls == r51.class, "This factory can only be used to instantiate its enclosing class.");
        return new r51(this.f33388b, this.f33389c, this.f33390d, null);
    }

    @Override // androidx.lifecycle.w0.c
    public final androidx.p016lifecycle.t0 c(mr.c cVar, CreationExtras creationExtras) {
        return b(dr.a.b(cVar));
    }
}
