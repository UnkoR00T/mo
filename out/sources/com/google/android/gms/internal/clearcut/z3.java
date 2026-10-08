package com.google.android.gms.internal.clearcut;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
final class z3 implements ListIterator<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ListIterator<String> f29614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f29615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ y3 f29616c;

    z3(y3 y3Var, int i15) {
        this.f29616c = y3Var;
        this.f29615b = i15;
        this.f29614a = y3Var.f29607a.listIterator(i15);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f29614a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f29614a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f29614a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f29614a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.f29614a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f29614a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
