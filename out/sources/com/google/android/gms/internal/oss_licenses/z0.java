package com.google.android.gms.internal.oss_licenses;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class z0 extends p0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object[] f30949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f30950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f30951f;

    z0(Object[] objArr, int i15, int i16) {
        this.f30949d = objArr;
        this.f30950e = i15;
        this.f30951f = i16;
    }

    @Override // java.util.List
    public final Object get(int i15) {
        g0.c(i15, this.f30951f, "index");
        Object obj = this.f30949d[i15 + i15 + this.f30950e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30951f;
    }
}
