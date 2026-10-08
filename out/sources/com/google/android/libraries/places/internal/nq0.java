package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class nq0 extends lq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kq0 f33092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f33093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f33094c;

    nq0(kq0 kq0Var) {
        super(null);
        this.f33094c = false;
        this.f33092a = kq0Var;
    }

    @Override // com.google.android.libraries.places.internal.j40
    public final void a(a80 a80Var) {
    }

    @Override // com.google.android.libraries.places.internal.j40
    public final void b(Object obj) {
        if (this.f33094c) {
            throw new p90(l90.f32814l.e("More than one value received for unary call"), null);
        }
        this.f33093b = obj;
        this.f33094c = true;
    }

    @Override // com.google.android.libraries.places.internal.j40
    public final void c(l90 l90Var, a80 a80Var) {
        if (!l90Var.j()) {
            this.f33092a.D(new p90(l90Var, a80Var));
            return;
        }
        if (!this.f33094c) {
            this.f33092a.D(new p90(l90.f32814l.e("No value received for unary call"), a80Var));
        }
        this.f33092a.C(this.f33093b);
    }

    @Override // com.google.android.libraries.places.internal.lq0
    final void e() {
        this.f33092a.G().c(2);
    }
}
