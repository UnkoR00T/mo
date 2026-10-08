package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class gm0 implements si0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final em0 f32399a;

    private gm0(em0 em0Var) {
        this.f32399a = em0Var;
    }

    public static gm0 a(em0 em0Var) {
        return new gm0(em0Var);
    }

    @Override // com.google.android.libraries.places.internal.si0
    public final Object c(Object obj) {
        fm0.b(this.f32399a, obj);
        return null;
    }

    @Override // com.google.android.libraries.places.internal.si0
    public final Object zza() {
        return fm0.a(this.f32399a);
    }
}
