package com.google.android.gms.internal.oss_licenses;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class v0 extends p0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final p0 f30917f = new v0(new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Object[] f30918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f30919e;

    v0(Object[] objArr, int i15) {
        this.f30918d = objArr;
        this.f30919e = i15;
    }

    @Override // com.google.android.gms.internal.oss_licenses.m0
    final Object[] e() {
        return this.f30918d;
    }

    @Override // com.google.android.gms.internal.oss_licenses.m0
    final int f() {
        return 0;
    }

    @Override // com.google.android.gms.internal.oss_licenses.m0
    final int g() {
        return this.f30919e;
    }

    @Override // java.util.List
    public final Object get(int i15) {
        g0.c(i15, this.f30919e, "index");
        Object obj = this.f30918d[i15];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.oss_licenses.p0, com.google.android.gms.internal.oss_licenses.m0
    final int h(Object[] objArr, int i15) {
        Object[] objArr2 = this.f30918d;
        int i16 = this.f30919e;
        System.arraycopy(objArr2, 0, objArr, 0, i16);
        return i16;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30919e;
    }
}
