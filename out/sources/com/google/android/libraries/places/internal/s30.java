package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class s30 implements r30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f33648a;

    private s30(Object obj) {
        this.f33648a = obj;
    }

    public static r30 a(Object obj) {
        if (obj != null) {
            return new s30(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // com.google.android.libraries.places.internal.hr0
    public final Object zzb() {
        return this.f33648a;
    }
}
