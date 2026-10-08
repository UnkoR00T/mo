package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ab0 extends yb0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ a80 f31580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ eb0 f31581c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab0(eb0 eb0Var, er0 er0Var, a80 a80Var) {
        super(eb0Var.f32188c.l());
        this.f31580b = a80Var;
        Objects.requireNonNull(eb0Var);
        this.f31581c = eb0Var;
    }

    @Override // com.google.android.libraries.places.internal.yb0
    public final void a() {
        int i15 = fr0.f32341a;
        eb0 eb0Var = this.f31581c;
        if (eb0Var.g() == null) {
            try {
                eb0Var.f().a(this.f31580b);
            } catch (Throwable th4) {
                this.f31581c.e(l90.f32808f.d(th4).e("Failed to read headers"));
            }
        }
    }
}
