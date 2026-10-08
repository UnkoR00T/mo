package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class fe0 implements jb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final l90 f32293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hb0 f32294b;

    fe0(l90 l90Var, hb0 hb0Var) {
        zj.p.e(!l90Var.j(), "error must not be OK");
        this.f32293a = l90Var;
        this.f32294b = hb0Var;
    }

    @Override // com.google.android.libraries.places.internal.s60
    public final n60 a() {
        throw new UnsupportedOperationException("Not a real transport");
    }

    @Override // com.google.android.libraries.places.internal.jb0
    public final gb0 g(f80 f80Var, a80 a80Var, f40 f40Var, s40[] s40VarArr) {
        return new ee0(this.f32293a, this.f32294b, s40VarArr);
    }
}
