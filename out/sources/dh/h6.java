package dh;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
abstract class h6 extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41876b;

    protected h6(int i15, int i16) {
        f4.b(i16, i15, "index");
        this.f41875a = i15;
        this.f41876b = i16;
    }

    protected abstract Object a(int i15);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f41876b < this.f41875a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f41876b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i15 = this.f41876b;
        this.f41876b = i15 + 1;
        return a(i15);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f41876b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i15 = this.f41876b - 1;
        this.f41876b = i15;
        return a(i15);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f41876b - 1;
    }
}
