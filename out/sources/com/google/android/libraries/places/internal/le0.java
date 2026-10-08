package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
abstract class le0 implements vb0 {
    le0() {
    }

    @Override // com.google.android.libraries.places.internal.s60
    public final n60 a() {
        return b().a();
    }

    protected abstract vb0 b();

    @Override // com.google.android.libraries.places.internal.hi0
    public void c(l90 l90Var) {
        b().c(l90Var);
    }

    @Override // com.google.android.libraries.places.internal.hi0
    public void d(l90 l90Var) {
        b().d(l90Var);
    }

    @Override // com.google.android.libraries.places.internal.hi0
    public final Runnable e(gi0 gi0Var) {
        b().e(gi0Var);
        return null;
    }

    @Override // com.google.android.libraries.places.internal.vb0
    public final b40 f() {
        return b().f();
    }

    @Override // com.google.android.libraries.places.internal.jb0
    public gb0 g(f80 f80Var, a80 a80Var, f40 f40Var, s40[] s40VarArr) {
        throw null;
    }

    public final String toString() {
        return zj.j.c(this).d("delegate", b()).toString();
    }
}
