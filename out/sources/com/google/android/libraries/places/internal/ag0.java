package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ag0 implements gi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final vb0 f31618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f31619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ cg0 f31620c;

    ag0(cg0 cg0Var, vb0 vb0Var) {
        Objects.requireNonNull(cg0Var);
        this.f31620c = cg0Var;
        this.f31619b = false;
        this.f31618a = vb0Var;
    }

    static final /* synthetic */ String e(e90 e90Var) {
        int iOrdinal;
        if (e90Var == null || (iOrdinal = e90Var.ordinal()) == 0) {
            return "none";
        }
        if (iOrdinal == 1) {
            return "integrity_only";
        }
        if (iOrdinal == 2) {
            return "privacy_and_integrity";
        }
        throw new IllegalArgumentException("Unknown SecurityLevel: ".concat(e90Var.toString()));
    }

    static final /* synthetic */ String f(b40 b40Var, a40 a40Var) {
        String str = (String) b40Var.a(a40Var);
        return str == null ? "" : str;
    }

    @Override // com.google.android.libraries.places.internal.gi0
    public final void a(l90 l90Var, qd0 qd0Var) {
        Object[] objArr = {this.f31618a.a(), cg0.u(l90Var)};
        cg0 cg0Var = this.f31620c;
        cg0Var.F().b(2, "{0} SHUTDOWN with {1}", objArr);
        this.f31619b = true;
        yf0 yf0Var = new yf0(this, qd0Var, l90Var);
        u90 u90VarH = cg0Var.H();
        u90VarH.c(yf0Var);
        u90VarH.a();
    }

    @Override // com.google.android.libraries.places.internal.gi0
    public final void b(boolean z15) {
        this.f31620c.A(this.f31618a, z15);
    }

    @Override // com.google.android.libraries.places.internal.gi0
    public final b40 c(b40 b40Var) {
        Iterator it = this.f31620c.G().iterator();
        if (!it.hasNext()) {
            return b40Var;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.gi0
    public final void d() {
        zj.p.x(this.f31619b, "transportShutdown() must be called before transportTerminated().");
        vb0 vb0Var = this.f31618a;
        Object[] objArr = {vb0Var.a()};
        cg0 cg0Var = this.f31620c;
        cg0Var.F().b(2, "{0} Terminated", objArr);
        cg0Var.E().g(vb0Var);
        cg0Var.A(vb0Var, false);
        Iterator it = cg0Var.G().iterator();
        if (it.hasNext()) {
            vb0Var.f();
            throw null;
        }
        u90 u90VarH = cg0Var.H();
        u90VarH.c(new zf0(this));
        u90VarH.a();
    }

    @Override // com.google.android.libraries.places.internal.gi0
    public final void zzb() {
        cg0 cg0Var = this.f31620c;
        cg0Var.F().a(2, "READY");
        xf0 xf0Var = new xf0(this);
        u90 u90VarH = cg0Var.H();
        u90VarH.c(xf0Var);
        u90VarH.a();
    }
}
