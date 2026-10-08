package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class xq0 extends tq0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ yq0 f34307b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    xq0(yq0 yq0Var) {
        super(yq0Var);
        Objects.requireNonNull(yq0Var);
        this.f34307b = yq0Var;
    }

    @Override // com.google.android.libraries.places.internal.tq0, com.google.android.libraries.places.internal.sq0, com.google.android.libraries.places.internal.z60
    public final void b(b50 b50Var, g70 g70Var) {
        super.b(b50Var, g70Var);
        yq0 yq0Var = this.f34307b;
        if (yq0Var.f34426f.f34197h || b50Var != b50.IDLE) {
            return;
        }
        yq0Var.d().d();
    }
}
