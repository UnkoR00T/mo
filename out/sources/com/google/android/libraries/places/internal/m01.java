package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class m01 implements r30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u30 f32914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u30 f32915b;

    private m01(u30 u30Var, u30 u30Var2) {
        this.f32914a = u30Var;
        this.f32915b = u30Var2;
    }

    public static m01 a(u30 u30Var, u30 u30Var2) {
        return new m01(u30Var, u30Var2);
    }

    @Override // com.google.android.libraries.places.internal.hr0
    public final /* bridge */ /* synthetic */ Object zzb() {
        u30 u30Var = this.f32915b;
        return new l01((ux0) this.f32914a.zzb(), (e01) u30Var.zzb());
    }
}
