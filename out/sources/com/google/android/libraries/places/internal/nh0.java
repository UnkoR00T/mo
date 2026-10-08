package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class nh0 extends pc0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final g50 f33060l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final f80 f33061m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final f40 f33062n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final long f33063o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final /* synthetic */ oh0 f33064p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    nh0(oh0 oh0Var, g50 g50Var, f80 f80Var, f40 f40Var) {
        super(oh0Var.f33184d.k0(f40Var), oh0Var.f33184d.r0(), f40Var.b());
        Objects.requireNonNull(oh0Var);
        this.f33064p = oh0Var;
        this.f33060l = g50Var;
        this.f33061m = f80Var;
        this.f33062n = f40Var;
        this.f33063o = System.nanoTime();
    }

    @Override // com.google.android.libraries.places.internal.pc0
    protected final void g() {
        mh0 mh0Var = new mh0(this);
        u90 u90Var = this.f33064p.f33184d.f33925n;
        u90Var.c(mh0Var);
        u90Var.a();
    }

    final void r() {
        g50 g50VarB = this.f33060l.b();
        try {
            l40 l40VarK = this.f33064p.k(this.f33061m, this.f33062n.h(s40.f33649a, Long.valueOf(System.nanoTime() - this.f33063o)));
            this.f33060l.c(g50VarB);
            Runnable runnableF = f(l40VarK);
            if (runnableF != null) {
                oh0 oh0Var = this.f33064p;
                oh0Var.f33184d.k0(this.f33062n).execute(new lh0(this, runnableF));
            } else {
                oh0 oh0Var2 = this.f33064p;
                mh0 mh0Var = new mh0(this);
                u90 u90Var = oh0Var2.f33184d.f33925n;
                u90Var.c(mh0Var);
                u90Var.a();
            }
        } catch (Throwable th4) {
            this.f33060l.c(g50VarB);
            throw th4;
        }
    }
}
