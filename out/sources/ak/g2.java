package ak;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
abstract class g2<F, T> extends f2<F, T> implements ListIterator<T> {
    g2(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    private ListIterator<? extends F> c() {
        return (ListIterator) this.f6886a;
    }

    @Override // java.util.ListIterator
    public void add(T t15) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return c().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return c().nextIndex();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        return a(c().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return c().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(T t15) {
        throw new UnsupportedOperationException();
    }
}
