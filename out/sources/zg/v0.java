package zg;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
abstract class v0 extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f235117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f235118b;

    protected v0(int i15, int i16) {
        t0.b(i16, i15, "index");
        this.f235117a = i15;
        this.f235118b = i16;
    }

    protected abstract Object a(int i15);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f235118b < this.f235117a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f235118b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i15 = this.f235118b;
        this.f235118b = i15 + 1;
        return a(i15);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f235118b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i15 = this.f235118b - 1;
        this.f235118b = i15;
        return a(i15);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f235118b - 1;
    }
}
