package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class q30 implements u30 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f33376c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile u30 f33377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f33378b = f33376c;

    private q30(u30 u30Var) {
        this.f33377a = u30Var;
    }

    public static u30 a(u30 u30Var) {
        return u30Var instanceof q30 ? u30Var : new q30(u30Var);
    }

    private final synchronized Object b() {
        try {
            Object obj = this.f33378b;
            Object obj2 = f33376c;
            if (obj != obj2) {
                return obj;
            }
            Object objZzb = this.f33377a.zzb();
            Object obj3 = this.f33378b;
            if (obj3 != obj2 && obj3 != objZzb) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZzb + ". This is likely due to a circular dependency.");
            }
            this.f33378b = objZzb;
            this.f33377a = null;
            return objZzb;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    @Override // com.google.android.libraries.places.internal.hr0
    public final Object zzb() {
        Object obj = this.f33378b;
        return obj == f33376c ? b() : obj;
    }
}
