package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
abstract class bm extends tm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f30365b;

    protected bm(int i15, int i16) {
        ul.b(i16, i15, "index");
        this.f30364a = i15;
        this.f30365b = i16;
    }

    protected abstract Object a(int i15);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f30365b < this.f30364a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f30365b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i15 = this.f30365b;
        this.f30365b = i15 + 1;
        return a(i15);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f30365b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i15 = this.f30365b - 1;
        this.f30365b = i15;
        return a(i15);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f30365b - 1;
    }
}
