package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class he0 extends i70 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final z60 f32465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ ie0 f32466g;

    public he0(ie0 ie0Var, z60 z60Var) {
        Objects.requireNonNull(ie0Var);
        this.f32466g = ie0Var;
        Objects.requireNonNull(z60Var, "helper");
        this.f32465f = z60Var;
    }

    @Override // com.google.android.libraries.places.internal.i70
    public final l90 a(e70 e70Var) {
        ie0 ie0Var = this.f32466g;
        this.f32465f.b(ie0Var.f(), ie0Var.g());
        return ie0Var.h();
    }

    @Override // com.google.android.libraries.places.internal.i70
    public final void b(l90 l90Var) {
        ie0 ie0Var = this.f32466g;
        this.f32465f.b(ie0Var.f(), ie0Var.g());
    }

    @Override // com.google.android.libraries.places.internal.i70
    public final void c() {
    }
}
