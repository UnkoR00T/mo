package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class pq0 extends s50 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ qq0 f33351b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    pq0(qq0 qq0Var, l40 l40Var) {
        super(l40Var);
        Objects.requireNonNull(qq0Var);
        this.f33351b = qq0Var;
    }

    @Override // com.google.android.libraries.places.internal.t50, com.google.android.libraries.places.internal.l40
    public final void a(j40 j40Var, a80 a80Var) {
        a80Var.f(this.f33351b.b());
        f().a(j40Var, a80Var);
    }
}
