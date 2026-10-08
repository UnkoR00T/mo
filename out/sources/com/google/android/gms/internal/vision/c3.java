package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class c3 extends x0<String> implements f3, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c3 f30979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final f3 f30980d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Object> f30981b;

    static {
        c3 c3Var = new c3();
        f30979c = c3Var;
        c3Var.zzb();
        f30980d = c3Var;
    }

    public c3() {
        this(10);
    }

    private static String f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof e1 ? ((e1) obj).v() : p2.i((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.vision.f3
    public final void C3(e1 e1Var) {
        e();
        this.f30981b.add(e1Var);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i15, Object obj) {
        e();
        this.f30981b.add(i15, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.vision.v2
    public final /* synthetic */ v2 b(int i15) {
        if (i15 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i15);
        arrayList.addAll(this.f30981b);
        return new c3((ArrayList<Object>) arrayList);
    }

    @Override // com.google.android.gms.internal.vision.f3
    public final List<?> c() {
        return Collections.unmodifiableList(this.f30981b);
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        e();
        this.f30981b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.f3
    public final f3 d() {
        return zza() ? new h5(this) : this;
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i15) {
        Object obj = this.f30981b.get(i15);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof e1) {
            e1 e1Var = (e1) obj;
            String strV = e1Var.v();
            if (e1Var.a()) {
                this.f30981b.set(i15, strV);
            }
            return strV;
        }
        byte[] bArr = (byte[]) obj;
        String strI = p2.i(bArr);
        if (p2.h(bArr)) {
            this.f30981b.set(i15, strI);
        }
        return strI;
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.vision.f3
    public final Object p(int i15) {
        return this.f30981b.get(i15);
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i15, Object obj) {
        e();
        return f(this.f30981b.set(i15, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30981b.size();
    }

    @Override // com.google.android.gms.internal.vision.x0, com.google.android.gms.internal.vision.v2
    public final /* bridge */ /* synthetic */ boolean zza() {
        return super.zza();
    }

    public c3(int i15) {
        this((ArrayList<Object>) new ArrayList(i15));
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractList, java.util.List
    public final boolean addAll(int i15, Collection<? extends String> collection) {
        e();
        if (collection instanceof f3) {
            collection = ((f3) collection).c();
        }
        boolean zAddAll = this.f30981b.addAll(i15, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i15) {
        e();
        Object objRemove = this.f30981b.remove(i15);
        ((AbstractList) this).modCount++;
        return f(objRemove);
    }

    private c3(ArrayList<Object> arrayList) {
        this.f30981b = arrayList;
    }

    @Override // com.google.android.gms.internal.vision.x0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }
}
