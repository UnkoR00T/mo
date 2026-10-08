package com.google.android.libraries.places.internal;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ea0 extends ia0 implements gb0, oi0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Logger f32175g = Logger.getLogger(ea0.class.getName());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f32176h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sm0 f32177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final oe0 f32178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f32179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a80 f32180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f32181f;

    protected ea0(xm0 xm0Var, im0 im0Var, sm0 sm0Var, a80 a80Var, f40 f40Var, boolean z15) {
        zj.p.r(a80Var, "headers");
        this.f32177b = (sm0) zj.p.r(sm0Var, "transportTracer");
        this.f32179d = !Boolean.TRUE.equals(f40Var.i(ze0.f34506n));
        this.f32178c = new pi0(this, xm0Var, im0Var);
        this.f32180e = a80Var;
    }

    @Override // com.google.android.libraries.places.internal.oi0
    public final void c(wm0 wm0Var, boolean z15, boolean z16, int i15) {
        boolean z17 = true;
        if (wm0Var == null && !z15) {
            z17 = false;
        }
        zj.p.e(z17, "null frame before EOS");
        l().b(wm0Var, z15, z16, i15);
    }

    @Override // com.google.android.libraries.places.internal.ia0
    protected final oe0 f() {
        return this.f32178c;
    }

    @Override // com.google.android.libraries.places.internal.ia0
    protected /* bridge */ /* synthetic */ ha0 g() {
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public final void h() {
        if (k().v()) {
            return;
        }
        k().B();
        f().c();
    }

    protected abstract da0 k();

    protected abstract ba0 l();

    @Override // com.google.android.libraries.places.internal.gb0
    public final void m(int i15) {
        k().k(i15);
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public final void n(n50 n50Var) {
        k().A(n50Var);
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public final void p(int i15) {
        this.f32178c.b(i15);
    }

    @Override // com.google.android.libraries.places.internal.jm0
    public final boolean q() {
        return g().r() && !this.f32181f;
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public final void r(ff0 ff0Var) {
        ff0Var.b("remote_addr", o().a(w50.f34113a));
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public final void s(j50 j50Var) {
        a80 a80Var = this.f32180e;
        w70 w70Var = ze0.f34495c;
        a80Var.d(w70Var);
        this.f32180e.c(w70Var, Long.valueOf(j50Var.g(TimeUnit.NANOSECONDS)));
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public final void t(l90 l90Var) {
        zj.p.e(!l90Var.j(), "Should not cancel with OK status");
        this.f32181f = true;
        l().a(l90Var);
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public final void u(ib0 ib0Var) {
        k().u(ib0Var);
        l().c(this.f32180e, null);
        this.f32180e = null;
    }

    public final boolean v() {
        return this.f32179d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final sm0 w() {
        return this.f32177b;
    }
}
