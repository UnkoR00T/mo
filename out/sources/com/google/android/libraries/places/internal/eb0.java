package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class eb0 implements ib0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j40 f32186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l90 f32187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ fb0 f32188c;

    public eb0(fb0 fb0Var, j40 j40Var) {
        Objects.requireNonNull(fb0Var);
        this.f32188c = fb0Var;
        this.f32186a = (j40) zj.p.r(j40Var, "observer");
    }

    @Override // com.google.android.libraries.places.internal.lm0
    public final void a(km0 km0Var) {
        int i15 = fr0.f32341a;
        this.f32188c.j().execute(new bb0(this, fr0.b(), km0Var));
    }

    @Override // com.google.android.libraries.places.internal.ib0
    public final void b(l90 l90Var, hb0 hb0Var, a80 a80Var) {
        int i15 = fr0.f32341a;
        fb0 fb0Var = this.f32188c;
        j50 j50VarG = fb0Var.g();
        if (l90Var.g() == i90.CANCELLED && j50VarG != null && j50VarG.e()) {
            l90Var = fb0Var.m().c();
            a80Var = new a80();
        }
        fb0Var.j().execute(new cb0(this, fr0.b(), l90Var, a80Var));
    }

    @Override // com.google.android.libraries.places.internal.lm0
    public final void c() {
        fb0 fb0Var = this.f32188c;
        d80 d80VarA = fb0Var.i().a();
        if (d80VarA == d80.UNARY || d80VarA == d80.SERVER_STREAMING) {
            return;
        }
        fb0Var.j().execute(new db0(this, fr0.b()));
    }

    @Override // com.google.android.libraries.places.internal.ib0
    public final void d(a80 a80Var) {
        int i15 = fr0.f32341a;
        this.f32188c.j().execute(new ab0(this, fr0.b(), a80Var));
    }

    final /* synthetic */ void e(l90 l90Var) {
        this.f32187b = l90Var;
        this.f32188c.o().t(l90Var);
    }

    final /* synthetic */ j40 f() {
        return this.f32186a;
    }

    final /* synthetic */ l90 g() {
        return this.f32187b;
    }
}
