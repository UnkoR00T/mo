package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class yq0 extends uq0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ br0 f34426f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    yq0(br0 br0Var, Object obj, x60 x60Var) {
        super(br0Var, obj, x60Var);
        Objects.requireNonNull(br0Var);
        this.f34426f = br0Var;
    }

    @Override // com.google.android.libraries.places.internal.uq0
    protected final tq0 a() {
        return new xq0(this);
    }
}
