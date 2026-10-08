package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class km extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f30471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ql f30472b;

    km(List list, ql qlVar) {
        list.getClass();
        this.f30471a = list;
        this.f30472b = qlVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i15) {
        return this.f30472b.a(this.f30471a.get(i15));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f30471a.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i15) {
        return new jm(this, this.f30471a.listIterator(i15));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i15) {
        return this.f30472b.a(this.f30471a.remove(i15));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i15, int i16) {
        this.f30471a.subList(i15, i16).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30471a.size();
    }
}
