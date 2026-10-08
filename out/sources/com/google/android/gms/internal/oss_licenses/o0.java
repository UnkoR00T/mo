package com.google.android.gms.internal.oss_licenses;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class o0 extends p0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient int f30853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient int f30854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ p0 f30855f;

    o0(p0 p0Var, int i15, int i16) {
        Objects.requireNonNull(p0Var);
        this.f30855f = p0Var;
        this.f30853d = i15;
        this.f30854e = i16;
    }

    @Override // com.google.android.gms.internal.oss_licenses.m0
    final Object[] e() {
        return this.f30855f.e();
    }

    @Override // com.google.android.gms.internal.oss_licenses.m0
    final int f() {
        return this.f30855f.f() + this.f30853d;
    }

    @Override // com.google.android.gms.internal.oss_licenses.m0
    final int g() {
        return this.f30855f.f() + this.f30853d + this.f30854e;
    }

    @Override // java.util.List
    public final Object get(int i15) {
        g0.c(i15, this.f30854e, "index");
        return this.f30855f.get(i15 + this.f30853d);
    }

    @Override // com.google.android.gms.internal.oss_licenses.p0
    /* JADX INFO: renamed from: i */
    public final p0 subList(int i15, int i16) {
        g0.e(i15, i16, this.f30854e);
        int i17 = this.f30853d;
        return this.f30855f.subList(i15 + i17, i16 + i17);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30854e;
    }

    @Override // com.google.android.gms.internal.oss_licenses.p0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i15, int i16) {
        return subList(i15, i16);
    }
}
