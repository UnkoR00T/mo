package com.google.android.libraries.places.internal;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class vk0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ jl0 f34069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ wk0 f34070b;

    vk0(wk0 wk0Var, jl0 jl0Var) {
        this.f34069a = jl0Var;
        Objects.requireNonNull(wk0Var);
        this.f34070b = wk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uk0 uk0Var;
        boolean z15;
        wk0 wk0Var = this.f34070b;
        ll0 ll0Var = wk0Var.f34174b;
        synchronized (ll0Var.y()) {
            try {
                uk0Var = null;
                if (wk0Var.f34173a.f33946c) {
                    z15 = true;
                } else {
                    ll0Var.F(ll0Var.E().c(this.f34069a));
                    if (ll0Var.l0(ll0Var.E()) && (ll0Var.C() == null || ll0Var.C().a())) {
                        uk0Var = new uk0(ll0Var.y());
                        ll0Var.P(uk0Var);
                    } else {
                        ll0Var.F(ll0Var.E().b());
                        ll0Var.P(null);
                    }
                    z15 = false;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (z15) {
            jl0 jl0Var = this.f34069a;
            jl0Var.f32664a.u(new il0(this.f34070b.f34174b, jl0Var));
            jl0Var.f32664a.t(l90.f32808f.e("Unneeded hedging"));
            return;
        }
        if (uk0Var != null) {
            ll0 ll0Var2 = this.f34070b.f34174b;
            uk0Var.a(ll0Var2.l().schedule(new wk0(ll0Var2, uk0Var), ll0Var2.w().f31616b, TimeUnit.NANOSECONDS));
        }
        this.f34070b.f34174b.j0(this.f34069a);
    }
}
