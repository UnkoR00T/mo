package ch;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
abstract class w extends h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26437b;

    protected w(int i15, int i16) {
        t.b(i16, i15, "index");
        this.f26436a = i15;
        this.f26437b = i16;
    }

    protected abstract Object a(int i15);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f26437b < this.f26436a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f26437b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i15 = this.f26437b;
        this.f26437b = i15 + 1;
        return a(i15);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f26437b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i15 = this.f26437b - 1;
        this.f26437b = i15;
        return a(i15);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f26437b - 1;
    }
}
