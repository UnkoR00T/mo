package eh;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
abstract class e extends o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f50477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f50478b;

    protected e(int i15, int i16) {
        c.b(i16, i15, "index");
        this.f50477a = i15;
        this.f50478b = i16;
    }

    protected abstract Object a(int i15);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f50478b < this.f50477a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f50478b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i15 = this.f50478b;
        this.f50478b = i15 + 1;
        return a(i15);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f50478b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i15 = this.f50478b - 1;
        this.f50478b = i15;
        return a(i15);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f50478b - 1;
    }
}
