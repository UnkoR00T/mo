package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class vz0 implements r30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u30 f34095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u30 f34096b;

    private vz0(u30 u30Var, u30 u30Var2) {
        this.f34095a = u30Var;
        this.f34096b = u30Var2;
    }

    public static vz0 a(u30 u30Var, u30 u30Var2) {
        return new vz0(u30Var, u30Var2);
    }

    @Override // com.google.android.libraries.places.internal.hr0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new uz0(((e41) this.f34095a).zzb(), (r70) this.f34096b.zzb());
    }
}
