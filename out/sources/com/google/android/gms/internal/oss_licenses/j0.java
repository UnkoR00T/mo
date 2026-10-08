package com.google.android.gms.internal.oss_licenses;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
abstract class j0 extends f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f30798b;

    protected j0(int i15, int i16) {
        g0.d(i16, i15, "index");
        this.f30797a = i15;
        this.f30798b = i16;
    }

    protected abstract Object a(int i15);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f30798b < this.f30797a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f30798b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i15 = this.f30798b;
        this.f30798b = i15 + 1;
        return a(i15);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f30798b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i15 = this.f30798b - 1;
        this.f30798b = i15;
        return a(i15);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f30798b - 1;
    }
}
