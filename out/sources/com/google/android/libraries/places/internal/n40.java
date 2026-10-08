package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class n40 extends g40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g40 f33030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m40 f33031b;

    /* synthetic */ n40(g40 g40Var, m40 m40Var, byte[] bArr) {
        this.f33030a = g40Var;
        this.f33031b = (m40) zj.p.r(m40Var, "interceptor");
    }

    @Override // com.google.android.libraries.places.internal.g40
    public final l40 b(f80 f80Var, f40 f40Var) {
        return this.f33031b.a(f80Var, f40Var, this.f33030a);
    }

    @Override // com.google.android.libraries.places.internal.g40
    public final String h() {
        return this.f33030a.h();
    }
}
