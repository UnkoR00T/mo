package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zm0 extends dn0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ en0 f34520b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zm0(en0 en0Var) {
        super(en0Var, null);
        Objects.requireNonNull(en0Var);
        this.f34520b = en0Var;
        int i15 = fr0.f32341a;
    }

    @Override // com.google.android.libraries.places.internal.dn0
    public final void a() {
        nr0 nr0Var = new nr0();
        int i15 = fr0.f32341a;
        en0 en0Var = this.f34520b;
        synchronized (en0Var.m()) {
            nr0Var.q1(en0Var.d(), en0Var.d().K());
            en0Var.u(false);
        }
        en0 en0Var2 = this.f34520b;
        en0Var2.y().q1(nr0Var, nr0Var.K());
        en0Var2.y().flush();
    }
}
