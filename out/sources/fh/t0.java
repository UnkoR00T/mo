package fh;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class t0 extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f63530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final uj f63531b;

    t0(List list, uj ujVar) {
        list.getClass();
        this.f63530a = list;
        this.f63531b = ujVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i15) {
        return this.f63531b.b(this.f63530a.get(i15));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f63530a.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i15) {
        return new s0(this, this.f63530a.listIterator(i15));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i15) {
        return this.f63531b.b(this.f63530a.remove(i15));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i15, int i16) {
        this.f63530a.subList(i15, i16).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f63530a.size();
    }
}
