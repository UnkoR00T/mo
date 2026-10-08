package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class mg0 implements va0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ nm0 f32944a;

    mg0(uh0 uh0Var, nm0 nm0Var) {
        this.f32944a = nm0Var;
        Objects.requireNonNull(uh0Var);
    }

    @Override // com.google.android.libraries.places.internal.va0
    public final wa0 zza() {
        return new wa0(this.f32944a);
    }
}
