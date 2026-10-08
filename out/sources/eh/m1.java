package eh;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
abstract class m1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f50787a;

    m1(Iterator it) {
        it.getClass();
        this.f50787a = it;
    }

    abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f50787a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f50787a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f50787a.remove();
    }
}
