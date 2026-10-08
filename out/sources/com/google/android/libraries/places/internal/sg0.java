package com.google.android.libraries.places.internal;

import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class sg0 extends ll0 {
    final /* synthetic */ f80 F;
    final /* synthetic */ f40 G;
    final /* synthetic */ g50 H;
    final /* synthetic */ tg0 I;

    /* JADX WARN: Illegal instructions before constructor call */
    sg0(tg0 tg0Var, f80 f80Var, a80 a80Var, f40 f40Var, ml0 ml0Var, af0 af0Var, g50 g50Var) {
        this.F = f80Var;
        this.G = f40Var;
        this.H = g50Var;
        Objects.requireNonNull(tg0Var);
        this.I = tg0Var;
        uh0 uh0Var = tg0Var.f33789b;
        super(f80Var, a80Var, uh0Var.N(), uh0Var.O(), uh0Var.P(), uh0Var.k0(f40Var), tg0Var.f33789b.q0().zzb(), ml0Var, af0Var, tg0Var.f33788a);
    }

    @Override // com.google.android.libraries.places.internal.ll0
    final l90 b0() {
        th0 th0VarV = this.I.f33789b.v();
        synchronized (th0VarV.f33791a) {
            try {
                l90 l90Var = th0VarV.f33793c;
                if (l90Var != null) {
                    return l90Var;
                }
                th0VarV.f33792b.add(this);
                return null;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.ll0
    final void c0() {
        l90 l90Var;
        th0 th0VarV = this.I.f33789b.v();
        synchronized (th0VarV.f33791a) {
            try {
                th0VarV.f33792b.remove(this);
                if (th0VarV.f33792b.isEmpty()) {
                    l90Var = th0VarV.f33793c;
                    th0VarV.f33792b = new HashSet();
                } else {
                    l90Var = null;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (l90Var != null) {
            th0VarV.f33794d.u().d(l90Var);
        }
    }

    @Override // com.google.android.libraries.places.internal.ll0
    final gb0 d0(a80 a80Var, p40 p40Var, int i15, boolean z15, boolean z16) {
        f40 f40VarF = this.G.f(p40Var);
        s40[] s40VarArrF = ze0.f(f40VarF, a80Var, i15, z15, z16);
        g50 g50VarB = this.H.b();
        try {
            return this.I.f33789b.u().g(this.F, a80Var, f40VarF, s40VarArrF);
        } finally {
            this.H.c(g50VarB);
        }
    }
}
