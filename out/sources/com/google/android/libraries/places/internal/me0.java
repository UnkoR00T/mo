package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
class me0 extends r70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r70 f32940a;

    me0(r70 r70Var) {
        this.f32940a = r70Var;
    }

    @Override // com.google.android.libraries.places.internal.g40
    public final l40 b(f80 f80Var, f40 f40Var) {
        return this.f32940a.b(f80Var, f40Var);
    }

    @Override // com.google.android.libraries.places.internal.g40
    public final String h() {
        return this.f32940a.h();
    }

    @Override // com.google.android.libraries.places.internal.r70
    public r70 i() {
        r70 r70Var = this.f32940a;
        ((uh0) r70Var).b0();
        return r70Var;
    }

    public final String toString() {
        return zj.j.c(this).d("delegate", this.f32940a).toString();
    }
}
