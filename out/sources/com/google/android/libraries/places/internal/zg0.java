package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zg0 extends ef0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ uh0 f34513b;

    /* synthetic */ zg0(uh0 uh0Var, byte[] bArr) {
        Objects.requireNonNull(uh0Var);
        this.f34513b = uh0Var;
    }

    @Override // com.google.android.libraries.places.internal.ef0
    protected final void d() {
        this.f34513b.Z();
    }

    @Override // com.google.android.libraries.places.internal.ef0
    protected final void e() {
        uh0 uh0Var = this.f34513b;
        if (uh0Var.w().get()) {
            return;
        }
        uh0Var.h0();
    }
}
