package com.google.android.libraries.places.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class y10 implements Iterator, gr.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Iterator f34332a;

    public y10(Iterator it) {
        this.f34332a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34332a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f34332a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
