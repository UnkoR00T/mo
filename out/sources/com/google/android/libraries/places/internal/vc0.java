package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class vc0 extends pd0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final c70 f34056k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final g50 f34057l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final s40[] f34058m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile l90 f34059n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ xc0 f34060o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* synthetic */ vc0(xc0 xc0Var, c70 c70Var, s40[] s40VarArr, byte[] bArr) {
        super("connecting_and_lb");
        Objects.requireNonNull(xc0Var);
        this.f34060o = xc0Var;
        this.f34057l = g50.a();
        this.f34056k = c70Var;
        this.f34058m = s40VarArr;
    }

    @Override // com.google.android.libraries.places.internal.pd0
    protected final void c(l90 l90Var) {
        int i15 = 0;
        while (true) {
            s40[] s40VarArr = this.f34058m;
            if (i15 >= s40VarArr.length) {
                return;
            }
            s40 s40Var = s40VarArr[i15];
            i15++;
        }
    }

    @Override // com.google.android.libraries.places.internal.pd0, com.google.android.libraries.places.internal.gb0
    public final void r(ff0 ff0Var) {
        if (this.f34056k.a().k()) {
            ff0Var.a("wait_for_ready");
            l90 l90Var = this.f34059n;
            if (l90Var != null && !l90Var.j()) {
                ff0Var.b("Last Pick Failure", l90Var);
            }
        }
        super.r(ff0Var);
    }

    @Override // com.google.android.libraries.places.internal.pd0, com.google.android.libraries.places.internal.gb0
    public final void t(l90 l90Var) {
        super.t(l90Var);
        xc0 xc0Var = this.f34060o;
        synchronized (xc0Var.i()) {
            try {
                if (xc0Var.l() != null) {
                    boolean zRemove = xc0Var.o().remove(this);
                    if (!xc0Var.b() && zRemove) {
                        xc0Var.j().c(xc0Var.k());
                        if (xc0Var.p().f34149b != null) {
                            xc0Var.j().c(xc0Var.l());
                            xc0Var.m(null);
                        }
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f34060o.j().a();
    }

    final /* synthetic */ Runnable w(jb0 jb0Var, String str) {
        g50 g50VarB = this.f34057l.b();
        try {
            c70 c70Var = this.f34056k;
            gb0 gb0VarG = jb0Var.g(c70Var.c(), c70Var.b(), c70Var.a(), this.f34058m);
            return k(gb0VarG);
        } finally {
            this.f34057l.c(g50VarB);
        }
    }

    final /* synthetic */ c70 x() {
        return this.f34056k;
    }

    final /* synthetic */ s40[] y() {
        return this.f34058m;
    }

    final /* synthetic */ void z(l90 l90Var) {
        this.f34059n = l90Var;
    }
}
