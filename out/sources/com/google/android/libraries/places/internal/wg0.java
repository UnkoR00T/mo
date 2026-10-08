package com.google.android.libraries.places.internal;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class wg0 extends t50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g60 f34155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g40 f34156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f34157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f80 f34158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g50 f34159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f40 f34160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private l40 f34161g;

    wg0(g60 g60Var, g40 g40Var, Executor executor, f80 f80Var, f40 f40Var) {
        this.f34155a = g60Var;
        this.f34156b = g40Var;
        this.f34158d = f80Var;
        executor = f40Var.j() != null ? f40Var.j() : executor;
        this.f34157c = executor;
        this.f34160f = f40Var.e(executor);
        this.f34159e = g50.a();
    }

    @Override // com.google.android.libraries.places.internal.t50, com.google.android.libraries.places.internal.l40
    public final void a(j40 j40Var, a80 a80Var) {
        f40 f40Var = this.f34160f;
        a70 a70Var = uh0.f33907j0;
        f80 f80Var = this.f34158d;
        f60 f60VarA = this.f34155a.a(new oj0(f80Var, a80Var, f40Var, a70Var));
        l90 l90VarA = f60VarA.a();
        if (!l90VarA.j()) {
            this.f34157c.execute(new ug0(this, j40Var, ze0.i(l90VarA)));
            this.f34161g = uh0.f33908k0;
        } else {
            di0 di0VarE = ((fi0) f60VarA.b()).e(f80Var);
            if (di0VarE != null) {
                this.f34160f = this.f34160f.h(di0.f32039g, di0VarE);
            }
            l40 l40VarB = this.f34156b.b(f80Var, this.f34160f);
            this.f34161g = l40VarB;
            l40VarB.a(j40Var, a80Var);
        }
    }

    @Override // com.google.android.libraries.places.internal.z80, com.google.android.libraries.places.internal.l40
    public final void e(String str, Throwable th4) {
        l40 l40Var = this.f34161g;
        if (l40Var != null) {
            l40Var.e(str, th4);
        }
    }

    @Override // com.google.android.libraries.places.internal.t50, com.google.android.libraries.places.internal.z80
    protected final l40 f() {
        return this.f34161g;
    }

    final /* synthetic */ g50 g() {
        return this.f34159e;
    }
}
