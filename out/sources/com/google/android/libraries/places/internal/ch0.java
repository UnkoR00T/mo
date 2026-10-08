package com.google.android.libraries.places.internal;

import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
final class ch0 extends z60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    i70 f31899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ uh0 f31900b;

    /* synthetic */ ch0(uh0 uh0Var, byte[] bArr) {
        Objects.requireNonNull(uh0Var);
        this.f31900b = uh0Var;
    }

    @Override // com.google.android.libraries.places.internal.z60
    public final /* bridge */ /* synthetic */ f70 a(w60 w60Var) {
        uh0 uh0Var = this.f31900b;
        uh0Var.f33925n.d();
        zj.p.x(!uh0Var.z(), "Channel is being terminated");
        return new sh0(uh0Var, w60Var);
    }

    @Override // com.google.android.libraries.places.internal.z60
    public final void b(b50 b50Var, g70 g70Var) {
        uh0 uh0Var = this.f31900b;
        uh0Var.f33925n.d();
        zj.p.r(b50Var, "newState");
        zj.p.r(g70Var, "newPicker");
        if (this != uh0Var.o() || uh0Var.p()) {
            return;
        }
        uh0Var.j0(g70Var);
        if (b50Var != b50.SHUTDOWN) {
            uh0Var.F().b(2, "Entering {0} state with picker: {1}", b50Var, g70Var);
            uh0Var.k().a(b50Var);
        }
    }

    @Override // com.google.android.libraries.places.internal.z60
    public final void c() {
        u90 u90Var = this.f31900b.f33925n;
        u90Var.d();
        u90Var.c(new bh0(this));
        u90Var.a();
    }

    @Override // com.google.android.libraries.places.internal.z60
    public final u90 d() {
        return this.f31900b.f33925n;
    }

    @Override // com.google.android.libraries.places.internal.z60
    public final ScheduledExecutorService e() {
        return this.f31900b.r0();
    }
}
