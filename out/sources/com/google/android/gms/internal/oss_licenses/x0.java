package com.google.android.gms.internal.oss_licenses;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class x0 extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient s0 f30930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object[] f30931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f30932e;

    x0(s0 s0Var, Object[] objArr, int i15, int i16) {
        this.f30930c = s0Var;
        this.f30931d = objArr;
        this.f30932e = i16;
    }

    final /* synthetic */ int A() {
        return this.f30932e;
    }

    @Override // com.google.android.gms.internal.oss_licenses.m0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f30930c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.oss_licenses.m0
    final int h(Object[] objArr, int i15) {
        return t().h(objArr, 0);
    }

    @Override // com.google.android.gms.internal.oss_licenses.t0
    /* JADX INFO: renamed from: i */
    public final e1 iterator() {
        return t().listIterator(0);
    }

    @Override // com.google.android.gms.internal.oss_licenses.t0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return t().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f30932e;
    }

    @Override // com.google.android.gms.internal.oss_licenses.t0
    final p0 u() {
        return new w0(this);
    }

    final /* synthetic */ Object[] w() {
        return this.f30931d;
    }
}
