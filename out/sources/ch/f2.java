package ch;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
abstract class f2 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f25868a;

    f2(Iterator it) {
        it.getClass();
        this.f25868a = it;
    }

    abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25868a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f25868a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f25868a.remove();
    }
}
