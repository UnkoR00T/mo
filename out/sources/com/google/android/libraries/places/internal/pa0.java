package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class pa0 extends i70 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final z60 f33290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private i70 f33291g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private k70 f33292h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ qa0 f33293i;

    pa0(qa0 qa0Var, z60 z60Var) {
        Objects.requireNonNull(qa0Var);
        this.f33293i = qa0Var;
        this.f33290f = z60Var;
        k70 k70VarF = qa0Var.f();
        this.f33292h = k70VarF;
        this.f33291g = k70VarF.a(z60Var);
    }

    @Override // com.google.android.libraries.places.internal.i70
    public final l90 a(e70 e70Var) {
        yl0 yl0Var = (yl0) e70Var.e();
        if (yl0Var == null) {
            yl0Var = new yl0(this.f33293i.f(), null);
        }
        if (this.f33292h == null || !yl0Var.f34411a.d().equals(this.f33292h.d())) {
            z60 z60Var = this.f33290f;
            z60Var.b(b50.CONNECTING, new y60(b70.d()));
            this.f33291g.c();
            k70 k70Var = yl0Var.f34411a;
            this.f33292h = k70Var;
            i70 i70Var = this.f33291g;
            this.f33291g = k70Var.a(z60Var);
            ((ch0) z60Var).f31900b.F().b(2, "Load balancer changed from {0} to {1}", i70Var.getClass().getSimpleName(), this.f33291g.getClass().getSimpleName());
        }
        Object obj = yl0Var.f34412b;
        if (obj != null) {
            ((ch0) this.f33290f).f31900b.F().b(1, "Load-balancing config: {0}", obj);
        }
        i70 i70Var2 = this.f33291g;
        d70 d70VarA = e70.a();
        d70VarA.a(e70Var.c());
        d70VarA.b(e70Var.d());
        d70VarA.c(obj);
        return i70Var2.a(d70VarA.d());
    }

    @Override // com.google.android.libraries.places.internal.i70
    public final void b(l90 l90Var) {
        this.f33291g.b(l90Var);
    }

    @Override // com.google.android.libraries.places.internal.i70
    public final void c() {
        this.f33291g.c();
        this.f33291g = null;
    }

    @Override // com.google.android.libraries.places.internal.i70
    public final void d() {
        this.f33291g.d();
    }
}
