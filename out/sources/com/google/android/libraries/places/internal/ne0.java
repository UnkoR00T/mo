package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
class ne0 extends t80 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t80 f33057b;

    ne0(t80 t80Var) {
        zj.p.r(t80Var, "delegate can not be null");
        this.f33057b = t80Var;
    }

    @Override // com.google.android.libraries.places.internal.t80
    public final String a() {
        return this.f33057b.a();
    }

    @Override // com.google.android.libraries.places.internal.t80
    public void b(p80 p80Var) {
        this.f33057b.b(p80Var);
    }

    @Override // com.google.android.libraries.places.internal.t80
    public void c() {
        this.f33057b.c();
    }

    @Override // com.google.android.libraries.places.internal.t80
    public final void d() {
        this.f33057b.d();
    }

    public final String toString() {
        return zj.j.c(this).d("delegate", this.f33057b).toString();
    }
}
