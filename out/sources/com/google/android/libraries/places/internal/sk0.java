package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class sk0 extends s40 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jl0 f33691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f33692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ll0 f33693d;

    sk0(ll0 ll0Var, jl0 jl0Var) {
        Objects.requireNonNull(ll0Var);
        this.f33693d = ll0Var;
        this.f33691b = jl0Var;
    }

    @Override // com.google.android.libraries.places.internal.q90
    public final void a(long j15) {
        ll0 ll0Var = this.f33693d;
        if (ll0Var.E().f31670f != null) {
            return;
        }
        synchronized (ll0Var.y()) {
            try {
                if (ll0Var.E().f31670f == null) {
                    jl0 jl0Var = this.f33691b;
                    if (!jl0Var.f32665b) {
                        long j16 = this.f33692c + j15;
                        this.f33692c = j16;
                        if (j16 <= ll0Var.L()) {
                            return;
                        }
                        if (j16 > ll0Var.A()) {
                            jl0Var.f32666c = true;
                        } else {
                            long jA = ll0Var.z().a(j16 - ll0Var.L());
                            ll0Var.M(this.f33692c);
                            if (jA > ll0Var.B()) {
                                jl0Var.f32666c = true;
                            }
                        }
                        Runnable runnableG0 = jl0Var.f32666c ? ll0Var.g0(jl0Var) : null;
                        if (runnableG0 != null) {
                            runnableG0.run();
                        }
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
