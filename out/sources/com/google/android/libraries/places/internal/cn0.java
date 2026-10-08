package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class cn0 extends hn0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ en0 f31916b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn0(en0 en0Var, lp0 lp0Var) {
        super(lp0Var);
        Objects.requireNonNull(en0Var);
        this.f31916b = en0Var;
    }

    @Override // com.google.android.libraries.places.internal.hn0, com.google.android.libraries.places.internal.lp0
    public final void A1(boolean z15, int i15, int i16) {
        if (z15) {
            en0 en0Var = this.f31916b;
            en0Var.H(en0Var.E() + 1);
        }
        super.A1(z15, i15, i16);
    }

    @Override // com.google.android.libraries.places.internal.hn0, com.google.android.libraries.places.internal.lp0
    public final void J2(xp0 xp0Var) {
        en0 en0Var = this.f31916b;
        en0Var.H(en0Var.E() + 1);
        super.J2(xp0Var);
    }

    @Override // com.google.android.libraries.places.internal.hn0, com.google.android.libraries.places.internal.lp0
    public final void S(int i15, ip0 ip0Var) {
        en0 en0Var = this.f31916b;
        en0Var.H(en0Var.E() + 1);
        super.S(i15, ip0Var);
    }
}
