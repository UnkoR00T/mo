package com.google.android.gms.internal.oss_licenses;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class b1 extends t0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object[] f30745h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final b1 f30746j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f30747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f30748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient Object[] f30749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f30750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f30751g;

    static {
        Object[] objArr = new Object[0];
        f30745h = objArr;
        f30746j = new b1(objArr, 0, objArr, 0, 0);
    }

    b1(Object[] objArr, int i15, Object[] objArr2, int i16, int i17) {
        this.f30747c = objArr;
        this.f30748d = i15;
        this.f30749e = objArr2;
        this.f30750f = i16;
        this.f30751g = i17;
    }

    @Override // com.google.android.gms.internal.oss_licenses.m0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f30749e;
            if (objArr.length != 0) {
                int iA = l0.a(obj.hashCode());
                while (true) {
                    int i15 = iA & this.f30750f;
                    Object obj2 = objArr[i15];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iA = i15 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.oss_licenses.m0
    final Object[] e() {
        return this.f30747c;
    }

    @Override // com.google.android.gms.internal.oss_licenses.m0
    final int f() {
        return 0;
    }

    @Override // com.google.android.gms.internal.oss_licenses.m0
    final int g() {
        return this.f30751g;
    }

    @Override // com.google.android.gms.internal.oss_licenses.m0
    final int h(Object[] objArr, int i15) {
        Object[] objArr2 = this.f30747c;
        int i16 = this.f30751g;
        System.arraycopy(objArr2, 0, objArr, 0, i16);
        return i16;
    }

    @Override // com.google.android.gms.internal.oss_licenses.t0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f30748d;
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

    @Override // com.google.android.gms.internal.oss_licenses.t0
    final boolean s() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f30751g;
    }

    @Override // com.google.android.gms.internal.oss_licenses.t0
    final p0 u() {
        return p0.j(this.f30747c, this.f30751g);
    }
}
