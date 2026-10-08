package bh;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
abstract class z0 extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19481b;

    protected z0(int i15, int i16) {
        x0.b(i16, i15, "index");
        this.f19480a = i15;
        this.f19481b = i16;
    }

    protected abstract Object a(int i15);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f19481b < this.f19480a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f19481b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i15 = this.f19481b;
        this.f19481b = i15 + 1;
        return a(i15);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f19481b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i15 = this.f19481b - 1;
        this.f19481b = i15;
        return a(i15);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f19481b - 1;
    }
}
