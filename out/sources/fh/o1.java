package fh;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
abstract class o1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f63421a;

    o1(Iterator it) {
        it.getClass();
        this.f63421a = it;
    }

    abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f63421a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f63421a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f63421a.remove();
    }
}
