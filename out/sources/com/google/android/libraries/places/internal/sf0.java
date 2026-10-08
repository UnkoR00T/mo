package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class sf0 extends le0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vb0 f33679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wa0 f33680b;

    /* synthetic */ sf0(vb0 vb0Var, wa0 wa0Var, byte[] bArr) {
        this.f33679a = vb0Var;
        this.f33680b = wa0Var;
    }

    @Override // com.google.android.libraries.places.internal.le0
    protected final vb0 b() {
        return this.f33679a;
    }

    @Override // com.google.android.libraries.places.internal.le0, com.google.android.libraries.places.internal.jb0
    public final gb0 g(f80 f80Var, a80 a80Var, f40 f40Var, s40[] s40VarArr) {
        return new rf0(this, this.f33679a.g(f80Var, a80Var, f40Var, s40VarArr));
    }

    final /* synthetic */ wa0 h() {
        return this.f33680b;
    }
}
