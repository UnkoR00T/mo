package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class t1 extends t<String> implements u1, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final t1 f29539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final u1 f29540d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Object> f29541b;

    static {
        t1 t1Var = new t1();
        f29539c = t1Var;
        t1Var.J();
        f29540d = t1Var;
    }

    public t1() {
        this(10);
    }

    private static String f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof a0 ? ((a0) obj).u() : h1.h((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.clearcut.k1
    public final /* synthetic */ k1 C1(int i15) {
        if (i15 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i15);
        arrayList.addAll(this.f29541b);
        return new t1((ArrayList<Object>) arrayList);
    }

    @Override // com.google.android.gms.internal.clearcut.t, com.google.android.gms.internal.clearcut.k1
    public final /* bridge */ /* synthetic */ boolean I() {
        return super.I();
    }

    @Override // com.google.android.gms.internal.clearcut.u1
    public final List<?> I2() {
        return Collections.unmodifiableList(this.f29541b);
    }

    @Override // com.google.android.gms.internal.clearcut.u1
    public final Object K(int i15) {
        return this.f29541b.get(i15);
    }

    @Override // com.google.android.gms.internal.clearcut.u1
    public final u1 Q3() {
        return I() ? new y3(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i15, Object obj) {
        e();
        this.f29541b.add(i15, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.t, java.util.AbstractList, java.util.List
    public final boolean addAll(int i15, Collection<? extends String> collection) {
        e();
        if (collection instanceof u1) {
            collection = ((u1) collection).I2();
        }
        boolean zAddAll = this.f29541b.addAll(i15, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.clearcut.t, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        e();
        this.f29541b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.t, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i15) {
        String strH;
        Object obj = this.f29541b.get(i15);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            strH = a0Var.u();
            if (a0Var.i()) {
            }
            return strH;
        }
        byte[] bArr = (byte[]) obj;
        strH = h1.h(bArr);
        if (!h1.g(bArr)) {
            return strH;
        }
        this.f29541b.set(i15, strH);
        return strH;
    }

    @Override // com.google.android.gms.internal.clearcut.t, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i15) {
        e();
        Object objRemove = this.f29541b.remove(i15);
        ((AbstractList) this).modCount++;
        return f(objRemove);
    }

    @Override // com.google.android.gms.internal.clearcut.t, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.clearcut.t, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i15, Object obj) {
        e();
        return f(this.f29541b.set(i15, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29541b.size();
    }

    public t1(int i15) {
        this((ArrayList<Object>) new ArrayList(i15));
    }

    @Override // com.google.android.gms.internal.clearcut.t, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.clearcut.t, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private t1(ArrayList<Object> arrayList) {
        this.f29541b = arrayList;
    }
}
