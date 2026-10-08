package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class cb0 extends yb0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ l90 f31858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ a80 f31859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ eb0 f31860d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cb0(eb0 eb0Var, er0 er0Var, l90 l90Var, a80 a80Var) {
        super(eb0Var.f32188c.l());
        this.f31858b = l90Var;
        this.f31859c = a80Var;
        Objects.requireNonNull(eb0Var);
        this.f31860d = eb0Var;
    }

    @Override // com.google.android.libraries.places.internal.yb0
    public final void a() {
        int i15 = fr0.f32341a;
        eb0 eb0Var = this.f31860d;
        eb0Var.f32188c.m().b();
        l90 l90VarG = this.f31858b;
        a80 a80Var = this.f31859c;
        if (eb0Var.g() != null) {
            l90VarG = eb0Var.g();
            a80Var = new a80();
        }
        try {
            fb0.q(eb0Var.f(), l90VarG, a80Var);
        } finally {
            this.f31860d.f32188c.k().b(l90VarG.j());
        }
    }
}
