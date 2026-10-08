package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ug0 extends yb0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ j40 f33894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ l90 f33895c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ug0(wg0 wg0Var, j40 j40Var, l90 l90Var) {
        super(wg0Var.g());
        this.f33894b = j40Var;
        this.f33895c = l90Var;
        Objects.requireNonNull(wg0Var);
    }

    @Override // com.google.android.libraries.places.internal.yb0
    public final void a() {
        this.f33894b.c(this.f33895c, new a80());
    }
}
