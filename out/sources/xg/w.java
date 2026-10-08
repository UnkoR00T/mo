package xg;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
abstract class w extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f218464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f218465b;

    protected w(int i15, int i16) {
        t.c(i16, i15, "index");
        this.f218464a = i15;
        this.f218465b = i16;
    }

    protected abstract Object a(int i15);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f218465b < this.f218464a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f218465b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i15 = this.f218465b;
        this.f218465b = i15 + 1;
        return a(i15);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f218465b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i15 = this.f218465b - 1;
        this.f218465b = i15;
        return a(i15);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f218465b - 1;
    }
}
