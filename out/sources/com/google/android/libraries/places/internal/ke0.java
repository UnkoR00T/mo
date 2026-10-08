package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
abstract class ke0 implements ib0 {
    ke0() {
    }

    @Override // com.google.android.libraries.places.internal.lm0
    public final void a(km0 km0Var) {
        e().a(km0Var);
    }

    @Override // com.google.android.libraries.places.internal.ib0
    public void b(l90 l90Var, hb0 hb0Var, a80 a80Var) {
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.lm0
    public final void c() {
        e().c();
    }

    @Override // com.google.android.libraries.places.internal.ib0
    public final void d(a80 a80Var) {
        e().d(a80Var);
    }

    protected abstract ib0 e();

    public final String toString() {
        return zj.j.c(this).d("delegate", e()).toString();
    }
}
