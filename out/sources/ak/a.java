package ak;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
abstract class a<E> extends i2<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6770b;

    protected a(int i15) {
        this(i15, 0);
    }

    protected abstract E a(int i15);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f6770b < this.f6769a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f6770b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i15 = this.f6770b;
        this.f6770b = i15 + 1;
        return a(i15);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f6770b;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i15 = this.f6770b - 1;
        this.f6770b = i15;
        return a(i15);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f6770b - 1;
    }

    protected a(int i15, int i16) {
        zj.p.t(i16, i15);
        this.f6769a = i15;
        this.f6770b = i16;
    }
}
