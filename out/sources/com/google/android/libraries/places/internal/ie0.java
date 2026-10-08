package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ie0 extends k70 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b50 f32566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g70 f32567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l90 f32568d;

    public ie0(b50 b50Var, g70 g70Var, l90 l90Var) {
        Objects.requireNonNull(b50Var, "state");
        this.f32566b = b50Var;
        Objects.requireNonNull(g70Var, "picker");
        this.f32567c = g70Var;
        Objects.requireNonNull(l90Var, "acceptAddressesStatus");
        this.f32568d = l90Var;
    }

    @Override // com.google.android.libraries.places.internal.x60
    public final i70 a(z60 z60Var) {
        return new he0(this, z60Var);
    }

    @Override // com.google.android.libraries.places.internal.k70
    public final boolean b() {
        return true;
    }

    @Override // com.google.android.libraries.places.internal.k70
    public final int c() {
        return 5;
    }

    @Override // com.google.android.libraries.places.internal.k70
    public final String d() {
        return "fixed_picker_lb_internal";
    }

    final /* synthetic */ b50 f() {
        return this.f32566b;
    }

    final /* synthetic */ g70 g() {
        return this.f32567c;
    }

    final /* synthetic */ l90 h() {
        return this.f32568d;
    }
}
