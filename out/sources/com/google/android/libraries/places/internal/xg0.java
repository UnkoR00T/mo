package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class xg0 implements gi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ uh0 f34289a;

    /* synthetic */ xg0(uh0 uh0Var, byte[] bArr) {
        Objects.requireNonNull(uh0Var);
        this.f34289a = uh0Var;
    }

    @Override // com.google.android.libraries.places.internal.gi0
    public final void a(l90 l90Var, qd0 qd0Var) {
        zj.p.x(this.f34289a.w().get(), "Channel must have been shut down");
    }

    @Override // com.google.android.libraries.places.internal.gi0
    public final void b(boolean z15) {
        uh0 uh0Var = this.f34289a;
        uh0Var.X.a(uh0Var.u(), z15);
        if (z15) {
            uh0Var.Z();
        }
    }

    @Override // com.google.android.libraries.places.internal.gi0
    public final b40 c(b40 b40Var) {
        return b40Var;
    }

    @Override // com.google.android.libraries.places.internal.gi0
    public final void d() {
        uh0 uh0Var = this.f34289a;
        zj.p.x(uh0Var.w().get(), "Channel must have been shut down");
        uh0Var.A(true);
        uh0Var.e0(false);
        uh0Var.d0();
        uh0Var.l0();
    }

    @Override // com.google.android.libraries.places.internal.gi0
    public final void zzb() {
    }
}
