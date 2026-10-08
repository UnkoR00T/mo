package com.google.android.libraries.places.internal;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
public final class z10 implements ListIterator, gr.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ListIterator f34461a;

    public z10(ListIterator listIterator) {
        this.f34461a = listIterator;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f34461a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f34461a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f34461a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f34461a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f34461a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f34461a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
