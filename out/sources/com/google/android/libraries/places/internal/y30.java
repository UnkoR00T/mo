package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class y30 implements u30 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f34336c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile u30 f34337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f34338b = f34336c;

    private y30(u30 u30Var) {
        this.f34337a = u30Var;
    }

    public static u30 a(u30 u30Var) {
        return new y30(u30Var);
    }

    @Override // com.google.android.libraries.places.internal.hr0
    public final Object zzb() {
        Object obj = this.f34338b;
        if (obj != f34336c) {
            return obj;
        }
        u30 u30Var = this.f34337a;
        if (u30Var == null) {
            return this.f34338b;
        }
        Object objZzb = u30Var.zzb();
        this.f34338b = objZzb;
        this.f34337a = null;
        return objZzb;
    }
}
