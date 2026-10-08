package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class k01 implements r30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u30 f32695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u30 f32696b;

    private k01(u30 u30Var, u30 u30Var2) {
        this.f32695a = u30Var;
        this.f32696b = u30Var2;
    }

    public static k01 a(u30 u30Var, u30 u30Var2) {
        return new k01(u30Var, u30Var2);
    }

    @Override // com.google.android.libraries.places.internal.hr0
    public final /* bridge */ /* synthetic */ Object zzb() {
        u30 u30Var = this.f32696b;
        return new j01((ux0) this.f32695a.zzb(), (e01) u30Var.zzb());
    }
}
