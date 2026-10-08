package ak;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
abstract class f2<F, T> implements Iterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator<? extends F> f6886a;

    f2(Iterator<? extends F> it) {
        this.f6886a = (Iterator) zj.p.q(it);
    }

    abstract T a(F f15);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6886a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.f6886a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f6886a.remove();
    }
}
