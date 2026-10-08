package com.google.android.gms.internal.oss_licenses;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class y0 extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient s0 f30944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient p0 f30945d;

    y0(s0 s0Var, p0 p0Var) {
        this.f30944c = s0Var;
        this.f30945d = p0Var;
    }

    @Override // com.google.android.gms.internal.oss_licenses.m0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f30944c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.oss_licenses.m0
    final int h(Object[] objArr, int i15) {
        return this.f30945d.h(objArr, 0);
    }

    @Override // com.google.android.gms.internal.oss_licenses.t0
    /* JADX INFO: renamed from: i */
    public final e1 iterator() {
        return this.f30945d.listIterator(0);
    }

    @Override // com.google.android.gms.internal.oss_licenses.t0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f30945d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f30944c.size();
    }
}
