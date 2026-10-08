package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class qf0 extends ke0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ib0 f33409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ rf0 f33410b;

    qf0(rf0 rf0Var, ib0 ib0Var) {
        this.f33409a = ib0Var;
        Objects.requireNonNull(rf0Var);
        this.f33410b = rf0Var;
    }

    @Override // com.google.android.libraries.places.internal.ke0, com.google.android.libraries.places.internal.ib0
    public final void b(l90 l90Var, hb0 hb0Var, a80 a80Var) {
        this.f33410b.f33509b.h().b(l90Var.j());
        this.f33409a.b(l90Var, hb0Var, a80Var);
    }

    @Override // com.google.android.libraries.places.internal.ke0
    protected final ib0 e() {
        return this.f33409a;
    }
}
