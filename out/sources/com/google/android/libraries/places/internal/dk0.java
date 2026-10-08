package com.google.android.libraries.places.internal;

import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
final class dk0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Collection f32049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ jl0 f32050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f32051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Future f32052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f32053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ Future f32054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ ll0 f32055g;

    dk0(ll0 ll0Var, Collection collection, jl0 jl0Var, boolean z15, Future future, boolean z16, Future future2) {
        this.f32049a = collection;
        this.f32050b = jl0Var;
        this.f32051c = z15;
        this.f32052d = future;
        this.f32053e = z16;
        this.f32054f = future2;
        Objects.requireNonNull(ll0Var);
        this.f32055g = ll0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (jl0 jl0Var : this.f32049a) {
            if (jl0Var != this.f32050b) {
                jl0Var.f32664a.t(ll0.C);
            }
        }
        if (this.f32051c) {
            Future future = this.f32052d;
            if (future != null) {
                future.cancel(false);
            }
            if (!this.f32053e) {
                ll0 ll0Var = this.f32055g;
                if (ll0Var.J().decrementAndGet() == Integer.MIN_VALUE) {
                    u90 u90Var = (u90) ll0Var.k();
                    u90Var.c(new ck0(this));
                    u90Var.a();
                }
            }
        }
        Future future2 = this.f32054f;
        if (future2 != null) {
            future2.cancel(false);
        }
        this.f32055g.c0();
    }
}
