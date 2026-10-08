package com.google.android.gms.internal.oss_licenses;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class d1 extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object f30766c;

    d1(Object obj) {
        obj.getClass();
        this.f30766c = obj;
    }

    @Override // com.google.android.gms.internal.oss_licenses.m0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f30766c.equals(obj);
    }

    @Override // com.google.android.gms.internal.oss_licenses.m0
    final int h(Object[] objArr, int i15) {
        objArr[0] = this.f30766c;
        return 1;
    }

    @Override // com.google.android.gms.internal.oss_licenses.t0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f30766c.hashCode();
    }

    @Override // com.google.android.gms.internal.oss_licenses.t0
    /* JADX INFO: renamed from: i */
    public final e1 iterator() {
        return new u0(this.f30766c);
    }

    @Override // com.google.android.gms.internal.oss_licenses.t0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new u0(this.f30766c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.f30766c.toString();
        StringBuilder sb5 = new StringBuilder(String.valueOf(string).length() + 2);
        sb5.append("[");
        sb5.append(string);
        sb5.append("]");
        return sb5.toString();
    }
}
