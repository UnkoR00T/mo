package ch;

import java.util.AbstractSet;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
abstract class d2 extends AbstractSet {
    d2() {
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return e2.c(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
