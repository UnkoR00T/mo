package com.google.android.gms.internal.vision;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
final class g5 implements ListIterator<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ListIterator<String> f31053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f31054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ h5 f31055c;

    g5(h5 h5Var, int i15) {
        this.f31055c = h5Var;
        this.f31054b = i15;
        this.f31053a = h5Var.f31067a.listIterator(i15);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f31053a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f31053a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f31053a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f31053a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.f31053a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f31053a.previousIndex();
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
