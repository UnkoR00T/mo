package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
final class nm extends AbstractSequentialList implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f30524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ql f30525b;

    nm(List list, ql qlVar) {
        list.getClass();
        this.f30524a = list;
        this.f30525b = qlVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f30524a.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i15) {
        return new mm(this, this.f30524a.listIterator(i15));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i15, int i16) {
        this.f30524a.subList(i15, i16).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30524a.size();
    }
}
