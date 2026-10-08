package fh;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
final class v0 extends AbstractSequentialList implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f63578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final uj f63579b;

    v0(List list, uj ujVar) {
        list.getClass();
        this.f63578a = list;
        this.f63579b = ujVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f63578a.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i15) {
        return new u0(this, this.f63578a.listIterator(i15));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i15, int i16) {
        this.f63578a.subList(i15, i16).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f63578a.size();
    }
}
