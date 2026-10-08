package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class db0 extends yb0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ eb0 f32005b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    db0(eb0 eb0Var, er0 er0Var) {
        super(eb0Var.f32188c.l());
        Objects.requireNonNull(eb0Var);
        this.f32005b = eb0Var;
    }

    @Override // com.google.android.libraries.places.internal.yb0
    public final void a() {
        int i15 = fr0.f32341a;
        eb0 eb0Var = this.f32005b;
        if (eb0Var.g() == null) {
            try {
                eb0Var.f().d();
            } catch (Throwable th4) {
                this.f32005b.e(l90.f32808f.d(th4).e("Failed to call onReady."));
            }
        }
    }
}
