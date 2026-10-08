package fh;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
abstract class jl extends r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f63306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f63307b;

    protected jl(int i15, int i16) {
        hl.b(i16, i15, "index");
        this.f63306a = i15;
        this.f63307b = i16;
    }

    protected abstract Object a(int i15);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f63307b < this.f63306a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f63307b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i15 = this.f63307b;
        this.f63307b = i15 + 1;
        return a(i15);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f63307b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i15 = this.f63307b - 1;
        this.f63307b = i15;
        return a(i15);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f63307b - 1;
    }
}
