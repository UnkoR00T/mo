package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class y2<E> extends t<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final y2<Object> f29605c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<E> f29606b;

    static {
        y2<Object> y2Var = new y2<>();
        f29605c = y2Var;
        y2Var.J();
    }

    y2() {
        this(new ArrayList(10));
    }

    public static <E> y2<E> f() {
        return (y2<E>) f29605c;
    }

    @Override // com.google.android.gms.internal.clearcut.k1
    public final /* synthetic */ k1 C1(int i15) {
        if (i15 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i15);
        arrayList.addAll(this.f29606b);
        return new y2(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i15, E e15) {
        e();
        this.f29606b.add(i15, e15);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i15) {
        return this.f29606b.get(i15);
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i15) {
        e();
        E eRemove = this.f29606b.remove(i15);
        ((AbstractList) this).modCount++;
        return eRemove;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i15, E e15) {
        e();
        E e16 = this.f29606b.set(i15, e15);
        ((AbstractList) this).modCount++;
        return e16;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29606b.size();
    }

    private y2(List<E> list) {
        this.f29606b = list;
    }
}
